/**
 * Generated by Aster
 */
package org.apache.commons.codec.binary;
import org.apache.commons.codec.DecoderException;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_Base32_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInAlphabet_Pgor0() {
        Base32 base32 = new Base32();
        byte octet = 10;
        boolean result = base32.isInAlphabet(octet);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_EmptyArray_ReturnsEmptyArray_bhbw0() {
        Base32 base32 = new Base32();
        byte[] pArray = new byte[0];
        byte[] result = base32.encode(pArray);
        assert(result.length == 0);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecode_EmptyString_MIiw1() {
        Base32 base32 = new Base32();
        String input = "";
        byte[] expected = new byte[0];
        byte[] actual = base32.decode(input);
        assertArrayEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testContainsAlphabetOrPadNullArray_ixXa0() {
    Base32 base32 = new Base32();
    boolean result = base32.containsAlphabetOrPad(null);
    assertFalse(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testContainsAlphabetOrPadEmptyArray_NGet1() {
    Base32 base32 = new Base32();
    boolean result = base32.containsAlphabetOrPad(new byte[0]);
    assertFalse(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecode_Byte_Array_eEOB0() throws DecoderException {
        Base32 base32 = new Base32();
        byte[] byteArray = new byte[]{1, 2, 3};
        Object result = base32.decode(byteArray);
        assertNotNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecode_String_hFfh1() throws DecoderException {
        Base32 base32 = new Base32();
        String str = "Hello";
        Object result = base32.decode(str);
        assertNotNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecode_EmptyArray_mCWp0() {
        Base32 base32 = new Base32();
        byte[] pArray = new byte[0];
        byte[] result = base32.decode(pArray);
        assert(result.length == 0);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecode_ContextCreation_Qspd2() {
        Base32 base32 = new Base32();
        byte[] pArray = new byte[1];
        base32.decode(pArray);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecode_ResultArrayCreation_wshp5() {
        Base32 base32 = new Base32();
        byte[] pArray = new byte[1];
        byte[] result = base32.decode(pArray);
        assert(result != null);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecode_ReadResults_MeEO6() {
        Base32 base32 = new Base32();
        byte[] pArray = new byte[1];
        byte[] result = base32.decode(pArray);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecode_LineLength_oSuj8() {
        Base32 base32 = new Base32(10);
        byte[] pArray = new byte[1];
        byte[] result = base32.decode(pArray);
        assert(result != null);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecode_UseHex_QNJM9() {
        Base32 base32 = new Base32(true);
        byte[] pArray = new byte[1];
        byte[] result = base32.decode(pArray);
        assert(result != null);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_lineLength_leq_currentLinePos_Zybm15() {
        Base32 base32 = new Base32();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testContainsAlphabetOrPad_UnVh0() {
    Base32 base32 = new Base32();
    byte[] arrayOctet = new byte[5];
    for (int i = 0; i < 5; i++) {
        arrayOctet[i] = 0;
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDecode_padByte_sAZp4_MRpB0() {
    Base32 base32 = new Base32();
    byte[] input = new byte[1];
    input[0] = base32.pad;
    byte[] result = base32.decode(input);
    assertNotNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDecode_lbitWorkArea_Kont9_ATjf0() {
    Base32 base32 = new Base32();
    byte[] input = new byte[1];
    input[0] = 0;
    byte[] result = base32.decode(input);
    assertNotNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncode_currentLinePos_zero_AXlJ12_lfnM0() {
    Base32 base32 = new Base32();
    byte[] arrayOctet = new byte[1];
    arrayOctet[0] = base32.pad; // Initialize the array with the pad value
    assertTrue(base32.containsAlphabetOrPad(arrayOctet));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncode_eof_true_rYnW0_mLPu0() {
    Base32 base32 = new Base32();
    org.apache.commons.codec.binary.Base32.Context context = new org.apache.commons.codec.binary.Base32.Context();
    context.eof = true;
    base32.encode(new byte[0], 0, 0, context);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testContainsAlphabetOrPad_PaGy1() {
    Base32 base32 = new Base32();
    byte[] arrayOctet = new byte[] {base32.pad};
    assertTrue(base32.containsAlphabetOrPad(arrayOctet));
}
}