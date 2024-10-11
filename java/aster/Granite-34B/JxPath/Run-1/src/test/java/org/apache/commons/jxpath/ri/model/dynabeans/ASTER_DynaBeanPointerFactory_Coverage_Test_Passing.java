/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.dynabeans;

import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_DynaBeanPointerFactory_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNodePointer_YNrK0() {
        DynaBeanPointerFactory dynaBeanPointerFactory = new DynaBeanPointerFactory();
        Object bean = new Object();
        Locale locale = Locale.getDefault();
        NodePointer nodePointer = dynaBeanPointerFactory.createNodePointer(new QName(" qualifiedName"), bean, locale);
        Assertions.assertNull(nodePointer);
    }
}