/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.beans;
import java.util.Locale;
import org.apache.commons.jxpath.JXPathBeanInfo;
import org.apache.commons.jxpath.JXPathIntrospector;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.dom.DOMNodePointer;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import java.util.Locale;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;   
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_BeanPointerFactory_Test_Passing {
@Mock
    private JXPathIntrospector jXPathIntrospector;
@Mock
    private JXPathBeanInfo jXPathBeanInfo;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNodePointer_iEgX0() {
        BeanPointerFactory factory = new BeanPointerFactory();
        QName name = new QName("prefix", "localName");
        Object bean = new Object();
        Locale locale = new Locale("en", "US");
        NodePointer result = factory.createNodePointer(name, bean, locale);
        assertNotNull(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNodePointerNullBean_czls0() {
        BeanPointerFactory factory = new BeanPointerFactory();
        NodePointer parent = new DOMNodePointer(null, Locale.US, "id");
        QName name = new QName("prefix", "localName");
        NodePointer result = factory.createNodePointer(parent, name, null);
        assertEquals(new NullPointer(parent, name), result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNodePointerNotNullBean_erBE1() {
        BeanPointerFactory factory = new BeanPointerFactory();
        NodePointer parent = new DOMNodePointer(null, Locale.US, "id");
        QName name = new QName("prefix", "localName");
        Object bean = new Object();
        NodePointer result = factory.createNodePointer(parent, name, bean);
        assertNotNull(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOrder_wbAL900() {
        BeanPointerFactory beanPointerFactory = new BeanPointerFactory();
        int result = beanPointerFactory.getOrder();
        assertEquals(900, result);
    }
}