package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.EngineerEntity;
import com.example.demo.Repository.EngineerRepository;

@Service
public class EngineerService {
	@Autowired
	EngineerRepository stRepo;
	public EngineerEntity saveDetails(EngineerEntity e) {
		return stRepo.save(e);
	}
	public List<EngineerEntity> getDetails(){
		return stRepo.findAll();
	}
	
	public EngineerEntity updateDetails(EngineerEntity sd) {
		return stRepo.saveAndFlush(sd);
	}

}
