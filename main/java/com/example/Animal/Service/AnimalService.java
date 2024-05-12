package com.example.Animal.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Animal.Model.Animal;
import com.example.Animal.Repository.AnimalRepository;

@Service
public class AnimalService {

	@Autowired
	private AnimalRepository repository;
	public Animal saveanimal(Animal a)
	{
		return repository.save(a);
	}
	public List<Animal> getall() {
		return repository.findAll();
	}
	public Animal saveanime(Animal a)
	{
		Animal existingent=repository.findById(a.getId()).orElse(null);
		existingent.setName(a.getName());
		existingent.setAge(a.getAge());
		existingent.setBreed(a.getBreed());
		return repository.save(existingent);
	}
	public String delete(int id) {
		repository.deleteById(id);
		return "deleted";
	}
	@SuppressWarnings("deprecation")
	public Optional<Animal> getById(int id) {
		// TODO Auto-generated method stub
	//	return repository.getById(id);
		return repository.findById(id);
	}
}
