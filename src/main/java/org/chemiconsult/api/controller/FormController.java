package org.chemiconsult.api.controller;

import lombok.extern.log4j.Log4j2;
import org.chemiconsult.api.controller.inter.IFormController;
import org.chemiconsult.api.controller.to.FormRequest;
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
    @PostMapping("/create-form")
    public ResponseEntity createForm(FormRequest form) {
        log.info("FORM CREATED");
        log.info("Nombre: " + form.getName());
        log.info("Valor: " + form.getValue());
        if (formService.insert(form)) {
            return ResponseEntity.ok("FORMULARIO GENERADO CORRECTAMENTE");
        } else {
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
        return ResponseEntity.ok().body(formService.getById(req.getId()));
    }


    @Autowired
    public FormController(FormService formService) {
        this.formService = formService;
    }

}
