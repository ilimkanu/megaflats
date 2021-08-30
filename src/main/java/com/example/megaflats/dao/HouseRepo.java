package com.example.megaflats.dao;

import com.example.megaflats.models.entities.House;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HouseRepo extends JpaRepository<House,Long> {
}
