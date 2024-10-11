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

public class Aster_Base32_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLineSeparator_LineLength10_HBBc4() {
        Base32 base32 = new Base32(10, new byte[0], false, (byte) 0, CodecPolicy.STRICT);
        byte[] result = base32.getLineSeparator();
        assert result != null;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInAlphabet_TQoD0_1() {
        Base32 base32 = new Base32();
        assertTrue(base32.isInAlphabet((byte) 'A'));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInAlphabet_TQoD0_2() {
        Base32 base32 = new Base32();
        assertTrue(base32.isInAlphabet((byte) '2'));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInAlphabet_TQoD0_3() {
        Base32 base32 = new Base32();
        assertTrue(base32.isInAlphabet((byte) 'Z'));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInAlphabet_TQoD0_4() {
        Base32 base32 = new Base32();
        assertTrue(base32.isInAlphabet((byte) '3'));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInAlphabetWithLineLength_kNmP1_1() {
        Base32 base32 = new Base32(10);
        assertTrue(base32.isInAlphabet((byte) 'A'));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInAlphabetWithLineLength_kNmP1_2() {
        Base32 base32 = new Base32(10);
        assertTrue(base32.isInAlphabet((byte) '2'));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInAlphabetWithLineLength_kNmP1_3() {
        Base32 base32 = new Base32(10);
        assertTrue(base32.isInAlphabet((byte) 'Z'));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInAlphabetWithLineLength_kNmP1_4() {
        Base32 base32 = new Base32(10);
        assertTrue(base32.isInAlphabet((byte) '3'));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInAlphabetWithLineSeparator_wzWh2_1() {
        Base32 base32 = new Base32(10, new byte[]{'\n'});
        assertTrue(base32.isInAlphabet((byte) 'A'));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInAlphabetWithLineSeparator_wzWh2_2() {
        Base32 base32 = new Base32(10, new byte[]{'\n'});
        assertTrue(base32.isInAlphabet((byte) '2'));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInAlphabetWithLineSeparator_wzWh2_3() {
        Base32 base32 = new Base32(10, new byte[]{'\n'});
        assertTrue(base32.isInAlphabet((byte) 'Z'));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInAlphabetWithLineSeparator_wzWh2_4() {
        Base32 base32 = new Base32(10, new byte[]{'\n'});
        assertTrue(base32.isInAlphabet((byte) '3'));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInAlphabetWithUseHex_vOyq3_1() {
        Base32 base32 = new Base32(true);
        assertTrue(base32.isInAlphabet((byte) 'A'));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInAlphabetWithUseHex_vOyq3_2() {
        Base32 base32 = new Base32(true);
        assertTrue(base32.isInAlphabet((byte) '2'));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInAlphabetWithUseHex_vOyq3_3() {
        Base32 base32 = new Base32(true);
        assertFalse(base32.isInAlphabet((byte) 'Z'));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInAlphabetWithUseHex_vOyq3_4() {
        Base32 base32 = new Base32(true);
        assertTrue(base32.isInAlphabet((byte) '3'));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInAlphabetWithPadding_rZnm4_1() {
        Base32 base32 = new Base32(true, (byte) '=');
        assertTrue(base32.isInAlphabet((byte) 'A'));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInAlphabetWithPadding_rZnm4_2() {
        Base32 base32 = new Base32(true, (byte) '=');
        assertTrue(base32.isInAlphabet((byte) '2'));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInAlphabetWithPadding_rZnm4_3() {
        Base32 base32 = new Base32(true, (byte) '=');
        assertFalse(base32.isInAlphabet((byte) 'Z'));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInAlphabetWithPadding_rZnm4_4() {
        Base32 base32 = new Base32(true, (byte) '=');
        assertTrue(base32.isInAlphabet((byte) '3'));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInAlphabetWithAllParameters_nSWz6_1() {
        Base32 base32 = new Base32(10, new byte[]{'\n'}, true, (byte) '=', CodecPolicy.LENIENT);
        assertTrue(base32.isInAlphabet((byte) 'A'));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInAlphabetWithAllParameters_nSWz6_2() {
        Base32 base32 = new Base32(10, new byte[]{'\n'}, true, (byte) '=', CodecPolicy.LENIENT);
        assertTrue(base32.isInAlphabet((byte) '2'));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInAlphabetWithAllParameters_nSWz6_3() {
        Base32 base32 = new Base32(10, new byte[]{'\n'}, true, (byte) '=', CodecPolicy.LENIENT);
        assertFalse(base32.isInAlphabet((byte) 'Z'));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInAlphabetWithAllParameters_nSWz6_4() {
        Base32 base32 = new Base32(10, new byte[]{'\n'}, true, (byte) '=', CodecPolicy.LENIENT);
        assertTrue(base32.isInAlphabet((byte) '3'));
    }
}