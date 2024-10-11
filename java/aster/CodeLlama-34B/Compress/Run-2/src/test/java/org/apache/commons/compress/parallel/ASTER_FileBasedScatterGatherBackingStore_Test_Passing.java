/**
 * Generated by Aster
 */
package org.apache.commons.compress.parallel;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_FileBasedScatterGatherBackingStore_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetInputStream_InvalidFile_QurW3() throws IOException {
    FileBasedScatterGatherBackingStore store = new FileBasedScatterGatherBackingStore(new File("invalid.txt"));
    InputStream inputStream = store.getInputStream();
    assertNull(inputStream);
}
}