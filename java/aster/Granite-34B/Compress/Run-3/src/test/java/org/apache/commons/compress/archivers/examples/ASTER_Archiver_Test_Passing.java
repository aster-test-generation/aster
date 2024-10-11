/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.examples;
import java.io.File;
import java.io.IOException;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Path;
import org.apache.commons.compress.archivers.ArchiveException;
import org.apache.commons.compress.archivers.ArchiveStreamFactory;
import org.apache.commons.compress.archivers.sevenz.SevenZOutputFile;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_Archiver_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreate_eWit0() throws IOException {
        SevenZOutputFile target = new SevenZOutputFile(new File("test.7z"));
        File directory = new File("directory");
        Archiver archiver = new Archiver();
        archiver.create(target, directory);
        target.close();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateWithPassword_xUox1() throws IOException {
        SevenZOutputFile target = new SevenZOutputFile(new File("test.7z"), "password".toCharArray());
        File directory = new File("directory");
        Archiver archiver = new Archiver();
        archiver.create(target, directory);
        target.close();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateWithPath_YTfs4() throws IOException {
        SevenZOutputFile target = new SevenZOutputFile(new File("test.7z"));
        Path directory = new File("directory").toPath();
        Archiver archiver = new Archiver();
        archiver.create(target, directory);
        target.close();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateWithPathAndPassword_BDYH5() throws IOException {
        SevenZOutputFile target = new SevenZOutputFile(new File("test.7z"), "password".toCharArray());
        Path directory = new File("directory").toPath();
        Archiver archiver = new Archiver();
        archiver.create(target, directory);
        target.close();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreate_rMlR0() throws Exception {
        Archiver archiver = new Archiver();
        String format = "format";
        SeekableByteChannel target = null; // Initialize SeekableByteChannel object
        File directory = null; // Initialize File object
        try {
            archiver.create(format, target, directory);
        } catch (IOException | ArchiveException e) {
            fail("Exception should not be thrown");
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateWithNullCloseableConsumer_GeMC5() throws IOException, ArchiveException {
    Archiver archiver = new Archiver();
    SeekableByteChannel target = mock(SeekableByteChannel.class);
    File directory = new File("directory");
    archiver.create(ArchiveStreamFactory.ZIP, target, directory, null);
    verify(target, never()).close();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testCreateWithInvalidFormat_HHsY2_1() throws Exception {
        Archiver archiver = new Archiver();
        String format = "invalid";
        SeekableByteChannel target = null;
        Path directory = null;
        IllegalStateException exception = assertThrows(IllegalStateException.class, () -> archiver.create(format, target, directory));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void createTest_bYhL0() throws IOException, ArchiveException {
    Archiver archiver = new Archiver();
    String format = "format";
    File target = new File("target");
    File directory = new File("directory");
    archiver.create(format, target, directory);
}
}