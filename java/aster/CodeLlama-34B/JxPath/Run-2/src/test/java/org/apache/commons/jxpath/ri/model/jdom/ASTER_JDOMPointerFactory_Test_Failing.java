/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.jdom;

import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.jdom.Document;
import org.jdom.Element;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_JDOMPointerFactory_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNodePointerWithDocumentAndNullParent_VyBC3() {
        JDOMPointerFactory factory = new JDOMPointerFactory();
        QName name = new QName("name");
        Document bean = new Document();
        NodePointer pointer = factory.createNodePointer(null, name, bean);
        assertNotNull(pointer);
        assertTrue(pointer instanceof JDOMNodePointer);
        assertEquals(bean, pointer.getNode());
        assertEquals(name, pointer.getName());
        assertNull(pointer.getParent());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNodePointerWithElementAndNullParent_MpNl4() {
        JDOMPointerFactory factory = new JDOMPointerFactory();
        QName name = new QName("name");
        Element bean = new Element("element");
        NodePointer pointer = factory.createNodePointer(null, name, bean);
        assertNull(pointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNodePointerWithDocumentAndNullParent_VyBC3_fid2() {
        JDOMPointerFactory factory = new JDOMPointerFactory();
        QName name = new QName("name");
        Document bean = new Document();
        NodePointer pointer = factory.createNodePointer(null, name, bean);
        assertNull(pointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNodePointerWithNullParentAndName_LxjY7_fid2() {
        JDOMPointerFactory factory = new JDOMPointerFactory();
        QName name = new QName("name");
        NodePointer pointer = factory.createNodePointer(null, name, new Document());
        assertNull(pointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNodePointerWithNullParentAndNullName_CsJD9_fid2() {
        JDOMPointerFactory factory = new JDOMPointerFactory();
        NodePointer pointer = factory.createNodePointer(null, null, new Document());
        assertNull(pointer);
    }
}