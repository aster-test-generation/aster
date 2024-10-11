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

public class Aster_Base32_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInAlphabet_cNKS0() {
        Base32 base32 = new Base32();
        byte octet = 10; // a valid octet value
        boolean result = base32.isInAlphabet(octet);
        assert result;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecode_padByte_nJpx4_jQzO0() {
        Base32 base32 = new Base32();
        org.apache.commons.codec.binary.Base32.Context context = new org.apache.commons.codec.binary.Base32.Context();
        byte[] input = new byte[1];
        input[0] = base32.pad;
        base32.encode(input, 0, 1, context);
        assertTrue(context.eof);
    }
}