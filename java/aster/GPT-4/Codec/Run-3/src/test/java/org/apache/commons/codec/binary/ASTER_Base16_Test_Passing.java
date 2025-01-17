/**
 * Generated by Aster
 */
package org.apache.commons.codec.binary;

import java.util.concurrent.TimeUnit;
import org.apache.commons.codec.CodecPolicy;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_Base16_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInAlphabet_ValidOctet_HCZT0() throws Exception {
        Base16 base16 = new Base16(true, CodecPolicy.STRICT);
        assertTrue(base16.isInAlphabet((byte) 'A'));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInAlphabet_InvalidOctet_JlnU1() throws Exception {
        Base16 base16 = new Base16(false, CodecPolicy.LENIENT);
        assertFalse(base16.isInAlphabet((byte) 'G'));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInAlphabet_BoundaryOctet_KOZN2() throws Exception {
        Base16 base16 = new Base16(true);
        assertFalse(base16.isInAlphabet((byte) 0xFF));
    }
}