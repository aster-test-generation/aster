/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.jdom;
import java.util.Locale;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.jdom.Document;
import org.jdom.Element;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.Locale;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_JDOMPointerFactory_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNodePointerWithDocument_cLTt0_1() {
        JDOMPointerFactory factory = new JDOMPointerFactory();
        Document document = new Document();
        Locale locale = Locale.getDefault();
        NodePointer result = factory.createNodePointer(new QName("test"), document, locale);
        assertNotNull(result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNodePointerWithDocument_cLTt0_2() {
        JDOMPointerFactory factory = new JDOMPointerFactory();
        Document document = new Document();
        Locale locale = Locale.getDefault();
        NodePointer result = factory.createNodePointer(new QName("test"), document, locale);
        assertTrue(result instanceof JDOMNodePointer);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNodePointerWithElement_bHut1_1() {
        JDOMPointerFactory factory = new JDOMPointerFactory();
        Element element = new Element("testElement");
        Locale locale = Locale.getDefault();
        NodePointer result = factory.createNodePointer(new QName("test"), element, locale);
        assertNotNull(result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNodePointerWithElement_bHut1_2() {
        JDOMPointerFactory factory = new JDOMPointerFactory();
        Element element = new Element("testElement");
        Locale locale = Locale.getDefault();
        NodePointer result = factory.createNodePointer(new QName("test"), element, locale);
        assertTrue(result instanceof JDOMNodePointer);}
}