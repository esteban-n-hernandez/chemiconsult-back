package org.chemiconsult.api.controller;

import org.chemiconsult.api.controller.inter.IFormController;
import org.chemiconsult.api.controller.to.FormTO;
import org.chemiconsult.api.service.FormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api")
public class FormController implements IFormController {

    FormService formService;

    @Override
    @PostMapping("/create-form")
    public ResponseEntity createForm(FormTO form) {
        System.out.println("FORM CREATED");
        System.out.println("Nombre: " + form.getName());
        System.out.println("Valor: " + form.getValue());
        if (formService.insert(form)) {
            return ResponseEntity.ok("FORMULARIO GENERADO CORRECTAMENTE");
        } else {
            return ResponseEntity.internalServerError().body("HUBO UN ERROR AL REGISTRAR EL FORMULARIO");
        }
    }

    @Override
    @DeleteMapping("/delete-form")
    public void deleteForm() {
        System.out.println("FORM DELETED");
    }

    @Override
    @PutMapping("/update-form")
    public void updateForm() {
        System.out.println("FORM UPDATED");
    }

    @Override
    public ResponseEntity getForms() {

        List<FormTO> formTOList = formService.getAll();

        formTOList.forEach(formTO -> {
            String name = formTO.getName();
            System.out.println("Name: " + name);
        });

        return ResponseEntity.ok().body("Resultados ok");
    }

    @Override
    @GetMapping("/get-form/{id}")
    public void getForm() {
        System.out.println("FORM OBTAINED");
    }


    @Autowired
    public FormController(FormService formService) {
        this.formService = formService;
    }

}
