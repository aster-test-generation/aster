/**
 * Generated by Aster
 */
package org.apache.commons.compress.compressors.pack200;
import java.io.IOException;
import java.io.OutputStream;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_Pack200CompressorOutputStream_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testWrite_cknu0_nFvY0() throws IOException {
    java.io.OutputStream out = new java.io.ByteArrayOutputStream();
    Pack200CompressorOutputStream compressor = new Pack200CompressorOutputStream(out, Pack200Strategy.IN_MEMORY);
    compressor.write(1);
    assertEquals(1, ((java.io.ByteArrayOutputStream) out).toByteArray()[0]);
}
}