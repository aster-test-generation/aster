/**
 * Generated by Aster
 */
package org.apache.commons.compress.compressors.lzma;
import java.io.IOException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_LZMACompressorInputStream_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatchesSignatureNull_hXOh0() {
    byte[] signature = null;
    int length = 3;
    boolean result = LZMACompressorInputStream.matches(signature, length);
    assert !result;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatchesLengthLessThan3_WUHA1() {
    byte[] signature = new byte[3];
    signature[0] = 0x5d;
    signature[1] = 0;
    signature[2] = 0;
    int length = 2;
    boolean result = LZMACompressorInputStream.matches(signature, length);
    assert !result;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatchesSignatureInvalid_bQif2() {
    byte[] signature = new byte[3];
    signature[0] = 0x5e;
    signature[1] = 0;
    signature[2] = 0;
    int length = 3;
    boolean result = LZMACompressorInputStream.matches(signature, length);
    assert !result;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatchesSignatureValid_KLDr3() {
    byte[] signature = new byte[3];
    signature[0] = 0x5d;
    signature[1] = 0;
    signature[2] = 0;
    int length = 3;
    boolean result = LZMACompressorInputStream.matches(signature, length);
    assert result;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatchesLengthZero_Clkd4() {
    byte[] signature = new byte[3];
    signature[0] = 0x5d;
    signature[1] = 0;
    signature[2] = 0;
    int length = 0;
    boolean result = LZMACompressorInputStream.matches(signature, length);
    assert !result;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatchesSignatureEmpty_yZOl5() {
    byte[] signature = new byte[0];
    int length = 3;
    boolean result = LZMACompressorInputStream.matches(signature, length);
    assert !result;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAvailableWithoutMemoryLimit_UmkV1_AjIH0() throws IOException {
    java.io.ByteArrayInputStream inputStream = new java.io.ByteArrayInputStream(new byte[0]);
    LZMACompressorInputStream lzmaCompressorInputStream = new LZMACompressorInputStream(inputStream);
    int available = lzmaCompressorInputStream.available();
    assert available == inputStream.available();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSkip2_KvJz1_XlTz1() throws IOException {
    java.io.ByteArrayInputStream inputStream = new java.io.ByteArrayInputStream(new byte[0]);
    org.apache.commons.compress.compressors.lzma.LZMACompressorInputStream lzmaCompressorInputStream = new org.apache.commons.compress.compressors.lzma.LZMACompressorInputStream(inputStream);
    long skipped = lzmaCompressorInputStream.skip(10);
    assert skipped == 0;
}
}