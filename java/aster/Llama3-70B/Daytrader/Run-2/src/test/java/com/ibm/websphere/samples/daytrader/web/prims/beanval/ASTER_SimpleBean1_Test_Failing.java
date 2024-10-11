/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims.beanval;
import java.util.Set;
import javax.validation.ConstraintViolation;
import static org.junit.jupiter.api.Assertions.*;
import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_SimpleBean1_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFormatConstraintViolations_NonEmptySet_cLLC1_nkJZ0() throws Exception {
    SimpleBean1 simpleBean1 = new SimpleBean1();
    Set<ConstraintViolation<SimpleBean1>> cvSet = new HashSet<>();
    ConstraintViolation<SimpleBean1> cv1 = mock(ConstraintViolation.class);
    when(cv1.toString()).thenReturn("ConstraintViolation1");
    cvSet.add(cv1);
    ConstraintViolation<SimpleBean1> cv2 = mock(ConstraintViolation.class);
    when(cv2.toString()).thenReturn("ConstraintViolation2");
    cvSet.add(cv2);
    String result = simpleBean1.formatConstraintViolations(cvSet);
    assertEquals("ConstraintViolation1\nConstraintViolation2", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetDesc_Wxua0_UwFD0() throws Exception {
    SimpleBean1 simpleBean1 = new SimpleBean1();
    String desc = simpleBean1.getDesc();
    assertNotNull(desc);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetDesc_Wxua0_tsXD1() throws Exception {
    System.setProperty("java.naming.factory.initial", "com.sun.jndi.fscontext.RefFSContextFactory");
    System.setProperty("java.naming.provider.url", "file:///C:/temp");
    SimpleBean1 simpleBean1 = new SimpleBean1();
    String desc = simpleBean1.getDesc();
    assertNotNull(desc);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFormatConstraintViolations_EmptySet_bcVg0_BaES0() {
    try {
        try {
            SimpleBean1 simpleBean1 = new SimpleBean1();
            Set<ConstraintViolation<SimpleBean1>> cvSet = new HashSet<>();
            String result = simpleBean1.formatConstraintViolations(cvSet);
            assertEquals("", result);
        } catch (Exception e) {
            fail("Exception should not be thrown");
        }
    } catch (Exception e) {
        fail("Exception should not be thrown");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFormatConstraintViolations_NonEmptySet_cLLC1_nkJZ0_fid3() throws Exception {
    SimpleBean1 simpleBean1;
    try {
        simpleBean1 = new SimpleBean1();
    } catch (Exception e) {
        throw new RuntimeException(e);
    }
    Set<ConstraintViolation<SimpleBean1>> cvSet = new HashSet<>();
    ConstraintViolation<SimpleBean1> cv1 = mock(ConstraintViolation.class);
    when(cv1.toString()).thenReturn("ConstraintViolation1");
    cvSet.add(cv1);
    ConstraintViolation<SimpleBean1> cv2 = mock(ConstraintViolation.class);
    when(cv2.toString()).thenReturn("ConstraintViolation2");
    cvSet.add(cv2);
    String result = simpleBean1.formatConstraintViolations(cvSet);
    assertEquals("\n\tConstraintViolation1\n\tConstraintViolation2", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetDesc_Wxua0_UwFD0_fid3() throws Exception {
    try {
        SimpleBean1 simpleBean1 = new SimpleBean1();
        String desc = simpleBean1.getDesc();
        assertNull(desc);
    } catch (Exception e) {
        fail("Exception occurred");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetDesc_Wxua0_tsXD1_fid3() throws Exception {
    SimpleBean1 simpleBean1 = new SimpleBean1();
    String desc = simpleBean1.getDesc();
    assertNull(desc);
}
}