/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.pack200;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_Pack200ClassReader_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFileName_BvRs0() {
        Pack200ClassReader pack200ClassReader = new Pack200ClassReader(new byte[]{});
        String fileName = pack200ClassReader.getFileName();
        assertNotNull(fileName);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetFileName_HjrK0() {
        Pack200ClassReader pack200ClassReader = new Pack200ClassReader(new byte[]{});
        pack200ClassReader.setFileName("example.txt");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReadConst1_eOgb0() {
        Pack200ClassReader pack200ClassReader = new Pack200ClassReader(new byte[]{});
        char[] buf = new char[1];
        Object result = pack200ClassReader.readConst(1, buf);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReadConst2_fFea1() {
        Pack200ClassReader pack200ClassReader = new Pack200ClassReader(new byte[]{});
        char[] buf = new char[2];
        Object result = pack200ClassReader.readConst(2, buf);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasSyntheticAttributes_Lsdk0() {
        Pack200ClassReader pack200ClassReader = new Pack200ClassReader(new byte[]{});
        boolean result = pack200ClassReader.hasSyntheticAttributes();
        assertTrue(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReadUnsignedShort_qLBQ0() {
        Pack200ClassReader pack200ClassReader = new Pack200ClassReader(new byte[]{});
        int unsignedShort = pack200ClassReader.readUnsignedShort(0);
        assertEquals(0, unsignedShort);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReadUnsignedShort2_zYPu1() {
        Pack200ClassReader pack200ClassReader = new Pack200ClassReader(new byte[]{19});
        int unsignedShort = pack200ClassReader.readUnsignedShort(0);
        assertEquals(0, unsignedShort);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReadUnsignedShort3_hdxN2() {
        Pack200ClassReader pack200ClassReader = new Pack200ClassReader(new byte[]{0, 0});
        int unsignedShort = pack200ClassReader.readUnsignedShort(0);
        assertEquals(0, unsignedShort);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReadUnsignedShort4_KdPe3() {
        Pack200ClassReader pack200ClassReader = new Pack200ClassReader(new byte[]{0, 19});
        int unsignedShort = pack200ClassReader.readUnsignedShort(0);
        assertEquals(0, unsignedShort);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReadUnsignedShort5_CEbw4() {
        Pack200ClassReader pack200ClassReader = new Pack200ClassReader(new byte[]{19, 0});
        int unsignedShort = pack200ClassReader.readUnsignedShort(0);
        assertEquals(0, unsignedShort);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReadUnsignedShort6_CuVT5() {
        Pack200ClassReader pack200ClassReader = new Pack200ClassReader(new byte[]{19, 19});
        int unsignedShort = pack200ClassReader.readUnsignedShort(0);
        assertEquals(0, unsignedShort);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReadUnsignedShort7_nqQB6() {
        Pack200ClassReader pack200ClassReader = new Pack200ClassReader(new byte[]{0, 0, 0});
        int unsignedShort = pack200ClassReader.readUnsignedShort(0);
        assertEquals(0, unsignedShort);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReadUnsignedShort8_tIBU7() {
        Pack200ClassReader pack200ClassReader = new Pack200ClassReader(new byte[]{0, 0, 19});
        int unsignedShort = pack200ClassReader.readUnsignedShort(0);
        assertEquals(0, unsignedShort);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReadUnsignedShort9_HvXG8() {
        Pack200ClassReader pack200ClassReader = new Pack200ClassReader(new byte[]{0, 19, 0});
        int unsignedShort = pack200ClassReader.readUnsignedShort(0);
        assertEquals(0, unsignedShort);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReadUnsignedShort10_Kcpj9() {
        Pack200ClassReader pack200ClassReader = new Pack200ClassReader(new byte[]{0, 19, 19});
        int unsignedShort = pack200ClassReader.readUnsignedShort(0);
        assertEquals(0, unsignedShort);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReadUnsignedShort11_TgWi10() {
        Pack200ClassReader pack200ClassReader = new Pack200ClassReader(new byte[]{19, 0, 0});
        int unsignedShort = pack200ClassReader.readUnsignedShort(0);
        assertEquals(0, unsignedShort);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReadUnsignedShort12_QmoM11() {
        Pack200ClassReader pack200ClassReader = new Pack200ClassReader(new byte[]{19, 0, 19});
        int unsignedShort = pack200ClassReader.readUnsignedShort(0);
        assertEquals(0, unsignedShort);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReadUnsignedShort13_zhtd12() {
        Pack200ClassReader pack200ClassReader = new Pack200ClassReader(new byte[]{19, 19, 0});
        int unsignedShort = pack200ClassReader.readUnsignedShort(0);
        assertEquals(0, unsignedShort);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testLastConstantHadWideIndex_prAl0() {
		Pack200ClassReader pack200ClassReader = new Pack200ClassReader(new byte[0]);
		boolean result = pack200ClassReader.lastConstantHadWideIndex();
		Assertions.assertFalse(result);
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReadUTF8_1_OwuV0() {
        Pack200ClassReader pack200ClassReader = new Pack200ClassReader(new byte[]{});
        char[] charArray = new char[10];
        String utf8 = pack200ClassReader.readUTF8(0, charArray);
        assertNotNull(utf8);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReadUTF8_2_QdRx1() {
        Pack200ClassReader pack200ClassReader = new Pack200ClassReader(new byte[]{});
        char[] charArray = new char[10];
        String utf8 = pack200ClassReader.readUTF8(10, charArray);
        assertEquals("", utf8);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReadUTF8_3_FlWH2() {
        Pack200ClassReader pack200ClassReader = new Pack200ClassReader(new byte[]{});
        char[] charArray = new char[10];
        String utf8 = pack200ClassReader.readUTF8(20, charArray);
        assertEquals("", utf8);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReadUTF8_4_ymeT3() {
        Pack200ClassReader pack200ClassReader = new Pack200ClassReader(new byte[]{});
        char[] charArray = new char[10];
        String utf8 = pack200ClassReader.readUTF8(30, charArray);
        assertEquals("", utf8);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReadUTF8_5_kIty4() {
        Pack200ClassReader pack200ClassReader = new Pack200ClassReader(new byte[]{});
        char[] charArray = new char[10];
        String utf8 = pack200ClassReader.readUTF8(40, charArray);
        assertEquals("", utf8);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReadUTF8_6_fZRo5() {
        Pack200ClassReader pack200ClassReader = new Pack200ClassReader(new byte[]{});
        char[] charArray = new char[10];
        String utf8 = pack200ClassReader.readUTF8(50, charArray);
        assertEquals("", utf8);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReadUTF8_7_QkTm6() {
        Pack200ClassReader pack200ClassReader = new Pack200ClassReader(new byte[]{});
        char[] charArray = new char[10];
        String utf8 = pack200ClassReader.readUTF8(60, charArray);
        assertEquals("", utf8);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReadUTF8_8_HWyx7() {
        Pack200ClassReader pack200ClassReader = new Pack200ClassReader(new byte[]{});
        char[] charArray = new char[10];
        String utf8 = pack200ClassReader.readUTF8(70, charArray);
        assertEquals("", utf8);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReadUTF8_9_VhDj8() {
        Pack200ClassReader pack200ClassReader = new Pack200ClassReader(new byte[]{});
        char[] charArray = new char[10];
        String utf8 = pack200ClassReader.readUTF8(80, charArray);
        assertEquals("", utf8);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReadUTF8_10_bHpy9() {
        Pack200ClassReader pack200ClassReader = new Pack200ClassReader(new byte[]{});
        char[] charArray = new char[10];
        String utf8 = pack200ClassReader.readUTF8(90, charArray);
        assertEquals("", utf8);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReadUTF8_11_XogZ10() {
        Pack200ClassReader pack200ClassReader = new Pack200ClassReader(new byte[]{});
        char[] charArray = new char[10];
        String utf8 = pack200ClassReader.readUTF8(100, charArray);
        assertEquals("", utf8);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReadUTF8_12_gfJa11() {
        Pack200ClassReader pack200ClassReader = new Pack200ClassReader(new byte[]{});
        char[] charArray = new char[10];
        String utf8 = pack200ClassReader.readUTF8(110, charArray);
        assertEquals("", utf8);
    }
}