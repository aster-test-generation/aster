/**
 * Generated by Aster
 */
package org.apache.commons.compress.compressors.snappy;
import java.io.IOException;
import java.io.OutputStream;
import org.apache.commons.compress.compressors.lz77support.Parameters;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_SnappyCompressorOutputStream_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateParameterBuilder_Ccyx0() {
    Parameters.Builder builder = SnappyCompressorOutputStream.createParameterBuilder(1024);
    Parameters params = builder.build();
    assertEquals(3, params.getMinBackReferenceLength());
    assertEquals(65535, params.getMaxBackReferenceLength());
    assertEquals(1024, params.getMaxOffset());
    assertEquals(1024, params.getMaxLiteralLength());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateParameterBuilder_Ccyx0_1_fid3() {
    Parameters.Builder builder = SnappyCompressorOutputStream.createParameterBuilder(1024);
    Parameters params = builder.build();
    assertEquals(3, params.getMinBackReferenceLength());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateParameterBuilder_Ccyx0_2() {
    Parameters.Builder builder = SnappyCompressorOutputStream.createParameterBuilder(1024);
    Parameters params = builder.build();
    assertEquals(65535, params.getMaxBackReferenceLength());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateParameterBuilder_Ccyx0_3() {
    Parameters.Builder builder = SnappyCompressorOutputStream.createParameterBuilder(1024);
    Parameters params = builder.build();
    assertEquals(1024, params.getMaxOffset());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testWrite_GodY0_uEwm0() throws IOException {
    java.io.ByteArrayOutputStream os = new java.io.ByteArrayOutputStream();
    SnappyCompressorOutputStream scos = new SnappyCompressorOutputStream(os, 1024);
    byte[] data = new byte[10];
    scos.write(data, 0, 5);
    scos.close(); // close the SnappyCompressorOutputStream
    assertEquals(5, os.size());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testClose_KidN0_KzAf0() throws IOException {
    java.io.OutputStream os = new java.io.ByteArrayOutputStream();
    SnappyCompressorOutputStream snappyCompressorOutputStream = new SnappyCompressorOutputStream(os, 10);
    snappyCompressorOutputStream.close();
    assertTrue(((java.io.ByteArrayOutputStream) os).toString().isEmpty());
}
}