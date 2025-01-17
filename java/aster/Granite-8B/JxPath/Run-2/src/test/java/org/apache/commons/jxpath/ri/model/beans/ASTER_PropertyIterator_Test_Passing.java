/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.beans;

import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.*;
import org.apache.commons.jxpath.ri.NamespaceResolver;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.ri.model.dom.DOMNodePointer;
import org.apache.commons.jxpath.servlet.KeywordVariables;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_PropertyIterator_Test_Passing {
    private int position = 0;
    @Mock
    private DOMNodePointer parent;
    @Mock
    private Locale locale;
    @Mock
    private KeywordVariables variables;
    @Mock
    private Object bean;
    @Mock
    private JXPathBasicBeanInfo beanInfo;
    @Mock
    private QName name;
    @Mock
    private QName prefix;
    @Mock
    private QName localName;
    @Mock
    private Class clazz;
    @Mock
    private Class dynamicPropertyHandlerClass;
    private PropertyIterator propertyiterator;
    private KeywordVariables keywordVariables;
    private Object object;
    private VariablePointer variablePointer;
    private BeanPointer beanPointer;
    private JXPathBasicBeanInfo jXPathBasicBeanInfo;
    private DOMNodePointer dOMNodePointer;
    private QName qName;
    private PropertyIterator propertyIteratorSpy;
    private boolean targetReady = false;
    @Mock
    private DOMNodePointer domNodePointer;
    @Mock
    private PropertyIterator propertyIterator;
    private PropertyPointer propertyNodePointer;
    @Mock
    private NodePointer nodePointer;
    @Mock
    private Pointer pointer;
    @Mock
    private JXPathContext context;
    private boolean includeStart = false;
    private int startIndex = 0;
    private boolean empty = false;
    private boolean reverse;
    private int startPropertyIndex;
    @Mock
    private PropertyPointer propertyNodePointerMock;
    @Mock
    private NodePointer nodePointerMock;
    @Mock
    private Locale localeMock;
    @Mock
    private JXPathContext contextMock;
    @Mock
    private NamespaceResolver namespaceResolverMock;
    @Mock
    private AbstractFactory abstractFactoryMock;
    @Mock
    private NodeSet nodeSetMock;
    @Mock
    private Pointer pointerMock;
    @Mock
    private DOMNodePointer domNodePointerMock;
    @Mock
    private KeywordVariables keywordVariablesMock;
    @Mock
    private QName qNameMock;
    @Mock
    private BeanPointer beanPointerMock;
    @Mock
    private VariablePointer variablePointerMock;
    @Mock
    private NodePointer parentMock;
    @Mock
    private NodePointer immediateParentMock;
    @Mock
    private NodePointer immediateValuePointerMock;
    @Mock
    private NodePointer valuePointerMock;
    @Mock
    private NodePointer rootNodeMock;
    @Mock
    private Object baseValueMock;
    @Mock
    private Object nodeValueMock;
    @Mock
    private Object objectMock;
    @Mock
    private Class clazzMock;
    @Mock
    private Class dynamicPropertyHandlerClassMock;
    @Mock
    private JXPathBasicBeanInfo jXPathBasicBeanInfoMock;
    @Mock
    private PropertyIterator propertyIteratorMock;
    @Mock
    private PropertyIterator propertyIterator2Mock;
    @Mock
    private PropertyPointer propertyPointerMock;
    @Mock
    private NullPropertyPointer nullPropertyPointerMock;
    @Mock
    private NodePointer nodePointer2Mock;
    @Mock
    private NodePointer nodePointer3Mock;
    @Mock
    private NodePointer nodePointer4Mock;
    @Mock
    private NodePointer nodePointer5Mock;
    @Mock
    private NodePointer nodePointer6Mock;
    @Mock
    private NodePointer nodePointer7Mock;
    @Mock
    private NodePointer nodePointer8Mock;
    @Mock
    private NodePointer nodePointer9Mock;
    @Mock
    private NodePointer nodePointer10Mock;
    @Mock
    private NodePointer nodePointer11Mock;
    @Mock
    private NodePointer nodePointer12Mock;
    @Mock
    private NodePointer nodePointer13Mock;
    @Mock
    private NodePointer nodePointer14Mock;
    @Mock
    private NodePointer nodePointer15Mock;
    @Mock
    private NodePointer nodePointer16Mock;
    @Mock
    private NodePointer nodePointer17Mock;
    @Mock
    private NodePointer nodePointer18Mock;
    @Mock
    private NodePointer nodePointer19Mock;
    @Mock
    private NodePointer nodePointer20Mock;
    @Mock
    private NodePointer nodePointer21Mock;
    @Mock
    private NodePointer nodePointer22Mock;
    @Mock
    private NodePointer nodePointer23Mock;
    @Mock
    private NodePointer nodePointer24Mock;
    @Mock
    private NodePointer nodePointer25Mock;
    @Mock
    private NodePointer nodePointer26Mock;
    @Mock
    private NodePointer nodePointer27Mock;
    @Mock
    private NodePointer nodePointer28Mock;
    @Mock
    private NodePointer nodePointer29Mock;
    @Mock
    private NodePointer nodePointer30Mock;
    @Mock
    private NodePointer nodePointer31Mock;
    @Mock
    private NodePointer nodePointer32Mock;
    @Mock
    private NodePointer nodePointer33Mock;
    @Mock
    private NodePointer nodePointer34Mock;
    @Mock
    private NodePointer nodePointer35Mock;
    @Mock
    private NodePointer nodePointer36Mock;
    @Mock
    private NodePointer nodePointer37Mock;
    @Mock
    private NodePointer nodePointer38Mock;
    @Mock
    private NodePointer nodePointer39Mock;
    @Mock
    private NodePointer nodePointer40Mock;
    @Mock
    private NodePointer nodePointer41Mock;
    @Mock
    private NodePointer nodePointer42Mock;
    @Mock
    private NodePointer nodePointer43Mock;
    @Mock
    private NodePointer nodePointer44Mock;
    @Mock
    private NodePointer nodePointer45Mock;
    @Mock
    private NodePointer nodePointer46Mock;
    @Mock
    private NodePointer nodePointer47Mock;
    @Mock
    private NodePointer nodePointer48Mock;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPositionAllProperties_rgIg0() {
        PropertyIterator propertyIterator = new PropertyIterator(null, null, false, null);
        boolean result = propertyIterator.setPosition(1);
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPositionAllPropertiesWithReverse_RDbW2() {
        PropertyIterator propertyIterator = new PropertyIterator(null, null, true, null);
        boolean result = propertyIterator.setPosition(1);
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPositionAllProperties_XdGQ1() {
        PropertyIterator propertyIterator = new PropertyIterator(null, null, false, null);
        boolean result = propertyIterator.setPosition(1);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReset() {
        propertyiterator = new PropertyIterator(beanPointer, "name", false, domNodePointer);
        propertyiterator.reset();
        verify(propertyiterator, times(1)).reset();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyPointer_wrdu0() {
        PropertyIterator propertyIterator = new PropertyIterator(new BeanPointer(new DOMNodePointer(null, null, null), null, null, null), "name", false, null);
        NodePointer propertyPointer = propertyIterator.getPropertyPointer();
        assertNotNull(propertyPointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyPointer2_UZXx1() {
        PropertyIterator propertyIterator = new PropertyIterator(new BeanPointer(new DOMNodePointer(null, null, null), null, null, null), "name", true, null);
        NodePointer propertyPointer = propertyIterator.getPropertyPointer();
        assertNotNull(propertyPointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyPointer3_NAZs2() {
        PropertyIterator propertyIterator = new PropertyIterator(new BeanPointer(new DOMNodePointer(null, null, null), null, null, null), "name", false, new DOMNodePointer(null, null, null));
        NodePointer propertyPointer = propertyIterator.getPropertyPointer();
        assertNotNull(propertyPointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyPointer4_vubr3() {
        PropertyIterator propertyIterator = new PropertyIterator(new BeanPointer(new DOMNodePointer(null, null, null), null, null, null), "name", true, new DOMNodePointer(null, null, null));
        NodePointer propertyPointer = propertyIterator.getPropertyPointer();
        assertNotNull(propertyPointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPrepareForIndividualProperty1_SsvY0() {
        PropertyIterator propertyIterator = new PropertyIterator(null, null, false, null);
        propertyIterator.prepareForIndividualProperty("name");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPrepareForIndividualProperty2_VdXL1() {
        PropertyIterator propertyIterator = new PropertyIterator(null, null, true, null);
        propertyIterator.prepareForIndividualProperty("name");
    }
}