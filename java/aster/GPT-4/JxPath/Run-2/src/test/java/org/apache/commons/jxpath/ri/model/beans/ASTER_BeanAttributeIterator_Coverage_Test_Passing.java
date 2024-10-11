/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.beans;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.JXPathBasicBeanInfo;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Locale;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_BeanAttributeIterator_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPosition_DJzB0() {
        QName qName = new QName("testName");
        Object bean = new Object();
        JXPathBasicBeanInfo beanInfo = new JXPathBasicBeanInfo(Object.class);
        BeanPointer parent = new BeanPointer(qName, bean, beanInfo, Locale.getDefault());
        BeanAttributeIterator iterator = new BeanAttributeIterator(parent, qName);
        int expectedPosition = 5; // This should match the default or set position in the actual implementation
        int actualPosition = iterator.getPosition();
        assertEquals(expectedPosition, actualPosition);
    }
}