/**
 * Generated by Aster
 */
package org.apache.commons.codec.binary;

import java.util.concurrent.TimeUnit;
import org.apache.commons.codec.CodecPolicy;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_Base16_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInAlphabet_sIex0_1() {
        Base16 base16 = new Base16();
        assertTrue(base16.isInAlphabet((byte) 0));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInAlphabet_sIex0_2() {
        Base16 base16 = new Base16();
        assertTrue(base16.isInAlphabet((byte) 9));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInAlphabet_sIex0_3() {
        Base16 base16 = new Base16();
        assertTrue(base16.isInAlphabet((byte) 15));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInAlphabetWithDecodingPolicy_mfty2_1() {
        Base16 base16 = new Base16(false, CodecPolicy.LENIENT);
        assertTrue(base16.isInAlphabet((byte) 'g'));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInAlphabet_sIex0() {
        Base16 base16 = new Base16();
        assertTrue(base16.isInAlphabet((byte) 0));
        assertTrue(base16.isInAlphabet((byte) 9));
        assertTrue(base16.isInAlphabet((byte) 15));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInAlphabetWithDecodingPolicy_mfty2() {
        Base16 base16 = new Base16(false, CodecPolicy.LENIENT);
        assertTrue(base16.isInAlphabet((byte) 'g'));
        assertTrue(base16.isInAlphabet((byte) '9'));
    }
}