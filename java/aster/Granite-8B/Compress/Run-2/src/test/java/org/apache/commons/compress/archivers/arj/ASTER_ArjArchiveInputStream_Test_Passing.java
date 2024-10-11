/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.arj;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_ArjArchiveInputStream_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatchesWithInvalidSignature_PDjN1() {
    byte[] signature = {0x00, 0x00, 0x00, 0x00}; // invalid ARJ signature
    boolean result = ArjArchiveInputStream.matches(signature, 4);
    assertFalse(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatchesWithShortSignature_Eyhm2() {
    byte[] signature = {0x61, 0x72, 0x6A}; // short signature
    boolean result = ArjArchiveInputStream.matches(signature, 3);
    assertFalse(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatchesWithNullSignature_DXfO3() {
    byte[] signature = null;
    boolean result = ArjArchiveInputStream.matches(signature, 0);
    assertFalse(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLastModifiedDate_mMta0() {
        ArjArchiveEntry entry = new ArjArchiveEntry();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLastModifiedDate_tWPs0() {
        ArjArchiveEntry entry = new ArjArchiveEntry();
        Date lastModifiedDate = entry.getLastModifiedDate();
        assertNotNull(lastModifiedDate);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSize_ceHA1() {
        ArjArchiveEntry entry = new ArjArchiveEntry();
        long size = entry.getSize();
        assertTrue(size >= 0);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetHostOs_sufA2() {
        ArjArchiveEntry entry = new ArjArchiveEntry();
        int hostOs = entry.getHostOs();
        assertTrue(hostOs >= 0);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCode_cZQp3() {
        ArjArchiveEntry entry = new ArjArchiveEntry();
        int hashCode = entry.hashCode();
        assertTrue(hashCode >= 0);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetUnixMode_Kirc4() {
        ArjArchiveEntry entry = new ArjArchiveEntry();
        int unixMode = entry.getUnixMode();
        assertTrue(unixMode >= 0);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMode_lZnY6() {
        ArjArchiveEntry entry = new ArjArchiveEntry();
        int mode = entry.getMode();
        assertTrue(mode >= 0);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatchesWithValidSignature_FncR0_fid2() {
    byte[] signature = {0x61, 0x72, 0x6A, 0x21}; // valid ARJ signature
    boolean result = ArjArchiveInputStream.matches(signature, 4);
    assertFalse(result);
}
}