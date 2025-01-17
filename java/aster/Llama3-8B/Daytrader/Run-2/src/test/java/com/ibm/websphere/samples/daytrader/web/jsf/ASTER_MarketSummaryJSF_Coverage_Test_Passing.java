/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.jsf;
import com.ibm.websphere.samples.daytrader.beans.MarketSummaryDataBean;
import com.ibm.websphere.samples.daytrader.entities.QuoteDataBean;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import java.util.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_MarketSummaryJSF_Coverage_Test_Passing {
private QuoteData[] convertCollectionToArray(Collection<QuoteDataBean> collection) {
    QuoteData[] array = new QuoteData[collection.size()];
    int i = 0;
    for (QuoteDataBean bean : collection) {
        array[i++] = new QuoteData(bean.getPrice(), bean.getOpen(), bean.getSymbol());
    }
    return array;
}
private List<QuoteData> convertIteratorToList(Iterator<QuoteDataBean> iterator) {
    List<QuoteData> list = new ArrayList<>();
    while (iterator.hasNext()) {
        QuoteDataBean bean = iterator.next();
        QuoteData quoteData = new QuoteData(bean.getPrice(), bean.getOpen(), bean.getSymbol());
        list.add(quoteData);
    }
    return list;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMarketSummary_FcEd0() {
        MarketSummaryJSF marketSummaryJSF = new MarketSummaryJSF(null);
        marketSummaryJSF.getMarketSummary();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMarketSummaryException_MsIJ1() {
        MarketSummaryJSF marketSummaryJSF = new MarketSummaryJSF(null);
        try {
            marketSummaryJSF.getMarketSummary();
            fail("Expected exception");
        } catch (Exception e) {
        }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMarketSummaryVolume_lCIA4() {
        MarketSummaryJSF marketSummaryJSF = new MarketSummaryJSF(null);
        MarketSummaryDataBean marketSummaryData = new MarketSummaryDataBean();
        marketSummaryData.setVolume(100);
        marketSummaryJSF.setVolume(marketSummaryData.getVolume());
        assertEquals(100, marketSummaryJSF.getVolume());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetMarketSummarySummaryDate_Ylme2_vdXx0() {
    MarketSummaryJSF marketSummaryJSF = new MarketSummaryJSF(null);
    Date summaryDate = new Date(122, 0, 1); // 2022-01-01
    marketSummaryJSF.setSummaryDate(summaryDate);
    assertEquals(summaryDate, marketSummaryJSF.getSummaryDate());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetMarketSummaryTSIA_WSWQ3_rJeP0() {
    MarketSummaryJSF marketSummaryJSF = new MarketSummaryJSF(null);
    MarketSummaryDataBean marketSummaryData = new MarketSummaryDataBean();
    marketSummaryJSF.setTSIA(marketSummaryData.getTSIA());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetMarketSummaryTopGainersCount_TnYn8_KAtV0() {
    MarketSummaryJSF marketSummaryJSF = new MarketSummaryJSF(null);
    MarketSummaryDataBean marketSummaryData = new MarketSummaryDataBean();
    List<QuoteDataBean> topGainers = new ArrayList<>();
    marketSummaryData.setTopGainers(topGainers);
    QuoteData[] quoteDataArray = new QuoteData[0];
    marketSummaryJSF.setTopGainers(quoteDataArray);
    assertEquals(0, marketSummaryJSF.getTopGainers().length);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetMarketSummaryTopGainers_nmBW6_ecsS0_1() {
    MarketSummaryJSF marketSummaryJSF = new MarketSummaryJSF(null);
    MarketSummaryDataBean marketSummaryData = new MarketSummaryDataBean();
    List<QuoteDataBean> topGainers = new ArrayList<>();
    marketSummaryData.setTopGainers(topGainers);
    QuoteData[] array = convertCollectionToArray(topGainers);
    marketSummaryJSF.setTopGainers(array);
    for (int i = 0; i < topGainers.size(); i++) {
        QuoteDataBean bean = topGainers.get(i);
        QuoteData quoteData = marketSummaryJSF.getTopGainers()[i];
    }
    assertEquals(topGainers.size(), marketSummaryJSF.getTopGainers().length);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetMarketSummaryTopGainersQuoteData_Duqx9_SQRt0() {
    MarketSummaryJSF marketSummaryJSF = new MarketSummaryJSF(null);
    MarketSummaryDataBean marketSummaryData = new MarketSummaryDataBean();
    List<QuoteDataBean> topGainers = new ArrayList<>();
    QuoteDataBean quote = new QuoteDataBean();
    topGainers.add(quote);
    marketSummaryData.setTopGainers(topGainers);
    QuoteData[] gainerjsfs = new QuoteData[1];
    for (int i = 0; i < topGainers.size(); i++) {
        QuoteDataBean quoteDataBean = topGainers.get(i);
        QuoteData r = new QuoteData(quoteDataBean.getPrice(), quoteDataBean.getOpen(), quoteDataBean.getSymbol());
        gainerjsfs[i] = r;
    }
    marketSummaryJSF.setTopGainers(gainerjsfs);
    assertEquals(1, ((QuoteData[]) marketSummaryJSF.getTopGainers()).length);
}
}