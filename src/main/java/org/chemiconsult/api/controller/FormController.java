package org.chemiconsult.api.controller;

import org.chemiconsult.api.controller.inter.IFormController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class FormController implements IFormController {

    @Override
    @GetMapping("/create-form")
    public void createForm() {
        System.out.println("FORM CREATED");
    }

    @Override
    public void deleteForm() {
        System.out.println("FORM DELETED");
    }

    @Override
    public void updateForm() {
        System.out.println("FORM UPDATED");
    }

    @Override
    public void getForms() {

    }

    @Override
    public void getForm() {

    }
}
