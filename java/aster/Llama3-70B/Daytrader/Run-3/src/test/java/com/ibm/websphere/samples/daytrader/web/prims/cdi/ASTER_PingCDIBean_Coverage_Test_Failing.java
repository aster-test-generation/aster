/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims.cdi;
import java.util.Set;
import javax.enterprise.inject.spi.Bean;
import javax.enterprise.inject.spi.BeanManager;
import javax.enterprise.inject.spi.CDI;
import java.util.Set;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_PingCDIBean_Coverage_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBeanMangerViaCDICurrent_CDI_current_returns_BeanManager_tVgT0() throws Exception {
        PingCDIBean pingCDIBean = new PingCDIBean();
        BeanManager beanManager = mock(BeanManager.class);
        when(CDI.current().getBeanManager()).thenReturn(beanManager);
        pingCDIBean.getBeanMangerViaCDICurrent();
        verify(CDI.current()).getBeanManager();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBeanMangerViaCDICurrent_BeanManager_getBeans_returns_Set_fuUV1() throws Exception {
        PingCDIBean pingCDIBean = new PingCDIBean();
        BeanManager beanManager = mock(BeanManager.class);
        Set<Bean<?>> beans = mock(Set.class);
        when(CDI.current().getBeanManager()).thenReturn(beanManager);
        when(beanManager.getBeans(Object.class)).thenReturn(beans);
        pingCDIBean.getBeanMangerViaCDICurrent();
        verify(beanManager).getBeans(Object.class);
    }
}