package com.first.demo.dao;

import org.springframework.data.repository.CrudRepository;

public interface StudentDao extends CrudRepository<StudentsBo, Long> {

}
