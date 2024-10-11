/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.zip;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_Zip64RequiredException_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetEntryTooBigMessage_sizeNotExceedingLimit_yKMI2_fid1() {
        ZipArchiveEntry ze = new ZipArchiveEntry("test.txt");
        ze.setSize(3000000000L);
        String expectedMessage = null;
        String actualMessage = Zip64RequiredException.getEntryTooBigMessage(ze);
        assertEquals(expectedMessage, actualMessage);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetEntryTooBigMessage_emptyName_plZE4_fid1() {
        ZipArchiveEntry ze = new ZipArchiveEntry("");
        ze.setSize(5000000000L);
        String expectedMessage = null;
        String actualMessage = Zip64RequiredException.getEntryTooBigMessage(ze);
        assertEquals(expectedMessage, actualMessage);
    }
}