package com.bolsadeideas.spring.boot.backend.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.bolsadeideas.spring.boot.backend.apirest.models.entity.Log;

public interface ILogDao extends CrudRepository<Log, Long> {
	
	

}
