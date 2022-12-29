package com.robsonArcoleze.Client.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.robsonArcoleze.Client.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long>{

}
