package com.example.Animal.Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Animal.Model.Animal;
import com.example.Animal.Service.AnimalService;

@RestController
@CrossOrigin("http://localhost:4200/")
public class AnimalController
{
	@Autowired
	private AnimalService service;
	@PostMapping("/animalpost")
    public Animal saveAnimal(@RequestBody Animal a)
    {
    	return service.saveanimal(a);
    }
	@GetMapping("/getanimal")
	public List<Animal> getAll()
	{
		return service.getall();
	}
	@GetMapping("/getanimal/{id}")
	public Optional<Animal> getAnimalById(@PathVariable int id)
	{
		return service.getById(id);
	}
	@PutMapping("/put")
	public Animal update(@RequestBody Animal a)
	{
		return service.saveanime(a);
	}
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Map<String, Boolean>> delete(@PathVariable int id)
	{
	   service.delete(id);
	   Map<String, Boolean> map = new HashMap<>();
	   map.put("Deleted",true);
	   return ResponseEntity.ok(map);	   
	}
}
