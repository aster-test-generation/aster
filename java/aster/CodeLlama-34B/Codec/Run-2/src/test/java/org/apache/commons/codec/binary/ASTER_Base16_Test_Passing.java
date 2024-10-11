/**
 * Generated by Aster
 */
package org.apache.commons.codec.binary;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_Base16_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInAlphabet_InvalidOctet_ZAlb2() {
        Base16 base16 = new Base16(true);
        byte octet = (byte) 0xff;
        assertFalse(base16.isInAlphabet(octet));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInAlphabet_LowerCase_ValidOctet_vadn0_fid2() {
        Base16 base16 = new Base16(true);
        byte octet = 0x00;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInAlphabet_UpperCase_ValidOctet_QJVd1_fid2() {
        Base16 base16 = new Base16(false);
        byte octet = 0x00;
        assertFalse(base16.isInAlphabet(octet));
    }
}