package com.pulsarsoft.popspot.Model;

/**
 * @author Aurimas Degutis.
 */
public class Feedback {

    public final short rating;
    public final String comment;

    public Feedback(short rating, String comment) {
        this.rating = rating;
        this.comment = comment;
    }
}
