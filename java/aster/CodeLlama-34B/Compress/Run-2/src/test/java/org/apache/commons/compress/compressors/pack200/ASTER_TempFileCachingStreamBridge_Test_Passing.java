/**
 * Generated by Aster
 */
package org.apache.commons.compress.compressors.pack200;
import java.io.IOException;
import java.io.InputStream;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_TempFileCachingStreamBridge_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateInputStream_pnhQ0() throws IOException {
    TempFileCachingStreamBridge bridge = new TempFileCachingStreamBridge();
    InputStream inputStream = bridge.createInputStream();
    assertNotNull(inputStream);
}
}