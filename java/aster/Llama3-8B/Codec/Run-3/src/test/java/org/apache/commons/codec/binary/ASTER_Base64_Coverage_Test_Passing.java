/**
 * Generated by Aster
 */
package org.apache.commons.codec.binary;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_Base64_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsBase64_ReturnsFalse_WhenElementIsNotBase64AndNotWhitespace_caBa0() {
        byte[] arrayOctet = new byte[]{(byte) 0x80, (byte) 0x80};
        assertFalse(Base64.isBase64(arrayOctet));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEmptyInput_KXOk0() {
        byte[] binaryData = new byte[0];
        byte[] result = Base64.encodeBase64(binaryData, false, true, 1024);
        assertArrayEquals(binaryData, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNonEmptyInput_gjrq1() {
        byte[] binaryData = new byte[]{1, 2, 3, 4, 5};
        byte[] result = Base64.encodeBase64(binaryData, false, true, 1024);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInputTooBig_WMQC2() {
        byte[] binaryData = new byte[1025];
        assertThrows(IllegalArgumentException.class, () -> Base64.encodeBase64(binaryData, false, true, 1024));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testChunkedEncoding_ZKNR3() {
        byte[] binaryData = new byte[]{1, 2, 3, 4, 5};
        byte[] result = Base64.encodeBase64(binaryData, true, true, 1024);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsBase64_PAD_DEFAULT_IJii0() {
        assertEquals(true, Base64.isBase64(Base64.PAD_DEFAULT));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInAlphabet_nAjc0_1() {
        Base64 base64 = new Base64();
        assertFalse(base64.isInAlphabet((byte) 0));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInAlphabet_nAjc0_2() {
        Base64 base64 = new Base64();
        assertFalse(base64.isInAlphabet((byte) 25));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInAlphabet_nAjc0_3() {
        Base64 base64 = new Base64();
        assertFalse(base64.isInAlphabet((byte) -1));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsInAlphabet_nAjc0_4() {
        Base64 base64 = new Base64();
        assertFalse(base64.isInAlphabet((byte) 26));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeReturn_gXEN1_cOuh1() {
        Base64 base64 = new Base64();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsBase64_outOfRangeOctet_tVeV3_TBVU1_1() {
        assertEquals(false, Base64.isBase64((byte) -1));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsBase64_outOfRangeOctet_tVeV3_TBVU1_2() {
        assertEquals(false, Base64.isBase64((byte) (Byte.MAX_VALUE + 1)));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithDecodeTable_Kelu0_LkPf0_1() {
        Base64 base64 = new Base64();
        byte[] input = new byte[]{(byte) 0x00, (byte) 0x01, (byte) 0x02};
        int inPos = 0;
        int inAvail = 3;
        assertEquals(false, base64.isBase64((byte) 0x00));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithDecodeTable_Kelu0_LkPf0_2() {
        Base64 base64 = new Base64();
        byte[] input = new byte[]{(byte) 0x00, (byte) 0x01, (byte) 0x02};
        int inPos = 0;
        int inAvail = 3;
        assertEquals(false, base64.isBase64((byte) 0x01));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithDecodeTable_Kelu0_LkPf0_3() {
        Base64 base64 = new Base64();
        byte[] input = new byte[]{(byte) 0x00, (byte) 0x01, (byte) 0x02};
        int inPos = 0;
        int inAvail = 3;
        assertEquals(false, base64.isBase64((byte) 0x02));
    }
}