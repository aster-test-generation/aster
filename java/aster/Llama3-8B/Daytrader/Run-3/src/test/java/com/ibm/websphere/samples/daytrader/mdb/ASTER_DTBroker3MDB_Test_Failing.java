/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.mdb;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_DTBroker3MDB_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testBootstrapTradeServices_RuntimeMode1_OZAg0() {
    DTBroker3MDB dtBroker3MDB = new DTBroker3MDB();
    dtBroker3MDB.boostrapTradeServices();
}
}