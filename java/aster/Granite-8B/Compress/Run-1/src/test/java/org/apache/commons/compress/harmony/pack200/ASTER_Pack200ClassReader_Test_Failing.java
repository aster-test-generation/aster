/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.pack200;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_Pack200ClassReader_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFileName_PjZa0() {
        Pack200ClassReader pack200ClassReader = new Pack200ClassReader(new byte[]{});
        String fileName = pack200ClassReader.getFileName();
        assertNotNull(fileName);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReadConstIntChar_mvoq0() {
        Pack200ClassReader pack200ClassReader = new Pack200ClassReader(new byte[]{});
        char[] buf = new char[10];
        Object result = pack200ClassReader.readConst(10, buf);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReadConstIntChar2_pNSm1() {
        Pack200ClassReader pack200ClassReader = new Pack200ClassReader(new byte[]{});
        char[] buf = new char[10];
        Object result = pack200ClassReader.readConst(20, buf);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasSyntheticAttributes_ebXZ0() {
        Pack200ClassReader pack200ClassReader = new Pack200ClassReader(new byte[]{});
        boolean result = pack200ClassReader.hasSyntheticAttributes();
        assertFalse(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReadUnsignedShort_koWA0() {
        Pack200ClassReader pack200ClassReader = new Pack200ClassReader(new byte[]{});
        int unsignedShort = pack200ClassReader.readUnsignedShort(0);
        assertEquals(0, unsignedShort);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReadUnsignedShort2_ZekZ1() {
        Pack200ClassReader pack200ClassReader = new Pack200ClassReader(new byte[]{19});
        int unsignedShort = pack200ClassReader.readUnsignedShort(0);
        assertEquals(0, unsignedShort);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReadUnsignedShort3_seif2() {
        Pack200ClassReader pack200ClassReader = new Pack200ClassReader(new byte[]{19, 19});
        int unsignedShort = pack200ClassReader.readUnsignedShort(0);
        assertEquals(0, unsignedShort);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLastConstantHadWideIndex_oLcn0() {
        Pack200ClassReader pack200ClassReader = new Pack200ClassReader(new byte[]{});
        boolean result = pack200ClassReader.lastConstantHadWideIndex();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReadUTF8_aRaO0() {
        Pack200ClassReader pack200ClassReader = new Pack200ClassReader(new byte[]{});
        char[] charArr = new char[10];
        String utf8 = pack200ClassReader.readUTF8(10, charArr);
        assertNotNull(utf8);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReadUTF8WithNullCharArr_RmGW1() {
        Pack200ClassReader pack200ClassReader = new Pack200ClassReader(new byte[]{});
        String utf8 = pack200ClassReader.readUTF8(10, null);
        assertNotNull(utf8);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReadUTF8WithEmptyCharArr_ugTz2() {
        Pack200ClassReader pack200ClassReader = new Pack200ClassReader(new byte[]{});
        char[] charArr = new char[0];
        String utf8 = pack200ClassReader.readUTF8(10, charArr);
        assertNotNull(utf8);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReadUTF8WithNegativeArg0_aLia3() {
        Pack200ClassReader pack200ClassReader = new Pack200ClassReader(new byte[]{});
        char[] charArr = new char[10];
        String utf8 = pack200ClassReader.readUTF8(-10, charArr);
        assertNotNull(utf8);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReadUTF8WithZeroArg0_PyOk4() {
        Pack200ClassReader pack200ClassReader = new Pack200ClassReader(new byte[]{});
        char[] charArr = new char[10];
        String utf8 = pack200ClassReader.readUTF8(0, charArr);
        assertNotNull(utf8);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReadUTF8WithLargeArg0_vwue5() {
        Pack200ClassReader pack200ClassReader = new Pack200ClassReader(new byte[]{});
        char[] charArr = new char[10];
        String utf8 = pack200ClassReader.readUTF8(1000000000, charArr);
        assertNotNull(utf8);
    }
}