/**
 * Generated by Aster
 */
package org.apache.commons.compress.compressors.pack200;
import java.io.IOException;
import java.io.InputStream;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_InMemoryCachingStreamBridge_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateInputStreamWithData_bUaE1_zXGv0_2_fid2() throws IOException {
    InMemoryCachingStreamBridge bridge = new InMemoryCachingStreamBridge();
    byte[] data = new byte[10];
    for (int i = 0; i < data.length; i++) {
        data[i] = (byte) i;
    }
    InputStream inputStream = bridge.createInputStream();
    assertEquals(data.length, inputStream.available());}
}