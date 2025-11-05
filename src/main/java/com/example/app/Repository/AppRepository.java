package com.example.app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.app.Model.Data;

@Repository
public interface AppRepository extends JpaRepository<Data, Integer> {
    
}
