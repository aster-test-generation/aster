/**
 * Generated by Aster
 */
package org.apache.commons.compress.compressors.pack200;
import java.io.IOException;
import java.util.Map;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_Pack200CompressorOutputStream_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testWrite_Jmxz0_kCCo0() throws IOException {
    java.io.ByteArrayOutputStream bos = new java.io.ByteArrayOutputStream();
    Pack200CompressorOutputStream compressor = new Pack200CompressorOutputStream(bos, Pack200Strategy.IN_MEMORY);
    byte[] data = new byte[] {1, 2, 3};
    compressor.write(data);
    assert Arrays.equals(data, bos.toByteArray());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testWriteTempFile_DDjB1_lvtd0() throws IOException {
    java.io.ByteArrayOutputStream bos = new java.io.ByteArrayOutputStream();
    Pack200CompressorOutputStream compressor = new Pack200CompressorOutputStream(bos, Pack200Strategy.TEMP_FILE);
    byte[] data = new byte[] {1, 2, 3};
    compressor.write(data);
    assert Arrays.equals(data, bos.toByteArray());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testWriteProps_MNus2_UiHE0() throws IOException {
    java.io.ByteArrayOutputStream bos = new java.io.ByteArrayOutputStream();
    Map<String, String> props = new HashMap<>();
    props.put("key", "value");
    Pack200CompressorOutputStream compressor = new Pack200CompressorOutputStream(bos, Pack200Strategy.IN_MEMORY, props);
    byte[] data = new byte[] {1, 2, 3};
    compressor.write(data);
    assert Arrays.equals(bos.toByteArray(), data);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testWriteDefault_OWeu3_eBAJ0() throws IOException {
    java.io.ByteArrayOutputStream bos = new java.io.ByteArrayOutputStream();
    Pack200CompressorOutputStream compressor = new Pack200CompressorOutputStream(bos);
    byte[] data = new byte[] {1, 2, 3};
    compressor.write(data);
    assert java.util.Arrays.equals(data, bos.toByteArray());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testWrite_RkuB0_uCwD0() throws IOException {
    java.io.ByteArrayOutputStream bos = new java.io.ByteArrayOutputStream();
    Pack200CompressorOutputStream compressor = new Pack200CompressorOutputStream(bos, Pack200Strategy.IN_MEMORY);
    byte[] b = new byte[] {1, 2, 3};
    compressor.write(b, 0, b.length);
    assert Arrays.equals(b, bos.toByteArray());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testWriteTempFile_PdNi1_dhdS0() throws IOException {
    java.io.ByteArrayOutputStream bos = new java.io.ByteArrayOutputStream();
    Pack200CompressorOutputStream compressor = new Pack200CompressorOutputStream(bos, Pack200Strategy.TEMP_FILE);
    byte[] b = new byte[] {1, 2, 3};
    compressor.write(b, 0, b.length);
    assert Arrays.equals(b, bos.toByteArray());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testWriteProps_uCGZ2_XtpZ0() throws IOException {
    java.io.ByteArrayOutputStream bos = new java.io.ByteArrayOutputStream();
    Map<String, String> props = new HashMap<>();
    props.put("key", "value");
    Pack200CompressorOutputStream compressor = new Pack200CompressorOutputStream(bos, Pack200Strategy.IN_MEMORY, props);
    byte[] b = new byte[] {1, 2, 3};
    compressor.write(b, 0, 3);
    assert Arrays.equals(b, bos.toByteArray());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testWriteNoStrategy_OBRA4_olLA0() throws IOException {
    java.io.ByteArrayOutputStream bos = new java.io.ByteArrayOutputStream();
    Pack200CompressorOutputStream compressor = new Pack200CompressorOutputStream(bos);
    byte[] b = new byte[] {1, 2, 3};
    compressor.write(b, 0, 3);
    assert Arrays.equals(b, bos.toByteArray());
}
}