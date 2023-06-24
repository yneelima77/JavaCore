package JAVASE_SBA_Problems;

import java.util.Arrays;

class Football implements Sport {
    private int[] playerIDs;

    Football() {
        playerIDs = new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        System.out.println("A new football team has been formed");
    }

    @Override
    public void calculateAvgAge(int[] age) {
        System.out.printf("The average age of the team is %.2f%n", Double.valueOf(Arrays.stream(age).average().getAsDouble()));
    }

    @Override
    public void retirePlayer(int id) {
        if (id <= playerIDs.length) {
            if (playerIDs[id - 1] == -1) {
                System.out.println("Player has already retired");
            } else {
                System.out.println("Player with id: " + id + " has retired");
                playerIDs[id - 1] = -1;
            }
        }
    }

    public void playerTransfer(int fee, int id) {
        if (id <= playerIDs.length) {
            if (playerIDs[id - 1] == -1) {
                System.out.println("Player has already retired");
            } else {
                System.out.println("Player with id: " + id + " has been transferred with a fee of " + fee);
            }
        }
    }
}
