/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.websocket;

import com.ibm.websphere.samples.daytrader.entities.QuoteDataBean;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import javax.websocket.EncodeException;
import javax.websocket.EndpointConfig;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_QuotePriceChangeListEncoder_Coverage_Test_Failing {
  private EndpointConfig config;
  private QuotePriceChangeListEncoder encoder;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEncodeWithEmptyList_ONya1_1() throws javax.websocket.EncodeException {
    QuotePriceChangeListEncoder encoder = new QuotePriceChangeListEncoder();
    CopyOnWriteArrayList<QuoteDataBean> list = new CopyOnWriteArrayList<>();
    String encoded = encoder.encode(list);
    assertNotNull(encoded);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEncodeWithEmptyList_ONya1_2() throws javax.websocket.EncodeException {
    QuotePriceChangeListEncoder encoder = new QuotePriceChangeListEncoder();
    CopyOnWriteArrayList<QuoteDataBean> list = new CopyOnWriteArrayList<>();
    String encoded = encoder.encode(list);
    assertEquals("", encoded);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEncodeWithNullList_pOov2_1() throws javax.websocket.EncodeException {
    QuotePriceChangeListEncoder encoder = new QuotePriceChangeListEncoder();
    String encoded = encoder.encode(null);
    assertNotNull(encoded);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEncodeWithNullList_pOov2_2() throws javax.websocket.EncodeException {
    QuotePriceChangeListEncoder encoder = new QuotePriceChangeListEncoder();
    String encoded = encoder.encode(null);
    assertEquals("", encoded);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void setUp_zgdd0() {
    QuotePriceChangeListEncoder encoder = new QuotePriceChangeListEncoder();
    encoder.destroy();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void setUp_ajLN0() {
    encoder = new QuotePriceChangeListEncoder();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEncodeWithEmptyList_ONya1() throws javax.websocket.EncodeException {
    QuotePriceChangeListEncoder encoder = new QuotePriceChangeListEncoder();
    CopyOnWriteArrayList<QuoteDataBean> list = new CopyOnWriteArrayList<>();
    String encoded = encoder.encode(list);
    assertNotNull(encoded);
    assertEquals("", encoded);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEncodeWithNullList_pOov2() throws javax.websocket.EncodeException {
    QuotePriceChangeListEncoder encoder = new QuotePriceChangeListEncoder();
    String encoded = encoder.encode(null);
    assertNotNull(encoded);
    assertEquals("", encoded);
  }
}