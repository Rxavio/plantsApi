package net.plantsApi.repository;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import net.plantsApi.model.Plant; 

public interface PlantRepository extends CrudRepository<Plant, Integer> {
	  List<Plant> findByHasFruitTrue();
	  List<Plant> findByHasFruitFalse();
	  List<Plant> findByQuantityLessThan(Integer quantity);
	  List<Plant> findByHasFruitTrueAndQuantityLessThan(Integer quantity);
	  List<Plant> findByHasFruitFalseAndQuantityLessThan(Integer quantity);
	}
