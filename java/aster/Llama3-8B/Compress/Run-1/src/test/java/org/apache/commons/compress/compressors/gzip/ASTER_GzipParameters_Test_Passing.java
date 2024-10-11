/**
 * Generated by Aster
 */
package org.apache.commons.compress.compressors.gzip;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_GzipParameters_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetOperatingSystem_VJzI0() {
        GzipParameters gzipParameters = new GzipParameters();
        gzipParameters.setOperatingSystem(1);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetFileName_mZKt1() {
        GzipParameters gzipParameters = new GzipParameters();
        gzipParameters.setFileName("testFile");
        assertEquals("testFile", gzipParameters.getFileName());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetModificationTime_oJKe0() {
        GzipParameters gzipParameters = new GzipParameters();
        gzipParameters.setModificationTime(1234567890L);
        assert gzipParameters.getModificationTime() == 1234567890L;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetModificationTime_qYgp1() {
        GzipParameters gzipParameters = new GzipParameters();
        long expectedModificationTime = 0;
        long actualModificationTime = gzipParameters.getModificationTime();
        assertEquals(expectedModificationTime, actualModificationTime);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetDeflateStrategy_CNau0() {
        GzipParameters gzipParameters = new GzipParameters();
        gzipParameters.setDeflateStrategy(1);
        assertEquals(1, gzipParameters.getDeflateStrategy());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetFilename_Kmuu1() {
        GzipParameters gzipParameters = new GzipParameters();
        gzipParameters.setFilename("testFile");
        assertEquals("testFile", gzipParameters.getFilename());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFilename_ZxvQ0() {
        GzipParameters gzipParameters = new GzipParameters();
        String expected = "expected filename";
        gzipParameters.setFileName(expected);
        String actual = gzipParameters.getFilename();
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDeflateStrategy_Osif0() {
        GzipParameters gzipParameters = new GzipParameters();
        int expected = 0;
        int actual = gzipParameters.getDeflateStrategy();
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testValidCompressionLevel_UqIn0() {
        GzipParameters gzipParameters = new GzipParameters();
        gzipParameters.setCompressionLevel(6);
        assertEquals(6, gzipParameters.getCompressionLevel());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetBufferSizeValidValue_YBie0() {
        GzipParameters gzipParameters = new GzipParameters();
        gzipParameters.setBufferSize(1024);
        assertEquals(1024, gzipParameters.getBufferSize());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetComment_CTWb1() {
        GzipParameters gzipParameters = new GzipParameters();
        gzipParameters.setComment("test comment");
        assertEquals("test comment", gzipParameters.getComment());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOperatingSystem_aAzn0_fid1() {
        GzipParameters gzipParameters = new GzipParameters();
        int expected =255; // replace with your expected value
        int result = gzipParameters.getOperatingSystem();
        assertEquals(expected, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBufferSize_ydiO512() {
        GzipParameters gzipParameters = new GzipParameters();
        int bufferSize = gzipParameters.getBufferSize();
        assertEquals(512, bufferSize);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetFileName_YIGJ0_PEJS0() {
    GzipParameters gzipParameters = new GzipParameters();
    String expected = "expectedFileName";
    gzipParameters.setFileName(expected);
    String actual = gzipParameters.getFileName();
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetComment_LFrO0_FsIV0() {
    GzipParameters gzipParameters = new GzipParameters();
    String comment = gzipParameters.getComment();
    org.junit.Assert.assertNull(comment);
}
}