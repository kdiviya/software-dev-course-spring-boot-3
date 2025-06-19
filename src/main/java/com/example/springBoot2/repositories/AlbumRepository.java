package com.example.springBoot2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.springBoot2.models.Album;

public interface AlbumRepository extends JpaRepository<Album, Integer> {
}
