/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.impl.session2direct;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_DirectSLSBBean_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testInvestmentReturn_HWSC0() throws java.lang.Exception {
		DirectSLSBBean directSLSBBean = new DirectSLSBBean();
		try {
			double rnd1 = 0.0;
			double rnd2 = 0.0;
			double investmentReturn = directSLSBBean.investmentReturn(rnd1, rnd2);
			fail("Expected UnsupportedOperationException to be thrown");
		} catch (UnsupportedOperationException e) {
		}
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void tearDown_SpPl1() throws Exception {
    }
}