/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.mdb;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_DTBroker3MDB_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testBoostrapTradeServices1_WnrG0() {
        DTBroker3MDB dtBroker3MDB = new DTBroker3MDB();
        dtBroker3MDB.boostrapTradeServices();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testBoostrapTradeServices1_WnrG0_fid1() {
        DTBroker3MDB dtBroker3MDB = new DTBroker3MDB();
        dtBroker3MDB.boostrapTradeServices();
        // Add assertions here to validate the behavior of boostrapTradeServices()
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testBoostrapTradeServices3_OrGZ2() {
        DTBroker3MDB dtBroker3MDB = new DTBroker3MDB();
        dtBroker3MDB.boostrapTradeServices();
        // Add assertion here
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testBoostrapTradeServices8_eQzB7() {
        DTBroker3MDB dtBroker3MDB = new DTBroker3MDB();
        dtBroker3MDB.boostrapTradeServices();
        // Add assertions here
    }
}