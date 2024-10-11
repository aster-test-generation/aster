/**
 * Generated by Aster
 */
package org.apache.commons.codec.net;

import java.util.concurrent.TimeUnit;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_PercentCodec_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeNonByteArray_Ccun2() throws DecoderException {
        PercentCodec codec = new PercentCodec();
        String str = "test";
        assertEquals(str, codec.decode(str));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithSpace_lVao0() throws EncoderException {
        PercentCodec codec = new PercentCodec();
        byte[] bytes = new byte[]{'a', 'b', ' ', 'c'};
        byte[] expected = new byte[]{'a', 'b', '+', 'c'};
        byte[] actual = codec.encode(bytes);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_NonAsciiChar_pNzX0() throws EncoderException {
        PercentCodec percentCodec = new PercentCodec();
        byte[] bytes = new byte[]{(byte) 0x80};
        byte[] expected = new byte[]{(byte) 0x25, (byte) 0x80};
        assertArrayEquals(expected, percentCodec.encode(bytes));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_AlwaysEncodeChars_AHPM1() throws EncoderException {
        PercentCodec percentCodec = new PercentCodec(new byte[]{(byte) 0x80}, true);
        byte[] bytes = new byte[]{(byte) 0x80};
        byte[] expected = new byte[]{(byte) 0x25, (byte) 0x80};
        assertArrayEquals(expected, percentCodec.encode(bytes));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_PlusForSpace_TJMJ2() throws EncoderException {
        PercentCodec percentCodec = new PercentCodec(new byte[]{(byte) 0x20}, true);
        byte[] bytes = new byte[]{(byte) 0x20};
        byte[] expected = new byte[]{(byte) 0x2B};
        assertArrayEquals(expected, percentCodec.encode(bytes));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_NonAsciiChar_ZOtm0() throws EncoderException {
        PercentCodec percentCodec = new PercentCodec();
        byte[] bytes = new byte[]{(byte) 0x80, (byte) 0xFF};
        byte[] expected = new byte[]{(byte) 0x25, (byte) 0x80, (byte) 0x25, (byte) 0xFF};
        byte[] actual = percentCodec.encode(bytes);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_AlwaysEncodeChars_Fwsh1() throws EncoderException {
        PercentCodec percentCodec = new PercentCodec(new byte[]{(byte) 0x80, (byte) 0xFF}, true);
        byte[] bytes = new byte[]{(byte) 0x80, (byte) 0xFF};
        byte[] expected = new byte[]{(byte) 0x25, (byte) 0x80, (byte) 0x25, (byte) 0xFF};
        byte[] actual = percentCodec.encode(bytes);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_PlusForSpace_umEq2() throws EncoderException {
        PercentCodec percentCodec = new PercentCodec(new byte[]{(byte) 0x20}, true);
        byte[] bytes = new byte[]{(byte) 0x20};
        byte[] expected = new byte[]{(byte) 0x2B};
        byte[] actual = percentCodec.encode(bytes);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithEscapedChars_UeHC0() throws org.apache.commons.codec.DecoderException {
        PercentCodec codec = new PercentCodec();
        byte[] bytes = new byte[]{0x25, 0x45, 0x53, 0x43, 0x41, 0x50, 0x45, 0x25};
        byte[] expected = new byte[]{0x25, 0x45, 0x53, 0x43, 0x41, 0x50, 0x45};
        byte[] actual = codec.decode(bytes);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithPlusForSpace_KMbD1() throws org.apache.commons.codec.DecoderException {
        PercentCodec codec = new PercentCodec();
        byte[] bytes = new byte[]{0x2B, 0x20, 0x2B, 0x20, 0x2B, 0x20};
        byte[] expected = new byte[]{0x20, 0x20, 0x20};
        byte[] actual = codec.decode(bytes);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithMixedChars_NRBA2() throws org.apache.commons.codec.DecoderException {
        PercentCodec codec = new PercentCodec();
        byte[] bytes = new byte[]{0x25, 0x45, 0x53, 0x43, 0x41, 0x50, 0x45, 0x2B, 0x20, 0x2B, 0x20, 0x2B, 0x20};
        byte[] expected = new byte[]{0x25, 0x45, 0x53, 0x43, 0x41, 0x50, 0x45, 0x20, 0x20, 0x20};
        byte[] actual = codec.decode(bytes);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithNonAsciiChars_rGnm1() throws EncoderException {
        PercentCodec percentCodec = new PercentCodec();
        byte[] bytes = new byte[]{-128, -127, -126, -125, -124, -123, -122, -121, -120, -119, -118, -117, -116, -115, -114, -113, -112, -111, -110, -109, -108, -107, -106, -105, -104, -103, -102, -101, -100, -99, -98, -97, -96, -95, -94, -93, -92, -91, -90};
        byte[] expected = new byte[]{-128, -127, -126, -125, -124, -123, -122, -121, -120, -119, -118, -117, -116, -115, -114, -113, -112, -111, -110, -109, -108, -107, -106, -105, -104, -103, -102, -101, -100, -99, -98, -97, -96, -95, -94, -93, -92, -91, -90};
        byte[] actual = percentCodec.encode(bytes);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithSpace_ywpV2() throws EncoderException {
        PercentCodec percentCodec = new PercentCodec();
        byte[] bytes = new byte[]{32};
        byte[] expected = new byte[]{37, 50, 48, 48};
        byte[] actual = percentCodec.encode(bytes);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithAlwaysEncodeChars_prRi0() throws org.apache.commons.codec.EncoderException {
        byte[] bytes = new byte[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        byte[] expectedEncoding = new byte[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        PercentCodec percentCodec = new PercentCodec(new byte[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, true);
        byte[] actualEncoding = percentCodec.encode(bytes);
        assertEquals(expectedEncoding, actualEncoding);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithoutAlwaysEncodeChars_odxc1() throws org.apache.commons.codec.EncoderException {
        byte[] bytes = new byte[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        byte[] expectedEncoding = new byte[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        PercentCodec percentCodec = new PercentCodec();
        byte[] actualEncoding = percentCodec.encode(bytes);
        assertEquals(expectedEncoding, actualEncoding);
    }
}