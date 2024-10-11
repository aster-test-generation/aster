/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.sevenz;
import java.io.File;
import java.io.IOException;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_SevenZOutputFile_Test_Failing {
private SevenZOutputFile sevenZOutputFile;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testWriteInt_hwYk0() throws IOException {
        SevenZOutputFile sevenZOutputFile = new SevenZOutputFile(new File("test.7z"));
        sevenZOutputFile.write(1);
        sevenZOutputFile.close();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testWriteByteArray_hoFS1() throws IOException {
        SevenZOutputFile sevenZOutputFile = new SevenZOutputFile(new File("test.7z"));
        sevenZOutputFile.write(new byte[10]);
        sevenZOutputFile.close();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testWriteByteArrayWithOffsetAndLength_uPtL2() throws IOException {
        SevenZOutputFile sevenZOutputFile = new SevenZOutputFile(new File("test.7z"));
        sevenZOutputFile.write(new byte[10], 0, 10);
        sevenZOutputFile.close();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFinish_OAjY0_2() throws IOException {
        Path tempFile = Files.createTempFile("test", ".7z");
        SeekableByteChannel channel = Files.newByteChannel(tempFile, StandardOpenOption.WRITE);
        SevenZOutputFile sevenZOutputFile = new SevenZOutputFile(channel);
        sevenZOutputFile.finish();
        Files.delete(tempFile);
        assertTrue(Files.size(tempFile) > 0);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFinishWithPassword_agnD1_2() throws IOException {
        Path tempFile = Files.createTempFile("test", ".7z");
        SeekableByteChannel channel = Files.newByteChannel(tempFile, StandardOpenOption.WRITE);
        SevenZOutputFile sevenZOutputFile = new SevenZOutputFile(channel, "password".toCharArray());
        sevenZOutputFile.finish();
        Files.delete(tempFile);
        assertTrue(Files.size(tempFile) > 0);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWriteWithChannelAndPassword_ystu2() throws IOException {
        SeekableByteChannel channel = null; // Initialize the channel
        char[] password = "password".toCharArray();
        SevenZOutputFile sevenZOutputFile = new SevenZOutputFile(channel, password);
        assertNotNull(sevenZOutputFile);
        sevenZOutputFile.close();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWriteWithChannel_SPpH3() throws IOException {
        SeekableByteChannel channel = null; // Initialize the channel
        SevenZOutputFile sevenZOutputFile = new SevenZOutputFile(channel);
        assertNotNull(sevenZOutputFile);
        sevenZOutputFile.close();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPutArchiveEntry_WGSW0_oFhs0() throws IOException {
        SevenZOutputFile sevenZOutputFile = new SevenZOutputFile(new File("test.7z"));
        SevenZArchiveEntry archiveEntry = new SevenZArchiveEntry();
        sevenZOutputFile.putArchiveEntry(archiveEntry);
        sevenZOutputFile.close();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFinish_OAjY0_1_fid1() throws IOException {
        Path tempFile = Files.createTempFile("test", ".7z");
        SeekableByteChannel channel = Files.newByteChannel(tempFile, StandardOpenOption.WRITE);
        SevenZOutputFile sevenZOutputFile = new SevenZOutputFile(channel);
        sevenZOutputFile.finish();
        Files.delete(tempFile);
        assertTrue(Files.exists(tempFile));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFinishWithPassword_agnD1_1_fid1() throws IOException {
        Path tempFile = Files.createTempFile("test", ".7z");
        SeekableByteChannel channel = Files.newByteChannel(tempFile, StandardOpenOption.WRITE);
        SevenZOutputFile sevenZOutputFile = new SevenZOutputFile(channel, "password".toCharArray());
        sevenZOutputFile.finish();
        Files.delete(tempFile);
        assertTrue(Files.exists(tempFile));}
}