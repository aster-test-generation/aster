/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_PingBean_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMsg_figp0() {
        PingBean pingBean = new PingBean();
        String expected = "expected message";
    assertNull(expected);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMsg_figp0_fid2() {
        PingBean pingBean = new PingBean();
        String expected = "expected message";
        assertEquals(expected, pingBean.getMsg());
    }
}