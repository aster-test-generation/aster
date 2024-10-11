/**
 * Generated by Aster
 */
package org.apache.commons.compress.compressors.pack200;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_Pack200CompressorInputStream_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAvailableTempFile_EBMT2() throws IOException {
    Pack200CompressorInputStream compressorInputStream = new Pack200CompressorInputStream(new File("inputFile"), Pack200Strategy.TEMP_FILE, new HashMap<>());
    int available = compressorInputStream.available();
    assertEquals(-1, available);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAvailableTempFileProperties_QiFA5() throws IOException {
    Map<String, String> properties = new HashMap<>();
    properties.put("key", "value");
    Pack200CompressorInputStream compressorInputStream = new Pack200CompressorInputStream(new File("inputFile"), Pack200Strategy.TEMP_FILE, properties);
    int available = compressorInputStream.available();
    assertEquals(-1, available);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAvailableTempFileStrategy_euoW8() throws IOException {
    Pack200CompressorInputStream compressorInputStream = new Pack200CompressorInputStream(new File("inputFile"), Pack200Strategy.TEMP_FILE);
    int available = compressorInputStream.available();
    assertEquals(-1, available);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAvailableFile_ghjS9() throws IOException {
    Pack200CompressorInputStream compressorInputStream = new Pack200CompressorInputStream(new File("inputFile"));
    int available = compressorInputStream.available();
    assertEquals(-1, available);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMark_PsTG0() throws IOException {
        Pack200CompressorInputStream compressorInputStream = new Pack200CompressorInputStream(new java.io.FileInputStream("test.txt"), Pack200Strategy.IN_MEMORY, new java.util.HashMap<>());
        compressorInputStream.mark(10);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMatchesValidSignature_pWxF0() {
        byte[] signature = new byte[] {0x43, 0x41, 0x46, 0x45, 0x44, 0x4f, 0x4f, 0x44};
        boolean result = Pack200CompressorInputStream.matches(signature, signature.length);
        assertTrue(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMatchesInvalidSignature_Xjdo1() {
        byte[] signature = new byte[] {0x43, 0x41, 0x46, 0x45, 0x44, 0x4f, 0x4f, 0x44, 0x01};
        boolean result = Pack200CompressorInputStream.matches(signature, signature.length);
        assertFalse(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMatchesShortSignature_njXf2() {
        byte[] signature = new byte[] {0x43, 0x41, 0x46, 0x45, 0x44, 0x4f, 0x4f, 0x00};
        boolean result = Pack200CompressorInputStream.matches(signature, signature.length);
        assertFalse(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMatchesNullSignature_mQYP3() {
        byte[] signature = null;
        boolean result = Pack200CompressorInputStream.matches(signature, 8);
        assertFalse(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMarkSupportedInputStream_drzr0() throws IOException {
        InputStream inputStream = new java.io.ByteArrayInputStream(new byte[0]);
        Pack200CompressorInputStream compressorInputStream = new Pack200CompressorInputStream(inputStream);
        boolean result = compressorInputStream.markSupported();
        assert result;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMarkSupportedFileInputStream_AuYK1() throws IOException {
        File file = new java.io.File("test.txt");
        Pack200CompressorInputStream compressorInputStream = new Pack200CompressorInputStream(file);
        boolean result = compressorInputStream.markSupported();
        assert result;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMarkSupportedInputStreamAndMode_oAWp2() throws IOException {
        InputStream inputStream = new java.io.ByteArrayInputStream(new byte[0]);
        Pack200CompressorInputStream compressorInputStream = new Pack200CompressorInputStream(inputStream, Pack200Strategy.IN_MEMORY);
        boolean result = compressorInputStream.markSupported();
        assert result;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMarkSupportedFileInputStreamAndMode_yLbV3() throws IOException {
        File file = new java.io.File("test.txt");
        Pack200CompressorInputStream compressorInputStream = new Pack200CompressorInputStream(file, Pack200Strategy.IN_MEMORY);
        boolean result = compressorInputStream.markSupported();
        assert result;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMarkSupportedInputStreamAndProperties_lADg4() throws IOException {
        InputStream inputStream = new java.io.ByteArrayInputStream(new byte[0]);
        Map<String, String> properties = new java.util.HashMap<>();
        Pack200CompressorInputStream compressorInputStream = new Pack200CompressorInputStream(inputStream, properties);
        boolean result = compressorInputStream.markSupported();
        assert result;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMarkSupportedFileInputStreamAndProperties_jDXj5() throws IOException {
        File file = new java.io.File("test.txt");
        Map<String, String> properties = new java.util.HashMap<>();
        Pack200CompressorInputStream compressorInputStream = new Pack200CompressorInputStream(file, properties);
        boolean result = compressorInputStream.markSupported();
        assert result;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMarkSupportedInputStreamAndModeAndProperties_uNtF6() throws IOException {
        InputStream inputStream = new java.io.ByteArrayInputStream(new byte[0]);
        Map<String, String> properties = new java.util.HashMap<>();
        Pack200CompressorInputStream compressorInputStream = new Pack200CompressorInputStream(inputStream, Pack200Strategy.IN_MEMORY, properties);
        boolean result = compressorInputStream.markSupported();
        assert result;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMarkSupportedFileInputStreamAndModeAndProperties_xvmn7() throws IOException {
        File file = new java.io.File("test.txt");
        Map<String, String> properties = new java.util.HashMap<>();
        Pack200CompressorInputStream compressorInputStream = new Pack200CompressorInputStream(file, Pack200Strategy.IN_MEMORY, properties);
        boolean result = compressorInputStream.markSupported();
        assert result;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMarkSupportedInputStreamAndModeAndTempFile_KZGT8() throws IOException {
        InputStream inputStream = new java.io.ByteArrayInputStream(new byte[0]);
        Pack200CompressorInputStream compressorInputStream = new Pack200CompressorInputStream(inputStream, Pack200Strategy.TEMP_FILE);
        boolean result = compressorInputStream.markSupported();
        assert result;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMarkSupportedFileInputStreamAndModeAndTempFile_OtWb9() throws IOException {
        File file = new java.io.File("test.txt");
        Pack200CompressorInputStream compressorInputStream = new Pack200CompressorInputStream(file, Pack200Strategy.TEMP_FILE);
        boolean result = compressorInputStream.markSupported();
        assert result;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReadInputStream_AQLP0() throws IOException {
        InputStream inputStream = new java.io.ByteArrayInputStream(new byte[0]);
        Pack200CompressorInputStream compressorInputStream = new Pack200CompressorInputStream(inputStream);
        int result = compressorInputStream.read();
        assert result == -1;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReadFile_KWOM1() throws IOException {
        File file = new java.io.File("test.txt");
        Pack200CompressorInputStream compressorInputStream = new Pack200CompressorInputStream(file);
        int result = compressorInputStream.read();
        assert result == -1;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReadInputStreamMode_EFef2() throws IOException {
        InputStream inputStream = new java.io.ByteArrayInputStream(new byte[0]);
        Pack200CompressorInputStream compressorInputStream = new Pack200CompressorInputStream(inputStream, Pack200Strategy.IN_MEMORY);
        int result = compressorInputStream.read();
        assert result == -1;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReadFileMode_HNXY3() throws IOException {
        File file = new java.io.File("test.txt");
        Pack200CompressorInputStream compressorInputStream = new Pack200CompressorInputStream(file, Pack200Strategy.IN_MEMORY);
        int result = compressorInputStream.read();
        assert result == -1;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReadInputStreamProperties_JxBV4() throws IOException {
        InputStream inputStream = new java.io.ByteArrayInputStream(new byte[0]);
        Map<String, String> properties = new HashMap<>();
        Pack200CompressorInputStream compressorInputStream = new Pack200CompressorInputStream(inputStream, properties);
        int result = compressorInputStream.read();
        assert result == -1;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReadFileProperties_kzBp5() throws IOException {
        File file = new java.io.File("test.txt");
        Map<String, String> properties = new HashMap<>();
        Pack200CompressorInputStream compressorInputStream = new Pack200CompressorInputStream(file, properties);
        int result = compressorInputStream.read();
        assert result == -1;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReadInputStreamModeProperties_WSzw6() throws IOException {
        InputStream inputStream = new java.io.ByteArrayInputStream(new byte[0]);
        Map<String, String> properties = new HashMap<>();
        Pack200CompressorInputStream compressorInputStream = new Pack200CompressorInputStream(inputStream, Pack200Strategy.IN_MEMORY, properties);
        int result = compressorInputStream.read();
        assert result == -1;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReadFileModeProperties_nmEV7() throws IOException {
        File file = new java.io.File("test.txt");
        Map<String, String> properties = new HashMap<>();
        Pack200CompressorInputStream compressorInputStream = new Pack200CompressorInputStream(file, Pack200Strategy.IN_MEMORY, properties);
        int result = compressorInputStream.read();
        assert result == -1;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReadInputStreamTempFile_OZvp8() throws IOException {
        InputStream inputStream = new java.io.ByteArrayInputStream(new byte[0]);
        Pack200CompressorInputStream compressorInputStream = new Pack200CompressorInputStream(inputStream, Pack200Strategy.TEMP_FILE);
        int result = compressorInputStream.read();
        assert result == -1;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReadFileTempFile_rhZq9() throws IOException {
        File file = new java.io.File("test.txt");
        Pack200CompressorInputStream compressorInputStream = new Pack200CompressorInputStream(file, Pack200Strategy.TEMP_FILE);
        int result = compressorInputStream.read();
        assert result == -1;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReadInputStreamStrategyProperties_xYbc9() throws IOException {
        Map<String, String> properties = new HashMap<>();
        properties.put("key", "value");
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReset_LPFk0() throws IOException {
        Pack200CompressorInputStream compressorInputStream = new Pack200CompressorInputStream(new java.io.FileInputStream("test"), Pack200Strategy.IN_MEMORY, new java.util.HashMap<>());
        compressorInputStream.reset();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCloseFile_IOLZ1() throws IOException {
    Pack200CompressorInputStream compressorInputStream = new Pack200CompressorInputStream(new File("test.txt"), Pack200Strategy.IN_MEMORY, new HashMap<>());
    compressorInputStream.close();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMarkSupportedInputStreamAndPropertiesAndTempFile_AQZU10_znwC0() throws IOException {
    InputStream inputStream = new java.io.ByteArrayInputStream(new byte[0]);
    Map<String, String> properties = new java.util.HashMap<>();
    Pack200CompressorInputStream compressorInputStream = new Pack200CompressorInputStream(inputStream, Pack200Strategy.TEMP_FILE, properties);
    boolean result = compressorInputStream.markSupported();
    assert result;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMarkSupportedFileInputStreamAndPropertiesAndTempFile_UDrg11_ArKw0() throws IOException {
    File file = new java.io.File("test.txt");
    Map<String, String> properties = new java.util.HashMap<>();
    Pack200CompressorInputStream compressorInputStream = new Pack200CompressorInputStream(file, Pack200Strategy.TEMP_FILE, properties);
    boolean result = compressorInputStream.markSupported();
    assert result;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSkip2_tHSX1_YDXG0() throws IOException {
    Pack200CompressorInputStream compressorInputStream = new Pack200CompressorInputStream(new java.io.FileInputStream("test.txt"), Pack200Strategy.TEMP_FILE, new java.util.HashMap<>());
    long skipped = compressorInputStream.skip(10);
    org.junit.Assert.assertEquals(10L, skipped);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSkip4_MHnZ3_dLhZ0() throws IOException {
    Pack200CompressorInputStream compressorInputStream = new Pack200CompressorInputStream(new java.io.FileInputStream("test.txt"), Pack200Strategy.IN_MEMORY);
    long skipped = compressorInputStream.skip(10);
    org.junit.Assert.assertEquals(10, skipped);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSkip6_IBgK5_PFhV0() throws IOException {
    Pack200CompressorInputStream compressorInputStream = new Pack200CompressorInputStream(new java.io.FileInputStream("test.txt"), Pack200Strategy.TEMP_FILE);
    long skipped = compressorInputStream.skip(10);
    org.junit.Assert.assertEquals(10, skipped);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testReadInputStreamPropertiesTempFile_UAMa10_ylAt0() throws IOException {
    InputStream inputStream = new java.io.ByteArrayInputStream(new byte[0]);
    Map<String, String> properties = new HashMap<>();
    Pack200CompressorInputStream compressorInputStream = new Pack200CompressorInputStream(inputStream, Pack200Strategy.TEMP_FILE, properties);
    int result = compressorInputStream.read();
    assert result == -1;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testReadFilePropertiesTempFile_fUVZ11_nHkt0() throws IOException {
    File file = new java.io.File("test.txt");
    Map<String, String> properties = new HashMap<>();
    Pack200CompressorInputStream compressorInputStream = new Pack200CompressorInputStream(file, Pack200Strategy.TEMP_FILE, properties);
    int result = compressorInputStream.read();
    assert result == -1;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testReadFile_nmnB1_FkHF0() throws IOException {
    Pack200CompressorInputStream compressorInputStream = new Pack200CompressorInputStream(new File("test"), Pack200Strategy.IN_MEMORY, null);
    java.io.ByteArrayOutputStream bos = new java.io.ByteArrayOutputStream(); // fixed
    byte[] b = new byte[10];
    int count = compressorInputStream.read(b, 0, 10);
    bos.write(b, 0, count);
    bos.close();
    assert count > 0;
}
}