package com.example.Animal.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Animal.Model.Animal;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, Integer> {

}
