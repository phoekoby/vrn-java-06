package ru.dataart.academy.java;

import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    public void testGetNumberOfChar() {
        ClassLoader classLoader = getClass().getClassLoader();
        Calculator calculator = new Calculator();
        assert (calculator.getNumberOfChar(classLoader.getResource("test.zip").getPath(), '1').equals(3));
        assert (calculator.getNumberOfChar(classLoader.getResource("test.zip").getPath(), '-').equals(2));
        assert (calculator.getNumberOfChar(classLoader.getResource("test.zip").getPath(), 'a').equals(0));
    }

    @Test
    public void testGetMaxWordLength() {
        ClassLoader classLoader = getClass().getClassLoader();
        Calculator calculator = new Calculator();
        assert (calculator.getMaxWordLength(classLoader.getResource("test.zip").getPath()).equals(2));
        assert (calculator.getMaxWordLength(classLoader.getResource("test1.zip").getPath()).equals(12));
    }
}
