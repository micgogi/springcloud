package com.rahul.dummy5.repository;

import com.rahul.dummy5.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Micgogi
 * on 1/29/2020  11:36 PM
 * Micgogi
 */
@Repository
public interface MyRespository extends CrudRepository<Student,Integer> {
    @Query(value = "SELECT * FROM Student u WHERE u.name = ?1",nativeQuery = true)
    List<Student> getByName(String name);
}
