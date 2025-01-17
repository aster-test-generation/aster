/**
 * Generated by Aster
 */
package org.apache.commons.compress.utils;
import java.io.InputStream;
import java.util.zip.Checksum;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.mock;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_ChecksumCalculatingInputStream_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueWithNullInputStream_eIhB2_pkCx0() {
        Checksum checksum = mock(Checksum.class);
        InputStream inputStream = null;
        ChecksumCalculatingInputStream checksumCalculatingInputStream = new ChecksumCalculatingInputStream(checksum, inputStream);
        long actual = checksumCalculatingInputStream.getValue();
        long expected = 0; // or appropriate default value
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueWithEmptyInputStream_zrRg3_QfPB0() {
        Checksum checksum = mock(Checksum.class);
        InputStream inputStream = mock(InputStream.class);
        ChecksumCalculatingInputStream checksumCalculatingInputStream = new ChecksumCalculatingInputStream(checksum, inputStream);
        long actual = checksumCalculatingInputStream.getValue();
        long expected = 0; // or appropriate default value
        assertEquals(expected, actual);
    }
}