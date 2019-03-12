package com.greenfoxacademy.tododatabase.repository;

import com.greenfoxacademy.tododatabase.Model.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<Todo, Long> {

}
