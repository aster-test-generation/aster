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
public class Aster_ZipShort_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsWithSameObject_hblp0() throws Exception {
    ZipShort zipShort = new ZipShort(new byte[] { 0x01, 0x02 }, 0);
    assertEquals(true, zipShort.equals(zipShort));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsWithNullObject_kvuu1() throws Exception {
    ZipShort zipShort = new ZipShort(new byte[] { 0x01, 0x02 }, 0);
    assertEquals(false, zipShort.equals(null));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsWithSimilarObject_YdhN2() throws Exception {
    ZipShort zipShort1 = new ZipShort(new byte[] { 0x01, 0x02 }, 0);
    ZipShort zipShort2 = new ZipShort(new byte[] { 0x01, 0x02 }, 0);
    assertEquals(true, zipShort1.equals(zipShort2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testToString_nmEG0() throws Exception {
		ZipShort zipShort = new ZipShort(new byte[] {0x01, 0x02}, 0);
		assertEquals("ZipShort value: 258", zipShort.toString());
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testToString_jXrt1() throws Exception {
		ZipShort zipShort = new ZipShort(512);
		assertEquals("ZipShort value: 512", zipShort.toString());
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testToString_OGee2() throws Exception {
		ZipShort zipShort = new ZipShort(new byte[] {0x01, 0x02});
		assertEquals("ZipShort value: 258", zipShort.toString());
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getValueTest1_WCtp0() throws Exception {
        byte[] bytes = new byte[0];
        int offset = 0;
        ZipShort zipShort = new ZipShort(bytes, offset);
        int expected = 0;
        int actual = zipShort.getValue();
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getValueTest2_Mkag1() throws Exception {
        int value = 0;
        ZipShort zipShort = new ZipShort(value);
        int expected = 0;
        int actual = zipShort.getValue();
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getValueTest3_Hndj2() throws Exception {
        byte[] bytes = new byte[0];
        ZipShort zipShort = new ZipShort(bytes);
        int expected = 0;
        int actual = zipShort.getValue();
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getBytesTest1_vZvD0() throws Exception {
        ZipShort zipShort = new ZipShort(new byte[] {0, 1}, 0);
        byte[] expected = new byte[] {0, 1};
        assertArrayEquals(expected, zipShort.getBytes());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getBytesTest2_ZwPA1() throws Exception {
        ZipShort zipShort = new ZipShort(1);
        byte[] expected = new byte[] {0, 1};
        assertArrayEquals(expected, zipShort.getBytes());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getBytesTest3_zuYp2() throws Exception {
        ZipShort zipShort = new ZipShort(new byte[] {0, 2});
        byte[] expected = new byte[] {0, 2};
        assertArrayEquals(expected, zipShort.getBytes());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValueWithNullBytes_WEMR0() throws Exception {
    byte[] bytes = null;
    int expected = 0;
    int actual = ZipShort.getValue(bytes);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValueWithEmptyBytes_fnkW1() throws Exception {
    byte[] bytes = new byte[0];
    int expected = 0;
    int actual = ZipShort.getValue(bytes);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValueWithOneByte_pODx2() throws Exception {
    byte[] bytes = new byte[] { 0x01 };
    int expected = 0x01;
    int actual = ZipShort.getValue(bytes);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValueWithTwoBytes_knqn3() throws Exception {
    byte[] bytes = new byte[] { 0x01, 0x02 };
    int expected = 0x0201;
    int actual = ZipShort.getValue(bytes);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValueWithThreeBytes_cioU4() throws Exception {
    byte[] bytes = new byte[] { 0x01, 0x02, 0x03 };
    int expected = 0x030201;
    int actual = ZipShort.getValue(bytes);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValueWithFourBytes_Pmfa5() throws Exception {
    byte[] bytes = new byte[] { 0x01, 0x02, 0x03, 0x04 };
    int expected = 0x04030201;
    int actual = ZipShort.getValue(bytes);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValueWithFiveBytes_MvdK6() throws Exception {
    byte[] bytes = new byte[] { 0x01, 0x02, 0x03, 0x04, 0x05 };
    int expected = 0x05040302;
    int actual = ZipShort.getValue(bytes);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValueWithSixBytes_BKZR7() throws Exception {
    byte[] bytes = new byte[] { 0x01, 0x02, 0x03, 0x04, 0x05, 0x06 };
    int expected = 0x06050403;
    int actual = ZipShort.getValue(bytes);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValueWithSevenBytes_zRpv8() throws Exception {
    byte[] bytes = new byte[] { 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07 };
    int expected = 0x07060504;
    int actual = ZipShort.getValue(bytes);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCode_Clad0_1() throws Exception {
        ZipShort zipShort1 = new ZipShort(new byte[]{0x01, 0x02}, 0);
        ZipShort zipShort2 = new ZipShort(0x0102);
        ZipShort zipShort3 = new ZipShort(new byte[]{0x01, 0x02});
        assertEquals(zipShort1.hashCode(), zipShort2.hashCode());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCode_Clad0_2() throws Exception {
        ZipShort zipShort1 = new ZipShort(new byte[]{0x01, 0x02}, 0);
        ZipShort zipShort2 = new ZipShort(0x0102);
        ZipShort zipShort3 = new ZipShort(new byte[]{0x01, 0x02});
        assertEquals(zipShort2.hashCode(), zipShort3.hashCode());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBytes_tpXy0() throws Exception {
        byte[] expected = new byte[]{0, 0};
        byte[] actual = ZipShort.getBytes(0);
        assertArrayEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBytes1_Nznd1() throws Exception {
        byte[] expected = new byte[]{0, 1};
        byte[] actual = ZipShort.getBytes(1);
        assertArrayEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBytes2_tngO2() throws Exception {
        byte[] expected = new byte[]{0, 2};
        byte[] actual = ZipShort.getBytes(2);
        assertArrayEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBytes3_xqmA3() throws Exception {
        byte[] expected = new byte[]{0, 3};
        byte[] actual = ZipShort.getBytes(3);
        assertArrayEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBytes4_xace4() throws Exception {
        byte[] expected = new byte[]{0, 4};
        byte[] actual = ZipShort.getBytes(4);
        assertArrayEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBytes5_tVJq5() throws Exception {
        byte[] expected = new byte[]{0, 5};
        byte[] actual = ZipShort.getBytes(5);
        assertArrayEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBytes6_WHWI6() throws Exception {
        byte[] expected = new byte[]{0, 6};
        byte[] actual = ZipShort.getBytes(6);
        assertArrayEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBytes7_ihtX7() throws Exception {
        byte[] expected = new byte[]{0, 7};
        byte[] actual = ZipShort.getBytes(7);
        assertArrayEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBytes8_sUbF8() throws Exception {
        byte[] expected = new byte[]{0, 8};
        byte[] actual = ZipShort.getBytes(8);
        assertArrayEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBytes9_uVFU9() throws Exception {
        byte[] expected = new byte[]{0, 9};
        byte[] actual = ZipShort.getBytes(9);
        assertArrayEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testClone_omsD0_1() throws Exception {
        ZipShort zipShort = new ZipShort(new byte[] { 0x01, 0x02 }, 0);
        ZipShort clonedZipShort = (ZipShort) zipShort.clone();
        assertNotNull(clonedZipShort);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testClone_omsD0_2() throws Exception {
        ZipShort zipShort = new ZipShort(new byte[] { 0x01, 0x02 }, 0);
        ZipShort clonedZipShort = (ZipShort) zipShort.clone();
        assertEquals(zipShort.getValue(), clonedZipShort.getValue());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testClone_Offset_EbLY1_1() throws Exception {
        ZipShort zipShort = new ZipShort(new byte[] { 0x01, 0x02 }, 1);
        ZipShort clonedZipShort = (ZipShort) zipShort.clone();
        assertNotNull(clonedZipShort);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testClone_Offset_EbLY1_2() throws Exception {
        ZipShort zipShort = new ZipShort(new byte[] { 0x01, 0x02 }, 1);
        ZipShort clonedZipShort = (ZipShort) zipShort.clone();
        assertEquals(zipShort.getValue(), clonedZipShort.getValue());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testClone_Value_jjuo2_1() throws Exception {
        ZipShort zipShort = new ZipShort(0x0102);
        ZipShort clonedZipShort = (ZipShort) zipShort.clone();
        assertNotNull(clonedZipShort);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testClone_Value_jjuo2_2() throws Exception {
        ZipShort zipShort = new ZipShort(0x0102);
        ZipShort clonedZipShort = (ZipShort) zipShort.clone();
        assertEquals(zipShort.getValue(), clonedZipShort.getValue());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testClone_Bytes_nNEa3_1() throws Exception {
        ZipShort zipShort = new ZipShort(new byte[] { 0x01, 0x02 });
        ZipShort clonedZipShort = (ZipShort) zipShort.clone();
        assertNotNull(clonedZipShort);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testClone_Bytes_nNEa3_2() throws Exception {
        ZipShort zipShort = new ZipShort(new byte[] { 0x01, 0x02 });
        ZipShort clonedZipShort = (ZipShort) zipShort.clone();
        assertEquals(zipShort.getValue(), clonedZipShort.getValue());}
}