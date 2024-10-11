/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.zip;
import org.apache.commons.compress.utils.ByteUtils;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_X7875_NewUnix_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsSameObject_qTFf0() {
    X7875_NewUnix obj1 = new X7875_NewUnix();
    X7875_NewUnix obj2 = obj1;
    boolean result = obj1.equals(obj2);
    assert result;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsDifferentClass_FrTK1() {
    X7875_NewUnix obj1 = new X7875_NewUnix();
    Object obj2 = new Object();
    boolean result = obj1.equals(obj2);
    assert !result;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCentralDirectoryData_fvTD0() {
        X7875_NewUnix x7875_NewUnix = new X7875_NewUnix();
        byte[] result = x7875_NewUnix.getCentralDirectoryData();
        byte[] expected = ByteUtils.EMPTY_BYTE_ARRAY;
        assertArrayEquals(expected, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testClone_XKJg0() throws CloneNotSupportedException {
        X7875_NewUnix obj = new X7875_NewUnix();
        Object clone = obj.clone();
        assert clone instanceof X7875_NewUnix;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testTrimLeadingZeroesForceMinLengthNullInput_IBui0() {
        byte[] result = X7875_NewUnix.trimLeadingZeroesForceMinLength(null);
        assertArrayEquals(null, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testTrimLeadingZeroesForceMinLengthSingleZero_pKDA2() {
        byte[] array = new byte[] {0};
        byte[] result = X7875_NewUnix.trimLeadingZeroesForceMinLength(array);
        assertArrayEquals(new byte[] {0}, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testTrimLeadingZeroesForceMinLengthMultipleZeros_tsQd3() {
        byte[] array = new byte[] {0, 0, 0, 1, 2, 3};
        byte[] result = X7875_NewUnix.trimLeadingZeroesForceMinLength(array);
        assertArrayEquals(new byte[] {1, 2, 3}, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryLength_SylF0_XpvA0() {
    X7875_NewUnix x7875_NewUnix = new X7875_NewUnix();
    ZipShort result = x7875_NewUnix.getCentralDirectoryLength();
    assertEquals(ZipShort.ZERO, result);
}
}