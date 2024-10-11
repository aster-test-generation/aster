/**
 * Generated by Aster
 */
package org.apache.commons.compress.utils;
import java.nio.file.Path;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_FileNameUtils_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void test_FilenameUtils_FilenameUtils_QdPl0() throws Exception {
		assertEquals("txt",FileNameUtils.getExtension("test.txt"));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void test_FilenameUtils_FilenameUtils1_QuWG1() throws Exception {
		assertEquals("pdf",FileNameUtils.getExtension("test.pdf"));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void test_FilenameUtils_FilenameUtils2_yoVR2() throws Exception {
		assertEquals("doc",FileNameUtils.getExtension("test.doc"));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void test_FilenameUtils_FilenameUtils3_mEAd3() throws Exception {
		assertEquals("csv",FileNameUtils.getExtension("test.csv"));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void test_FilenameUtils_FilenameUtils4_bYFW4() throws Exception {
		assertEquals("jpg",FileNameUtils.getExtension("test.jpg"));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void test_FilenameUtils_FilenameUtils5_EiWJ5() throws Exception {
		assertEquals("png",FileNameUtils.getExtension("test.png"));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void test_FilenameUtils_FilenameUtils6_TOcs6() throws Exception {
		assertEquals("gif",FileNameUtils.getExtension("test.gif"));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void test_FilenameUtils_FilenameUtils7_SLem7() throws Exception {
		assertEquals("java",FileNameUtils.getExtension("test.java"));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void test_FilenameUtils_FilenameUtils8_lYsG8() throws Exception {
		assertEquals("py",FileNameUtils.getExtension("test.py"));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void test_FilenameUtils_FilenameUtils9_dnkH9() throws Exception {
		assertEquals("js",FileNameUtils.getExtension("test.js"));
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBaseName_WXeC0() throws Exception {
        String fileName = "example.txt";
        String expected = "example";
        String actual = FileNameUtils.getBaseName(fileName);
        assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBaseNameWithNoExtension_Qijk1() throws Exception {
        String fileName = "example";
        String expected = "example";
        String actual = FileNameUtils.getBaseName(fileName);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBaseNameNull_WriN2() throws Exception {
        String fileName = null;
        String expected = null;
        String actual = FileNameUtils.getBaseName(fileName);
        assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBaseNameEmpty_LVTK3() throws Exception {
        String fileName = "";
        String expected = "";
        String actual = FileNameUtils.getBaseName(fileName);
        assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBaseNameWithPath_aCVB4() throws Exception {
        String fileName = "/path/to/example.txt";
        String expected = "example";
        String actual = FileNameUtils.getBaseName(fileName);
        assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBaseNameWithMultipleDots_GKuK5() throws Exception {
        String fileName = "example.tar.gz";
        String expected = "example.tar";
        String actual = FileNameUtils.getBaseName(fileName);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetExtension_withNullPath_returnsNull_ziUp2() throws Exception {
        Path path = null;
        String expectedExtension = null;
        String actualExtension =FileNameUtils.getExtension(path);
        assertEquals(expectedExtension, actualExtension);
    }
}