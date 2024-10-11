/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.ar;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_ArArchiveOutputStream_Test_Failing {
private OutputStream out;
private ArArchiveOutputStream arArchiveOutputStream;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateArchiveEntry_1_vQPF0() throws IOException {
        ArArchiveOutputStream arArchiveOutputStream = new ArArchiveOutputStream(null);
        Path inputPath = null;
        String entryName = "entryName";
        LinkOption[] options = {};
        ArArchiveEntry result = arArchiveOutputStream.createArchiveEntry(inputPath, entryName, options);
        assertNotNull(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateArchiveEntry_2_hLOl1() throws IOException {
        ArArchiveOutputStream arArchiveOutputStream = new ArArchiveOutputStream(null);
        Path inputPath = null;
        String entryName = "entryName";
        LinkOption[] options = {};
        ArArchiveEntry result = arArchiveOutputStream.createArchiveEntry(inputPath, entryName, options);
        assertEquals(0, result.getLastModifiedDate().getTime());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateArchiveEntry_3_xUHE2() throws IOException {
        ArArchiveOutputStream arArchiveOutputStream = new ArArchiveOutputStream(null);
        Path inputPath = null;
        String entryName = "entryName";
        LinkOption[] options = {};
        ArArchiveEntry result = arArchiveOutputStream.createArchiveEntry(inputPath, entryName, options);
        assertEquals(0, result.getGroupId());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateArchiveEntry_4_CqaR3() throws IOException {
        ArArchiveOutputStream arArchiveOutputStream = new ArArchiveOutputStream(null);
        Path inputPath = null;
        String entryName = "entryName";
        LinkOption[] options = {};
        ArArchiveEntry result = arArchiveOutputStream.createArchiveEntry(inputPath, entryName, options);
        assertEquals(0, result.getSize());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateArchiveEntry_5_bNfj4() throws IOException {
        ArArchiveOutputStream arArchiveOutputStream = new ArArchiveOutputStream(null);
        Path inputPath = null;
        String entryName = "entryName";
        LinkOption[] options = {};
        ArArchiveEntry result = arArchiveOutputStream.createArchiveEntry(inputPath, entryName, options);
        assertEquals(0, result.getUserId());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateArchiveEntry_6_iMPw5() throws IOException {
        ArArchiveOutputStream arArchiveOutputStream = new ArArchiveOutputStream(null);
        Path inputPath = null;
        String entryName = "entryName";
        LinkOption[] options = {};
        ArArchiveEntry result = arArchiveOutputStream.createArchiveEntry(inputPath, entryName, options);
        assertEquals(0, result.hashCode());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateArchiveEntry_7_vBbL6() throws IOException {
        ArArchiveOutputStream arArchiveOutputStream = new ArArchiveOutputStream(null);
        Path inputPath = null;
        String entryName = "entryName";
        LinkOption[] options = {};
        ArArchiveEntry result = arArchiveOutputStream.createArchiveEntry(inputPath, entryName, options);
        assertEquals("", result.getName());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateArchiveEntry_8_CafY7() throws IOException {
        ArArchiveOutputStream arArchiveOutputStream = new ArArchiveOutputStream(null);
        Path inputPath = null;
        String entryName = "entryName";
        LinkOption[] options = {};
        ArArchiveEntry result = arArchiveOutputStream.createArchiveEntry(inputPath, entryName, options);
        assertEquals(0, result.getLength());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateArchiveEntry_9_FiMr8() throws IOException {
        ArArchiveOutputStream arArchiveOutputStream = new ArArchiveOutputStream(null);
        Path inputPath = null;
        String entryName = "entryName";
        LinkOption[] options = {};
        ArArchiveEntry result = arArchiveOutputStream.createArchiveEntry(inputPath, entryName, options);
        assertEquals(0, result.getMode());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateArchiveEntry_10_HZiV9() throws IOException {
        ArArchiveOutputStream arArchiveOutputStream = new ArArchiveOutputStream(null);
        Path inputPath = null;
        String entryName = "entryName";
        LinkOption[] options = {};
        ArArchiveEntry result = arArchiveOutputStream.createArchiveEntry(inputPath, entryName, options);
        assertEquals(0, result.getLastModified());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCloseArchiveEntry_ICEf0() throws IOException {
        ArArchiveOutputStream arArchiveOutputStream = new ArArchiveOutputStream(null);
        arArchiveOutputStream.closeArchiveEntry();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMode_rWIC9_fid2() {
        ArArchiveEntry entry = new ArArchiveEntry("file", 100L);
        assertEquals(0, entry.getMode());
    }
}