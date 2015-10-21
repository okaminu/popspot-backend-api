package com.pulsarsoft.popspot.Model;

/**
 * @author Aurimas Degutis.
 */
public class Feedback {

    private short rating;
    private String comment;

    public short getRating() {
        return rating;
    }

    public void setRating(short rating) {
        this.rating = rating;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
