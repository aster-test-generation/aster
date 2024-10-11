/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.impl.direct;

import java.util.concurrent.TimeUnit;
import javax.transaction.UserTransaction;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_AsyncOrder_Coverage_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test1_kYiP0() {
    AsyncOrder asyncOrder = new AsyncOrder();
    asyncOrder.run();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test3_vVdt2() {
    AsyncOrder asyncOrder = new AsyncOrder();
    try {
      asyncOrder.ut.begin();
    } catch (Exception e) {
      try {
        asyncOrder.ut.rollback();
      } catch (Exception e1) {
        try {
          throw new Exception(e1);
        } catch (Exception e2) {
          e2.printStackTrace();
        }
      }
      try {
        throw new Exception(e);
      } catch (Exception e1) {
        e1.printStackTrace();
      }
    }
  }
}