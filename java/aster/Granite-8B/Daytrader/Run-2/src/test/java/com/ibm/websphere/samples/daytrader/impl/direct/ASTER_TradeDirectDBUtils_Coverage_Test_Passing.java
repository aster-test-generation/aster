/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.impl.direct;
import java.io.InputStream;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_TradeDirectDBUtils_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testresetTrade0_bCEa0() throws Exception {
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCheckDBProductName1_OmtY0() throws java.lang.Exception {
        TradeDirectDBUtils tradeDirectDBUtils = new TradeDirectDBUtils();
        String dbProductName = null;
        try {
            dbProductName = tradeDirectDBUtils.checkDBProductName();
        } catch (Exception e) {
            fail("Error checking the Daytrader Database Product Name");
        }
        assertNotNull(dbProductName);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCheckDBProductName2_jyGH1() throws java.lang.Exception {
        TradeDirectDBUtils tradeDirectDBUtils = new TradeDirectDBUtils();
        String dbProductName = null;
        try {
            dbProductName = tradeDirectDBUtils.checkDBProductName();
        } catch (Exception e) {
            fail("Error checking the Daytrader Database Product Name");
        }
        assertEquals("Oracle", dbProductName);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCheckDBProductName3_RNrg2() throws java.lang.Exception {
        TradeDirectDBUtils tradeDirectDBUtils = new TradeDirectDBUtils();
        String dbProductName = null;
        try {
            dbProductName = tradeDirectDBUtils.checkDBProductName();
        } catch (Exception e) {
            fail("Error checking the Daytrader Database Product Name");
        }
        assertEquals("MySQL", dbProductName);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCheckDBProductName4_amcW3() throws java.lang.Exception {
        TradeDirectDBUtils tradeDirectDBUtils = new TradeDirectDBUtils();
        String dbProductName = null;
        try {
            dbProductName = tradeDirectDBUtils.checkDBProductName();
        } catch (Exception e) {
            fail("Error checking the Daytrader Database Product Name");
        }
        assertEquals("PostgreSQL", dbProductName);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseDDLToBuffer1_Rxjz0() throws Exception {
        TradeDirectDBUtils instance = new TradeDirectDBUtils();
        InputStream ddlFile = null;
        Object[] expResult = null;
        Object[] result = instance.parseDDLToBuffer(ddlFile);
        assertArrayEquals(expResult, result);
}
}