/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.tar;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_TarUtils_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testReadSparseStructs_IllegalArgumentException_MkZd3() {
    byte[] buffer = new byte[100];
    int offset = 0;
    int entries = 2;
    try {
        TarUtils.parseFromPAX01SparseHeaders("a");
        fail("Expected IOException");
    } catch (IOException e) {
        assertEquals("Corrupted TAR archive. Bad format in GNU.sparse.map PAX Header", e.getMessage());
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFormatNameBytes_kPoO0() {
    byte[] buf = new byte[10];
    int offset = 0;
    int length = 5;
    String name = "testName";
    int result = TarUtils.formatNameBytes(name, buf, offset, length);
    assertEquals(5, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseBoolean_true_FWuI0() {
    byte[] buffer = new byte[1];
    buffer[0] = 1;
    assertTrue(TarUtils.parseBoolean(buffer, 0));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseBoolean_false_Qqkg1() {
    byte[] buffer = new byte[1];
    buffer[0] = 0;
    assertFalse(TarUtils.parseBoolean(buffer, 0));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseOctal1_DGES0() {
    byte[] buffer = new byte[] { '0', '0' };
    int offset = 0;
    int length = 2;
    long result = TarUtils.parseOctal(buffer, offset, length);
    assertEquals(0L, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseOctal2_NPAE1() {
    byte[] buffer = new byte[] { '1', '2', '3' };
    int offset = 0;
    int length = 3;
    long result = TarUtils.parseOctal(buffer, offset, length);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseOctal3_XmrP2() {
    byte[] buffer = new byte[] { ' ', '1', '2', '3' };
    int offset = 0;
    int length = 4;
    long result = TarUtils.parseOctal(buffer, offset, length);
    assertEquals(83L, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseOctal4_tVpO3() {
    byte[] buffer = new byte[] { '1', '2', '3', ' ' };
    int offset = 0;
    int length = 4;
    long result = TarUtils.parseOctal(buffer, offset, length);
    assertEquals(83L, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseOctal5_GcSj4() {
    byte[] buffer = new byte[] { '1', '2', '8' };
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
public void testParseOctal6_XNGa5() {
    byte[] buffer = new byte[] { '1', '2', '-' };
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
public void testParseOctal7_xaFv6() {
    byte[] buffer = new byte[] { '1', '2', 'a' };
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
public void testParseOctal8_iscx7() {
    byte[] buffer = new byte[] { '1', '2' };
    int offset = 0;
    int length = 1;
    try {
        TarUtils.parseOctal(buffer, offset, length);
        fail("Expected IllegalArgumentException");
    } catch (IllegalArgumentException e) {
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseOctal9_Xbbk8() {
    byte[] buffer = new byte[] { '1', '2' };
    int offset = 0;
    int length = 0;
    try {
        TarUtils.parseOctal(buffer, offset, length);
        fail("Expected IllegalArgumentException");
    } catch (IllegalArgumentException e) {
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseOctal10_Mdni9() {
    byte[] buffer = new byte[] { '1', '2', '\0' };
    int offset = 0;
    int length = 3;
    try {
        TarUtils.parseFromPAX01SparseHeaders("1,2");
    } catch (IOException e) {
        // pass
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseOctal11_GVFB10() {
    byte[] buffer = new byte[] { '1', '2', '\0', '3' };
    int offset = 0;
    int length = 4;
    try {
        TarUtils.parseOctal(buffer, offset, length);
        fail("Expected IllegalArgumentException");
    } catch (IllegalArgumentException e) {
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseSparse_DaRo0_1() {
    byte[] buffer = new byte[100];
    TarArchiveStructSparse sparse = TarUtils.parseSparse(buffer, 0);
    assertEquals(0, sparse.getOffset());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseSparse_DaRo0_2() {
    byte[] buffer = new byte[100];
    TarArchiveStructSparse sparse = TarUtils.parseSparse(buffer, 0);
    assertEquals(0, sparse.getNumbytes());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseOctalOrBinary_Octal_aCxm0() {
    byte[] buffer = new byte[] { 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08 };
    String result = new String(buffer, StandardCharsets.UTF_8);
    assertEquals("", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseOctalOrBinary_BinaryPositive_bDev1() {
    byte[] buffer = new byte[] { 0x00, 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07 };
    long result = TarUtils.parseOctalOrBinary(buffer, 0, 8);
    assertEquals(0L, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseOctalOrBinary_BinaryNegative_ywYV2() {
    byte[] buffer = new byte[] { (byte) 0xff, 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07 };
    long result = TarUtils.parseOctalOrBinary(buffer, 0, 8);
    assertEquals(-71773907085621753L, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseOctalOrBinary_BinaryTooLong_nVaQ3() {
    byte[] buffer = new byte[] { 0x00, 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09 };
    long result = TarUtils.parseOctalOrBinary(buffer, 0, 10);
    assertNotNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFormatOctalBytes_suwX0() {
    byte[] buf = new byte[10];
    long value = 123L;
    int offset = 2;
    int length = 5;
    int result = TarUtils.formatOctalBytes(value, buf, offset, length);
    assertEquals(7, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testComputeCheckSum_iINM0() {
    byte[] buf = new byte[] {1, 2, 3, 4, 5};
    long result = TarUtils.computeCheckSum(buf);
    assertEquals(15, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testComputeCheckSumEmptyArray_oQSm1() {
    byte[] buf = new byte[] {};
    long result = TarUtils.computeCheckSum(buf);
    assertEquals(0, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFormatLongOctalOrBinaryBytes1_AxVQ0() {
    byte[] buf = new byte[10];
    int result = TarUtils.formatLongOctalOrBinaryBytes(123L, buf, 0, 8);
    assertEquals(8, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFormatLongOctalOrBinaryBytes2_mXFy1() {
    byte[] buf = new byte[10];
    int result = TarUtils.formatLongOctalOrBinaryBytes(-123L, buf, 0, 8);
    assertEquals(8, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFormatLongOctalOrBinaryBytes3_VtmQ2() {
    byte[] buf = new byte[10];
    int result = TarUtils.formatLongOctalOrBinaryBytes(123L, buf, 0, 4);
    assertEquals(4, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFormatLongOctalOrBinaryBytes4_Pust3() {
    byte[] buf = new byte[10];
    int result = TarUtils.formatLongOctalOrBinaryBytes(-123L, buf, 0, 4);
    assertEquals(4, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFormatLongOctalOrBinaryBytes5_IvNJ4() {
    byte[] buf = new byte[10];
    int result = TarUtils.formatLongOctalOrBinaryBytes(TarConstants.MAXID + 1, buf, 0, 8);
    assertEquals(8, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFormatLongOctalOrBinaryBytes6_hCpB5() {
    byte[] buf = new byte[10];
    int result = TarUtils.formatLongOctalOrBinaryBytes(-TarConstants.MAXID - 1, buf, 0, 8);
    assertEquals(8, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFormatLongOctalOrBinaryBytes1_sHSj0_1() {
    byte[] buf = new byte[10];
    int result = TarUtils.formatLongOctalOrBinaryBytes(123, buf, 0, 10);
    assertEquals(10, result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFormatLongOctalOrBinaryBytes2_yMxQ1_1() {
    byte[] buf = new byte[10];
    int result = TarUtils.formatLongOctalOrBinaryBytes(-123, buf, 0, 10);
    assertEquals(10, result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFormatLongOctalOrBinaryBytes2_yMxQ1_2() {
    byte[] buf = new byte[10];
    int result = TarUtils.formatLongOctalOrBinaryBytes(-123, buf, 0, 10);
    assertEquals((byte) 0xff, buf[0]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFormatLongOctalOrBinaryBytes4_EBpo3_1() {
    byte[] buf = new byte[10];
    int result = TarUtils.formatLongOctalOrBinaryBytes(-1234567890, buf, 0, 10);
    assertEquals(10, result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFormatLongOctalOrBinaryBytes4_EBpo3_2() {
    byte[] buf = new byte[10];
    int result = TarUtils.formatLongOctalOrBinaryBytes(-1234567890, buf, 0, 10);
    assertEquals((byte) 0xff, buf[0]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFormatLongOctalOrBinaryBytes5_oQcu4_1() {
    byte[] buf = new byte[5];
    int result = TarUtils.formatLongOctalOrBinaryBytes(123, buf, 0, 5);
    assertEquals(5, result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFormatLongOctalOrBinaryBytes6_iHZH5_1() {
    byte[] buf = new byte[5];
    int result = TarUtils.formatLongOctalOrBinaryBytes(-123, buf, 0, 5);
    assertEquals(5, result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFormatLongOctalOrBinaryBytes6_iHZH5_2() {
    byte[] buf = new byte[5];
    int result = TarUtils.formatLongOctalOrBinaryBytes(-123, buf, 0, 5);
    assertEquals((byte) 0xff, buf[0]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFormatLongOctalOrBinaryBytes7_MTHR6_1() {
    byte[] buf = new byte[10];
    int result = TarUtils.formatLongOctalOrBinaryBytes(Long.MAX_VALUE, buf, 0, 10);
    assertEquals(10, result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFormatLongOctalOrBinaryBytes7_MTHR6_2() {
    byte[] buf = new byte[10];
    int result = TarUtils.formatLongOctalOrBinaryBytes(Long.MAX_VALUE, buf, 0, 10);
    assertEquals((byte) 0x80, buf[0]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFormatUnsignedOctalString1_kOXv0() {
    byte[] buffer = new byte[10];
    TarUtils.formatUnsignedOctalString(0, buffer, 0, 10);
    assertArrayEquals(new byte[]{'0', '0', '0', '0', '0', '0', '0', '0', '0', '0'}, buffer);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFormatUnsignedOctalString2_eiXO1() {
    byte[] buffer = new byte[10];
    TarUtils.formatUnsignedOctalString(1, buffer, 0, 10);
    assertArrayEquals(new byte[]{'0', '0', '0', '0', '0', '0', '0', '0', '0', '1'}, buffer);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFormatUnsignedOctalString3_KFeH2() {
    byte[] buffer = new byte[10];
    TarUtils.formatUnsignedOctalString(7, buffer, 0, 10);
    assertArrayEquals(new byte[]{'0', '0', '0', '0', '0', '0', '0', '0', '0', '7'}, buffer);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFormatUnsignedOctalString4_IdZE3() {
    byte[] buffer = new byte[10];
    TarUtils.formatUnsignedOctalString(8, buffer, 0, 10);
    assertArrayEquals(new byte[]{'0', '0', '0', '0', '0', '0', '0', '0', '1', '0'}, buffer);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseName_UtAp0() {
    byte[] buffer = new byte[10];
    String result = TarUtils.parseName(buffer, 0, 10);
    assertNotNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFormatLongOctalBytes_yicW0_1() {
    byte[] buf = new byte[12];
    int result = TarUtils.formatLongOctalBytes(123456789L, buf, 0, 11);
    assertEquals(11, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFormatLongOctalBytes_yicW0_2() {
    byte[] buf = new byte[11];
    int result = TarUtils.formatLongOctalBytes(123456789L, buf, 0, 11);
    assertEquals(11, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseFromPAX01SparseHeaders_InvalidInput_OddLength_ysBZ2() {
    try {
        TarUtils.parseFromPAX01SparseHeaders("0,10,20");
        fail("Expected IOException");
    } catch (IOException e) {
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseFromPAX01SparseHeaders_InvalidInput_NegativeValue_RiOq3() {
    try {
        TarUtils.parseFromPAX01SparseHeaders("0,-10,20,30");
        fail("Expected IOException");
    } catch (IOException e) {
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testReadSparseStructs_NumBytesNegative_qdMc2_oBcj0() {
    String sparseMap = "0,-1";
    try {
        TarUtils.parseFromPAX01SparseHeaders(sparseMap);
        fail("Expected IOException");
    } catch (IOException e) {
        assertEquals("Corrupted TAR archive. Sparse struct numbytes contains negative value", e.getMessage());
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParsePAX1XSparseHeaders_NegativeSparseHeadersCount_APbw1_KcXa0() {
    String sparseMap = "-1,0";
    try {
        TarUtils.parseFromPAX01SparseHeaders(sparseMap);
        fail("Expected IOException");
    } catch (IOException e) {
        assertEquals("Corrupted TAR archive. Sparse struct offset contains negative value", e.getMessage());
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParsePAX1XSparseHeaders_NegativeSparseOffset_ADsb2_pLMv0() {
    String sparseMap = "18446744073709551615,18446744073709551615";
    try {
        TarUtils.parseFromPAX01SparseHeaders(sparseMap);
        fail("Expected IOException");
    } catch (IOException e) {
        assertEquals("Unable to parse long from string value: 18446744073709551615", e.getMessage());
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testVerifyCheckSum2_qfbo1_kfRT0() {
    byte[] header = new byte[512]; // Assuming TarConstants.BLOCKSIZE is 512
    for (int i = 0; i < 512; i++) {
        header[i] = (byte) (i + 128);
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testVerifyCheckSum3_uHGD2_VxQC0() {
    byte[] header = new byte[512]; 
    for (int i = 0; i < 512; i++) {
        header[i] = (byte) (i * 2);
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testVerifyCheckSum4_ZHxz3_DCqE0() {
    byte[] header = new byte[512]; 
    for (int i = 0; i < 512; i++) {
        header[i] = (byte) (i * 3);
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testVerifyCheckSum5_WIKq4_OOvS0() {
    byte[] header = new byte[512]; 
    for (int i = 0; i < 512; i++) {
        header[i] = (byte) (i * 4);
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testVerifyCheckSum6_BEsW5_IcUI0() {
    byte[] header = new byte[512]; 
    for (int i = 0; i < 512; i++) {
        header[i] = (byte) (i * 5);
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseFromPAX01SparseHeaders_EmptyString_YPbe0_UVkx1() throws IOException {
    try {
        TarUtils.parseFromPAX01SparseHeaders("");
        fail("Expected IOException");
    } catch (IOException e) {
        assertEquals("Corrupted TAR archive. Bad format in GNU.sparse.map PAX Header", e.getMessage());
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseFromPAX01SparseHeaders_NullInput_wEvk4_NJqR0() throws IOException {
    try {
        TarUtils.parseFromPAX01SparseHeaders(null);
        fail("Expected NullPointerException or IOException");
    } catch (NullPointerException e) {
    } catch (IOException e) {
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseSparse_DaRo0() {
    byte[] buffer = new byte[100];
    TarArchiveStructSparse sparse = TarUtils.parseSparse(buffer, 0);
    assertEquals(0, sparse.getOffset());
    assertEquals(0, sparse.getNumbytes());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFormatLongOctalOrBinaryBytes2_yMxQ1() {
    byte[] buf = new byte[10];
    int result = TarUtils.formatLongOctalOrBinaryBytes(-123, buf, 0, 10);
    assertEquals(10, result);
    assertEquals((byte) 0xff, buf[0]);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFormatLongOctalOrBinaryBytes4_EBpo3() {
    byte[] buf = new byte[10];
    int result = TarUtils.formatLongOctalOrBinaryBytes(-1234567890, buf, 0, 10);
    assertEquals(10, result);
    assertEquals((byte) 0xff, buf[0]);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFormatLongOctalOrBinaryBytes6_iHZH5() {
    byte[] buf = new byte[5];
    int result = TarUtils.formatLongOctalOrBinaryBytes(-123, buf, 0, 5);
    assertEquals(5, result);
    assertEquals((byte) 0xff, buf[0]);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFormatLongOctalOrBinaryBytes7_MTHR6() {
    byte[] buf = new byte[10];
    int result = TarUtils.formatLongOctalOrBinaryBytes(Long.MAX_VALUE, buf, 0, 10);
    assertEquals(10, result);
    assertEquals((byte) 0x80, buf[0]);
}
}