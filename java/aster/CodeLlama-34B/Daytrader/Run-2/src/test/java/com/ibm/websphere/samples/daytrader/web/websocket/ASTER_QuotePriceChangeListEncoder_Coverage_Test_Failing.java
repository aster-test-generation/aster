/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.websocket;

import java.util.concurrent.TimeUnit;
import javax.json.JsonObjectBuilder;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_QuotePriceChangeListEncoder_Coverage_Test_Failing {
  private JsonObjectBuilder jsonObjectBuilder;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDestroy_bYUC0() {
    QuotePriceChangeListEncoder encoder = new QuotePriceChangeListEncoder();
    encoder.destroy();
  }
}