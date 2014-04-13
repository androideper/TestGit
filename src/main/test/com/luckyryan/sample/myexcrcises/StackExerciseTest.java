package com.luckyryan.sample.myexcrcises;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

/**
 * @author m.abareghi
 *         4/11/14 - 7:50 PM
 */

@RunWith(MockitoJUnitRunner.class)
public class StackExerciseTest extends TestCase {

    StackExercise stackExercise = null;

    @Before
    public void setUp() {
        stackExercise = new StackExerciseImpl();
    }

    @Test
    public void testEmptyStack() {
        assertTrue(stackExercise.isEmpty());
    }

    @Test
    public void testPopEmptyStackThrowsException() {
        try {
            String pop = stackExercise.pop();
            fail("Empty stack must throw exception");
        } catch (StackEmptyException e) {
            assertTrue(true);
        }
    }

    @Test
    public void testPushOneElementEnsureNonEmpty() {
        String element = "testElement";
        stackExercise.push(element);
        assertFalse(stackExercise.isEmpty());
    }

    @Test
    public void testPushOneElementPopItVerifyNoException() {
        String expected = "testElement";
        stackExercise.push(expected);
        try {
            String element = stackExercise.pop();
            assertTrue(true);

        } catch (StackEmptyException e) {
            fail("Stack is not empty. This exception is invalid");
        }
    }

    @Test
    public void testPushOneElementPopItVerifyTheSame() {
        String expected = "testElement";
        stackExercise.push(expected);
        try {
            String element = stackExercise.pop();
            assertTrue("Popped element must the same as pushed", expected.equals(element));

        } catch (StackEmptyException e) {
            fail("Stack is not empty. This exception is invalid");
        }
    }

    @Test
    public void testTopElementFromEmptyThrowsException() {
        try {
            stackExercise.top();
            fail("Top on empty stack must throw exception");
        } catch (StackEmptyException e) {
            assertTrue(true);
        }
    }


    @Test
    public void testPushOneElementTopItVerifyTheSame() {
        String expected = "testElement";
        stackExercise.push(expected);
        try {
            String element = stackExercise.top();
            assertTrue("Popped element must the same as pushed", expected.equals(element));

        } catch (StackEmptyException e) {
            fail("Stack is not empty. This exception is invalid");
        }
    }

    @Test
    public void testPushOneElementTopItVerifyNotRemoved() {
        String expected = "testElement";
        stackExercise.push(expected);
        try {
            stackExercise.top();
            assertFalse("Popped element must the same as pushed", stackExercise.isEmpty());

        } catch (StackEmptyException e) {
            fail("Stack is not empty. This exception is invalid");
        }
    }

    @Test
    public void testPushOneElementTopItPopItVerifyTheSame() {
        String expected = "testElement";
        stackExercise.push(expected);
        try {
            String topElement = stackExercise.top();
            String poppedElement = stackExercise.pop();

            assertTrue("After popping element from stack with one element it must become empty",
                    stackExercise.isEmpty());
            assertEquals("Top element and popped element of stack must be the same", topElement, poppedElement);

        } catch (StackEmptyException e) {
            fail("Stack is not empty. This exception is invalid");
        }
    }


    public void testGit() {
        // no body is required.
        // This is only to check how changes work in git
    }

    public void testThirdFork() {

        // no body is required.
        // This is only to check how changes work in git

        // This is to test multiple file change in git


    }

}
