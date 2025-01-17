/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims.cdi;
import java.util.Set;
import javax.enterprise.inject.spi.Bean;
import javax.enterprise.inject.spi.BeanManager;
import javax.enterprise.inject.spi.CDI;
import javax.naming.InitialContext;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import java.util.Set;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_PingCDIBean_Coverage_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBeanMangerViaJNDI_LookupSuccess_yswr0() throws Exception {
        PingCDIBean pingCDIBean = new PingCDIBean();
        BeanManager beanManager = (BeanManager) new InitialContext().lookup("java:comp/BeanManager");
        Set<Bean<?>> beans = beanManager.getBeans(Object.class);
        assertEquals(1, pingCDIBean.getBeanMangerViaJNDI());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBeanMangerViaJNDI_LookupFailure_eqWA1() throws Exception {
        PingCDIBean pingCDIBean = new PingCDIBean();
        BeanManager beanManager = null;
        Set<Bean<?>> beans = null;
        assertEquals(0, pingCDIBean.getBeanMangerViaJNDI());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBeanMangerViaJNDI_NoBeansFound_mzoL2() throws Exception {
        PingCDIBean pingCDIBean = new PingCDIBean();
        BeanManager beanManager = (BeanManager) new InitialContext().lookup("java:comp/BeanManager");
        Set<Bean<?>> beans = beanManager.getBeans(Object.class);
        assertEquals(0, pingCDIBean.getBeanMangerViaJNDI());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBeanMangerViaCDICurrent_Returns0_WhenBeansDoNotExist_vwIA1() throws java.lang.Exception {
        PingCDIBean pingCDIBean = new PingCDIBean();
        BeanManager beanManager = CDI.current().getBeanManager();
        Set<Bean<?>> beans = beanManager.getBeans(Object.class);
        assertEquals(0, pingCDIBean.getBeanMangerViaCDICurrent());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBeanMangerViaCDICurrent_ThrowsException_WhenBeansAreNull_cWmv3() throws java.lang.Exception {
        PingCDIBean pingCDIBean = new PingCDIBean();
        BeanManager beanManager = CDI.current().getBeanManager();
        Set<Bean<?>> beans = null;
        try {
            pingCDIBean.getBeanMangerViaCDICurrent();
            fail("Expected Exception");
        } catch (Exception e) {
            assertEquals("Beans are null", e.getMessage());
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBeanMangerViaCDICurrent_ReturnsCorrectHitCount_BmGM4() throws java.lang.Exception {
        PingCDIBean pingCDIBean = new PingCDIBean();
        BeanManager beanManager = CDI.current().getBeanManager();
        Set<Bean<?>> beans = beanManager.getBeans(Object.class);
        pingCDIBean.getBeanMangerViaCDICurrent(); // call the method to increment hit count
        assertEquals(1, pingCDIBean.getBeanMangerViaCDICurrent());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBeanMangerViaJNDI_ExceptionThrown_SKPt4_fid1() throws Exception {
        PingCDIBean pingCDIBean = new PingCDIBean();
        BeanManager beanManager = null;
        Set<Bean<?>> beans = null;
        try {
            pingCDIBean.getBeanMangerViaJNDI();
            fail("Expected Exception");
        } catch (Exception e) {
            assertEquals("java.lang.Exception", e.getMessage());
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBeanMangerViaCDICurrent_ThrowsException_WhenBeanManagerIsNull_hFzD2_fid1() throws java.lang.Exception {
        PingCDIBean pingCDIBean = new PingCDIBean();
        BeanManager beanManager = null;
        try {
            pingCDIBean.getBeanMangerViaCDICurrent();
            fail("Expected Exception");
        } catch (Exception e) {
            assertEquals("BeanManager is null", e.getMessage());
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBeanMangerViaCDICurrent_Returns1_WhenBeansExist_djJU0_MQpk0() throws java.lang.Exception {
    PingCDIBean pingCDIBean = new PingCDIBean();
    BeanManager beanManager = CDI.current().getBeanManager();
    Set<Bean<?>> beans = beanManager.getBeans(Object.class);
    Bean<?> bean = beanManager.getBeans(Object.class).iterator().next();
    assertEquals(1, pingCDIBean.getBeanMangerViaJNDI());
}
}