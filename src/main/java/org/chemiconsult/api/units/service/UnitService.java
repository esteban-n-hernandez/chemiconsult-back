package org.chemiconsult.api.units.service;

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

    public void create(UnitTO unitTO) {

    }

    public void update(UnitTO unitTO) {

    }


    public void delete(UnitTO unitTO) {
    }

    public List<UnitTO> getAllCustomers() {
        return null;
    }

    public UnitTO getCustomer(Integer documentNumber) {
        return null;
    }
}
