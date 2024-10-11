/**
 * Generated by Aster
 */
package org.apache.commons.compress.compressors;
import java.util.HashMap;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_FileNameUtil_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetUncompressedFilename_huvv0() throws Exception {
    Map<String, String> uncompressSuffix = new HashMap<>();
    uncompressSuffix.put("zip", "");
    FileNameUtil fileNameUtil = new FileNameUtil(uncompressSuffix, "txt");
    String fileName = "test.zip";
    String expected = "test";
    String actual = fileNameUtil.getUncompressedFilename(fileName);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsCompressedFilename_PLSW0() throws Exception {
    Map<String, String> uncompressSuffix = new HashMap<>();
    uncompressSuffix.put("zip", "zip");
    uncompressSuffix.put("rar", "rar");
    FileNameUtil fileNameUtil = new FileNameUtil(uncompressSuffix, "txt");
    boolean result = fileNameUtil.isCompressedFilename("test.zip");
    assertTrue(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCompressedFilename_LwuV0() throws Exception {
    Map<String, String> uncompressSuffix = new HashMap<>();
    uncompressSuffix.put("zip", "zip");
    FileNameUtil fileNameUtil = new FileNameUtil(uncompressSuffix, "txt");
    String fileName = "test.txt";
    String expected = "test.zip";
    String actual = fileNameUtil.getCompressedFilename(fileName);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetUncompressedFileName1_gISG0() throws Exception {
    FileNameUtil fileNameUtil = new FileNameUtil(new HashMap<>(), "txt");
    assertEquals("file.txt", fileNameUtil.getUncompressedFileName("file.zip"));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetUncompressedFileName2_LvJW1() throws Exception {
    Map<String, String> uncompressSuffix = new HashMap<>();
    uncompressSuffix.put("zip", "txt");
    FileNameUtil fileNameUtil = new FileNameUtil(uncompressSuffix, "txt");
    assertEquals("file.txt", fileNameUtil.getUncompressedFileName("file.zip"));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetUncompressedFileName3_Exzo2() throws Exception {
    FileNameUtil fileNameUtil = new FileNameUtil(new HashMap<>(), "txt");
    assertEquals("file.txt", fileNameUtil.getUncompressedFileName("file"));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetUncompressedFileName4_hFMV3() throws Exception {
    Map<String, String> uncompressSuffix = new HashMap<>();
    uncompressSuffix.put("rar", "txt");
    FileNameUtil fileNameUtil = new FileNameUtil(uncompressSuffix, "txt");
    assertEquals("file.rar", fileNameUtil.getUncompressedFileName("file.rar"));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCompressedFileName1_MBOc0() throws Exception {
    FileNameUtil fileNameUtil = new FileNameUtil(new HashMap<>(), ".txt");
    String result = fileNameUtil.getCompressedFileName("file.txt");
    assertEquals("file.txt", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCompressedFileName3_sKpy2() throws Exception {
    FileNameUtil fileNameUtil = new FileNameUtil(new HashMap<>(), ".txt");
    String result = fileNameUtil.getCompressedFileName("file");
    assertEquals("file.txt", result);
}
}