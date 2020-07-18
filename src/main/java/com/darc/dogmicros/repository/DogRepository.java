package com.darc.dogmicros.repository;

import com.darc.dogmicros.entity.Dog;
import org.springframework.data.repository.CrudRepository;

public interface DogRepository extends CrudRepository<Dog, Long> {
}
