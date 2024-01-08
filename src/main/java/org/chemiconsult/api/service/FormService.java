package org.chemiconsult.api.service;

import org.chemiconsult.api.repository.FormRepository;
import org.springframework.stereotype.Service;

@Service
public class FormService {

    FormRepository formRepository;

    public boolean insert() {
        return true;
    }

}
