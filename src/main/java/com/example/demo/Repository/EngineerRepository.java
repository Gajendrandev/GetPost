package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.EngineerEntity;

public interface EngineerRepository extends JpaRepository<EngineerEntity, Integer> {

}
