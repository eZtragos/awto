package com.bolsadeideas.spring.boot.backend.apirest.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bolsadeideas.spring.boot.backend.apirest.models.entity.Hashtag;
import com.bolsadeideas.spring.boot.backend.apirest.models.services.IHashtagService;

@RestController
@RequestMapping("/api/v1")
public class HashtagRestController {
	
    @Autowired
    private IHashtagService hashtagService;
    
	
	@PutMapping("/hashtags/{id}")
	public Hashtag update(@RequestBody Hashtag hashtag,@PathVariable Long id) {
		Hashtag  hashtagActual = hashtagService.findById(id);
		
		hashtagActual.setDescription(hashtag.getDescription());
		
		return hashtagService.save(hashtagActual);
		
	}

}
