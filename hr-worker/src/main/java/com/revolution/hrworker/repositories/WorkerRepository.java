package com.revolution.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revolution.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
