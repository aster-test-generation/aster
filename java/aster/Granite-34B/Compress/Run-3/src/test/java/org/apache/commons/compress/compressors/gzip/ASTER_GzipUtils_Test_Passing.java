/**
 * Generated by Aster
 */
package org.apache.commons.compress.compressors.gzip;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_GzipUtils_Test_Passing {
	{
	}
	{
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsCompressedFileName_LeIF0_1() throws Exception {
    String fileName1 = "test.gz";
    boolean expected1 = true;
    boolean actual1 = GzipUtils.isCompressedFileName(fileName1);
    String fileName2 = "test.gzip";
    boolean expected2 = true;
    boolean actual2 = GzipUtils.isCompressedFileName(fileName2);
    String fileName3 = "test.txt";
    boolean expected3 = false;
    boolean actual3 = GzipUtils.isCompressedFileName(fileName3);
    assertEquals(expected1, actual1);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsCompressedFileName_LeIF0_2() throws Exception {
    String fileName1 = "test.gz";
    boolean expected1 = true;
    boolean actual1 = GzipUtils.isCompressedFileName(fileName1);
    String fileName2 = "test.gzip";
    boolean expected2 = true;
    boolean actual2 = GzipUtils.isCompressedFileName(fileName2);
    String fileName3 = "test.txt";
    boolean expected3 = false;
    boolean actual3 = GzipUtils.isCompressedFileName(fileName3);
    assertEquals(expected2, actual2);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsCompressedFileName_LeIF0_3() throws Exception {
    String fileName1 = "test.gz";
    boolean expected1 = true;
    boolean actual1 = GzipUtils.isCompressedFileName(fileName1);
    String fileName2 = "test.gzip";
    boolean expected2 = true;
    boolean actual2 = GzipUtils.isCompressedFileName(fileName2);
    String fileName3 = "test.txt";
    boolean expected3 = false;
    boolean actual3 = GzipUtils.isCompressedFileName(fileName3);
    assertEquals(expected3, actual3);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsCompressedFileNameWithNullFileName_Crfd1() throws Exception {
    String fileName1 = null;
    boolean expected1 = false;
    boolean actual1 = GzipUtils.isCompressedFileName(fileName1);
    assertEquals(expected1, actual1);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsCompressedFileNameWithEmptyFileName_JMVW2() throws Exception {
    String fileName1 = "";
    boolean expected1 = false;
    boolean actual1 = GzipUtils.isCompressedFileName(fileName1);
    assertEquals(expected1, actual1);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testUncompressedFilename_YUkU0_1() throws Exception {
		assertEquals("test.txt",GzipUtils.getUncompressedFilename("test.txt.gz"));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testUncompressedFilename_YUkU0_2() throws Exception {
		assertEquals("test.tar",GzipUtils.getUncompressedFilename("test.tar.gz"));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testUncompressedFilename_YUkU0_3() throws Exception {
		assertEquals("test.zip",GzipUtils.getUncompressedFilename("test.zip.gz"));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testUncompressedFilename_YUkU0_4() throws Exception {
		assertEquals("test.txt.gz",GzipUtils.getUncompressedFilename("test.txt.gz"));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void getUncompressedFileNameTest1_OqFZ0() throws Exception {
		String fileName = "test.gz";
		String expected = "test";
		String actual =GzipUtils.getUncompressedFileName(fileName);
		Assertions.assertEquals(expected, actual);
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void getUncompressedFileNameTest2_QWjy1() throws Exception {
		String fileName = "test.zip";
		String expected = "test";
		String actual =GzipUtils.getUncompressedFileName(fileName);
		Assertions.assertEquals(expected, actual);
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void getUncompressedFileNameTest3_hnSU2() throws Exception {
		String fileName = "test.txt";
		String expected = "test.txt";
		String actual =GzipUtils.getUncompressedFileName(fileName);
		Assertions.assertEquals(expected, actual);
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void getUncompressedFileNameTest4_RHcY3() throws Exception {
		String fileName = "test.tar.gz";
		String expected = "test.tar";
		String actual =GzipUtils.getUncompressedFileName(fileName);
		Assertions.assertEquals(expected, actual);
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void getUncompressedFileNameTest5_fbLT4() throws Exception {
		String fileName = "test.tar.zip";
		String expected = "test.tar";
		String actual =GzipUtils.getUncompressedFileName(fileName);
		Assertions.assertEquals(expected, actual);
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void getUncompressedFileNameTest6_JUAy5() throws Exception {
		String fileName = "test.tar.txt";
		String expected = "test.tar.txt";
		String actual =GzipUtils.getUncompressedFileName(fileName);
		Assertions.assertEquals(expected, actual);
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void getUncompressedFileNameTest7_Canv6() throws Exception {
		String fileName = "test.tar.gz.zip";
		String expected = "test.tar.gz";
		String actual =GzipUtils.getUncompressedFileName(fileName);
		Assertions.assertEquals(expected, actual);
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void getUncompressedFileNameTest8_PzhF7() throws Exception {
		String fileName = "test.tar.zip.gz";
		String expected = "test.tar.zip";
		String actual =GzipUtils.getUncompressedFileName(fileName);
		Assertions.assertEquals(expected, actual);
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void getUncompressedFileNameTest9_FeRl8() throws Exception {
		String fileName = "test.tar.txt.gz";
		String expected = "test.tar.txt";
		String actual =GzipUtils.getUncompressedFileName(fileName);
		Assertions.assertEquals(expected, actual);
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void getUncompressedFileNameTest10_TlDi9() throws Exception {
		String fileName = "test.tar.txt.zip";
		String expected = "test.tar.txt";
		String actual =GzipUtils.getUncompressedFileName(fileName);
		Assertions.assertEquals(expected, actual);
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void test_getCompressedFileName_with_valid_input_OsEh0() throws Exception {
		String fileName = "test.txt";
		String expected = "test.txt.gz";
		String actual =GzipUtils.getCompressedFileName(fileName);
		Assertions.assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void test_getCompressedFileName_with_null_input_eHtt1() throws Exception {
		String fileName = null;
		String expected = null;
		String actual =GzipUtils.getCompressedFileName(fileName);
		Assertions.assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void test_getCompressedFileName_with_empty_input_cUQs2() throws Exception {
		String fileName = "";
		String expected = "";
		String actual =GzipUtils.getCompressedFileName(fileName);
		Assertions.assertEquals(expected, actual);
	}
}