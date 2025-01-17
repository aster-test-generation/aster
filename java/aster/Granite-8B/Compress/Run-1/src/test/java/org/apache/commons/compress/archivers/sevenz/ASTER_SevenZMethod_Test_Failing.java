/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.sevenz;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_SevenZMethod_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testById_Acrb0() {
        SevenZMethod method = SevenZMethod.byId(new byte[]{(byte) 0x30});
    assertNull(SevenZMethod.COPY);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testById2_JrGU1() {
        SevenZMethod method = SevenZMethod.byId(new byte[]{(byte) 0x31});
    assertNull(SevenZMethod.LZMA);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testById3_SQWI2() {
        SevenZMethod method = SevenZMethod.byId(new byte[]{(byte) 0x32});
    assertNull(SevenZMethod.LZMA2);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testById_Acrb0_fid2() {
        SevenZMethod method = SevenZMethod.byId(new byte[]{(byte) 0x30});
        assertEquals(SevenZMethod.COPY, method);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testById2_JrGU1_fid2() {
        SevenZMethod method = SevenZMethod.byId(new byte[]{(byte) 0x31});
        assertEquals(SevenZMethod.LZMA, method);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testById3_SQWI2_fid2() {
        SevenZMethod method = SevenZMethod.byId(new byte[]{(byte) 0x32});
        assertEquals(SevenZMethod.LZMA2, method);
    }
}