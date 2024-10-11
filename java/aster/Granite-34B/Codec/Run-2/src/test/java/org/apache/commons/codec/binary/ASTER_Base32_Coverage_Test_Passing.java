/**
 * Generated by Aster
 */
package org.apache.commons.codec.binary;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_Base32_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithLeftovers3_yFkv5_gnCy0_1() {
        Base32 base32 = new Base32();
        byte[] input = new byte[0];
        int inPos = 0;
        int inAvail = 0;
        Base32.Context context = new Base32.Context();
        context.eof = false;
        context.modulus = 3;
        byte[] expected = new byte[0];
        byte[] actual = new byte[0];
        base32.encode(input, inPos, inAvail, context);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithLeftovers3_yFkv5_gnCy0_2() {
        Base32 base32 = new Base32();
        byte[] input = new byte[0];
        int inPos = 0;
        int inAvail = 0;
        Base32.Context context = new Base32.Context();
        context.eof = false;
        context.modulus = 3;
        byte[] expected = new byte[0];
        byte[] actual = new byte[0];
        base32.encode(input, inPos, inAvail, context);
        assertEquals(0, context.pos);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithLeftovers3_yFkv5_gnCy0_3() {
        Base32 base32 = new Base32();
        byte[] input = new byte[0];
        int inPos = 0;
        int inAvail = 0;
        Base32.Context context = new Base32.Context();
        context.eof = false;
        context.modulus = 3;
        byte[] expected = new byte[0];
        byte[] actual = new byte[0];
        base32.encode(input, inPos, inAvail, context);
        assertEquals(0, context.currentLinePos);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithLeftovers3_yFkv5_gnCy0_5() {
        Base32 base32 = new Base32();
        byte[] input = new byte[0];
        int inPos = 0;
        int inAvail = 0;
        Base32.Context context = new Base32.Context();
        context.eof = false;
        context.modulus = 3;
        byte[] expected = new byte[0];
        byte[] actual = new byte[0];
        base32.encode(input, inPos, inAvail, context);
        assertEquals(false, context.eof);
    }
}