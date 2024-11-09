package org.example.entities;

public class PollingStation implements Countable {
    private int votes;

    public PollingStation(int votes) {
        this.votes = votes;
    }

    public void setVotes(int votes) {
        this.votes = votes;
    }

    @Override
    public int countVotes() {
        return votes;
    }
}
