package org.example.entities;

public class District extends CompundCountable{

    @Override
    public int countVotes() {
        return this.children.stream().mapToInt(Countable::countVotes).sum();
    }
}
