package com.example.app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.app.Model.Status;

@Repository
public interface StatusRepository extends JpaRepository<Status, Integer> {
    
}
