/**
 * Generated by Aster
 */
package org.apache.commons.compress.parallel;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_FileBasedScatterGatherBackingStore_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetInputStream_withFile_Csbf0() throws IOException {
    FileBasedScatterGatherBackingStore store = new FileBasedScatterGatherBackingStore(new File("test.txt"));
    InputStream inputStream = store.getInputStream();
    assertNotNull(inputStream);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCloseForWriting_File_agmP0_aHOh0() throws IOException {
    FileBasedScatterGatherBackingStore store = new FileBasedScatterGatherBackingStore(new File("test"));
    File target = new File("test");
    store.close();
    assertFalse(target.exists());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testClose_withFile_Wycg0_qkIO0() throws IOException {
    File target = new File("target");
    FileBasedScatterGatherBackingStore backingStore = new FileBasedScatterGatherBackingStore(target);
    backingStore.close();
    assertFalse(Files.exists(target.toPath()));
}
}