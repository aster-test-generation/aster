/**
 * Generated by Aster
 */
package org.apache.commons.compress.compressors.pack200;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_InMemoryCachingStreamBridge_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateInputStream_Success_mpEW0() throws IOException {
    InMemoryCachingStreamBridge streamBridge = new InMemoryCachingStreamBridge();
    InputStream inputStream = streamBridge.createInputStream();
    assertNotNull(inputStream);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateInputStream_NullOutputStream_itCb1() throws IOException {
    InMemoryCachingStreamBridge streamBridge = new InMemoryCachingStreamBridge();
    InputStream inputStream = streamBridge.createInputStream();
    assertNull(inputStream);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateInputStream_EmptyOutputStream_sDGw2() throws IOException {
    InMemoryCachingStreamBridge streamBridge = new InMemoryCachingStreamBridge();
    InputStream inputStream = streamBridge.createInputStream();
    assertEquals(0, inputStream.available());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateInputStream_NonEmptyOutputStream_AqHL3_mwfS0() throws IOException {
    InMemoryCachingStreamBridge streamBridge = new InMemoryCachingStreamBridge();
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    outputStream.write("Hello, World!".getBytes());
    InputStream inputStream = streamBridge.createInputStream();
    assertEquals(13, inputStream.available());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateInputStream_IOException_gWJK4_aYDh0() throws IOException {
    InMemoryCachingStreamBridge streamBridge = new InMemoryCachingStreamBridge();
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    outputStream.write("Hello, World!".getBytes());
    outputStream.close();
    InputStream inputStream = streamBridge.createInputStream();
    assertNotNull(inputStream);
}
}