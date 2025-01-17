/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.beans;

import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.dom.DOMNodePointer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_CollectionPointerFactory_Test_Passing {
    @Mock
    private NodePointer parent;
    @Mock
    private QName name;
    @Mock
    private Object bean;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNodePointerForNonCollection_JDFH1() {
        CollectionPointerFactory factory = new CollectionPointerFactory();
        QName name = new QName("prefix", "localName");
        Object bean = new String("value");
        Locale locale = new Locale("en", "US");
        NodePointer result = factory.createNodePointer(name, bean, locale);
        assert result == null;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNodePointerNotCollection_VghB1() {
        CollectionPointerFactory factory = new CollectionPointerFactory();
        QName name = new QName("name");
        Object bean = new String("value");
        NodePointer parent = new DOMNodePointer(null, Locale.US, "id");
        NodePointer result = factory.createNodePointer(parent, name, bean);
        assertNull(result);
    }
}