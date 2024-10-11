/**
 * Generated by Aster
 */
package org.apache.commons.compress.compressors.pack200;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_Pack200CompressorInputStream_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAvailableWithFileAndNoProperties_Pyzy9() throws IOException {
    Pack200CompressorInputStream stream = new Pack200CompressorInputStream(new File("test.txt"));
    assertEquals(1, stream.available());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testRead1_thiL0() throws IOException {
    Pack200CompressorInputStream inputStream = new Pack200CompressorInputStream(new File("test.txt"), Pack200Strategy.IN_MEMORY, new HashMap<>());
    int result = inputStream.read();
    assertEquals(1, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testRead2_SLdr1() throws IOException {
    Pack200CompressorInputStream inputStream = new Pack200CompressorInputStream(new File("test.txt"), Pack200Strategy.TEMP_FILE, new HashMap<>());
    int result = inputStream.read();
    assertEquals(1, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testRead3_aSyV2() throws IOException {
    Pack200CompressorInputStream inputStream = new Pack200CompressorInputStream(new File("test.txt"), new HashMap<>());
    int result = inputStream.read();
    assertEquals(1, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testRead4_ZuhN3() throws IOException {
    Pack200CompressorInputStream inputStream = new Pack200CompressorInputStream(new File("test.txt"), Pack200Strategy.IN_MEMORY);
    int result = inputStream.read();
    assertEquals(1, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testRead5_CifM4() throws IOException {
    Pack200CompressorInputStream inputStream = new Pack200CompressorInputStream(new File("test.txt"), Pack200Strategy.TEMP_FILE);
    int result = inputStream.read();
    assertEquals(1, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testRead6_uuhy5() throws IOException {
    Pack200CompressorInputStream inputStream = new Pack200CompressorInputStream(new File("test.txt"));
    int result = inputStream.read();
    assertEquals(1, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMarkSupportedWithFileAndProperties_zGvI1() throws IOException {
    Pack200CompressorInputStream pack200CompressorInputStream = new Pack200CompressorInputStream(new File(""), new HashMap<>());
    assertTrue(pack200CompressorInputStream.markSupported());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMarkSupportedWithFileAndMode_rHXf3() throws IOException {
    Pack200CompressorInputStream pack200CompressorInputStream = new Pack200CompressorInputStream(new File(""), Pack200Strategy.IN_MEMORY);
    assertTrue(pack200CompressorInputStream.markSupported());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testReadFile_ARHY2() throws IOException {
    byte[] b = new byte[10];
    Pack200CompressorInputStream inputStream = new Pack200CompressorInputStream(new File("test.txt"));
    int bytesRead = inputStream.read(b);
    assertEquals(10, bytesRead);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testReadFileInMemory_ddUG3() throws IOException {
    byte[] b = new byte[10];
    Pack200CompressorInputStream inputStream = new Pack200CompressorInputStream(new File("test.txt"), Pack200Strategy.IN_MEMORY);
    int bytesRead = inputStream.read(b);
    assertEquals(10, bytesRead);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testReadFileTempFile_WDAA4() throws IOException {
    byte[] b = new byte[10];
    Pack200CompressorInputStream inputStream = new Pack200CompressorInputStream(new File("test.txt"), Pack200Strategy.TEMP_FILE);
    int bytesRead = inputStream.read(b);
    assertEquals(10, bytesRead);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testReadEmptyFileInMemory_BXBe5() throws IOException {
    byte[] b = new byte[0];
    Pack200CompressorInputStream inputStream = new Pack200CompressorInputStream(new File("test.txt"), Pack200Strategy.IN_MEMORY);
    int bytesRead = inputStream.read(b);
    assertEquals(0, bytesRead);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testReadEmptyFileTempFile_RVvn6() throws IOException {
    byte[] b = new byte[0];
    Pack200CompressorInputStream inputStream = new Pack200CompressorInputStream(new File("test.txt"), Pack200Strategy.TEMP_FILE);
    int bytesRead = inputStream.read(b);
    assertEquals(0, bytesRead);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSkip_File_hVuf3() throws IOException {
    Pack200CompressorInputStream stream = new Pack200CompressorInputStream(new File("test.txt"));
    long skipped = stream.skip(10);
    assertEquals(10, skipped);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSkip_File_Properties_Rtus5() throws IOException {
    Pack200CompressorInputStream stream = new Pack200CompressorInputStream(new File("test.txt"), new HashMap<>());
    long skipped = stream.skip(10);
    assertEquals(10, skipped);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSkip_File_Strategy_cDRk7() throws IOException {
    Pack200CompressorInputStream stream = new Pack200CompressorInputStream(new File("test.txt"), Pack200Strategy.TEMP_FILE);
    long skipped = stream.skip(10);
    assertEquals(10, skipped);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMark_WithFileAndStrategy_KMkh5_hrRW0() throws IOException {
    Pack200CompressorInputStream inputStream = new Pack200CompressorInputStream(new File("test.txt"), Pack200Strategy.IN_MEMORY);
    inputStream.mark(10);
    assertEquals(10, inputStream.markSupported());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testReset_File_xeDs1_ziCQ0() throws IOException {
    File file = new File("test.txt");
    Pack200CompressorInputStream stream = new Pack200CompressorInputStream(file);
    stream.reset();
    assertEquals(0, stream.available());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testReset_File_Mode_Boov5_Qtjq0() throws IOException {
    File file = new File("test.txt");
    Pack200CompressorInputStream stream = new Pack200CompressorInputStream(file, Pack200Strategy.IN_MEMORY);
    stream.reset();
    assertEquals(0, stream.available());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testReset_File_Properties_fuJK3_jGQt0() throws IOException {
    File file = new File("test.txt");
    Map<String, String> properties = new HashMap<>();
    properties.put("key", "value");
    Pack200CompressorInputStream stream = new Pack200CompressorInputStream(file, properties);
    stream.reset();
    assertEquals(0, stream.available());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testReset_File_Mode_Properties_Null_mbME9_lYXL0() throws IOException {
    File file = new File("test.txt");
    Pack200CompressorInputStream stream = new Pack200CompressorInputStream(file, Pack200Strategy.IN_MEMORY, null);
    stream.reset();
    assertEquals(0, stream.available());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testReset_File_Mode_Properties_OXsu7_Sjwq0() throws IOException {
    File file = new File("test.txt");
    Map<String, String> properties = new HashMap<>();
    properties.put("key", "value");
    Pack200CompressorInputStream stream = new Pack200CompressorInputStream(file, Pack200Strategy.IN_MEMORY, properties);
    stream.reset();
    assertEquals(0, stream.available());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatches_NullSignature_VkQF2_fid1() {
    byte[] signature = null;
    int length = 4;
    assertFalse(Pack200CompressorInputStream.matches(signature, length));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAvailableWithFileAndNoProperties_Pyzy9_fid1() throws IOException {
    Pack200CompressorInputStream stream = new Pack200CompressorInputStream(new File("test.txt"));
    assertEquals(0, stream.available());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatches_ValidSignature_IigK0_absY0_fid1() {
    byte[] signature = new byte[] { (byte) 0xCA, (byte) 0xFE, (byte) 0xBA, (byte) 0xBE };
    int length = 4;
    assertTrue(Pack200CompressorInputStream.matches(signature, length));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMark_WithFile_SxMV4_wdOt0() throws IOException {
    Pack200CompressorInputStream inputStream = new Pack200CompressorInputStream(new File("test.txt"), new HashMap<>());
    inputStream.mark(10);
    assertEquals(10, inputStream.markSupported());
}
}