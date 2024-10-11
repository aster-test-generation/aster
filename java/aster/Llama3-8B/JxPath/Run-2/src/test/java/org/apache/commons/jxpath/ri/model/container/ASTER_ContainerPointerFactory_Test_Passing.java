/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.container;
import java.util.Locale;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import static org.junit.jupiter.api.Assertions.assertNull;
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
public class Aster_ContainerPointerFactory_Test_Passing {
@Mock
    private NodePointer parent;
@Mock
    private QName name;
@Mock
    private Object bean;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNodePointer_NotContainer_zPye1() {
        ContainerPointerFactory factory = new ContainerPointerFactory();
        Object bean = new Object();
        QName name = new QName("prefix", "localName");
        Locale locale = Locale.US;
        NodePointer result = factory.createNodePointer(name, bean, locale);
        assertNull(result);
    }
}