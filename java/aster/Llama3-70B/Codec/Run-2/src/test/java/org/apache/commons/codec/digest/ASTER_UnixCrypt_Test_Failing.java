/**
 * Generated by Aster
 */
package org.apache.commons.codec.digest;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_UnixCrypt_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCryptInvalidSalt_TobZ1() {
    UnixCrypt unixCrypt = new UnixCrypt();
    byte[] original = new byte[] { 1, 2, 3, 4, 5, 6, 7, 8 };
    String salt = "invalid";
    try {
        UnixCrypt.crypt(original, salt);
        assert false;
    } catch (IllegalArgumentException e) {
        assert true;
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCryptInvalidSalt_BMBQ1_fid1() {
    UnixCrypt unixCrypt = new UnixCrypt();
    byte[] original = "original".getBytes();
    try {
        UnixCrypt.crypt(original, "invalid");
        fail();
    } catch (IllegalArgumentException e) {
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCryptNullSalt_BnCd0_fid1() {
    UnixCrypt unixCrypt = new UnixCrypt();
    byte[] original = new byte[] { 1, 2, 3, 4, 5, 6, 7, 8 };
    String result = UnixCrypt.crypt(original, null);
    assertEquals("11", result.substring(0, 2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCryptInvalidSalt_TobZ1_fid1() {
    UnixCrypt unixCrypt = new UnixCrypt();
    byte[] original = new byte[] { 1, 2, 3, 4, 5, 6, 7, 8 };
    try {
        UnixCrypt.crypt(original, "invalid");
        fail("Expected IllegalArgumentException");
    } catch (IllegalArgumentException e) {
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCryptInvalidSalt_NkLO1_fid1() {
    UnixCrypt unixCrypt = new UnixCrypt();
    byte[] original = new byte[] { 1, 2, 3, 4, 5, 6, 7, 8 };
    try {
        UnixCrypt.crypt(original, "invalid");
        fail();
    } catch (IllegalArgumentException e) {
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCryptInvalidSalt_pxcl2_fid1() {
    UnixCrypt unixCrypt = new UnixCrypt();
    byte[] original = new byte[] {1, 2, 3, 4, 5, 6, 7, 8};
    String salt = "abc";
    try {
        UnixCrypt.crypt(original, salt);
        fail("Expected IllegalArgumentException");
    } catch (IllegalArgumentException e) {
    }
}
}