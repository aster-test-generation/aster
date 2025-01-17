/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.beans;

import java.beans.PropertyDescriptor;
import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.JXPathBeanInfo;
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
public class Aster_BeanPropertyPointer_Test_Failing {
    private Object value = UNINITIALIZED;
    BeanPropertyPointer beanpropertypointer;
    private String propertyName;
    private Object baseValue = UNINITIALIZED;
    private static Object UNINITIALIZED = new Object();
    private transient PropertyDescriptor[] propertyDescriptors;
    private JXPathBeanInfo beanInfo;
    private transient String[] names;
    private transient PropertyDescriptor propertyDescriptor;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testsetIndex_onUj0() throws Exception {
        beanpropertypointer = mock(BeanPropertyPointer.class);
        int index = 0; // set the value for index
        when(beanpropertypointer.isCollection()).thenReturn(true); // set the return value for isCollection()
        beanpropertypointer.setIndex(index); // call the method
        verify(beanpropertypointer, times(1)).isCollection(); // verify the method is called once
        verify(beanpropertypointer, times(1)).setIndex(index); // verify the method is called once with the correct parameter
        assertEquals(UNINITIALIZED, value); // assert that the value is set to UNINITIALIZED
    }
}