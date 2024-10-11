/**
 * Generated by Aster
 */
package org.apache.commons.codec.digest;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_Blake3_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInitKeyDerivationFunction_jOpH0() {
        byte[] kdfContext = new byte[10];
        for (int i = 0; i < kdfContext.length; i++) {
            kdfContext[i] = (byte) i;
        }
        Blake3 blake3 = Blake3.initKeyDerivationFunction(kdfContext);
        assertNotNull(blake3);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInitKeyDerivationFunctionWithInvalidContext_MFiQ1() {
        byte[] kdfContext = null;
        try {
            Blake3.initKeyDerivationFunction(kdfContext);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            assertNull(e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInitKeyDerivationFunction_jLeh0() {
        byte[] kdfContext = new byte[10];
        Blake3 blake3 = Blake3.initKeyDerivationFunction(kdfContext);
        assertNotNull(blake3);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash_invalidOutLen7_oNDK11() {
        byte[] data = new byte[]{1, 2, 3, 4, 5};
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateWithInvalidData_HtAO4_oreD0() {
        Blake3 blake3 = Blake3.initHash();
        byte[] data = null;
        try {
            blake3.update(data);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateWithNegativeOffset_tbTY3_MoQL0() {
        Blake3 blake3 = Blake3.initHash();
        byte[] data = new byte[10];
        int offset = -1;
        int length = 10;
        try {
            blake3.update(data, offset, length);
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            assertEquals("Offset must be non-negative", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateWithNegativeLength_qkmw4_JyYp0() {
        Blake3 blake3 = Blake3.initHash();
        byte[] data = new byte[10];
        int offset = 0;
        int length = -1;
        try {
            blake3.update(data, offset, length);
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            assertEquals("Length must be non-negative", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoFinalize_NegativeBytes_LbuV0_SKDH0() {
        Blake3 blake3 = Blake3.initHash();
        try {
            blake3.doFinalize(-1);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Requested bytes must be non-negative", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoFinalize_ZeroBytes_BiJe2_TJep0() {
        Blake3 blake3 = Blake3.initHash();
        byte[] hash = blake3.doFinalize(0);
        assertEquals(0, hash.length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoFinalize_djYW0_kdAy0() {
        Blake3 blake3 = Blake3.initHash();
        byte[] data = new byte[10];
        byte[] out = new byte[10];
        blake3.update(data);
        blake3.doFinalize(out, 0, out.length);
        assertEquals(blake3.doFinalize(out, 0, out.length), blake3);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoFinalize_zZgb0_ppxe0_1() {
        Blake3 blake3 = Blake3.initHash();
        byte[] out = new byte[32];
        int offset = 0;
        int length = 32;
        blake3.doFinalize(out, offset, length);
        assertEquals(32, out.length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoFinalize_zZgb0_ppxe0_2() {
        Blake3 blake3 = Blake3.initHash();
        byte[] out = new byte[32];
        int offset = 0;
        int length = 32;
        blake3.doFinalize(out, offset, length);
        assertEquals(0, offset);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoFinalize_zZgb0_ppxe0_3() {
        Blake3 blake3 = Blake3.initHash();
        byte[] out = new byte[32];
        int offset = 0;
        int length = 32;
        blake3.doFinalize(out, offset, length);
        assertEquals(32, length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoFinalizeWithDifferentArguments_RrLZ1_MvCB0_1() {
        Blake3 blake3 = Blake3.initHash();
        byte[] out = new byte[32];
        int offset = 16;
        int length = 16;
        blake3.doFinalize(out, offset, length);
        assertEquals(32, out.length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoFinalizeWithDifferentArguments_RrLZ1_MvCB0_2() {
        Blake3 blake3 = Blake3.initHash();
        byte[] out = new byte[32];
        int offset = 16;
        int length = 16;
        blake3.doFinalize(out, offset, length);
        assertEquals(16, offset);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoFinalizeWithDifferentArguments_RrLZ1_MvCB0_3() {
        Blake3 blake3 = Blake3.initHash();
        byte[] out = new byte[32];
        int offset = 16;
        int length = 16;
        blake3.doFinalize(out, offset, length);
        assertEquals(16, length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoFinalizeWithNullBuffer_BhQr2_VICh0() {
        Blake3 blake3 = Blake3.initHash();
        byte[] out = null;
        int offset = 0;
        int length = 32;
        try {
            blake3.doFinalize(out, offset, length);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoFinalizeWithNegativeOffset_jUQs3_waOg0() {
        Blake3 blake3 = Blake3.initHash();
        byte[] out = new byte[32];
        int offset = -1;
        int length = 32;
        try {
            blake3.doFinalize(out, offset, length);
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            assertEquals("Offset must be non-negative", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoFinalizeWithNegativeLength_eZHx4_YNDW0() {
        Blake3 blake3 = Blake3.initHash();
        byte[] out = new byte[32];
        int offset = 0;
        int length = -1;
        try {
            blake3.doFinalize(out, offset, length);
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            assertEquals("Length must be non-negative", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoFinalizeWithOffsetAndLengthOutOfBounds_yOGk5_vxsL0() {
        Blake3 blake3 = Blake3.initHash();
        byte[] out = new byte[32];
        int offset = 33;
        int length = 1;
        try {
            blake3.doFinalize(out, offset, length);
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            assertEquals("Offset " + offset + " and length " + length + " out of bounds with buffer length " + out.length, e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash_invalidOutLen3_eBlB7_mvaj0() {
        byte[] data = new byte[]{1, 2, 3, 4, 5};
        byte[] expected = new byte[]{1, 2, 3, 4, 5};
        byte[] actual = Blake3.hash(data);
    }
}