/**
 * Generated by Aster
 */
package org.apache.commons.compress.compressors.xz;
import java.io.IOException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_XZCompressorOutputStream_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testWrite_ootO0_shuf0_fid2() throws IOException {
    java.io.ByteArrayOutputStream outputStream = new java.io.ByteArrayOutputStream();
    XZCompressorOutputStream xzCompressorOutputStream = new XZCompressorOutputStream(outputStream);
    xzCompressorOutputStream.write(1);
    xzCompressorOutputStream.close();
}
}