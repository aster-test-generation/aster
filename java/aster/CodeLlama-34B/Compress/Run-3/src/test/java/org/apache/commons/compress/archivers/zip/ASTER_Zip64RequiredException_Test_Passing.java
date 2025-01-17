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
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.mockito.junit.jupiter.MockitoExtension;   
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_Zip64RequiredException_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetEntryTooBigMessage_GROD0() {
    ZipArchiveEntry ze = new ZipArchiveEntry("test.zip");
    ze.setSize(5000000000L);
    String message = Zip64RequiredException.getEntryTooBigMessage(ze);
    assertEquals("test.zip's size exceeds the limit of 4GByte.", message);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetEntryTooBigMessageWithSmallSize_QTOB2() {
        ZipArchiveEntry ze = new ZipArchiveEntry("test.zip");
        ze.setSize(1000000000L);
        String message = Zip64RequiredException.getEntryTooBigMessage(ze);
        assertEquals("test.zip's size is within the limit of 4GByte.", message);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetEntryTooBigMessageWithEqualSize_kMGe3() {
        ZipArchiveEntry ze = new ZipArchiveEntry("test.zip");
        ze.setSize(4000000000L);
        String message = Zip64RequiredException.getEntryTooBigMessage(ze);
        assertEquals("test.zip's size is equal to 4GByte.", message);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetEntryTooBigMessageWithLargeSize_DSNp4() {
        ZipArchiveEntry ze = new ZipArchiveEntry("test.zip");
        ze.setSize(8000000000L);
        String message = Zip64RequiredException.getEntryTooBigMessage(ze);
        assertEquals("test.zip's size exceeds the limit of 4GByte.", message);
    }
}