/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tib.kuis_1082.repo;

import com.tib.kuis_1082.entity.Mobil_1082;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;


/**
 *
 * @author Hendro Steven
 */
public interface Mobil_1082Repo extends CrudRepository<Mobil_1082, Long>{
    
    @Query("select p from Product p")
    public List<Mobil_1082> findAllProduct();
    
    @Query("select p from Product p where p.category.id= :id")
    public List<Mobil_1082> findByCategory(@Param("id") Long id);
    
    @Query("select p from Product p where LOWER(p.name) LIKE LOWER(:name)")
    public List<Mobil_1082> findByName(@Param("name") String name);
}
