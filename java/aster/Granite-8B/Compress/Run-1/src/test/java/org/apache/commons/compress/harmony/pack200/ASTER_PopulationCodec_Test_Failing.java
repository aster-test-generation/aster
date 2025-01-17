/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.pack200;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_PopulationCodec_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncode_uxtq0() throws Pack200Exception {
    BHSDCodec bHSDCodec = new BHSDCodec(1, 2);
    BHSDCodec bHSDCodec1 = new BHSDCodec(1, 2, 3, 4);
    BHSDCodec bHSDCodec2 = new BHSDCodec(1, 2, 3);
    RunCodec runCodec = new RunCodec(1, bHSDCodec, bHSDCodec1);
    RunCodec runCodec1 = new RunCodec(1, bHSDCodec2, bHSDCodec);
    PopulationCodec populationCodec = new PopulationCodec(runCodec, 1, runCodec1);
    int[] favoured = {1, 2, 3};
    int[] tokens = {4, 5, 6};
    int[] unfavoured = {7, 8, 9};
    byte[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    byte[] actual = populationCodec.encode(favoured, tokens, unfavoured);
    assertArrayEquals(expected, actual);
}
}