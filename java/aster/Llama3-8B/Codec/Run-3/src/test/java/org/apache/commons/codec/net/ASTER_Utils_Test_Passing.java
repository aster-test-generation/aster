/**
 * Generated by Aster
 */
package org.apache.commons.codec.net;

import java.util.concurrent.TimeUnit;
import org.apache.commons.codec.DecoderException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_Utils_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDigit16ValidDigit_JrYV0() throws Exception {
        assertEquals(1, Utils.digit16((byte) '1'));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDigit16InvalidDigit_oejW1() throws Exception {
        try {
            Utils.digit16((byte) 'a');
            fail("Expected DecoderException");
        } catch (DecoderException e) {
            assertEquals("Invalid URL encoding: not a valid digit (radix 16): a", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHexDigit0_fsrj0() throws Exception {
        char result = Utils.hexDigit(0);
        assert result == '0';
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHexDigit1_Avuo1() throws Exception {
        char result = Utils.hexDigit(1);
        assert result == '1';
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHexDigit2_kAeQ2() throws Exception {
        char result = Utils.hexDigit(2);
        assert result == '2';
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHexDigit3_MOav3() throws Exception {
        char result = Utils.hexDigit(3);
        assert result == '3';
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHexDigit4_BPZJ4() throws Exception {
        char result = Utils.hexDigit(4);
        assert result == '4';
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHexDigit5_lJuH5() throws Exception {
        char result = Utils.hexDigit(5);
        assert result == '5';
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHexDigit6_SeVs6() throws Exception {
        char result = Utils.hexDigit(6);
        assert result == '6';
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHexDigit7_tMli7() throws Exception {
        char result = Utils.hexDigit(7);
        assert result == '7';
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHexDigit8_wZSy8() throws Exception {
        char result = Utils.hexDigit(8);
        assert result == '8';
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHexDigit9_CxqI9() throws Exception {
        char result = Utils.hexDigit(9);
        assert result == '9';
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHexDigit10_jAcS10() throws Exception {
        char result = Utils.hexDigit(10);
        assert result == 'A';
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHexDigit11_ThyV11() throws Exception {
        char result = Utils.hexDigit(11);
        assert result == 'B';
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHexDigit12_VPng12() throws Exception {
        char result = Utils.hexDigit(12);
        assert result == 'C';
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHexDigit13_zFaK13() throws Exception {
        char result = Utils.hexDigit(13);
        assert result == 'D';
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHexDigit14_piti14() throws Exception {
        char result = Utils.hexDigit(14);
        assert result == 'E';
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHexDigit15_rCBC15() throws Exception {
        char result = Utils.hexDigit(15);
        assert result == 'F';
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHexDigit16_pCVs16() throws Exception {
        char result = Utils.hexDigit(16);
        assert result == 'F';
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHexDigit17_JUVz17() throws Exception {
        char result = Utils.hexDigit(17);
        assert result == 'F';
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHexDigit18_jyaH18() throws Exception {
        char result = Utils.hexDigit(18);
        assert result == 'F';
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHexDigit19_XZUi19() throws Exception {
        char result = Utils.hexDigit(19);
        assert result == 'F';
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHexDigit20_EZAo20() throws Exception {
        char result = Utils.hexDigit(20);
        assert result == 'F';
    }
}