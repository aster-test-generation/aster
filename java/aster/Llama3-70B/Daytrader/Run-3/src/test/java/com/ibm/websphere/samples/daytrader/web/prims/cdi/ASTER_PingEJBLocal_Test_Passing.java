/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims.cdi;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_PingEJBLocal_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetMsg_dFrv0_1() {
    PingEJBLocal pingEJBLocal = new PingEJBLocal();
    String result = pingEJBLocal.getMsg();
    assertNotNull(result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetMsg_dFrv0_2() {
    PingEJBLocal pingEJBLocal = new PingEJBLocal();
    String result = pingEJBLocal.getMsg();
    assertTrue(result.startsWith("PingEJBLocal: "));}
}