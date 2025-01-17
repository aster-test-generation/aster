/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.jdom;
import java.util.Locale;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.jdom.Document;
import org.jdom.Element;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Locale;
import org.junit.jupiter.api.Assertions;
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
public class Aster_JDOMPointerFactory_Test_Passing {
@Mock
    private Locale locale;
@Mock
    private QName qname;
@Mock
    private Object bean;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNodePointerDocument_pVJi0() {
        JDOMPointerFactory factory = new JDOMPointerFactory();
        QName name = new QName("namespace", "localName");
        Document document = new Document();
        Locale locale = Locale.US;
        NodePointer result = factory.createNodePointer(name, document, locale);
        Assertions.assertNotNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNodePointerElement_xjjv1() {
        JDOMPointerFactory factory = new JDOMPointerFactory();
        QName name = new QName("namespace", "localName");
        Element element = new Element("element");
        Locale locale = Locale.US;
        NodePointer result = factory.createNodePointer(name, element, locale);
        Assertions.assertNotNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNodePointerNull_nHLI2() {
        JDOMPointerFactory factory = new JDOMPointerFactory();
        QName name = new QName("namespace", "localName");
        Locale locale = Locale.US;
        NodePointer result = factory.createNodePointer(name, null, locale);
        Assertions.assertNull(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetOrder_vqmX110_PdeI110() {
    JDOMPointerFactory factory = new JDOMPointerFactory();
    int order = factory.getOrder();
    assertEquals(110, order);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateNodePointerDocument_kvLc0_amcO0() {
    JDOMPointerFactory factory = new JDOMPointerFactory();
    QName name = new QName("test");
    Document bean = new Document();
    NodePointer result = factory.createNodePointer(null, name, bean);
    Assertions.assertNotNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateNodePointerElement_uFFc1_xVOE0() {
    JDOMPointerFactory factory = new JDOMPointerFactory();
    QName name = new QName("test");
    Element bean = new Element("test");
    NodePointer result = factory.createNodePointer(null, name, bean);
    Assertions.assertNotNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateNodePointerNull_MlBV2_DVSL1() {
    JDOMPointerFactory factory = new JDOMPointerFactory();
    NodePointer parent = null;
    QName name = new QName("test");
    NodePointer result = factory.createNodePointer(parent, name, null);
    Assertions.assertNull(result);
}
}