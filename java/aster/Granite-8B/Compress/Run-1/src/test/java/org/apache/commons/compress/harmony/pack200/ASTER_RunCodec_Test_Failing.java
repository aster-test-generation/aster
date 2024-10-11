/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.pack200;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_RunCodec_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testEncode_LuoX0() throws Pack200Exception {
		BHSDCodec bHSDCodec = new BHSDCodec(1, 2);
		BHSDCodec bHSDCodec2 = new BHSDCodec(1, 2, 3, 4);
		BHSDCodec bHSDCodec3 = new BHSDCodec(1, 2, 3);
		RunCodec runCodec = new RunCodec(1, bHSDCodec, bHSDCodec2);
		byte[] actual = runCodec.encode(1, 2);
		byte[] expected = new byte[0];
		assertEquals(expected, actual);
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testgetACodec_omPN0_eRye0() {
		BHSDCodec bHSDCodec = new BHSDCodec(1, 2);
		BHSDCodec bHSDCodec2 = new BHSDCodec(1, 2, 3, 4);
		BHSDCodec bHSDCodec3 = new BHSDCodec(1, 2, 3);
		RunCodec runCodec = null;
		try {
			runCodec = new RunCodec(1, bHSDCodec, bHSDCodec2);
		} catch (Pack200Exception e) {
			e.printStackTrace();
		}
		Codec aCodec = runCodec.getACodec();
		assertNotNull(aCodec);
		assertEquals(bHSDCodec, aCodec);
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_tAzn0_Qgsa0() {
        BHSDCodec aCodec = new BHSDCodec(1, 2);
        BHSDCodec bCodec = new BHSDCodec(3, 4, 5, 6);
        RunCodec runCodec = null;
        try {
            runCodec = new RunCodec(7, aCodec, bCodec);
        } catch (Pack200Exception e) {
            e.printStackTrace();
        }
        String expected = "RunCodec[k=7;aCodec=BHSDCodec[b=1;h=2];bCodec=BHSDCodec[b=3;h=4;s=5;d=6]]";
        assertEquals(expected, runCodec.toString());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetK_nUwh0_NEIp0() {
        BHSDCodec bHSDCodec = new BHSDCodec(1, 1);
        BHSDCodec bHSDCodec1 = new BHSDCodec(1, 1, 1, 1);
        BHSDCodec bHSDCodec2 = new BHSDCodec(1, 1, 1);
        RunCodec runCodec = null;
        try {
            runCodec = new RunCodec(1, bHSDCodec, bHSDCodec1);
        } catch (Pack200Exception e) {
            e.printStackTrace();
        }
        int k = runCodec.getK();
        assertEquals(1, k);
    }
}