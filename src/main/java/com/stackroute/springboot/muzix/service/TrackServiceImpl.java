package com.stackroute.springboot.muzix.service;

import com.stackroute.springboot.muzix.model.Track;
import com.stackroute.springboot.muzix.repository.TrackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service  //it is a service class
public class TrackServiceImpl implements TrackService {

    //overriding all the methods from trackservice interface
    @Autowired
    TrackRepository trackRepository;

    public TrackServiceImpl(TrackRepository trackRepository) {
        this.trackRepository = trackRepository;
    }

    @Override
    public Track saveTrack(Track track) {
        Track track1=trackRepository.save(track);
        return track1;
    }

    @Override
    public List<Track> getAllTrack() {
        return trackRepository.findAll();
    }
    
    @Override
    public Boolean updateTrack(Track track,int id) throws TrackNotFoundException {
       Optional<Track> track1= trackRepository.findById(id);
        if(!track1.isPresent()){
            return false;
        }
        track.setId(id);
        trackRepository.save(track);
        return true;

    }

    @Override
    public void deleteTrack(int id) {
        trackRepository.deleteById(id);

    }
}
