package com.example.exam.repository;

import com.example.exam.model.Register;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RegisterRepository extends CrudRepository<Register, Long> {
    @Query(nativeQuery = true , value = "select email from register order by id desc limit 5")
    List<String> lastemails();

   List<Register> findTop5ByOrderByIdDesc();

   boolean existsByEmail(String name);
}
