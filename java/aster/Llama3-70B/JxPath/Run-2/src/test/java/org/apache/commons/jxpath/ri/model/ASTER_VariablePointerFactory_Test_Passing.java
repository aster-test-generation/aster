/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model;

import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.ri.QName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_VariablePointerFactory_Test_Passing {
    @Mock
    private NodePointer nodePointer;
    @Mock
    private QName qName;
    private VariablePointerFactory variablePointerFactory;
    VariablePointerFactory variablepointerfactory;
    JXPathContext jXPathContext;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNodePointer_NotVariableContextWrapper_ReturnsNull_ZjEA2() {
        VariablePointerFactory factory = new VariablePointerFactory();
        QName name = new QName("qualifiedName");
        Object object = new Object();
        NodePointer pointer = factory.createNodePointer(name, object, Locale.US);
        assertNull(pointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNodePointer_NullName_ThrowsNullPointerException_cCWK3_fid1() {
        VariablePointerFactory factory = new VariablePointerFactory();
        Object object = new Object();
        try {
            factory.createNodePointer(null, object, Locale.US);
        } catch (NullPointerException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOrder_MQvP890() {
        VariablePointerFactory variablePointerFactory = new VariablePointerFactory();
        int result = variablePointerFactory.getOrder();
        assertEquals(890, result);
    }
}