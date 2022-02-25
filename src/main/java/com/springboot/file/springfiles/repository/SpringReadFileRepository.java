package com.springboot.file.springfiles.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springboot.file.springfiles.model.User;

@Repository
public interface SpringReadFileRepository extends CrudRepository<User, String>{

}
