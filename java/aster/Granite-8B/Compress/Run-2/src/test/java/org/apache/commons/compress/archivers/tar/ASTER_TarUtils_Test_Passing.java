/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.tar;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;
public class Aster_TarUtils_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testReadSparseStructs_EmptyBuffer_czgS0() throws Exception {
    byte[] buffer = new byte[0];
    int offset = 0;
    int entries = 0;
    List<TarArchiveStructSparse> actual = null;
    List<TarArchiveStructSparse> expected = new ArrayList<>();
    try {
        actual = TarUtils.readSparseStructs(buffer, offset, entries);
    } catch (IOException e) {
        e.printStackTrace();
    }
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testReadSparseStructs_InvalidOffset_ArCh1() throws Exception {
    byte[] buffer = new byte[100];
    int offset = -1;
    int entries = 1;
    List<TarArchiveStructSparse> actual = null;
    try {
        actual = TarUtils.readSparseStructs(buffer, offset, entries);
    } catch (IOException e) {
        e.printStackTrace();
    }
    assertEquals(0, actual.size());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testReadSparseStructs_InvalidNumBytes_BjjO2() throws Exception {
    byte[] buffer = new byte[100];
    int offset = 0;
    int entries = 1;
    List<TarArchiveStructSparse> actual = null;
    try {
        actual = TarUtils.readSparseStructs(buffer, offset, entries);
    } catch (IOException e) {
        e.printStackTrace();
    }
    assertEquals(0, actual.size());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testReadSparseStructs_ValidInput_KIgt3() throws Exception {
    byte[] buffer = new byte[100];
    int offset = 0;
    int entries = 1;
    List<TarArchiveStructSparse> actual = null;
    List<TarArchiveStructSparse> expected = new ArrayList<>();
    try {
        actual = TarUtils.readSparseStructs(buffer, offset, entries);
    } catch (IOException e) {
        e.printStackTrace();
    }
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testFormatNameBytes_GGuu0() throws Exception {
		assertEquals(0, TarUtils.formatNameBytes("test", new byte[10], 0, 10));
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testParseBoolean_qHiR0() throws Exception {
		byte[] buffer = new byte[1];
		buffer[0] = 1;
		boolean result = TarUtils.parseBoolean(buffer, 0);
		assertTrue(result);
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testParseBooleanFalse_rUya1() throws Exception {
		byte[] buffer = new byte[1];
		buffer[0] = 0;
		boolean result = TarUtils.parseBoolean(buffer, 0);
		assertFalse(result);
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseOctal_woGg0() throws Exception {
        byte[] buffer = new byte[10];
        buffer[0] = '0';
        buffer[1] = '7';
        buffer[2] = '5';
        buffer[3] = '5';
        buffer[4] = ' ';
        buffer[5] = '0';
        buffer[6] = '7';
        buffer[7] = '5';
        buffer[8] = '5';
        buffer[9] = ' ';
        assertEquals(444, TarUtils.parseOctal(buffer, 0, 8));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseOctalWithTrailer_uLTU1() throws Exception {
        byte[] buffer = new byte[10];
        buffer[0] = '0';
        buffer[1] = '7';
        buffer[2] = '5';
        buffer[3] = '5';
        buffer[4] = ' ';
        buffer[5] = '0';
        buffer[6] = '7';
        buffer[7] = '5';
        buffer[8] = '5';
        buffer[9] = ' ';
        assertEquals(444, TarUtils.parseOctal(buffer, 0, 9));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseOctalWithNegativeNumber_xwoq2() throws Exception {
        byte[] buffer = new byte[10];
        buffer[0] = '0';
        buffer[1] = '7';
        buffer[2] = '5';
        buffer[3] = '5';
        buffer[4] = ' ';
        buffer[5] = '0';
        buffer[6] = '7';
        buffer[7] = '5';
        buffer[8] = '5';
        buffer[9] = ' ';
        try {
            TarUtils.parseOctal(buffer, 0, 7);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid byte 32 at offset 6 in '0755 0755 ' len=8", e.getMessage());
        }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseOctalWithInvalidCharacter_pIib3() throws Exception {
        byte[] buffer = new byte[10];
        buffer[0] = '0';
        buffer[1] = '7';
        buffer[2] = '5';
        buffer[3] = '5';
        buffer[4] = ' ';
        buffer[5] = '0';
        buffer[6] = '7';
        buffer[7] = '5';
        buffer[8] = '5';
        buffer[9] = ' ';
        try {
            TarUtils.parseOctal(buffer, 0, 10);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid byte 32 at offset 6 in '0755 0755 ' len=10", e.getMessage());
        }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseOctalWithInvalidLength_pAPC4() throws Exception {
        byte[] buffer = new byte[10];
        buffer[0] = '0';
        buffer[1] = '7';
        buffer[2] = '5';
        buffer[3] = '5';
        buffer[4] = ' ';
        buffer[5] = '0';
        buffer[6] = '7';
        buffer[7] = '5';
        buffer[8] = '5';
        buffer[9] = ' ';
        try {
            TarUtils.parseOctal(buffer, 0, 1);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Length 1 must be at least 2", e.getMessage());
        }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseOctalWithZeroLength_YxlU5() throws Exception {
        byte[] buffer = new byte[10];
        buffer[0] = '0';
        buffer[1] = '7';
        buffer[2] = '5';
        buffer[3] = '5';
        buffer[4] = ' ';
        buffer[5] = '0';
        buffer[6] = '7';
        buffer[7] = '5';
        buffer[8] = '5';
        buffer[9] = ' ';
        assertEquals(0, TarUtils.parseOctal(buffer, 0, 0));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseSparse_zJGU0_1() throws Exception {
        final byte[] buffer = new byte[100]; // Assuming buffer size is 100
        final int offset = 0;
        final TarArchiveStructSparse tarArchiveStructSparse = TarUtils.parseSparse(buffer, offset);
        assertNotNull(tarArchiveStructSparse);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseSparse_zJGU0_2() throws Exception {
        final byte[] buffer = new byte[100]; // Assuming buffer size is 100
        final int offset = 0;
        final TarArchiveStructSparse tarArchiveStructSparse = TarUtils.parseSparse(buffer, offset);
        assertEquals(0L, tarArchiveStructSparse.getOffset());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseSparse_zJGU0_3() throws Exception {
        final byte[] buffer = new byte[100]; // Assuming buffer size is 100
        final int offset = 0;
        final TarArchiveStructSparse tarArchiveStructSparse = TarUtils.parseSparse(buffer, offset);
        assertEquals(0L, tarArchiveStructSparse.getNumbytes());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseOctalOrBinary_JpNX0() throws Exception {
        byte[] buffer = new byte[10];
        int offset = 0;
        int length = 10;
        long result = TarUtils.parseOctalOrBinary(buffer, offset, length);
        assertEquals(0, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testFormatOctalBytes_Csca0() throws Exception {
        byte[] buf = new byte[10];
        assertEquals(10, TarUtils.formatOctalBytes(0, buf, 0, 10));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testComputeCheckSum_JJER0() throws Exception {
        byte[] buf = new byte[10];
        long sum = 0;
        for (int i = 0; i < 10; i++) {
            buf[i] = (byte) i;
            sum += i;
        }
        assertEquals(sum, TarUtils.computeCheckSum(buf));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testComputeCheckSumWithEmptyArray_jOwL1() throws Exception {
        byte[] buf = new byte[0];
        assertEquals(0, TarUtils.computeCheckSum(buf));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFormatCheckSumOctalBytes_HmBe0() throws Exception {
        byte[] buf = new byte[10];
        int offset = 5;
        int length = 8;
        long value = 12345678L;
        int expected = 13;
        int actual = TarUtils.formatCheckSumOctalBytes(value, buf, offset, length);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePaxHeaders_PYtD0() throws IOException {
        final InputStream inputStream = mock(InputStream.class);
        final List<TarArchiveStructSparse> sparseHeaders = new ArrayList<>();
        final Map<String, String> globalPaxHeaders = new HashMap<>();
        final long headerSize = 0;
        final Map<String, String> headers = TarUtils.parsePaxHeaders(inputStream, sparseHeaders, globalPaxHeaders, headerSize);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFormatLongOctalOrBinaryBytes1_uJSN0() throws Exception {
        long value = 0;
        byte[] buf = new byte[10];
        int offset = 0;
        int length = 10;
        int result = TarUtils.formatLongOctalOrBinaryBytes(value, buf, offset, length);
        assertEquals(10, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFormatLongOctalOrBinaryBytes2_zPVL1() throws Exception {
        long value = 1234567890L;
        byte[] buf = new byte[10];
        int offset = 0;
        int length = 10;
        int result = TarUtils.formatLongOctalOrBinaryBytes(value, buf, offset, length);
        assertEquals(10, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFormatLongOctalOrBinaryBytes3_wBBE2() throws Exception {
        long value = -1234567890L;
        byte[] buf = new byte[10];
        int offset = 0;
        int length = 10;
        int result = TarUtils.formatLongOctalOrBinaryBytes(value, buf, offset, length);
        assertEquals(10, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFormatLongOctalOrBinaryBytes4_wrQB3() throws Exception {
        long value = 1234567890L;
        byte[] buf = new byte[10];
        int offset = 0;
        int length = 9;
        int result = TarUtils.formatLongOctalOrBinaryBytes(value, buf, offset, length);
        assertEquals(9, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFormatLongOctalOrBinaryBytes5_ujCS4() throws Exception {
        long value = -1234567890L;
        byte[] buf = new byte[10];
        int offset = 0;
        int length = 9;
        int result = TarUtils.formatLongOctalOrBinaryBytes(value, buf, offset, length);
        assertEquals(9, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFormatLongOctalOrBinaryBytes6_GSxY5() throws Exception {
        long value = 1234567890L;
        byte[] buf = new byte[10];
        int offset = 0;
        int length = 8;
        int result = TarUtils.formatLongOctalOrBinaryBytes(value, buf, offset, length);
        assertEquals(8, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFormatLongOctalOrBinaryBytes7_yLnW6() throws Exception {
        long value = -1234567890L;
        byte[] buf = new byte[10];
        int offset = 0;
        int length = 8;
        int result = TarUtils.formatLongOctalOrBinaryBytes(value, buf, offset, length);
        assertEquals(8, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFormatLongOctalOrBinaryBytes8_UGRj7() throws Exception {
        long value = 1234567890L;
        byte[] buf = new byte[10];
        int offset = 0;
        int length = 7;
        int result = TarUtils.formatLongOctalOrBinaryBytes(value, buf, offset, length);
        assertEquals(7, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFormatLongOctalOrBinaryBytes9_ZPTt8() throws Exception {
        long value = -1234567890L;
        byte[] buf = new byte[10];
        int offset = 0;
        int length = 7;
        int result = TarUtils.formatLongOctalOrBinaryBytes(value, buf, offset, length);
        assertEquals(7, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFormatLongOctalOrBinaryBytes10_jnJF9() throws Exception {
        long value = 1234567890L;
        byte[] buf = new byte[10];
        int offset = 0;
        int length = 6;
        int result = TarUtils.formatLongOctalOrBinaryBytes(value, buf, offset, length);
        assertEquals(6, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFormatUnsignedOctalString_pCGK0() throws Exception {
        byte[] buffer = new byte[10];
       TarUtils.formatUnsignedOctalString(0, buffer, 0, 10);
        assertEquals("000000000", new String(buffer));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFormatUnsignedOctalString1_lnjB1() throws Exception {
        byte[] buffer = new byte[10];
       TarUtils.formatUnsignedOctalString(1, buffer, 0, 10);
        assertEquals("000000001", new String(buffer));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFormatUnsignedOctalString2_qCxf2() throws Exception {
        byte[] buffer = new byte[10];
       TarUtils.formatUnsignedOctalString(2, buffer, 0, 10);
        assertEquals("000000002", new String(buffer));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFormatUnsignedOctalString3_GiPP3() throws Exception {
        byte[] buffer = new byte[10];
       TarUtils.formatUnsignedOctalString(3, buffer, 0, 10);
        assertEquals("000000003", new String(buffer));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFormatUnsignedOctalString4_Juws4() throws Exception {
        byte[] buffer = new byte[10];
       TarUtils.formatUnsignedOctalString(4, buffer, 0, 10);
        assertEquals("000000004", new String(buffer));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFormatUnsignedOctalString5_NVUO5() throws Exception {
        byte[] buffer = new byte[10];
       TarUtils.formatUnsignedOctalString(5, buffer, 0, 10);
        assertEquals("000000005", new String(buffer));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFormatUnsignedOctalString6_Bquh6() throws Exception {
        byte[] buffer = new byte[10];
       TarUtils.formatUnsignedOctalString(6, buffer, 0, 10);
        assertEquals("000000006", new String(buffer));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFormatUnsignedOctalString7_qzTc7() throws Exception {
        byte[] buffer = new byte[10];
       TarUtils.formatUnsignedOctalString(7, buffer, 0, 10);
        assertEquals("000000007", new String(buffer));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFormatUnsignedOctalString8_MzAz8() throws Exception {
        byte[] buffer = new byte[10];
       TarUtils.formatUnsignedOctalString(8, buffer, 0, 10);
        assertEquals("000000010", new String(buffer));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFormatUnsignedOctalString9_GUDm9() throws Exception {
        byte[] buffer = new byte[10];
       TarUtils.formatUnsignedOctalString(9, buffer, 0, 10);
        assertEquals("000000011", new String(buffer));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFormatUnsignedOctalString10_ZXpg10() throws Exception {
        byte[] buffer = new byte[10];
       TarUtils.formatUnsignedOctalString(10, buffer, 0, 10);
        assertEquals("000000012", new String(buffer));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFormatUnsignedOctalString11_qsFf11() throws Exception {
        byte[] buffer = new byte[10];
       TarUtils.formatUnsignedOctalString(11, buffer, 0, 10);
        assertEquals("000000013", new String(buffer));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFormatUnsignedOctalString12_DjbA12() throws Exception {
        byte[] buffer = new byte[10];
       TarUtils.formatUnsignedOctalString(12, buffer, 0, 10);
        assertEquals("000000014", new String(buffer));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFormatUnsignedOctalString13_yNtP13() throws Exception {
        byte[] buffer = new byte[10];
       TarUtils.formatUnsignedOctalString(13, buffer, 0, 10);
        assertEquals("000000015", new String(buffer));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFormatUnsignedOctalString14_dbdR14() throws Exception {
        byte[] buffer = new byte[10];
       TarUtils.formatUnsignedOctalString(14, buffer, 0, 10);
        assertEquals("000000016", new String(buffer));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testParseName_Lria0() throws Exception {
        final byte[] buffer = new byte[10];
        assertEquals("test", TarUtils.parseName(buffer, 0, 4));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFormatLongOctalBytes_zjkI0() throws Exception {
        byte[] buf = new byte[12];
        int offset = 0;
        int length = 12;
        long value = 1234567890L;
        int expected = 12;
        int actual = TarUtils.formatLongOctalBytes(value, buf, offset, length);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseFromPAX01SparseHeaders_xyfC0() throws Exception {
        final String sparseMap = "100,200,300,400";
        final List<TarArchiveStructSparse> expectedSparseHeaders = new ArrayList<>();
        expectedSparseHeaders.add(new TarArchiveStructSparse(100, 200));
        expectedSparseHeaders.add(new TarArchiveStructSparse(300, 400));
        final List<TarArchiveStructSparse> actualSparseHeaders = TarUtils.parseFromPAX01SparseHeaders(sparseMap);
        assertEquals(expectedSparseHeaders, actualSparseHeaders);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseFromPAX01SparseHeadersWithInvalidSparseMap_NpcE1() throws Exception {
        final String sparseMap = "100,200,300";
        try {
            TarUtils.parseFromPAX01SparseHeaders(sparseMap);
            fail("Expected IOException");
        } catch (final IOException e) {
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseFromPAX01SparseHeadersWithNegativeOffset_tMvq2() throws Exception {
        final String sparseMap = "-100,200";
        try {
            TarUtils.parseFromPAX01SparseHeaders(sparseMap);
            fail("Expected IOException");
        } catch (final IOException e) {
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseFromPAX01SparseHeadersWithNegativeNumbytes_BvyT3() throws Exception {
        final String sparseMap = "100,-200";
        try {
            TarUtils.parseFromPAX01SparseHeaders(sparseMap);
            fail("Expected IOException");
        } catch (final IOException e) {
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseFromPAX01SparseHeadersWithEmptySparseMap_wmVu4() throws Exception {
        final String sparseMap = "";
        final List<TarArchiveStructSparse> actualSparseHeaders = TarUtils.parseFromPAX01SparseHeaders(sparseMap);
        assertTrue(actualSparseHeaders.isEmpty());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseFromPAX01SparseHeadersWithNullSparseMap_GSDA5() throws Exception {
        final List<TarArchiveStructSparse> actualSparseHeaders = TarUtils.parseFromPAX01SparseHeaders(null);
        assertTrue(actualSparseHeaders.isEmpty());
    }
}