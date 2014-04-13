package com.luckyryan.sample.myexcrcises;

import java.util.ArrayList;
import java.util.List;

/**
 * @author m.abareghi
 *         4/11/14 - 7:52 PM
 */
public class StackExerciseImpl implements StackExercise {

    private List<String> elements = new ArrayList<String>();

    @Override
    public String pop() throws StackEmptyException {
        if (isEmpty()) {
            throw new StackEmptyException();
        }
        int size = elements.size() - 1;
        String stackElement = elements.get(size);
        elements.remove(size);
        return stackElement;

    }

    @Override
    public void push(String item) {
        elements.add(item);
    }

    @Override
    public String top() throws StackEmptyException {
        if (isEmpty()) {
            throw new StackEmptyException();
        }
        return elements.get(elements.size()-1);
    }

    @Override
    public boolean isEmpty() {
        return elements.isEmpty();
    }

}

