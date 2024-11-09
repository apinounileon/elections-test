package org.example.entities;

import java.util.ArrayList;
import java.util.List;

public abstract class CompundCountable implements Countable {
    protected List<Countable> children = new ArrayList<>();

    public CompundCountable() {
    }

    public void addChildren(Countable child) {
        children.add(child);
    }

    public void removeChildren(Countable child) {
        children.remove(child);
    }
}
