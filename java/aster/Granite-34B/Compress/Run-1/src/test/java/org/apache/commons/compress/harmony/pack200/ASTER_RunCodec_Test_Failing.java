/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.pack200;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_RunCodec_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBCodec_Rubj0() throws Pack200Exception {
        BHSDCodec bHSDCodec1 = new BHSDCodec(1, 2);
        BHSDCodec bHSDCodec2 = new BHSDCodec(1, 2, 3, 4);
        BHSDCodec bHSDCodec3 = new BHSDCodec(1, 2, 3);
        RunCodec runCodec = new RunCodec(1, bHSDCodec1, bHSDCodec2);
        assertEquals(bHSDCodec2, runCodec.getBCodec());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_BNNB0() throws Pack200Exception {
        BHSDCodec aCodec = new BHSDCodec(1, 2);
        BHSDCodec bCodec = new BHSDCodec(3, 4);
        RunCodec runCodec = new RunCodec(5, aCodec, bCodec);
        byte[] expected = new byte[]{6, 7};
        byte[] actual = runCodec.encode(8, 9);
        assertArrayEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncode_zRVs0() throws Pack200Exception {
    RunCodec runCodec = new RunCodec(1, new BHSDCodec(2, 3), new BHSDCodec(4, 5));
    byte[] result = runCodec.encode(6);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncode2_EhGs1() throws Pack200Exception {
    RunCodec runCodec = new RunCodec(7, new BHSDCodec(8, 9, 10, 11), new BHSDCodec(12, 13, 14));
    byte[] result = runCodec.encode(15);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncode3_PBnK2() throws Pack200Exception {
    RunCodec runCodec = new RunCodec(16, new BHSDCodec(17, 18, 19), new BHSDCodec(20, 21));
    byte[] result = runCodec.encode(22);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetK_dtlz0() throws Pack200Exception {
        BHSDCodec aCodec = new BHSDCodec(1, 2);
        BHSDCodec bCodec = new BHSDCodec(3, 4);
        RunCodec runCodec = new RunCodec(5, aCodec, bCodec);
        assertEquals(5, runCodec.getK());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetKWithFullCoverage_dBBF1() throws Pack200Exception {
        BHSDCodec aCodec = new BHSDCodec(1, 2, 3, 4);
        BHSDCodec bCodec = new BHSDCodec(5, 6, 7);
        RunCodec runCodec = new RunCodec(8, aCodec, bCodec);
        assertEquals(8, runCodec.getK());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncode2_EhGs1_fid1() throws Pack200Exception {
    RunCodec runCodec = new RunCodec(7, new BHSDCodec(8, 9, 10, 11), new BHSDCodec(12, 13, 14));
    byte[] result = runCodec.encode(15);
    byte[] expected = {1, 2, 3, 4, 5}; // Replace with the expected result
    assertNotEquals(expected, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncode3_PBnK2_fid1() throws Pack200Exception {
    RunCodec runCodec = new RunCodec(16, new BHSDCodec(17, 18, 19), new BHSDCodec(20, 21));
    byte[] result = runCodec.encode(22);
    byte[] expected = {1, 2, 3, 4, 5}; // Replace with the expected result
    assertArrayEquals(expected, result);
}
}