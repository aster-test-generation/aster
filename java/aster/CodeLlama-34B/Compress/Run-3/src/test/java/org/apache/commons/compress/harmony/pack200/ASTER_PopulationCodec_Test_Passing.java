/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.pack200;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_PopulationCodec_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetFavouredWithNull_faMH1() {
    RunCodec favouredCodec = null;
    RunCodec unfavouredCodec = null;
    PopulationCodec populationCodec = new PopulationCodec(favouredCodec, 5, unfavouredCodec);
    int[] favoured = populationCodec.getFavoured();
    assertNull(favoured);
}
}