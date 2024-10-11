/**
 * Generated by Aster
 */
package org.apache.commons.compress.compressors;
import java.util.Set;
import java.util.TreeMap;
import static org.junit.jupiter.api.Assertions.*;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeMap;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_CompressorStreamFactory_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetZstandard_EHzQ0() {
    CompressorStreamFactory factory = new CompressorStreamFactory(false);
    String zstandard = factory.getZstandard();
    assertEquals("zstd", zstandard);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetZstandardWithDecompressUntilEOF_EcqS1() {
    CompressorStreamFactory factory = new CompressorStreamFactory(true);
    String zstandard = factory.getZstandard();
    assertEquals("zstd", zstandard);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetZstandardWithMemoryLimit_BnBN2() {
    CompressorStreamFactory factory = new CompressorStreamFactory(false, 1024);
    String zstandard = factory.getZstandard();
    assertEquals("zstd", zstandard);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBzip2_QddB0() {
    String bzip2 = CompressorStreamFactory.getBzip2();
    assertEquals("bzip2", bzip2);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBzip2WithDecompressUntilEOF_izbD1() {
    CompressorStreamFactory factory = new CompressorStreamFactory(true);
    String bzip2 = factory.getBzip2();
    assertEquals("bzip2", bzip2);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBzip2WithMemoryLimit_BdgX2() {
    CompressorStreamFactory factory = new CompressorStreamFactory(true, 1024);
    String bzip2 = factory.getBzip2();
    assertEquals("bzip2", bzip2);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetDecompressUntilEOF_True_ZJMy0() {
    CompressorStreamFactory factory = new CompressorStreamFactory(true);
    assertTrue(factory.getDecompressUntilEOF());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetDecompressUntilEOF_False_NOzR1() {
    CompressorStreamFactory factory = new CompressorStreamFactory(false);
    assertFalse(factory.getDecompressUntilEOF());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetDeflate_VgkH0() {
    String expected = "deflate";
    String actual = CompressorStreamFactory.getDeflate();
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetDecompressConcatenated_DefaultConstructor_gAne0() {
    CompressorStreamFactory factory = new CompressorStreamFactory();
    assertFalse(factory.getDecompressConcatenated());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetDecompressConcatenated_DecompressUntilEOF_evab1() {
    CompressorStreamFactory factory = new CompressorStreamFactory(true);
    assertTrue(factory.getDecompressConcatenated());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetDecompressConcatenated_MemoryLimit_nPIL2() {
    CompressorStreamFactory factory = new CompressorStreamFactory(false, 1024);
    assertFalse(factory.getDecompressConcatenated());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetDecompressConcatenated_DecompressUntilEOFAndMemoryLimit_lBkc3() {
    CompressorStreamFactory factory = new CompressorStreamFactory(true, 1024);
    assertTrue(factory.getDecompressConcatenated());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetDecompressConcatenated_NegativeMemoryLimit_nOSC5() {
    CompressorStreamFactory factory = new CompressorStreamFactory(false, -1);
    assertFalse(factory.getDecompressConcatenated());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetDecompressConcatenated_ZeroMemoryLimit_mdsC6() {
    CompressorStreamFactory factory = new CompressorStreamFactory(false, 0);
    assertFalse(factory.getDecompressConcatenated());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetDecompressConcatenated_LargeMemoryLimit_OQoL7() {
    CompressorStreamFactory factory = new CompressorStreamFactory(false, 1024 * 1024);
    assertFalse(factory.getDecompressConcatenated());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetDecompressConcatenated_InvalidMemoryLimit_phJY8() {
    CompressorStreamFactory factory = new CompressorStreamFactory(false, -1024);
    assertFalse(factory.getDecompressConcatenated());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetSingleton_jDXa0() {
    CompressorStreamFactory factory = CompressorStreamFactory.getSingleton();
    assertNotNull(factory);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetInputStreamCompressorNames_wTDU5() {
    CompressorStreamFactory factory = CompressorStreamFactory.getSingleton();
    Set<String> names = factory.getInputStreamCompressorNames();
    assertNotNull(names);
    assertFalse(names.isEmpty());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetOutputStreamCompressorNames_jvVB6() {
    CompressorStreamFactory factory = CompressorStreamFactory.getSingleton();
    Set<String> names = factory.getOutputStreamCompressorNames();
    assertNotNull(names);
    assertFalse(names.isEmpty());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetDeflate64_jEgp0() {
    CompressorStreamFactory factory = new CompressorStreamFactory();
    String deflate64 = factory.getDeflate64();
    assertEquals("deflate64", deflate64);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetDeflate64WithDecompressUntilEOF_kHgM1() {
    CompressorStreamFactory factory = new CompressorStreamFactory(true);
    String deflate64 = factory.getDeflate64();
    assertEquals("deflate64", deflate64);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetInputStreamCompressorNames_wyhS0_1() {
    CompressorStreamFactory factory = new CompressorStreamFactory();
    Set<String> compressorNames = factory.getInputStreamCompressorNames();
    assertEquals(14, compressorNames.size());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetInputStreamCompressorNames_wyhS0_2() {
    CompressorStreamFactory factory = new CompressorStreamFactory();
    Set<String> compressorNames = factory.getInputStreamCompressorNames();
    assertFalse(compressorNames.contains("GZIP"));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetInputStreamCompressorNames_wyhS0_3() {
    CompressorStreamFactory factory = new CompressorStreamFactory();
    Set<String> compressorNames = factory.getInputStreamCompressorNames();
    assertFalse(compressorNames.contains("BROTLI"));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetInputStreamCompressorNames_wyhS0_4() {
    CompressorStreamFactory factory = new CompressorStreamFactory();
    Set<String> compressorNames = factory.getInputStreamCompressorNames();
    assertFalse(compressorNames.contains("BZIP2"));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetInputStreamCompressorNames_wyhS0_5() {
    CompressorStreamFactory factory = new CompressorStreamFactory();
    Set<String> compressorNames = factory.getInputStreamCompressorNames();
    assertFalse(compressorNames.contains("XZ"));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetInputStreamCompressorNames_wyhS0_6() {
    CompressorStreamFactory factory = new CompressorStreamFactory();
    Set<String> compressorNames = factory.getInputStreamCompressorNames();
    assertFalse(compressorNames.contains("LZMA"));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetInputStreamCompressorNames_wyhS0_7() {
    CompressorStreamFactory factory = new CompressorStreamFactory();
    Set<String> compressorNames = factory.getInputStreamCompressorNames();
    assertFalse(compressorNames.contains("PACK200"));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetInputStreamCompressorNames_wyhS0_8() {
    CompressorStreamFactory factory = new CompressorStreamFactory();
    Set<String> compressorNames = factory.getInputStreamCompressorNames();
    assertFalse(compressorNames.contains("DEFLATE"));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetInputStreamCompressorNames_wyhS0_9() {
    CompressorStreamFactory factory = new CompressorStreamFactory();
    Set<String> compressorNames = factory.getInputStreamCompressorNames();
    assertFalse(compressorNames.contains("SNAPPY_RAW"));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetInputStreamCompressorNames_wyhS0_10() {
    CompressorStreamFactory factory = new CompressorStreamFactory();
    Set<String> compressorNames = factory.getInputStreamCompressorNames();
    assertFalse(compressorNames.contains("SNAPPY_FRAMED"));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetInputStreamCompressorNames_wyhS0_11() {
    CompressorStreamFactory factory = new CompressorStreamFactory();
    Set<String> compressorNames = factory.getInputStreamCompressorNames();
    assertFalse(compressorNames.contains("Z"));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetInputStreamCompressorNames_wyhS0_12() {
    CompressorStreamFactory factory = new CompressorStreamFactory();
    Set<String> compressorNames = factory.getInputStreamCompressorNames();
    assertFalse(compressorNames.contains("LZ4_BLOCK"));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetInputStreamCompressorNames_wyhS0_13() {
    CompressorStreamFactory factory = new CompressorStreamFactory();
    Set<String> compressorNames = factory.getInputStreamCompressorNames();
    assertFalse(compressorNames.contains("LZ4_FRAMED"));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetInputStreamCompressorNames_wyhS0_14() {
    CompressorStreamFactory factory = new CompressorStreamFactory();
    Set<String> compressorNames = factory.getInputStreamCompressorNames();
    assertFalse(compressorNames.contains("ZSTANDARD"));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetInputStreamCompressorNames_wyhS0_15() {
    CompressorStreamFactory factory = new CompressorStreamFactory();
    Set<String> compressorNames = factory.getInputStreamCompressorNames();
    assertFalse(compressorNames.contains("DEFLATE64"));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetInputStreamCompressorNamesWith100PercentCoverage_HMYp1_1() {
    CompressorStreamFactory factory = new CompressorStreamFactory(true, 1024);
    Set<String> compressorNames = factory.getInputStreamCompressorNames();
    assertEquals(14, compressorNames.size());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetInputStreamCompressorNamesWith100PercentCoverage_HMYp1_2() {
    CompressorStreamFactory factory = new CompressorStreamFactory(true, 1024);
    Set<String> compressorNames = factory.getInputStreamCompressorNames();
    assertFalse(compressorNames.contains("GZIP"));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetInputStreamCompressorNamesWith100PercentCoverage_HMYp1_3() {
    CompressorStreamFactory factory = new CompressorStreamFactory(true, 1024);
    Set<String> compressorNames = factory.getInputStreamCompressorNames();
    assertFalse(compressorNames.contains("BROTLI"));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetInputStreamCompressorNamesWith100PercentCoverage_HMYp1_4() {
    CompressorStreamFactory factory = new CompressorStreamFactory(true, 1024);
    Set<String> compressorNames = factory.getInputStreamCompressorNames();
    assertFalse(compressorNames.contains("BZIP2"));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetInputStreamCompressorNamesWith100PercentCoverage_HMYp1_5() {
    CompressorStreamFactory factory = new CompressorStreamFactory(true, 1024);
    Set<String> compressorNames = factory.getInputStreamCompressorNames();
    assertFalse(compressorNames.contains("XZ"));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetInputStreamCompressorNamesWith100PercentCoverage_HMYp1_6() {
    CompressorStreamFactory factory = new CompressorStreamFactory(true, 1024);
    Set<String> compressorNames = factory.getInputStreamCompressorNames();
    assertFalse(compressorNames.contains("LZMA"));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetInputStreamCompressorNamesWith100PercentCoverage_HMYp1_7() {
    CompressorStreamFactory factory = new CompressorStreamFactory(true, 1024);
    Set<String> compressorNames = factory.getInputStreamCompressorNames();
    assertFalse(compressorNames.contains("PACK200"));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetInputStreamCompressorNamesWith100PercentCoverage_HMYp1_8() {
    CompressorStreamFactory factory = new CompressorStreamFactory(true, 1024);
    Set<String> compressorNames = factory.getInputStreamCompressorNames();
    assertFalse(compressorNames.contains("DEFLATE"));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetInputStreamCompressorNamesWith100PercentCoverage_HMYp1_9() {
    CompressorStreamFactory factory = new CompressorStreamFactory(true, 1024);
    Set<String> compressorNames = factory.getInputStreamCompressorNames();
    assertFalse(compressorNames.contains("SNAPPY_RAW"));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetInputStreamCompressorNamesWith100PercentCoverage_HMYp1_10() {
    CompressorStreamFactory factory = new CompressorStreamFactory(true, 1024);
    Set<String> compressorNames = factory.getInputStreamCompressorNames();
    assertFalse(compressorNames.contains("SNAPPY_FRAMED"));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetInputStreamCompressorNamesWith100PercentCoverage_HMYp1_11() {
    CompressorStreamFactory factory = new CompressorStreamFactory(true, 1024);
    Set<String> compressorNames = factory.getInputStreamCompressorNames();
    assertFalse(compressorNames.contains("Z"));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetInputStreamCompressorNamesWith100PercentCoverage_HMYp1_12() {
    CompressorStreamFactory factory = new CompressorStreamFactory(true, 1024);
    Set<String> compressorNames = factory.getInputStreamCompressorNames();
    assertFalse(compressorNames.contains("LZ4_BLOCK"));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetInputStreamCompressorNamesWith100PercentCoverage_HMYp1_13() {
    CompressorStreamFactory factory = new CompressorStreamFactory(true, 1024);
    Set<String> compressorNames = factory.getInputStreamCompressorNames();
    assertFalse(compressorNames.contains("LZ4_FRAMED"));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetInputStreamCompressorNamesWith100PercentCoverage_HMYp1_14() {
    CompressorStreamFactory factory = new CompressorStreamFactory(true, 1024);
    Set<String> compressorNames = factory.getInputStreamCompressorNames();
    assertFalse(compressorNames.contains("ZSTANDARD"));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetInputStreamCompressorNamesWith100PercentCoverage_HMYp1_15() {
    CompressorStreamFactory factory = new CompressorStreamFactory(true, 1024);
    Set<String> compressorNames = factory.getInputStreamCompressorNames();
    assertFalse(compressorNames.contains("DEFLATE64"));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLzma_MVhq0_fid1() {
    CompressorStreamFactory factory = new CompressorStreamFactory(true);
    String lzma = factory.getLzma();
    assertEquals("lzma", lzma);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLzmaWithMemoryLimit_VdCq1_fid1() {
    CompressorStreamFactory factory = new CompressorStreamFactory(true, 1024);
    String lzma = factory.getLzma();
    assertEquals("lzma", lzma);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetInputStreamCompressorNames_wTDU5_1() {
    CompressorStreamFactory factory = CompressorStreamFactory.getSingleton();
    Set<String> names = factory.getInputStreamCompressorNames();
    assertNotNull(names);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetInputStreamCompressorNames_wTDU5_2() {
    CompressorStreamFactory factory = CompressorStreamFactory.getSingleton();
    Set<String> names = factory.getInputStreamCompressorNames();
    assertFalse(names.isEmpty());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetOutputStreamCompressorNames_jvVB6_1() {
    CompressorStreamFactory factory = CompressorStreamFactory.getSingleton();
    Set<String> names = factory.getOutputStreamCompressorNames();
    assertNotNull(names);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetOutputStreamCompressorNames_jvVB6_2() {
    CompressorStreamFactory factory = CompressorStreamFactory.getSingleton();
    Set<String> names = factory.getOutputStreamCompressorNames();
    assertFalse(names.isEmpty());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPack200_cnXd0_fid1() {
    CompressorStreamFactory factory = new CompressorStreamFactory(true);
    String pack200 = factory.getPack200();
    assertEquals("pack200", pack200);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPack200WithMemoryLimit_uGRv1_fid1() {
    CompressorStreamFactory factory = new CompressorStreamFactory(true, 1024);
    String pack200 = factory.getPack200();
    assertEquals("pack200", pack200);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPack200WithoutDecompressUntilEOF_rQPH2_fid1() {
    CompressorStreamFactory factory = new CompressorStreamFactory(false);
    String pack200 = factory.getPack200();
    assertEquals("pack200", pack200);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPack200WithInvalidMemoryLimit_TKYb3_fid1() {
    CompressorStreamFactory factory = new CompressorStreamFactory(true, -1);
    String pack200 = factory.getPack200();
    assertEquals("pack200", pack200);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testPutAll_multipleEntries_NcCz2_fEFm0_1() {
    Set<String> names = new HashSet<>();
    names.add("name1");
    names.add("name2");
    CompressorStreamFactory factory = new CompressorStreamFactory();
    TreeMap<String, CompressorStreamProvider> map = new TreeMap<>();
    CompressorStreamFactory.putAll(names, factory, map);
    assertEquals(2, map.size());}
}