/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.impl.ejb3;
import java.math.BigDecimal;
import com.ibm.websphere.samples.daytrader.beans.MarketSummaryDataBean;
import com.ibm.websphere.samples.daytrader.entities.QuoteDataBean;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Arrays;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_MarketSummarySingleton_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetMarketSummaryDataBean_HHzd0() {
    MarketSummarySingleton marketSummarySingleton = new MarketSummarySingleton();
    MarketSummaryDataBean marketSummaryDataBean = new MarketSummaryDataBean();
    marketSummaryDataBean.setTSIA(new BigDecimal("100"));
    marketSummaryDataBean.setOpenTSIA(new BigDecimal("200"));
    marketSummaryDataBean.setVolume(300);
    marketSummaryDataBean.setTopGainers(Arrays.asList(new QuoteDataBean()));
    marketSummaryDataBean.setTopLosers(Arrays.asList(new QuoteDataBean()));
    marketSummarySingleton.setMarketSummaryDataBean(marketSummaryDataBean);
    assertEquals(marketSummaryDataBean, marketSummarySingleton.getMarketSummaryDataBean());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetMarketSummaryDataBean_xqoI0() {
    MarketSummarySingleton marketSummarySingleton = new MarketSummarySingleton();
    MarketSummaryDataBean result = marketSummarySingleton.getMarketSummaryDataBean();
}
}