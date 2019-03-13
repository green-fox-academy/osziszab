package com.greenfox.error.model.repository;

import com.greenfox.error.model.finder.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Long> {
}
