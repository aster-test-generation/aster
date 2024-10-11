/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.interfaces.handling.file;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_EventLineParseException_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLine_cVsU0() {
        EventLineParseException e = new EventLineParseException("message", "line");
        assertEquals("line", e.getLine());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLineWithCause_nmij1() {
        Throwable cause = new Exception("cause");
        EventLineParseException e = new EventLineParseException("message", cause, "line");
        assertEquals("line", e.getLine());
    }
}