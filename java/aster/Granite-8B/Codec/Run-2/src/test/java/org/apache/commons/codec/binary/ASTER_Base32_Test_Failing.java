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

public class Aster_Base32_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLineSeparator_StrictPolicy_RFzh0() {
        Base32 base32 = new Base32(0, new byte[0], false, (byte) 0, CodecPolicy.STRICT);
        byte[] result = base32.getLineSeparator();
        assert result != null;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLineSeparator_LenientPolicy_ONTB1() {
        Base32 base32 = new Base32(0, new byte[0], false, (byte) 0, CodecPolicy.LENIENT);
        byte[] result = base32.getLineSeparator();
        assert result != null;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLineSeparator_UseHexTrue_pSud2() {
        Base32 base32 = new Base32(0, new byte[0], true);
        byte[] result = base32.getLineSeparator();
        assert result != null;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLineSeparator_UseHexFalse_KgCJ3() {
        Base32 base32 = new Base32(0, new byte[0], false);
        byte[] result = base32.getLineSeparator();
        assert result != null;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLineSeparator_PadValue1_BRnK6() {
        Base32 base32 = new Base32(0, new byte[0], false, (byte) 1, CodecPolicy.STRICT);
        byte[] result = base32.getLineSeparator();
        assert result != null;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLineSeparator_LineSeparatorNull_DHhi8() {
        Base32 base32 = new Base32(0, null, false, (byte) 0, CodecPolicy.STRICT);
        byte[] result = base32.getLineSeparator();
        assert result != null;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLineSeparator_LineSeparatorLength1_TVjF10() {
        Base32 base32 = new Base32(0, new byte[1], false, (byte) 0, CodecPolicy.STRICT);
        byte[] result = base32.getLineSeparator();
        assert result != null;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLineSeparator_LineSeparatorLength10_TGFI11() {
        Base32 base32 = new Base32(0, new byte[10], false, (byte) 0, CodecPolicy.STRICT);
        byte[] result = base32.getLineSeparator();
        assert result != null;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLineSeparator_LineSeparatorLength100_MjaZ12() {
        Base32 base32 = new Base32(0, new byte[100], false, (byte) 0, CodecPolicy.STRICT);
        byte[] result = base32.getLineSeparator();
        assert result != null;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLineSeparator_DefaultConstructor_yjnz13() {
        Base32 base32 = new Base32();
        byte[] result = base32.getLineSeparator();
        assert result != null;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInAlphabet_TQoD0_3_fid2() {
        Base32 base32 = new Base32();
        assertFalse(base32.isInAlphabet((byte) 'Z'));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInAlphabet_TQoD0_4_fid2() {
        Base32 base32 = new Base32();
        assertFalse(base32.isInAlphabet((byte) '3'));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInAlphabetWithLineLength_kNmP1_3_fid2() {
        Base32 base32 = new Base32(10);
        assertFalse(base32.isInAlphabet((byte) 'Z'));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInAlphabetWithLineLength_kNmP1_4_fid2() {
        Base32 base32 = new Base32(10);
        assertFalse(base32.isInAlphabet((byte) '3'));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInAlphabetWithLineSeparator_wzWh2_3_fid2() {
        Base32 base32 = new Base32(10, new byte[]{'\n'});
        assertFalse(base32.isInAlphabet((byte) 'Z'));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInAlphabetWithLineSeparator_wzWh2_4_fid2() {
        Base32 base32 = new Base32(10, new byte[]{'\n'});
        assertFalse(base32.isInAlphabet((byte) '3'));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInAlphabetWithUseHex_vOyq3_4_fid2() {
        Base32 base32 = new Base32(true);
        assertFalse(base32.isInAlphabet((byte) '3'));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInAlphabetWithPadding_rZnm4_4_fid2() {
        Base32 base32 = new Base32(true, (byte) '=');
        assertFalse(base32.isInAlphabet((byte) '3'));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInAlphabetWithAllParameters_nSWz6_4_fid2() {
        Base32 base32 = new Base32(10, new byte[]{'\n'}, true, (byte) '=', CodecPolicy.LENIENT);
        assertFalse(base32.isInAlphabet((byte) '3'));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInAlphabet_TQoD0() {
        Base32 base32 = new Base32();
        assertTrue(base32.isInAlphabet((byte) 'A'));
        assertTrue(base32.isInAlphabet((byte) '2'));
        assertFalse(base32.isInAlphabet((byte) 'Z'));
        assertFalse(base32.isInAlphabet((byte) '3'));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInAlphabetWithLineLength_kNmP1() {
        Base32 base32 = new Base32(10);
        assertTrue(base32.isInAlphabet((byte) 'A'));
        assertTrue(base32.isInAlphabet((byte) '2'));
        assertFalse(base32.isInAlphabet((byte) 'Z'));
        assertFalse(base32.isInAlphabet((byte) '3'));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInAlphabetWithLineSeparator_wzWh2() {
        Base32 base32 = new Base32(10, new byte[]{'\n'});
        assertTrue(base32.isInAlphabet((byte) 'A'));
        assertTrue(base32.isInAlphabet((byte) '2'));
        assertFalse(base32.isInAlphabet((byte) 'Z'));
        assertFalse(base32.isInAlphabet((byte) '3'));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInAlphabetWithUseHex_vOyq3() {
        Base32 base32 = new Base32(true);
        assertTrue(base32.isInAlphabet((byte) 'A'));
        assertTrue(base32.isInAlphabet((byte) '2'));
        assertFalse(base32.isInAlphabet((byte) 'Z'));
        assertFalse(base32.isInAlphabet((byte) '3'));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInAlphabetWithPadding_rZnm4() {
        Base32 base32 = new Base32(true, (byte) '=');
        assertTrue(base32.isInAlphabet((byte) 'A'));
        assertTrue(base32.isInAlphabet((byte) '2'));
        assertFalse(base32.isInAlphabet((byte) 'Z'));
        assertFalse(base32.isInAlphabet((byte) '3'));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInAlphabetWithAllParameters_nSWz6() {
        Base32 base32 = new Base32(10, new byte[]{'\n'}, true, (byte) '=', CodecPolicy.LENIENT);
        assertTrue(base32.isInAlphabet((byte) 'A'));
        assertTrue(base32.isInAlphabet((byte) '2'));
        assertFalse(base32.isInAlphabet((byte) 'Z'));
        assertFalse(base32.isInAlphabet((byte) '3'));
    }
}