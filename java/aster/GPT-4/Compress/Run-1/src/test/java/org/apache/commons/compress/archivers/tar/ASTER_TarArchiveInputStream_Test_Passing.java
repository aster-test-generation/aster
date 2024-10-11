/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.tar;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import java.io.InputStream;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_TarArchiveInputStream_Test_Passing {
private TarArchiveEntry currEntry;
private TarArchiveInputStream tarArchiveInputStream;
private byte[] createTarHeaderWithGNULongNameEntry() {
    String longName = "././@LongLink00000000000longfilename/";
    byte[] header = new byte[512];
    System.arraycopy(longName.getBytes(), 0, header, 0, longName.length());
    return header;
}
    private byte[] createTarHeaderWithGlobalPaxHeader() {
        return new byte[512]; // Placeholder for actual header data
    }
private byte[] createTarHeaderWithOldGNUSparse() {
    return new byte[512]; // Dummy header size for tar entries
}
private byte[] createTarHeaderWithIncompleteLongLinkData() {
    byte[] header = new byte[512]; // Default size of a tar header block
    Arrays.fill(header, (byte) 0);
    header[156] = 'L';
    return header;
}
private byte[] createTarHeaderWithIncompleteLongNameData() {
    return new byte[512]; // A tar block is 512 bytes
}
private byte[] createTarHeaderWithSparseHeaders() {
    return new byte[512]; // Dummy header size for tar entries
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMatches_PosixTrue_xSDL0() {
        byte[] signature = new byte[512];
        System.arraycopy(TarConstants.MAGIC_POSIX.getBytes(), 0, signature, TarConstants.MAGIC_OFFSET, TarConstants.MAGICLEN);
        System.arraycopy(TarConstants.VERSION_POSIX.getBytes(), 0, signature, TarConstants.VERSION_OFFSET, TarConstants.VERSIONLEN);
        assertTrue(TarArchiveInputStream.matches(signature, signature.length));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMatches_GnuTrue_SpaceVersion_OIeJ1() {
        byte[] signature = new byte[512];
        System.arraycopy(TarConstants.MAGIC_GNU.getBytes(), 0, signature, TarConstants.MAGIC_OFFSET, TarConstants.MAGICLEN);
        System.arraycopy(TarConstants.VERSION_GNU_SPACE.getBytes(), 0, signature, TarConstants.VERSION_OFFSET, TarConstants.VERSIONLEN);
        assertTrue(TarArchiveInputStream.matches(signature, signature.length));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMatches_GnuTrue_ZeroVersion_qAsv2() {
        byte[] signature = new byte[512];
        System.arraycopy(TarConstants.MAGIC_GNU.getBytes(), 0, signature, TarConstants.MAGIC_OFFSET, TarConstants.MAGICLEN);
        System.arraycopy(TarConstants.VERSION_GNU_ZERO.getBytes(), 0, signature, TarConstants.VERSION_OFFSET, TarConstants.VERSIONLEN);
        assertTrue(TarArchiveInputStream.matches(signature, signature.length));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMatches_AntTrue_tiSU3() {
        byte[] signature = new byte[512];
        System.arraycopy(TarConstants.MAGIC_ANT.getBytes(), 0, signature, TarConstants.MAGIC_OFFSET, TarConstants.MAGICLEN);
        System.arraycopy(TarConstants.VERSION_ANT.getBytes(), 0, signature, TarConstants.VERSION_OFFSET, TarConstants.VERSIONLEN);
        assertTrue(TarArchiveInputStream.matches(signature, signature.length));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMatches_FalseShortLength_VkPk4() {
        byte[] signature = new byte[10];
        assertFalse(TarArchiveInputStream.matches(signature, signature.length));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMatches_FalseWrongMagic_LWew5() {
        byte[] signature = new byte[512];
        System.arraycopy("WrongMagic".getBytes(), 0, signature, TarConstants.MAGIC_OFFSET, "WrongMagic".length());
        System.arraycopy(TarConstants.VERSION_POSIX.getBytes(), 0, signature, TarConstants.VERSION_OFFSET, TarConstants.VERSIONLEN);
        assertFalse(TarArchiveInputStream.matches(signature, signature.length));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMatches_FalseWrongVersion_uJhW6() {
        byte[] signature = new byte[512];
        System.arraycopy(TarConstants.MAGIC_POSIX.getBytes(), 0, signature, TarConstants.MAGIC_OFFSET, TarConstants.MAGICLEN);
        System.arraycopy("WrongVersion".getBytes(), 0, signature, TarConstants.VERSION_OFFSET, "WrongVersion".length());
        assertFalse(TarArchiveInputStream.matches(signature, signature.length));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMatches_FalseBothWrong_axIG7() {
        byte[] signature = new byte[512];
        System.arraycopy("WrongMagic".getBytes(), 0, signature, TarConstants.MAGIC_OFFSET, "WrongMagic".length());
        System.arraycopy("WrongVersion".getBytes(), 0, signature, TarConstants.VERSION_OFFSET, "WrongVersion".length());
        assertFalse(TarArchiveInputStream.matches(signature, signature.length));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMatches_FalseCorrectLengthButAllWrong_jOba8() {
        byte[] signature = new byte[512];
        assertFalse(TarArchiveInputStream.matches(signature, signature.length));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsEOFRecordWithNullRecord_BJAb0() {
    TarArchiveInputStream tarInputStream = new TarArchiveInputStream(System.in);
    byte[] record = null;
    assertTrue(tarInputStream.isEOFRecord(record));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsEOFRecordWithEmptyRecord_xURa1() {
    TarArchiveInputStream tarInputStream = new TarArchiveInputStream(System.in, 1024, "UTF-8");
    byte[] record = new byte[tarInputStream.getRecordSize()];
    Arrays.fill(record, (byte) 0);
    assertTrue(tarInputStream.isEOFRecord(record));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsEOFRecordWithNonEmptyRecord_wUcu2() {
    TarArchiveInputStream tarInputStream = new TarArchiveInputStream(System.in, 1024, 512, "UTF-8");
    byte[] record = new byte[tarInputStream.getRecordSize()];
    Arrays.fill(record, (byte) 1); // Non-zero byte to simulate non-empty record
    assertFalse(tarInputStream.isEOFRecord(record));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetCurrentEntry() throws Exception {
        // Mocking the InputStream as it's required by TarArchiveInputStream constructor
        InputStream inputStream = mock(InputStream.class);
        // Initialize TarArchiveInputStream with the mocked InputStream
        tarArchiveInputStream = new TarArchiveInputStream(inputStream);
        // Mocking TarArchiveEntry as well
        currEntry = mock(TarArchiveEntry.class);
        // Set the current entry using the method to be tested
        tarArchiveInputStream.setCurrentEntry(currEntry);
        // Use reflection to access the private field 'currEntry'
        java.lang.reflect.Field field = tarArchiveInputStream.getClass().getDeclaredField("currEntry");
        field.setAccessible(true);
        TarArchiveEntry result = (TarArchiveEntry) field.get(tarArchiveInputStream);
        // Assert that the set entry is the same as the one we put in
        assertEquals(currEntry, result, "The current entry should match the one set.");
    }
}