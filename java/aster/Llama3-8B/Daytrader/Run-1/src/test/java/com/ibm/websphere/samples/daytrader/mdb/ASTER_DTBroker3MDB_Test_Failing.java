/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.mdb;

import com.ibm.websphere.samples.daytrader.interfaces.TradeServices;
import com.ibm.websphere.samples.daytrader.util.TradeConfig;
import com.ibm.websphere.samples.daytrader.util.TradeRunTimeModeLiteral;
import java.util.concurrent.TimeUnit;
import javax.enterprise.inject.Instance;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_DTBroker3MDB_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testBootstrapTradeServices_RuntimeMode1_tJYb0() {
        DTBroker3MDB dtBroker3MDB = new DTBroker3MDB();
        dtBroker3MDB.boostrapTradeServices();
        assertEquals("Expected value", dtBroker3MDB.services.select(new TradeRunTimeModeLiteral(TradeConfig.getRunTimeModeNames()[0])).get());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testBootstrapTradeServices_RuntimeMode2_Oedv1() {
        DTBroker3MDB dtBroker3MDB = new DTBroker3MDB();
        dtBroker3MDB.boostrapTradeServices();
        assertEquals("Expected value", dtBroker3MDB.services.select(new TradeRunTimeModeLiteral(TradeConfig.getRunTimeModeNames()[1])).get());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testBootstrapTradeServices_RuntimeMode3_STxy2() {
        DTBroker3MDB dtBroker3MDB = new DTBroker3MDB();
        dtBroker3MDB.boostrapTradeServices();
        assertEquals("Expected value", dtBroker3MDB.services.select(new TradeRunTimeModeLiteral(TradeConfig.getRunTimeModeNames()[2])).get());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testBootstrapTradeServices_RuntimeMode4_eEgs3() {
        DTBroker3MDB dtBroker3MDB = new DTBroker3MDB();
        dtBroker3MDB.boostrapTradeServices();
        assertEquals("Expected value", dtBroker3MDB.services.select(new TradeRunTimeModeLiteral(TradeConfig.getRunTimeModeNames()[3])).get());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testBootstrapTradeServices_RuntimeMode5_zZCA4() {
        DTBroker3MDB dtBroker3MDB = new DTBroker3MDB();
        dtBroker3MDB.boostrapTradeServices();
        assertEquals("Expected value", dtBroker3MDB.services.select(new TradeRunTimeModeLiteral(TradeConfig.getRunTimeModeNames()[4])).get());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testBootstrapTradeServices_RuntimeMode6_IWbS5() {
        DTBroker3MDB dtBroker3MDB = new DTBroker3MDB();
        dtBroker3MDB.boostrapTradeServices();
        assertEquals("Expected value", dtBroker3MDB.services.select(new TradeRunTimeModeLiteral(TradeConfig.getRunTimeModeNames()[5])).get());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testBootstrapTradeServices_RuntimeMode7_UGNn6() {
        DTBroker3MDB dtBroker3MDB = new DTBroker3MDB();
        dtBroker3MDB.boostrapTradeServices();
        assertEquals("Expected value", dtBroker3MDB.services.select(new TradeRunTimeModeLiteral(TradeConfig.getRunTimeModeNames()[6])).get());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testBootstrapTradeServices_RuntimeMode8_FtYX7() {
        DTBroker3MDB dtBroker3MDB = new DTBroker3MDB();
        dtBroker3MDB.boostrapTradeServices();
        assertEquals("Expected value", dtBroker3MDB.services.select(new TradeRunTimeModeLiteral(TradeConfig.getRunTimeModeNames()[7])).get());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testBootstrapTradeServices_RuntimeMode9_oXnz8() {
        DTBroker3MDB dtBroker3MDB = new DTBroker3MDB();
        dtBroker3MDB.boostrapTradeServices();
        assertEquals("Expected value", dtBroker3MDB.services.select(new TradeRunTimeModeLiteral(TradeConfig.getRunTimeModeNames()[8])).get());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testBootstrapTradeServices_RuntimeMode10_SYPS9() {
        DTBroker3MDB dtBroker3MDB = new DTBroker3MDB();
        dtBroker3MDB.boostrapTradeServices();
        assertEquals("Expected value", dtBroker3MDB.services.select(new TradeRunTimeModeLiteral(TradeConfig.getRunTimeModeNames()[9])).get());
    }
}