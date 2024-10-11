/**
 * Generated by Aster
 */
package org.apache.commons.compress.parallel;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_FileBasedScatterGatherBackingStore_Test_Passing {
private OutputStream outputStream;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getInputStreamTest_nwWX0() throws IOException {
        File file = new File("test.txt");
        FileBasedScatterGatherBackingStore store = new FileBasedScatterGatherBackingStore(file);
        InputStream inputStream = store.getInputStream();
        assertEquals(Files.newInputStream(file.toPath()), inputStream);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testClose_ebMr0() throws IOException {
    FileBasedScatterGatherBackingStore fileBasedScatterGatherBackingStore = new FileBasedScatterGatherBackingStore(new File("target"));
    fileBasedScatterGatherBackingStore.close();
}
}