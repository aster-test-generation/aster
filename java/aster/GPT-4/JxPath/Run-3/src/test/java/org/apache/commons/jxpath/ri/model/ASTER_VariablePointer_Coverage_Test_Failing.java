/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.util.ValueUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_VariablePointer_Coverage_Test_Failing {
    private NodePointer clonedNodePointer;
    private VariablePointer variablePointer;
    private QName qName;
@BeforeEach
    @Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsCollection_whenValueIsCollection_returnsTrue_eJGk0() {
        QName qName = new QName("testName");
        VariablePointer variablePointer = new VariablePointer(qName);
        Object collectionValue = mock(Object.class); // Mocking the Object to simulate a collection
        ValueUtils valueUtils = mock(ValueUtils.class);
        when(valueUtils.isCollection(collectionValue)).thenReturn(true);
        when(variablePointer.getBaseValue()).thenReturn(collectionValue);
        boolean result = variablePointer.isCollection();
    }
}