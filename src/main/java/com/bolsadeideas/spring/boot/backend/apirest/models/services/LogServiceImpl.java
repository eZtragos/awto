package com.bolsadeideas.spring.boot.backend.apirest.models.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bolsadeideas.spring.boot.backend.apirest.models.dao.ILogDao;
import com.bolsadeideas.spring.boot.backend.apirest.models.entity.Log;

@Service
public class LogServiceImpl implements ILogService  {

	@Autowired
	private ILogDao logDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Log> findAll() {
		return (List<Log>) logDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Log> findById(Long id) {
		return logDao.findById(id);
	}

	@Override
	@Transactional
	public Log save(Log log) {
		return logDao.save(log);
	}

}
