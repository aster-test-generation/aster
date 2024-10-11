/**
 * Generated by Aster
 */
package org.apache.commons.codec.binary;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_Base16_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInAlphabet_LowerCase_ValidOctet_vadn0() {
        Base16 base16 = new Base16(true);
        byte octet = 0x00;
        assertTrue(base16.isInAlphabet(octet));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInAlphabet_UpperCase_ValidOctet_QJVd1() {
        Base16 base16 = new Base16(false);
        byte octet = 0x00;
        assertTrue(base16.isInAlphabet(octet));
    }
}