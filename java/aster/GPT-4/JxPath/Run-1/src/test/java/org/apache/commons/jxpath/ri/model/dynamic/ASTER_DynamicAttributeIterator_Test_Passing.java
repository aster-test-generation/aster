/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.dynamic;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.beans.BeanPointer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.mockito.InjectMocks;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.*;   
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_DynamicAttributeIterator_Test_Passing {
@Mock
    private BeanPointer parentBeanPointer;
@Mock
    private QName qName;
@Mock
    private DynamicPropertyPointer propertyPointer;
@InjectMocks
    private DynamicAttributeIterator dynamicAttributeIterator;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testPrepareForIndividualProperty_lhzs0() throws Exception {
    dynamicAttributeIterator = new DynamicAttributeIterator(parentBeanPointer, qName);
    when(parentBeanPointer.getPropertyPointer()).thenReturn(propertyPointer);
    String propertyName = "testProperty";
    dynamicAttributeIterator.prepareForIndividualProperty(propertyName);
    verify(propertyPointer).setPropertyName(propertyName);
    verify(dynamicAttributeIterator, times(2)).prepareForIndividualProperty(propertyName);
}
}