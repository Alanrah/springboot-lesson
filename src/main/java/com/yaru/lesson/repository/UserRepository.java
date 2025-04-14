package com.yaru.lesson.repository;

import com.yaru.lesson.pojo.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
}
