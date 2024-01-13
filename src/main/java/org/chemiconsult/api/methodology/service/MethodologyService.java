package org.chemiconsult.api.methodology.service;

import org.chemiconsult.api.methodology.mapper.MethodologyMapper;
import org.chemiconsult.api.methodology.repository.MethodologyRepository;
import org.chemiconsult.api.methodology.to.MethodologyTO;
import org.springframework.stereotype.Service;

@Service
public class MethodologyService {

    MethodologyRepository methodologyRepository;


    public void create(MethodologyTO methodologyTO) {

        methodologyRepository.save(MethodologyMapper.methodologyToToMethodologyDe(methodologyTO));

    }


    public void findById(Integer id) {
        methodologyRepository.findById(id);
    }


    public void findAll() {

    }

    public void update(MethodologyTO methodologyTO) {
        methodologyRepository.save(MethodologyMapper.methodologyToToMethodologyDe(methodologyTO));}


    public void delete() {

    }

    public MethodologyService(MethodologyRepository methodologyRepository) {
        this.methodologyRepository = methodologyRepository;
    }

}
