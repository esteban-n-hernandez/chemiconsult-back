package org.chemiconsult.api.service;

import org.chemiconsult.api.controller.de.FormDE;
import org.chemiconsult.api.controller.to.FormRequest;
import org.chemiconsult.api.repository.FormRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FormService {

    FormRepository formRepository;

    public boolean insert(FormRequest formTO) {
        FormDE de = new FormDE();

        de.setId(1);
        de.setName(formTO.getName());
        de.setValue(formTO.getValue());
        formRepository.save(de);
        return true;
    }


    public List<FormRequest> getAll() {
        return formRepository.findAll().stream()
                .map(this::convertirFormDEaFormTO)
                .collect(Collectors.toList());
    }

    public FormRequest getById(int id) {
        return convertirFormDEaFormTO(formRepository.findById(id));
    }

    private FormRequest convertirFormDEaFormTO(FormDE formDE) {
        return new FormRequest(formDE.getId(), formDE.getName(), formDE.getValue());
    }


    @Autowired
    public FormService(FormRepository formRepository) {
        this.formRepository = formRepository;
    }
}
