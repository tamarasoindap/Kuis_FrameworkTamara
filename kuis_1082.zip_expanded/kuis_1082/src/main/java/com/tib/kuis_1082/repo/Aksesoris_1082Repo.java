/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tib.kuis_1082.repo;

import com.tib.kuis_1082.entity.Aksesoris_1082;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Hendro Steven
 */
public interface Aksesoris_1082Repo extends CrudRepository<Aksesoris_1082, Long> {

    @Query("select c from Category c")
    public List<Aksesoris_1082> findAllCategory();
}
