/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.tar;
import java.io.IOException;
import org.apache.commons.compress.archivers.zip.ZipEncoding;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_TarUtils_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseSparse_HDYk0_1() {
        byte[] buffer = new byte[10];
        int offset = 5;
        TarArchiveStructSparse result = TarUtils.parseSparse(buffer, offset);
        assertEquals(0, result.getOffset());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseSparse_HDYk0_2() {
        byte[] buffer = new byte[10];
        int offset = 5;
        TarArchiveStructSparse result = TarUtils.parseSparse(buffer, offset);
        assertEquals(0, result.getNumbytes());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseNameWithNullEncoding_LyZz3() throws IOException {
        byte[] buffer = new byte[10];
        int offset = 0;
        int length = 10;
        ZipEncoding encoding = null;
        try {
           TarUtils.parseName(buffer, offset, length, encoding);
            fail("Expected IOException not thrown");
        } catch (IOException e) {
            assertNotNull(e);
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseOctalOrBinary_4_AXGZ3() {
    byte[] buffer = new byte[1];
    int offset = 0;
    int length = 1;
    long expected = 0;
    long actual = TarUtils.parseOctalOrBinary(buffer, offset, length);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testFormatOctalBytes_DscL0() {
	    byte[] buf = new byte[10];
	    int offset = 2;
	    int length = 8;
	    long value = 1234567L;
	    int expected = 10;
	    int actual = TarUtils.formatOctalBytes(value, buf, offset, length);
	    assertEquals(expected, actual);
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testFormatOctalBytesWithNegativeValue_nFKx2() {
	    byte[] buf = new byte[10];
	    int offset = 2;
	    int length = 8;
	    long value = -1234567L;
	    int expected = 10;
	    int actual = TarUtils.formatOctalBytes(value, buf, offset, length);
	    assertEquals(expected, actual);
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testFormatOctalBytesWithInvalidOffset_mdzc3() {
	    byte[] buf = new byte[10];
	    int offset = -1;
	    int length = 8;
	    long value = 1234567L;
	    int expected = 10;
	    int actual = TarUtils.formatOctalBytes(value, buf, offset, length);
	    assertEquals(expected, actual);
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testFormatOctalBytesWithInvalidLength_YUNO4() {
	    byte[] buf = new byte[10];
	    int offset = 2;
	    int length = -1;
	    long value = 1234567L;
	    int expected = 10;
	    int actual = TarUtils.formatOctalBytes(value, buf, offset, length);
	    assertEquals(expected, actual);
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testParseOctalOrBinary_Octal_gnXT0() {
		byte[] buffer = {(byte) 0x12, (byte) 0x34, (byte) 0x56, (byte) 0x70};
		int offset = 0;
		int length = 4;
		long expected = 012345670;
		long actual = TarUtils.parseOctalOrBinary(buffer, offset, length);
		assertEquals(expected, actual);
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testParseOctalOrBinary_Binary_jPzx1() {
		byte[] buffer = {(byte) 0xff, (byte) 0x12, (byte) 0x34, (byte) 0x56, (byte) 0x78};
		int offset = 0;
		int length = 5;
		long expected = -0x12345678L;
		long actual = TarUtils.parseOctalOrBinary(buffer, offset, length);
		assertEquals(expected, actual);
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testParseOctalOrBinary_Binary_ExceedsMaximumSignedLongValue_rlrp2() {
		byte[] buffer = {(byte) 0xff, (byte) 0x12, (byte) 0x34, (byte) 0x56, (byte) 0x78, (byte) 0x90};
		int offset = 0;
		int length = 6;
		assertThrows(IllegalArgumentException.class, () ->TarUtils.parseOctalOrBinary(buffer, offset, length));
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testFormatLongOctalBytes_qTVz0() {
		byte[] buf = new byte[10];
		int offset = 0;
		int length = 10;
		long value = 1234567890L;
		int expected = 10;
		int actual = TarUtils.formatLongOctalBytes(value, buf, offset, length);
		assertEquals(expected, actual);
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testFormatLongOctalBytes2_dHqa1() {
		byte[] buf = new byte[10];
		int offset = 0;
		int length = 10;
		long value = 9876543210L;
		int expected = 10;
		int actual = TarUtils.formatLongOctalBytes(value, buf, offset, length);
		assertEquals(expected, actual);
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFormatLongOctalOrBinaryBytes_0_MHaD0_1()
{
    byte[] buf = new byte[1];
    int length = 1;
    int offset = 0;
    long value = 0L;
    int result = TarUtils.formatLongOctalOrBinaryBytes(value, buf, offset, length);
    byte[] expected = new byte[]{0};
    assertNotEquals(0, result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFormatLongOctalOrBinaryBytes_0_MHaD0_2()
{
    byte[] buf = new byte[1];
    int length = 1;
    int offset = 0;
    long value = 0L;
    int result = TarUtils.formatLongOctalOrBinaryBytes(value, buf, offset, length);
    byte[] expected = new byte[]{0};
    assertNotEquals(0, expected.length);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFormatLongOctalOrBinaryBytes_0_MHaD0_3()
{
    byte[] buf = new byte[1];
    int length = 1;
    int offset = 0;
    long value = 0L;
    int result = TarUtils.formatLongOctalOrBinaryBytes(value, buf, offset, length);
    byte[] expected = new byte[]{0};
    assertNotEquals(0, buf.length);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFormatLongOctalOrBinaryBytes_0_MHaD0_4()
{
    byte[] buf = new byte[1];
    int length = 1;
    int offset = 0;
    long value = 0L;
    int result = TarUtils.formatLongOctalOrBinaryBytes(value, buf, offset, length);
    byte[] expected = new byte[]{0};
    assertEquals(expected, buf);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFormatLongOctalOrBinaryBytes_1_qRvB1_1()
{
    byte[] buf = new byte[1];
    int length = 1;
    int offset = 0;
    long value = 1L;
    int result = TarUtils.formatLongOctalOrBinaryBytes(value, buf, offset, length);
    byte[] expected = new byte[]{1};
    assertNotEquals(0, result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFormatLongOctalOrBinaryBytes_1_qRvB1_2()
{
    byte[] buf = new byte[1];
    int length = 1;
    int offset = 0;
    long value = 1L;
    int result = TarUtils.formatLongOctalOrBinaryBytes(value, buf, offset, length);
    byte[] expected = new byte[]{1};
    assertNotEquals(0, expected.length);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFormatLongOctalOrBinaryBytes_1_qRvB1_3()
{
    byte[] buf = new byte[1];
    int length = 1;
    int offset = 0;
    long value = 1L;
    int result = TarUtils.formatLongOctalOrBinaryBytes(value, buf, offset, length);
    byte[] expected = new byte[]{1};
    assertNotEquals(0, buf.length);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFormatLongOctalOrBinaryBytes_1_qRvB1_4()
{
    byte[] buf = new byte[1];
    int length = 1;
    int offset = 0;
    long value = 1L;
    int result = TarUtils.formatLongOctalOrBinaryBytes(value, buf, offset, length);
    byte[] expected = new byte[]{1};
    assertEquals(expected, buf);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFormatLongOctalOrBinaryBytes_2_NDOf2_1()
{
    byte[] buf = new byte[1];
    int length = 1;
    int offset = 0;
    long value = 2L;
    int result = TarUtils.formatLongOctalOrBinaryBytes(value, buf, offset, length);
    byte[] expected = new byte[]{2};
    assertNotEquals(0, result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFormatLongOctalOrBinaryBytes_2_NDOf2_2()
{
    byte[] buf = new byte[1];
    int length = 1;
    int offset = 0;
    long value = 2L;
    int result = TarUtils.formatLongOctalOrBinaryBytes(value, buf, offset, length);
    byte[] expected = new byte[]{2};
    assertNotEquals(0, expected.length);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFormatLongOctalOrBinaryBytes_2_NDOf2_3()
{
    byte[] buf = new byte[1];
    int length = 1;
    int offset = 0;
    long value = 2L;
    int result = TarUtils.formatLongOctalOrBinaryBytes(value, buf, offset, length);
    byte[] expected = new byte[]{2};
    assertNotEquals(0, buf.length);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFormatLongOctalOrBinaryBytes_2_NDOf2_4()
{
    byte[] buf = new byte[1];
    int length = 1;
    int offset = 0;
    long value = 2L;
    int result = TarUtils.formatLongOctalOrBinaryBytes(value, buf, offset, length);
    byte[] expected = new byte[]{2};
    assertEquals(expected, buf);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFormatLongOctalOrBinaryBytes_3_eOph3_1()
{
    byte[] buf = new byte[1];
    int length = 1;
    int offset = 0;
    long value = 3L;
    int result = TarUtils.formatLongOctalOrBinaryBytes(value, buf, offset, length);
    byte[] expected = new byte[]{3};
    assertNotEquals(0, result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFormatLongOctalOrBinaryBytes_3_eOph3_2()
{
    byte[] buf = new byte[1];
    int length = 1;
    int offset = 0;
    long value = 3L;
    int result = TarUtils.formatLongOctalOrBinaryBytes(value, buf, offset, length);
    byte[] expected = new byte[]{3};
    assertNotEquals(0, expected.length);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFormatLongOctalOrBinaryBytes_3_eOph3_3()
{
    byte[] buf = new byte[1];
    int length = 1;
    int offset = 0;
    long value = 3L;
    int result = TarUtils.formatLongOctalOrBinaryBytes(value, buf, offset, length);
    byte[] expected = new byte[]{3};
    assertNotEquals(0, buf.length);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFormatLongOctalOrBinaryBytes_3_eOph3_4()
{
    byte[] buf = new byte[1];
    int length = 1;
    int offset = 0;
    long value = 3L;
    int result = TarUtils.formatLongOctalOrBinaryBytes(value, buf, offset, length);
    byte[] expected = new byte[]{3};
    assertEquals(expected, buf);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFormatLongOctalOrBinaryBytes_4_jKgc4_1()
{
    byte[] buf = new byte[1];
    int length = 1;
    int offset = 0;
    long value = 4L;
    int result = TarUtils.formatLongOctalOrBinaryBytes(value, buf, offset, length);
    byte[] expected = new byte[]{4};
    assertNotEquals(0, result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFormatLongOctalOrBinaryBytes_4_jKgc4_2()
{
    byte[] buf = new byte[1];
    int length = 1;
    int offset = 0;
    long value = 4L;
    int result = TarUtils.formatLongOctalOrBinaryBytes(value, buf, offset, length);
    byte[] expected = new byte[]{4};
    assertNotEquals(0, expected.length);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFormatLongOctalOrBinaryBytes_4_jKgc4_3()
{
    byte[] buf = new byte[1];
    int length = 1;
    int offset = 0;
    long value = 4L;
    int result = TarUtils.formatLongOctalOrBinaryBytes(value, buf, offset, length);
    byte[] expected = new byte[]{4};
    assertNotEquals(0, buf.length);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFormatLongOctalOrBinaryBytes_4_jKgc4_4()
{
    byte[] buf = new byte[1];
    int length = 1;
    int offset = 0;
    long value = 4L;
    int result = TarUtils.formatLongOctalOrBinaryBytes(value, buf, offset, length);
    byte[] expected = new byte[]{4};
    assertEquals(expected, buf);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFormatLongOctalOrBinaryBytes_5_bwSa5_1()
{
    byte[] buf = new byte[1];
    int length = 1;
    int offset = 0;
    long value = 5L;
    int result = TarUtils.formatLongOctalOrBinaryBytes(value, buf, offset, length);
    byte[] expected = new byte[]{5};
    assertNotEquals(0, result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFormatLongOctalOrBinaryBytes_5_bwSa5_2()
{
    byte[] buf = new byte[1];
    int length = 1;
    int offset = 0;
    long value = 5L;
    int result = TarUtils.formatLongOctalOrBinaryBytes(value, buf, offset, length);
    byte[] expected = new byte[]{5};
    assertNotEquals(0, expected.length);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFormatLongOctalOrBinaryBytes_5_bwSa5_3()
{
    byte[] buf = new byte[1];
    int length = 1;
    int offset = 0;
    long value = 5L;
    int result = TarUtils.formatLongOctalOrBinaryBytes(value, buf, offset, length);
    byte[] expected = new byte[]{5};
    assertNotEquals(0, buf.length);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFormatLongOctalOrBinaryBytes_5_bwSa5_4()
{
    byte[] buf = new byte[1];
    int length = 1;
    int offset = 0;
    long value = 5L;
    int result = TarUtils.formatLongOctalOrBinaryBytes(value, buf, offset, length);
    byte[] expected = new byte[]{5};
    assertEquals(expected, buf);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFormatLongOctalOrBinaryBytes_6_Cxqv6_1()
{
    byte[] buf = new byte[1];
    int length = 1;
    int offset = 0;
    long value = 6L;
    int result = TarUtils.formatLongOctalOrBinaryBytes(value, buf, offset, length);
    byte[] expected = new byte[]{6};
    assertNotEquals(0, result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFormatLongOctalOrBinaryBytes_6_Cxqv6_2()
{
    byte[] buf = new byte[1];
    int length = 1;
    int offset = 0;
    long value = 6L;
    int result = TarUtils.formatLongOctalOrBinaryBytes(value, buf, offset, length);
    byte[] expected = new byte[]{6};
    assertNotEquals(0, expected.length);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFormatLongOctalOrBinaryBytes_6_Cxqv6_3()
{
    byte[] buf = new byte[1];
    int length = 1;
    int offset = 0;
    long value = 6L;
    int result = TarUtils.formatLongOctalOrBinaryBytes(value, buf, offset, length);
    byte[] expected = new byte[]{6};
    assertNotEquals(0, buf.length);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFormatLongOctalOrBinaryBytes_6_Cxqv6_4()
{
    byte[] buf = new byte[1];
    int length = 1;
    int offset = 0;
    long value = 6L;
    int result = TarUtils.formatLongOctalOrBinaryBytes(value, buf, offset, length);
    byte[] expected = new byte[]{6};
    assertEquals(expected, buf);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFormatLongOctalOrBinaryBytes_7_qPZf7_1()
{
    byte[] buf = new byte[1];
    int length = 1;
    int offset = 0;
    long value = 7L;
    int result = TarUtils.formatLongOctalOrBinaryBytes(value, buf, offset, length);
    byte[] expected = new byte[]{7};
    assertNotEquals(0, result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFormatLongOctalOrBinaryBytes_7_qPZf7_2()
{
    byte[] buf = new byte[1];
    int length = 1;
    int offset = 0;
    long value = 7L;
    int result = TarUtils.formatLongOctalOrBinaryBytes(value, buf, offset, length);
    byte[] expected = new byte[]{7};
    assertNotEquals(0, expected.length);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFormatLongOctalOrBinaryBytes_7_qPZf7_3()
{
    byte[] buf = new byte[1];
    int length = 1;
    int offset = 0;
    long value = 7L;
    int result = TarUtils.formatLongOctalOrBinaryBytes(value, buf, offset, length);
    byte[] expected = new byte[]{7};
    assertNotEquals(0, buf.length);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFormatLongOctalOrBinaryBytes_7_qPZf7_4()
{
    byte[] buf = new byte[1];
    int length = 1;
    int offset = 0;
    long value = 7L;
    int result = TarUtils.formatLongOctalOrBinaryBytes(value, buf, offset, length);
    byte[] expected = new byte[]{7};
    assertEquals(expected, buf);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testVerifyCheckSumWithZeros_ulvF0_opLY0() {
		byte[] header = new byte[512];
		for (int i = 0; i < header.length; i++) {
			header[i] = 0;
		}
		assertTrue(TarUtils.verifyCheckSum(header));
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testVerifyCheckSumWithOnes_XYYj1_uJHO0() {
		byte[] header = new byte[512];
		for (int i = 0; i < header.length; i++) {
			header[i] = -1;
		}
		assertTrue(TarUtils.verifyCheckSum(header));
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testParseOctalOrBinary_Binary_jPzx1_fid2() {
		byte[] buffer = {(byte) 0xff, (byte) 0x12, (byte) 0x34, (byte) 0x56, (byte) 0x78};
		int offset = 0;
		int length = 5;
		long expected = -0x12345678;
		long actual =TarUtils.parseOctalOrBinary(buffer, offset, length);
		assertEquals(expected, actual);
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testFormatCheckSumOctalBytes_jjHI0() {
	    byte[] buf = new byte[10];
	    int offset = 2;
	    int length = 8;
	    long value = 1234567890;
	    int expected = 12;
	    int actual =TarUtils.formatCheckSumOctalBytes(value, buf, offset, length);
	    assertEquals(expected, actual);
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testFormatCheckSumOctalBytesWithNegativeValue_aHAc1() {
	    byte[] buf = new byte[10];
	    int offset = 2;
	    int length = 8;
	    long value = -1234567890;
	    int expected = 12;
	    int actual =TarUtils.formatCheckSumOctalBytes(value, buf, offset, length);
	    assertEquals(expected, actual);
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseSparse_HDYk0() {
        byte[] buffer = new byte[10];
        int offset = 5;
        TarArchiveStructSparse result = TarUtils.parseSparse(buffer, offset);
        assertEquals(0, result.getOffset());
        assertEquals(0, result.getNumbytes());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFormatLongOctalOrBinaryBytes_0_MHaD0()
{
    byte[] buf = new byte[1];
    int length = 1;
    int offset = 0;
    long value = 0L;
    int result = TarUtils.formatLongOctalOrBinaryBytes(value, buf, offset, length);
    byte[] expected = new byte[]{0};
    assertNotEquals(0, result);
    assertNotEquals(0, expected.length);
    assertNotEquals(0, buf.length);
    assertEquals(expected, buf);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFormatLongOctalOrBinaryBytes_1_qRvB1()
{
    byte[] buf = new byte[1];
    int length = 1;
    int offset = 0;
    long value = 1L;
    int result = TarUtils.formatLongOctalOrBinaryBytes(value, buf, offset, length);
    byte[] expected = new byte[]{1};
    assertNotEquals(0, result);
    assertNotEquals(0, expected.length);
    assertNotEquals(0, buf.length);
    assertEquals(expected, buf);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFormatLongOctalOrBinaryBytes_2_NDOf2()
{
    byte[] buf = new byte[1];
    int length = 1;
    int offset = 0;
    long value = 2L;
    int result = TarUtils.formatLongOctalOrBinaryBytes(value, buf, offset, length);
    byte[] expected = new byte[]{2};
    assertNotEquals(0, result);
    assertNotEquals(0, expected.length);
    assertNotEquals(0, buf.length);
    assertEquals(expected, buf);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFormatLongOctalOrBinaryBytes_3_eOph3()
{
    byte[] buf = new byte[1];
    int length = 1;
    int offset = 0;
    long value = 3L;
    int result = TarUtils.formatLongOctalOrBinaryBytes(value, buf, offset, length);
    byte[] expected = new byte[]{3};
    assertNotEquals(0, result);
    assertNotEquals(0, expected.length);
    assertNotEquals(0, buf.length);
    assertEquals(expected, buf);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFormatLongOctalOrBinaryBytes_4_jKgc4()
{
    byte[] buf = new byte[1];
    int length = 1;
    int offset = 0;
    long value = 4L;
    int result = TarUtils.formatLongOctalOrBinaryBytes(value, buf, offset, length);
    byte[] expected = new byte[]{4};
    assertNotEquals(0, result);
    assertNotEquals(0, expected.length);
    assertNotEquals(0, buf.length);
    assertEquals(expected, buf);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFormatLongOctalOrBinaryBytes_5_bwSa5()
{
    byte[] buf = new byte[1];
    int length = 1;
    int offset = 0;
    long value = 5L;
    int result = TarUtils.formatLongOctalOrBinaryBytes(value, buf, offset, length);
    byte[] expected = new byte[]{5};
    assertNotEquals(0, result);
    assertNotEquals(0, expected.length);
    assertNotEquals(0, buf.length);
    assertEquals(expected, buf);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFormatLongOctalOrBinaryBytes_6_Cxqv6()
{
    byte[] buf = new byte[1];
    int length = 1;
    int offset = 0;
    long value = 6L;
    int result = TarUtils.formatLongOctalOrBinaryBytes(value, buf, offset, length);
    byte[] expected = new byte[]{6};
    assertNotEquals(0, result);
    assertNotEquals(0, expected.length);
    assertNotEquals(0, buf.length);
    assertEquals(expected, buf);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFormatLongOctalOrBinaryBytes_7_qPZf7()
{
    byte[] buf = new byte[1];
    int length = 1;
    int offset = 0;
    long value = 7L;
    int result = TarUtils.formatLongOctalOrBinaryBytes(value, buf, offset, length);
    byte[] expected = new byte[]{7};
    assertNotEquals(0, result);
    assertNotEquals(0, expected.length);
    assertNotEquals(0, buf.length);
    assertEquals(expected, buf);
}
}