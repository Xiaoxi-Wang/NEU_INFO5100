package assignment6.partA;

import java.util.ArrayList;

public class Mreview implements Comparable<Mreview> {
    // instance variables
    private String title; // title of the movie
    private ArrayList<Integer> ratings = new ArrayList<>(); // list of ratings

    // constructors
    public Mreview() {}

    public Mreview(String title) { this.title = title; }

    public Mreview(String title, int firstRating) {
        this.title = title;
        this.ratings.add(firstRating);
    }

    // methods
    public String getTitle() {
        return title;
    }

    public void addRating(int rating) {
        ratings.add(rating);
    }

    public double aveRating() {
        int sum = 0;
        for (int rating : ratings) { sum += rating; }
        return (double) (sum / numRatings());
    }

    public int numRatings() {
        return ratings.size();
    }

    @Override
    public int compareTo(Mreview obj) { return this.title.compareTo(obj.title); }

    public boolean equals(Object obj) {
        Mreview object = (Mreview) obj;
        if (this.getTitle().equals(object.getTitle())) {
            return true;
        }
        return false;
    }

    public String toString() {
        return getTitle() + ", average " + aveRating() + " out of " + numRatings() + " ratings\n";
    }

    // test code
    public static void main(String[] args) {
        Mreview mreview = new Mreview("Kill Bill", 3);
        mreview.addRating(4);
        mreview.addRating(3);
        System.out.println(mreview.toString());
    }
}
