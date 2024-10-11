/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.dynabeans;
import org.apache.commons.beanutils.LazyDynaBean;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.mock;   
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_StrictLazyDynaBeanPointerFactory_Test_Failing {
    private NodePointer parent;
@Test
    public void testCreateNodePointer_tLNS0_1() {
        StrictLazyDynaBeanPointerFactory factory = new StrictLazyDynaBeanPointerFactory();
        NodePointer parent = mock(NodePointer.class);
        QName name = new QName("test");
        LazyDynaBean lazyDynaBean = mock(LazyDynaBean.class);
        NodePointer result = factory.createNodePointer(parent, name, lazyDynaBean);
        Object notLazyDynaBean = new Object();
        result = factory.createNodePointer(parent, name, notLazyDynaBean);
        assertNotNull(result);}
}