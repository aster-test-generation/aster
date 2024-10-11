/**
 * Generated by Aster
 */
package org.apache.commons.codec.binary;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.concurrent.TimeUnit;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_Hex_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeHex_OutArrayNotLargeEnough_aVnJ0_1() throws org.apache.commons.codec.DecoderException {
        char[] data = new char[]{'1', '2', '3', '4', '5', '6'};
        byte[] out = new byte[2];
        int outOffset = 0;
        DecoderException exception = assertThrows(DecoderException.class, () -> Hex.decodeHex(data, out, outOffset));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeHex_OutArrayNotLargeEnough2_zxVM1_1() throws org.apache.commons.codec.DecoderException {
        char[] data = new char[]{'1', '2', '3', '4', '5', '6'};
        byte[] out = new byte[1];
        int outOffset = 0;
        DecoderException exception = assertThrows(DecoderException.class, () -> Hex.decodeHex(data, out, outOffset));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeString_XIgL0_1() throws EncoderException {
        Hex hex = new Hex(Charset.forName("UTF-8"));
        String str = "Hello";
        Object obj = str;
        Object result = hex.encode(obj);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeByteBuffer_dwqx1_1() throws EncoderException {
        Hex hex = new Hex(Charset.forName("UTF-8"));
        ByteBuffer byteBuffer = ByteBuffer.wrap("Hello".getBytes(Charset.forName("UTF-8")));
        Object obj = byteBuffer;
        Object result = hex.encode(obj);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeByteArray_WcWH2_1() throws EncoderException {
        Hex hex = new Hex(Charset.forName("UTF-8"));
        byte[] byteArray = "Hello".getBytes(Charset.forName("UTF-8"));
        Object obj = byteArray;
        Object result = hex.encode(obj);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeByteBufferWithoutArray_irHe4_1() throws EncoderException {
        Hex hex = new Hex(Charset.forName("UTF-8"));
        ByteBuffer byteBuffer = ByteBuffer.allocate(10);
        byteBuffer.put("Hello".getBytes(Charset.forName("UTF-8")));
        Object obj = byteBuffer;
        Object result = hex.encode(obj);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeInvalidObject_EOmg5() throws org.apache.commons.codec.EncoderException {
        Hex hex = new Hex(Charset.forName("UTF-8"));
        Object obj = new Object();
        assertThrows(EncoderException.class, () -> hex.encode(obj));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeHex_EmptyData_DZuT3() {
        byte[] data = new byte[0];
        char[] expected = new char[0];
        char[] result = Hex.encodeHex(data, 0, data.length, true);
        assertArrayEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeByteArray_EnsS1_UDyq1() throws org.apache.commons.codec.DecoderException {
        byte[] bytes = "Hello".getBytes();
        char[] hexChars = Hex.encodeHex(ByteBuffer.wrap(bytes), "0123456789abcdef".toCharArray());
        assertEquals("48656c6c6f", new String(hexChars));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeHex_OutArrayNotLargeEnough_aVnJ0() throws org.apache.commons.codec.DecoderException {
        char[] data = new char[]{'1', '2', '3', '4', '5', '6'};
        byte[] out = new byte[2];
        int outOffset = 0;
        DecoderException exception = assertThrows(DecoderException.class, () -> Hex.decodeHex(data, out, outOffset));
        assertEquals("Output array is not large enough to accommodate decoded data.", exception.getMessage());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeHex_OutArrayNotLargeEnough2_zxVM1() throws org.apache.commons.codec.DecoderException {
        char[] data = new char[]{'1', '2', '3', '4', '5', '6'};
        byte[] out = new byte[1];
        int outOffset = 0;
        DecoderException exception = assertThrows(DecoderException.class, () -> Hex.decodeHex(data, out, outOffset));
        assertEquals("Output array is not large enough to accommodate decoded data.", exception.getMessage());
    }
}