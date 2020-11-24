package com.bolsadeideas.spring.boot.backend.apirest.models.services;


import com.bolsadeideas.spring.boot.backend.apirest.models.entity.Hashtag;

public interface IHashtagService {

	public Hashtag findById(Long id);


	public Hashtag save(Hashtag hashtag);
	
	

}
