package com.example.itineraryplanner;

import java.util.ArrayList;

/**
 * Gestiona las operaciones sobre el itinerario.
 */
public class ItineraryPlanner {
    private ArrayList<Stop> itinerary;

    public ItineraryPlanner() {
        this.itinerary = new ArrayList<>();
    }

    public void addStop(String location, String time) {
        itinerary.add(new Stop(location, time));
        System.out.println(location + " añadido al itinerario para las " + time + ".");
    }

    public void removeStop(String location) {
        itinerary.removeIf(stop -> stop.getLocation().equalsIgnoreCase(location));
        System.out.println(location + " eliminado del itinerario.");
    }

    public void displayItinerary() {
        if (itinerary.isEmpty()) {
            System.out.println("El itinerario está vacío.");
            return;
        }
        System.out.println("\nItinerario actual:");
        for (Stop stop : itinerary) {
            System.out.println("- " + stop);
        }
    }
}
