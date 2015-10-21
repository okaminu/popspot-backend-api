package com.pulsarsoft.popspot.Model;

/**
 * @author Aurimas Degutis.
 */
public class LocationVote {

    private Coordinates coordinates;
    private Feedback feedback;

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public Feedback getFeedback() {
        return feedback;
    }

    public void setFeedback(Feedback feedback) {
        this.feedback = feedback;
    }
}
