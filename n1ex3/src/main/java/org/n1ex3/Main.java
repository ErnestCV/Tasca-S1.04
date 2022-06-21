package org.n1ex3;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ExceptionProvider exceptionProvider = new ExceptionProvider();

        int[] array = {0, 1};

        exceptionProvider.provideException(array);

    }
}