/**
 * Generated by Aster
 */
package org.apache.commons.compress.compressors;
import java.io.OutputStream;
import java.util.Collections;
import java.util.SortedMap;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Collections;
import java.util.Map;
import java.util.SortedMap;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_CompressorStreamFactory_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCompressorInputStreamProviders1_vdAg0() {
    CompressorStreamFactory factory = new CompressorStreamFactory();
    SortedMap<String, CompressorStreamProvider> providers = factory.getCompressorInputStreamProviders();
    assertNotNull(providers);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCompressorInputStreamProviders2_reCc1() {
    CompressorStreamFactory factory = new CompressorStreamFactory(true);
    SortedMap<String, CompressorStreamProvider> providers = factory.getCompressorInputStreamProviders();
    assertNotNull(providers);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCompressorOutputStreamProviders1_FDzv0() {
    CompressorStreamFactory compressorStreamFactory = new CompressorStreamFactory();
    SortedMap<String, CompressorStreamProvider> result = compressorStreamFactory.getCompressorOutputStreamProviders();
    assertNotNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCompressorOutputStreamProviders2_xoSH1() {
    CompressorStreamFactory compressorStreamFactory = new CompressorStreamFactory(true);
    SortedMap<String, CompressorStreamProvider> result = compressorStreamFactory.getCompressorOutputStreamProviders();
    assertNotNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFindAvailableCompressorOutputStreamProviders_FGSB0() {
    SortedMap<String, CompressorStreamProvider> result = CompressorStreamFactory.findAvailableCompressorOutputStreamProviders();
    assertNotNull(result);
    assertNotEquals(0, result.size());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetZ_EruE0() {
    CompressorStreamFactory compressorStreamFactory = new CompressorStreamFactory();
    assertEquals("Z", CompressorStreamFactory.getZ());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLZ4Framed_YguC0() {
    String result = CompressorStreamFactory.getLZ4Framed();
    assertEquals("LZ4_FRAMED", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetDecompressConcatenated1_lckH0() {
    CompressorStreamFactory compressorStreamFactory = new CompressorStreamFactory();
    assertTrue(compressorStreamFactory.getDecompressConcatenated());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetDecompressUntilEOF2_dxxo1() {
    CompressorStreamFactory compressorStreamFactory = new CompressorStreamFactory();
    assertFalse(compressorStreamFactory.getDecompressUntilEOF());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetDeflate_wSPT0() {
    String result = CompressorStreamFactory.getDeflate();
    assertNotNull(result);
    assertEquals("DEFLATE", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFindAvailableCompressorInputStreamProviders_BkDA0() {
    SortedMap<String, CompressorStreamProvider> result = CompressorStreamFactory.findAvailableCompressorInputStreamProviders();
    assertNotNull(result);
    assertNotEquals(0, result.size());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCompressorInputStreamProviders1_vdAg0_fid1() {
    CompressorStreamFactory factory = new CompressorStreamFactory();
    Map<String, CompressorStreamProvider> providers = factory.getCompressorInputStreamProviders();
    assertNotNull(providers);
    assertEquals(9, providers.size());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCompressorOutputStreamProviders1_FDzv0_fid1() {
    CompressorStreamFactory compressorStreamFactory = new CompressorStreamFactory();
    Map<String, CompressorStreamProvider> result = compressorStreamFactory.getCompressorOutputStreamProviders();
    assertNotNull(result);
    assertEquals(compressorStreamFactory.getCompressorOutputStreamProviders().size(), result.size());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCompressorOutputStreamProviders2_xoSH1_fid1() {
    CompressorStreamFactory compressorStreamFactory = new CompressorStreamFactory(true);
    Map<String, CompressorStreamProvider> result = compressorStreamFactory.getCompressorOutputStreamProviders();
    assertNotNull(result);
    assertEquals(10, result.size());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFindAvailableCompressorOutputStreamProviders_FGSB0_1_fid2() {
    SortedMap<String, CompressorStreamProvider> result = CompressorStreamFactory.findAvailableCompressorOutputStreamProviders();
    assertNotNull(result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFindAvailableCompressorOutputStreamProviders_FGSB0_2_fid2() {
    SortedMap<String, CompressorStreamProvider> result = CompressorStreamFactory.findAvailableCompressorOutputStreamProviders();
    assertNotEquals(0, result.size());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetDeflate_wSPT0_2_fid2() {
    String result = CompressorStreamFactory.getDeflate();
    assertEquals("DEFLATE", result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFindAvailableCompressorInputStreamProviders_BkDA0_1() {
    SortedMap<String, CompressorStreamProvider> result = CompressorStreamFactory.findAvailableCompressorInputStreamProviders();
    assertNotNull(result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFindAvailableCompressorInputStreamProviders_BkDA0_2() {
    SortedMap<String, CompressorStreamProvider> result = CompressorStreamFactory.findAvailableCompressorInputStreamProviders();
    assertNotEquals(0, result.size());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateCompressorOutputStream_PrivateMethodToKey_ghCt13_LIYQ0_1() throws CompressorException {
    CompressorStreamFactory factory = new CompressorStreamFactory();
    java.io.OutputStream out = new java.io.ByteArrayOutputStream();
    String name = "GZIP";
    CompressorOutputStream compressorOutputStream = factory.createCompressorOutputStream(name, out);
    assertNotNull(compressorOutputStream);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateCompressorOutputStream_PrivateMethodToKey_ghCt13_LIYQ0_2() throws CompressorException {
    CompressorStreamFactory factory = new CompressorStreamFactory();
    java.io.OutputStream out = new java.io.ByteArrayOutputStream();
    String name = "GZIP";
    CompressorOutputStream compressorOutputStream = factory.createCompressorOutputStream(name, out);
    assertEquals(name, factory.detect(new java.io.ByteArrayInputStream(((java.io.ByteArrayOutputStream) out).toByteArray()), Collections.singleton(name)));}
}