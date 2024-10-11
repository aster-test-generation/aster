/**
 * Generated by Aster
 */
package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_ParseException_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWrapWithUnsupportedOperationException_Bigs0() throws Exception {
        UnsupportedOperationException exception = new UnsupportedOperationException();
        ParseException result = ParseException.wrap(exception);
        assertEquals(exception, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWrapWithParseException_oibX1() throws Exception {
        ParseException exception = new ParseException("message");
        ParseException result = ParseException.wrap(exception);
        assertEquals(exception, result);
    }
}