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

public class Aster_Hex_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecode_qecq0() throws DecoderException {
        Hex hex = new Hex(Charset.forName("UTF-8"));
        byte[] array = new byte[]{(byte) 0x12, (byte) 0x34};
        byte[] result = hex.decode(array);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeString_XIgL0_2() throws EncoderException {
        Hex hex = new Hex(Charset.forName("UTF-8"));
        String str = "Hello";
        Object obj = str;
        Object result = hex.encode(obj);
        assertEquals("Hello".getBytes(Charset.forName("UTF-8")), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeByteBuffer_dwqx1_2() throws EncoderException {
        Hex hex = new Hex(Charset.forName("UTF-8"));
        ByteBuffer byteBuffer = ByteBuffer.wrap("Hello".getBytes(Charset.forName("UTF-8")));
        Object obj = byteBuffer;
        Object result = hex.encode(obj);
        assertEquals("Hello".getBytes(Charset.forName("UTF-8")), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeByteArray_WcWH2_2() throws EncoderException {
        Hex hex = new Hex(Charset.forName("UTF-8"));
        byte[] byteArray = "Hello".getBytes(Charset.forName("UTF-8"));
        Object obj = byteArray;
        Object result = hex.encode(obj);
        assertEquals(byteArray, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeByteBufferWithoutArray_irHe4_2() throws EncoderException {
        Hex hex = new Hex(Charset.forName("UTF-8"));
        ByteBuffer byteBuffer = ByteBuffer.allocate(10);
        byteBuffer.put("Hello".getBytes(Charset.forName("UTF-8")));
        Object obj = byteBuffer;
        Object result = hex.encode(obj);
        assertEquals("Hello".getBytes(Charset.forName("UTF-8")), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeHex_LowerCase_pUpH0() {
        byte[] data = new byte[]{1, 2, 3};
        char[] expected = new char[]{'1', '2', '3'};
        char[] result = Hex.encodeHex(data, 0, data.length, true);
        assertArrayEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeHex_Offset_HfWE4() {
        byte[] data = new byte[]{1, 2, 3};
        char[] expected = new char[]{'1', '2', '3'};
        char[] result = Hex.encodeHex(data, 1, data.length - 1, true);
        assertArrayEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeHex_OffsetAndLength_wSpe5() {
        byte[] data = new byte[]{1, 2, 3, 4, 5};
        char[] expected = new char[]{'2', '3', '4', '5'};
        char[] result = Hex.encodeHex(data, 1, 4, true);
        assertArrayEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeHex_OffsetAndLength_OffsetOutOfRange_CDwS9() {
        byte[] data = new byte[]{1, 2, 3, 4, 5};
        char[] expected = new char[]{'1', '2', '3', '4', '5'};
        char[] result = Hex.encodeHex(data, 5, 0, true);
        assertArrayEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeHex_OffsetAndLength_LengthOutOfRange_Xivz10() {
        byte[] data = new byte[]{1, 2, 3, 4, 5};
        char[] expected = new char[]{'1', '2', '3', '4', '5'};
        char[] result = Hex.encodeHex(data, 1, 6, true);
        assertArrayEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeHex_OffsetAndLength_OffsetAndLengthOutOfRange_IScA11() {
        byte[] data = new byte[]{1, 2, 3, 4, 5};
        char[] expected = new char[]{'1', '2', '3', '4', '5'};
        char[] result = Hex.encodeHex(data, 5, 6, true);
        assertArrayEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeString_cRmt0_WGIN0() throws org.apache.commons.codec.DecoderException {
        Hex hex = new Hex();
        assertEquals("48656c6c6f", hex.encodeHex("Hello".getBytes()));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeString_XIgL0() throws EncoderException {
        Hex hex = new Hex(Charset.forName("UTF-8"));
        String str = "Hello";
        Object obj = str;
        Object result = hex.encode(obj);
        assertNotNull(result);
        assertEquals("Hello".getBytes(Charset.forName("UTF-8")), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeByteBuffer_dwqx1() throws EncoderException {
        Hex hex = new Hex(Charset.forName("UTF-8"));
        ByteBuffer byteBuffer = ByteBuffer.wrap("Hello".getBytes(Charset.forName("UTF-8")));
        Object obj = byteBuffer;
        Object result = hex.encode(obj);
        assertNotNull(result);
        assertEquals("Hello".getBytes(Charset.forName("UTF-8")), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeByteArray_WcWH2() throws EncoderException {
        Hex hex = new Hex(Charset.forName("UTF-8"));
        byte[] byteArray = "Hello".getBytes(Charset.forName("UTF-8"));
        Object obj = byteArray;
        Object result = hex.encode(obj);
        assertNotNull(result);
        assertEquals(byteArray, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeByteBufferWithoutArray_irHe4() throws EncoderException {
        Hex hex = new Hex(Charset.forName("UTF-8"));
        ByteBuffer byteBuffer = ByteBuffer.allocate(10);
        byteBuffer.put("Hello".getBytes(Charset.forName("UTF-8")));
        Object obj = byteBuffer;
        Object result = hex.encode(obj);
        assertNotNull(result);
        assertEquals("Hello".getBytes(Charset.forName("UTF-8")), result);
    }
}