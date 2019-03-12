package com.greenfoxacedemy.connectiontosql.repository;

import com.greenfoxacedemy.connectiontosql.Model.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<Todo, Long> {

}
