package org.chemiconsult.api.controller;

import org.chemiconsult.api.controller.inter.IFormController;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api")
public class FormController implements IFormController {

    @Override
    @PostMapping("/create-form")
    public void createForm() {
        System.out.println("FORM CREATED");
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
    @GetMapping("/get-forms")
    public void getForms() {
        System.out.println("LIST FORM OBTAINED");
    }

    @Override
    @GetMapping("/get-form/{id}")
    public void getForm() {
        System.out.println("FORM OBTAINED");
    }
}
