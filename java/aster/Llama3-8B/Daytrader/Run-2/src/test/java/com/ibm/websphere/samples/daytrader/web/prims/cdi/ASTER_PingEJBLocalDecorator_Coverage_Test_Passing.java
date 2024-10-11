/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims.cdi;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_PingEJBLocalDecorator_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMsgWithNullEjb_VHgv1() {
        PingEJBLocalDecorator ejbDecorator = new PingEJBLocalDecorator();
        String actual = ejbDecorator.getMsg();
        assertEquals("Decorated null", actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetMsgWithNonNullEjbAndNullMsg_oSZC6_dGrI0() {
    PingEJBLocalDecorator ejbDecorator = new PingEJBLocalDecorator();
    PingEJBLocal ejb = new PingEJBLocal();
    ejbDecorator.ejb = ejb; 
    String actual = ejbDecorator.getMsg();
    assertEquals("Decorated null", actual);
}
}