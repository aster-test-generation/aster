/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.zip;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_ZipShort_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testEqualsWithObject_FsZh0_1() throws Exception {
		ZipShort zipShort1 = new ZipShort(new byte[]{1, 2}, 0);
		ZipShort zipShort2 = new ZipShort(new byte[]{1, 2}, 0);
		ZipShort zipShort3 = new ZipShort(new byte[]{3, 4}, 0);
		assertTrue(zipShort1.equals(zipShort2));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testEqualsWithObject_FsZh0_2() throws Exception {
		ZipShort zipShort1 = new ZipShort(new byte[]{1, 2}, 0);
		ZipShort zipShort2 = new ZipShort(new byte[]{1, 2}, 0);
		ZipShort zipShort3 = new ZipShort(new byte[]{3, 4}, 0);
		assertFalse(zipShort1.equals(zipShort3));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testEqualsWithValue_jONx1_1() throws Exception {
		ZipShort zipShort1 = new ZipShort(100);
		ZipShort zipShort2 = new ZipShort(100);
		ZipShort zipShort3 = new ZipShort(200);
		assertTrue(zipShort1.equals(100));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testEqualsWithValue_jONx1_2() throws Exception {
		ZipShort zipShort1 = new ZipShort(100);
		ZipShort zipShort2 = new ZipShort(100);
		ZipShort zipShort3 = new ZipShort(200);
		assertFalse(zipShort1.equals(zipShort3));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testEqualsWithBytes_mDXO2_1() throws Exception {
		ZipShort zipShort1 = new ZipShort(new byte[]{1, 2});
		ZipShort zipShort2 = new ZipShort(new byte[]{1, 2});
		ZipShort zipShort3 = new ZipShort(new byte[]{3, 4});
		assertTrue(zipShort1.equals(new byte[]{1, 2}));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testEqualsWithBytes_mDXO2_2() throws Exception {
		ZipShort zipShort1 = new ZipShort(new byte[]{1, 2});
		ZipShort zipShort2 = new ZipShort(new byte[]{1, 2});
		ZipShort zipShort3 = new ZipShort(new byte[]{3, 4});
		assertFalse(zipShort1.equals(zipShort3));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testPutShort_KSJe0_1() throws Exception {
		byte[] buf = new byte[2];
		ZipShort.putShort(1, buf, 0);
		assertEquals(1, buf[0] & 0xff);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testPutShort_KSJe0_2() throws Exception {
		byte[] buf = new byte[2];
		ZipShort.putShort(1, buf, 0);
		assertEquals(0, buf[1] & 0xff);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_zhAz0() throws Exception {
        ZipShort zipShort = new ZipShort(10);
        assertEquals("ZipShort value: 10", zipShort.toString());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithOffset_NmKi1() throws Exception {
        byte[] bytes = {0, 0, 10, 0};
        ZipShort zipShort = new ZipShort(bytes, 2);
        assertEquals("ZipShort value: 10", zipShort.toString());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithArray_sJQZ2() throws Exception {
        byte[] bytes = {10, 0};
        ZipShort zipShort = new ZipShort(bytes);
        assertEquals("ZipShort value: 10", zipShort.toString());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithNegativeValue_TRyf3() throws Exception {
        ZipShort zipShort = new ZipShort(-10);
        assertEquals("ZipShort value: -10", zipShort.toString());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithZeroValue_vwch4() throws Exception {
        ZipShort zipShort = new ZipShort(0);
        assertEquals("ZipShort value: 0", zipShort.toString());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithMaxValue_pJWd5() throws Exception {
        ZipShort zipShort = new ZipShort(Short.MAX_VALUE);
        assertEquals("ZipShort value: 32767", zipShort.toString());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithMinValue_NcYA6() throws Exception {
        ZipShort zipShort = new ZipShort(Short.MIN_VALUE);
        assertEquals("ZipShort value: -32768", zipShort.toString());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValue_LCpr0_1() throws Exception {
        ZipShort zipShort = new ZipShort(new byte[]{(byte) 0x01, (byte) 0x02}, 0);
        zipShort = new ZipShort(0x0102);
        zipShort = new ZipShort(new byte[]{(byte) 0xFF, (byte) 0xFF});
        assertEquals(258, zipShort.getValue());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValue_LCpr0_3() throws Exception {
        ZipShort zipShort = new ZipShort(new byte[]{(byte) 0x01, (byte) 0x02}, 0);
        zipShort = new ZipShort(0x0102);
        zipShort = new ZipShort(new byte[]{(byte) 0xFF, (byte) 0xFF});
        assertEquals(-1, zipShort.getValue());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBytes_cHZm0() throws Exception {
        ZipShort zipShort = new ZipShort(10);
        byte[] expected = {10, 0};
        byte[] actual = zipShort.getBytes();
        assertArrayEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueBytesOffset_jyzw0() throws Exception {
        byte[] bytes = new byte[2];
        int offset = 0;
        int expected = 0;
        int actual = ZipShort.getValue(bytes, offset);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueBytes_LNTe2() throws Exception {
        byte[] bytes = new byte[2];
        int expected = 0;
        int actual = ZipShort.getValue(bytes);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCode_Iyfn0_1() throws Exception {
        ZipShort zipShort1 = new ZipShort(new byte[]{0, 1}, 0);
        ZipShort zipShort2 = new ZipShort(1);
        ZipShort zipShort3 = new ZipShort(new byte[]{0, 1});
        assertEquals(zipShort1.hashCode(), zipShort2.hashCode());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCode_Iyfn0_2() throws Exception {
        ZipShort zipShort1 = new ZipShort(new byte[]{0, 1}, 0);
        ZipShort zipShort2 = new ZipShort(1);
        ZipShort zipShort3 = new ZipShort(new byte[]{0, 1});
        assertEquals(zipShort1.hashCode(), zipShort3.hashCode());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBytesInt_BrxQ0_1() throws Exception {
        ZipShort zipShort = new ZipShort(10);
        byte[] bytes = ZipShort.getBytes(10);
        assertEquals(2, bytes.length);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBytesInt_BrxQ0_2() throws Exception {
        ZipShort zipShort = new ZipShort(10);
        byte[] bytes = ZipShort.getBytes(10);
        assertEquals(10, bytes[0] & 0xff);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBytesInt_BrxQ0_3() throws Exception {
        ZipShort zipShort = new ZipShort(10);
        byte[] bytes = ZipShort.getBytes(10);
        assertEquals(0, bytes[1] & 0xff);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPutShortIntByteArrayInt_OdNi3_1() throws Exception {
        byte[] bytes = new byte[4];
        ZipShort.putShort(10, bytes, 2);
        assertEquals(2, bytes.length);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPutShortIntByteArrayInt_OdNi3_2() throws Exception {
        byte[] bytes = new byte[4];
        ZipShort.putShort(10, bytes, 2);
        assertEquals(0, bytes[0] & 0xff);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPutShortIntByteArrayInt_OdNi3_3() throws Exception {
        byte[] bytes = new byte[4];
        ZipShort.putShort(10, bytes, 2);
        assertEquals(10, bytes[1] & 0xff);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPutShortIntByteArrayInt_OdNi3_4() throws Exception {
        byte[] bytes = new byte[4];
        ZipShort.putShort(10, bytes, 2);
        assertEquals(0, bytes[2] & 0xff);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPutShortIntByteArrayInt_OdNi3_5() throws Exception {
        byte[] bytes = new byte[4];
        ZipShort.putShort(10, bytes, 2);
        assertEquals(0, bytes[3] & 0xff);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValue_sjIO4() throws Exception {
        ZipShort zipShort = new ZipShort(10);
        assertEquals(10, zipShort.getValue());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueByteArrayInt_Hfjk5() throws Exception {
        byte[] bytes = new byte[4];
        ZipShort.putShort(10, bytes, 2);
        ZipShort zipShort = new ZipShort(bytes, 2);
        assertEquals(10, zipShort.getValue());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueByteArray_MMRx6() throws Exception {
        byte[] bytes = new byte[2];
        ZipShort zipShort = new ZipShort(bytes);
        assertEquals(0, zipShort.getValue());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testClone_iKAu0() throws Exception {
        ZipShort zipShort = new ZipShort(new byte[]{1, 2, 3}, 1);
        ZipShort clonedZipShort = (ZipShort) zipShort.clone();
        assertEquals(1, clonedZipShort.getValue());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testClone2_peCM1() throws Exception {
        ZipShort zipShort = new ZipShort(10);
        ZipShort clonedZipShort = (ZipShort) zipShort.clone();
        assertEquals(10, clonedZipShort.getValue());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testClone3_PxhM2() throws Exception {
        ZipShort zipShort = new ZipShort(new byte[]{1, 2, 3});
        ZipShort clonedZipShort = (ZipShort) zipShort.clone();
        assertEquals(258, clonedZipShort.getValue());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testClone4_gkFk3() throws Exception {
        ZipShort zipShort = new ZipShort(new byte[]{1, 2, 3}, 1);
        ZipShort clonedZipShort = (ZipShort) zipShort.clone();
        assertEquals(2, clonedZipShort.getValue());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValue_ZqWV0() throws Exception {
        byte[] bytes = new byte[2];
        int offset = 0;
        int expectedValue = 0;
        int actualValue = ZipShort.getValue(bytes, offset);
        assertEquals(expectedValue, actualValue);
    }
}