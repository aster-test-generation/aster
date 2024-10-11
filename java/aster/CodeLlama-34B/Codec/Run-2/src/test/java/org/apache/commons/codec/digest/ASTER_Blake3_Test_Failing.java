/**
 * Generated by Aster
 */
package org.apache.commons.codec.digest;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_Blake3_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testKeyedHash_Eamr74() {
        byte[] key = new byte[32];
        byte[] data = new byte[174];
        byte[] expected = new byte[32];
        byte[] actual = Blake3.keyedHash(key, data);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testKeyedHashWithNullKey_QZTW4() {
        byte[] data = new byte[10];
        byte[] expected = new byte[32];
        byte[] actual = Blake3.keyedHash(new byte[0], data);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testKeyedHashWithNullData_JqGm5() {
        byte[] key = new byte[32];
        byte[] expected = new byte[0];
        byte[] actual = Blake3.keyedHash(key, new byte[0]);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testKeyedHashWithEmptyKey_fGnu6() {
        byte[] key = new byte[32];
        byte[] data = new byte[10];
        byte[] expected = new byte[32];
        byte[] actual = Blake3.keyedHash(key, data);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testKeyedHashWithEmptyData_OCPo7() {
        byte[] key = new byte[32];
        byte[] data = new byte[-89];
        byte[] expected = new byte[32];
        byte[] actual = Blake3.keyedHash(key, data);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testKeyedHashWithMinData_uSiB11() {
        byte[] key = new byte[32];
        byte[] data = new byte[1];
        byte[] expected = new byte[32];
        byte[] actual = Blake3.keyedHash(key, data);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInitKeyDerivationFunctionWithEmptyContext_IkfD2() {
        byte[] kdfContext = new byte[0];
        try {
            Blake3.initKeyDerivationFunction(kdfContext);
            fail("Should throw IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("kdfContext is empty", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInitKeyDerivationFunctionWithInvalidContext_hBUo3() {
        byte[] kdfContext = new byte[10];
        kdfContext[0] = (byte) 0xFF;
        try {
            Blake3.initKeyDerivationFunction(kdfContext);
            fail("Should throw IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("kdfContext is invalid", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInitKeyDerivationFunctionWithEmptyContext_QVuV2() {
        byte[] kdfContext = new byte[0];
        try {
            Blake3.initKeyDerivationFunction(kdfContext);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("context cannot be empty", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInitKeyDerivationFunctionWithInvalidContext_DyfV3() {
        byte[] kdfContext = new byte[10];
        for (int i = 0; i < kdfContext.length; i++) {
            kdfContext[i] = (byte) i;
        }
        try {
            Blake3.initKeyDerivationFunction(kdfContext);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("context must be a valid BLAKE3 context", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInitKeyDerivationFunctionWithEmptyContext_tmbW2() {
        byte[] kdfContext = new byte[0];
        try {
            Blake3.initKeyDerivationFunction(kdfContext);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("kdfContext must not be empty", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInitKeyDerivationFunctionWithInvalidContext_QBwy3() {
        byte[] kdfContext = new byte[10];
        kdfContext[0] = -1;
        try {
            Blake3.initKeyDerivationFunction(kdfContext);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("kdfContext must not contain negative values", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdate_invalidLength_aSyX3_iexZ0() {
        Blake3 blake3 = Blake3.initHash();
        byte[] in = new byte[10];
        try {
            blake3.update(in, 0, 10);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid length", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdate_invalidOffset_Bpsr4_NmJA0() {
        Blake3 blake3 = Blake3.initHash();
        byte[] in = new byte[10];
        try {
            blake3.update(in, 10, 10);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid offset", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdate_invalidLengthAndOffset_meVz5_helF0() {
        Blake3 blake3 = Blake3.initHash();
        byte[] in = new byte[10];
        try {
            blake3.update(in, 10, 10);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid length and offset", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoFinalize_EdgeCase_Length0_tjoK4_ZLbT0() {
        Blake3 blake3 = Blake3.initHash();
        try {
            blake3.doFinalize(0);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Requested bytes must be non-negative", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoFinalize_EdgeCase_LengthGreaterThanMax_Qkqa5_imaB0() {
        Blake3 blake3 = Blake3.initHash();
        try {
            blake3.doFinalize(1000);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Requested bytes must be less than or equal to 64", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoFinalizeWithNullData_PLwH8_yKlc0() {
        Blake3 blake3 = Blake3.initHash();
        byte[] data = null;
        byte[] out = new byte[10];
        Blake3 result = blake3.update(data).doFinalize(out);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testKeyedHashWithNullKey_QZTW4_fid1() {
        byte[] data = new byte[10];
        byte[] expected = new byte[32];
        byte[] actual = Blake3.keyedHash(null, data);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testKeyedHashWithNullData_JqGm5_fid1() {
        byte[] key = new byte[32];
        byte[] expected = new byte[32];
        byte[] actual = Blake3.keyedHash(key, null);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testKeyedHashWithEmptyKey_fGnu6_fid1() {
        byte[] key = new byte[0];
        byte[] data = new byte[10];
        byte[] expected = new byte[32];
        byte[] actual = Blake3.keyedHash(key, data);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testKeyedHashWithEmptyData_OCPo7_fid1() {
        byte[] key = new byte[32];
        byte[] data = new byte[0];
        byte[] expected = new byte[32];
        byte[] actual = Blake3.keyedHash(key, data);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testKeyedHashWithMinKey_RxsP10_fid1() {
        byte[] key = new byte[1];
        byte[] data = new byte[10];
        byte[] expected = new byte[32];
        byte[] actual = Blake3.keyedHash(key, data);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInitKeyDerivationFunctionWithNullContext_EQFr1_fid1() {
        byte[] kdfContext = null;
        try {
            Blake3.initKeyDerivationFunction(kdfContext);
            fail("Should throw NullPointerException");
        } catch (NullPointerException e) {
            assertEquals("kdfContext is null", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInitKeyDerivationFunctionWithNullContext_DRmk1_fid1() {
        byte[] kdfContext = null;
        try {
            Blake3.initKeyDerivationFunction(kdfContext);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            assertEquals("context", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInitKeyDerivationFunctionWithNullContext_nHEZ1_fid1() {
        byte[] kdfContext = null;
        try {
            Blake3.initKeyDerivationFunction(kdfContext);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            assertEquals("kdfContext", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash_cheO0_fid1() {
        byte[] data = new byte[10];
        byte[] expected = new byte[32];
        for (int i = 0; i < 10; i++) {
            data[i] = (byte) i;
        }
        for (int i = 0; i < 32; i++) {
            expected[i] = (byte) (i + 1);
        }
        byte[] actual = Blake3.hash(data);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdate_null_NnCp2_EGTw0_fid1() {
        Blake3 blake3 = Blake3.initHash();
        byte[] in = null;
        try {
            blake3.update(in);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            assertEquals("in", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdate_invalidLength_aSyX3_iexZ0_fid1() {
        Blake3 blake3 = Blake3.initHash();
        byte[] in = new byte[10];
        try {
            blake3.update(in, -1, 10);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid length", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdate_invalidOffset_Bpsr4_NmJA0_fid1() {
        Blake3 blake3 = Blake3.initHash();
        byte[] in = new byte[10];
        try {
            blake3.update(in, 11, 10);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid offset", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdate_invalidLengthAndOffset_meVz5_helF0_fid1() {
        Blake3 blake3 = Blake3.initHash();
        byte[] in = new byte[10];
        try {
            blake3.update(in, 11, 10);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid length and offset", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateWithNullBuffer_hvUz4_liMQ0_fid1() {
        Blake3 blake3 = Blake3.initHash();
        byte[] data = null;
        int offset = 0;
        int length = 10;
        try {
            blake3.update(data, offset, length);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            assertEquals("Buffer must not be null", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoFinalize_EdgeCase_LengthGreaterThanMax_Qkqa5_imaB0_fid1() {
        Blake3 blake3 = Blake3.initHash();
        try {
            blake3.doFinalize(1000);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Requested bytes must be non-negative", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoFinalizeWithNegativeOffset_XmEC2_nOoB0_fid1() {
        Blake3 blake3 = Blake3.initHash();
        byte[] data = new byte[10];
        byte[] out = new byte[10];
        int offset = -5;
        Blake3 result = blake3.update(data).doFinalize(out, offset, out.length - offset);
        assertEquals(blake3, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoFinalizeWithNegativeLength_UmdT4_uToK0_fid1() {
        Blake3 blake3 = Blake3.initHash();
        byte[] data = new byte[10];
        byte[] out = new byte[10];
        int length = -5;
        Blake3 result = blake3.update(data).doFinalize(out, 0, length);
        assertEquals(blake3, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoFinalizeWithNegativeOffsetAndLength_WkVM6_cRrY0_fid1() {
        Blake3 blake3 = Blake3.initHash();
        byte[] data = new byte[10];
        byte[] out = new byte[10];
        int offset = -5;
        int length = -5;
        Blake3 result = blake3.update(data).doFinalize(out, offset, length);
        assertEquals(blake3, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoFinalizeWithNullData_PLwH8_yKlc0_fid1() {
        Blake3 blake3 = Blake3.initHash();
        byte[] data = null;
        byte[] out = new byte[10];
        Blake3 result = blake3.update(data).doFinalize(out);
        assertEquals(blake3, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoFinalizeWithOffsetAndNegativeLength_QuTh6_MUPi0_fid1() {
        Blake3 blake3 = Blake3.initHash();
        byte[] out = new byte[32];
        int offset = 8;
        int length = -1;
        try {
            blake3.doFinalize(out, offset, length);
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            assertEquals("Offset " + offset + " and length " + length + " out of bounds with buffer length " + out.length, e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoFinalizeWithNullBuffer_rXxa7_yVcg0_fid1() {
        Blake3 blake3 = Blake3.initHash();
        byte[] out = null;
        int offset = 0;
        int length = 32;
        try {
            blake3.doFinalize(out, offset, length);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            assertEquals("Buffer must not be null", e.getMessage());
        }
    }
}