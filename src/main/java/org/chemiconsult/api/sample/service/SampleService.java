package org.chemiconsult.api.sample.service;

import lombok.extern.log4j.Log4j2;
import org.chemiconsult.api.sample.de.SampleDE;
import org.chemiconsult.api.sample.de.SampleDetailsDE;
import org.chemiconsult.api.sample.mapper.SampleMapper;
import org.chemiconsult.api.sample.repository.SampleDetailsRepository;
import org.chemiconsult.api.sample.repository.SampleRepository;
import org.chemiconsult.api.sample.to.SampleDetailsTO;
import org.chemiconsult.api.sample.to.SampleTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Log4j2
public class SampleService {

    @Autowired
    SampleRepository sampleRepository;

    @Autowired
    SampleDetailsRepository sampleDetailsRepository;

    public void create(SampleTO sampleTO) throws Exception {
        log.info("INSERTANDO MUESTRA");
        try {

            SampleDE sampleDE = SampleMapper.SampleToToSampleDE(sampleTO);

            for (SampleDetailsTO sampleDetailsTO : sampleTO.getSampleDetails()) {
                SampleDetailsDE sampleDetailsDE = SampleMapper.sampleDetailsToToSampleDetailsDE(sampleDetailsTO, sampleDE);
                sampleDE.getSampleDetailsList().add(sampleDetailsDE);
                sampleDetailsDE.setSampleDE(sampleDE);
                sampleDE.getSampleDetailsList().add(sampleDetailsDE);
            }

            // Guarda la entidad principal junto con las entidades secundarias
            sampleRepository.save(sampleDE);
            log.info("MUESTRA INSERTADA");
        } catch (Exception e) {
            log.error(e.getMessage());
            throw new Exception(e.getCause());
        }
    }

    public void update(SampleTO sampleTO) {

    }


    public void delete(SampleTO sampleTO) {
    }

    public List<SampleTO> getAllSamples() {
        List<SampleDE> sampleDEList = sampleRepository.findAll();
        return sampleDEList.stream()
                .map(this::convertToSampleTO)
                .collect(Collectors.toList());
    }

    private SampleTO convertToSampleTO(SampleDE sampleDE) {
        // Puedes llamar a SampleMapper.SampleDEToSampleTO directamente si prefieres.
        return SampleMapper.SampleDEToSampleTO(sampleDE, sampleRepository.findSampleDetails(sampleDE.getIdProtocol()));
    }

    public List<SampleDetailsTO> getSampleDetailsByID(Integer idProtocol) {
        return SampleMapper.mapDetailsDEToDetailsTO(sampleDetailsRepository.findByProtocolId(idProtocol));
    }

    public SampleTO getSampleByID(Integer id) {
        return SampleMapper.SampleTO(sampleRepository.findByIdProtocol(id));
    }
}
