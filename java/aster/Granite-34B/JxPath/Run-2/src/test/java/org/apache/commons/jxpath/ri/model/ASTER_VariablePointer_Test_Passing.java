/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model;

import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.AbstractFactory;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.Variables;
import org.apache.commons.jxpath.ri.NamespaceResolver;
import org.apache.commons.jxpath.ri.QName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_VariablePointer_Test_Passing {
    VariablePointer variablepointer;
    private Variables variables;
    private boolean actual;
    private QName name;
    private NodePointer valuePointer;
    private static final String PREFIX = "prefix";
    private static final String LOCAL_NAME = "localName";
    private static final String QUALIFIED_NAME = PREFIX + ":" + LOCAL_NAME;
    private static final String NAMESPACE_URI = "namespaceURI";
    private static final String DEFAULT_NAMESPACE_URI = "defaultNamespaceURI";
    private static final String KEY = "key";
    private static final String VALUE = "value";
    private static final String ID = "id";
    private static final int INDEX = 1;
    private static final Locale LOCALE = Locale.getDefault();
    private final Object baseValue = new Object();
    private final Object node = new Object();
    private final Object rootNode = new Object();
    private final Object value = new Object();
    private final NamespaceResolver namespaceResolver = new NamespaceResolver() {
    };
    private final AbstractFactory abstractFactory = new AbstractFactory() {
    };

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFindVariablesWhenContextIsNULL_ZgHo1() {
        JXPathContext context = null;
        VariablePointer pointer = new VariablePointer(new QName("name"));
        pointer.findVariables(context);
        assertEquals(false, pointer.isActual());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getNameWithNullPointer_Xxsk3() {
        assertEquals(null, new VariablePointer(null, null).getName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFindVariables_srBz0_oFcH0_fid1() {
        JXPathContext context = JXPathContext.newContext(new Object());
        VariablePointer pointer = new VariablePointer(new QName("name"));
        pointer.findVariables(context);
        assertEquals(false, pointer.isActual());
    }
}