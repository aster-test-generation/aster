/**
 * Generated by Aster
 */
package org.apache.commons.jxpath;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_JXPathIntrospector_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBeanInfoWithClass_cAOK0() {
    JXPathIntrospector introspector = new JXPathIntrospector();
    JXPathBeanInfo beanInfo = introspector.getBeanInfo(String.class);
    assertNotNull(beanInfo);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBeanInfoWithClassAndNoInformant_IFcB1() {
    JXPathIntrospector introspector = new JXPathIntrospector();
    JXPathBeanInfo beanInfo = introspector.getBeanInfo(Integer.class);
    assertNotNull(beanInfo);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBeanInfoWithClassAndInformant_mwOz2() {
    JXPathIntrospector introspector = new JXPathIntrospector();
    JXPathBeanInfo beanInfo = introspector.getBeanInfo(JXPathIntrospector.class);
    assertNotNull(beanInfo);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBeanInfoWithClassAndNoInformantAndDynamic_sPLU3() {
    JXPathIntrospector introspector = new JXPathIntrospector();
    JXPathBeanInfo beanInfo = introspector.getBeanInfo(Object.class);
    assertNotNull(beanInfo);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBeanInfoWithNullClass_ZlLD1() {
    try {
        JXPathIntrospector.getBeanInfo(null);
        assert false;
    } catch (NullPointerException e) {
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBeanInfoClass_BVMs1() {
        JXPathIntrospector introspector = new JXPathIntrospector();
        JXPathBeanInfo beanInfo = introspector.getBeanInfo(Class.class);
        assertNotNull(beanInfo);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBeanInfoWithClassloader_BGhj2_LUoE1() {
    try {
        JXPathIntrospector.registerAtomicClass(Class.forName("java.lang.String"));
    } catch (ClassNotFoundException e) {
        fail("ClassNotFoundException was expected");
    }
}
}