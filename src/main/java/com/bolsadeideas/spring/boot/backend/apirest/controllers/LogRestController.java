package com.bolsadeideas.spring.boot.backend.apirest.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.bolsadeideas.spring.boot.backend.apirest.models.entity.Log;
import com.bolsadeideas.spring.boot.backend.apirest.models.services.ILogService;

@RestController
@RequestMapping("/api/v1")
public class LogRestController {
	
    @Autowired
    private ILogService clienteService;
	
	
    @GetMapping("clientes")
	public List<Log> index(){
		return clienteService.findAll();
	}
    
    @GetMapping("/v1/logs/hashtag/{hashtagId}")
	public Optional<Log> show(@PathVariable Long id) {
		
		return clienteService.findById(id);
	}
    
    @PostMapping("/logs")
    @ResponseStatus(HttpStatus.CREATED)
    public Log create(@RequestBody Log log) {
    	
    	return clienteService.save(log);
    }

}
