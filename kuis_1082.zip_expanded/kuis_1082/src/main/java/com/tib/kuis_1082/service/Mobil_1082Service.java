/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tib.kuis_1082.service;

import com.tib.kuis_1082.entity.Mobil_1082;
import com.tib.kuis_1082.repo.Mobil_1082Repo;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Hendro Steven
 */
@Service("mobil_1082Service")
@Transactional
public class Mobil_1082Service {

    @Autowired
    private Mobil_1082Repo repo;

    public Mobil_1082 insertOrUpdate(Mobil_1082 mobil_1082) {
        return repo.save(mobil_1082);
    }

    public boolean delete(Long id) {
        repo.delete(id);
        return true;
    }

    public List<Mobil_1082> findAll() {
        return repo.findAllProduct();
    }

    public List<Mobil_1082> findByCategory(Long categoryId) {
        return repo.findByCategory(categoryId);
    }

    public List<Mobil_1082> findByName(String name) {
        return repo.findByName("%" + name + "%");
    }
}
