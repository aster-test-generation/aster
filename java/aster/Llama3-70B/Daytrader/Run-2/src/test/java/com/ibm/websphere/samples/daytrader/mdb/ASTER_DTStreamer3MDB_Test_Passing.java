/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.mdb;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_DTStreamer3MDB_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testOnMessage_nullMessage_tzYl5() {
    DTStreamer3MDB dtStreamer3MDB = new DTStreamer3MDB();
    try {
        dtStreamer3MDB.onMessage(null);
        fail("Expected NullPointerException to be thrown");
    } catch (NullPointerException e) {
    }
}
}