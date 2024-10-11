/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.zip;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_ZipLong_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPutLong_LbVp0_1() throws Exception {
        byte[] buf = new byte[4];
        ZipLong.putLong(0x12345678L, buf, 0);
        assertEquals(0x78, buf[0] & 0xff);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPutLong_LbVp0_2() throws Exception {
        byte[] buf = new byte[4];
        ZipLong.putLong(0x12345678L, buf, 0);
        assertEquals(0x56, buf[1] & 0xff);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPutLong_LbVp0_3() throws Exception {
        byte[] buf = new byte[4];
        ZipLong.putLong(0x12345678L, buf, 0);
        assertEquals(0x34, buf[2] & 0xff);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPutLong_LbVp0_4() throws Exception {
        byte[] buf = new byte[4];
        ZipLong.putLong(0x12345678L, buf, 0);
        assertEquals(0x12, buf[3] & 0xff);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testEqualsWithObject_yVRv0_1() throws Exception {
		ZipLong zipLong1 = new ZipLong(new byte[]{0, 0, 0, 0}, 0);
		ZipLong zipLong2 = new ZipLong(new byte[]{0, 0, 0, 0}, 0);
		ZipLong zipLong3 = new ZipLong(0);
		assertTrue(zipLong1.equals(zipLong2));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testEqualsWithObject_yVRv0_2() throws Exception {
		ZipLong zipLong1 = new ZipLong(new byte[]{0, 0, 0, 0}, 0);
		ZipLong zipLong2 = new ZipLong(new byte[]{0, 0, 0, 0}, 0);
		ZipLong zipLong3 = new ZipLong(0);
		assertFalse(zipLong1.equals(zipLong3));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testEqualsWithNull_xnGE1() throws Exception {
		ZipLong zipLong = new ZipLong(0);
		assertFalse(zipLong.equals(null));
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testEqualsWithDifferentClass_tYdh2() throws Exception {
		ZipLong zipLong = new ZipLong(0);
		assertFalse(zipLong.equals(new Object()));
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_FBzJ0() throws Exception {
        ZipLong zipLong = new ZipLong(123456789);
        assertEquals("ZipLong value: 123456789", zipLong.toString());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue_kqSA0() throws Exception {
    ZipLong zipLong = new ZipLong(123456789L);
    long value = zipLong.getValue();
    assertEquals(123456789L, value);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue_Zero_tVPi1() throws Exception {
    ZipLong zipLong = new ZipLong(0L);
    long value = zipLong.getValue();
    assertEquals(0L, value);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue_Negative_wiey2() throws Exception {
    ZipLong zipLong = new ZipLong(-123456789L);
    long value = zipLong.getValue();
    assertEquals(-123456789L, value);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue_MaxInt_IZVn3() throws Exception {
    ZipLong zipLong = new ZipLong(Integer.MAX_VALUE);
    long value = zipLong.getValue();
    assertEquals(Integer.MAX_VALUE, value);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue_MinInt_KIKi4() throws Exception {
    ZipLong zipLong = new ZipLong(Integer.MIN_VALUE);
    long value = zipLong.getValue();
    assertEquals(Integer.MIN_VALUE, value);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue_MaxLong_AGxN5() throws Exception {
    ZipLong zipLong = new ZipLong(Long.MAX_VALUE);
    long value = zipLong.getValue();
    assertEquals(Long.MAX_VALUE, value);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBytes_FpZI0() throws Exception {
        ZipLong zipLong = new ZipLong(123456789);
        byte[] expected = { (byte) 0x30, (byte) 0x39, (byte) 0x01, (byte) 0x00 };
        assertArrayEquals(expected, zipLong.getBytes());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBytes2_NwLs1() throws Exception {
        ZipLong zipLong = new ZipLong(0x12345678);
        byte[] expected = { (byte) 0x78, (byte) 0x56, (byte) 0x34, (byte) 0x12 };
        assertArrayEquals(expected, zipLong.getBytes());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBytes3_bwWc2() throws Exception {
        ZipLong zipLong = new ZipLong(0xFFFFFFFFL);
        byte[] expected = { (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF };
        assertArrayEquals(expected, zipLong.getBytes());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBytes4_SmcM3() throws Exception {
        ZipLong zipLong = new ZipLong(0x0);
        byte[] expected = { (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00 };
        assertArrayEquals(expected, zipLong.getBytes());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBytes5_rApK4() throws Exception {
        ZipLong zipLong = new ZipLong(0x7FFFFFFFFFFFFFFFL);
        byte[] expected = { (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0x7F, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF };
        assertArrayEquals(expected, zipLong.getBytes());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBytes6_EXuP5() throws Exception {
        ZipLong zipLong = new ZipLong(0x800000000000000L);
        byte[] expected = { (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x80, (byte) 0x00, (byte) 0x00, (byte) 0x00 };
        assertArrayEquals(expected, zipLong.getBytes());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBytes7_ASgP6() throws Exception {
        ZipLong zipLong = new ZipLong(0x1234567890ABCDEFL);
        byte[] expected = { (byte) 0xEF, (byte) 0xCD, (byte) 0xAB, (byte) 0x90, (byte) 0x78, (byte) 0x56, (byte) 0x34, (byte) 0x12 };
        assertArrayEquals(expected, zipLong.getBytes());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBytes8_esVc7() throws Exception {
        ZipLong zipLong = new ZipLong(0xFEDCBA987654321L);
        byte[] expected = { (byte) 0x21, (byte) 0x32, (byte) 0x54, (byte) 0x76, (byte) 0x98, (byte) 0x7A, (byte) 0xBD, (byte) 0xFE };
        assertArrayEquals(expected, zipLong.getBytes());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testGetValueBytesInt_XgyW0() throws Exception {
        ZipLong zipLong = new ZipLong(new byte[] { 0, 0, 0, 0 }, 0);
        assertEquals(0, ZipLong.getValue(zipLong.getBytes(), 0));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testGetValueInt_NdjE1() throws Exception {
        ZipLong zipLong = new ZipLong(0);
        assertEquals(0, ZipLong.getValue(zipLong.getBytes()));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testGetValueLong_puMz2() throws Exception {
        ZipLong zipLong = new ZipLong(0L);
        assertEquals(0, ZipLong.getValue(zipLong.getBytes()));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testGetValueBytes_Armj3() throws Exception {
        ZipLong zipLong = new ZipLong(new byte[] { 0, 0, 0, 0 });
        assertEquals(0, ZipLong.getValue(zipLong.getBytes()));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetIntValue_oAfO0_1() throws Exception {
        ZipLong zipLong = new ZipLong(new byte[]{0, 0, 0, 0});
        zipLong = new ZipLong(1);
        zipLong = new ZipLong(Integer.MAX_VALUE);
        zipLong = new ZipLong(Integer.MIN_VALUE);
        assertEquals(0, zipLong.getIntValue());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetIntValue_oAfO0_2() throws Exception {
        ZipLong zipLong = new ZipLong(new byte[]{0, 0, 0, 0});
        zipLong = new ZipLong(1);
        zipLong = new ZipLong(Integer.MAX_VALUE);
        zipLong = new ZipLong(Integer.MIN_VALUE);
        assertEquals(1, zipLong.getIntValue());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetIntValue_oAfO0_3() throws Exception {
        ZipLong zipLong = new ZipLong(new byte[]{0, 0, 0, 0});
        zipLong = new ZipLong(1);
        zipLong = new ZipLong(Integer.MAX_VALUE);
        zipLong = new ZipLong(Integer.MIN_VALUE);
        assertEquals(Integer.MAX_VALUE, zipLong.getIntValue());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetIntValue_oAfO0_4() throws Exception {
        ZipLong zipLong = new ZipLong(new byte[]{0, 0, 0, 0});
        zipLong = new ZipLong(1);
        zipLong = new ZipLong(Integer.MAX_VALUE);
        zipLong = new ZipLong(Integer.MIN_VALUE);
        assertEquals(Integer.MIN_VALUE, zipLong.getIntValue());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCode_SYnB0_1() throws Exception {
        ZipLong zipLong1 = new ZipLong(new byte[]{0, 0, 0, 0}, 0);
        ZipLong zipLong2 = new ZipLong(0);
        ZipLong zipLong3 = new ZipLong(0L);
        ZipLong zipLong4 = new ZipLong(new byte[]{0, 0, 0, 0});
        assertEquals(zipLong1.hashCode(), zipLong2.hashCode());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCode_SYnB0_2() throws Exception {
        ZipLong zipLong1 = new ZipLong(new byte[]{0, 0, 0, 0}, 0);
        ZipLong zipLong2 = new ZipLong(0);
        ZipLong zipLong3 = new ZipLong(0L);
        ZipLong zipLong4 = new ZipLong(new byte[]{0, 0, 0, 0});
        assertEquals(zipLong1.hashCode(), zipLong3.hashCode());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCode_SYnB0_3() throws Exception {
        ZipLong zipLong1 = new ZipLong(new byte[]{0, 0, 0, 0}, 0);
        ZipLong zipLong2 = new ZipLong(0);
        ZipLong zipLong3 = new ZipLong(0L);
        ZipLong zipLong4 = new ZipLong(new byte[]{0, 0, 0, 0});
        assertEquals(zipLong1.hashCode(), zipLong4.hashCode());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytesFromInt_avwE0() throws Exception {
    final int value = 123456789;
    final byte[] expected = { (byte) 0x59, (byte) 0xCD, (byte) 0x34, (byte) 0x12 };
    final byte[] actual = ZipLong.getBytes(value);
    assertArrayEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytesFromLong_mhVy2() throws Exception {
    final long value = 123456789012345678L;
    final byte[] expected = { (byte) 0x79, (byte) 0xCD, (byte) 0x34, (byte) 0x12, (byte) 0x56, (byte) 0x78, (byte) 0x9a, (byte) 0xbc };
    final byte[] actual = ZipLong.getBytes(value);
    assertArrayEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testClone_KpAo0_1() throws Exception {
        ZipLong zipLong = new ZipLong(new byte[]{1, 2, 3, 4}, 0);
        ZipLong clone = (ZipLong) zipLong.clone();
        assertNotSame(zipLong, clone);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testClone_KpAo0_2() throws Exception {
        ZipLong zipLong = new ZipLong(new byte[]{1, 2, 3, 4}, 0);
        ZipLong clone = (ZipLong) zipLong.clone();
        assertEquals(zipLong.getValue(), clone.getValue());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValue_MTvh0() throws Exception {
        ZipLong zipLong = new ZipLong(new byte[]{0, 0, 0, 0});
        long value = ZipLong.getValue(zipLong.getBytes(), 0);
        assertEquals(0, value);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValue2_pzVV1() throws Exception {
        ZipLong zipLong = new ZipLong(1);
        long value = ZipLong.getValue(zipLong.getBytes(), 0);
        assertEquals(1, value);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValue3_jFGI2() throws Exception {
        ZipLong zipLong = new ZipLong(Integer.MAX_VALUE);
        long value = ZipLong.getValue(zipLong.getBytes(), 0);
        assertEquals(Integer.MAX_VALUE, value);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValue4_RwWh3() throws Exception {
        ZipLong zipLong = new ZipLong(Long.MAX_VALUE);
        long value = ZipLong.getValue(zipLong.getBytes(), 0);
        assertEquals(Long.MAX_VALUE, value);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValue5_SciR4() throws Exception {
        ZipLong zipLong = new ZipLong(Long.MIN_VALUE);
        long value = ZipLong.getValue(zipLong.getBytes(), 0);
        assertEquals(Long.MIN_VALUE, value);
    }
}