package org.chemiconsult.api.service;

import lombok.extern.log4j.Log4j2;
import org.chemiconsult.api.controller.de.ResultDE;
import org.chemiconsult.api.controller.to.FormRequest;
import org.chemiconsult.api.controller.to.ResultTO;
import org.chemiconsult.api.repository.FormRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Log4j2
public class FormService {

    FormRepository formRepository;

    public void saveResult(ResultTO resultTo) {
        try {
            ResultDE resultDE = mapResultToDe(resultTo);
            formRepository.save(resultDE);
        } catch (Exception e) {
            log.error(e.getMessage());
        }
    }


    public List<FormRequest> getAll() {
        return null;
    }

    public FormRequest getById(int id) {
        return null;
        //return formRepository.findById(id);
    }

    private ResultDE mapResultToDe(ResultTO resultTo) {
        return ResultDE.builder()
                .analysisProtocol(resultTo.getAnalysisProtocol())
                .sampleType(resultTo.getSampleType())
                .unidad(resultTo.getUnidad())
                .sampleId(resultTo.getSampleId())
                .methodology(resultTo.getMethodology())
                .build();
    }


    @Autowired
    public FormService(FormRepository formRepository) {
        this.formRepository = formRepository;
    }
}
