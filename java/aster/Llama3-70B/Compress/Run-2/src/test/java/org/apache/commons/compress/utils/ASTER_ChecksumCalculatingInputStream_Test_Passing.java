/**
 * Generated by Aster
 */
package org.apache.commons.compress.utils;
import java.util.zip.Checksum;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_ChecksumCalculatingInputStream_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue_ruhz0_Ousq0() {
    java.util.zip.Checksum checksum = new java.util.zip.Adler32();
    java.io.ByteArrayInputStream inputStream = new java.io.ByteArrayInputStream(new byte[0]);
    ChecksumCalculatingInputStream cis = new ChecksumCalculatingInputStream(checksum, inputStream);
    assertEquals(1, cis.getValue());
}
}