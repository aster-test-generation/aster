/**
 * Generated by Aster
 */
package org.apache.commons.compress.compressors.pack200;
import java.io.IOException;
import java.io.InputStream;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_TempFileCachingStreamBridge_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateInputStreamWithNullPath_cMgx1_SGiK0() throws IOException {
    TempFileCachingStreamBridge bridge = new TempFileCachingStreamBridge();
    InputStream inputStream = bridge.createInputStream();
    assertNull(inputStream);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateInputStreamWithFileAndClose_EPpl7_bvNN0_2() throws IOException {
    TempFileCachingStreamBridge bridge = new TempFileCachingStreamBridge();
    InputStream inputStream = bridge.createInputStream();
    inputStream.close();
    assertNull(inputStream);}
}