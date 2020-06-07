package practice.hello.world;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void hello_world() {
        Solution solution = new Solution();
        assertEquals("Hello World!", solution.hello_world());
    }
}