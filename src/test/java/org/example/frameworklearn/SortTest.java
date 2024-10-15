package org.example.frameworklearn;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class SortTest {

    @Test
    void arraySort() {
        List<String> list = Arrays.asList("asfd", "alsjdf","afssa");
        System.out.println(list);
        Object[] array = list.toArray();
        Arrays.sort(array);
    }
}
