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
public class Aster_ContainerPointerFactory_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNodePointer_NonContainerBean_lpzh1() {
        ContainerPointerFactory factory = new ContainerPointerFactory();
        Object nonContainer = new Object();
        Locale locale = Locale.US;
        NodePointer result = factory.createNodePointer(new QName("name"), nonContainer, locale);
        assertNull(result);
    }
}