package com.hospital.controller;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hospital.dto.HospitalDto;
import com.hospital.entity.Hospital;
import com.hospital.service.HospitalService;

@RestController
@RequestMapping("/patients/api")
public class HospitalController {
	
	@Autowired
	HospitalService service;
	
	
	@PostMapping("/save")
	public ResponseEntity<Hospital> saveForm(Hospital hospital) {
		Hospital saved = service.saveForm(hospital);
		return new ResponseEntity<>(saved,HttpStatus.OK);
	}

	@GetMapping("/viewlist")
	public String viewList(Model model) {
		List<Hospital> list = service.viewList();
		
		model.addAttribute("list",list);
		return "list";
	}
	@DeleteMapping("/delete")
	public String deleteData(@RequestParam("id")Long id,Model model) {
		service.deleteData(id);
		List<Hospital> list = service.viewList();
		model.addAttribute("list",list);
		return "list";
	}
	
	@PutMapping("/update")
	public String updateData(HospitalDto dto,Model model) {
		service.updateList(dto);
		List<Hospital> list = service.viewList();
		model.addAttribute("list",list);
		return "list";
	}
}
