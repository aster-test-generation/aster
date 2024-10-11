/**
 * Generated by Aster
 */
package org.apache.commons.codec.digest;

import java.security.SecureRandom;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_Md5Crypt_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testApr1Crypt_XoTh0() {
        byte[] keyBytes = new byte[]{0x00, 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0a, 0x0b, 0x0c, 0x0d, 0x0e, 0x0f};
        String expected = "$apr1$c9gw/9hQ$BJkaDQ19SwRYky7sf3yHX/";
        String actual = Md5Crypt.apr1Crypt(keyBytes);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMd5Crypt_mkFB0() {
        byte[] keyBytes = new byte[]{0x01, 0x02, 0x03};
        Random random = new Random();
        String expected = "$1$Yz.1E8zD$TQSR.I25LP6kmw3D6ZK0q.";
        String actual = Md5Crypt.md5Crypt(keyBytes, random);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMd5Crypt_gDVS0() {
        byte[] keyBytes = new byte[]{0x00, 0x01, 0x02, 0x03};
        String salt = "$1$";
        String expected = "$1$00010203";
        String actual = Md5Crypt.md5Crypt(keyBytes, salt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMd5CryptWithSaltPrefix_DCAL1() {
        byte[] keyBytes = new byte[]{0x00, 0x01, 0x02, 0x03};
        String salt = "$1$";
        String expected = "$1$00010203";
        String actual = Md5Crypt.md5Crypt(keyBytes, salt, "$1$");
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMd5CryptWithSaltPostfix_lZWq2() {
        byte[] keyBytes = new byte[]{0x00, 0x01, 0x02, 0x03};
        String salt = "$1$";
        String expected = "$1$00010203";
        String actual = Md5Crypt.md5Crypt(keyBytes, salt, "");
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testApr1Crypt_zkhl0() {
        byte[] keyBytes = new byte[]{0x01, 0x02, 0x03};
        Random random = new Random();
        String result = Md5Crypt.apr1Crypt(keyBytes, random);
        assertEquals("$apr1$/yE4Qqhd$48yPdM3MGAwYa2VAUhDuj.", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testApr1CryptWithCoverage_uLdg1() {
        byte[] keyBytes = new byte[]{0x01, 0x02, 0x03};
        Random random = new Random();
        String result = Md5Crypt.apr1Crypt(keyBytes, random);
        assertEquals("$apr1$zfTbRQnQ$VswYWobJYGijhw328bcSx0", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMd5Crypt_TJvI0() {
        byte[] keyBytes = new byte[]{0x01, 0x02, 0x03};
        String salt = "$1$";
        String prefix = "";
        String expected = "$1$..."; // replace with expected result
        String actual = Md5Crypt.md5Crypt(keyBytes, salt, prefix);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMd5CryptWithSaltAndPrefix_Jusu1() {
        byte[] keyBytes = new byte[]{0x01, 0x02, 0x03};
        String salt = "$1$";
        String prefix = "prefix_";
        String expected = "$1$..."; // replace with expected result
        String actual = Md5Crypt.md5Crypt(keyBytes, salt, prefix);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMd5CryptWithSaltPrefixAndSecureRandom_hgXl2() {
        byte[] keyBytes = new byte[]{0x01, 0x02, 0x03};
        String salt = "$1$";
        String prefix = "prefix_";
        SecureRandom secureRandom = new SecureRandom();
        String expected = "$1$..."; // replace with expected result
        String actual = Md5Crypt.md5Crypt(keyBytes, salt, prefix, secureRandom);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testApr1Crypt_mjPa0() {
        String key = "password";
        String expected = "$apr1$NGQ6z0jh$W4.8UQhIPtkMGJaEN/PPk0";
        String actual = Md5Crypt.apr1Crypt(key);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testApr1CryptWithNull_ktUF1() {
        String key = null;
        String expected = null;
        String actual = Md5Crypt.apr1Crypt(key);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testApr1CryptWithEmpty_XQJG2() {
        String key = "";
        String expected = "$apr1$yM7knZcN$MdjQ1FSDON8M0SYKlDHN0.";
        String actual = Md5Crypt.apr1Crypt(key);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testApr1CryptWithCoverage_AEDH3_1() {
        String key = "password";
        String expected = "$apr1$5n.Yk4z6$5.547714465.57714465.";
        String actual = Md5Crypt.apr1Crypt(key);
        key = null;
        expected = null;
        actual = Md5Crypt.apr1Crypt(key);
        key = "";
        expected = "$apr1$5n.Yk4z6$5.547714465.57714465.";
        actual = Md5Crypt.apr1Crypt(key);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMd5CryptWithNullKeyBytes_WeNt0() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Md5Crypt.md5Crypt(null, "salt", "$1$", new Random());
        });
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMd5CryptWithEmptySalt_AzoB5_1() {
        String result = Md5Crypt.md5Crypt("key".getBytes(), "", "$1$", new Random());
        Assertions.assertTrue(result.startsWith("$1$"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMd5CryptWithEmptySalt_AzoB5_2() {
        String result = Md5Crypt.md5Crypt("key".getBytes(), "", "$1$", new Random());
        Assertions.assertTrue(result.length() == 34);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMd5CryptWithSalt_hQJp6_1() {
        String result = Md5Crypt.md5Crypt("key".getBytes(), "salt", "$1$", new Random());
        Assertions.assertTrue(result.startsWith("$1$salt"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMd5CryptWithSalt_hQJp6_2() {
        String result = Md5Crypt.md5Crypt("key".getBytes(), "salt", "$1$", new Random());
        Assertions.assertTrue(result.length() == 34);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMd5CryptWithNullPrefix_FUNG7() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Md5Crypt.md5Crypt("key".getBytes(), "salt", null, new Random());
        });
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMd5CryptWithEmptyPrefix_EqLV8() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Md5Crypt.md5Crypt("key".getBytes(), "salt", "", new Random());
        });
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMd5CryptWithNullRandom_xakv11_1() {
        String result = Md5Crypt.md5Crypt("key".getBytes(), "salt", "$1$", null);
        Assertions.assertTrue(result.startsWith("$1$salt"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMd5CryptWithNullRandom_xakv11_2() {
        String result = Md5Crypt.md5Crypt("key".getBytes(), "salt", "$1$", null);
        Assertions.assertTrue(result.length() == 34);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMd5Crypt_kJkO0() {
        byte[] keyBytes = new byte[]{0x01, 0x02, 0x03};
        String expected = "$1$N3DYwq3V$hOR8F9mq8YL0r.Vh1paG..";
        String actual = Md5Crypt.md5Crypt(keyBytes);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMd5CryptWithInvalidSalt_YZDM4() {
        byte[] keyBytes = new byte[]{0x01, 0x02, 0x03};
        String salt = "$1RandomSalt$";
        String expected = "$1$RandomSalt$RandomHash";
        String actual = Md5Crypt.md5Crypt(keyBytes, salt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMd5CryptWithEmptySalt_LLKB5() {
        byte[] keyBytes = new byte[]{0x01, 0x02, 0x03};
        String salt = "";
        String expected = "$1$RandomSalt$RandomHash";
        String actual = Md5Crypt.md5Crypt(keyBytes, salt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMd5CryptWithNullSalt_rawT6() {
        byte[] keyBytes = new byte[]{0x01, 0x02, 0x03};
        String salt = null;
        String expected = "$1$XCHV7rs/$YCfjRri08wtl2HvhQ3v.k/";
        String actual = Md5Crypt.md5Crypt(keyBytes, salt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testApr1Crypt_XoTh0_fid2() {
        byte[] keyBytes = new byte[]{0x00, 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0a, 0x0b, 0x0c, 0x0d, 0x0e, 0x0f};
        String expected = "$apr1$D4 phenumai$49X/4.54e.1";
        String actual = Md5Crypt.apr1Crypt(keyBytes);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMd5Crypt_mkFB0_fid2() {
        byte[] keyBytes = new byte[]{0x01, 0x02, 0x03};
        Random random = new Random();
        String expected = "$1$RandomSalt$RandomHash";
        String actual = Md5Crypt.md5Crypt(keyBytes, random);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testApr1Crypt_zkhl0_fid2() {
        byte[] keyBytes = new byte[]{0x01, 0x02, 0x03};
        Random random = new Random();
        String result = Md5Crypt.apr1Crypt(keyBytes, random);
        assertEquals("expectedResult", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testApr1CryptWithSalt_lEFI0_fid2() {
        String key = "password";
        String salt = "salt";
        String expected = "$apr1$salt$5.X.Y/YU.755";
        String actual = Md5Crypt.apr1Crypt(key.getBytes(), salt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testApr1CryptWithLongPassword_ueNj2_fid2() {
        String key = "ThisIsAVeryLongPasswordThatExceedsTheStandardLimit";
        String salt = "salt";
        String expected = "$apr1$salt$5.X.Y/YU.755";
        String actual = Md5Crypt.apr1Crypt(key.getBytes(), salt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testApr1Crypt_GSld0_fid2() {
        String keyBytes = "password";
        String salt = "salt";
        String expected = "$apr1$salt$4X.Y/g.S6Z7";
        String actual = Md5Crypt.apr1Crypt(keyBytes, salt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testApr1Crypt_mjPa0_fid2() {
        String key = "password";
        String expected = "$apr1$5n.Yk4z6$5.547714465.57714465.";
        String actual = Md5Crypt.apr1Crypt(key);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testApr1CryptWithEmpty_XQJG2_fid2() {
        String key = "";
        String expected = "$apr1$5n.Yk4z6$5.547714465.57714465.";
        String actual = Md5Crypt.apr1Crypt(key);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testApr1CryptWithCoverage_AEDH3() {
        String key = "password";
        String expected = "$apr1$5n.Yk4z6$5.547714465.57714465.";
        String actual = Md5Crypt.apr1Crypt(key);
        Assertions.assertEquals(expected, actual);
        key = null;
        expected = null;
        actual = Md5Crypt.apr1Crypt(key);
        Assertions.assertEquals(expected, actual);
        key = "";
        expected = "$apr1$5n.Yk4z6$5.547714465.57714465.";
        actual = Md5Crypt.apr1Crypt(key);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMd5CryptWithEmptySalt_AzoB5() {
        String result = Md5Crypt.md5Crypt("key".getBytes(), "", "$1$", new Random());
        Assertions.assertTrue(result.startsWith("$1$"));
        Assertions.assertTrue(result.length() == 34);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMd5CryptWithSalt_hQJp6() {
        String result = Md5Crypt.md5Crypt("key".getBytes(), "salt", "$1$", new Random());
        Assertions.assertTrue(result.startsWith("$1$salt"));
        Assertions.assertTrue(result.length() == 34);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMd5CryptWithNullRandom_xakv11() {
        String result = Md5Crypt.md5Crypt("key".getBytes(), "salt", "$1$", null);
        Assertions.assertTrue(result.startsWith("$1$salt"));
        Assertions.assertTrue(result.length() == 34);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMd5Crypt_kJkO0_fid2() {
        byte[] keyBytes = new byte[]{0x01, 0x02, 0x03};
        String expected = "$1$RandomSalt$RandomHash";
        String actual = Md5Crypt.md5Crypt(keyBytes);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMd5CryptWithSalt_UCZQ1_fid2() {
        byte[] keyBytes = new byte[]{0x01, 0x02, 0x03};
        String salt = "$1$RandomSalt$";
        String expected = "$1$RandomSalt$RandomHash";
        String actual = Md5Crypt.md5Crypt(keyBytes, salt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMd5CryptWithLongSalt_JPRz2_fid2() {
        byte[] keyBytes = new byte[]{0x01, 0x02, 0x03};
        String salt = "$1$RandomSalt$RandomSalt$";
        String expected = "$1$RandomSalt$RandomSalt$RandomHash";
        String actual = Md5Crypt.md5Crypt(keyBytes, salt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMd5CryptWithShortSalt_LRTt3_fid2() {
        byte[] keyBytes = new byte[]{0x01, 0x02, 0x03};
        String salt = "$1$RandomSalt";
        String expected = "$1$RandomSalt$RandomHash";
        String actual = Md5Crypt.md5Crypt(keyBytes, salt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMd5CryptWithNullSalt_rawT6_fid2() {
        byte[] keyBytes = new byte[]{0x01, 0x02, 0x03};
        String salt = null;
        String expected = "$1$RandomSalt$RandomHash";
        String actual = Md5Crypt.md5Crypt(keyBytes, salt);
        assertEquals(expected, actual);
    }
}