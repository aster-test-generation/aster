/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.ar;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_ArArchiveInputStream_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNextArEntry_HJuK9() throws IOException {
        ArArchiveInputStream in = new ArArchiveInputStream(null);
        ArArchiveEntry entry = in.getNextArEntry();
        assertNull(entry);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNextArEntry_dfgD11() throws IOException {
        ArArchiveInputStream stream = new ArArchiveInputStream(null);
        ArArchiveEntry entry = stream.getNextArEntry();
        assertNotNull(entry);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextArEntry_aeIz9() throws IOException {
        ArArchiveInputStream in = new ArArchiveInputStream(null);
        ArArchiveEntry entry = in.getNextArEntry();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsInt_hXGL10_usVV0() throws IOException {
        ArArchiveInputStream stream = new ArArchiveInputStream(null);
        byte[] byteArray = new byte[10];
        int offset = 0;
        int len = 10;
        int asInt = stream.read(byteArray, offset, len);
        assertEquals(0, asInt);
    }
}