/**
 * Generated by Aster
 */
package org.apache.commons.codec.digest;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_Blake3_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInitHash_zKRY0() throws Exception {
        Blake3 blake3 = Blake3.initHash();
        assertNotNull(blake3);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testInitKeyedHash_QCRq0() throws Exception {
        byte[] key = new byte[32]; // Replace with actual key
        Blake3 blake3 = Blake3.initKeyedHash(key);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testHash_pecW1() throws Exception {
        byte[] data = new byte[10]; // Replace with actual data
        byte[] hash = Blake3.hash(data);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInitKeyedHashWithInvalidKeyLength_FrHA1_1() throws Exception {
        byte[] key = new byte[16]; // Replace with actual invalid key bytes
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
            Blake3.initKeyedHash(key);
        });}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInitKeyedHashWithNullKey_yNGL2_1() throws Exception {
        Throwable exception = assertThrows(NullPointerException.class, () -> {
            Blake3.initKeyedHash(null);
        });}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash_QQBK0() throws Exception {
        byte[] data = new byte[0];
        byte[] expected = new byte[64];
        byte[] actual = Blake3.hash(data);
        assertArrayEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testKeyedHash_hZMi0() throws Exception {
        byte[] key = new byte[32]; // initialize key with appropriate length
        byte[] data = new byte[100]; // initialize data with appropriate length
        byte[] expected = Blake3.keyedHash(key, data);
        byte[] actual = null; // replace with actual result
        assertArrayEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testKeyedHashWithEmptyData_SLss1() throws Exception {
        byte[] key = new byte[32]; // initialize key with appropriate length
        byte[] data = new byte[0]; // initialize data with empty array
        byte[] expected = Blake3.keyedHash(key, data);
        byte[] actual = null; // replace with actual result
        assertArrayEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testKeyedHashWithEmptyKey_WjpQ2() throws Exception {
        byte[] key = new byte[0]; // initialize key with empty array
        byte[] data = new byte[100]; // initialize data with appropriate length
        byte[] expected = Blake3.keyedHash(key, data);
        byte[] actual = null; // replace with actual result
        assertArrayEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testKeyedHashWithEmptyKeyAndData_okqn3() throws Exception {
        byte[] key = new byte[0]; // initialize key with empty array
        byte[] data = new byte[0]; // initialize data with empty array
        byte[] expected = Blake3.keyedHash(key, data);
        byte[] actual = null; // replace with actual result
        assertArrayEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testKeyedHashWithNullKey_FnMc4() throws Exception {
        byte[] key = null;
        byte[] data = new byte[100]; // initialize data with appropriate length
        byte[] expected = Blake3.keyedHash(key, data);
        byte[] actual = null; // replace with actual result
        assertArrayEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testKeyedHashWithNullData_geQB5() throws Exception {
        byte[] key = new byte[32]; // initialize key with appropriate length
        byte[] data = null;
        byte[] expected = Blake3.keyedHash(key, data);
        byte[] actual = null; // replace with actual result
        assertArrayEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testKeyedHashWithNullKeyAndData_BpEB6() throws Exception {
        byte[] key = null;
        byte[] data = null;
        byte[] expected = Blake3.keyedHash(key, data);
        byte[] actual = null; // replace with actual result
        assertArrayEquals(expected, actual);
    }
}