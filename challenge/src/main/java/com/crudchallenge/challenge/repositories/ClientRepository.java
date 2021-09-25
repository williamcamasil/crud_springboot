package com.crudchallenge.challenge.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crudchallenge.challenge.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long>{

}