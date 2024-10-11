/**
 * Generated by Aster
 */
package org.apache.commons.codec.net;
import java.util.BitSet;
import static org.junit.jupiter.api.Assertions.*;
import java.util.BitSet;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_URLCodec_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncode_OFsj0() {
    URLCodec urlCodec = new URLCodec("UTF-8");
    byte[] bytes = "Hello World!".getBytes();
    byte[] result = URLCodec.encodeUrl(null, bytes);
    assertArrayEquals(new byte[]{(byte) 'H', (byte) 'e', (byte) 'l', (byte) 'l', (byte) 'o', (byte) '+', (byte) 'W', (byte) 'o', (byte) 'r', (byte) 'l', (byte) 'd', (byte) '!' }, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeUrlSpace_TrNk2() {
    BitSet urlsafe = new BitSet();
    urlsafe.set(' ');
    byte[] bytes = "Hello World".getBytes();
    byte[] result = URLCodec.encodeUrl(urlsafe, bytes);
    assertEquals(new String("Hello+World".getBytes()), new String(result));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetDefaultCharset_withoutCharset_mswW1_fid1() {
    URLCodec urlCodec = new URLCodec();
    assertNull(urlCodec.getDefaultCharset());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetEncoding_withoutCharset_KZyk1_fid1() {
    URLCodec urlCodec = new URLCodec();
    assertNull(urlCodec.getEncoding());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncode_OFsj0_fid1() {
    URLCodec urlCodec = new URLCodec("UTF-8");
    byte[] bytes = "Hello World!".getBytes();
    byte[] result = urlCodec.encode(bytes);
    assertArrayEquals(new byte[]{(byte) '%', (byte) 'H', (byte) 'e', (byte) 'l', (byte) 'l', (byte) 'o', (byte) '%', (byte) '2', (byte) '0', (byte) 'W', (byte) 'o', (byte) 'r', (byte) 'l', (byte) 'd', (byte) '!' }, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeByteArray_bLlq1_fid1() {
    URLCodec urlCodec = new URLCodec("UTF-8");
    byte[] bytes = "Hello World".getBytes();
    Object result = urlCodec.encode(bytes);
    assertEquals("Hello+World", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeUrlSpace_TrNk2_fid1() {
    BitSet urlsafe = new BitSet();
    urlsafe.set(' ');
    byte[] bytes = "Hello World".getBytes();
    byte[] result = URLCodec.encodeUrl(urlsafe, bytes);
    assertArrayEquals("Hello+World".getBytes(), result);
}
}