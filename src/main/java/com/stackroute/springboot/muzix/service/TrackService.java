package com.stackroute.springboot.muzix.service;

import com.stackroute.springboot.muzix.model.Track;
import org.springframework.stereotype.Service;

import java.util.List;

public interface TrackService {

    //creating methods

    public Track saveTrack(Track track);

    public List<Track> getAllTrack();
}
