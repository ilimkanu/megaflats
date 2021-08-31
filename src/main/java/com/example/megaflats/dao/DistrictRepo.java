package com.example.megaflats.dao;

import com.example.megaflats.models.entities.District;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DistrictRepo extends JpaRepository<District,Long> {
    District findDistrictById(Long id);
}
