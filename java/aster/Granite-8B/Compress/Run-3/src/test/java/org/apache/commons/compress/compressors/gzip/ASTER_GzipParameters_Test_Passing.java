/**
 * Generated by Aster
 */
package org.apache.commons.compress.compressors.gzip;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_GzipParameters_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCompressionLevel_FLHb0() {
        GzipParameters gzipParameters = new GzipParameters();
        int compressionLevel = gzipParameters.getCompressionLevel();
        assertEquals(0, compressionLevel);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetOperatingSystem_cKTG0() {
    GzipParameters gzipParameters = new GzipParameters();
    gzipParameters.setOperatingSystem(1);
    assertEquals(1, gzipParameters.getOperatingSystem());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetModificationTime_EqJG0() {
        GzipParameters gzipParameters = new GzipParameters();
        gzipParameters.setModificationTime(1234567890L);
        assertEquals(1234567890L, gzipParameters.getModificationTime());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetModificationTime_CFiM0() {
        GzipParameters gzipParameters = new GzipParameters();
        long modificationTime = gzipParameters.getModificationTime();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetDeflateStrategy_GaEd0() {
        GzipParameters gzipParameters = new GzipParameters();
        gzipParameters.setDeflateStrategy(1);
        assertEquals(1, gzipParameters.getDeflateStrategy());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetDeflateStrategyWithInvalidStrategy_MlmG2() {
        GzipParameters gzipParameters = new GzipParameters();
        gzipParameters.setDeflateStrategy(-1);
        assertEquals(0, gzipParameters.getDeflateStrategy());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetDeflateStrategyWithInvalidStrategy2_cdTR3() {
        GzipParameters gzipParameters = new GzipParameters();
        gzipParameters.setDeflateStrategy(10);
        assertEquals(0, gzipParameters.getDeflateStrategy());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetFilenameWithEmptyFileName_nAUg1() {
    GzipParameters gzipParameters = new GzipParameters();
    gzipParameters.setFilename("");
    assertEquals("", gzipParameters.getFileName());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetFilenameWithSpecialCharacters_kvlA2() {
    GzipParameters gzipParameters = new GzipParameters();
    gzipParameters.setFilename("test!@#$%^&*().txt");
    assertEquals("test!@#$%^&*().txt", gzipParameters.getFileName());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFileName_KrIp0() {
        GzipParameters gzipParameters = new GzipParameters();
        String fileName = gzipParameters.getFileName();
        assertNotNull(fileName);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetFilename_EpVz0() {
        GzipParameters gzipParameters = new GzipParameters();
        gzipParameters.setFileName("test.txt");
        assertEquals("test.txt", gzipParameters.getFilename());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testgetOperatingSystem_pXPK0() {
		GzipParameters gzipParameters = new GzipParameters();
		int result = gzipParameters.getOperatingSystem();
		assertEquals(0, result);
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetDeflateStrategy_cbsv0() {
        GzipParameters gzipParameters = new GzipParameters();
        int deflateStrategy = gzipParameters.getDeflateStrategy();
        assertEquals(0, deflateStrategy);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBufferSize_LNfl0() {
        GzipParameters gzipParameters = new GzipParameters();
        int expectedBufferSize = 0; // Replace with expected value
        int actualBufferSize = gzipParameters.getBufferSize();
        assertEquals(expectedBufferSize, actualBufferSize);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBufferSizeWithSmallBufferSize_lHIP1() {
        GzipParameters gzipParameters = new GzipParameters();
        gzipParameters.setBufferSize(10);
        int expectedBufferSize = 10;
        int actualBufferSize = gzipParameters.getBufferSize();
        assertEquals(expectedBufferSize, actualBufferSize);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBufferSizeWithLargeBufferSize_nwrJ2() {
        GzipParameters gzipParameters = new GzipParameters();
        gzipParameters.setBufferSize(10000);
        int expectedBufferSize = 10000;
        int actualBufferSize = gzipParameters.getBufferSize();
        assertEquals(expectedBufferSize, actualBufferSize);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBufferSizeWithZeroBufferSize_TXew3() {
        GzipParameters gzipParameters = new GzipParameters();
        gzipParameters.setBufferSize(0);
        int expectedBufferSize = 0;
        int actualBufferSize = gzipParameters.getBufferSize();
        assertEquals(expectedBufferSize, actualBufferSize);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBufferSizeWithNegativeBufferSize_kVvd4() {
        GzipParameters gzipParameters = new GzipParameters();
        gzipParameters.setBufferSize(-10);
        int expectedBufferSize = 0;
        int actualBufferSize = gzipParameters.getBufferSize();
        assertEquals(expectedBufferSize, actualBufferSize);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetCompressionLevel_UCjc0() {
        GzipParameters gzipParameters = new GzipParameters();
        gzipParameters.setCompressionLevel(0);
        gzipParameters.setCompressionLevel(1);
        gzipParameters.setCompressionLevel(9);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetCompressionLevelInvalidLevel_YsiE1() {
        GzipParameters gzipParameters = new GzipParameters();
        try {
            gzipParameters.setCompressionLevel(-2);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid gzip compression level: -2", e.getMessage());
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetCompressionLevelInvalidLevel2_zlUi2() {
        GzipParameters gzipParameters = new GzipParameters();
        try {
            gzipParameters.setCompressionLevel(10);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid gzip compression level: 10", e.getMessage());
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetComment_hAZF0() {
        GzipParameters gzipParameters = new GzipParameters();
        String comment = gzipParameters.getComment();
        assertNotNull(comment);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetBufferSize_qRsW0() {
        GzipParameters gzipParameters = new GzipParameters();
        gzipParameters.setBufferSize(4096);
        assertEquals(4096, gzipParameters.getBufferSize());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetBufferSizeWithZero_DFHg1() {
        GzipParameters gzipParameters = new GzipParameters();
        Exception exception = null;
        try {
            gzipParameters.setBufferSize(0);
        } catch (IllegalArgumentException e) {
            exception = e;
        }
        assertNotNull(exception);
        assertTrue(exception.getMessage().contains("invalid buffer size: 0"));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetComment_bLAK0() {
        GzipParameters gzipParameters = new GzipParameters();
        gzipParameters.setComment("This is a test comment");
    }
}