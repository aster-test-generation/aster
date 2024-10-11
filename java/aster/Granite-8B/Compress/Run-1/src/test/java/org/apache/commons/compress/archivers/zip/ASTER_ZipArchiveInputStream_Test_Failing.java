/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.zip;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import org.apache.commons.compress.archivers.ArchiveEntry;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_ZipArchiveInputStream_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test1_fnvG0() {
        ZipArchiveInputStream zipArchiveInputStream = new ZipArchiveInputStream(null);
        long compressedCount = zipArchiveInputStream.getCompressedCount();
        assertEquals(0, compressedCount);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test2_BDsP1() {
        ZipArchiveInputStream zipArchiveInputStream = new ZipArchiveInputStream(null, null, false, false, false);
        long compressedCount = zipArchiveInputStream.getCompressedCount();
        assertEquals(0, compressedCount);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test3_dwyA2() {
        ZipArchiveInputStream zipArchiveInputStream = new ZipArchiveInputStream(null, null, false);
        long compressedCount = zipArchiveInputStream.getCompressedCount();
        assertEquals(0, compressedCount);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test4_hzro3() {
        ZipArchiveInputStream zipArchiveInputStream = new ZipArchiveInputStream(null, null, false, false);
        long compressedCount = zipArchiveInputStream.getCompressedCount();
        assertEquals(0, compressedCount);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test5_VCuG4() {
        ZipArchiveInputStream zipArchiveInputStream = new ZipArchiveInputStream(null, null);
        long compressedCount = zipArchiveInputStream.getCompressedCount();
        assertEquals(0, compressedCount);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNextZipEntry_whenCentralDirectory_returnsNull_mOwg1() throws IOException {
    byte[] data = new byte[ZipFile.MIN_EOCD_SIZE];
    ZipArchiveInputStream in = new ZipArchiveInputStream(new ByteArrayInputStream(data));
    ZipArchiveEntry entry = in.getNextZipEntry();
    Assertions.assertNull(entry);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanReadEntryData_WithZipArchiveEntry_ReturnsFalse_WhenEntryUsesUnknownMethod_EjEQ7() {
        ZipArchiveInputStream zipArchiveInputStream = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        ZipArchiveEntry zipArchiveEntry = new ZipArchiveEntry();
        zipArchiveEntry.setMethod(-1);
        assertFalse(zipArchiveInputStream.canReadEntryData(zipArchiveEntry));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testRead_bufferNull_RrdY0() throws IOException {
    ZipArchiveInputStream zais = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]));
    try {
        zais.read(null, 0, 1);
        fail("Expected IllegalArgumentException");
    } catch (IllegalArgumentException ex) {
        // Add assertion here
        // For example:
        // assertEquals(expectedValue, actualValue);
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testRead_offsetNegative_pufy1() throws IOException {
    ZipArchiveInputStream zais = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]));
    try {
        zais.read(new byte[1], -1, 1);
        fail("Expected ArrayIndexOutOfBoundsException");
    } catch (ArrayIndexOutOfBoundsException ex) {
        // Add your assertion here
        // For example:
        // assertEquals(expectedValue, actualValue);
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testRead_lengthNegative_hFSK2() throws IOException {
    ZipArchiveInputStream zais = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]));
    try {
        zais.read(new byte[1], 0, -1);
        fail("Expected IllegalArgumentException");
    } catch (IllegalArgumentException ex) {
        // Add assertion here to check if the exception is thrown correctly
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testRead_offsetTooLarge_FzMq3() throws IOException {
    ZipArchiveInputStream zais = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]));
    try {
        zais.read(new byte[1], 1, 1);
        fail("Expected ArrayIndexOutOfBoundsException");
    } catch (ArrayIndexOutOfBoundsException ex) {
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testRead_lengthTooLarge_jusp4() throws IOException {
    ZipArchiveInputStream zais = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]));
    try {
        zais.read(new byte[1], 0, 2);
        fail("Expected IllegalArgumentException");
    } catch (IllegalArgumentException ex) {
        // Add assertion here to check if the exception is thrown correctly
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testRead_noCurrentEntry_kFNC6() throws IOException {
    ZipArchiveInputStream zais = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]));
    try {
        zais.read(new byte[1], 0, 1);
        fail("Expected IllegalStateException");
    } catch (IllegalStateException ex) {
        // Add your assertion here
        // For example:
        // assertEquals(expectedValue, actualValue);
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMatches2_KKec1_fid1() {
        byte[] signature = new byte[4];
        int length = 4;
        boolean result = ZipArchiveInputStream.matches(signature, length);
        assertTrue(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMatches4_gTYk3_fid1() {
        byte[] signature = new byte[4];
        int length = 10;
        boolean result = ZipArchiveInputStream.matches(signature, length);
        assertTrue(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMatches5_rEoa4_fid1() {
        byte[] signature = new byte[4];
        int length = 20;
        boolean result = ZipArchiveInputStream.matches(signature, length);
        assertTrue(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMatches6_rrZn5_fid1() {
        byte[] signature = new byte[4];
        int length = 30;
        boolean result = ZipArchiveInputStream.matches(signature, length);
        assertTrue(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanReadEntryDataWithZipArchiveEntry_OUZz0_fid1() {
        ZipArchiveInputStream zipArchiveInputStream = new ZipArchiveInputStream(null);
        ArchiveEntry archiveEntry = new ZipArchiveEntry();
        boolean result = zipArchiveInputStream.canReadEntryData(archiveEntry);
        assertTrue(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanReadEntryDataWithZipArchiveEntryAndStoredMethod_oLoJ2_fid1() {
        ZipArchiveInputStream zipArchiveInputStream = new ZipArchiveInputStream(null, null, false, true);
        ZipArchiveEntry zipArchiveEntry = new ZipArchiveEntry();
        zipArchiveEntry.setMethod(ZipEntry.STORED);
        boolean result = zipArchiveInputStream.canReadEntryData(zipArchiveEntry);
        assertTrue(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanReadEntryData_WithZipArchiveEntry_ReturnsFalse_WhenEntryUsesDeflateMethodAndNoDataDescriptor_AkqY3_fid1() {
        ZipArchiveInputStream zipArchiveInputStream = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        ZipArchiveEntry zipArchiveEntry = new ZipArchiveEntry();
        zipArchiveEntry.setMethod(ZipEntry.DEFLATED);
        assertFalse(zipArchiveInputStream.canReadEntryData(zipArchiveEntry));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanReadEntryData_WithZipArchiveEntry_ReturnsFalse_WhenEntryUsesEnhancedDeflateMethodAndNoDataDescriptor_YKpe4_fid1() {
        ZipArchiveInputStream zipArchiveInputStream = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        ZipArchiveEntry zipArchiveEntry = new ZipArchiveEntry();
        zipArchiveEntry.setMethod(ZipMethod.ENHANCED_DEFLATED.getCode());
        assertFalse(zipArchiveInputStream.canReadEntryData(zipArchiveEntry));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testRead_bufferNull_RrdY0_fid1() throws IOException {
    ZipArchiveInputStream zais = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]));
    try {
        zais.read(null, 0, 1);
        fail("Expected IllegalArgumentException");
    } catch (IllegalArgumentException ex) {
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testRead_offsetNegative_puFy1() throws IOException {
    ZipArchiveInputStream zais = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]));
    try {
        zais.read(new byte[1], -1, 1);
        fail("Expected ArrayIndexOutOfBoundsException");
    } catch (ArrayIndexOutOfBoundsException ex) {
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testRead_lengthNegative_hFSK2_fid1() throws IOException {
    ZipArchiveInputStream zais = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]));
    try {
        zais.read(new byte[1], 0, -1);
        fail("Expected IllegalArgumentException");
    } catch (IllegalArgumentException ex) {
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testRead_lengthTooLarge_jusp4_fid1() throws IOException {
    ZipArchiveInputStream zais = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]));
    try {
        zais.read(new byte[1], 0, 2);
        fail("Expected IllegalArgumentException");
    } catch (IllegalArgumentException ex) {
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testRead_noCurrentEntry_kFNC6_fid1() throws IOException {
    ZipArchiveInputStream zais = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]));
    try {
        zais.read(new byte[1], 0, 1);
        fail("Expected IllegalStateException");
    } catch (IllegalStateException ex) {
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSkipWithPositiveValue_jqsM0_JXsw0_fid1() {
    ZipArchiveInputStream zipArchiveInputStream = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[10]));
    try {
        long skipped = zipArchiveInputStream.skip(5);
        assertEquals(5, skipped);
    } catch (IOException e) {
        e.printStackTrace();
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSkipWithLargeValue_fyor3_oObP0_fid1() {
    ZipArchiveInputStream zipArchiveInputStream = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[10]));
    try {
        long skipped = zipArchiveInputStream.skip(100);
        assertEquals(10, skipped);
    } catch (IOException e) {
        e.printStackTrace();
    }
}
}