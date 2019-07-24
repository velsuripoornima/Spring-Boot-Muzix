package com.stackroute.springboot.muzix.repository;

import com.stackroute.springboot.muzix.model.Track;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //it is saying as this class is repository class

public interface TrackRepository extends JpaRepository<Track,Integer> {
}
