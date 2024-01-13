package org.chemiconsult.api.form.controller;

import lombok.extern.log4j.Log4j2;
import org.chemiconsult.api.form.controller.interfaces.IFormController;
import org.chemiconsult.api.form.controller.to.FormRequest;
import org.chemiconsult.api.form.controller.to.ResultTO;
import org.chemiconsult.api.service.FormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api")
@Log4j2
public class FormController implements IFormController {

    FormService formService;

    @Override
    public ResponseEntity createForm(ResultTO result) {
        try {
            formService.saveResult(result);
            log.info("RESULTADO ALMACENADO CORRECTAMENTE");
            return ResponseEntity.ok("FORMULARIO GENERADO CORRECTAMENTE");
        } catch (Exception e) {
            log.error(e.getMessage());
            return ResponseEntity.internalServerError().body("HUBO UN ERROR AL REGISTRAR EL FORMULARIO");
        }
    }

    @Override
    @DeleteMapping("/delete-form")
    public void deleteForm() {
        log.info("FORM DELETED");
    }

    @Override
    @PutMapping("/update-form")
    public void updateForm() {
        log.info("FORM UPDATED");
    }

    @GetMapping("/get-forms")
    public ResponseEntity<List<FormRequest>> getForms() {
        List<FormRequest> formTOList = formService.getAll();
        return ResponseEntity.ok().body(formTOList);
    }

    @Override
    public ResponseEntity getFormByID(FormRequest req) {
        return ResponseEntity.ok().body(formService.getById(req.getFormNumber()));
    }


    @Autowired
    public FormController(FormService formService) {
        this.formService = formService;
    }

}
