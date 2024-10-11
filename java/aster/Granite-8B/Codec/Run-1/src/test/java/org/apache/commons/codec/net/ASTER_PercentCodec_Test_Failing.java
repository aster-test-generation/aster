/**
 * Generated by Aster
 */
package org.apache.commons.codec.net;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_PercentCodec_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithString_Abil1() throws DecoderException {
        PercentCodec percentCodec = new PercentCodec();
        String input = "Hello World";
        String expectedOutput = "Hello World";
        String actualOutput = (String) percentCodec.decode(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithAlwaysEncodeChars_xoFy5_peRW0() {
        PercentCodec percentCodec = new PercentCodec(new byte[]{32, 33}, false);
        byte[] bytes = new byte[]{32, 33};
        byte[] result = null;
        try {
            result = percentCodec.encode(bytes);
        } catch (EncoderException e) {
            e.printStackTrace();
        }
        assertEquals(new byte[]{37, 32, 37, 21}, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithEncodingRequired_WlcB3_PYfd0() {
        PercentCodec percentCodec = new PercentCodec();
        byte[] bytes = "Hello World!".getBytes();
        byte[] result = null;
        try {
            result = percentCodec.encode(bytes);
        } catch (EncoderException e) {
            e.printStackTrace();
        }
        assert !Arrays.equals(bytes, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithAlwaysEncodeChars_AvHY5_sESf0() {
        PercentCodec percentCodec = new PercentCodec(new byte[]{(byte) 0xFF}, false);
        byte[] bytes = {(byte) 0xFF};
        byte[] result = null;
        try {
            result = percentCodec.encode(bytes);
        } catch (EncoderException e) {
            e.printStackTrace();
        }
        assert Arrays.equals(result, "%FF".getBytes());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithAllEncodingRequired_UvAa6_QWGk0() {
        PercentCodec percentCodec = new PercentCodec(new byte[0], true);
        byte[] bytes = "Hello World!".getBytes();
        byte[] result = null;
        try {
            result = percentCodec.encode(bytes);
        } catch (EncoderException e) {
            e.printStackTrace();
        }
        assert Arrays.equals(result, "Hello%20World%21".getBytes());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithAllEncodingRequiredAndAlwaysEncodeChars_PJiO7_ydQb0() {
        PercentCodec percentCodec = new PercentCodec(new byte[]{(byte) 0xFF}, true);
        byte[] bytes = "Hello World!".getBytes();
        byte[] result;
        try {
            result = percentCodec.encode(bytes);
        } catch (EncoderException e) {
            throw new RuntimeException(e);
        }
        assert Arrays.equals(result, "Hello%20World%21".getBytes());
    }
}