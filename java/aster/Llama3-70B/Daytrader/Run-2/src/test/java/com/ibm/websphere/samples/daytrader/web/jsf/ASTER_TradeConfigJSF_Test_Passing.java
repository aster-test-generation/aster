/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.jsf;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.mockito.junit.jupiter.MockitoExtension;   
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_TradeConfigJSF_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetWebInterfaceList_LwtG0() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    String[] webInterfaceList = tradeConfigJSF.getWebInterfaceList();
    assertNotNull(webInterfaceList);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetResult_bhVy0() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    String result = tradeConfigJSF.getResult();
    assertNotNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetRuntimeModeList_imyX0() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    String[] runtimeModeList = tradeConfigJSF.getRuntimeModeList();
    assertNotNull(runtimeModeList);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetMarketSummaryInterval_TQJY0() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    int result = tradeConfigJSF.getMarketSummaryInterval();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetWebInterfaceList_eSeD0() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    String[] webInterfaceList = new String[] {"interface1", "interface2"};
    tradeConfigJSF.setWebInterfaceList(webInterfaceList);
    assertArrayEquals(webInterfaceList, tradeConfigJSF.getWebInterfaceList());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetRuntimeMode_vMXt0() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    String result = tradeConfigJSF.getRuntimeMode();
    assertNotNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetPrimIterations_Rrqq0() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    tradeConfigJSF.setPrimIterations(5);
    assertEquals(5, tradeConfigJSF.getPrimIterations());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPrimIterations_cMmx1() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    int result = tradeConfigJSF.getPrimIterations();
    assertEquals(1, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetMaxUsers_UeLa0() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    int result = tradeConfigJSF.getMaxUsers();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsLongRun_Bkur0() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    tradeConfigJSF.setLongRun(true);
    assertTrue(tradeConfigJSF.isLongRun());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsPublishQuotePriceChange_fJiq0() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    boolean result = tradeConfigJSF.isPublishQuotePriceChange();
    assertTrue(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetOrderProcessingModeList_vtWS0() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    String[] result = tradeConfigJSF.getOrderProcessingModeList();
    assertNotNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetMaxQuotes_PlJu10000() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    int result = tradeConfigJSF.getMaxQuotes();
    assertEquals(10000, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetOrderProcessingModeList_eseE0() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    String[] orderProcessingModeList = new String[] {"mode1", "mode2"};
    tradeConfigJSF.setOrderProcessingModeList(orderProcessingModeList);
    assertArrayEquals(orderProcessingModeList, tradeConfigJSF.getOrderProcessingModeList());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetWebInterface_TRrh0() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    tradeConfigJSF.setWebInterface("http://example.com");
    assertEquals("http://example.com", tradeConfigJSF.getWebInterface());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetResult_EFxq0() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    tradeConfigJSF.setResult("Success");
    assertEquals("Success", tradeConfigJSF.getResult());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetMaxUsers_vIPA0() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    tradeConfigJSF.setMaxUsers(10);
    assertEquals(10, tradeConfigJSF.getMaxUsers());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetMarketSummaryInterval_vKSV0() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    tradeConfigJSF.setMarketSummaryInterval(10);
    assertEquals(10, tradeConfigJSF.getMarketSummaryInterval());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetWebInterface_BpCT0() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    String webInterface = tradeConfigJSF.getWebInterface();
    assertNotNull(webInterface);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetOrderProcessingMode_xiRe0() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    String result = tradeConfigJSF.getOrderProcessingMode();
    assertNotNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetListQuotePriceChangeFrequency_AJdE0() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    tradeConfigJSF.setListQuotePriceChangeFrequency(10);
    assertEquals(10, tradeConfigJSF.getListQuotePriceChangeFrequency());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetRuntimeModeList_AOTb0() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    String[] runtimeModeList = new String[] {"mode1", "mode2"};
    tradeConfigJSF.setRuntimeModeList(runtimeModeList);
    assertArrayEquals(runtimeModeList, tradeConfigJSF.getRuntimeModeList());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsDisplayOrderAlerts_jyOV0() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    boolean result = tradeConfigJSF.isDisplayOrderAlerts();
    assertTrue(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetListQuotePriceChangeFrequency_WyFp100() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    int result = tradeConfigJSF.getListQuotePriceChangeFrequency();
    assertEquals(100, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetRuntimeMode_Oxnk0() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    tradeConfigJSF.setRuntimeMode("testMode");
    assertEquals("testMode", tradeConfigJSF.getRuntimeMode());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetmaxQuotes_vkHn0() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    tradeConfigJSF.setmaxQuotes(10);
    assertEquals(10, tradeConfigJSF.getMaxQuotes());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testPopulateDatabase_iwYZ0() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    String result = tradeConfigJSF.populateDatabase();
    assertEquals("database", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetOrderProcessingMode_DpPH0() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    tradeConfigJSF.setOrderProcessingMode("AUTO");
    assertEquals("AUTO", tradeConfigJSF.getOrderProcessingMode());
}
}