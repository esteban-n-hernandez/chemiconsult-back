package org.chemiconsult.api.methodology.service;

import org.chemiconsult.api.methodology.de.MethodologyDE;
import org.chemiconsult.api.methodology.mapper.MethodologyMapper;
import org.chemiconsult.api.methodology.repository.MethodologyRepository;
import org.chemiconsult.api.methodology.to.MethodologyTO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MethodologyService {

    MethodologyRepository methodologyRepository;


    public void create(MethodologyTO methodologyTO) {
        methodologyRepository.save(MethodologyMapper.methodologyToToMethodologyDe(methodologyTO));
    }


    public void findById(Integer id) {
        methodologyRepository.findById(id);
    }


    public List<MethodologyTO> findAll() {
        List<MethodologyDE> methodolyDEList = methodologyRepository.findAll();
        return MethodologyMapper.methodologyDeListToMethodologyListTo(methodolyDEList);
    }

    public void update(MethodologyTO methodologyTO) {
        methodologyRepository.save(MethodologyMapper.methodologyToToMethodologyDe(methodologyTO));
    }

    public void delete(Integer id) throws Exception {
        try {
            methodologyRepository.deleteById(id);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public MethodologyService(MethodologyRepository methodologyRepository) {
        this.methodologyRepository = methodologyRepository;
    }

}
