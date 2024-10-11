/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.zip;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_InflaterInputStreamWithStatistics_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testRead_NullInflater_Fhsk2() throws IOException {
    InflaterInputStreamWithStatistics stream = new InflaterInputStreamWithStatistics(null, null);
    int b = stream.read();
    assertEquals(0, b);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testRead_NullInflater_Fhsk2_fid1() throws IOException {
    InflaterInputStreamWithStatistics stream = new InflaterInputStreamWithStatistics(null, null);
    int b = stream.read();
    assertEquals(-1, b);
}
}