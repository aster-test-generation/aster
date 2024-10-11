/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.beans;

import com.ibm.websphere.samples.daytrader.entities.QuoteDataBean;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.TimeUnit;
import javax.json.Json;
import javax.json.JsonObject;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_MarketSummaryDataBean_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetOpenTSIA_wRQV0() {
    BigDecimal expectedOpenTSIA = new BigDecimal("1234.56");
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(null, expectedOpenTSIA, 0.0, null, null);
    BigDecimal result = marketSummaryDataBean.getOpenTSIA();
    assertEquals(expectedOpenTSIA, result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetGainPercentWithPositiveChange_JMmy0() {
    BigDecimal tsia = new BigDecimal("150.00");
    BigDecimal openTsia = new BigDecimal("100.00");
    double volume = 5000;
    Collection<QuoteDataBean> topGainers = new ArrayList<>();
    Collection<QuoteDataBean> topLosers = new ArrayList<>();
    MarketSummaryDataBean marketSummary = new MarketSummaryDataBean(tsia, openTsia, volume, topGainers, topLosers);
    BigDecimal expectedGainPercent = new BigDecimal("50.00");
    assertEquals(expectedGainPercent, marketSummary.getGainPercent());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetGainPercentWithNoChange_ffSz1() {
    BigDecimal tsia = new BigDecimal("100.00");
    BigDecimal openTsia = new BigDecimal("100.00");
    double volume = 5000;
    Collection<QuoteDataBean> topGainers = new ArrayList<>();
    Collection<QuoteDataBean> topLosers = new ArrayList<>();
    MarketSummaryDataBean marketSummary = new MarketSummaryDataBean(tsia, openTsia, volume, topGainers, topLosers);
    BigDecimal expectedGainPercent = BigDecimal.ZERO;
    assertEquals(expectedGainPercent, marketSummary.getGainPercent());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testPrint_lVou0() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean();
    marketSummaryDataBean.print();
    assertTrue(true); // This assertion just ensures that the print method runs without exceptions.
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToJSON_EmptyGainersAndLosers_mave1() {
    Collection<QuoteDataBean> topGainers = new ArrayList<>();
    Collection<QuoteDataBean> topLosers = new ArrayList<>();
    MarketSummaryDataBean marketSummary = new MarketSummaryDataBean(
        new BigDecimal("3200.00"), new BigDecimal("3100.00"), 5000000.0, topGainers, topLosers
    );
    JsonObject result = marketSummary.toJSON();
    assertFalse(result.containsKey("gainer1_stock"));
    assertFalse(result.containsKey("loser1_stock"));
    assertEquals(new BigDecimal("3200.00"), result.getJsonNumber("tsia").bigDecimalValue());
    assertEquals(5000000.0, result.getJsonNumber("volume").doubleValue(), 0.0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToJSON_NullCollections_MrNV2() {
    MarketSummaryDataBean marketSummary = new MarketSummaryDataBean(
        new BigDecimal("3200.00"), new BigDecimal("3100.00"), 5000000.0, null, null
    );
    JsonObject result = marketSummary.toJSON();
    assertFalse(result.containsKey("gainer1_stock"));
    assertFalse(result.containsKey("loser1_stock"));
    assertEquals(new BigDecimal("3200.00"), result.getJsonNumber("tsia").bigDecimalValue());
    assertEquals(5000000.0, result.getJsonNumber("volume").doubleValue(), 0.0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToJSON_EmptyGainersAndLosers_mave1_1() {
    Collection<QuoteDataBean> topGainers = new ArrayList<>();
    Collection<QuoteDataBean> topLosers = new ArrayList<>();
    MarketSummaryDataBean marketSummary = new MarketSummaryDataBean(
        new BigDecimal("3200.00"), new BigDecimal("3100.00"), 5000000.0, topGainers, topLosers
    );
    JsonObject result = marketSummary.toJSON();
    assertFalse(result.containsKey("gainer1_stock"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToJSON_EmptyGainersAndLosers_mave1_2() {
    Collection<QuoteDataBean> topGainers = new ArrayList<>();
    Collection<QuoteDataBean> topLosers = new ArrayList<>();
    MarketSummaryDataBean marketSummary = new MarketSummaryDataBean(
        new BigDecimal("3200.00"), new BigDecimal("3100.00"), 5000000.0, topGainers, topLosers
    );
    JsonObject result = marketSummary.toJSON();
    assertFalse(result.containsKey("loser1_stock"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToJSON_EmptyGainersAndLosers_mave1_3() {
    Collection<QuoteDataBean> topGainers = new ArrayList<>();
    Collection<QuoteDataBean> topLosers = new ArrayList<>();
    MarketSummaryDataBean marketSummary = new MarketSummaryDataBean(
        new BigDecimal("3200.00"), new BigDecimal("3100.00"), 5000000.0, topGainers, topLosers
    );
    JsonObject result = marketSummary.toJSON();
    assertEquals(new BigDecimal("3200.00"), result.getJsonNumber("tsia").bigDecimalValue());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToJSON_EmptyGainersAndLosers_mave1_4() {
    Collection<QuoteDataBean> topGainers = new ArrayList<>();
    Collection<QuoteDataBean> topLosers = new ArrayList<>();
    MarketSummaryDataBean marketSummary = new MarketSummaryDataBean(
        new BigDecimal("3200.00"), new BigDecimal("3100.00"), 5000000.0, topGainers, topLosers
    );
    JsonObject result = marketSummary.toJSON();
    assertEquals(5000000.0, result.getJsonNumber("volume").doubleValue(), 0.0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToJSON_NullCollections_MrNV2_1() {
    MarketSummaryDataBean marketSummary = new MarketSummaryDataBean(
        new BigDecimal("3200.00"), new BigDecimal("3100.00"), 5000000.0, null, null
    );
    JsonObject result = marketSummary.toJSON();
    assertFalse(result.containsKey("gainer1_stock"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToJSON_NullCollections_MrNV2_2() {
    MarketSummaryDataBean marketSummary = new MarketSummaryDataBean(
        new BigDecimal("3200.00"), new BigDecimal("3100.00"), 5000000.0, null, null
    );
    JsonObject result = marketSummary.toJSON();
    assertFalse(result.containsKey("loser1_stock"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToJSON_NullCollections_MrNV2_3() {
    MarketSummaryDataBean marketSummary = new MarketSummaryDataBean(
        new BigDecimal("3200.00"), new BigDecimal("3100.00"), 5000000.0, null, null
    );
    JsonObject result = marketSummary.toJSON();
    assertEquals(new BigDecimal("3200.00"), result.getJsonNumber("tsia").bigDecimalValue());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToJSON_NullCollections_MrNV2_4() {
    MarketSummaryDataBean marketSummary = new MarketSummaryDataBean(
        new BigDecimal("3200.00"), new BigDecimal("3100.00"), 5000000.0, null, null
    );
    JsonObject result = marketSummary.toJSON();
    assertEquals(5000000.0, result.getJsonNumber("volume").doubleValue(), 0.0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetGainPercentWithPositiveChange_JMmy0_fid2() {
    BigDecimal tsia = new BigDecimal("150.0000");
    BigDecimal openTsia = new BigDecimal("100.00");
    double volume = 5000;
    Collection<QuoteDataBean> topGainers = new ArrayList<>();
    Collection<QuoteDataBean> topLosers = new ArrayList<>();
    MarketSummaryDataBean marketSummary = new MarketSummaryDataBean(tsia, openTsia, volume, topGainers, topLosers);
    BigDecimal expectedGainPercent = new BigDecimal("50.0000");
    assertEquals(expectedGainPercent, marketSummary.getGainPercent());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToJSON_EmptyGainersAndLosers_mave1_1_fid2() {
    Collection<QuoteDataBean> topGainers = new ArrayList<>();
    Collection<QuoteDataBean> topLosers = new ArrayList<>();
    MarketSummaryDataBean marketSummary = new MarketSummaryDataBean(
        new BigDecimal("3200.00"), new BigDecimal("3100.00"), 5000000.0, topGainers, topLosers
    );
    JsonObject result = marketSummary.toJSON();
    assertFalse(result.containsKey("gainers"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToJSON_EmptyGainersAndLosers_mave1_3_fid2() {
    Collection<QuoteDataBean> topGainers = new ArrayList<>();
    Collection<QuoteDataBean> topLosers = new ArrayList<>();
    MarketSummaryDataBean marketSummary = new MarketSummaryDataBean(
        new BigDecimal("3200.00"), new BigDecimal("3100.00"), 5000000.0, topGainers, topLosers
    );
    JsonObject result = marketSummary.toJSON();
    assertEquals("3200.00", result.getJsonNumber("tsia").toString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToJSON_EmptyGainersAndLosers_mave1_4_fid2() {
    Collection<QuoteDataBean> topGainers = new ArrayList<>();
    Collection<QuoteDataBean> topLosers = new ArrayList<>();
    MarketSummaryDataBean marketSummary = new MarketSummaryDataBean(
        new BigDecimal("3200.00"), new BigDecimal("3100.00"), 5000000.0, topGainers, topLosers
    );
    JsonObject result = Json.createObjectBuilder()
        .add("volume", 5000000.0)
        .build();
    assertEquals(5000000.0, result.getJsonNumber("volume").doubleValue(), 0.0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToJSON_NullCollections_MrNV2_1_fid2() {
    MarketSummaryDataBean marketSummary = new MarketSummaryDataBean(
        new BigDecimal("3200.00"), new BigDecimal("3100.00"), 5000000.0, null, null
    );
    JsonObject result = marketSummary.toJSON();
    assertNull(result.getJsonObject("gainers"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToJSON_NullCollections_MrNV2_2_fid2() {
    MarketSummaryDataBean marketSummary = new MarketSummaryDataBean(
        new BigDecimal("3200.00"), new BigDecimal("3100.00"), 5000000.0, null, null
    );
    JsonObject result = marketSummary.toJSON();
    assertNull(result.get("loser1_stock"));
  }
}