/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.pack200;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_PopulationCodec_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncode_Cpsr0() throws Pack200Exception {
    BHSDCodec bHSDCodec = new BHSDCodec(1, 2);
    BHSDCodec bHSDCodec1 = new BHSDCodec(1, 2, 3, 4);
    BHSDCodec bHSDCodec2 = new BHSDCodec(1, 2, 3);
    RunCodec runCodec = new RunCodec(1, bHSDCodec, bHSDCodec1);
    RunCodec runCodec1 = new RunCodec(1, bHSDCodec2, bHSDCodec1);
    PopulationCodec populationCodec = new PopulationCodec(runCodec, 1, runCodec1);
    int[] favoured = {1, 2, 3};
    int[] tokens = {4, 5, 6};
    int[] unfavoured = {7, 8, 9};
    byte[] expected = new byte[15];
    byte[] actual = populationCodec.encode(favoured, tokens, unfavoured);
    assertArrayEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetUnfavouredCodec_fkMU0() throws Exception {
        PopulationCodec populationCodec = new PopulationCodec(new RunCodec(1, new BHSDCodec(1, 1), new BHSDCodec(1, 1)), 1, new RunCodec(1, new BHSDCodec(1, 1), new BHSDCodec(1, 1)));
        Codec unfavouredCodec = populationCodec.getUnfavouredCodec();
        assertNotNull(unfavouredCodec);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_PtSt0() throws Exception {
        PopulationCodec codec = new PopulationCodec(new RunCodec(1, new BHSDCodec(1, 1), new BHSDCodec(1, 1)), 1, new RunCodec(1, new BHSDCodec(1, 1), new BHSDCodec(1, 1)));
        byte[] result = codec.encode(1, 1);
        assertNotNull(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFavoured_tpLp0() throws Exception {
        PopulationCodec populationCodec = new PopulationCodec(new RunCodec(0, new BHSDCodec(0, 0), new BHSDCodec(0, 0)), 0, new RunCodec(0, new BHSDCodec(0, 0), new BHSDCodec(0, 0)));
        int[] favoured = populationCodec.getFavoured();
        assertNotNull(favoured);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_CkLB0() throws Pack200Exception {
        PopulationCodec codec = new PopulationCodec(new RunCodec(1, new BHSDCodec(1, 1), new BHSDCodec(1, 1)), 1, new RunCodec(1, new BHSDCodec(1, 1), new BHSDCodec(1, 1)));
        byte[] result = codec.encode(1);
        assertEquals(0, result.length);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetTokenCodec_ZVSu0() throws Exception {
    PopulationCodec populationCodec = new PopulationCodec(new RunCodec(1, new BHSDCodec(1, 1), new BHSDCodec(1, 1)), 1, new RunCodec(1, new BHSDCodec(1, 1), new BHSDCodec(1, 1)));
    Codec tokenCodec = populationCodec.getTokenCodec();
    assertNotNull(tokenCodec);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetFavouredCodec_mTwP0() throws Exception {
    PopulationCodec populationCodec = new PopulationCodec(new RunCodec(1, new BHSDCodec(1, 1), new BHSDCodec(1, 1)), 1, new RunCodec(1, new BHSDCodec(1, 1), new BHSDCodec(1, 1)));
    Codec favouredCodec = populationCodec.getFavouredCodec();
    assertNotNull(favouredCodec);
}
}