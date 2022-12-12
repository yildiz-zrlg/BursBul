package com.example.BursBul.Repository;

import com.example.BursBul.Model.Burs;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BursRepository extends JpaRepository<Burs, String> {
}
