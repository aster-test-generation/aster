/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.sevenz;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_Folder_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFindBindPairForInStream1_YgjC0() {
        Folder folder = new Folder();
        int result = folder.findBindPairForInStream(0);
        assert result == -1;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFindBindPairForInStream4_zNmP3() {
        Folder folder = new Folder();
        int result = folder.findBindPairForInStream(1);
        assert result == -1;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFindBindPairForOutStreamPositive_foTa0() {
        Folder folder = new Folder();
        int index =-1;
        int expected =-1;
        int actual = folder.findBindPairForOutStream(index);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFindBindPairForOutStreamNegative_apso1() {
        Folder folder = new Folder();
        int index = 1;
        int expected = -1;
        int actual = folder.findBindPairForOutStream(index);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFindBindPairForOutStreamNull_aRDX2() {
        Folder folder = new Folder();
        int index = 0;
        int expected = -1;
        int actual = folder.findBindPairForOutStream(index);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetUnpackSize_TotalOutputStreamsZero_iodG0() {
        Folder folder = new Folder();
        long result = folder.getUnpackSize();
        assert result == 0;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetUnpackSizeForCoderNullCoder_eUMj2_JmKY0() {
    Folder folder = new Folder();
    long result = folder.getUnpackSizeForCoder(null);
    org.junit.Assert.assertEquals(0L, result);
}
}