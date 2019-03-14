package com.greenfoxacedemy.connectiontosql.repository;

import com.greenfoxacedemy.connectiontosql.Model.Assignee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssigneeRepository extends CrudRepository<Assignee, Long> {
}
