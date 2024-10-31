package com.grupo3.exame_chuunin.controller;

import com.grupo3.exame_chuunin.model.NinjaModel;
import com.grupo3.exame_chuunin.service.NinjaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/")
public class NinjaController {
    @Autowired
    private NinjaService ninjaService;

    @PostMapping
    public ResponseEntity<NinjaModel>createNinja(@RequestBody NinjaModel ninja){
        NinjaModel responseNinja = ninjaService.createNinja(ninja);
        return new ResponseEntity<>(responseNinja, HttpStatus.CREATED);
    }

    @GetMapping("/get-ninja/{id}")
    public ResponseEntity<NinjaModel> getNinjaById(@PathVariable Long id) {
        Optional<NinjaModel> ninja = ninjaService.getNinjaById(id);
        return ninja.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping("/get-all-ninja")
    public ResponseEntity<NinjaModel> getAllNinja() {
        Optional<NinjaModel> ninja = ninjaService.getAllNinja();
        return ninja.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PutMapping("/update-ninja/{id}")
    public ResponseEntity<NinjaModel> updateNinja(@PathVariable Long id) {
        Optional<NinjaModel> ninja = ninjaService.updateNinja(id);
        return ninja.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }



}
