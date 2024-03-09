package com.postgres.lj88;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.postgres.lj88.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
    // You can define custom query methods here if needed
	@Query("SELECT p FROM Person p WHERE CONCAT(',', p.sharedWith, ',') LIKE CONCAT('%,', :sharedWith, ',%')")
	List<Person> findBySharedWith(String sharedWith);
}

