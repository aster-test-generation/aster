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
public void testReadSparseStructs_OffsetNegative_TkVV1() {
    byte[] buffer = new byte[1024];
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
public void testReadSparseStructs_InvalidSparseEntry_uKed3() {
    byte[] buffer = new byte[1024];
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
public void testParsePAX01SparseHeaders_ErXI0() {
    String sparseMap = "path/to/sparse/map";
    List<TarArchiveStructSparse> result = TarUtils.parsePAX01SparseHeaders(sparseMap);
    assertNotNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseOctalOrBinary_octal_PYwF0() {
    byte[] buffer = new byte[] {0x12, 0x34, 0x56, 0x78};
    long result = TarUtils.parseOctalOrBinary(buffer, 0, 4);
    assertEquals(342391, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseOctalOrBinary_binaryPositive_SDUm1() {
    byte[] buffer = new byte[] {0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08};
    long result = TarUtils.parseOctalOrBinary(buffer, 0, 8);
    assertEquals(72623859790382856L, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseOctalOrBinary_binaryNegative_LOeh2() {
    byte[] buffer = new byte[] {(byte) 0xff, 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07};
    long result = TarUtils.parseOctalOrBinary(buffer, 0, 8);
    assertEquals(-72623859790382856L, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseOctalOrBinary_tooLongBinary_BbII3() {
    byte[] buffer = new byte[9];
    buffer[0] = (byte) 0xff;
    try {
        TarUtils.parseOctalOrBinary(buffer, 0, 9);
        fail("Expected IllegalArgumentException");
    } catch (IllegalArgumentException e) {
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseOctal1_MdSB0() {
    byte[] buffer = new byte[] { '0', '1', '2', '3' };
    int offset = 0;
    int length = 4;
    long result = TarUtils.parseOctal(buffer, offset, length);
    assertEquals(6, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseOctal3_DrxK2() {
    byte[] buffer = new byte[] { ' ', '0', '1', '2', '3' };
    int offset = 0;
    int length = 5;
    long result = TarUtils.parseOctal(buffer, offset, length);
    assertEquals(6, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseOctal4_ucog3() {
    byte[] buffer = new byte[] { '0', '1', '2', ' ', '3' };
    int offset = 0;
    int length = 5;
    long result = TarUtils.parseOctal(buffer, offset, length);
    assertEquals(6, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseOctal5_KWIw4() {
    byte[] buffer = new byte[] { '0', '1', '2', '3', '4' };
    int offset = 0;
    int length = 5;
    long result = TarUtils.parseOctal(buffer, offset, length);
    assertEquals(1234, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseOctal6_EbWu5() {
    byte[] buffer = new byte[] { '0', '1', '2', '3', '4', '5' };
    int offset = 0;
    int length = 6;
    long result = TarUtils.parseOctal(buffer, offset, length);
    assertEquals(12345, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testVerifyCheckSum1_pPPR0() {
    byte[] header = new byte[512];
    for (int i = 0; i < 512; i++) {
        header[i] = (byte) i;
    }
    assertTrue(TarUtils.verifyCheckSum(header));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testVerifyCheckSum2_eYJi1() {
    byte[] header = new byte[512];
    for (int i = 0; i < 512; i++) {
        header[i] = (byte) (i + 128);
    }
    assertTrue(TarUtils.verifyCheckSum(header));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testVerifyCheckSum3_Tkgc2() {
    byte[] header = new byte[512];
    for (int i = 0; i < 512; i++) {
        header[i] = (byte) (i * 2);
    }
    assertTrue(TarUtils.verifyCheckSum(header));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testVerifyCheckSum4_WLrB3() {
    byte[] header = new byte[512];
    for (int i = 0; i < 512; i++) {
        header[i] = (byte) (i % 2 == 0 ? 0 : 1);
    }
    assertTrue(TarUtils.verifyCheckSum(header));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testVerifyCheckSum5_aCrA4() {
    byte[] header = new byte[512];
    for (int i = 0; i < 512; i++) {
        header[i] = (byte) (i % 3 == 0 ? 0 : 1);
    }
    assertTrue(TarUtils.verifyCheckSum(header));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testVerifyCheckSum6_wBVK5() {
    byte[] header = new byte[0];
    assertFalse(TarUtils.verifyCheckSum(header));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFormatLongOctalOrBinaryBytes7_fkPm6() {
    byte[] buf = new byte[10];
    int result = TarUtils.formatLongOctalOrBinaryBytes(TarConstants.MAXSIZE, buf, 0, 12);
    assertEquals(12, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFormatLongOctalOrBinaryBytes1_sxIB0_2() {
    byte[] buf = new byte[10];
    int result = TarUtils.formatLongOctalOrBinaryBytes(123, buf, 0, 10);
    assertEquals((byte) 0x80, buf[0]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFormatLongOctalOrBinaryBytes3_uezK2_2() {
    byte[] buf = new byte[10];
    int result = TarUtils.formatLongOctalOrBinaryBytes(123456789, buf, 0, 10);
    assertEquals((byte) 0x80, buf[0]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFormatLongOctalOrBinaryBytes5_wXrs4_2() {
    byte[] buf = new byte[5];
    int result = TarUtils.formatLongOctalOrBinaryBytes(123, buf, 0, 5);
    assertEquals((byte) 0x80, buf[0]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFormatUnsignedOctalString5_DQpF4() {
    byte[] buffer = new byte[10];
    TarUtils.formatUnsignedOctalString(63, buffer, 0, 10);
    assertArrayEquals(new byte[]{'0', '0', '0', '0', '0', '0', '0', '7', '7'}, buffer);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParsePAX1XSparseHeaders_NegativeSparseNumbytes_njji3_rwPA0() {
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
public void testReadSparseStructs_OffsetNegative_TkVV1_fid1() {
    byte[] buffer = new byte[1024];
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
public void testParseOctalOrBinary_octal_PYwF0_fid1() {
    byte[] buffer = new byte[] {0x30, 0x31, 0x32, 0x33, 0x34};
    long result = TarUtils.parseOctalOrBinary(buffer, 0, 5);
    assertEquals(12334, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testVerifyCheckSum2_eYJi1_fid1() {
    byte[] header = new byte[512];
    for (int i = 0; i < 512; i++) {
        header[i] = (byte) (i % 256);
    }
    assertFalse(TarUtils.verifyCheckSum(header));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParsePAX1XSparseHeaders_NegativeSparseNumbytes_njji3_rwPA0_fid1() {
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
public void testFormatLongOctalOrBinaryBytes1_sxIB0() {
    byte[] buf = new byte[10];
    int result = TarUtils.formatLongOctalOrBinaryBytes(123, buf, 0, 10);
    assertEquals(10, result);
    assertEquals((byte) 0x80, buf[0]);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFormatLongOctalOrBinaryBytes3_uezK2() {
    byte[] buf = new byte[10];
    int result = TarUtils.formatLongOctalOrBinaryBytes(123456789, buf, 0, 10);
    assertEquals(10, result);
    assertEquals((byte) 0x80, buf[0]);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFormatLongOctalOrBinaryBytes5_wXrs4() {
    byte[] buf = new byte[5];
    int result = TarUtils.formatLongOctalOrBinaryBytes(123, buf, 0, 5);
    assertEquals(5, result);
    assertEquals((byte) 0x80, buf[0]);
}
}