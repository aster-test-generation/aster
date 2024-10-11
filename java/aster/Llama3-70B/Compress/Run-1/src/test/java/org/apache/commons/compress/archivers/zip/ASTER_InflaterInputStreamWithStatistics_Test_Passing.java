/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.zip;
import java.util.zip.InflaterInputStream;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_InflaterInputStreamWithStatistics_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetUncompressedCount_HyPC0_UkEU0() {
    InflaterInputStreamWithStatistics inflaterInputStreamWithStatistics = new InflaterInputStreamWithStatistics(new java.util.zip.InflaterInputStream(new java.io.ByteArrayInputStream(new byte[0])));
    long uncompressedCount = inflaterInputStreamWithStatistics.getCompressedCount();
    assertEquals(0, uncompressedCount);
}
}