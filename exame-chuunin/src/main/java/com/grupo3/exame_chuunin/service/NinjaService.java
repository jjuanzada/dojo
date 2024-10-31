package com.grupo3.exame_chuunin.service;

import com.grupo3.exame_chuunin.model.NinjaModel;
import com.grupo3.exame_chuunin.repository.NinjaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NinjaService {
    @Autowired
    private NinjaRepository repository;

    public NinjaModel createNinja(NinjaModel ninja) {
        return repository.save(ninja);
    }
}
