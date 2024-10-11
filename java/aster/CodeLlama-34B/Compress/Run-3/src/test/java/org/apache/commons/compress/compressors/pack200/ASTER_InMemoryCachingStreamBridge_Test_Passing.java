/**
 * Generated by Aster
 */
package org.apache.commons.compress.compressors.pack200;
import java.io.IOException;
import java.io.InputStream;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_InMemoryCachingStreamBridge_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateInputStream_MCkC0_1() throws IOException {
    InMemoryCachingStreamBridge streamBridge = new InMemoryCachingStreamBridge();
    InputStream inputStream = streamBridge.createInputStream();
    inputStream.close();
    assertNotNull(inputStream);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateInputStream_MCkC0_2() throws IOException {
    InMemoryCachingStreamBridge streamBridge = new InMemoryCachingStreamBridge();
    InputStream inputStream = streamBridge.createInputStream();
    inputStream.close();
    assertEquals(0, inputStream.available());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateInputStream_MCkC0() throws IOException {
    InMemoryCachingStreamBridge streamBridge = new InMemoryCachingStreamBridge();
    InputStream inputStream = streamBridge.createInputStream();
    assertNotNull(inputStream);
    assertEquals(0, inputStream.available());
    inputStream.close();
}
}