package examples.week01.mon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HelloTest {
    @Test
    void greetIncludesName() {
        assertEquals("Hello, Ada!", Hello.greet("Ada"));
    }
}
