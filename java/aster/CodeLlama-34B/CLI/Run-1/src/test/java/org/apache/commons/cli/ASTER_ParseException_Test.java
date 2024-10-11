/**
 * Generated by Aster
 */
package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_ParseException_Test {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWrap_UnsupportedOperationException_IwIF0() {
        UnsupportedOperationException e = new UnsupportedOperationException();
        try {
            ParseException.wrap(e);
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException ex) {
            assertSame(e, ex);
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWrap_ParseException_leBW1() {
        ParseException e = new ParseException("test");
        ParseException wrapped = ParseException.wrap(e);
        assertSame(e, wrapped);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWrap_OtherException_daTE2_1() {
        Exception e = new Exception();
        ParseException wrapped = ParseException.wrap(e);
        assertNotNull(wrapped);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWrap_OtherException_daTE2_2() {
        Exception e = new Exception();
        ParseException wrapped = ParseException.wrap(e);
        assertEquals(e.getMessage(), wrapped.getMessage());
    }
}