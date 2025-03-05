package omare.com.mx;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void testRemoveDuplicates() {
        assertEquals("ABCD123", Main.returnString("AABBCCD112233"));
    }

    @Test
    void testWithNoDuplicates() {
        assertEquals("ABC123", Main.returnString("ABC123"));
    }

    @Test
    void testWithAllSameCharacters() {
        assertEquals("A", Main.returnString("AAAAAA"));
    }

    @Test
    void testWithEmptyString() {
        assertEquals("", Main.returnString(""));
    }

    @Test
    void testWithNullString() {
        assertNull(Main.returnString(null));
    }
}