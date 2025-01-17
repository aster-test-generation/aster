/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.impl.session2direct;

import com.ibm.websphere.samples.daytrader.util.TradeConfig;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_DirectSLSBBean_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testInvestmentReturnWithInvalidInput_DpvW3() throws Exception {
    DirectSLSBBean directSLSBBean = new DirectSLSBBean();
    double rnd1 = 10.0;
    double rnd2 = 20.0;
    try {
      directSLSBBean.investmentReturn(rnd1, rnd2);
      fail("Expected UnsupportedOperationException");
    } catch (UnsupportedOperationException e) {
      assertTrue(true);
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetImpl_jYoD0() {
    DirectSLSBBean directSLSBBean = new DirectSLSBBean();
    int result = directSLSBBean.getImpl();
    assertEquals(TradeConfig.SESSION_TO_DIRECT, result);
  }
}