package com.hospital.service;


import java.util.List;

import org.springframework.stereotype.Service;

import com.hospital.dto.HospitalDto;
import com.hospital.entity.Hospital;

@Service
public interface HospitalService {
	Hospital saveForm(Hospital hospital);
	List<Hospital> viewList();
	Hospital updateList(HospitalDto dto);
	void deleteData(Long id);
	Hospital findData(Long id);
	
}
