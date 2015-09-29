package com.pulsarsoft.popspot.Service;

import com.pulsarsoft.popspot.Model.Coordinates;
import com.pulsarsoft.popspot.Model.Feedback;
import com.pulsarsoft.popspot.Model.LocationVote;

import java.util.Collection;
import java.util.HashSet;

/**
 * @author Aurimas Degutis.
 */

public class LocationVoteService {
    public Collection<LocationVote> createMock() {
        Collection<LocationVote> votes = new HashSet<>();
        votes.add(new LocationVote(
                new Coordinates((float) 54.9198, (float) 23.9709),
                new Feedback((short) 1, "Stupid dog, uuuuuuuuu"))
        );

        votes.add(new LocationVote(
                new Coordinates((float)54.91, (float)-66.97),
                new Feedback((short)0, "Verry Naughty :)"))
        );

        return votes;
    }
}
