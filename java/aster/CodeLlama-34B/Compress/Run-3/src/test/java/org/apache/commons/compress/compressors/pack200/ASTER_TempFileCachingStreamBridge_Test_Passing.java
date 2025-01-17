/**
 * Generated by Aster
 */
package org.apache.commons.compress.compressors.pack200;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_TempFileCachingStreamBridge_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateInputStream_luRl0_1() throws IOException {
    TempFileCachingStreamBridge tempFileCachingStreamBridge = new TempFileCachingStreamBridge();
    InputStream inputStream = tempFileCachingStreamBridge.createInputStream();
    inputStream.close();
    assertNotNull(inputStream);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateInputStream_luRl0_2() throws IOException {
    TempFileCachingStreamBridge tempFileCachingStreamBridge = new TempFileCachingStreamBridge();
    InputStream inputStream = tempFileCachingStreamBridge.createInputStream();
    inputStream.close();
    assertTrue(inputStream instanceof FilterInputStream);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateInputStream_luRl0_3() throws IOException {
    TempFileCachingStreamBridge tempFileCachingStreamBridge = new TempFileCachingStreamBridge();
    InputStream inputStream = tempFileCachingStreamBridge.createInputStream();
    inputStream.close();
    assertTrue(inputStream.markSupported());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateInputStream_luRl0_4() throws IOException {
    TempFileCachingStreamBridge tempFileCachingStreamBridge = new TempFileCachingStreamBridge();
    InputStream inputStream = tempFileCachingStreamBridge.createInputStream();
    inputStream.close();
    assertEquals(0, inputStream.available());}
}