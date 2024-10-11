/**
 * Generated by Aster
 */
package org.apache.commons.compress.compressors.pack200;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_Pack200CompressorInputStream_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAvailableFile_BMUn1() throws IOException {
    Pack200CompressorInputStream compressorInputStream = new Pack200CompressorInputStream(new File("test"), new HashMap<>());
    assertEquals(-1, compressorInputStream.available());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAvailableFileMode_kpaI3() throws IOException {
    Pack200CompressorInputStream compressorInputStream = new Pack200CompressorInputStream(new File("test"), Pack200Strategy.IN_MEMORY, new HashMap<>());
    assertEquals(-1, compressorInputStream.available());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatchesValidSignature_dbua0() {
    byte[] signature = new byte[] {0x43, 0x41, 0x46, 0x45, 0x44, 0x4f, 0x4f, 0x44};
    boolean result = Pack200CompressorInputStream.matches(signature, signature.length);
    assert result;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatchesNullSignature_qJlL3() {
    boolean result = Pack200CompressorInputStream.matches(null, 8);
    assert !result;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMarkWithTempFile_djjF2() throws IOException {
        Pack200CompressorInputStream compressorInputStream = new Pack200CompressorInputStream(new File("testFile"), Pack200Strategy.TEMP_FILE, new HashMap<>());
        compressorInputStream.mark(10);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMarkWithFile_iRjT4() throws IOException {
        Pack200CompressorInputStream compressorInputStream = new Pack200CompressorInputStream(new File("testFile"), new HashMap<>());
        compressorInputStream.mark(10);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMarkWithFileAndStrategy_XRui9() throws IOException {
        Pack200CompressorInputStream compressorInputStream = new Pack200CompressorInputStream(new File("testFile"), Pack200Strategy.IN_MEMORY, new HashMap<>());
        compressorInputStream.mark(10);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMarkSupportedTempFile_Atzz2() throws IOException {
    Pack200CompressorInputStream compressorInputStream = new Pack200CompressorInputStream(new File("testfile"), Pack200Strategy.TEMP_FILE, new HashMap<>());
    boolean result = compressorInputStream.markSupported();
    Assertions.assertTrue(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMarkSupportedFileInputStreamAndMode_qAEg5() throws IOException {
    Pack200CompressorInputStream compressorInputStream = new Pack200CompressorInputStream(new File("testfile"), Pack200Strategy.IN_MEMORY, new HashMap<>());
    boolean result = compressorInputStream.markSupported();
    Assertions.assertTrue(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMarkSupportedFileInputStreamAndProperties_MtIc7() throws IOException {
    Map<String, String> properties = new HashMap<>();
    properties.put("key", "value");
    Pack200CompressorInputStream compressorInputStream = new Pack200CompressorInputStream(new File("testfile"), properties);
    boolean result = compressorInputStream.markSupported();
    Assertions.assertTrue(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMarkSupportedFileInputStream_fITr8() throws IOException {
    Pack200CompressorInputStream compressorInputStream = new Pack200CompressorInputStream(new File("testfile"));
    boolean result = compressorInputStream.markSupported();
    Assertions.assertTrue(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSkip_ScnH0() throws IOException {
        Map<String, String> properties = new HashMap<>();
        Pack200CompressorInputStream compressorInputStream = new Pack200CompressorInputStream(new File("file"), properties);
        long result = compressorInputStream.skip(10);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSkipWithStrategy_DkBY1() throws IOException {
        Map<String, String> properties = new HashMap<>();
        Pack200CompressorInputStream compressorInputStream = new Pack200CompressorInputStream(new File("file"), Pack200Strategy.IN_MEMORY, properties);
        long result = compressorInputStream.skip(10);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReset_juuy0() throws IOException {
        Pack200CompressorInputStream compressorInputStream = new Pack200CompressorInputStream(new java.io.FileInputStream("file"), Pack200Strategy.IN_MEMORY, new java.util.HashMap<>());
        compressorInputStream.reset();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testResetWithTempFile_mekR1() throws IOException {
        Pack200CompressorInputStream compressorInputStream = new Pack200CompressorInputStream(new java.io.File("file"), Pack200Strategy.TEMP_FILE, new java.util.HashMap<>());
        compressorInputStream.reset();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testResetWithInputStream_nrej2() throws IOException {
        Pack200CompressorInputStream compressorInputStream = new Pack200CompressorInputStream(new java.io.FileInputStream("file"), new java.util.HashMap<>());
        compressorInputStream.reset();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testResetWithProperties_jEou3() throws IOException {
        Pack200CompressorInputStream compressorInputStream = new Pack200CompressorInputStream(new java.io.FileInputStream("file"), new java.util.HashMap<String, String>());
        compressorInputStream.reset();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testResetWithMode_XNzg4() throws IOException {
        Pack200CompressorInputStream compressorInputStream = new Pack200CompressorInputStream(new java.io.FileInputStream("file"), Pack200Strategy.IN_MEMORY);
        compressorInputStream.reset();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReadInputStreamFile_nvHw3() throws IOException {
        Pack200CompressorInputStream compressorInputStream = new Pack200CompressorInputStream(new File(""), new HashMap<>());
        int result = compressorInputStream.read();
        assert result != -1;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReadInputStreamFileMode_NtzE4() throws IOException {
        Pack200CompressorInputStream compressorInputStream = new Pack200CompressorInputStream(new File(""), Pack200Strategy.IN_MEMORY, new HashMap<>());
        int result = compressorInputStream.read();
        assert result != -1;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReadFile_Ahta13() throws IOException {
        Pack200CompressorInputStream compressorInputStream = new Pack200CompressorInputStream(new File(""));
        int result = compressorInputStream.read();
        assert result != -1;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReadFile_QiJN1() throws IOException {
        Pack200CompressorInputStream compressorInputStream = new Pack200CompressorInputStream(new File("test.txt"), new HashMap<>());
        byte[] b = new byte[10];
        int count = 5;
        int result = compressorInputStream.read(b, 0, count);
        assert result == 0;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReadFileStrategy_RWYz3() throws IOException {
        Pack200CompressorInputStream compressorInputStream = new Pack200CompressorInputStream(new File("test.txt"), Pack200Strategy.IN_MEMORY, new HashMap<>());
        byte[] b = new byte[10];
        int count = 5;
        int result = compressorInputStream.read(b, 0, count);
        assert result == 0;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReadFileProperties_ZGgD5() throws IOException {
        Map<String, String> properties = new HashMap<>();
        properties.put("key", "value");
        Pack200CompressorInputStream compressorInputStream = new Pack200CompressorInputStream(new File("test.txt"), properties);
        byte[] b = new byte[10];
        int count = 5;
        int result = compressorInputStream.read(b, 0, count);
        assert result == 0;
    }
}