/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.zip;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_ZipLong_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsSameObject_gXJE0() {
    ZipLong zipLong1 = new ZipLong(1L);
    ZipLong zipLong2 = zipLong1;
    boolean result = zipLong1.equals(zipLong2);
    assert result;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsDifferentObject_qVZx1() {
    ZipLong zipLong1 = new ZipLong(1L);
    ZipLong zipLong2 = new ZipLong(2L);
    boolean result = zipLong1.equals(zipLong2);
    assert !result;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsNull_rtUY2() {
    ZipLong zipLong = new ZipLong(1L);
    boolean result = zipLong.equals(null);
    assert !result;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithIntValue_CcQt1() {
        ZipLong zipLong = new ZipLong(10);
        String result = zipLong.toString();
        assert result.equals("ZipLong value: 10");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithLongValue_mGLQ2() {
        ZipLong zipLong = new ZipLong(10L);
        String result = zipLong.toString();
        assert result.equals("ZipLong value: 10");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueWithLongValue_Bhuf0() {
        ZipLong zipLong = new ZipLong(10L);
        assertEquals(10L, zipLong.getValue());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueWithByteValue_tjcT1() {
        ZipLong zipLong = new ZipLong((byte) 10);
        assertEquals(10L, zipLong.getValue());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBytesWithLongValue_edxP0() {
        ZipLong zipLong = new ZipLong(123456789L);
        byte[] bytes = zipLong.getBytes();
        byte[] expectedBytes = ZipLong.getBytes(123456789L);
        assertArrayEquals(expectedBytes, bytes);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBytesWithIntValue_Tsmb1() {
        ZipLong zipLong = new ZipLong(123456789);
        byte[] bytes = zipLong.getBytes();
        byte[] expectedBytes = ZipLong.getBytes(123456789);
        assertArrayEquals(expectedBytes, bytes);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCodeBytesOffset_JCMS0() {
        ZipLong zipLong = new ZipLong(new byte[10], 0);
        assertEquals(0, zipLong.hashCode());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCodeInt_nxsV1() {
        ZipLong zipLong = new ZipLong(10);
        assertEquals(10, zipLong.hashCode());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCodeLong_VVPR2() {
        ZipLong zipLong = new ZipLong(10L);
        assertEquals(10, zipLong.hashCode());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCodeBytes_bzMC3() {
        ZipLong zipLong = new ZipLong(new byte[10]);
        assertEquals(0, zipLong.hashCode());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetIntValueWithLongValue_vpuM1() {
        ZipLong zipLong = new ZipLong(10L);
        assertEquals(10, zipLong.getIntValue());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetIntValueWithIntValue_uNTh2() {
        ZipLong zipLong = new ZipLong(10);
        assertEquals(10, zipLong.getIntValue());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValueBytesNull_SLRa4() {
    byte[] bytes = null;
    try {
        ZipLong.getValue(bytes);
        Assertions.fail("Expected NullPointerException");
    } catch (NullPointerException e) {
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValueBytesOffsetOutOfRange_fqxg6() {
    byte[] bytes = new byte[] {1, 2, 3, 4, 5};
    try {
        ZipLong.getValue(bytes, 5);
        Assertions.fail("Expected IndexOutOfBoundsException");
    } catch (IndexOutOfBoundsException e) {
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValueBytesOffsetNegative_Usub7() {
    byte[] bytes = new byte[] {1, 2, 3, 4, 5};
    try {
        ZipLong.getValue(bytes, -1);
        Assertions.fail("Expected IndexOutOfBoundsException");
    } catch (IndexOutOfBoundsException e) {
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValueBytesOffsetLarge_aMap8() {
    byte[] bytes = new byte[] {1, 2, 3, 4, 5};
    try {
        ZipLong.getValue(bytes, 6);
        Assertions.fail("Expected IndexOutOfBoundsException");
    } catch (IndexOutOfBoundsException e) {
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytes0_jdgw0() {
    byte[] result = ZipLong.getBytes(0);
    assert Arrays.equals(result, new byte[]{0, 0, 0, 0});
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testClone_xxjX0() {
        ZipLong zipLong = new ZipLong(new byte[10], 0);
        Object clone = zipLong.clone();
        assert clone instanceof ZipLong;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCloneInt_NNRB1() {
        ZipLong zipLong = new ZipLong(10);
        Object clone = zipLong.clone();
        assert clone instanceof ZipLong;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCloneLong_VjMF2() {
        ZipLong zipLong = new ZipLong(10L);
        Object clone = zipLong.clone();
        assert clone instanceof ZipLong;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCloneByte_mIjD3() {
        ZipLong zipLong = new ZipLong(new byte[10]);
        Object clone = zipLong.clone();
        assert clone instanceof ZipLong;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValue_EScJ0() {
        byte[] bytes = new byte[]{0x01, 0x02, 0x03, 0x04};
        int offset = 0;
        long expectedValue = 0x04030201L;
        long actualValue = ZipLong.getValue(bytes, offset);
        assertEquals(expectedValue, actualValue);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPutLong1_gqOJ1() {
        ZipLong zipLong = new ZipLong(0);
        byte[] buf = new byte[8];
        zipLong.putLong(0, buf, 0);
        assertArrayEquals(new byte[]{0, 0, 0, 0, 0, 0, 0, 0}, buf);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPutLong2_ITYZ2() {
        ZipLong zipLong = new ZipLong(1);
        byte[] buf = new byte[8];
        zipLong.putLong(1, buf, 0);
        assertArrayEquals(new byte[]{1, 0, 0, 0, 0, 0, 0, 0}, buf);
    }
}