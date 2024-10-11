/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.dynamic;

import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.beans.BeanPointer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_DynamicAttributeIterator_Test_Failing {
    @Mock
    private BeanPointer parent;
    @Mock
    private QName name;
    @Mock
    private DynamicPropertyPointer propertyPointer;
    private DynamicAttributeIterator dynamicattributeiterator;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testprepareForIndividualProperty() throws Exception {
        dynamicattributeiterator = new DynamicAttributeIterator(parent, name);
        when(parent.getPropertyPointer()).thenReturn(propertyPointer);
        String individualPropertyName = "individualProperty";
        dynamicattributeiterator.prepareForIndividualProperty(individualPropertyName);
        verify(propertyPointer).setPropertyName(individualPropertyName);
    }
}