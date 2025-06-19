package com.example.springBoot2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.springBoot2.models.Movie;

public interface MovieRepository extends JpaRepository<Movie, Integer> {
}
