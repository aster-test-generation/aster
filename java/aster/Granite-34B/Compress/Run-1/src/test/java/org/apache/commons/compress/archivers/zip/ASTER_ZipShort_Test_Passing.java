/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.zip;
import org.apache.commons.compress.utils.ByteUtils;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_ZipShort_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testEquals_true_dGjj0() {
		ZipShort zipShort1 = new ZipShort(new byte[] { 0x01, 0x02 }, 0);
		ZipShort zipShort2 = new ZipShort(new byte[] { 0x01, 0x02 }, 0);
		assertTrue(zipShort1.equals(zipShort2));
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testEquals_false_QkCK1() {
		ZipShort zipShort1 = new ZipShort(new byte[] { 0x01, 0x02 }, 0);
		ZipShort zipShort2 = new ZipShort(new byte[] { 0x02, 0x03 }, 0);
		assertFalse(zipShort1.equals(zipShort2));
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testEquals_null_ioUI2() {
		ZipShort zipShort1 = new ZipShort(new byte[] { 0x01, 0x02 }, 0);
		assertFalse(zipShort1.equals(null));
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPutShort_khRK0_1() {
        byte[] buf = new byte[2];
        int value = 0;
        int offset = 0;
        ZipShort.putShort(value, buf, offset);
        assertEquals(0, buf[0] & 0xFF);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPutShort_khRK0_2() {
        byte[] buf = new byte[2];
        int value = 0;
        int offset = 0;
        ZipShort.putShort(value, buf, offset);
        assertEquals(0, buf[1] & 0xFF);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPutShort1_IYtg1_1() {
        byte[] buf = new byte[2];
        int value = 1;
        int offset = 0;
        ZipShort.putShort(value, buf, offset);
        assertEquals(1, buf[0] & 0xFF);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPutShort1_IYtg1_2() {
        byte[] buf = new byte[2];
        int value = 1;
        int offset = 0;
        ZipShort.putShort(value, buf, offset);
        assertEquals(0, buf[1] & 0xFF);}
@Test
@Timeout(value =0, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPutShort2_mAkc2_1() {
        byte[] buf = new byte[2];
        int value = 256;
        int offset = 0;
        ZipShort.putShort(value, buf, offset);
        assertEquals(1, buf[0] & 0xFF);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPutShort3_gYbN3_1() {
        byte[] buf = new byte[2];
        int value = 65535;
        int offset = 0;
        ZipShort.putShort(value, buf, offset);
        assertEquals(255, buf[0] & 0xFF);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPutShort3_gYbN3_2() {
        byte[] buf = new byte[2];
        int value = 65535;
        int offset = 0;
        ZipShort.putShort(value, buf, offset);
        assertEquals(255, buf[1] & 0xFF);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getValueTest1_dpJS0() {
        ZipShort zipShort = new ZipShort(new byte[]{0x01, 0x02}, 0);
        int actual = zipShort.getValue();
        int expected = 0x0201;
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getValueTest2_MIun1() {
        ZipShort zipShort = new ZipShort(0x0102);
        int actual = zipShort.getValue();
        int expected = 0x0102;
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getValueTest3_bfdT2() {
        ZipShort zipShort = new ZipShort(new byte[]{0x01, 0x02});
        int actual = zipShort.getValue();
        int expected = 0x0201;
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytes_nmsh0() {
    ZipShort zipShort = new ZipShort(new byte[] {0x01, 0x02}, 0);
    byte[] result = zipShort.getBytes();
    byte[] expected = new byte[] {0x01, 0x02};
    assertArrayEquals(expected, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytes2_hwzF1() {
    ZipShort zipShort = new ZipShort(0x0102);
    byte[] result = zipShort.getBytes();
    byte[] expected = new byte[] {0x01, 0x02};
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytes3_Ezpm2() {
    ZipShort zipShort = new ZipShort(new byte[] {0x01, 0x02});
    byte[] result = zipShort.getBytes();
    byte[] expected = new byte[] {0x01, 0x02};
    assertArrayEquals(expected, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_waCo0() {
        ZipShort zipShort = new ZipShort(new byte[] {0x01, 0x02}, 0);
        assertEquals("ZipShort value: 513", zipShort.toString());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_obvg1() {
        ZipShort zipShort = new ZipShort(0x0102);
        assertEquals("ZipShort value: 258", zipShort.toString());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_qQTy2() {
        ZipShort zipShort = new ZipShort(new byte[] {0x01, 0x02});
        assertEquals("ZipShort value: 513", zipShort.toString());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testClone_pcIG0_1() {
		ZipShort zipShort = new ZipShort(new byte[] {0, 1}, 0);
		ZipShort clone = (ZipShort) zipShort.clone();
		assertNotNull(clone);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testClone_pcIG0_2() {
		ZipShort zipShort = new ZipShort(new byte[] {0, 1}, 0);
		ZipShort clone = (ZipShort) zipShort.clone();
		assertEquals(clone.getClass(), zipShort.getClass());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testClone_pcIG0_3() {
		ZipShort zipShort = new ZipShort(new byte[] {0, 1}, 0);
		ZipShort clone = (ZipShort) zipShort.clone();
		assertEquals(clone, zipShort);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytesWithIntValue_Psco0() {
    byte[] expected = new byte[] {0, 1};
    byte[] actual = ZipShort.getBytes(1);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytesWithIntValueZero_pauH1() {
    byte[] expected = new byte[] {0, 0};
    byte[] actual = ZipShort.getBytes(0);
    assertArrayEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytesWithIntValueMax_tFdj2() {
    byte[] expected = new byte[] {-1, -1};
    byte[] actual = ZipShort.getBytes(65535);
    assertArrayEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytesWithIntValueMin_vMjU3() {
    byte[] expected = new byte[] {0, 0};
    byte[] actual = ZipShort.getBytes(-65536);
    assertArrayEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytesWithIntValueRandom_sTzV4() {
    byte[] expected = new byte[] {10, -5};
    byte[] actual = ZipShort.getBytes(2555);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytesWithIntValueNegative_wphk5() {
    byte[] expected = new byte[] {10, 111};
    byte[] actual = ZipShort.getBytes(-23957);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCode_vGsj0_3() {
        ZipShort zipShort1 = new ZipShort(new byte[]{0x01, 0x02}, 0);
        ZipShort zipShort2 = new ZipShort(0x0102);
        ZipShort zipShort3 = new ZipShort(new byte[]{0x01, 0x02});
        assertEquals(zipShort1.hashCode(), zipShort3.hashCode());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void getValueTest1_ETXL0() {
		byte[] bytes = new byte[2];
		int offset = 0;
		int expected = (int) ByteUtils.fromLittleEndian(bytes, offset, 2);
		int actual = ZipShort.getValue(bytes, offset);
		assertEquals(expected, actual);
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCode_YubL1_ZUMT0_1() {
        ZipShort zipShort1 = new ZipShort(new byte[]{0x01, 0x02}, 0);
        ZipShort zipShort2 = new ZipShort(0x0102);
        ZipShort zipShort3 = new ZipShort(new byte[]{0x01, 0x02});
        assertEquals(zipShort1.getValue(), zipShort1.hashCode());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCode_YubL1_ZUMT0_2() {
        ZipShort zipShort1 = new ZipShort(new byte[]{0x01, 0x02}, 0);
        ZipShort zipShort2 = new ZipShort(0x0102);
        ZipShort zipShort3 = new ZipShort(new byte[]{0x01, 0x02});
        assertEquals(zipShort2.getValue(), zipShort2.hashCode());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCode_YubL1_ZUMT0_3() {
        ZipShort zipShort1 = new ZipShort(new byte[]{0x01, 0x02}, 0);
        ZipShort zipShort2 = new ZipShort(0x0102);
        ZipShort zipShort3 = new ZipShort(new byte[]{0x01, 0x02});
        assertEquals(zipShort3.getValue(), zipShort3.hashCode());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPutShort_khRK0() {
        byte[] buf = new byte[2];
        int value = 0;
        int offset = 0;
        ZipShort.putShort(value, buf, offset);
        assertEquals(0, buf[0] & 0xFF);
        assertEquals(0, buf[1] & 0xFF);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPutShort1_IYtg1() {
        byte[] buf = new byte[2];
        int value = 1;
        int offset = 0;
        ZipShort.putShort(value, buf, offset);
        assertEquals(1, buf[0] & 0xFF);
        assertEquals(0, buf[1] & 0xFF);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testClone_pcIG0() {
		ZipShort zipShort = new ZipShort(new byte[] {0, 1}, 0);
		ZipShort clone = (ZipShort) zipShort.clone();
		assertNotNull(clone);
		assertEquals(clone.getClass(), zipShort.getClass());
		assertEquals(clone, zipShort);
	}
}