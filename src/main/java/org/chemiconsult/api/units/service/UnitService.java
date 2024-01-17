package org.chemiconsult.api.units.service;

import org.chemiconsult.api.units.de.UnitDE;
import org.chemiconsult.api.units.mapper.UnitMapper;
import org.chemiconsult.api.units.repository.UnitRepository;
import org.chemiconsult.api.units.to.UnitTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UnitService {

    @Autowired
    UnitRepository unitRepository;

    public void create(UnitTO unitTO) throws Exception {
        try {
            unitRepository.save(UnitMapper.UnitTOToUnitDE(unitTO));
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public void update(UnitTO unitTO) {
        try {
            unitRepository.save(UnitMapper.UnitTOToUnitDE(unitTO));
        } catch (Exception e) {

        }
    }


    public void delete(Integer id) throws Exception {
        try {
            unitRepository.deleteById(id);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public List<UnitTO> getAllCustomers() {

        return null;
    }

    public UnitTO getUnitByID(Integer id) throws Exception {
        try {
            return UnitMapper.UnitDEToUnitTO(unitRepository.getById(id));
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }

    }


}
