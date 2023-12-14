package com.hospital;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import com.hospital.dto.HospitalDto;
import com.hospital.entity.Hospital;
import com.hospital.repository.HospitalRepository;
import com.hospital.service.HospitalServiceImpl;

@SpringBootTest
class HospitalAppApplicationTests {

	@Mock
	HospitalRepository repo;

	@InjectMocks
	HospitalServiceImpl service;

	@Test
	public void saveData() {
		Hospital h = new Hospital();
		h.setFirstName("Adam");
		h.setLastName("S");
		h.setCity("NY");
		h.setEmail("adam@gmail.com");
		h.setFees(15000);
		h.setMobile(630485160);

		Mockito.when(repo.save(h)).thenReturn(h);

		// actual result
		Hospital result = service.saveForm(h);

		// Assertions
		Assertions.assertEquals(h, result);
		Mockito.verify(repo, times(1)).save(h);
	}

	@Test
	public void getData() {
		List<Hospital> mockList = new ArrayList<>();

		Hospital h1 = new Hospital();
		h1.setFirstName("Adam");
		h1.setLastName("S");
		h1.setCity("NY");
		h1.setEmail("adam@gmail.com");
		h1.setFees(15000);
		h1.setMobile(630485160);

		Hospital h2 = new Hospital();
		h2.setFirstName("Sam");
		h2.setLastName("S");
		h2.setCity("USA");
		h2.setEmail("sam@gmail.com");
		h2.setFees(15000);
		h2.setMobile(651511620);
		mockList.add(h1);
		mockList.add(h2);

		Mockito.when(repo.findAll()).thenReturn(mockList);

		// actual result
		List<Hospital> list = service.viewList();

		// Assertions
		Assertions.assertEquals(mockList, list);
		Assertions.assertTrue(list.contains(h1));
		Assertions.assertTrue(list.contains(h2));
		Mockito.verify(repo, times(1)).findAll();
	}

}
