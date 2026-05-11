package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class WorkintechList<T extends Comparable<T>> extends ArrayList<T> {

    @Override
    public boolean add(T element) {

        if (!this.contains(element)) {
            boolean added = super.add(element);

            sort();

            return added;
        }

        return false;
    }

    public void sort() {
        Collections.sort(this);
    }

    @Override
    public boolean remove(Object o) {

        boolean removed = super.remove(o);

        sort();

        return removed;
    }
}