/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tib.kuis_1082.controller;

import java.util.List;
import com.tib.kuis_1082.entity.Aksesoris_1082;
import com.tib.kuis_1082.service.Aksesoris_1082Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Mahasiswa 29
 */
@RestController
@RequestMapping("/product")
public class Aksesoris_1082Controller {
    @Autowired
    private Aksesoris_1082Service Aksesoris_1082Service;

    @RequestMapping(method = RequestMethod.POST)
    public Aksesoris_1082 insert(@RequestBody Aksesoris_1082 aksesoris_1082) {
        return Aksesoris_1082Service.insert(aksesoris_1082);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Aksesoris_1082 update(@RequestBody Aksesoris_1082 aksesoris_1082) {
        return Aksesoris_1082Service.update(aksesoris_1082);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public boolean delete(@PathVariable("id") Long id) {
        return Aksesoris_1082Service.delete(id);
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public Aksesoris_1082 getById(@PathVariable("id") Long id){
        return Aksesoris_1082Service.getById(id);
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public List<Aksesoris_1082> getAll(){
        return Aksesoris_1082Service.getAll();
    }
}
