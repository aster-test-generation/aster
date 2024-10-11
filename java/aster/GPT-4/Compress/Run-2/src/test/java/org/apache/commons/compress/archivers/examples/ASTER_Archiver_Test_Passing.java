/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.examples;

import org.apache.commons.compress.archivers.ArchiveException;
import org.apache.commons.compress.archivers.sevenz.SevenZOutputFile;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.io.File;
import java.io.IOException;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_Archiver_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreate_hZuw0() throws IOException {
        File tempDir = Files.createTempDirectory("testArchive").toFile();
        File archiveFile = new File(tempDir, "test.7z");
        SevenZOutputFile sevenZOutputFile = new SevenZOutputFile(archiveFile);
        Archiver archiver = new Archiver();
        archiver.create(sevenZOutputFile, tempDir);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreate_EYIg0_1() throws IOException, ArchiveException {
        Archiver archiver = new Archiver();
        Path directory = Files.createTempDirectory("testDir");
        Path archiveFile = Files.createTempFile("testArchive", ".zip");
        SeekableByteChannel target = Files.newByteChannel(archiveFile);
        archiver.create("zip", target, directory.toFile());
        assertTrue(Files.exists(archiveFile));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreate_EYIg0_2() throws IOException, ArchiveException {
        Archiver archiver = new Archiver();
        Path directory = Files.createTempDirectory("testDir");
        Path archiveFile = Files.createTempFile("testArchive", ".zip");
        SeekableByteChannel target = Files.newByteChannel(archiveFile);
        archiver.create("zip", target, directory.toFile());
        assertTrue(Files.size(archiveFile) > 0);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateWithValidParameters_blPs0() throws IOException, ArchiveException {
    Archiver archiver = new Archiver();
    File target = new File("path/to/target.zip");
    File directory = new File("path/to/directory");
    archiver.create("zip", target, directory);
    assertTrue(target.exists());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateWithSeekableChannel_ONSy0() throws IOException, ArchiveException {
        Archiver archiver = new Archiver();
        String format = "zip";
        Path target = Files.createTempFile("testArchive", ".zip");
        Path directory = Files.createTempDirectory("testDir");
        archiver.create(format, target, directory);
        assertTrue(Files.exists(target));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateWithOutputStream_URFo1() throws IOException, ArchiveException {
        Archiver archiver = new Archiver();
        String format = "tar";
        Path target = Files.createTempFile("testArchive", ".tar");
        Path directory = Files.createTempDirectory("testDir");
        archiver.create(format, target, directory);
        assertTrue(Files.exists(target));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateWithEmptyDirectory_QaTm5() throws IOException, ArchiveException {
        Archiver archiver = new Archiver();
        String format = "zip";
        Path target = Files.createTempFile("testArchive", ".zip");
        Path directory = Files.createTempDirectory("emptyTestDir");
        archiver.create(format, target, directory);
        assertTrue(Files.size(target) > 0);
    }
}