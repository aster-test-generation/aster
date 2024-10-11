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
    public void testAddEscapes1_mfGT0() {
        ParseException parseException = new ParseException();
        String result = parseException.add_escapes("Hello World");
        assert result.equals("Hello World");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddEscapes2_Eslw1() {
        ParseException parseException = new ParseException("message");
        String result = parseException.add_escapes("Hello\nWorld");
        assert result.equals("Hello\\nWorld");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddEscapes4_oUqF3() {
        ParseException parseException = new ParseException();
        String result = parseException.add_escapes("Hello\u0000World");
        assertEquals("HelloWorld", result);
    }
}