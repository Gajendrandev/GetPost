package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.EngineerEntity;
import com.example.demo.Service.EngineerService;

@RestController
public class EngineerController {
	@Autowired
	EngineerService engSer;
	
	@PostMapping("/addDetails")
	public EngineerEntity addInfo( @RequestBody EngineerEntity st) {
		return engSer.saveDetails(st);
	}
	@GetMapping("/showDetails")
	public List<EngineerEntity> fetchDetails(){
		return engSer.getDetails();
	}
	@PutMapping("/updateDetails")
	public EngineerEntity updateInfo(@RequestBody EngineerEntity st1) {
		return engSer.updateDetails(st1);
	}

}
