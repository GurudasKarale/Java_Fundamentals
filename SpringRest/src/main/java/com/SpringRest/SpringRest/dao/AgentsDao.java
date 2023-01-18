package com.SpringRest.SpringRest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringRest.SpringRest.entities.Agents;

public interface AgentsDao extends JpaRepository<Agents,Long> {

}
