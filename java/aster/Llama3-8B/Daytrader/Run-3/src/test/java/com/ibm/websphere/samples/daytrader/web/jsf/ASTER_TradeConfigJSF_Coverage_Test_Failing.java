/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.jsf;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_TradeConfigJSF_Coverage_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateConfig_RuntimeMode_zpdI0_fid2() {
        TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
        tradeConfigJSF.updateConfig();
        assertEquals("RuntimeMode: RuntimeMode1", tradeConfigJSF.getResult());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testUpdateConfig_OrderProcessingMode_TWnL1_kEIU0_fid3() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    assertEquals("TradeBuildDB: **** Unable to check DB Product name, please check Database/AppServer configuration and retry ****<br/>database", tradeConfigJSF.buildDatabaseTables());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testUpdateConfig_MAX_USERS_yoap3_PjoW0_fid3() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    tradeConfigJSF.buildDatabaseTables();
    assertEquals("TradeBuildDB: **** DayTrader Database Created, Check System.Out for any errors. ****<br/>Trade Users: 10", tradeConfigJSF.getResult());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testUpdateConfig_MAX_QUOTES_FhIx4_ZSVF0_fid3() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    tradeConfigJSF.buildDatabaseTables();
    assertEquals("TradeBuildDB: **** DayTrader Database Created, Check System.Out for any errors. ****<br/>", tradeConfigJSF.getResult());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testUpdateConfig_PrimIterations_fftD6_oOhE0_fid3() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    tradeConfigJSF.setPrimIterations(40);
    tradeConfigJSF.updateConfig();
    assertEquals("Primitive Iterations: 40", tradeConfigJSF.getResult());
}
}