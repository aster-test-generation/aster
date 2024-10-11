/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.beans;

import com.ibm.websphere.samples.daytrader.entities.QuoteDataBean;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_MarketSummaryDataBean_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetTopLosers_fNQt0() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean();
    Collection<QuoteDataBean> topLosers = new ArrayList<>();
    marketSummaryDataBean.setTopLosers(topLosers);
    assertEquals(topLosers, marketSummaryDataBean.getTopLosers());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetTopLosersWithNull_ekkt1() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean();
    marketSummaryDataBean.setTopLosers(null);
    assertNull(marketSummaryDataBean.getTopLosers());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetSummaryDate_OBmx0() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal(1000), new BigDecimal(1000), 1000, new ArrayList<QuoteDataBean>(), new ArrayList<QuoteDataBean>());
    Date summaryDate = marketSummaryDataBean.getSummaryDate();
    assertNotNull(summaryDate);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetSummaryDateWithNull_sOmv1() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(BigDecimal.ZERO, BigDecimal.ZERO, 0, null, null);
    Date summaryDate = marketSummaryDataBean.getSummaryDate();
    assertNotNull(summaryDate);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetOpenTSIA_jyGK0() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal(100), new BigDecimal(100), 100, new ArrayList<QuoteDataBean>(), new ArrayList<QuoteDataBean>());
    BigDecimal openTSIA = marketSummaryDataBean.getOpenTSIA();
    assertEquals(new BigDecimal(100), openTSIA);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetOpenTSIAWithDifferentValues_eLby1() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal(100), new BigDecimal(50), 100, new ArrayList<QuoteDataBean>(), new ArrayList<QuoteDataBean>());
    BigDecimal openTSIA = marketSummaryDataBean.getOpenTSIA();
    assertEquals(new BigDecimal(50), openTSIA);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetOpenTSIAWithEmptyValues_IHEJ3() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal(0), new BigDecimal(0), 100, new ArrayList<QuoteDataBean>(), new ArrayList<QuoteDataBean>());
    BigDecimal openTSIA = marketSummaryDataBean.getOpenTSIA();
    assertEquals(new BigDecimal(0), openTSIA);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTSIA_yTdF0() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal(1000), new BigDecimal(500), 1000, new ArrayList<QuoteDataBean>(), new ArrayList<QuoteDataBean>());
    BigDecimal TSIA = marketSummaryDataBean.getTSIA();
    assertEquals(new BigDecimal(1000), TSIA);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTSIAWithDifferentValues_EDPp1() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal(2000), new BigDecimal(1000), 2000, new ArrayList<QuoteDataBean>(), new ArrayList<QuoteDataBean>());
    BigDecimal TSIA = marketSummaryDataBean.getTSIA();
    assertEquals(new BigDecimal(2000), TSIA);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetSummaryDate_CqtY0() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean();
    Date summaryDate = new Date();
    marketSummaryDataBean.setSummaryDate(summaryDate);
    assertEquals(summaryDate, marketSummaryDataBean.getSummaryDate());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetSummaryDateWithNull_caDB1() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean();
    marketSummaryDataBean.setSummaryDate(null);
    assertNull(marketSummaryDataBean.getSummaryDate());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetSummaryDateWithDifferentDate_FMpY2() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean();
    Date summaryDate = new Date();
    marketSummaryDataBean.setSummaryDate(summaryDate);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetVolume_FalS0() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal(1000), new BigDecimal(500), 1000, null, null);
    assertEquals(1000, marketSummaryDataBean.getVolume(), 0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetVolumeWithZeroVolume_aqDe1() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal(1000), new BigDecimal(500), 0, null, null);
    assertEquals(0, marketSummaryDataBean.getVolume(), 0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetVolume_QkXc0() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal(100), new BigDecimal(100), 100, new ArrayList<QuoteDataBean>(), new ArrayList<QuoteDataBean>());
    marketSummaryDataBean.setVolume(100);
    assertEquals(100, marketSummaryDataBean.getVolume(), 0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetVolumeWithNegativeValue_vakN1() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal(100), new BigDecimal(100), 100, new ArrayList<QuoteDataBean>(), new ArrayList<QuoteDataBean>());
    marketSummaryDataBean.setVolume(-100);
    assertEquals(-100, marketSummaryDataBean.getVolume(), 0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetOpenTSIA_BrJc0() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean();
    BigDecimal openTSIA = new BigDecimal(1000000000);
    marketSummaryDataBean.setOpenTSIA(openTSIA);
    assertEquals(openTSIA, marketSummaryDataBean.getOpenTSIA());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetGainPercent_XKeB0() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal(100), new BigDecimal(50), 1000, new ArrayList<QuoteDataBean>(), new ArrayList<QuoteDataBean>());
    BigDecimal gainPercent = marketSummaryDataBean.getGainPercent();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetGainPercentWithZeroOpenTSIA_dogA1() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal(100), new BigDecimal(0), 1000, new ArrayList<QuoteDataBean>(), new ArrayList<QuoteDataBean>());
    BigDecimal gainPercent = marketSummaryDataBean.getGainPercent();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstance_lRmt0_1() {
    MarketSummaryDataBean marketSummaryDataBean = MarketSummaryDataBean.getRandomInstance();
    assertNotNull(marketSummaryDataBean);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstance_lRmt0_2() {
    MarketSummaryDataBean marketSummaryDataBean = MarketSummaryDataBean.getRandomInstance();
    assertNotNull(marketSummaryDataBean.getOpenTSIA());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstance_lRmt0_3() {
    MarketSummaryDataBean marketSummaryDataBean = MarketSummaryDataBean.getRandomInstance();
    assertNotNull(marketSummaryDataBean.getGainPercent());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstance_lRmt0_4() {
    MarketSummaryDataBean marketSummaryDataBean = MarketSummaryDataBean.getRandomInstance();
    assertNotNull(marketSummaryDataBean.getSummaryDate());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstance_lRmt0_5() {
    MarketSummaryDataBean marketSummaryDataBean = MarketSummaryDataBean.getRandomInstance();
    assertNotNull(marketSummaryDataBean.getTSIA());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstance_lRmt0_6() {
    MarketSummaryDataBean marketSummaryDataBean = MarketSummaryDataBean.getRandomInstance();
    assertNotNull(marketSummaryDataBean.getVolume());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstance_lRmt0_7() {
    MarketSummaryDataBean marketSummaryDataBean = MarketSummaryDataBean.getRandomInstance();
    assertNotNull(marketSummaryDataBean.getTopGainers());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstance_lRmt0_8() {
    MarketSummaryDataBean marketSummaryDataBean = MarketSummaryDataBean.getRandomInstance();
    assertNotNull(marketSummaryDataBean.getTopLosers());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstanceWithValidValues_bvHB2_14() {
    MarketSummaryDataBean marketSummaryDataBean = MarketSummaryDataBean.getRandomInstance();
    assertEquals(marketSummaryDataBean.getTopGainers().size(), 5);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstanceWithValidValues_bvHB2_15() {
    MarketSummaryDataBean marketSummaryDataBean = MarketSummaryDataBean.getRandomInstance();
    assertEquals(marketSummaryDataBean.getTopLosers().size(), 5);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToStringWithValidData_nUHW0() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal(100.0), new BigDecimal(90.0), 10000.0, null, null);
    String expected = "\n\tMarket Summary at: " + marketSummaryDataBean.getSummaryDate() + "\n\t\t        TSIA:" + marketSummaryDataBean.getTSIA() + "\n\t\t    openTSIA:" + marketSummaryDataBean.getOpenTSIA() + "\n\t\t        gain:" + marketSummaryDataBean.getGainPercent() + "\n\t\t      volume:" + marketSummaryDataBean.getVolume();
    assertEquals(expected, marketSummaryDataBean.toString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetTSIA_fLNW0() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(BigDecimal.ZERO, BigDecimal.ZERO, 0.0, new ArrayList<>(), new ArrayList<>());
    marketSummaryDataBean.setTSIA(BigDecimal.ONE);
    assertEquals(BigDecimal.ONE, marketSummaryDataBean.getTSIA());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetTSIAWithZero_fMTY1() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(BigDecimal.ZERO, BigDecimal.ZERO, 0.0, new ArrayList<>(), new ArrayList<>());
    marketSummaryDataBean.setTSIA(BigDecimal.ZERO);
    assertEquals(BigDecimal.ZERO, marketSummaryDataBean.getTSIA());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetTSIAWithNegative_obHX2() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(BigDecimal.ZERO, BigDecimal.ZERO, 0.0, new ArrayList<>(), new ArrayList<>());
    marketSummaryDataBean.setTSIA(BigDecimal.valueOf(-1));
    assertEquals(BigDecimal.valueOf(-1), marketSummaryDataBean.getTSIA());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetTSIAWithPositiveValue_jIuw4() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(BigDecimal.ZERO, BigDecimal.ZERO, 0.0, new ArrayList<>(), new ArrayList<>());
    marketSummaryDataBean.setTSIA(BigDecimal.valueOf(10));
    assertEquals(BigDecimal.valueOf(10), marketSummaryDataBean.getTSIA());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetTSIAWithNegativeValue_eThL5() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(BigDecimal.ZERO, BigDecimal.ZERO, 0.0, new ArrayList<>(), new ArrayList<>());
    marketSummaryDataBean.setTSIA(BigDecimal.valueOf(-10));
    assertEquals(BigDecimal.valueOf(-10), marketSummaryDataBean.getTSIA());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetTSIAWithNonMultipleOfTenValue_eilA6() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(BigDecimal.ZERO, BigDecimal.ZERO, 0.0, new ArrayList<>(), new ArrayList<>());
    marketSummaryDataBean.setTSIA(BigDecimal.valueOf(15));
    assertEquals(BigDecimal.valueOf(15), marketSummaryDataBean.getTSIA());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTopGainers_vrBq0_1() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal(1000), new BigDecimal(1000), 1000, new ArrayList<QuoteDataBean>(), new ArrayList<QuoteDataBean>());
    Collection<QuoteDataBean> topGainers = marketSummaryDataBean.getTopGainers();
    assertNotNull(topGainers);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTopGainers_vrBq0_2() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal(1000), new BigDecimal(1000), 1000, new ArrayList<QuoteDataBean>(), new ArrayList<QuoteDataBean>());
    Collection<QuoteDataBean> topGainers = marketSummaryDataBean.getTopGainers();
    assertEquals(0, topGainers.size());
  }

  @Test
  @Timeout(value = 0, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTopGainersWithGainers_aKJP1_2() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal(1000), new BigDecimal(1000), 0000, new ArrayList<QuoteDataBean>(), new ArrayList<QuoteDataBean>());
    Collection<QuoteDataBean> topGainers = marketSummaryDataBean.getTopGainers();
    assertEquals(1, topGainers.size());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTopGainersWithGainersAndLosers_cMVz4_2() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal(1000), new BigDecimal(1000), 1000, new ArrayList<QuoteDataBean>(), new ArrayList<QuoteDataBean>());
    Collection<QuoteDataBean> topGainers = marketSummaryDataBean.getTopGainers();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstance_lRmt0() {
    MarketSummaryDataBean marketSummaryDataBean = MarketSummaryDataBean.getRandomInstance();
    assertNotNull(marketSummaryDataBean);
    assertNotNull(marketSummaryDataBean.getOpenTSIA());
    assertNotNull(marketSummaryDataBean.getGainPercent());
    assertNotNull(marketSummaryDataBean.getSummaryDate());
    assertNotNull(marketSummaryDataBean.getTSIA());
    assertNotNull(marketSummaryDataBean.getVolume());
    assertNotNull(marketSummaryDataBean.getTopGainers());
    assertNotNull(marketSummaryDataBean.getTopLosers());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTopGainers_vrBq0() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal(1000), new BigDecimal(1000), 1000, new ArrayList<QuoteDataBean>(), new ArrayList<QuoteDataBean>());
    Collection<QuoteDataBean> topGainers = marketSummaryDataBean.getTopGainers();
    assertNotNull(topGainers);
    assertEquals(0, topGainers.size());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToHTML_pusH0() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(new BigDecimal(100), new BigDecimal(100), 100, null, null);
    String html = marketSummaryDataBean.toHTML();
    assertEquals("<BR>Market Summary at: " + marketSummaryDataBean.getSummaryDate() + "<LI>        TSIA:" + marketSummaryDataBean.getTSIA() + "</LI>" + "<LI>    openTSIA:" + marketSummaryDataBean.getOpenTSIA() + "</LI>" + "<LI>      volume:" + marketSummaryDataBean.getVolume() + "</LI>", html);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetTopGainersNull_oCio1() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean();
    marketSummaryDataBean.setTopGainers(null);
    assertNull(marketSummaryDataBean.getTopGainers());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetTopGainersEmpty_jIVS2() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean();
    Collection<QuoteDataBean> topGainers = new ArrayList<>();
    marketSummaryDataBean.setTopGainers(topGainers);
    assertEquals(0, marketSummaryDataBean.getTopGainers().size());
  }
}