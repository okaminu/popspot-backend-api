package com.pulsarsoft.popspot.Controller;

import com.pulsarsoft.popspot.Model.Coordinates;
import com.pulsarsoft.popspot.Model.Feedback;
import com.pulsarsoft.popspot.Model.LocationVote;
import com.pulsarsoft.popspot.Repository.LocationVoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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
    public void putFeedback(@RequestBody String text)
    {
        Feedback feedback = new Feedback((short) 1, "hello");
        Coordinates coordinates = new Coordinates(123, 321);
        locationVoteRepository.insert(new LocationVote(coordinates, feedback));
    }
}
