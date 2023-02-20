package com.example.RestProfession.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.RestProfession.repository.ProfessionRepository;
import com.example.RestProfession.view.Profession;

@Service
public class ProfessionService {
@Autowired
ProfessionRepository profRepository;

public List<Profession> getAllProfessions()
{	
	List<Profession> profession=new ArrayList<>();
	profession=(List<Profession>)profRepository.findAll();
	return profession;
	//return profRepository.findAll();
}
	
	/*JAVA 8
	profRepository.findAll().forEach(value->profession.add(value));
	return profession;*/

/*private static List<Profession> profession=new ArrayList<>();
private static int profCount = 3;
static {		
		profession.add(new Profession(1,"SHAHANAZ","Singer",25));
		profession.add(new Profession(2,"AZLAN","Actor",30));
		profession.add(new Profession(3,"FAHAD","Director",35));
	   }*/

public Profession getProfessionById(Integer id)
{
	return profRepository.findById(id).get();
}
public Profession saveOrUpdate(Profession prof1) 
{
	return profRepository.save(prof1);
}
/*if (prof1.getId() == 0) {
	prof1.setId(++profCount); }
prof1.add(profession);
return profession;
}*/
public void update(Profession profession,Integer id)
{
	profRepository.save(profession);
}
public void deleteById(Integer id) 
{
	profRepository.deleteById(id);	
}
//Iterator<Profession> iterator = Profession.iterator()
//while (iterator.hasNext()) {
//	Profession profession = iterator.next();
//	if (profession.getId() == id) {
//		iterator.remove();
//		return profession;
//	}
//}
//return null;
//}
}
