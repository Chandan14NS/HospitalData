package com.hospital.service;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospital.dto.HospitalDto;
import com.hospital.entity.Hospital;
import com.hospital.repository.HospitalRepository;
@Service
public class HospitalServiceImpl implements HospitalService{
	
	@Autowired
	HospitalRepository hospitalRepo;
	
	@Override
	public void saveForm(Hospital hospital) {
		hospitalRepo.save(hospital);
	}

	@Override
	public List<Hospital> viewList() {
		List<Hospital> list = hospitalRepo.findAll();
		return list;
	}

	@Override
	public void updateList(HospitalDto dto) {
		Hospital hospital=new Hospital();
		hospital.setId(dto.getId());
		hospital.setFirstName(dto.getFirstName());
		hospital.setLastName(dto.getLastName());
		hospital.setCity(dto.getCity());
		hospital.setEmail(dto.getEmail());
		hospital.setMobile(dto.getMobile());
		hospital.setFees(dto.getFees());
		hospitalRepo.save(hospital);	
	}

	@Override
	public void deleteData(Long id) {
		hospitalRepo.deleteById(id);
		}

	@Override
	public Hospital findData(Long id) {
		Hospital hospital = hospitalRepo.findById(id).get();
		return hospital;
	}

}
