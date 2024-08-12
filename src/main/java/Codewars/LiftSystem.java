package Codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class LiftSystem {
	 public static void main(String[] args) {
	        List<List<Integer>> queues = Arrays.asList(
	                Arrays.asList(),         // Ground floor
	                Arrays.asList(6, 5, 2),  // 1st floor
	                Arrays.asList(4),        // 2nd floor
	                Arrays.asList(),         // 3rd floor
	                Arrays.asList(0, 0, 0),  // 4th floor
	                Arrays.asList(),         // 5th floor
	                Arrays.asList(),         // 6th floor
	                Arrays.asList(3, 6, 4, 5, 6),  // 7th floor
	                Arrays.asList(),         // 8th floor
	                Arrays.asList(1, 10, 2), // 9th floor
	                Arrays.asList(1, 4, 3, 2) // 10th floor
	        );
	        int capacity = 5;
	        System.out.println(getLiftStops(queues, capacity));
	    }

	// A simple Pair class to store two related values
	    static class Pair<A, B> {
	        public final A first;
	        public final B second;

	        public Pair(A first, B second) {
	            this.first = first;
	            this.second = second;
	        }
	    }

	    static class Lift {
	        int currentFloor;
	        String direction;
	        int capacity;
	        List<Integer> passengers;
	        List<Integer> stops;
	        Map<Integer, Queue<Pair<Integer, String>>> waiting;

	        public Lift(int floors, int capacity) {
	            this.currentFloor = 0;
	            this.direction = "up";
	            this.capacity = capacity;
	            this.passengers = new ArrayList<>();
	            this.stops = new ArrayList<>();
	            this.waiting = new HashMap<>();
	            for (int i = 0; i < floors; i++) {
	                this.waiting.put(i, new LinkedList<>());
	            }
	        }

	        // Call method to add people to waiting queue with their destination and direction
	        public void call(int floor, List<Integer> people) {
	            for (int dest : people) {
	                String direction = dest > floor ? "up" : "down";
	                this.waiting.get(floor).add(new Pair<>(dest, direction));
	            }
	        }

	        // Main method to run the lift simulation
	        public void run() {
	            while (true) {
	                this.stops.add(this.currentFloor);
	                dropOffPassengers();
	                pickUpPassengers();

	                if (!hasMoreStops()) {
	                    break;
	                }

	                moveLift();
	            }

	            // Return to ground floor if needed
	            if (this.currentFloor != 0) {
	                this.stops.add(0);
	                this.currentFloor = 0;
	            }
	        }

	        // Drop off passengers at their destination floor
	        private void dropOffPassengers() {
	            List<Integer> remainingPassengers = new ArrayList<>();
	            for (int passenger : this.passengers) {
	                if (passenger != this.currentFloor) {
	                    remainingPassengers.add(passenger);
	                }
	            }
	            this.passengers = remainingPassengers;
	        }

	        // Pick up passengers waiting at the current floor
	        private void pickUpPassengers() {
	            Queue<Pair<Integer, String>> floorQueue = this.waiting.get(this.currentFloor);
	            List<Pair<Integer, String>> remainingPassengers = new ArrayList<>();
	            while (!floorQueue.isEmpty()) {
	                Pair<Integer, String> person = floorQueue.poll();
	                if (this.passengers.size() < this.capacity && person.second.equals(this.direction)) {
	                    this.passengers.add(person.first);
	                } else {
	                    remainingPassengers.add(person);
	                }
	            }
	            this.waiting.put(this.currentFloor, new LinkedList<>(remainingPassengers));
	        }

	        // Check if there are more stops required in the current direction
	        private boolean hasMoreStops() {
	            if (this.direction.equals("up")) {
	                for (int floor = this.currentFloor; floor < this.waiting.size(); floor++) {
	                    if (!this.waiting.get(floor).isEmpty() || this.passengers.contains(floor)) {
	                        return true;
	                    }
	                }
	            } else if (this.direction.equals("down")) {
	                for (int floor = this.currentFloor; floor >= 0; floor--) {
	                    if (!this.waiting.get(floor).isEmpty() || this.passengers.contains(floor)) {
	                        return true;
	                    }
	                }
	            }
	            return false;
	        }

	        // Move the lift based on the current direction
	        private void moveLift() {
	            if (this.direction.equals("up")) {
	                this.currentFloor++;
	                if (this.currentFloor == this.waiting.size() - 1 || !hasMoreStops()) {
	                    this.direction = "down";
	                }
	            } else if (this.direction.equals("down")) {
	                this.currentFloor--;
	                if (this.currentFloor == 0 || !hasMoreStops()) {
	                    this.direction = "up";
	                }
	            }
	        }
	    }

	    // Get the list of floors where the lift stops
	    public static List<Integer> getLiftStops(List<List<Integer>> queues, int capacity) {
	        int floors = queues.size();
	        Lift lift = new Lift(floors, capacity);

	        for (int floor = 0; floor < floors; floor++) {
	            lift.call(floor, queues.get(floor));
	        }

	        lift.run();
	        return lift.stops;
	    }
}
