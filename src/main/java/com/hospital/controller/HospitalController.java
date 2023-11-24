package com.hospital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hospital.dto.HospitalDto;
import com.hospital.entity.Hospital;
import com.hospital.service.HospitalService;

@Controller
public class HospitalController {
	
	@Autowired
	HospitalService service;
	
	//http://localhost:8080/viewform
	@RequestMapping("/viewform")
	public String viewForm() {
		return "view";
	}
	
	@RequestMapping("/saveform")
	public String saveForm(Hospital hospital,Model model) {
		service.saveForm(hospital);
		model.addAttribute("msg", "Record is saved");
		return "view";
	}
	//http://localhost:8080/viewlist
	@RequestMapping("/viewlist")
	public String viewList(Model model) {
		List<Hospital> list = service.viewList();
		model.addAttribute("list",list);
		return "list";
	}
	@RequestMapping("/delete")
	public String deleteData(@RequestParam("id")Long id,Model model) {
		service.deleteData(id);
		List<Hospital> list = service.viewList();
		model.addAttribute("list",list);
		return "list";
	}
	@RequestMapping("/update")
	public String updateForm(@RequestParam("id")Long id,Model model) {
		Hospital data = service.findData(id);
		model.addAttribute("patient",data);
		return "update";
	}
	@RequestMapping("/updateform")
	public String updateData(HospitalDto dto,Model model) {
		service.updateList(dto);
		List<Hospital> list = service.viewList();
		model.addAttribute("list",list);
		return "list";
	}
}
