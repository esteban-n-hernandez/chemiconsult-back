package org.chemiconsult.api.resolution.service;

import org.chemiconsult.api.resolution.mapper.ResolutionMapper;
import org.chemiconsult.api.resolution.repository.ResolutionRepository;
import org.chemiconsult.api.resolution.to.ResolutionTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResolutionService {

    @Autowired
    ResolutionRepository resolutionRepository;

    public void create(List<ResolutionTO> resolutionTO) throws Exception {
        try {
            resolutionTO.stream()
                    .map(ResolutionMapper::ResolutionTOToResolutionDE)
                    .forEach(resolutionRepository::save);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }


    public void update(ResolutionTO resolutionTO) {
        try {
            resolutionRepository.save(ResolutionMapper.ResolutionTOToResolutionDE(resolutionTO));
        } catch (Exception e) {

        }
    }


    public void delete(Integer id) throws Exception {
        try {
            resolutionRepository.deleteById(id);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public List<ResolutionTO> getAllResolutions() {
        return ResolutionMapper.ResolutionTOToResolutionDE(resolutionRepository.findAll());
    }

    public ResolutionTO getResolution(Integer id) throws Exception {
        try {
            return ResolutionMapper.ResolutionDEToResolutionTO(resolutionRepository.getById(id));
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public List<ResolutionTO> getResolutionByName(String name) throws Exception {
        try {
            return ResolutionMapper.ResolutionTOToResolutionDE(resolutionRepository.getByResolutionName(name));
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }


}
