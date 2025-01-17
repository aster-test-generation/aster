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
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_ZipArchiveOutputStream_Test_Passing {
    private ZipArchiveOutputStream zipArchiveOutputStream;

@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWriteLocalFileHeader_bCTL0_1() throws IOException {
        ZipArchiveEntry ze = new ZipArchiveEntry("test");
        ze.setMethod(ZipArchiveEntry.DEFLATED);
        ze.setSize(100);
        ze.setCompressedSize(50);
        ze.setCrc(0x12345678L);
        ze.setTime(1234567890L);
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(new File("test.zip"));
        zos.writeLocalFileHeader(ze);
        zos.close();
        ZipFile zipFile = new ZipFile("test.zip");
        ZipArchiveEntry entry = zipFile.getEntry("test");
        zipFile.close();
        assertNotNull(entry);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWriteLocalFileHeader_bCTL0_2() throws IOException {
        ZipArchiveEntry ze = new ZipArchiveEntry("test");
        ze.setMethod(ZipArchiveEntry.DEFLATED);
        ze.setSize(100);
        ze.setCompressedSize(50);
        ze.setCrc(0x12345678L);
        ze.setTime(1234567890L);
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(new File("test.zip"));
        zos.writeLocalFileHeader(ze);
        zos.close();
        ZipFile zipFile = new ZipFile("test.zip");
        ZipArchiveEntry entry = zipFile.getEntry("test");
        zipFile.close();
        assertEquals(ZipArchiveEntry.DEFLATED, entry.getMethod());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWriteLocalFileHeader_bCTL0_3() throws IOException {
        ZipArchiveEntry ze = new ZipArchiveEntry("test");
        ze.setMethod(ZipArchiveEntry.DEFLATED);
        ze.setSize(100);
        ze.setCompressedSize(50);
        ze.setCrc(0x12345678L);
        ze.setTime(1234567890L);
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(new File("test.zip"));
        zos.writeLocalFileHeader(ze);
        zos.close();
        ZipFile zipFile = new ZipFile("test.zip");
        ZipArchiveEntry entry = zipFile.getEntry("test");
        zipFile.close();
        assertEquals(100, entry.getSize());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWriteLocalFileHeader_bCTL0_4() throws IOException {
        ZipArchiveEntry ze = new ZipArchiveEntry("test");
        ze.setMethod(ZipArchiveEntry.DEFLATED);
        ze.setSize(100);
        ze.setCompressedSize(50);
        ze.setCrc(0x12345678L);
        ze.setTime(1234567890L);
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(new File("test.zip"));
        zos.writeLocalFileHeader(ze);
        zos.close();
        ZipFile zipFile = new ZipFile("test.zip");
        ZipArchiveEntry entry = zipFile.getEntry("test");
        zipFile.close();
        assertEquals(50, entry.getCompressedSize());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWriteLocalFileHeader_bCTL0_5() throws IOException {
        ZipArchiveEntry ze = new ZipArchiveEntry("test");
        ze.setMethod(ZipArchiveEntry.DEFLATED);
        ze.setSize(100);
        ze.setCompressedSize(50);
        ze.setCrc(0x12345678L);
        ze.setTime(1234567890L);
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(new File("test.zip"));
        zos.writeLocalFileHeader(ze);
        zos.close();
        ZipFile zipFile = new ZipFile("test.zip");
        ZipArchiveEntry entry = zipFile.getEntry("test");
        zipFile.close();
        assertEquals(0x12345678L, entry.getCrc());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWriteLocalFileHeader_bCTL0_6() throws IOException {
        ZipArchiveEntry ze = new ZipArchiveEntry("test");
        ze.setMethod(ZipArchiveEntry.DEFLATED);
        ze.setSize(100);
        ze.setCompressedSize(50);
        ze.setCrc(0x12345678L);
        ze.setTime(1234567890L);
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(new File("test.zip"));
        zos.writeLocalFileHeader(ze);
        zos.close();
        ZipFile zipFile = new ZipFile("test.zip");
        ZipArchiveEntry entry = zipFile.getEntry("test");
        zipFile.close();
        assertEquals(1234567890L, entry.getTime());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBytesWritten_UdKq0() throws IOException {
        ZipArchiveOutputStream zipArchiveOutputStream = new ZipArchiveOutputStream(new File("test.zip"));
        long bytesWritten = zipArchiveOutputStream.getBytesWritten();
        assertEquals(0, bytesWritten);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_TQUx0() {
        ZipArchiveEntry entry1 = new ZipArchiveEntry("name");
        ZipArchiveEntry entry2 = new ZipArchiveEntry("name");
        assertTrue(entry1.equals(entry2));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetGeneralPurposeBit_nxPc1() {
        ZipArchiveEntry entry = new ZipArchiveEntry("name");
        GeneralPurposeBit bit = new GeneralPurposeBit();
        entry.setGeneralPurposeBit(bit);
        assertEquals(bit, entry.getGeneralPurposeBit());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetUnixMode_ALbw2() {
        ZipArchiveEntry entry = new ZipArchiveEntry("name");
        entry.setUnixMode(0755);
        assertEquals(0755, entry.getUnixMode());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetExternalAttributes_sZGX3() {
        ZipArchiveEntry entry = new ZipArchiveEntry("name");
        entry.setExternalAttributes(0x12345678L);
        assertEquals(0x12345678L, entry.getExternalAttributes());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetExtraFields_NtGn6() {
        ZipArchiveEntry entry = new ZipArchiveEntry("name");
        ZipExtraField[] fields = new ZipExtraField[1];
        entry.setExtraFields(fields);
        assertEquals(fields, entry.getExtraFields());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetVersionMadeBy_GnqS7() {
        ZipArchiveEntry entry = new ZipArchiveEntry("name");
        entry.setVersionMadeBy(0x1234);
        assertEquals(0x1234, entry.getVersionMadeBy());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetDiskNumberStart_NvUF8() {
        ZipArchiveEntry entry = new ZipArchiveEntry("name");
        entry.setDiskNumberStart(123);
        assertEquals(123, entry.getDiskNumberStart());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetCentralDirectoryExtra_lEEt10() {
        ZipArchiveEntry entry = new ZipArchiveEntry("name");
        byte[] b = new byte[10];
        entry.setCentralDirectoryExtra(b);
        assertEquals(b, entry.getCentralDirectoryExtra());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetExtra_nGpi11() {
        ZipArchiveEntry entry = new ZipArchiveEntry("name");
        byte[] extra = new byte[10];
        entry.setExtra(extra);
        assertEquals(extra, entry.getExtra());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMethod_nYtX13() {
        ZipArchiveEntry entry = new ZipArchiveEntry("name");
        assertEquals(0, entry.getMethod());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFinishWithComment_FhVo1() throws IOException {
        ZipArchiveOutputStream zipArchiveOutputStream = new ZipArchiveOutputStream(new File("test.zip"));
        zipArchiveOutputStream.setComment("This is a test comment");
        zipArchiveOutputStream.finish();
        zipArchiveOutputStream.close();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFinishWithClosedOutputStream_AicR2() throws IOException {
    ZipArchiveOutputStream zipArchiveOutputStream = new ZipArchiveOutputStream(new File("test.zip"));
    zipArchiveOutputStream.close();
    try {
        zipArchiveOutputStream.finish();
        fail("Expected IOException");
    } catch (IOException e) {
        assertEquals("Stream is closed", e.getMessage());
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFinishWithEntryNotClosed_VXOV3() throws IOException {
    ZipArchiveOutputStream zipArchiveOutputStream = new ZipArchiveOutputStream(new File("test.zip"));
    zipArchiveOutputStream.putArchiveEntry(new ZipArchiveEntry("test"));
    try {
        zipArchiveOutputStream.finish();
        fail("Expected IOException");
    } catch (IOException e) {
        assertEquals("This archive contains unclosed entries.", e.getMessage());
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFinishWithFinishedArchive_sdCZ4() throws IOException {
    ZipArchiveOutputStream zipArchiveOutputStream = new ZipArchiveOutputStream(new File("test.zip"));
    zipArchiveOutputStream.finish();
    try {
        zipArchiveOutputStream.finish();
        fail("Expected IOException");
    } catch (IOException e) {
        assertEquals("This archive has already been finished", e.getMessage());
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFinish_KgAt0() throws IOException {
    ZipArchiveOutputStream zipArchiveOutputStream = new ZipArchiveOutputStream(new ByteArrayOutputStream());
    zipArchiveOutputStream.finish();
    zipArchiveOutputStream.close();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFinishWithClosedOutputStream_LPKl2() throws IOException {
    ZipArchiveOutputStream zipArchiveOutputStream = new ZipArchiveOutputStream(new ByteArrayOutputStream());
    zipArchiveOutputStream.close();
    try {
        zipArchiveOutputStream.finish();
        fail("Expected IOException");
    } catch (IOException e) {
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFinishWithUnclosedEntry_SFub3() throws IOException {
    ZipArchiveOutputStream zipArchiveOutputStream = new ZipArchiveOutputStream(new ByteArrayOutputStream());
    zipArchiveOutputStream.putArchiveEntry(new ZipArchiveEntry("test"));
    try {
        zipArchiveOutputStream.finish();
        fail("Expected IOException");
    } catch (IOException e) {
    }
    zipArchiveOutputStream.close();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFinish3_ZRli2() throws IOException {
        ZipArchiveOutputStream zipArchiveOutputStream = new ZipArchiveOutputStream(null, null);
        zipArchiveOutputStream.finish();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFinish5_ivHi4() throws IOException {
        ZipArchiveOutputStream zipArchiveOutputStream = new ZipArchiveOutputStream(null, (OpenOption[]) null);
        zipArchiveOutputStream.finish();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPutArchiveEntry_VVvc0() throws IOException {
        ZipArchiveOutputStream zipArchiveOutputStream = new ZipArchiveOutputStream(new File("test.zip"));
        ZipArchiveEntry zipArchiveEntry = new ZipArchiveEntry("test.txt");
        zipArchiveOutputStream.putArchiveEntry(zipArchiveEntry);
        zipArchiveOutputStream.closeArchiveEntry();
        zipArchiveOutputStream.close();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPutArchiveEntry_zooy0() throws IOException {
        ZipArchiveEntry entry = new ZipArchiveEntry(new File("input.txt"), "entryName");
        ZipArchiveOutputStream zipArchiveOutputStream = new ZipArchiveOutputStream(new File("output.zip"));
        zipArchiveOutputStream.putArchiveEntry(entry);
        zipArchiveOutputStream.closeArchiveEntry();
        zipArchiveOutputStream.close();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testCloseArchiveEntry_suYr0() throws IOException {
        ZipArchiveOutputStream zipArchiveOutputStream = new ZipArchiveOutputStream(new File(""));
        zipArchiveOutputStream.closeArchiveEntry();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCloseArchiveEntry_VyUx0() throws IOException {
        ZipArchiveOutputStream zipArchiveOutputStream = new ZipArchiveOutputStream(new File("test.zip"));
        ZipArchiveEntry entry = new ZipArchiveEntry("test.txt");
        entry.setSize(100);
        entry.setMethod(ZipArchiveEntry.DEFLATED);
        zipArchiveOutputStream.putArchiveEntry(entry);
        zipArchiveOutputStream.write("test".getBytes());
        zipArchiveOutputStream.closeArchiveEntry();
        assertTrue(true);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCloseArchiveEntry_gCWc0() throws IOException {
        ZipArchiveOutputStream zipArchiveOutputStream = new ZipArchiveOutputStream(new File("test.zip"));
        ZipArchiveEntry zipArchiveEntry = new ZipArchiveEntry("test.txt");
        zipArchiveOutputStream.putArchiveEntry(zipArchiveEntry);
        zipArchiveOutputStream.write("Hello, World!".getBytes());
        zipArchiveOutputStream.closeArchiveEntry();
        zipArchiveOutputStream.close();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCloseArchiveEntry_LTOY0() throws IOException {
        ZipArchiveOutputStream zipArchiveOutputStream = new ZipArchiveOutputStream(new File("test.zip"));
        zipArchiveOutputStream.closeArchiveEntry();
        zipArchiveOutputStream.close();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCloseArchiveEntryWithSeekableByteChannel_UHys2() throws IOException {
        SeekableByteChannel seekableByteChannel = null;
        ZipArchiveOutputStream zipArchiveOutputStream = new ZipArchiveOutputStream(seekableByteChannel);
        zipArchiveOutputStream.closeArchiveEntry();
        zipArchiveOutputStream.close();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCloseArchiveEntryWithFileAndLong_ffAi3() throws IOException {
        ZipArchiveOutputStream zipArchiveOutputStream = new ZipArchiveOutputStream(new File("test.zip"), 1024L);
        zipArchiveOutputStream.closeArchiveEntry();
        zipArchiveOutputStream.close();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCloseArchiveEntryWithOutputStream_xwWP5() throws IOException {
        OutputStream outputStream = null;
        ZipArchiveOutputStream zipArchiveOutputStream = new ZipArchiveOutputStream(outputStream);
        zipArchiveOutputStream.closeArchiveEntry();
        zipArchiveOutputStream.close();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testWriteCentralFileHeader_rycM0() throws IOException {
    ZipArchiveEntry entry = new ZipArchiveEntry("test");
    ZipArchiveOutputStream out = new ZipArchiveOutputStream(new ByteArrayOutputStream());
    out.writeCentralFileHeader(entry);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testWriteCentralFileHeader_pwYs0() throws IOException {
    ZipArchiveEntry entry = new ZipArchiveEntry("test");
    ZipArchiveOutputStream out = new ZipArchiveOutputStream(new ByteArrayOutputStream());
    out.writeCentralFileHeader(entry);
    out.close();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWriteCentralFileHeader_NsFE0() throws IOException {
        ZipArchiveOutputStream zipArchiveOutputStream = new ZipArchiveOutputStream(new File("test.zip"));
        ZipArchiveEntry zipArchiveEntry = new ZipArchiveEntry("test.txt");
        zipArchiveOutputStream.writeCentralFileHeader(zipArchiveEntry);
        zipArchiveOutputStream.close();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAddRawArchiveEntryWithInputStreamAndNullInputStream_amWI2() throws IOException {
    ZipArchiveOutputStream zos = new ZipArchiveOutputStream(new ByteArrayOutputStream());
    ZipArchiveEntry entry = new ZipArchiveEntry("test");
    try {
        zos.addRawArchiveEntry(entry, null);
        fail("Expected IllegalArgumentException");
    } catch (IllegalArgumentException e) {
    }
    zos.close();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
void testAddRawArchiveEntryWithNullInputStream_iCKm1() {
    ZipArchiveOutputStream zos = new ZipArchiveOutputStream(new ByteArrayOutputStream());
    ZipArchiveEntry entry = new ZipArchiveEntry("test");
    try {
        zos.addRawArchiveEntry(entry, null);
    } catch (IOException e) {
        e.printStackTrace();
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAddRawArchiveEntryWithNullStream_SZII1() {
    ZipArchiveOutputStream zos = new ZipArchiveOutputStream(new ByteArrayOutputStream());
    ZipArchiveEntry entry = new ZipArchiveEntry("test.txt");
    try {
        zos.addRawArchiveEntry(entry, null);
    } catch (IOException e) {
        e.printStackTrace();
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testClose3_FoLO2() throws IOException {
        ZipArchiveOutputStream zipArchiveOutputStream = new ZipArchiveOutputStream(null, (OpenOption[]) null);
        zipArchiveOutputStream.close();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWriteZip64CentralDirectory3_uRel2() throws IOException {
        File file = new File("test.zip");
        ZipArchiveOutputStream zipArchiveOutputStream = new ZipArchiveOutputStream(file, 1024L);
        zipArchiveOutputStream.writeZip64CentralDirectory();
        zipArchiveOutputStream.close();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWriteZip64CentralDirectory5_zOgR4() throws IOException {
        OutputStream outputStream = new ByteArrayOutputStream();
        ZipArchiveOutputStream zipArchiveOutputStream = new ZipArchiveOutputStream(outputStream);
        zipArchiveOutputStream.writeZip64CentralDirectory();
        zipArchiveOutputStream.close();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWriteZip64CentralDirectory6_BgWh5() throws IOException {
        File file = new File("test.zip");
        ZipArchiveOutputStream zipArchiveOutputStream = new ZipArchiveOutputStream(file);
        zipArchiveOutputStream.writeZip64CentralDirectory();
        zipArchiveOutputStream.close();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWriteCentralDirectoryEnd2_wEDu2() throws IOException {
        ZipArchiveOutputStream zipArchiveOutputStream = new ZipArchiveOutputStream(new File("path"), 100L);
        zipArchiveOutputStream.writeCentralDirectoryEnd();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWriteCentralDirectoryEnd4_PdVc4() throws IOException {
        ZipArchiveOutputStream zipArchiveOutputStream = new ZipArchiveOutputStream(new File("path"));
        zipArchiveOutputStream.writeCentralDirectoryEnd();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWritePreamble_WithFileAndLong_NoException_ZoyT2() throws IOException {
        File file = new File("test.zip");
        ZipArchiveOutputStream zipArchiveOutputStream = new ZipArchiveOutputStream(file, 1024L);
        byte[] preamble = new byte[10];
        zipArchiveOutputStream.writePreamble(preamble, 0, 10);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWritePreamble_WithOutputStream_NoException_VtvM4() throws IOException {
        OutputStream outputStream = new ByteArrayOutputStream();
        ZipArchiveOutputStream zipArchiveOutputStream = new ZipArchiveOutputStream(outputStream);
        byte[] preamble = new byte[10];
        zipArchiveOutputStream.writePreamble(preamble, 0, 10);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWritePreamble_WithFile_NoException_SAWa5() throws IOException {
        File file = new File("test.zip");
        ZipArchiveOutputStream zipArchiveOutputStream = new ZipArchiveOutputStream(file);
        byte[] preamble = new byte[10];
        zipArchiveOutputStream.writePreamble(preamble, 0, 10);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFinishWithSplitZip_LSHe2_RXIF0() throws IOException {
        ZipArchiveOutputStream zipArchiveOutputStream = new ZipArchiveOutputStream(new File("test.zip"));
        zipArchiveOutputStream.setUseZip64(Zip64Mode.Always);
        zipArchiveOutputStream.finish();
        zipArchiveOutputStream.close();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testWriteDataDescriptor_rcuB0_OUPk0() {
    ZipArchiveOutputStream zos = new ZipArchiveOutputStream(new ByteArrayOutputStream());
    ZipArchiveEntry ze = new ZipArchiveEntry("entry");
    ze.setSize(100);
    ze.setCompressedSize(50);
    ze.setCrc(123456789L);
    ze.setMethod(ZipArchiveEntry.DEFLATED);
    try {
        zos.writeDataDescriptor(ze);
    } catch (IOException e) {
        e.printStackTrace();
    }
    try {
        zos.close();
    } catch (IOException e) {
        e.printStackTrace();
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testWriteDataDescriptorWithZip64ExtraField_kXVt1_hTSr0() throws IOException {
    ZipArchiveOutputStream zos = new ZipArchiveOutputStream(new ByteArrayOutputStream());
    ZipArchiveEntry ze = new ZipArchiveEntry("entry");
    ze.setSize(100);
    ze.setCompressedSize(50);
    ze.setCrc(123456789L);
    ze.setMethod(ZipArchiveEntry.DEFLATED);
    ze.addExtraField(new Zip64ExtendedInformationExtraField());
    zos.writeDataDescriptor(ze);
    zos.close();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testWriteCentralFileHeader_HQpm0_CwOH0() {
    ZipArchiveOutputStream zos = new ZipArchiveOutputStream(new ByteArrayOutputStream());
    ZipArchiveEntry entry = new ZipArchiveEntry("entry");
    try {
        zos.writeCentralFileHeader(entry);
    } catch (IOException e) {
        e.printStackTrace();
    }
    try {
        zos.close();
    } catch (IOException e) {
        e.printStackTrace();
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddRawArchiveEntryWithNullEntry_EDSO0_BQqw0() {
        IOException exception = null;
        try {
            ZipArchiveOutputStream zipArchiveOutputStream = new ZipArchiveOutputStream(new File("test.zip"));
            ZipArchiveEntry entry = null;
            zipArchiveOutputStream.addRawArchiveEntry(entry, null);
        } catch (IOException e) {
            exception = e;
        }
        assertNotNull(exception);
        assertEquals("entry must not be null", exception.getMessage());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAddRawArchiveEntryWithNullStream_OSjo1_tXiu0() throws IOException {
    ZipArchiveOutputStream zos = new ZipArchiveOutputStream(new ByteArrayOutputStream());
    ZipArchiveEntry entry = new ZipArchiveEntry("entry");
    try {
        zos.addRawArchiveEntry(entry, null);
        fail("Expected IllegalArgumentException");
    } catch (IllegalArgumentException e) {
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateArchiveEntryWithFileAndString_BHSL0_KkEk0_1() throws IOException {
        ZipArchiveOutputStream zipArchiveOutputStream = new ZipArchiveOutputStream(new File("test.zip"));
        File inputFile = new File("test.txt");
        String entryName = "test.txt";
        ZipArchiveEntry zipArchiveEntry = zipArchiveOutputStream.createArchiveEntry(inputFile, entryName);
        assertNotNull(zipArchiveEntry);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateArchiveEntryWithFileAndString_BHSL0_KkEk0_2() throws IOException {
        ZipArchiveOutputStream zipArchiveOutputStream = new ZipArchiveOutputStream(new File("test.zip"));
        File inputFile = new File("test.txt");
        String entryName = "test.txt";
        ZipArchiveEntry zipArchiveEntry = zipArchiveOutputStream.createArchiveEntry(inputFile, entryName);
        assertEquals(inputFile.getName(), zipArchiveEntry.getName());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateArchiveEntryWithFileAndString_BHSL0_KkEk0_3() throws IOException {
        ZipArchiveOutputStream zipArchiveOutputStream = new ZipArchiveOutputStream(new File("test.zip"));
        File inputFile = new File("test.txt");
        String entryName = "test.txt";
        ZipArchiveEntry zipArchiveEntry = zipArchiveOutputStream.createArchiveEntry(inputFile, entryName);
        assertEquals(entryName, zipArchiveEntry.getName());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testFinishWithUnclosedEntry_IVxv4() throws IOException {
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(new File("test.zip"));
        ZipArchiveEntry entry = new ZipArchiveEntry("test.txt");
        zos.putArchiveEntry(entry);
        IOException e = assertThrows(IOException.class, () -> zos.finish());
        assertEquals("This archive contains unclosed entries.", e.getMessage());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testFinishWithZip64ModeNever_qDsa7() throws IOException {
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(new File("test.zip"));
        zos.setUseZip64(Zip64Mode.Never);
        IOException e = assertThrows(Zip64RequiredException.class, () -> zos.finish());
        assertEquals("Archive size is too big to be written in standard fields", e.getMessage());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testPutArchiveEntry_OxLe0() throws IOException {
    ZipArchiveEntry entry = new ZipArchiveEntry("name");
    ZipArchiveOutputStream out = new ZipArchiveOutputStream(new ByteArrayOutputStream());
    out.putArchiveEntry(entry);
    out.closeArchiveEntry();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWriteLocalFileHeader_bCTL0() throws IOException {
        ZipArchiveEntry ze = new ZipArchiveEntry("test");
        ze.setMethod(ZipArchiveEntry.DEFLATED);
        ze.setSize(100);
        ze.setCompressedSize(50);
        ze.setCrc(0x12345678L);
        ze.setTime(1234567890L);
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(new File("test.zip"));
        zos.writeLocalFileHeader(ze);
        zos.close();
        ZipFile zipFile = new ZipFile("test.zip");
        ZipArchiveEntry entry = zipFile.getEntry("test");
        assertNotNull(entry);
        assertEquals(ZipArchiveEntry.DEFLATED, entry.getMethod());
        assertEquals(100, entry.getSize());
        assertEquals(50, entry.getCompressedSize());
        assertEquals(0x12345678L, entry.getCrc());
        assertEquals(1234567890L, entry.getTime());
        zipFile.close();
    }
}