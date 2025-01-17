/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.sevenz;
import java.io.File;
import java.io.IOException;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import java.util.Random;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_SevenZOutputFile_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWrite_nIPB0() throws IOException {
        SevenZOutputFile file = new SevenZOutputFile(new File("test.txt"));
        byte[] b = new byte[] {1, 2, 3, 4, 5};
        file.write(b);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWriteChannel_oyaC1() throws IOException {
        SeekableByteChannel channel = java.nio.file.Files.newByteChannel(new File("test.txt").toPath());
        SevenZOutputFile file = new SevenZOutputFile(channel);
        byte[] b = new byte[] {1, 2, 3, 4, 5};
        file.write(b);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWriteChannelPassword_mlPA2() throws IOException {
        SeekableByteChannel channel = java.nio.file.Files.newByteChannel(new File("test.txt").toPath());
        SevenZOutputFile file = new SevenZOutputFile(channel, new char[] {'p', 'a', 's', 's', 'w', 'o', 'r', 'd'});
        byte[] b = new byte[] {1, 2, 3, 4, 5};
        file.write(b);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWriteFile_Rktb3() throws IOException {
        SevenZOutputFile file = new SevenZOutputFile(new File("test.txt"), new char[] {'p', 'a', 's', 's', 'w', 'o', 'r', 'd'});
        byte[] b = new byte[] {1, 2, 3, 4, 5};
        file.write(b);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testWriteFile_xKSQ0() throws IOException {
    SevenZOutputFile file = new SevenZOutputFile(new File("testFile"));
    byte[] b = new byte[10];
    file.write(b, 0, 10);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testWriteByteArray_qNer0() throws IOException {
    SevenZOutputFile sevenZOutputFile = new SevenZOutputFile(new File("testFile"));
    byte[] b = new byte[10];
    sevenZOutputFile.write(b, 0, 10);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWrite_hTaB0() throws IOException {
        SevenZOutputFile file = new SevenZOutputFile(new File("test.txt"));
        Random random = new Random();
        file.write(random.nextInt());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWriteChannel_KsKw1() throws IOException {
        SeekableByteChannel channel = null;
        SevenZOutputFile file = new SevenZOutputFile(channel);
        Random random = new Random();
        file.write(random.nextInt());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWriteChannelPassword_HxHY2() throws IOException {
        SeekableByteChannel channel = null;
        SevenZOutputFile file = new SevenZOutputFile(channel, new char[] {});
        Random random = new Random();
        file.write(random.nextInt());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWriteFile_Pwre3() throws IOException {
        SevenZOutputFile file = new SevenZOutputFile(new File("test.txt"), new char[] {});
        Random random = new Random();
        file.write(random.nextInt());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testWriteInt_Arth0() throws IOException {
    SevenZOutputFile sevenZOutputFile = new SevenZOutputFile(new File("testFile"));
    sevenZOutputFile.write(1);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testWriteIntWithPassword_REOm1() throws IOException {
    SevenZOutputFile sevenZOutputFile = new SevenZOutputFile(new File("testFile"), "password".toCharArray());
    sevenZOutputFile.write(1);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFinishWithPassword_jaDO0() throws IOException {
    SevenZOutputFile sevenZOutputFile = new SevenZOutputFile(new File("test"), new char[]{'p', 'a', 's', 's', 'w', 'o', 'r', 'd'});
    sevenZOutputFile.finish();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFinishWithNullArguments_eeFo1() throws IOException {
    try {
        SevenZOutputFile sevenZOutputFile = new SevenZOutputFile(new File("testFile"));
        sevenZOutputFile.finish();
        fail("Expected IOException");
    } catch (IOException e) {
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFinishWithChannel_COwt1_XTtT0() throws IOException {
    File file = new File("testFile");
    SeekableByteChannel channel = Files.newByteChannel(file.toPath(), StandardOpenOption.WRITE, StandardOpenOption.CREATE);
    SevenZOutputFile sevenZOutputFile = new SevenZOutputFile(channel, new char[]{'p', 'a', 's', 's', 'w', 'o', 'r', 'd'});
    sevenZOutputFile.closeArchiveEntry();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFinishWithAlreadyFinishedArchive_ixyf1_iQCt0() throws IOException {
    SevenZOutputFile sevenZOutputFile = new SevenZOutputFile(new File("testFile"), new char[]{'p', 'a', 's', 's', 'w', 'o', 'r', 'd'});
    sevenZOutputFile.closeArchiveEntry();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFinishWithAlreadyFinishedArchive_hDaA1_AOZx0() throws IOException {
    SevenZOutputFile sevenZOutputFile = new SevenZOutputFile(new File("testFile"), new char[]{'p', 'a', 's', 's', 'w', 'o', 'r', 'd'});
    sevenZOutputFile.closeArchiveEntry();
    try {
        sevenZOutputFile.closeArchiveEntry();
        fail("Expected IOException");
    } catch (IOException e) {
        assertEquals("This archive has already been finished", e.getMessage());
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFinishWithNullArguments_JvlL1_Zuna0() throws IOException {
    try {
        SevenZOutputFile sevenZOutputFile = new SevenZOutputFile(new File("testFile"));
        sevenZOutputFile.closeArchiveEntry();
    } catch (IOException e) {
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFinishWithFile_gcKR0_Dhnn0() throws IOException {
    SevenZOutputFile sevenZOutputFile = new SevenZOutputFile(new File("testFile"));
    sevenZOutputFile.closeArchiveEntry();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFinishWithNullArguments_CjyO1_MuhV0() throws IOException {
    SevenZOutputFile sevenZOutputFile = new SevenZOutputFile(new File("testFile"), new char[]{'p', 'a', 's', 's', 'w', 'o', 'r', 'd'});
    sevenZOutputFile.closeArchiveEntry();
    try {
        sevenZOutputFile.closeArchiveEntry();
        fail("Expected IOException");
    } catch (IOException e) {
        assertEquals("Stream already closed", e.getMessage());
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFinishWithNullArguments_igQm1_DRrJ0() throws IOException {
    SevenZOutputFile sevenZOutputFile = new SevenZOutputFile(new File("testFile"), new char[]{'p', 'a', 's', 's', 'w', 'o', 'r', 'd'});
    sevenZOutputFile.closeArchiveEntry();
    try {
        sevenZOutputFile.closeArchiveEntry();
        Assertions.fail("Expected IOException");
    } catch (IOException e) {
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFinishWithNullArguments_DzSF1_BGnA0() throws IOException {
    SevenZOutputFile sevenZOutputFile = new SevenZOutputFile(new File("testFile"), new char[]{'p', 'a', 's', 's', 'w', 'o', 'r', 'd'});
    try {
        sevenZOutputFile.closeArchiveEntry();
        Assertions.fail("Expected IOException");
    } catch (IOException e) {
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testPutArchiveEntryWithChannel_ovGV2_PWpF0() throws IOException {
    SeekableByteChannel channel = null; // Initialize channel
    SevenZOutputFile sevenZOutputFile = new SevenZOutputFile(channel);
}
}