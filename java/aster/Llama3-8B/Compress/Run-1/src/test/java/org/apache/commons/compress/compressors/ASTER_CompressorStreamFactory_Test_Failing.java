/**
 * Generated by Aster
 */
package org.apache.commons.compress.compressors;
import java.io.InputStream;
import java.util.Set;
import java.util.SortedMap;
import org.apache.commons.compress.utils.Sets;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.Set;
import java.util.SortedMap;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_CompressorStreamFactory_Test_Failing {
    private int detect(InputStream in) {
        return 0;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCompressorInputStreamProviders_qWSq0() {
    CompressorStreamFactory compressorStreamFactory = new CompressorStreamFactory();
    SortedMap<String, CompressorStreamProvider> compressorInputStreamProviders = compressorStreamFactory.getCompressorInputStreamProviders();
    assertEquals(compressorInputStreamProviders, compressorStreamFactory.getCompressorInputStreamProviders());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCompressorInputStreamProvidersWithDecompressUntilEOF_FPhf1() {
    CompressorStreamFactory compressorStreamFactory = new CompressorStreamFactory(true);
    SortedMap<String, CompressorStreamProvider> compressorInputStreamProviders = compressorStreamFactory.getCompressorInputStreamProviders();
    assertEquals(compressorInputStreamProviders, compressorStreamFactory.getCompressorInputStreamProviders());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCompressorOutputStreamProviders_CVkU0() {
    CompressorStreamFactory compressorStreamFactory = new CompressorStreamFactory();
    SortedMap<String, CompressorStreamProvider> compressorOutputStreamProviders = compressorStreamFactory.getCompressorOutputStreamProviders();
    assertEquals(compressorOutputStreamProviders, compressorStreamFactory.getCompressorOutputStreamProviders());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCompressorOutputStreamProvidersWithMemoryLimit_ZlmU1() {
    CompressorStreamFactory compressorStreamFactory = new CompressorStreamFactory(true, 10);
    SortedMap<String, CompressorStreamProvider> compressorOutputStreamProviders = compressorStreamFactory.getCompressorOutputStreamProviders();
    assertEquals(compressorOutputStreamProviders, compressorStreamFactory.getCompressorOutputStreamProviders());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetInputStreamCompressorNames_esWL0() {
    CompressorStreamFactory compressorStreamFactory = new CompressorStreamFactory();
    Set<String> compressorNames = compressorStreamFactory.getInputStreamCompressorNames();
    Set<String> expectedCompressorNames = Sets.newHashSet("GZIP", "BROTLI", "BZIP2", "XZ", "LZMA", "PACK200", "DEFLATE", "SNAPPY_RAW", "SNAPPY_FRAMED", "Z", "LZ4_BLOCK", "LZ4_FRAMED", "ZSTANDARD", "DEFLATE64");
    assertEquals(expectedCompressorNames, compressorNames);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFindAvailableCompressorOutputStreamProviders_wjer0() {
        SortedMap<String, CompressorStreamProvider> result = CompressorStreamFactory.findAvailableCompressorOutputStreamProviders();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDecompressUntilEOF_OISP0() {
        CompressorStreamFactory compressorStreamFactory = new CompressorStreamFactory();
        assertTrue(compressorStreamFactory.getDecompressUntilEOF());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetDecompressConcatenatedTrue_XUke0() {
    CompressorStreamFactory compressorStreamFactory = new CompressorStreamFactory(true);
    compressorStreamFactory.setDecompressConcatenated(true);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFindAvailableCompressorInputStreamProviders_ECzq0() {
        SortedMap<String, CompressorStreamProvider> result = CompressorStreamFactory.findAvailableCompressorInputStreamProviders();
        assertEquals(0, result.size());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateCompressorInputStream_QJGz0_MHBe0() throws CompressorException {
    CompressorStreamFactory compressorStreamFactory = new CompressorStreamFactory(true);
    java.io.ByteArrayInputStream in = new java.io.ByteArrayInputStream(new byte[0]);
    CompressorInputStream compressorInputStream = compressorStreamFactory.createCompressorInputStream("name", in);
    assert compressorInputStream.getUncompressedCount() == 0;
    assert compressorInputStream.getBytesRead() == 0;
    assert compressorInputStream.getCount() == 0;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateCompressorInputStreamWithMemoryLimit_wXmK1_jdNt0() throws CompressorException {
    CompressorStreamFactory compressorStreamFactory = new CompressorStreamFactory(true, 10);
    java.io.ByteArrayInputStream in = new java.io.ByteArrayInputStream(new byte[0]);
    CompressorInputStream compressorInputStream = compressorStreamFactory.createCompressorInputStream("name", in);
    assert compressorInputStream.getUncompressedCount() == 0;
    assert compressorInputStream.getBytesRead() == 0;
    assert compressorInputStream.getCount() == 0;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBzip2_kjzN0_fid2() {
        assertEquals("BZIP2", CompressorStreamFactory.getBzip2());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetZ_dfRh0() {
        assertEquals("Z", CompressorStreamFactory.getZ());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLZ4Framed_Xysy0_fid2() {
    assertEquals("LZ4_FRAMED", CompressorStreamFactory.getLZ4Framed());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLzma_XkqC0_fid2() {
        assertEquals("LZMA", CompressorStreamFactory.getLzma());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSnappyRaw_uHoV0_fid2() {
        assertEquals("SNAPPY_RAW", CompressorStreamFactory.getSnappyRaw());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLZ4Block_unlN0_fid2() {
        assertEquals("LZ4_BLOCK", CompressorStreamFactory.getLZ4Block());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDeflate_oxFA0_fid2() {
        assertEquals("DEFLATE", CompressorStreamFactory.getDeflate());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetSnappyFramed_VKua0_fid2() {
    assertEquals("SNAPPY_FRAMED", CompressorStreamFactory.getSnappyFramed());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDeflate64_qvwv0_fid2() {
        assertEquals("DEFLATE64", CompressorStreamFactory.getDeflate64());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBrotli_rPDq0_fid2() {
    String result = CompressorStreamFactory.getBrotli();
    assertEquals("BROTLI", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateCompressorInputStreamWithoutDecompressUntilEOF_aTvn2_NTVw0() throws CompressorException {
    CompressorStreamFactory compressorStreamFactory = new CompressorStreamFactory();
    java.io.ByteArrayInputStream in = new java.io.ByteArrayInputStream(new byte[0]);
    CompressorInputStream compressorInputStream = compressorStreamFactory.createCompressorInputStream("name", in);
    assert compressorInputStream.getUncompressedCount() == 0;
    assert compressorInputStream.getBytesRead() == 0;
    assert compressorInputStream.getCount() == 0;
}
}