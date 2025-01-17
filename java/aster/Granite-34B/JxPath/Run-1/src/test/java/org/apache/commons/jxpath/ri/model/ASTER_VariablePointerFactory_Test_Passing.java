/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model;

import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.servlet.KeywordVariables;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_VariablePointerFactory_Test_Passing {
    VariablePointerFactory variablepointerfactory;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNodePointer_kRBZ0() {
        VariablePointerFactory factory = new VariablePointerFactory();
        NodePointer nodePointer = factory.createNodePointer(new QName("name"), new Object(), new Locale("en"));
        assertNull(nodePointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testKeywordVariables_Ercw0() {
        KeywordVariables keywordVariables = new KeywordVariables("keyword", new Object());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testVariablePointer_UtSB1() {
        VariablePointer variablePointer = new VariablePointer(new KeywordVariables("variables", new Object()), new QName("name"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOrder_vydV0_NZvu0() {
        VariablePointerFactory variablePointerFactory = new VariablePointerFactory();
        int actual = variablePointerFactory.getOrder();
        int expected = VariablePointerFactory.VARIABLE_POINTER_FACTORY_ORDER;
        assertEquals(expected, actual);
    }
}