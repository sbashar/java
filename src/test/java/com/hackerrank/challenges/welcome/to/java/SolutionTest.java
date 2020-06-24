package com.hackerrank.challenges.welcome.to.java;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void returnHelloWorldReturnsHelloWorld() {
        assertEquals(solution.returnHelloWorld(), "Hello, World.");
    }

    @Test
    void returnHelloJavaReturnsHelloJava() {
        assertEquals(solution.returnHelloJava(), "Hello, Java.");
    }
}