/**
 * Generated by Aster
 */
package org.apache.commons.codec.digest;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_Md5Crypt_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_apr1Crypt_1_qhmA0() {
        byte[] keyBytes = null;
        String salt = null;
        String expected = null;
        String actual = Md5Crypt.apr1Crypt(keyBytes, salt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_apr1Crypt_14_UPDc13_Thel0() {
        byte[] keyBytes = new byte[(int) 1000000000000L];
        String salt = null;
        String expected = null;
        String actual = Md5Crypt.apr1Crypt(keyBytes, salt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_apr1Crypt_2_Dpjs1_fid1() {
        byte[] keyBytes = new byte[0];
        String salt = null;
        String expected = null;
        String actual = Md5Crypt.apr1Crypt(keyBytes, salt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_apr1Crypt_3_wzKa2_fid1() {
        byte[] keyBytes = new byte[1];
        String salt = null;
        String expected = null;
        String actual = Md5Crypt.apr1Crypt(keyBytes, salt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_apr1Crypt_4_QVct3_fid1() {
        byte[] keyBytes = new byte[10];
        String salt = null;
        String expected = null;
        String actual = Md5Crypt.apr1Crypt(keyBytes, salt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_apr1Crypt_5_XpJe4_fid1() {
        byte[] keyBytes = new byte[100];
        String salt = null;
        String expected = null;
        String actual = Md5Crypt.apr1Crypt(keyBytes, salt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_apr1Crypt_6_PxyP5_fid1() {
        byte[] keyBytes = new byte[1000];
        String salt = null;
        String expected = null;
        String actual = Md5Crypt.apr1Crypt(keyBytes, salt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_apr1Crypt_7_Icbe6_fid1() {
        byte[] keyBytes = new byte[10000];
        String salt = null;
        String expected = null;
        String actual = Md5Crypt.apr1Crypt(keyBytes, salt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_apr1Crypt_8_bXHS7_fid1() {
        byte[] keyBytes = new byte[100000];
        String salt = null;
        String expected = null;
        String actual = Md5Crypt.apr1Crypt(keyBytes, salt);
        assertEquals(expected, actual);
    }
}