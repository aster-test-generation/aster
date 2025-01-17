/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.jdom;

import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.jdom.Document;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_JDOMPointerFactory_Test_Failing {
    JDOMPointerFactory jdompointerfactory;
    NodePointer parent;
    QName name;
    Object bean;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOrderWithMaxData_QzWO2() {
        JDOMPointerFactory jdomPointerFactory = new JDOMPointerFactory();
        int actual = jdomPointerFactory.getOrder();
        int expected = Integer.MAX_VALUE; // Replace with the expected value based on the max data
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateInstance_lnIh0() throws Exception {
        jdompointerfactory = new JDOMPointerFactory();
        parent = mock(NodePointer.class);
        name = mock(QName.class);
        bean = mock(Object.class);
        when(bean instanceof Document).thenReturn(true);
        NodePointer nodePointer = jdompointerfactory.createNodePointer(parent, name, bean);
        verify(bean, times(1)).getClass();
        verify(bean, times(1)).getClass();
        assertEquals(JDOMNodePointer.class, nodePointer.getClass());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOrderWithMockData_YCQy1_fid2() {
        JDOMPointerFactory jdomPointerFactory = new JDOMPointerFactory();
        int actual = jdomPointerFactory.getOrder();
        int expected = 100; // Replace with the expected value based on the mock data
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOrderWithNegativeData_uYGr3_fid2() {
        JDOMPointerFactory jdomPointerFactory = new JDOMPointerFactory();
        int actual = jdomPointerFactory.getOrder();
        int expected = -100; // Replace with the expected value based on the negative data
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOrderWithZeroData_zVyT4_fid2() {
        JDOMPointerFactory jdomPointerFactory = new JDOMPointerFactory();
        int actual = jdomPointerFactory.getOrder();
        int expected = 0; // Replace with the expected value based on the zero data
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOrderWithEmptyData_oHzi5_fid2() {
        JDOMPointerFactory jdomPointerFactory = new JDOMPointerFactory();
        int actual = jdomPointerFactory.getOrder();
        int expected = 0; // Replace with the expected value based on the empty data
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOrderWithNullData_rIqJ6_fid2() {
        JDOMPointerFactory jdomPointerFactory = new JDOMPointerFactory();
        int actual = jdomPointerFactory.getOrder();
        int expected = 0; // Replace with the expected value based on the null data
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOrderWithSpecialCharData_uqjh7_fid2() {
        JDOMPointerFactory jdomPointerFactory = new JDOMPointerFactory();
        int actual = jdomPointerFactory.getOrder();
        int expected = 0; // Replace with the expected value based on the special character data
        assertEquals(expected, actual);
    }
}