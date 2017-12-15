/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tib.kuis_1082.controller;

import java.util.List;
import com.tib.kuis_1082.entity.Mobil_1082;
import com.tib.kuis_1082.service.Mobil_1082Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

/**
 *
 * @author Mahasiswa 29
 */
@RestController
@RequestMapping("/mobil_1082")
public class Mobil_1082Controller {
    @Autowired
    private Mobil_1082Service Mobil_1082Service;
    
    @RequestMapping(method = RequestMethod.POST)
    public Mobil_1082 insertOrUpdate(@RequestBody Mobil_1082 mobil_1082){
        return Mobil_1082Service.insertOrUpdate(mobil_1082);
    }
    @RequestMapping(method = RequestMethod.GET)
    public List<Mobil_1082> findAll(){
        return Mobil_1082Service.findAll();
    }
}
