/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.jsf;
import com.ibm.websphere.samples.daytrader.impl.direct.TradeDirectDBUtils;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_TradeConfigJSF_Coverage_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPopulateDatabase1_pwZQ0() {
        TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
        String result = tradeConfigJSF.populateDatabase();
        assertTrue(result.contains("TradeBuildDB: **** DayTrader Database Built - 10 users created, 100 quotes created. ****<br/>"));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPopulateDatabase2_SqzX1() {
        TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
        String result = tradeConfigJSF.populateDatabase();
        assertTrue(result.contains("TradeBuildDB: **** Check System.Out for any errors. ****<br/>"));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testBuildDatabaseTables1_XDkd0() throws Exception {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    String dbProductName = null;
    dbProductName = tradeConfigJSF.dbUtils.checkDBProductName();
}
}