/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.zip;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.LinkedList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import java.util.LinkedList;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.mockito.junit.jupiter.MockitoExtension;   
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_ZipArchiveOutputStream_Test_Passing {
private long cdDiskNumberStart;
private StreamCompressor streamCompressor;
private long cdOffset;
private OutputStream outputStream;
private long eocdLength;
private List<ZipArchiveEntry> entries = new LinkedList<>();
private long dataStart;
private long bytesRead;
ZipArchiveEntry ze;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlushWithFileAndSplitSize_JEFG2() throws IOException {
        File file = new File("test.zip");
        long zipSplitSize = 1024L;
        ZipArchiveOutputStream zipArchiveOutputStream = new ZipArchiveOutputStream(file, zipSplitSize);
        zipArchiveOutputStream.flush();
        assertNotNull(zipArchiveOutputStream);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlushWithSeekableByteChannel_VekU5() throws IOException {
        SeekableByteChannel seekableByteChannel = null; // Initialize with actual channel
        ZipArchiveOutputStream zipArchiveOutputStream = new ZipArchiveOutputStream(seekableByteChannel);
        zipArchiveOutputStream.flush();
        assertNotNull(zipArchiveOutputStream);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlushWithOutputStream_fWQZ6() throws IOException {
        OutputStream outputStream = null; // Initialize with actual output stream
        ZipArchiveOutputStream zipArchiveOutputStream = new ZipArchiveOutputStream(outputStream);
        zipArchiveOutputStream.flush();
        assertNotNull(zipArchiveOutputStream);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWriteOutWithFileAndZipSplitSize_ldhV5() throws IOException {
        File file = new File("test.zip");
        ZipArchiveOutputStream zipArchiveOutputStream = new ZipArchiveOutputStream(file, 1024L);
        byte[] data = new byte[10];
        zipArchiveOutputStream.writeOut(data);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWriteOutWithFile_hBpa7() throws IOException {
        File file = new File("test.zip");
        ZipArchiveOutputStream zipArchiveOutputStream = new ZipArchiveOutputStream(file);
        byte[] data = new byte[10];
        zipArchiveOutputStream.writeOut(data);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBytesWrittenWithFile_NHhm1() throws IOException {
        File file = new File("test.zip");
        ZipArchiveOutputStream zipArchiveOutputStream = new ZipArchiveOutputStream(file);
        assertEquals(0, zipArchiveOutputStream.getBytesWritten());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBytesWrittenWithFileAndZipSplitSize_wtxo6() throws IOException {
        File file = new File("test.zip");
        long zipSplitSize = 1024L;
        ZipArchiveOutputStream zipArchiveOutputStream = new ZipArchiveOutputStream(file, zipSplitSize);
        assertEquals(0, zipArchiveOutputStream.getBytesWritten());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetCommentWithFileAndZipSplitSize_IRRO5() throws IOException {
        ZipArchiveOutputStream zipArchiveOutputStream = new ZipArchiveOutputStream(new File("test.zip"), 1024L);
        zipArchiveOutputStream.setComment("This is a test comment");
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetCommentWithFile_Tllb7() throws IOException {
        ZipArchiveOutputStream zipArchiveOutputStream = new ZipArchiveOutputStream(new File("test.zip"));
        zipArchiveOutputStream.setComment("This is a test comment");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDeflate_vILM0() throws IOException {
    ZipArchiveOutputStream zos = new ZipArchiveOutputStream(new File("test.zip"));
    zos.deflate();
    zos.close();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDeflateWithSplitZip_mOYL4() throws IOException {
    ZipArchiveOutputStream zos = new ZipArchiveOutputStream(new File("test.zip"), 1024L);
    zos.deflate();
    zos.close();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetMethod_FGnY0() throws IOException {
        ZipArchiveOutputStream zipArchiveOutputStream = new ZipArchiveOutputStream(new File("test.zip"));
        zipArchiveOutputStream.setMethod(ZipArchiveOutputStream.DEFLATED);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testClose_rGvi0() throws IOException {
        ZipArchiveOutputStream zos = mock(ZipArchiveOutputStream.class);
        doNothing().when(zos).finish();
        zos.close();
        verify(zos).finish();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWritePreambleWithPathAndZipSplitSize_kwmh0() throws IOException {
        Path path = null; // Initialize path
        long zipSplitSize = 0L; // Initialize zipSplitSize
        ZipArchiveOutputStream zipArchiveOutputStream = new ZipArchiveOutputStream(path, zipSplitSize);
        byte[] preamble = new byte[0]; // Initialize preamble
        zipArchiveOutputStream.writePreamble(preamble);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWritePreambleWithSeekableByteChannel_AUAH1() throws IOException {
        SeekableByteChannel channel = null; // Initialize channel
        ZipArchiveOutputStream zipArchiveOutputStream = new ZipArchiveOutputStream(channel);
        byte[] preamble = new byte[0]; // Initialize preamble
        zipArchiveOutputStream.writePreamble(preamble);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWritePreambleWithFileAndZipSplitSize_xrwm2() throws IOException {
        File file = null; // Initialize file
        long zipSplitSize = 0L; // Initialize zipSplitSize
        ZipArchiveOutputStream zipArchiveOutputStream = new ZipArchiveOutputStream(file, zipSplitSize);
        byte[] preamble = new byte[0]; // Initialize preamble
        zipArchiveOutputStream.writePreamble(preamble);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWritePreambleWithPathAndOptions_IeXH3() throws IOException {
        Path file = null; // Initialize file
        OpenOption[] options = new OpenOption[0]; // Initialize options
        ZipArchiveOutputStream zipArchiveOutputStream = new ZipArchiveOutputStream(file, options);
        byte[] preamble = new byte[0]; // Initialize preamble
        zipArchiveOutputStream.writePreamble(preamble);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWritePreambleWithOutputStream_kHcK4() throws IOException {
        OutputStream out = null; // Initialize out
        ZipArchiveOutputStream zipArchiveOutputStream = new ZipArchiveOutputStream(out);
        byte[] preamble = new byte[0]; // Initialize preamble
        zipArchiveOutputStream.writePreamble(preamble);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWritePreambleWithFile_kvdt5() throws IOException {
        File file = null; // Initialize file
        ZipArchiveOutputStream zipArchiveOutputStream = new ZipArchiveOutputStream(file);
        byte[] preamble = new byte[0]; // Initialize preamble
        zipArchiveOutputStream.writePreamble(preamble);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testWriteZip64CentralDirectory_FtYn0() throws IOException {
    ZipArchiveOutputStream zos = new ZipArchiveOutputStream(new File("test.zip"));
    zos.writeZip64CentralDirectory();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testWriteZip64CentralDirectoryWithEmptyComment_vUNK7() throws IOException {
    ZipArchiveOutputStream zos = new ZipArchiveOutputStream(new File("test.zip"));
    zos.setComment("");
    zos.writeZip64CentralDirectory();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testWriteZip64CentralDirectoryWithNonEmptyComment_bLTN8() throws IOException {
    ZipArchiveOutputStream zos = new ZipArchiveOutputStream(new File("test.zip"));
    zos.setComment("This is a test comment");
    zos.writeZip64CentralDirectory();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testWriteZip64CentralDirectoryWithNullComment_ZbvW9() throws IOException {
    ZipArchiveOutputStream zos = new ZipArchiveOutputStream(new File("test.zip"));
    zos.setComment(null);
    zos.writeZip64CentralDirectory();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFinishWithZip64ModeNever_tFQq4_jOgv0() throws IOException {
    ZipArchiveOutputStream zos = new ZipArchiveOutputStream(outputStream);
    zos.setUseZip64(Zip64Mode.Never);
    zos.putArchiveEntry(new ZipArchiveEntry("test.txt"));
    zos.write("Test data".getBytes());
    zos.closeArchiveEntry();
    try {
        zos.finish();
        fail("Expected Zip64RequiredException");
    } catch (Zip64RequiredException e) {
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWriteCounted_MMrD8_oYxA0() throws IOException {
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(new File("test.zip"));
        byte[] data = new byte[1024]; // initialize data
        zos.writePreamble(data, 0, data.length);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testPutArchiveEntryWithLastModFileTime_oXaN9_GCDL0() throws IOException {
    ZipArchiveOutputStream zos = new ZipArchiveOutputStream(new ByteArrayOutputStream());
    ZipArchiveEntry zae = new ZipArchiveEntry("testfile.txt");
    zae.setTime(System.currentTimeMillis());
    zos.putArchiveEntry(zae);
    zos.closeArchiveEntry();
    zos.close();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
        public void write(int b) throws IOException {
        }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCloseArchiveEntry_JTxl0_TOmo0() throws IOException {
        ZipArchiveOutputStream zipArchiveOutputStream = new ZipArchiveOutputStream(new ByteArrayOutputStream());
        zipArchiveOutputStream.closeArchiveEntry();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCloseArchiveEntryWithPathAndZipSplitSize_zVGc1_zbLd0() throws IOException {
        ZipArchiveOutputStream zipArchiveOutputStream = new ZipArchiveOutputStream(new File("test"), 1024L);
        zipArchiveOutputStream.closeArchiveEntry();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCloseArchiveEntryWithPathAndOptions_zlVQ8_duYz0() throws IOException {
        ZipArchiveOutputStream zipArchiveOutputStream = new ZipArchiveOutputStream(new File("test").toPath(), new OpenOption[0]);
        zipArchiveOutputStream.closeArchiveEntry();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWriteLocalFileHeader_PZge0_HegE0() throws IOException {
        ZipArchiveOutputStream zipArchiveOutputStream = new ZipArchiveOutputStream(new ByteArrayOutputStream());
        ZipArchiveEntry zipArchiveEntry = new ZipArchiveEntry("entryName");
        zipArchiveOutputStream.writeLocalFileHeader(zipArchiveEntry);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWriteOut_zISj0_Rjce0() throws IOException {
        ZipArchiveOutputStream zipArchiveOutputStream = new ZipArchiveOutputStream(new ByteArrayOutputStream());
        byte[] data = new byte[10];
        zipArchiveOutputStream.writeOut(data);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBytesWritten_DdCB0_EFgL0() throws Exception {
        ZipArchiveOutputStream zipArchiveOutputStream = new ZipArchiveOutputStream(new ByteArrayOutputStream());
        assertEquals(0, zipArchiveOutputStream.getBytesWritten());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetMethodWithPath_qgoZ1_duqZ0() throws IOException {
        ZipArchiveOutputStream zipArchiveOutputStream = new ZipArchiveOutputStream(new File("test.zip").toPath(), new OpenOption[0]);
        zipArchiveOutputStream.setMethod(ZipArchiveOutputStream.DEFLATED);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateArchiveEntryWithFileAndEntryName_OshN0_asqW0() throws IOException {
        ZipArchiveOutputStream zipArchiveOutputStream = new ZipArchiveOutputStream(new ByteArrayOutputStream());
        File inputFile = new File("input.txt");
        String entryName = "entry.txt";
        ZipArchiveEntry zipArchiveEntry = zipArchiveOutputStream.createArchiveEntry(inputFile, entryName);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetLevelInvalidCompressionLevel_IwDO2_rjsc0() throws Exception {
        ZipArchiveOutputStream stream = new ZipArchiveOutputStream(new ByteArrayOutputStream());
        try {
            stream.setLevel(10);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetEncoding_dpIy0_FIRW0() throws IOException {
    ZipArchiveOutputStream zos = new ZipArchiveOutputStream(new File("test.zip"));
    zos.setEncoding("UTF-8");
    assertEquals(zos.getEncoding(), "UTF-8");
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetEncodingWithNull_QzAy2_dwCx0() throws IOException {
    ZipArchiveOutputStream zos = new ZipArchiveOutputStream(new File("test.zip"));
    zos.setEncoding(null);
    assertEquals(zos.getEncoding(), "UTF-8");
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWriteWithValidInput_ylod0_CXCd0() throws IOException {
        ZipArchiveOutputStream zipArchiveOutputStream = new ZipArchiveOutputStream(new File("test.zip"));
        byte[] data = new byte[10];
        int offset = 0;
        int length = 10;
        zipArchiveOutputStream.write(data, offset, length);
        zipArchiveOutputStream.close();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWriteWithInvalidInput_PRtp1_pmGj0_1() throws IOException {
        ZipArchiveOutputStream zipArchiveOutputStream = new ZipArchiveOutputStream(new File("test.zip"));
        byte[] data = new byte[10];
        int offset = 11;
        int length = 10;
        IOException exception = assertThrows(IOException.class, () -> zipArchiveOutputStream.write(data, offset, length));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWriteWithNullInput_WJuV2_GTKf0_1() throws IOException {
        ZipArchiveOutputStream zipArchiveOutputStream = new ZipArchiveOutputStream(new File("test.zip"));
        byte[] data = null;
        int offset = 0;
        int length = 10;
        IOException exception = assertThrows(IOException.class, () -> zipArchiveOutputStream.write(data, offset, length));}
}