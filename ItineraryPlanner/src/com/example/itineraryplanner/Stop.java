package com.example.itineraryplanner;

/**
 * Representa una parada en el itinerario.
 */
public class Stop {
    private String location;
    private String time;

    public Stop(String location, String time) {
        this.location = location;
        this.time = time;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return location + " a las " + time;
    }
}

