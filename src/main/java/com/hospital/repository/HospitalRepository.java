package com.hospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hospital.entity.Hospital;

public interface HospitalRepository extends JpaRepository<Hospital, Long>{

}
