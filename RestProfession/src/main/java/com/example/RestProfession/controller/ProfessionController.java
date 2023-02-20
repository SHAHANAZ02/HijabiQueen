package com.example.RestProfession.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.RestProfession.service.ProfessionService;
import com.example.RestProfession.view.Profession;

@RestController
public class ProfessionController {
@Autowired
ProfessionService profService;
@GetMapping("/prof")
public List<Profession> getAllProfession()
{
	return profService.getAllProfessions();
}
@GetMapping("/prof/{id}")
public Profession getProfession(@PathVariable("id") Integer id)
{
	return profService.getProfessionById(id);
}
@DeleteMapping("/prof/{id}")
public List<Profession> deleteProfession(@PathVariable("id") Integer id)
{
	profService.deleteById(id);
	return profService.getAllProfessions();
}
@PostMapping("/prof1")
public List<Profession> saveProfession (@RequestBody Profession prof)
{
	profService.saveOrUpdate(prof);
	return profService.getAllProfessions();	
}
@PutMapping("/prof2")
public List<Profession> updateProfession (@RequestBody Profession prof,Integer id)
{
	profService.update(prof,id);
	return profService.getAllProfessions();	
}
}
