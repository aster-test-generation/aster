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
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_PingCDIBean_Test_Passing {
    private static int getBeanManagerHitCountJNDI = 0;
    PingCDIBean pingcdibean;
    InitialContext initialcontext;
    MockedConstruction<InitialContext> mockedInitialContext;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHelloFourTimes_mYtI3_fid1() {
        PingCDIBean bean = new PingCDIBean();
        bean.hello();
        bean.hello();
        bean.hello();
        int actual = bean.hello();
        int expected = 4;
        assertEquals(expected, actual);
    }
}