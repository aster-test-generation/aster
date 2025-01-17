/**
 * Generated by Aster
 */
package org.apache.commons.codec.binary;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_Hex_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithString_zGGM0() throws EncoderException {
        Hex hex = new Hex();
        String input = "Hello World";
        String expectedOutput = "48656c6c6f20576f726c64";
        String actualOutput = (String) hex.encode(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithInvalidObject_hWkA3() throws org.apache.commons.codec.EncoderException {
        Hex hex = new Hex();
        Object object = new Object();
        try {
            hex.encode(object);
            fail("Expected EncoderException");
        } catch (EncoderException e) {
            assertEquals("Object is not a String, ByteBuffer, or byte[]", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithEmptyString_DcYx5() throws EncoderException {
        Hex hex = new Hex();
        String input = "";
        String expectedOutput = "";
        String actualOutput = (String) hex.encode(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeByteArray_GInZ1_1() throws org.apache.commons.codec.DecoderException {
        Hex hex = new Hex();
        byte[] input = new byte[]{0x68, 0x65, 0x6c, 0x6c, 0x6f, 0x20, 0x77, 0x6f, 0x72, 0x6c, 0x64};
        Object output = hex.decode(input);
        assertNotNull(output);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeByteArray_GInZ1_2() throws org.apache.commons.codec.DecoderException {
        Hex hex = new Hex();
        byte[] input = new byte[]{0x68, 0x65, 0x6c, 0x6c, 0x6f, 0x20, 0x77, 0x6f, 0x72, 0x6c, 0x64};
        Object output = hex.decode(input);
        assertTrue(output instanceof byte[]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeByteArray_GInZ1_3() throws org.apache.commons.codec.DecoderException {
        Hex hex = new Hex();
        byte[] input = new byte[]{0x68, 0x65, 0x6c, 0x6c, 0x6f, 0x20, 0x77, 0x6f, 0x72, 0x6c, 0x64};
        Object output = hex.decode(input);
        assertEquals("hello world", new String((byte[]) output));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeByteBuffer_HweZ2_1() throws org.apache.commons.codec.DecoderException {
        Hex hex = new Hex();
        ByteBuffer input = ByteBuffer.wrap(new byte[]{0x68, 0x65, 0x6c, 0x6c, 0x6f, 0x20, 0x77, 0x6f, 0x72, 0x6c, 0x64});
        Object output = hex.decode(input);
        assertNotNull(output);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeByteBuffer_HweZ2_2() throws org.apache.commons.codec.DecoderException {
        Hex hex = new Hex();
        ByteBuffer input = ByteBuffer.wrap(new byte[]{0x68, 0x65, 0x6c, 0x6c, 0x6f, 0x20, 0x77, 0x6f, 0x72, 0x6c, 0x64});
        Object output = hex.decode(input);
        assertTrue(output instanceof byte[]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeByteBuffer_HweZ2_3() throws org.apache.commons.codec.DecoderException {
        Hex hex = new Hex();
        ByteBuffer input = ByteBuffer.wrap(new byte[]{0x68, 0x65, 0x6c, 0x6c, 0x6f, 0x20, 0x77, 0x6f, 0x72, 0x6c, 0x64});
        Object output = hex.decode(input);
        assertEquals("hello world", new String((byte[]) output));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeCharArray_pigi3_1() throws org.apache.commons.codec.DecoderException {
        Hex hex = new Hex();
        char[] input = new char[]{'h', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd'};
        Object output = hex.decode(input);
        assertNotNull(output);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeCharArray_pigi3_2() throws org.apache.commons.codec.DecoderException {
        Hex hex = new Hex();
        char[] input = new char[]{'h', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd'};
        Object output = hex.decode(input);
        assertTrue(output instanceof byte[]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeCharArray_pigi3_3() throws org.apache.commons.codec.DecoderException {
        Hex hex = new Hex();
        char[] input = new char[]{'h', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd'};
        Object output = hex.decode(input);
        assertEquals("hello world", new String((byte[]) output));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeInvalidInput_rxzK4() throws org.apache.commons.codec.DecoderException {
        Hex hex = new Hex();
        Object input = new Object();
        try {
            hex.decode(input);
            fail("Expected DecoderException");
        } catch (DecoderException e) {
            assertEquals("Invalid input type: java.lang.Object", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeByteArray_GInZ1() throws org.apache.commons.codec.DecoderException {
        Hex hex = new Hex();
        byte[] input = new byte[]{0x68, 0x65, 0x6c, 0x6c, 0x6f, 0x20, 0x77, 0x6f, 0x72, 0x6c, 0x64};
        Object output = hex.decode(input);
        assertNotNull(output);
        assertTrue(output instanceof byte[]);
        assertEquals("hello world", new String((byte[]) output));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeByteBuffer_HweZ2() throws org.apache.commons.codec.DecoderException {
        Hex hex = new Hex();
        ByteBuffer input = ByteBuffer.wrap(new byte[]{0x68, 0x65, 0x6c, 0x6c, 0x6f, 0x20, 0x77, 0x6f, 0x72, 0x6c, 0x64});
        Object output = hex.decode(input);
        assertNotNull(output);
        assertTrue(output instanceof byte[]);
        assertEquals("hello world", new String((byte[]) output));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeCharArray_pigi3() throws org.apache.commons.codec.DecoderException {
        Hex hex = new Hex();
        char[] input = new char[]{'h', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd'};
        Object output = hex.decode(input);
        assertNotNull(output);
        assertTrue(output instanceof byte[]);
        assertEquals("hello world", new String((byte[]) output));
    }
}