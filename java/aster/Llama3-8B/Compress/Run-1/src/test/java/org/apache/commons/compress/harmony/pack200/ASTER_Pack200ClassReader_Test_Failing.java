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
    public void testGetFileName_JRNl0() {
        byte[] b = new byte[0];
        Pack200ClassReader reader = new Pack200ClassReader(b);
        String fileName = reader.getFileName();
        assertEquals("", fileName);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetFileName_NahW1() {
        Pack200ClassReader reader = new Pack200ClassReader(new byte[0]);
        reader.setFileName("test");
        assertEquals("test", reader.getFileName());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReadConst_Beur0() {
        Pack200ClassReader reader = new Pack200ClassReader(new byte[0]);
        Object result = reader.readConst(1, new char[0]);
        assertNotNull(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReadConst2_VeiM1() {
        Pack200ClassReader reader = new Pack200ClassReader(new byte[0]);
        Object result = reader.readConst(0, new char[0]);
        assertNotNull(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasSyntheticAttributes_BnoH0() {
        byte[] b = new byte[0];
        Pack200ClassReader reader = new Pack200ClassReader(b);
        boolean result = reader.hasSyntheticAttributes();
        assertTrue(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReadUnsignedShort2_IMSX1() {
        byte[] b = new byte[2];
        b[0] = 1;
        b[1] = 2;
        Pack200ClassReader reader = new Pack200ClassReader(b);
        int result = reader.readUnsignedShort(0);
        assertEquals(2, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLastConstantHadWideIndex_UvPH0() {
        byte[] b = new byte[0];
        Pack200ClassReader reader = new Pack200ClassReader(b);
        boolean result = reader.lastConstantHadWideIndex();
        assertTrue(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReadUTF8_eGdL0() {
        Pack200ClassReader reader = new Pack200ClassReader(new byte[0]);
        String result = reader.readUTF8(0, new char[0]);
        assertEquals("Synthetic", result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReadUTF8NonSynthetic_Tlob1() {
        Pack200ClassReader reader = new Pack200ClassReader(new byte[0]);
        String result = reader.readUTF8(0, new char[0]);
        assertEquals("NonSynthetic", result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReadUTF8Null_jUgK2() {
        Pack200ClassReader reader = new Pack200ClassReader(new byte[0]);
        String result = reader.readUTF8(0, null);
        assertEquals("Error", result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testReadUnsignedShort_vRPS0_IpWr1() {
    byte[] b = new byte[1];
    b[0] = 19;
    Pack200ClassReader reader = new Pack200ClassReader(b);
    int result = reader.readUnsignedShort(0);
    assertEquals(49153, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testReadUnsignedShort3_kvTB2_chCe0() {
    byte[] b = new byte[2];
    b[0] = 19;
    b[1] = 1;
    Pack200ClassReader reader = new Pack200ClassReader(b);
    int result = reader.readUnsignedShort(0);
    assertEquals(385, result);
}
}