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
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_DynamicAttributeIterator_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPrepareForIndividualProperty_CallsSuperMethod_scro1() {
        QName qName = new QName("testName");
        BeanPointer parent = mock(BeanPointer.class);
        DynamicAttributeIterator iterator = spy(new DynamicAttributeIterator(parent, qName));
        iterator.prepareForIndividualProperty("propertyName");
        verify(iterator).prepareForIndividualProperty("propertyName");
    }
}