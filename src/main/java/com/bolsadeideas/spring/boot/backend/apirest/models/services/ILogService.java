package com.bolsadeideas.spring.boot.backend.apirest.models.services;

import java.util.List;
import java.util.Optional;

import com.bolsadeideas.spring.boot.backend.apirest.models.entity.Log;

public interface ILogService {
	
	public List<Log> findAll();
	
	public Optional<Log> findById(Long id);
	
	public Log save(Log log);
	

}
