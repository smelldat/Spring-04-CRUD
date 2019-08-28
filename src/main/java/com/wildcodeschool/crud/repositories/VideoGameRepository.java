package com.wildcodeschool.crud.repositories;

import com.wildcodeschool.crud.entities.VideoGame;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VideoGameRepository extends JpaRepository<VideoGame, Long> {

}
