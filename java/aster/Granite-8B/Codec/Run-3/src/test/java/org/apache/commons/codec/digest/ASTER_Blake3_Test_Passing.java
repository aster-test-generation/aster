/**
 * Generated by Aster
 */
package org.apache.commons.codec.digest;

import java.util.Objects;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_Blake3_Test_Passing {
    private static int[] unpackInts(final byte[] buf, final int nrInts) {
        final int[] values = new int[nrInts];
        for (int i = 0, off = 0; i < nrInts; i++, off += Integer.BYTES) {
            values[i] = unpackInt(buf, off);
        }
        return values;
    }

    private static int unpackInt(final byte[] buf, final int off) {
        int value = 0;
        for (int i = 0; i < Integer.BYTES; i++) {
            value |= (buf[off + i] & 0xFF) << (i * 8);
        }
        return value;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInitHash_sOuN0() throws Exception {
        Blake3 blake3 = Blake3.initHash();
        assertNotNull(blake3);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testInitKeyedHashWithNullKey_NxeF0() throws Exception {
        Blake3 blake3 = Blake3.initKeyedHash(null);
        Objects.requireNonNull(blake3);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testInitKeyDerivationFunction_ZeLT0() throws Exception {
        byte[] kdfContext = new byte[10];
        Blake3 blake3 = Blake3.initKeyDerivationFunction(kdfContext);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testInitKeyDerivationFunctionWithNullContext_RcoP1() throws Exception {
        byte[] kdfContext = null;
        Exception exception = assertThrows(NullPointerException.class, () -> Blake3.initKeyDerivationFunction(kdfContext));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testKeyedHash_Rmpv0() throws Exception {
        byte[] key = new byte[32];
        byte[] data = new byte[64];
        assertDoesNotThrow(() -> Blake3.keyedHash(key, data));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testKeyedHashWithNullKey_CyGS1() throws Exception {
        byte[] data = new byte[64];
        assertThrows(IllegalArgumentException.class, () -> Blake3.keyedHash(null, data));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testKeyedHashWithNullData_PGVG2() throws Exception {
        byte[] key = new byte[32];
        assertThrows(IllegalArgumentException.class, () -> Blake3.keyedHash(key, null));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testKeyedHashWithInvalidKeyLength_qXvJ3() throws Exception {
        byte[] key = new byte[16];
        byte[] data = new byte[64];
        assertThrows(IllegalArgumentException.class, () -> Blake3.keyedHash(key, data));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testKeyedHashWithInvalidDataLength_vigL4() throws Exception {
        byte[] key = new byte[32];
        byte[] data = new byte[31];
        assertThrows(IllegalArgumentException.class, () -> Blake3.keyedHash(key, data));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInitKeyedHashWithKeyLength32Bytes_KGmP0() throws Exception {
        byte[] key = new byte[32];
        Blake3 blake3 = Blake3.initKeyedHash(key);
        assertNotNull(blake3);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInitKeyedHashWithKeyLengthNot32Bytes_AqgA1() throws Exception {
        byte[] key = new byte[31];
        try {
            Blake3.initKeyedHash(key);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Blake3 keys must be 32 bytes", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInitKeyedHashWithNullKey_sZlR2() throws Exception {
        try {
            Blake3.initKeyedHash(null);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            assertEquals("key", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testHash_QxBt0() throws Exception {
        byte[] data = new byte[10];
        byte[] hash = Blake3.hash(data);
        assert hash.length == 32;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testHashNull_kEnN1() throws Exception {
        assertThrows(NullPointerException.class, () -> {
            byte[] hash = Blake3.hash(null);
        });
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testHashEmpty_SSXR2() throws Exception {
        byte[] data = new byte[0];
        byte[] hash = Blake3.hash(data);
        assert hash.length == 32;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testHashLarge_odWB3() throws Exception {
        byte[] data = new byte[1000000];
        byte[] hash = Blake3.hash(data);
        assert hash.length == 32;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testHashUpdate_lRGp4() throws Exception {
        byte[] data1 = new byte[10];
        byte[] data2 = new byte[20];
        byte[] hash = Blake3.initHash().update(data1).update(data2).doFinalize(32);
        assert hash.length == 32;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testHashUpdateLarge_xTlg5() throws Exception {
        byte[] data1 = new byte[1000000];
        byte[] data2 = new byte[2000000];
        byte[] hash = Blake3.initHash().update(data1).update(data2).doFinalize(32);
        assert hash.length == 32;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testHashUpdateNull_ojPU6() throws Exception {
        assertThrows(NullPointerException.class, () -> {
            byte[] data = new byte[10];
            byte[] hash = Blake3.initHash().update(null).doFinalize(32);
        });
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testHashUpdateZero_AygX7() throws Exception {
        byte[] data = new byte[10];
        byte[] hash = Blake3.initHash().update(data, 0, 0).doFinalize(32);
        assert hash.length == 32;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testHashUpdateNegative_geLu8() throws Exception {
        byte[] data = new byte[10];
        assertThrows(IndexOutOfBoundsException.class, () -> {
            byte[] hash = Blake3.initHash().update(data, -1, 10).doFinalize(32);
        });
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testHashUpdateLargeNegative_Fumw9() throws Exception {
        byte[] data = new byte[10];
        assertThrows(IndexOutOfBoundsException.class, () -> {
            byte[] hash = Blake3.initHash().update(data, 1000000, 10).doFinalize(32);
        });
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testHashUpdateLargeOffset_GBtY10() throws Exception {
        byte[] data = new byte[10];
        assertThrows(IndexOutOfBoundsException.class, () -> {
            byte[] hash = Blake3.initHash().update(data, 10, 10).doFinalize(32);
        });
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testHashUpdateLargeSize_siHU11() throws Exception {
        byte[] data = new byte[10];
        assertThrows(IndexOutOfBoundsException.class, () -> {
            byte[] hash = Blake3.initHash().update(data, 0, 1000000).doFinalize(32);
        });
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testHashUpdateLargeOffsetSize_RPrD12() throws Exception {
        byte[] data = new byte[10];
        assertThrows(IndexOutOfBoundsException.class, () -> {
            byte[] hash = Blake3.initHash().update(data, 10, 1000000).doFinalize(32);
        });
    }
}