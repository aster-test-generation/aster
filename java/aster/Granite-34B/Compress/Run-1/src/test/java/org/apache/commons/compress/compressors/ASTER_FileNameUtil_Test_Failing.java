/**
 * Generated by Aster
 */
package org.apache.commons.compress.compressors;
import java.util.HashMap;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_FileNameUtil_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getCompressedFilename_withValidInput_returnsCompressedFileName_OnDA0() {
        Map<String, String> uncompressSuffix = new HashMap<>();
        uncompressSuffix.put(".zip", ".tar");
        uncompressSuffix.put(".tar", ".gz");
        String defaultExtension = ".zip";
        FileNameUtil fileNameUtil = new FileNameUtil(uncompressSuffix, defaultExtension);
        String compressedFileName = fileNameUtil.getCompressedFilename("test.tar");
        assertEquals("test.tar.gz", compressedFileName);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void test_getCompressedFileName_with_valid_input_should_return_compressed_file_name_tidB0() {
    final Map<String, String> uncompressSuffix = new HashMap<>();
    uncompressSuffix.put("zip", ".gz");
    uncompressSuffix.put("tar", ".gz");
    final String defaultExtension = ".gz";
    FileNameUtil fileNameUtil = new FileNameUtil(uncompressSuffix, defaultExtension);
    final String fileName = "test.zip";
    final String actual = fileNameUtil.getCompressedFileName(fileName);
    assertEquals("test.gz", actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void test_getCompressedFileName_with_input_length_greater_than_longest_uncompressed_suffix_should_return_default_extension_uruM5() {
    final Map<String, String> uncompressSuffix = new HashMap<>();
    uncompressSuffix.put("zip", ".gz");
    uncompressSuffix.put("tar", ".gz");
    final String defaultExtension = ".gz";
    FileNameUtil fileNameUtil = new FileNameUtil(uncompressSuffix, defaultExtension);
    final String fileName = "test.zip.tar.gz";
    final String actual = fileNameUtil.getCompressedFileName(fileName);
    assertEquals("test.zip.tar.gz.gz", actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void test_getCompressedFileName_with_input_length_equal_to_longest_uncompressed_suffix_should_return_compressed_file_name_PRLh6() {
    final Map<String, String> uncompressSuffix = new HashMap<>();
    uncompressSuffix.put("zip", ".gz");
    uncompressSuffix.put("tar", ".gz");
    final String defaultExtension = ".gz";
    FileNameUtil fileNameUtil = new FileNameUtil(uncompressSuffix, defaultExtension);
    final String fileName = "test.tar.gz";
    final String actual = fileNameUtil.getCompressedFileName(fileName);
    assertEquals("test.tar.gz", actual);
}
}