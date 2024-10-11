/**
 * Generated by Aster
 */
package org.apache.commons.codec.language;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_Nysiis_Coverage_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNysiis_Vttr11() {
        Nysiis nysiis = new Nysiis();
        String result = nysiis.nysiis("EVE");
        assertEquals("A", result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNysiis_iRzl11_fid2() {
        Nysiis nysiis = new Nysiis();
        String result = nysiis.nysiis("EV");
        assertEquals("AF", result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testTranscodeRemaining_SCH_czko6_glXC1_fid3() {
    Nysiis nysiis = new Nysiis();
    String chars = nysiis.encode("SCHX");
    String CHARS_SSS = "SSS";
    assertEquals(CHARS_SSS, chars);
}
}