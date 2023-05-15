package com.objective.exercise;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.emptyIterable;
import static org.hamcrest.Matchers.not;

/**
 * @author luizfmarins
 */

public class JavaExerciseTest {
    private JavaExercise sut = new JavaExercise();

    @Test
    public void myFirstTest() {
        List<Integer> result = sut.calculate(null, null);

        assertThat(result, not(emptyIterable()));
    }

}