package com.pratice.Collection;

import java.util.LinkedList;

class Patient {
    private String name;
    private boolean isEmergency;

    public Patient(String name, boolean isEmergency) {
        this.name = name;
        this.isEmergency = isEmergency;
    }


    public String toString() {
        return name + (isEmergency ? " (EMERGENCY)" : "");
    }
}

public class Linked {
    public static void main(String[] args) {
        // Ideal: LinkedList implements both List AND Deque interfaces
        var clinicQueue = new LinkedList<Patient>();

        // Standard arrivals added to tail: O(1)
        clinicQueue.addLast(new Patient("Ramesh", false));
        clinicQueue.addLast(new Patient("Anitha", false));

        System.out.println("Initial Queue: " + clinicQueue);

        // SCENARIO A: Emergency patient arrives! 
        // Insertion at head is O(1) without shifting any existing elements
        clinicQueue.addFirst(new Patient("Dr. Suresh", true));

        System.out.println("After Emergency Arrival: " + clinicQueue);

        // SCENARIO B: Doctor calls next patient from front
        // Removal from head is O(1) without shifting elements in memory
        Patient servedPatient = clinicQueue.removeFirst();
        System.out.println("Currently Treating: " + servedPatient);
        System.out.println("Remaining Queue: " + clinicQueue);
    }
}
