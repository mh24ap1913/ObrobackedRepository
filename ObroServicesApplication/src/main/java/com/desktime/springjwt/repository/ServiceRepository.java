package com.desktime.springjwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.desktime.springjwt.models.Service;

public interface ServiceRepository extends JpaRepository<Service, Long> {

}
