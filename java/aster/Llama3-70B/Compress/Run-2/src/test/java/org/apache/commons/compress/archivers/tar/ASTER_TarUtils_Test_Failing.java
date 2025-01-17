/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.tar;
import java.io.IOException;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_TarUtils_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testReadSparseStructs_OffsetNegative_JoDL1() {
    byte[] buffer = new byte[100];
    int offset = -1;
    int entries = 2;
    try {
        TarUtils.parseFromPAX01SparseHeaders("offset,-1,numbytes,10");
        fail("Expected IOException");
    } catch (IOException e) {
        assertEquals("Corrupted TAR archive. Sparse struct offset contains negative value", e.getMessage());
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseOctalOrBinary_octal_uUjc0() {
    byte[] buffer = new byte[] { 0x12, 0x34, 0x56, 0x78 };
    long result = TarUtils.parseOctalOrBinary(buffer, 0, 4);
    assertEquals(3054417416L, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFormatCheckSumOctalBytes_qfiL0() {
    byte[] buf = new byte[12];
    long value = 123456789L;
    int offset = 2;
    int length = 11;
    int result = TarUtils.formatCheckSumOctalBytes(value, buf, offset, length);
    assertEquals(offset + length, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFormatLongOctalOrBinaryBytes7_NmGX6() {
    byte[] buf = new byte[10];
    int result = TarUtils.formatLongOctalOrBinaryBytes(Long.MAX_VALUE >>> 1, buf, 0, 8);
    assertEquals(8, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFormatLongOctalOrBinaryBytes1_sHSj0_2() {
    byte[] buf = new byte[10];
    int result = TarUtils.formatLongOctalOrBinaryBytes(123, buf, 0, 10);
    assertEquals((byte) 0x80, buf[0]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFormatLongOctalOrBinaryBytes3_LKxU2_1() {
    byte[] buf = new byte[11];
    int result = TarUtils.formatLongOctalOrBinaryBytes(1234567890, buf, 0, 11);
    assertEquals(11, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFormatLongOctalOrBinaryBytes5_oQcu4_2() {
    byte[] buf = new byte[5];
    int result = TarUtils.formatLongOctalOrBinaryBytes(123, buf, 0, 5);
    assertEquals((byte) 0x80, buf[0]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFormatUnsignedOctalString5_IJSJ4() {
    byte[] buffer = new byte[10];
    TarUtils.formatUnsignedOctalString(63, buffer, 0, 10);
    assertArrayEquals(new byte[]{'0', '0', '0', '0', '0', '0', '0', '7', '7', 0}, buffer);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParsePAX1XSparseHeaders_NegativeSparseNumbytes_oxGw3_lEZa0() {
    String sparseMap = "0,4294967295";
    IOException exception = null;
    try {
        TarUtils.parseFromPAX01SparseHeaders(sparseMap);
    } catch (IOException e) {
        exception = e;
    }
    assertNotNull(exception);
    assertEquals("Corrupted TAR archive. Sparse struct numbytes contains negative value", exception.getMessage());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testVerifyCheckSum1_JWES0_xQOI0() {
    byte[] header = new byte[512]; 
    for (int i = 0; i < 512; i++) {
        header[i] = (byte) (i % 256);
    }
    assertTrue(TarUtils.verifyCheckSum(header));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testReadSparseStructs_OffsetNegative_JoDL1_fid2() {
    byte[] buffer = new byte[100];
    int offset = -1;
    int entries = 2;
    try {
        TarUtils.readSparseStructs(buffer, offset, entries);
        fail("Expected IOException");
    } catch (IOException e) {
        assertEquals("Corrupted TAR archive, sparse entry with negative offset", e.getMessage());
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testReadSparseStructs_IllegalArgumentException_MkZd3_fid2() {
    byte[] buffer = new byte[100];
    int offset = 0;
    int entries = 2;
    try {
        TarUtils.readSparseStructs(buffer, offset, entries);
        fail("Expected IOException");
    } catch (IOException e) {
        assertEquals("Corrupted TAR archive, sparse entry is invalid", e.getMessage());
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParsePAX01SparseHeaders_iSqD0() {
    String sparseMap = "path/to/sparse/map";
    List<TarArchiveStructSparse> result = TarUtils.parsePAX01SparseHeaders(sparseMap);
    assertNotNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseOctal2_NPAE1_fid2() {
    byte[] buffer = new byte[] { '1', '2', '3' };
    int offset = 0;
    int length = 3;
    long result = TarUtils.parseOctal(buffer, offset, length);
    assertEquals(123L, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseOctal3_XmrP2_fid2() {
    byte[] buffer = new byte[] { ' ', '1', '2', '3' };
    int offset = 0;
    int length = 4;
    long result = TarUtils.parseOctal(buffer, offset, length);
    assertEquals(123L, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseOctal4_tVpO3_fid2() {
    byte[] buffer = new byte[] { '1', '2', '3', ' ' };
    int offset = 0;
    int length = 4;
    long result = TarUtils.parseOctal(buffer, offset, length);
    assertEquals(123L, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseOctal10_Mdni9_fid2() {
    byte[] buffer = new byte[] { '1', '2', '\0' };
    int offset = 0;
    int length = 3;
    try {
        TarUtils.parseOctal(buffer, offset, length);
        fail("Expected IllegalArgumentException");
    } catch (IllegalArgumentException e) {
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseOctalOrBinary_Octal_aCxm0_fid2() {
    byte[] buffer = new byte[] { 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08 };
    long result = TarUtils.parseOctalOrBinary(buffer, 0, 8);
    assertEquals(1234567L, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseOctalOrBinary_BinaryPositive_bDev1_fid2() {
    byte[] buffer = new byte[] { 0x00, 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07 };
    long result = TarUtils.parseOctalOrBinary(buffer, 0, 8);
    assertEquals(723401728L, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseOctalOrBinary_BinaryNegative_ywYV2_fid2() {
    byte[] buffer = new byte[] { (byte) 0xff, 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07 };
    long result = TarUtils.parseOctalOrBinary(buffer, 0, 8);
    assertEquals(-723401728L, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseOctalOrBinary_octal_uUjc0_fid2() {
    byte[] buffer = new byte[] { 0x12, 0x34, 0x56, 0x78 };
    long result = TarUtils.parseOctalOrBinary(buffer, 0, 4);
    assertEquals(342391, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFormatCheckSumOctalBytes_qfiL0_fid2() {
    byte[] buf = new byte[10];
    long value = 123456789L;
    int offset = 2;
    int length = 8;
    int result = TarUtils.formatCheckSumOctalBytes(value, buf, offset, length);
    assertEquals(offset + length, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFormatLongOctalOrBinaryBytes7_NmGX6_fid2() {
    byte[] buf = new byte[10];
    int result = TarUtils.formatLongOctalOrBinaryBytes(Long.MAX_VALUE, buf, 0, 8);
    assertEquals(8, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFormatLongOctalOrBinaryBytes3_LKxU2_1_fid2() {
    byte[] buf = new byte[10];
    int result = TarUtils.formatLongOctalOrBinaryBytes(1234567890, buf, 0, 10);
    assertEquals(10, result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFormatLongOctalOrBinaryBytes3_LKxU2_2_fid2() {
    byte[] buf = new byte[10];
    int result = TarUtils.formatLongOctalOrBinaryBytes(1234567890, buf, 0, 10);
    assertEquals((byte) 0x80, buf[0]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFormatUnsignedOctalString5_IJSJ4_fid2() {
    byte[] buffer = new byte[10];
    TarUtils.formatUnsignedOctalString(63, buffer, 0, 10);
    assertArrayEquals(new byte[]{'0', '0', '0', '0', '0', '0', '0', '7', '7'}, buffer);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFormatLongOctalBytes_yicW0_1_fid2() {
    byte[] buf = new byte[10];
    int result = TarUtils.formatLongOctalBytes(123456789L, buf, 0, 8);
    assertEquals(8, result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFormatLongOctalBytes_yicW0_2_fid2() {
    byte[] buf = new byte[10];
    int result = TarUtils.formatLongOctalBytes(123456789L, buf, 0, 8);
    assertEquals(' ', buf[7]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParsePAX1XSparseHeaders_NegativeSparseOffset_ADsb2_pLMv0_fid2() {
    String sparseMap = "18446744073709551615,18446744073709551615";
    try {
        TarUtils.parseFromPAX01SparseHeaders(sparseMap);
        fail("Expected IOException");
    } catch (IOException e) {
        assertEquals("Corrupted TAR archive. Sparse struct offset contains negative value", e.getMessage());
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParsePAX1XSparseHeaders_NegativeSparseNumbytes_oxGw3_lEZa0_fid2() {
    String sparseMap = "0,4294967295";
    try {
        TarUtils.parseFromPAX01SparseHeaders(sparseMap);
        fail("Expected IOException");
    } catch (IOException e) {
        assertEquals("Corrupted TAR archive. Sparse struct numbytes contains negative value", e.getMessage());
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testVerifyCheckSum1_JWES0_xQOI0_fid2() {
    byte[] header = new byte[512]; 
    for (int i = 0; i < 512; i++) {
        header[i] = (byte) i;
    }
    assertTrue(TarUtils.verifyCheckSum(header));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testVerifyCheckSum2_qfbo1_kfRT0_fid2() {
    byte[] header = new byte[512]; // Assuming TarConstants.BLOCKSIZE is 512
    for (int i = 0; i < 512; i++) {
        header[i] = (byte) (i + 128);
    }
    assertTrue(TarUtils.verifyCheckSum(header));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testVerifyCheckSum3_uHGD2_VxQC0_fid2() {
    byte[] header = new byte[512]; 
    for (int i = 0; i < 512; i++) {
        header[i] = (byte) (i * 2);
    }
    assertTrue(TarUtils.verifyCheckSum(header));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testVerifyCheckSum4_ZHxz3_DCqE0_fid2() {
    byte[] header = new byte[512]; 
    for (int i = 0; i < 512; i++) {
        header[i] = (byte) (i * 3);
    }
    assertFalse(TarUtils.verifyCheckSum(header));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testVerifyCheckSum5_WIKq4_OOvS0_fid2() {
    byte[] header = new byte[512]; 
    for (int i = 0; i < 512; i++) {
        header[i] = (byte) (i * 4);
    }
    assertFalse(TarUtils.verifyCheckSum(header));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testVerifyCheckSum6_BEsW5_IcUI0_fid2() {
    byte[] header = new byte[512]; 
    for (int i = 0; i < 512; i++) {
        header[i] = (byte) (i * 5);
    }
    assertFalse(TarUtils.verifyCheckSum(header));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseFromPAX01SparseHeaders_EmptyString_YPbe0_Nwur0() {
    try {
        List<TarArchiveStructSparse> result = TarUtils.parseFromPAX01SparseHeaders("");
        assertTrue(result.isEmpty());
    } catch (IOException e) {
        fail("IOException should not be thrown");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseFromPAX01SparseHeaders_EmptyString_YPbe0_UVkx1_fid2() throws IOException {
    List<TarArchiveStructSparse> result = TarUtils.parseFromPAX01SparseHeaders("");
    assertTrue(result.isEmpty());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFormatLongOctalOrBinaryBytes1_sHSj0() {
    byte[] buf = new byte[10];
    int result = TarUtils.formatLongOctalOrBinaryBytes(123, buf, 0, 10);
    assertEquals(10, result);
    assertEquals((byte) 0x80, buf[0]);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFormatLongOctalOrBinaryBytes3_LKxU2() {
    byte[] buf = new byte[10];
    int result = TarUtils.formatLongOctalOrBinaryBytes(1234567890, buf, 0, 10);
    assertEquals(10, result);
    assertEquals((byte) 0x80, buf[0]);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFormatLongOctalOrBinaryBytes5_oQcu4() {
    byte[] buf = new byte[5];
    int result = TarUtils.formatLongOctalOrBinaryBytes(123, buf, 0, 5);
    assertEquals(5, result);
    assertEquals((byte) 0x80, buf[0]);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFormatLongOctalBytes_yicW0() {
    byte[] buf = new byte[10];
    int result = TarUtils.formatLongOctalBytes(123456789L, buf, 0, 8);
    assertEquals(8, result);
    assertEquals(' ', buf[7]);
}
}