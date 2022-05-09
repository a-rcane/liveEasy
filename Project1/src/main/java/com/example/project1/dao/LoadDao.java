package com.example.project1.dao;

import com.example.project1.entity.payLoads;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoadDao extends JpaRepository<payLoads, Long> {

}
