package com.hospital.service;


import java.util.List;

import org.springframework.stereotype.Service;

import com.hospital.dto.HospitalDto;
import com.hospital.entity.Hospital;

@Service
public interface HospitalService {
	void saveForm(Hospital hospital);
	List<Hospital> viewList();
	void updateList(HospitalDto dto);
	void deleteData(Long id);
	Hospital findData(Long id);
	
}
