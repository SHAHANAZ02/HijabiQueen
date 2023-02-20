package com.example.RestProfession.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.RestProfession.view.Profession;


@Repository
public interface ProfessionRepository extends JpaRepository<Profession,Integer> {
  
}
