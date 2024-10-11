/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.jdom;
import java.util.Locale;
import org.apache.commons.jxpath.ri.model.NodePointer;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import java.util.Locale;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_JDOMPointerFactory_Coverage_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNodePointerForNonDocumentOrElement_FBIu2() {
        JDOMPointerFactory factory = new JDOMPointerFactory();
        Object bean = new Object();
        Locale locale = Locale.getDefault();
        NodePointer pointer = factory.createNodePointer(null, bean, locale);
        assertNotNull(pointer);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNodePointerForNullBean_WaKS3() {
        JDOMPointerFactory factory = new JDOMPointerFactory();
        Object bean = null;
        Locale locale = Locale.getDefault();
        NodePointer pointer = factory.createNodePointer(null, bean, locale);
        assertNotNull(pointer);
    }
}