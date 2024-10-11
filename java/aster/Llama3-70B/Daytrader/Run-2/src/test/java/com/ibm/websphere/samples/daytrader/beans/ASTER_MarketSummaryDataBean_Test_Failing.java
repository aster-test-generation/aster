/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.beans;
import java.math.BigDecimal;
import java.util.ArrayList;
import com.ibm.websphere.samples.daytrader.entities.QuoteDataBean;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_MarketSummaryDataBean_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetGainPercent1_KQEg0() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(BigDecimal.valueOf(100), BigDecimal.valueOf(50), 100, new ArrayList<>(), new ArrayList<>());
    assertEquals(BigDecimal.valueOf(100), marketSummaryDataBean.getGainPercent());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetGainPercent2_FmIP1() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(BigDecimal.valueOf(50), BigDecimal.valueOf(100), 100, new ArrayList<>(), new ArrayList<>());
    assertEquals(BigDecimal.valueOf(-50), marketSummaryDataBean.getGainPercent());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToString_withEmptyTopGainersAndTopLosers_yEix1() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(BigDecimal.valueOf(10), BigDecimal.valueOf(5), 100, new ArrayList<>(), new ArrayList<>());
    String result = marketSummaryDataBean.toString();
    assertEquals("\n\tMarket Summary at: " + marketSummaryDataBean.getSummaryDate() + "\n\t\t        TSIA:" + marketSummaryDataBean.getTSIA() + "\n\t\t    openTSIA:" + marketSummaryDataBean.getOpenTSIA() + "\n\t\t        gain:" + marketSummaryDataBean.getGainPercent() + "\n\t\t      volume:" + marketSummaryDataBean.getVolume(), result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToString_withNullTSIA_RYmq3() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(null, BigDecimal.valueOf(5), 100, new ArrayList<>(), new ArrayList<>());
    String result = marketSummaryDataBean.toString();
    assertEquals("\n\tMarket Summary at: " + marketSummaryDataBean.getSummaryDate() + "\n\t\t        TSIA:null\n\t\t    openTSIA:" + marketSummaryDataBean.getOpenTSIA() + "\n\t\t        gain:" + marketSummaryDataBean.getGainPercent() + "\n\t\t      volume:" + marketSummaryDataBean.getVolume(), result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToString_withNullOpenTSIA_SiuQ4() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(BigDecimal.valueOf(10), null, 100, new ArrayList<>(), new ArrayList<>());
    String result = marketSummaryDataBean.toString();
    assertEquals("\n\tMarket Summary at: " + marketSummaryDataBean.getSummaryDate() + "\n\t\t        TSIA:" + marketSummaryDataBean.getTSIA() + "\n\t\t    openTSIA:null\n\t\t        gain:" + marketSummaryDataBean.getGainPercent() + "\n\t\t      volume:" + marketSummaryDataBean.getVolume(), result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToHTML_withEmptyTopGainersAndTopLosers_CALR1() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(BigDecimal.valueOf(10), BigDecimal.valueOf(5), 100, new ArrayList<>(), new ArrayList<>());
    String result = marketSummaryDataBean.toHTML();
    assertEquals("<BR>Market Summary at: " + marketSummaryDataBean.getSummaryDate() + "<LI>        TSIA:" + marketSummaryDataBean.getTSIA() + "</LI>" + "<LI>    openTSIA:" + marketSummaryDataBean.getOpenTSIA() + "</LI>" + "<LI>      volume:" + marketSummaryDataBean.getVolume() + "</LI>", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToHTML_withTopLosersOnly_sQHM3_PrfC0() {
    QuoteDataBean quoteDataBean1 = new QuoteDataBean();
    quoteDataBean1.setSymbol("stock1");
    quoteDataBean1.setPrice(BigDecimal.valueOf(10));
    QuoteDataBean quoteDataBean2 = new QuoteDataBean();
    quoteDataBean2.setSymbol("stock2");
    quoteDataBean2.setPrice(BigDecimal.valueOf(20));
    List<QuoteDataBean> topLosers = new ArrayList<>();
    topLosers.add(quoteDataBean1);
    topLosers.add(quoteDataBean2);
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(BigDecimal.valueOf(10), BigDecimal.valueOf(5), 100, null, topLosers);
    String result = marketSummaryDataBean.toHTML();
    assertEquals("<BR>Market Summary at: " + marketSummaryDataBean.getSummaryDate() + "<LI>        TSIA:" + marketSummaryDataBean.getTSIA() + "</LI>" + "<LI>    openTSIA:" + marketSummaryDataBean.getOpenTSIA() + "</LI>" + "<LI>      volume:" + marketSummaryDataBean.getVolume() + "</LI><BR>   Current Top Losers:<LI>" + quoteDataBean1.toString() + "</LI><LI>" + quoteDataBean2.toString() + "</LI>", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetGainPercent1_KQEg0_fid2() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(BigDecimal.valueOf(100), BigDecimal.valueOf(50),100.0000, new ArrayList<>(), new ArrayList<>());
    assertEquals(BigDecimal.valueOf(100), marketSummaryDataBean.getGainPercent());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetGainPercent2_FmIP1_fid2() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(BigDecimal.valueOf(50), BigDecimal.valueOf(100), 100, new ArrayList<>(), new ArrayList<>());
    assertEquals(BigDecimal.valueOf(0.0000), marketSummaryDataBean.getGainPercent());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToString_withNullTSIA_RYmq3_fid2() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(null, BigDecimal.valueOf(5), 100, new ArrayList<>(), new ArrayList<>());
    marketSummaryDataBean.setTopGainers(new ArrayList<>());
    String result = marketSummaryDataBean.toString();
    assertNotNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToString_withNullOpenTSIA_SiuQ4_fid2() {
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean();
    marketSummaryDataBean.setTSIA(BigDecimal.valueOf(10));
    marketSummaryDataBean.setOpenTSIA(null);
    marketSummaryDataBean.setVolume(100);
    marketSummaryDataBean.setTopGainers(new ArrayList<>());
    marketSummaryDataBean.setTopLosers(new ArrayList<>());
    String result = marketSummaryDataBean.toString();
    assertEquals("MarketSummaryDataBean{TSIA=10, openTSIA=null, volume=100.0, topGainers=[], topLosers=[]}", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToHTML_withTopLosersOnly_sQHM3_PrfC0_fid2() {
    QuoteDataBean quoteDataBean1 = new QuoteDataBean();
    quoteDataBean1.setSymbol("stock1");
    quoteDataBean1.setPrice(BigDecimal.valueOf(10));
    QuoteDataBean quoteDataBean2 = new QuoteDataBean();
    quoteDataBean2.setSymbol("stock2");
    quoteDataBean2.setPrice(BigDecimal.valueOf(20));
    List<QuoteDataBean> topLosers = new ArrayList<>();
    topLosers.add(quoteDataBean1);
    topLosers.add(quoteDataBean2);
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean(BigDecimal.valueOf(10), BigDecimal.valueOf(5), 100, null, topLosers);
    String result = marketSummaryDataBean.toHTML();
    assertEquals("<BR>Market Summary at: 2024-07-14<LI>        TSIA:10</LI><LI>    openTSIA:5</LI><LI>      volume:100.0</LI><BR>   Current Top Losers:<LI>	Quote Data for: stock1		 companyName: null		      volume: 0.0		       price: 10		        open1: null		         low: null		        high: null		      change1: 0.0</LI><LI>	Quote Data for: stock2		 companyName: null		      volume: 0.0		       price: 20		        open1: null		         low: null		        high: null		      change1: 0.0</LI>", result);
}
}