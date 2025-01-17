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
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_SevenZOutputFile_Test_Passing {
private SevenZOutputFile sevenZOutputFile;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFinish_wJqu0() throws IOException {
    SevenZOutputFile sevenZOutputFile = new SevenZOutputFile(new File("test.7z"));
    sevenZOutputFile.finish();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFinishWithPassword_rOhc1() throws IOException {
    SevenZOutputFile sevenZOutputFile = new SevenZOutputFile(new File("test.7z"), "password".toCharArray());
    sevenZOutputFile.finish();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFinish_ifGv0() throws IOException {
    SevenZOutputFile sevenZOutputFile = new SevenZOutputFile(new File("test.7z"), new char[] {'p', 'a', 's', 's', 'w', 'o', 'r', 'd'});
    sevenZOutputFile.finish();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testFinish_rbym0() throws IOException {
        SevenZOutputFile sevenZOutputFile = new SevenZOutputFile(new File("test.7z"), new char[0]);
        sevenZOutputFile.finish();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFinish_FMHt0() throws IOException {
    SevenZOutputFile out = new SevenZOutputFile(new File("test.7z"));
    out.finish();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFinishWithPassword_dske1() throws IOException {
    SevenZOutputFile out = new SevenZOutputFile(new File("test.7z"), "password".toCharArray());
    out.finish();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFinish_UjCf0() throws IOException {
        File file = new File("test.7z");
        char[] password = "password".toCharArray();
        SevenZOutputFile sevenZOutputFile = new SevenZOutputFile(file, password);
        sevenZOutputFile.finish();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFinishWithFile_ERhl2() throws IOException {
        File file = new File("test.7z");
        SevenZOutputFile sevenZOutputFile = new SevenZOutputFile(file);
        sevenZOutputFile.finish();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFinishWithFileAndPassword_nabO0() throws IOException {
        File fileName = new File("test.7z");
        char[] password = "password".toCharArray();
        SevenZOutputFile sevenZOutputFile = new SevenZOutputFile(fileName, password);
        sevenZOutputFile.finish();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFinishWithFile_FbGu2() throws IOException {
        File fileName = new File("test.7z");
        SevenZOutputFile sevenZOutputFile = new SevenZOutputFile(fileName);
        sevenZOutputFile.finish();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFinishWithNullPassword_ekaQ2() throws IOException {
        SevenZOutputFile sevenZOutputFile = new SevenZOutputFile(new File("test.7z"), null);
        sevenZOutputFile.finish();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFinishTwice_oHQB8() throws IOException {
        SevenZOutputFile sevenZOutputFile = new SevenZOutputFile(new File("test.7z"));
        sevenZOutputFile.finish();
        try {
            sevenZOutputFile.finish();
            fail("Expected IOException");
        } catch (IOException e) {
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFinish_OAjY0_1() throws IOException {
        Path tempFile = Files.createTempFile("test", ".7z");
        SeekableByteChannel channel = Files.newByteChannel(tempFile, StandardOpenOption.WRITE);
        SevenZOutputFile sevenZOutputFile = new SevenZOutputFile(channel);
        sevenZOutputFile.finish();
        Files.delete(tempFile);
        assertFalse(Files.exists(tempFile));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFinishWithPassword_agnD1_1() throws IOException {
        Path tempFile = Files.createTempFile("test", ".7z");
        SeekableByteChannel channel = Files.newByteChannel(tempFile, StandardOpenOption.WRITE);
        SevenZOutputFile sevenZOutputFile = new SevenZOutputFile(channel, "password".toCharArray());
        sevenZOutputFile.finish();
        Files.delete(tempFile);
        assertFalse(Files.exists(tempFile));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFinish_eHqg0() throws IOException {
    SevenZOutputFile out = new SevenZOutputFile(new File("test.7z"), new char[0]);
    out.finish();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testClose_ObcS0() throws IOException {
        SevenZOutputFile sevenZOutputFile = new SevenZOutputFile(new File("test.7z"));
        sevenZOutputFile.close();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCloseWithPassword_qVJN1() throws IOException {
        SevenZOutputFile sevenZOutputFile = new SevenZOutputFile(new File("test.7z"), "password".toCharArray());
        sevenZOutputFile.close();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWriteWithFileAndPassword_MWcc0() throws IOException {
        File file = new File("test.7z");
        char[] password = "password".toCharArray();
        SevenZOutputFile sevenZOutputFile = new SevenZOutputFile(file, password);
        assertNotNull(sevenZOutputFile);
        sevenZOutputFile.close();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWriteWithFile_CSPD1() throws IOException {
        File file = new File("test.7z");
        SevenZOutputFile sevenZOutputFile = new SevenZOutputFile(file);
        assertNotNull(sevenZOutputFile);
        sevenZOutputFile.close();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateArchiveEntryWithFileAndEntryName_KmxL0_fwuh0() throws IOException {
        File file = new File("test.txt");
        SevenZOutputFile sevenZOutputFile = new SevenZOutputFile(file);
        SevenZArchiveEntry entry = sevenZOutputFile.createArchiveEntry(file.toPath(), "test.txt");
        assertNotNull(entry);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateArchiveEntryWithFileAndEntryNameAndPassword_RPmx1_gmwF0() throws IOException {
        File file = new File("test.txt");
        SevenZOutputFile sevenZOutputFile = new SevenZOutputFile(file, "password".toCharArray());
        SevenZArchiveEntry entry = sevenZOutputFile.createArchiveEntry(file.toPath(), "test.txt");
        assertNotNull(entry);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testCreateArchiveEntry_eTYm0_LOxj0() throws IOException {
		SevenZOutputFile sevenZOutputFile = new SevenZOutputFile(new File("test.7z"));
		SevenZArchiveEntry entry = sevenZOutputFile.createArchiveEntry(new File("test.txt"), "test.txt");
		assertEquals("test.txt", entry.getName());
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testCreateArchiveEntryWithPassword_VYQn1_mZMo0() throws IOException {
		SevenZOutputFile sevenZOutputFile = new SevenZOutputFile(new File("test.7z"), "password".toCharArray());
		SevenZArchiveEntry entry = sevenZOutputFile.createArchiveEntry(new File("test.txt"), "test.txt");
		assertEquals("test.txt", entry.getName());
		sevenZOutputFile.close();
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFinish_OAjY0() throws IOException {
        Path tempFile = Files.createTempFile("test", ".7z");
        SeekableByteChannel channel = Files.newByteChannel(tempFile, StandardOpenOption.WRITE);
        SevenZOutputFile sevenZOutputFile = new SevenZOutputFile(channel);
        sevenZOutputFile.finish();
        assertTrue(Files.exists(tempFile));
        assertTrue(Files.size(tempFile) > 0);
        Files.delete(tempFile);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFinishWithPassword_agnD1() throws IOException {
        Path tempFile = Files.createTempFile("test", ".7z");
        SeekableByteChannel channel = Files.newByteChannel(tempFile, StandardOpenOption.WRITE);
        SevenZOutputFile sevenZOutputFile = new SevenZOutputFile(channel, "password".toCharArray());
        sevenZOutputFile.finish();
        assertTrue(Files.exists(tempFile));
        assertTrue(Files.size(tempFile) > 0);
        Files.delete(tempFile);
    }
}