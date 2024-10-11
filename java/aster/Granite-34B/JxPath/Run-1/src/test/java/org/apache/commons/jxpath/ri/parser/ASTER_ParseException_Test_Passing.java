/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.parser;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_ParseException_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void getMessage_defaultConstructor_auci0() {
        ParseException exception = new ParseException();
        assertNull(exception.getMessage());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void getMessage_messageConstructor_dMjt1() {
        String message = "This is a test message";
        ParseException exception = new ParseException(message);
        assertEquals(message, exception.getMessage());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddEscapes_MHmZ0() {
        String input = "Hello, World!";
        String expected = "Hello, World!";
        String actual = new ParseException().add_escapes(input);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddEscapesWithSpecialChars_wMun1() {
        String input = "\b\t\n\f\r\"\'\\";
        String expected = "\\b\\t\\n\\f\\r\\\"\\'\\\\";
        String actual = new ParseException().add_escapes(input);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddEscapesWithEmptyInput_bndd3() {
        String input = "";
        String expected = "";
        String actual = new ParseException().add_escapes(input);
        assertEquals(expected, actual);
    }
}