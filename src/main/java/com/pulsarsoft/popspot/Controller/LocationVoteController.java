package com.pulsarsoft.popspot.Controller;

import com.pulsarsoft.popspot.Model.LocationVote;
import com.pulsarsoft.popspot.Service.LocationVoteService;
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
    LocationVoteService locationVoteService;

    @RequestMapping(value = "/get-ratings", method = RequestMethod.GET)
    public Collection<LocationVote> getFeedback() {
        return locationVoteService.createMock();
    }


    @RequestMapping(value = "/put-rating", method = RequestMethod.POST)
    public void putFeedback(@RequestBody String text)
    {

    }
}
