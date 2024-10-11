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

public class Aster_Base32_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInAlphabet_ValidInput_YgEk0_QmZW0() {
        Base32 base32 = new Base32();
        byte validOctet = 'A'; // ASCII value for 'A' is 65
        assertTrue(base32.isInAlphabet(validOctet), "Octet should be in alphabet");
    }
}