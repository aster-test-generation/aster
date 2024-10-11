/**
 * Generated by Aster
 */
package org.apache.commons.compress.compressors.lzma;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_LZMAUtils_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsCompressedFileName_uLtX0() throws Exception {
    String fileName = "archive.tar.gz";
    boolean result = LZMAUtils.isCompressedFileName(fileName);
    assertTrue(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetUncompressedFilename_mwTV0() throws Exception {
    String inputFilename = "testfile.lzma";
    String expectedOutput = "testfile";
    String actualOutput = LZMAUtils.getUncompressedFilename(inputFilename);
    assertEquals(expectedOutput, actualOutput);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsCompressedFilenameWithLzmaExtension_PmGY0() throws Exception {
    String testFileName = "example.lzma";
    boolean result = LZMAUtils.isCompressedFilename(testFileName);
    assertTrue(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMatchesShorterLength_cPZk3() throws Exception {
        byte[] signature = {0x5D, 0x00, 0x00};
        assertFalse(LZMAUtils.matches(signature, signature.length));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCompressedFilename_GpZe0() throws Exception {
    String inputFileName = "example.txt";
    String expectedOutput = "example.txt.lzma";
    String actualOutput = LZMAUtils.getCompressedFilename(inputFileName);
    assertEquals(expectedOutput, actualOutput);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetUncompressedFileName_tqOX0() throws Exception {
    String inputFileName = "testfile.lzma";
    String expectedOutput = "testfile";
    String actualOutput = LZMAUtils.getUncompressedFileName(inputFileName);
    assertEquals(expectedOutput, actualOutput);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCompressedFileName_uxvD0() throws Exception {
    String inputFileName = "example.txt";
    String expectedOutput = "example.txt.lzma";
    String actualOutput = LZMAUtils.getCompressedFileName(inputFileName);
    assertEquals(expectedOutput, actualOutput);
}
}