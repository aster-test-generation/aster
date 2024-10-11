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
public class Aster_Pack200ClassReader_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFileName_Xqne0() throws Exception {
        Pack200ClassReader pack200ClassReader = new Pack200ClassReader(new byte[0]);
        String fileName = pack200ClassReader.getFileName();
        assertEquals("", fileName);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReadConst_wJpZ0() throws Exception {
        Pack200ClassReader pack200ClassReader = new Pack200ClassReader(new byte[]{});
        char[] buf = new char[10];
        Object result = pack200ClassReader.readConst(1, buf);
        assertNotNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReadConst2_uIpt1() throws Exception {
        Pack200ClassReader pack200ClassReader = new Pack200ClassReader(new byte[]{});
        char[] buf = new char[10];
        Object result = pack200ClassReader.readConst(2, buf);
        assertNotNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReadConst3_ZJIm2() throws Exception {
        Pack200ClassReader pack200ClassReader = new Pack200ClassReader(new byte[]{});
        char[] buf = new char[10];
        Object result = pack200ClassReader.readConst(3, buf);
        assertNotNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReadConst4_nVXm3() throws Exception {
        Pack200ClassReader pack200ClassReader = new Pack200ClassReader(new byte[]{});
        char[] buf = new char[10];
        Object result = pack200ClassReader.readConst(4, buf);
        assertNotNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReadConst5_vokx4() throws Exception {
        Pack200ClassReader pack200ClassReader = new Pack200ClassReader(new byte[]{});
        char[] buf = new char[10];
        Object result = pack200ClassReader.readConst(5, buf);
        assertNotNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReadConst6_Qume5() throws Exception {
        Pack200ClassReader pack200ClassReader = new Pack200ClassReader(new byte[]{});
        char[] buf = new char[10];
        Object result = pack200ClassReader.readConst(6, buf);
        assertNotNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReadConst7_LhAD6() throws Exception {
        Pack200ClassReader pack200ClassReader = new Pack200ClassReader(new byte[]{});
        char[] buf = new char[10];
        Object result = pack200ClassReader.readConst(7, buf);
        assertNotNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReadConst8_QERv7() throws Exception {
        Pack200ClassReader pack200ClassReader = new Pack200ClassReader(new byte[]{});
        char[] buf = new char[10];
        Object result = pack200ClassReader.readConst(8, buf);
        assertNotNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReadConst9_zuMk8() throws Exception {
        Pack200ClassReader pack200ClassReader = new Pack200ClassReader(new byte[]{});
        char[] buf = new char[10];
        Object result = pack200ClassReader.readConst(9, buf);
        assertNotNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReadConst10_DsWv9() throws Exception {
        Pack200ClassReader pack200ClassReader = new Pack200ClassReader(new byte[]{});
        char[] buf = new char[10];
        Object result = pack200ClassReader.readConst(10, buf);
        assertNotNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReadConst11_XRYC10() throws Exception {
        Pack200ClassReader pack200ClassReader = new Pack200ClassReader(new byte[]{});
        char[] buf = new char[10];
        Object result = pack200ClassReader.readConst(11, buf);
        assertNotNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReadConst12_JARV11() throws Exception {
        Pack200ClassReader pack200ClassReader = new Pack200ClassReader(new byte[]{});
        char[] buf = new char[10];
        Object result = pack200ClassReader.readConst(12, buf);
        assertNotNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReadConst13_QtxK12() throws Exception {
        Pack200ClassReader pack200ClassReader = new Pack200ClassReader(new byte[]{});
        char[] buf = new char[10];
        Object result = pack200ClassReader.readConst(13, buf);
        assertNotNull(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasSyntheticAttributes_gbgg0() throws Exception {
        Pack200ClassReader pack200ClassReader = new Pack200ClassReader(new byte[]{});
        boolean result = pack200ClassReader.hasSyntheticAttributes();
        assertFalse(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testReadUnsignedShort_djgw0() throws Exception {
    Pack200ClassReader pack200ClassReader = new Pack200ClassReader(new byte[]{0, 0});
    int unsignedShort = pack200ClassReader.readUnsignedShort(0);
    assertEquals(0, unsignedShort);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testReadUnsignedShortWithNegativeIndex_YrwH1() throws Exception {
    Pack200ClassReader pack200ClassReader = new Pack200ClassReader(new byte[]{0, 0});
    int unsignedShort = pack200ClassReader.readUnsignedShort(-1);
    assertEquals(Short.MIN_VALUE, unsignedShort);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testReadUnsignedShortWithIndexGreaterThanZero_eVVK2() throws Exception {
    Pack200ClassReader pack200ClassReader = new Pack200ClassReader(new byte[]{19, 0});
    int unsignedShort = pack200ClassReader.readUnsignedShort(1);
    assertEquals(0, unsignedShort);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLastConstantHadWideIndex_mmcw0() throws Exception {
        Pack200ClassReader pack200ClassReader = new Pack200ClassReader(new byte[]{});
        boolean result = pack200ClassReader.lastConstantHadWideIndex();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReadUTF8_UScK0() throws Exception {
        Pack200ClassReader pack200ClassReader = new Pack200ClassReader(new byte[]{});
        char[] charBuffer = new char[10];
        String utf8 = pack200ClassReader.readUTF8(0, charBuffer);
        assertNotNull(utf8);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReadUTF8WithSyntheticAttribute_vnXS1() throws Exception {
        Pack200ClassReader pack200ClassReader = new Pack200ClassReader(new byte[]{});
        char[] charBuffer = new char[10];
        String utf8 = pack200ClassReader.readUTF8(0, charBuffer);
        assertEquals("Synthetic", utf8);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReadUTF8WithNullCharBuffer_rScI2() throws Exception {
        Pack200ClassReader pack200ClassReader = new Pack200ClassReader(new byte[]{});
        String utf8 = pack200ClassReader.readUTF8(0, null);
        assertNotNull(utf8);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReadUTF8WithNegativeOffset_OszD3() throws Exception {
        Pack200ClassReader pack200ClassReader = new Pack200ClassReader(new byte[]{});
        char[] charBuffer = new char[10];
        String utf8 = pack200ClassReader.readUTF8(-1, charBuffer);
        assertNotNull(utf8);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReadUTF8WithOffsetGreaterThanLength_NCXH4() throws Exception {
        Pack200ClassReader pack200ClassReader = new Pack200ClassReader(new byte[]{});
        char[] charBuffer = new char[10];
        String utf8 = pack200ClassReader.readUTF8(10, charBuffer);
        assertNotNull(utf8);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReadUTF8WithOffsetGreaterThanLengthAndCharBufferNull_AuLy6() throws Exception {
        Pack200ClassReader pack200ClassReader = new Pack200ClassReader(new byte[]{});
        String utf8 = pack200ClassReader.readUTF8(10, null);
        assertNotNull(utf8);
    }
}