package com.pulsarsoft.popspot.Model;

/**
 * @author Aurimas Degutis.
 */
public class LocationVote {

    public final Coordinates coordinates;
    public final Feedback feedback;

    public LocationVote(Coordinates coordinates, Feedback feedback) {
        this.coordinates = coordinates;
        this.feedback = feedback;
    }
}
