/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims.cdi;

import java.util.concurrent.TimeUnit;
import javax.naming.InitialContext;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.MockedConstruction;
import org.mockito.MockedConstruction.Context;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_PingCDIBean_Test_Failing {
    private static int getBeanManagerHitCountJNDI = 0;
    PingCDIBean pingcdibean;
    InitialContext initialcontext;
    MockedConstruction<InitialContext> mockedInitialContext;

    @Test
    @Timeout(value = 3, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHello_eqrx0() {
        PingCDIBean pingCDIBean = new PingCDIBean();
        int result = pingCDIBean.hello();
        assertEquals(1, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetBeanMangerViaJNDI() throws Exception {
        mockedInitialContext = mockConstruction(InitialContext.class, (mock, context) -> {
            when(mock.lookup("java:comp/BeanManager")).thenReturn(initialcontext);
        });
        initialcontext = mock(InitialContext.class);
        pingcdibean = new PingCDIBean();
        // Act
        int result = pingcdibean.getBeanMangerViaJNDI();
        // Assert
        assertEquals(1, result);
        verify(initialcontext, times(1)).lookup("java:comp/BeanManager");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGettingBeanManagerViaJNDIWhenNoBeansFound_SRdD1() throws Exception {
        PingCDIBean pingCDIBean = new PingCDIBean();
        int result = pingCDIBean.getBeanMangerViaJNDI();
        assertEquals(0, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHelloWithZeroHitCount_Qtan2_fid1() {
        PingCDIBean pingCDIBean = new PingCDIBean();
        int result = pingCDIBean.hello();
        assertEquals(0, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHelloWithNegativeHitCount_CFbB3_fid1() {
        PingCDIBean pingCDIBean = new PingCDIBean();
        int result = pingCDIBean.hello();
        assertEquals(-1, result);
    }
}