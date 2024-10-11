/**
 * Generated by Aster
 */
package org.apache.commons.cli;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_ParseException_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOtherException_RxwQ2() {
        Exception e = new Exception("test");
        ParseException result = ParseException.wrap(e);
        assert result.getMessage().equals(e.getMessage());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUnsupportedOperationException_WEep0_Vwcq1() {
        UnsupportedOperationException e = new UnsupportedOperationException();
        ParseException result = ParseException.wrap(e);
        assert result instanceof ParseException;
    }
}