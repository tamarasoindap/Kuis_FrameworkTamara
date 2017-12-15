/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tib.kuis_1082.service;

import com.tib.kuis_1082.entity.Aksesoris_1082;
import com.tib.kuis_1082.repo.Aksesoris_1082Repo;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Hendro Steven
 */
@Service("aksesoris_1082Service")
@Transactional
public class Aksesoris_1082Service {

    @Autowired
    private Aksesoris_1082Repo repo;

    public Aksesoris_1082 insert(Aksesoris_1082 aksesoris_1082) {
        return repo.save(aksesoris_1082);
    }
    
    public Aksesoris_1082 update(Aksesoris_1082 aksesoris_1082) {
        return repo.save(aksesoris_1082);
    }
    
    public boolean delete(Long id){
        repo.delete(id);
        return true;
    }
    
    public Aksesoris_1082 getById(Long id){
        return repo.findOne(id);
    }
    
    public List<Aksesoris_1082> getAll(){
        return repo.findAllCategory();
    }
}
