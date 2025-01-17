/**
 * Generated by Aster
 */
package org.apache.commons.compress.compressors.deflate;
import java.io.IOException;
import java.io.InputStream;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_DeflateCompressorInputStream_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatchesSignatureLengthLessThan3_ccWh0() {
    byte[] signature = new byte[2];
    boolean result = DeflateCompressorInputStream.matches(signature, 2);
    assert !result;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatchesSignatureNotMatchingMagic1_rERs1() {
    byte[] signature = new byte[2];
    signature[0] = (byte) 0x01;
    boolean result = DeflateCompressorInputStream.matches(signature, 2);
    assert !result;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSkip_XFaH0_HXgI0() throws IOException {
    DeflateParameters parameters = new DeflateParameters();
    InputStream inputStream = new java.io.ByteArrayInputStream(new byte[10]);
    DeflateCompressorInputStream deflateCompressorInputStream = new DeflateCompressorInputStream(inputStream, parameters);
    long result = deflateCompressorInputStream.skip(5);
    assert result == 5;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatchesSignatureMatchingMagic1AndMagic2b_dEnM4_oOie0() {
    byte[] signature = new byte[2];
    signature[0] = (byte) 0x78;
    signature[1] = (byte) 0x01;
    boolean result = DeflateCompressorInputStream.matches(signature, 2);
    assert result;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatchesSignatureMatchingMagic1AndMagic2c_zOcR5_fjjN0() {
    byte[] signature = new byte[2];
    signature[0] = (byte) 0x78; // Assuming MAGIC_1 is 0x78
    signature[1] = (byte) 0x9c; // Assuming MAGIC_2c is 0x9c
    boolean result = DeflateCompressorInputStream.matches(signature, 2);
    assert result;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatchesSignatureMatchingMagic1AndMagic2d_rGXc6_sCjm0() {
    byte[] signature = new byte[2];
    signature[0] = (byte) 0x78; // Assuming MAGIC_1 is 0x78
    signature[1] = (byte) 0xDA; // Assuming MAGIC_2d is 0xDA
    boolean result = DeflateCompressorInputStream.matches(signature, 2);
    assert result;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCompressedCount_SqTK0_GSHR0() {
    DeflateParameters parameters = new DeflateParameters();
    InputStream inputStream = new java.io.ByteArrayInputStream(new byte[10]);
    DeflateCompressorInputStream compressorInputStream = new DeflateCompressorInputStream(inputStream, parameters);
    long compressedCount = compressorInputStream.getCompressedCount();
    assert compressedCount == 0;
}
}