package org.apache.commons.codec.binary;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.concurrent.TimeUnit;
import org.apache.commons.codec.CodecPolicy;
import org.apache.commons.codec.DecoderException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_Base16_Test_Passing {

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInAlphabetStrict_vHVn0() {
        Base16 base16 = new Base16(false, CodecPolicy.STRICT);
        assertTrue(base16.isInAlphabet((byte) 0x61)); // 'a'
        assertFalse(base16.isInAlphabet((byte) 0x7f));
        assertFalse(base16.isInAlphabet((byte) 0x80));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInAlphabetLenient_xtOi1() {
        Base16 base16 = new Base16(false, CodecPolicy.LENIENT);
        assertTrue(base16.isInAlphabet((byte) 0x61)); // 'a'
        assertTrue(base16.isInAlphabet((byte) 0x7f));
        assertFalse(base16.isInAlphabet((byte) 0x80));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInAlphabetLowerCase_HUFV2() {
        Base16 base16 = new Base16(true);
        assertTrue(base16.isInAlphabet((byte) 0x61)); // 'a'
        assertFalse(base16.isInAlphabet((byte) 0x7f));
        assertFalse(base16.isInAlphabet((byte) 0x80));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeAsString_wWQT0() {
        Base16 base16 = new Base16(true, CodecPolicy.STRICT);
        String result = base16.encodeAsString(new byte[]{1, 2, 3});
        assertEquals("010203", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInAlphabet_nGoT0() {
        Base16 base16 = new Base16(true, CodecPolicy.STRICT);
        boolean result = base16.isInAlphabet("HelloWorld");
        assert result == true;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInAlphabet2_DVks1() {
        Base16 base16 = new Base16(true, CodecPolicy.LENIENT);
        boolean result = base16.isInAlphabet("HelloWorld");
        assert result == true;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInAlphabet3_ANjQ2() {
        Base16 base16 = new Base16(false, CodecPolicy.STRICT);
        boolean result = base16.isInAlphabet("HelloWorld");
        assert result == true;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInAlphabet4_mKwn3() {
        Base16 base16 = new Base16(false, CodecPolicy.LENIENT);
        boolean result = base16.isInAlphabet("HelloWorld");
        assert result == true;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInAlphabet5_Xavx4() {
        Base16 base16 = new Base16(true, CodecPolicy.STRICT);
        boolean result = base16.isInAlphabet("HelloWorld123");
        assert result == false;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInAlphabet6_UkXG5() {
        Base16 base16 = new Base16(true, CodecPolicy.LENIENT);
        boolean result = base16.isInAlphabet("HelloWorld123");
        assert result == true;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInAlphabet7_PwUW6() {
        Base16 base16 = new Base16(false, CodecPolicy.STRICT);
        boolean result = base16.isInAlphabet("HelloWorld123");
        assert result == false;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInAlphabet8_Dbte7() {
        Base16 base16 = new Base16(false, CodecPolicy.LENIENT);
        boolean result = base16.isInAlphabet("HelloWorld123");
        assert result == true;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToLengthNullArray_KGox0() {
        assertEquals(0, Base16.toLength(null));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToLengthNonNullArray_PecC1() {
        byte[] array = new byte[]{1, 2, 3};
        assertEquals(3, Base16.toLength(array));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetEncodedLength_KTGw0() {
        Base16 base16 = new Base16(true, CodecPolicy.STRICT);
        long result = base16.getEncodedLength(new byte[10]);
        assertEquals(12, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetEncodedLength2_ampw1() {
        Base16 base16 = new Base16(true);
        long result = base16.getEncodedLength(new byte[15]);
        assertEquals(18, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeEmptyArray_jFsC0() {
        CodecPolicy policy = CodecPolicy.STRICT;
        Base16 base16 = new Base16();
        byte[] result = base16.encode(new byte[0]);
        assertArrayEquals(new byte[0], result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeNonEmptyArray_pTwx1() {
        CodecPolicy policy = CodecPolicy.STRICT;
        Base16 base16 = new Base16();
        byte[] array = new byte[]{1, 2, 3, 4, 5};
        byte[] result = base16.encode(array);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDefaultBufferSize_JEtJ0() {
        Base16 base16 = new Base16();
        assertEquals(10, base16.getDefaultBufferSize());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInAlphabetStrict_PVpk0() {
        Base16 base16 = new Base16(false, CodecPolicy.STRICT);
        byte[] arrayOctet = new byte[]{65, 66, 67};
        assertTrue(base16.isInAlphabet(arrayOctet, false));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInAlphabetLenient_mrss1() {
        Base16 base16 = new Base16(false, CodecPolicy.LENIENT);
        byte[] arrayOctet = new byte[]{65, 66, 67};
        assertTrue(base16.isInAlphabet(arrayOctet, false));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInAlphabetAllowWSPad_xHoj2() {
        Base16 base16 = new Base16(false, CodecPolicy.STRICT);
        byte[] arrayOctet = new byte[]{65, 66, 67, 32};
        assertTrue(base16.isInAlphabet(arrayOctet, true));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInAlphabetNotAllowWSPad_jVHk3() {
        Base16 base16 = new Base16(false, CodecPolicy.STRICT);
        byte[] arrayOctet = new byte[]{65, 66, 67, 32};
        assertFalse(base16.isInAlphabet(arrayOctet, false));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInAlphabetPad_xGFu4() {
        Base16 base16 = new Base16(false, CodecPolicy.STRICT);
        byte[] arrayOctet = new byte[]{65, 66, 67, 0};
        assertTrue(base16.isInAlphabet(arrayOctet, true));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsWhiteSpace_Zlpc0() {
        assertTrue(Base16.isWhiteSpace((byte) ' '));
        assertTrue(Base16.isWhiteSpace((byte) '\t'));
        assertTrue(Base16.isWhiteSpace((byte) '\n'));
        assertTrue(Base16.isWhiteSpace((byte) '\r'));
        assertFalse(Base16.isWhiteSpace((byte) 'a'));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testStrictDecodingTrue_zURS0() {
        Base16 base16 = new Base16(true, CodecPolicy.STRICT);
        boolean result = base16.isStrictDecoding();
        assert(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testStrictDecodingFalse_nwzm1() {
        Base16 base16 = new Base16(true, CodecPolicy.LENIENT);
        boolean result = base16.isStrictDecoding();
        assert(!result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeByteArray_jwOj0() throws DecoderException {
        CodecPolicy policy = CodecPolicy.STRICT;
        Base16 base16 = new Base16(false, policy);
        byte[] bytes = new byte[]{1, 2, 3};
        Object result = base16.decode(bytes);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeString_dAgt1() throws DecoderException {
        CodecPolicy policy = CodecPolicy.LENIENT;
        Base16 base16 = new Base16(true, policy);
        String str = "123";
        Object result = base16.decode(str);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_LPbh0() {
        Base16 base16 = new Base16();
        byte[] pArray = new byte[]{1, 2, 3};
        byte[] result = base16.encode(pArray, 0, pArray.length);
        byte[] expected = new byte[]{1, 2, 3};
        assertArrayEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeEmptyArray_Ddun1() {
        Base16 base16 = new Base16();
        byte[] pArray = new byte[0];
        byte[] result = base16.encode(pArray, 0, pArray.length);
        byte[] expected = new byte[0];
        assertArrayEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCodecPolicyStrict_RQEo0() {
        Base16 base16 = new Base16(false, CodecPolicy.STRICT);
        assertEquals(CodecPolicy.STRICT, base16.getCodecPolicy());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCodecPolicyLenient_JaRW1() {
        Base16 base16 = new Base16(false, CodecPolicy.LENIENT);
        assertEquals(CodecPolicy.LENIENT, base16.getCodecPolicy());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCodecPolicyDefault_OXJP2() {
        Base16 base16 = new Base16(false);
        assertEquals(CodecPolicy.LENIENT, base16.getCodecPolicy());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeStrict_filq0() {
        Base16 base16 = new Base16(true, CodecPolicy.STRICT);
        byte[] pArray = new byte[]{(byte) 0x12, (byte) 0x34};
        byte[] result = base16.decode(pArray);
        byte[] expected = new byte[]{(byte) 0x12, (byte) 0x34};
        assertArrayEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeLenient_lyIE1() {
        Base16 base16 = new Base16(true, CodecPolicy.LENIENT);
        byte[] pArray = new byte[]{(byte) 0x12, (byte) 0x34, (byte) 0x56};
        byte[] result = base16.decode(pArray);
        byte[] expected = new byte[]{(byte) 0x12, (byte) 0x34};
        assertArrayEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testContainsAlphabetOrPadNull_CQCm0() {
        Base16 base16 = new Base16();
        assertFalse(base16.containsAlphabetOrPad(null));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testContainsAlphabetOrPadEmpty_oOWy1() {
        Base16 base16 = new Base16();
        byte[] arrayOctet = new byte[0];
        assertFalse(base16.containsAlphabetOrPad(arrayOctet));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testContainsAlphabetOrPadNoAlphabetOrPad_ESSY2() {
        Base16 base16 = new Base16();
        byte[] arrayOctet = new byte[]{1, 2, 3, 4, 5};
        assertFalse(base16.containsAlphabetOrPad(arrayOctet));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testContainsAlphabetOrPadAlphabet_odSE3() {
        Base16 base16 = new Base16();
        byte[] arrayOctet = new byte[]{'a', 'b', 'c'};
        assertTrue(base16.containsAlphabetOrPad(arrayOctet));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testContainsAlphabetOrPadPad_CRzB4() {
        Base16 base16 = new Base16();
        byte[] arrayOctet = new byte[]{0, 1, 2};
        assertTrue(base16.containsAlphabetOrPad(arrayOctet));
    }
}