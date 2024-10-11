/**
 * Generated by Aster
 */
package org.apache.commons.compress.compressors.pack200;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_TempFileCachingStreamBridge_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateInputStream_sKXY0_xRVM1() throws IOException {
    TempFileCachingStreamBridge bridge = new TempFileCachingStreamBridge();
    Path path = Files.createTempFile("test", "file");
    InputStream inputStream = bridge.createInputStream();
    assertEquals(inputStream, bridge.createInputStream());
    Files.delete(path);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCloseInputStream_CoTM1_PePn0() throws IOException {
    TempFileCachingStreamBridge bridge = new TempFileCachingStreamBridge();
    Path path = Files.createTempFile("test", "txt");
    InputStream inputStream = bridge.createInputStream();
    inputStream.close();
}
}