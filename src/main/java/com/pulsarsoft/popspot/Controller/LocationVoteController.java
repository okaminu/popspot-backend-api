package com.pulsarsoft.popspot.Controller;

import com.pulsarsoft.popspot.Model.LocationVote;
import com.pulsarsoft.popspot.Repository.LocationVoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * @author Aurimas Degutis.
 */

@RestController()
public class LocationVoteController {

    @Autowired
    LocationVoteRepository locationVoteRepository;

    @RequestMapping(value = "/get-ratings", method = RequestMethod.GET)
    public Collection<LocationVote> getFeedback() {
        return locationVoteRepository.findAll();
    }


    @RequestMapping(value = "/put-rating", method = RequestMethod.POST)
    public void putFeedback(@RequestBody LocationVote locationVote)
    {
        locationVoteRepository.insert(locationVote);
    }
}
