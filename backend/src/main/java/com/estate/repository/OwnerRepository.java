package com.estate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.estate.entities.Owner;

@Repository
public interface OwnerRepository extends JpaRepository<Owner, Integer> {

	Owner findByUserid(String userid);
}
