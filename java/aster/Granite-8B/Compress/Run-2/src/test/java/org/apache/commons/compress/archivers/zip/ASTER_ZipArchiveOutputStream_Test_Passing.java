/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.zip;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_ZipArchiveOutputStream_Test_Passing {
private ZipArchiveOutputStream ziparchiveoutputstream;
@Mock
    private StreamCompressor streamCompressor;
@Mock
    private OutputStream outputStream;
@Mock
    private ZipArchiveEntry archiveEntry;
@Mock
    private ZipArchiveEntry entry;
@Mock
    private ZipArchiveEntry zipArchiveEntry;
@Mock
	private ZipArchiveEntry ze2;
    private long cdLength;
    private final List<ZipArchiveEntry> entries = new LinkedList<>();
    private long eocdLength;
    private String comment = "";
    private long cdOffset;
    private long cdDiskNumberStart;
        private long bytesRead;
        private long dataStart;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateArchiveEntryWithPathAndString_nTbF1_1() throws IOException {
        ZipArchiveOutputStream zipArchiveOutputStream = new ZipArchiveOutputStream(new File("test.zip"));
        Path inputFile = new File("test.txt").toPath();
        String entryName = "test.txt";
        ZipArchiveEntry zipArchiveEntry = zipArchiveOutputStream.createArchiveEntry(inputFile, entryName);
        assertNotNull(zipArchiveEntry);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateArchiveEntryWithPathAndString_nTbF1_2() throws IOException {
        ZipArchiveOutputStream zipArchiveOutputStream = new ZipArchiveOutputStream(new File("test.zip"));
        Path inputFile = new File("test.txt").toPath();
        String entryName = "test.txt";
        ZipArchiveEntry zipArchiveEntry = zipArchiveOutputStream.createArchiveEntry(inputFile, entryName);
        assertEquals(inputFile.getFileName().toString(), zipArchiveEntry.getName());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateArchiveEntryWithPathAndString_nTbF1_3() throws IOException {
        ZipArchiveOutputStream zipArchiveOutputStream = new ZipArchiveOutputStream(new File("test.zip"));
        Path inputFile = new File("test.txt").toPath();
        String entryName = "test.txt";
        ZipArchiveEntry zipArchiveEntry = zipArchiveOutputStream.createArchiveEntry(inputFile, entryName);
        assertEquals(entryName, zipArchiveEntry.getName());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWritePreamble_oRRs0() throws IOException {
        ZipArchiveOutputStream zipArchiveOutputStream = new ZipArchiveOutputStream(new File("test.zip"));
        byte[] preamble = new byte[10];
        zipArchiveOutputStream.writePreamble(preamble);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWritePreamble1_gkUV1() throws IOException {
        ZipArchiveOutputStream zipArchiveOutputStream = new ZipArchiveOutputStream(new File("test.zip"));
        byte[] preamble = new byte[10];
        zipArchiveOutputStream.writePreamble(preamble, 0, 5);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWritePreamble2_UkVw2() throws IOException {
        ZipArchiveOutputStream zipArchiveOutputStream = new ZipArchiveOutputStream(new File("test.zip"));
        byte[] preamble = new byte[10];
        zipArchiveOutputStream.writePreamble(preamble, 0, 10);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWritePreamble3_COOv3() throws IOException {
        ZipArchiveOutputStream zipArchiveOutputStream = new ZipArchiveOutputStream(new File("test.zip"));
        byte[] preamble = new byte[10];
        zipArchiveOutputStream.writePreamble(preamble, 5, 5);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWritePreamble4_NvJe4() throws IOException {
        ZipArchiveOutputStream zipArchiveOutputStream = new ZipArchiveOutputStream(new File("test.zip"));
        byte[] preamble = new byte[10];
        zipArchiveOutputStream.writePreamble(preamble, 0, 0);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWritePreamble5_DFMm5() throws IOException {
        ZipArchiveOutputStream zipArchiveOutputStream = new ZipArchiveOutputStream(new File("test.zip"));
        byte[] preamble = new byte[10];
        zipArchiveOutputStream.writePreamble(preamble, 5, 0);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWritePreamble6_pmZd6() throws IOException {
        ZipArchiveOutputStream zipArchiveOutputStream = new ZipArchiveOutputStream(new File("test.zip"));
        byte[] preamble = new byte[10];
        zipArchiveOutputStream.writePreamble(preamble, 10, 0);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWritePreamble7_aFUh7() throws IOException {
        ZipArchiveOutputStream zipArchiveOutputStream = new ZipArchiveOutputStream(new File("test.zip"));
        byte[] preamble = new byte[10];
        zipArchiveOutputStream.writePreamble(preamble, 10, 5);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWritePreamble8_JawW8() throws IOException {
        ZipArchiveOutputStream zipArchiveOutputStream = new ZipArchiveOutputStream(new File("test.zip"));
        byte[] preamble = new byte[10];
        zipArchiveOutputStream.writePreamble(preamble, 5, 10);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWritePreamble9_zqSK9() throws IOException {
        ZipArchiveOutputStream zipArchiveOutputStream = new ZipArchiveOutputStream(new File("test.zip"));
        byte[] preamble = new byte[10];
        zipArchiveOutputStream.writePreamble(preamble, 10, 10);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWriteCentralDirectoryEndWithFile_fccg2() throws IOException {
        ZipArchiveOutputStream zipArchiveOutputStream = new ZipArchiveOutputStream(new File("test.zip"));
        zipArchiveOutputStream.writeCentralDirectoryEnd();
        zipArchiveOutputStream.close();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWritePreambleWithSeekableByteChannel_wcYw1() throws IOException {
        SeekableByteChannel seekableByteChannel = null;
        ZipArchiveOutputStream zipArchiveOutputStream = new ZipArchiveOutputStream(seekableByteChannel);
        byte[] preamble = new byte[10];
        int offset = 0;
        int length = 10;
        zipArchiveOutputStream.writePreamble(preamble, offset, length);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWritePreambleWithFileAndLong_cNQG2() throws IOException {
        File file = null;
        ZipArchiveOutputStream zipArchiveOutputStream = new ZipArchiveOutputStream(file, 0L);
        byte[] preamble = new byte[10];
        int offset = 0;
        int length = 10;
        zipArchiveOutputStream.writePreamble(preamble, offset, length);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWritePreambleWithPathAndOpenOptionArray_Fgwv3() throws IOException {
        Path path = null;
        OpenOption[] options = new OpenOption[0];
        ZipArchiveOutputStream zipArchiveOutputStream = new ZipArchiveOutputStream(path, options);
        byte[] preamble = new byte[10];
        int offset = 0;
        int length = 10;
        zipArchiveOutputStream.writePreamble(preamble, offset, length);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWritePreambleWithOutputStream_vfWZ4() throws IOException {
        OutputStream out = null;
        ZipArchiveOutputStream zipArchiveOutputStream = new ZipArchiveOutputStream(out);
        byte[] preamble = new byte[10];
        int offset = 0;
        int length = 10;
        zipArchiveOutputStream.writePreamble(preamble, offset, length);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWritePreambleWithFile_LxbJ5() throws IOException {
        File file = null;
        ZipArchiveOutputStream zipArchiveOutputStream = new ZipArchiveOutputStream(file);
        byte[] preamble = new byte[10];
        int offset = 0;
        int length = 10;
        zipArchiveOutputStream.writePreamble(preamble, offset, length);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void writePreamble(final byte[] preamble, final int offset, final int length) throws IOException
	{
	    if (entry != null) {
	        throw new IllegalStateException("Preamble must be written before creating an entry");
	    }
	    this.streamCompressor.writeCounted(preamble, offset, length);
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFinishWithFinishedArchive_dueJ3() throws IOException {
        ZipArchiveOutputStream zipArchiveOutputStream = new ZipArchiveOutputStream(mock(Path.class), 1000L);
        zipArchiveOutputStream.finished = true;
        IOException exception = assertThrows(IOException.class, () -> zipArchiveOutputStream.finish());
        assertEquals("This archive has already been finished", exception.getMessage());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testAddRawArchiveEntryWithNullStream_paqO2() throws IOException {
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(new File("test.zip"));
        ZipArchiveEntry entry = new ZipArchiveEntry("test.txt");
        IOException exception = assertThrows(IOException.class, () -> zos.addRawArchiveEntry(entry, null));
        assertTrue(exception.getMessage().contains("stream must not be null"));
        zos.close();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateArchiveEntryWithFileAndString_Xbnv0() throws IOException {
        ZipArchiveOutputStream zipArchiveOutputStream = new ZipArchiveOutputStream(new File("test.zip"));
        File inputFile = new File("test.txt");
        String entryName = "test.txt";
        ZipArchiveEntry zipArchiveEntry = zipArchiveOutputStream.createArchiveEntry(inputFile, entryName);
        assertNotNull(zipArchiveEntry);
        assertEquals(inputFile.getName(), zipArchiveEntry.getName());
        assertEquals(entryName, zipArchiveEntry.getName());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateArchiveEntryWithPathAndString_nTbF1() throws IOException {
        ZipArchiveOutputStream zipArchiveOutputStream = new ZipArchiveOutputStream(new File("test.zip"));
        Path inputFile = new File("test.txt").toPath();
        String entryName = "test.txt";
        ZipArchiveEntry zipArchiveEntry = zipArchiveOutputStream.createArchiveEntry(inputFile, entryName);
        assertNotNull(zipArchiveEntry);
        assertEquals(inputFile.getFileName().toString(), zipArchiveEntry.getName());
        assertEquals(entryName, zipArchiveEntry.getName());
    }
}