package com.example.prac;
public class HackerRankTeams {

    public static int findMinimumTeams(int p, int teamsize_1, int teamsize_2) {
        int minTeams = -1;

        // Check if total participants can be evenly divided into teams of teamsize_1 or teamsize_2
        for (int teams_1 = 0; teams_1 <= p / teamsize_1; ++teams_1) {
            int remainingParticipants = p - teams_1 * teamsize_1;
            if (remainingParticipants % teamsize_2 == 0) {
                int teams_2 = remainingParticipants / teamsize_2;
                minTeams = (teams_1 + teams_2);
                break;
            }
        }

        return minTeams;
    }

    public static void main(String[] args) {
        // Example usage
        int p = 40;
        int teamsize_1 = 15;
        int teamsize_2 = 10;

        int result = findMinimumTeams(p, teamsize_1, teamsize_2);

        if (result == -1) {
            System.out.println("No valid division is possible.");
        } else {
            System.out.println("Minimum number of teams: " + result);
        }
    }
}
