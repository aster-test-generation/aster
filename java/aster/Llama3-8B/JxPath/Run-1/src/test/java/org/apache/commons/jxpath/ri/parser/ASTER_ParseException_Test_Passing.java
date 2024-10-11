/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.parser;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_ParseException_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMessage1_YICp0() {
        ParseException e = new ParseException("message");
        String result = e.getMessage();
        assertEquals("message", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddEscapes1_HYQH0() {
        ParseException parser = new ParseException();
        String str = "Hello World";
        String result = parser.add_escapes(str);
        assertEquals("Hello World", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddEscapes2_RUUh1() {
        ParseException parser = new ParseException();
        String str = "Hello\\ World";
        String result = parser.add_escapes(str);
        assertEquals("Hello\\\\ World", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddEscapes3_CyYZ2() {
        ParseException parser = new ParseException();
        String str = "Hello\nWorld";
        String result = parser.add_escapes(str);
        assertEquals("Hello\\nWorld", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMessage2_PomI1_fid1() {
        ParseException e = new ParseException();
        String result = e.getMessage();
    }
}