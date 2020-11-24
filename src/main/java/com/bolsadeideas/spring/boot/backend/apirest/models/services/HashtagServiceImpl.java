package com.bolsadeideas.spring.boot.backend.apirest.models.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bolsadeideas.spring.boot.backend.apirest.models.dao.IHashtagDao;
import com.bolsadeideas.spring.boot.backend.apirest.models.entity.Hashtag;


@Service
public class HashtagServiceImpl implements IHashtagService  {

	@Autowired
	private IHashtagDao HashtagDao;

	@Override
	@Transactional(readOnly = true)
	public Hashtag findById(Long id) {
		return HashtagDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Hashtag save(Hashtag hashtag) {
		return HashtagDao.save(hashtag);
	}
}
