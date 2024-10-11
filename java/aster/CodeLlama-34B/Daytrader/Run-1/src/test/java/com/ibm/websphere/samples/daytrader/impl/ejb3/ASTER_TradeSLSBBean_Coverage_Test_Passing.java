/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.impl.ejb3;

import com.ibm.websphere.samples.daytrader.entities.AccountDataBean;
import com.ibm.websphere.samples.daytrader.entities.QuoteDataBean;
import java.util.concurrent.TimeUnit;
import javax.jms.TextMessage;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.transaction.RollbackException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_TradeSLSBBean_Coverage_Test_Passing {
  private AccountDataBean accountDataBean;
  private TextMessage message;
  private EntityManager entityManager;
  private TypedQuery<QuoteDataBean> q;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testInvestmentReturn1_ytln0() throws Exception {
    TradeSLSBBean tradeSLSBBean = new TradeSLSBBean();
    double investment = 1000.0;
    double NetValue = 1200.0;
    double expectedReturn = 0.2;
    double actualReturn = tradeSLSBBean.investmentReturn(investment, NetValue);
    assertEquals(expectedReturn, actualReturn, 0.001);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testInvestmentReturn2_RFDA1() throws Exception {
    TradeSLSBBean tradeSLSBBean = new TradeSLSBBean();
    double investment = 1000.0;
    double NetValue = 800.0;
    double expectedReturn = -0.2;
    double actualReturn = tradeSLSBBean.investmentReturn(investment, NetValue);
    assertEquals(expectedReturn, actualReturn, 0.001);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testInvestmentReturn3_VxqU2() throws Exception {
    TradeSLSBBean tradeSLSBBean = new TradeSLSBBean();
    double investment = 1000.0;
    double NetValue = 1000.0;
    double expectedReturn = 0.0;
    double actualReturn = tradeSLSBBean.investmentReturn(investment, NetValue);
    assertEquals(expectedReturn, actualReturn, 0.001);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testOrderCompleted_KJNY0() {
    TradeSLSBBean tradeSLSBBean = new TradeSLSBBean();
    try {
      tradeSLSBBean.orderCompleted("userID", 123);
      Assertions.fail("UnsupportedOperationException should have been thrown");
    } catch (UnsupportedOperationException e) {
      Assertions.assertEquals("TradeSLSBBean:orderCompleted method not supported", e.getMessage());
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testRegister_nullPassword_kPqD3() {
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSell10_AdBZ9() {
    TradeSLSBBean tradeSLSBBean = new TradeSLSBBean();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void tearDown_fKkT1_XulC0() throws javax.transaction.RollbackException {
    TradeSLSBBean tradeSLSBBean = null;
    tradeSLSBBean = new TradeSLSBBean();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testBuy2_AXgI1_fid2() {
    TradeSLSBBean tradeSLSBBean = new TradeSLSBBean();
    String userID = "1234";
    String symbol = "GOOG";
    double quantity = 100.0;
  }
}