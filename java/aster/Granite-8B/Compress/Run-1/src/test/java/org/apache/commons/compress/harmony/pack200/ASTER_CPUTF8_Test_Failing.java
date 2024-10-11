/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.pack200;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_CPUTF8_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_SFtS0() {
        CPUTF8 cPUTF8 = new CPUTF8("UTF-8:exampleString");
        String actual = cPUTF8.toString();
        String expected = "UTF-8:exampleString";
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_SFtS0_fid3() {
        CPUTF8 cPUTF8 = new CPUTF8("exampleString");
        String actual = cPUTF8.toString();
        String expected = "exampleString";
        assertEquals(expected, actual);
    }
}