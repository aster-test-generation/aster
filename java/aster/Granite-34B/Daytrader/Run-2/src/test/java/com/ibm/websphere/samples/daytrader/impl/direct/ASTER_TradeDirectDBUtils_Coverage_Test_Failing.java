/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.impl.direct;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_TradeDirectDBUtils_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCheckDBProductName1_tZnd0() throws Exception {
        TradeDirectDBUtils tradeDirectDBUtils = new TradeDirectDBUtils();
        String dbProductName = tradeDirectDBUtils.checkDBProductName();
        assertEquals(dbProductName, null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCheckDBProductName2_sRia1() throws Exception {
        TradeDirectDBUtils tradeDirectDBUtils = new TradeDirectDBUtils();
        String dbProductName = tradeDirectDBUtils.checkDBProductName();
        assertEquals(dbProductName, "dbProductName");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseDDLToBuffer_TNmf0() throws Exception {
        TradeDirectDBUtils tradeDirectDBUtils = new TradeDirectDBUtils();
        tradeDirectDBUtils.parseDDLToBuffer(null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCheckDBProductName7_qvYT6_fid1() throws Exception {
        TradeDirectDBUtils tradeDirectDBUtils = new TradeDirectDBUtils();
        String dbProductName = tradeDirectDBUtils.checkDBProductName();
        assertNotNull(dbProductName);
    }
}