/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.tar;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_TarUtils_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testReadSparseStructsInvalidOffset_nDaJ1() {
    byte[] buffer = new byte[1024];
    int offset = -1;
    int entries = 5;
    try {
        TarUtils.readSparseStructs(buffer, offset, entries);
        Assertions.fail("Expected IOException");
    } catch (IOException ex) {
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testReadSparseStructsInvalidNumbytes_atmb2() {
    byte[] buffer = new byte[1024];
    int offset = 0;
    int entries = 5;
    try {
        TarUtils.readSparseStructs(buffer, offset, entries);
        Assertions.fail("Expected IOException");
    } catch (IOException ex) {
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseBooleanTrue_CznJ0() {
        byte[] buffer = new byte[] {1};
        boolean result = TarUtils.parseBoolean(buffer, 0);
        assertTrue(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseBooleanFalse_MhFs1() {
        byte[] buffer = new byte[] {0};
        boolean result = TarUtils.parseBoolean(buffer, 0);
        assertFalse(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePAX01SparseHeaders_Wbxc0() {
        String sparseMap = "sparseMap";
        List<TarArchiveStructSparse> result = TarUtils.parsePAX01SparseHeaders(sparseMap);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseOctalValidInput_ymTL0() {
        byte[] buffer = {(byte) '1', (byte) '2', (byte) '3', (byte) '4'};
        long result = TarUtils.parseOctal(buffer, 0, 4);
        assert(result == 1234);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseOctalInvalidLength_wuju1() {
        byte[] buffer = {(byte) '1', (byte) '2'};
        assertThrows(IllegalArgumentException.class, () -> TarUtils.parseOctal(buffer, 0, 2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseOctalInvalidByte_voQJ2() {
        byte[] buffer = {(byte) '1', (byte) '2', (byte) '3', (byte) '8'};
        assertThrows(IllegalArgumentException.class, () -> TarUtils.parseOctal(buffer, 0, 4));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseOctalInvalidByteAtStart_ABOB3() {
        byte[] buffer = {(byte) '8', (byte) '2', (byte) '3', (byte) '4'};
        assertThrows(IllegalArgumentException.class, () -> TarUtils.parseOctal(buffer, 0, 4));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseOctalEmptyBuffer_aGhl5() {
        byte[] buffer = {};
        assertThrows(IllegalArgumentException.class, () -> TarUtils.parseOctal(buffer, 0, 0));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseOctalNullBuffer_MVhc6() {
        byte[] buffer = null;
        assertThrows(NullPointerException.class, () -> TarUtils.parseOctal(buffer, 0, 0));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseOctalNullBufferOffset_ztYQ7() {
        byte[] buffer = {(byte) '1', (byte) '2', (byte) '3', (byte) '4'};
        assertThrows(NullPointerException.class, () -> TarUtils.parseOctal(null, 0, 4));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseOctalNegativeOffset_cbHp9() {
        byte[] buffer = {(byte) '1', (byte) '2', (byte) '3', (byte) '4'};
        assertThrows(IndexOutOfBoundsException.class, () -> TarUtils.parseOctal(buffer, -1, 4));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseOctalNegativeLength_uJEU10() {
        byte[] buffer = {(byte) '1', (byte) '2', (byte) '3', (byte) '4'};
        assertThrows(IndexOutOfBoundsException.class, () -> TarUtils.parseOctal(buffer, 0, -1));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseOctalLargeInput_utMP11() {
        byte[] buffer = {(byte) '1', (byte) '2', (byte) '3', (byte) '4', (byte) '5', (byte) '6', (byte) '7', (byte) '8'};
        long result = TarUtils.parseOctal(buffer, 0, 8);
        assert(result == 12345678);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseSparse_ordU0_1() {
        byte[] buffer = new byte[100];
        TarArchiveStructSparse result = TarUtils.parseSparse(buffer, 0);
        assertEquals(0, result.getOffset());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseSparse_ordU0_2() {
        byte[] buffer = new byte[100];
        TarArchiveStructSparse result = TarUtils.parseSparse(buffer, 0);
        assertEquals(0, result.getNumbytes());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseOctalOrBinaryOctal_dvxH0() {
        byte[] buffer = {(byte) 0x30, (byte) 0x31, (byte) 0x32};
        int offset = 0;
        int length = 3;
        assertEquals(512, TarUtils.parseOctalOrBinary(buffer, offset, length));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseOctalOrBinaryBinary_ILpP1() {
        byte[] buffer = {(byte) 0x80, (byte) 0x01, (byte) 0x02, (byte) 0x03};
        int offset = 0;
        int length = 4;
        assertEquals(-256, TarUtils.parseOctalOrBinary(buffer, offset, length));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseOctalOrBinaryBinaryLong_BTBl2() {
        byte[] buffer = {(byte) 0x80, (byte) 0x01, (byte) 0x02, (byte) 0x03, (byte) 0x04};
        int offset = 0;
        int length = 5;
        assertEquals(-257, TarUtils.parseOctalOrBinary(buffer, offset, length));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseOctalOrBinaryBinaryLongNegative_SQwz3() {
        byte[] buffer = {(byte) 0x80, (byte) 0xff, (byte) 0x01, (byte) 0x02, (byte) 0x03};
        int offset = 0;
        int length = 5;
        assertEquals(257, TarUtils.parseOctalOrBinary(buffer, offset, length));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseOctalOrBinaryOctal_EsvV0() {
        byte[] buffer = {(byte) 0x3, (byte) 0x4, (byte) 0x5};
        int offset = 0;
        int length = 3;
        long result = TarUtils.parseOctalOrBinary(buffer, offset, length);
        assertEquals(345, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseOctalOrBinaryBinary_puOR1() {
        byte[] buffer = {(byte) 0x80, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00};
        int offset = 0;
        int length = 9;
        long result = TarUtils.parseOctalOrBinary(buffer, offset, length);
        assertEquals(-256, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseOctalOrBinaryBinaryNegative_hoAb2() {
        byte[] buffer = {(byte) 0xff, (byte) 0x80, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00};
        int offset = 0;
        int length = 9;
        long result = TarUtils.parseOctalOrBinary(buffer, offset, length);
        assertEquals(256, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseOctalOrBinaryBinaryLengthLessThan9_UOUo3() {
        byte[] buffer = {(byte) 0x80, (byte) 0x00, (byte) 0x00, (byte) 0x00};
        int offset = 0;
        int length = 4;
        long result = TarUtils.parseOctalOrBinary(buffer, offset, length);
        assertEquals(-16, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFormatOctalBytes_YyDN0() {
        byte[] buf = new byte[10];
        int offset = 0;
        int length = 10;
        long value = 123456789L;
        int expectedOffset = 8;
        byte[] expectedBuf = new byte[10];
        expectedBuf[0] = 0;
        expectedBuf[1] = 0;
        expectedBuf[2] = 0;
        expectedBuf[3] = 0;
        expectedBuf[4] = 0;
        expectedBuf[5] = 0;
        expectedBuf[6] = 0;
        expectedBuf[7] = (byte) '7';
        expectedBuf[8] = (byte) '6';
        expectedBuf[9] = 0;
       TarUtils.formatOctalBytes(value, buf, offset, length);
        assertArrayEquals(expectedBuf, buf);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testComputeCheckSum_xLsG0() {
        byte[] buf = new byte[] {1, 2, 3, 4, 5};
        long expected = 1 + 2 + 3 + 4 + 5;
        long actual = TarUtils.computeCheckSum(buf);
        assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testComputeCheckSumEmptyArray_jrIz1() {
        byte[] buf = new byte[0];
        long expected = 0;
        long actual = TarUtils.computeCheckSum(buf);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testVerifyCheckSum1_WlXS0() {
        byte[] header = new byte[1024];
       TarUtils.verifyCheckSum(header);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFormatCheckSumOctalBytes_WPLb0() {
        byte[] buf = new byte[10];
        int offset = 0;
        int length = 8;
        long value = 1234567890L;
        int result = TarUtils.formatCheckSumOctalBytes(value, buf, offset, length);
        assertEquals(offset + length, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePaxHeadersNullInputStream_cwFB0() throws IOException {
        InputStream inputStream = null;
        List<TarArchiveStructSparse> sparseHeaders = new java.util.ArrayList<>();
        Map<String, String> globalPaxHeaders = new HashMap<>();
        long headerSize = 0;
        Map<String, String> result = TarUtils.parsePaxHeaders(inputStream, sparseHeaders, globalPaxHeaders, headerSize);
        assert result == null;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFormatLongOctalOrBinaryBytesPositiveValueLessThanMaxId_aYvu0() {
    byte[] buf = new byte[TarConstants.UIDLEN];
    int offset = 0;
    int length = TarConstants.UIDLEN;
    long value = 123;
    int result = TarUtils.formatLongOctalOrBinaryBytes(value, buf, offset, length);
    assertEquals(offset + length, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFormatLongOctalOrBinaryBytesPositiveValueGreaterThanMaxId_StUG1() {
    byte[] buf = new byte[TarConstants.UIDLEN];
    int offset = 0;
    int length = TarConstants.UIDLEN;
    long value = TarConstants.MAXID + 1;
    int result = TarUtils.formatLongOctalOrBinaryBytes(value, buf, offset, length);
    assertEquals(offset + length, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFormatLongOctalOrBinaryBytesNegativeValueLessThanMaxSize_MqSb2() {
    byte[] buf = new byte[TarConstants.SIZELEN];
    int offset = 0;
    int length = TarConstants.SIZELEN;
    long value = -123;
    int result = TarUtils.formatLongOctalOrBinaryBytes(value, buf, offset, length);
    assertEquals(offset + length, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFormatLongOctalOrBinaryBytesNegativeValueGreaterThanMaxSize_dnId3() {
    byte[] buf = new byte[TarConstants.SIZELEN];
    int offset = 0;
    int length = TarConstants.SIZELEN;
    long value = TarConstants.MAXSIZE + 1;
    int result = TarUtils.formatLongOctalOrBinaryBytes(value, buf, offset, length);
    assertEquals(offset + length, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFormatLongOctalOrBinaryBytesValueGreaterThanLength_IBMx4() {
    byte[] buf = new byte[9];
    int offset = 0;
    int length = 8;
    long value = TarConstants.MAXSIZE + 1;
    int result = TarUtils.formatLongOctalOrBinaryBytes(value, buf, offset, length);
    assertEquals(offset + length, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFormatLongOctalOrBinaryBytesValueLessThanLength_tnSe5() {
    byte[] buf = new byte[9];
    int offset = 0;
    int length = 9;
    long value = TarConstants.MAXSIZE;
    int result = TarUtils.formatLongOctalOrBinaryBytes(value, buf, offset, length);
    assertEquals(offset + length, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFormatLongOctalOrBinaryBytesPositiveValueLessThanMaxAsOctalChar_XZIV0() {
        byte[] buf = new byte[10];
        int offset = 0;
        int length = TarConstants.UIDLEN;
        long value = 123;
        int result = TarUtils.formatLongOctalOrBinaryBytes(value, buf, offset, length);
        assertEquals(offset + length, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFormatLongOctalOrBinaryBytesNegativeValueLessThanMaxAsOctalChar_HMGh1() {
        byte[] buf = new byte[10];
        int offset = 0;
        int length = TarConstants.UIDLEN;
        long value = -123;
        int result = TarUtils.formatLongOctalOrBinaryBytes(value, buf, offset, length);
        assertEquals(offset + length, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFormatLongOctalOrBinaryBytesPositiveValueGreaterThanMaxAsOctalChar_dIWQ2() {
        byte[] buf = new byte[10];
        int offset = 0;
        int length = TarConstants.UIDLEN;
        long value = 12345;
        int result = TarUtils.formatLongOctalOrBinaryBytes(value, buf, offset, length);
        assertEquals(offset + length, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFormatLongOctalOrBinaryBytesNegativeValueGreaterThanMaxAsOctalChar_vNJS3() {
        byte[] buf = new byte[10];
        int offset = 0;
        int length = TarConstants.UIDLEN;
        long value = -12345;
        int result = TarUtils.formatLongOctalOrBinaryBytes(value, buf, offset, length);
        assertEquals(offset + length, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFormatLongOctalOrBinaryBytesPositiveValueLessThanMaxAsBinaryChar_tjuH4() {
        byte[] buf = new byte[10];
        int offset = 0;
        int length = 9;
        long value = 123;
        int result = TarUtils.formatLongOctalOrBinaryBytes(value, buf, offset, length);
        assertEquals(offset + length, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFormatLongOctalOrBinaryBytesNegativeValueLessThanMaxAsBinaryChar_WyWw5() {
        byte[] buf = new byte[10];
        int offset = 0;
        int length = 9;
        long value = -123;
        int result = TarUtils.formatLongOctalOrBinaryBytes(value, buf, offset, length);
        assertEquals(offset + length, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFormatLongOctalOrBinaryBytesPositiveValueGreaterThanMaxAsBinaryChar_OFLS6() {
        byte[] buf = new byte[10];
        int offset = 0;
        int length = 9;
        long value = 12345;
        int result = TarUtils.formatLongOctalOrBinaryBytes(value, buf, offset, length);
        assertEquals(offset + length, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFormatLongOctalOrBinaryBytesNegativeValueGreaterThanMaxAsBinaryChar_YnLZ7() {
        byte[] buf = new byte[10];
        int offset = 0;
        int length = 9;
        long value = -12345;
        int result = TarUtils.formatLongOctalOrBinaryBytes(value, buf, offset, length);
        assertEquals(offset + length, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFormatUnsignedOctalStringZero_cWTB0() {
        byte[] buffer = new byte[4];
        TarUtils.formatUnsignedOctalString(0, buffer, 0, 4);
        assertArrayEquals(new byte[] {48}, buffer);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFormatUnsignedOctalStringOne_NNma1() {
        byte[] buffer = new byte[4];
        TarUtils.formatUnsignedOctalString(1, buffer, 0, 4);
        assertArrayEquals(new byte[] {49}, buffer);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFormatUnsignedOctalStringSmallValue_qsAe2() {
        byte[] buffer = new byte[4];
        TarUtils.formatUnsignedOctalString(8, buffer, 0, 4);
        assertArrayEquals(new byte[] {52, 48}, buffer);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFormatUnsignedOctalStringLargeValue_QCKF3() {
        byte[] buffer = new byte[4];
        TarUtils.formatUnsignedOctalString(512, buffer, 0, 4);
        assertArrayEquals(new byte[] {6, 2, 0, 0}, buffer);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFormatUnsignedOctalStringValueTooLarge_vENI4() {
        byte[] buffer = new byte[4];
        try {
            TarUtils.formatUnsignedOctalString(1024, buffer, 0, 4);
            assert false;
        } catch (IllegalArgumentException e) {
        }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFormatUnsignedOctalStringBufferTooSmall_lvEv5() {
        byte[] buffer = new byte[2];
        try {
            TarUtils.formatUnsignedOctalString(512, buffer, 0, 2);
            assert false;
        } catch (IllegalArgumentException e) {
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseName_CsJq0() throws IOException {
        byte[] buffer = new byte[] {(byte) 0x74, (byte) 0x61, (byte) 0x72};
        int offset = 0;
        int length = 3;
        String result = TarUtils.parseName(buffer, offset, length);
        assert result.equals("tar");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFormatLongOctalBytes_HuMq0() {
        byte[] buf = new byte[10];
        int offset = 0;
        int length = 5;
        long value = 1234567890L;
        int expectedOffset = 5;
        int expectedLength = 5;
        int expectedValue = 1234567890;
        String expectedString = "1234567890 ";
       TarUtils.formatLongOctalBytes(value, buf, offset, length);
        assertArrayEquals(expectedString.getBytes(), buf);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseFromPAX01SparseHeadersInvalidFormat_WXZV1() {
    String sparseMap = "123,456";
    try {
        TarUtils.parseFromPAX01SparseHeaders(sparseMap);
        fail("Expected IOException");
    } catch (IOException e) {
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseFromPAX01SparseHeadersNegativeOffset_fMgb2() {
    String sparseMap = "-1,456,789,101112";
    try {
        TarUtils.parseFromPAX01SparseHeaders(sparseMap);
        fail("Expected IOException");
    } catch (IOException e) {
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseFromPAX01SparseHeadersNegativeNumbytes_sDqm3() {
    String sparseMap = "123,-456,789,101112";
    try {
        TarUtils.parseFromPAX01SparseHeaders(sparseMap);
        fail("Expected IOException");
    } catch (IOException e) {
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseOctalNullBufferLength_Rrdg8_Xlbt0() {
    byte[] buffer = {(byte) '1', (byte) '2', (byte) '3', (byte) '4'};
    assertThrows(NullPointerException.class, () -> TarUtils.parseOctal(buffer, 0, 0));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParsePaxHeadersEmptyInputStream_aSiC1_Bjvr0() throws IOException {
    java.io.InputStream inputStream = new java.io.ByteArrayInputStream(new byte[0]);
    List<TarArchiveStructSparse> sparseHeaders = new java.util.ArrayList<>();
    Map<String, String> globalPaxHeaders = new java.util.HashMap<>();
    long headerSize = 0;
    Map<String, String> result = TarUtils.parsePaxHeaders(inputStream, sparseHeaders, globalPaxHeaders, headerSize);
    assert result == null;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testReadSparseStructsValidInput_JzKd0_qYwu0() {
    byte[] buffer = new byte[1024];
    int offset = 0;
    int entries = 5;
    try {
        List<TarArchiveStructSparse> result = TarUtils.parseFromPAX01SparseHeaders(String.valueOf(buffer));
    } catch (IOException e) {
        fail("IOException was thrown");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseFromPAX01SparseHeadersEmptyInput_QncK4_vZMe0() {
    String sparseMap = "";
    try {
        List<TarArchiveStructSparse> result = TarUtils.parseFromPAX01SparseHeaders(sparseMap);
        assertEquals(0, result.size());
    } catch (IOException e) {
        fail("IOException was expected to be thrown");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseSparse_ordU0() {
        byte[] buffer = new byte[100];
        TarArchiveStructSparse result = TarUtils.parseSparse(buffer, 0);
        assertEquals(0, result.getOffset());
        assertEquals(0, result.getNumbytes());
    }
}