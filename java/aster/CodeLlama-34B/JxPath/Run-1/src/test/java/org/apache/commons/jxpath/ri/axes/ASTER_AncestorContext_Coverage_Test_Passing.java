/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.axes;

import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_AncestorContext_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDocumentOrder_pfmh0() {
        NamespaceContext parentContext = new NamespaceContext(null, new NodeTypeTest(1));
        SelfContext selfContext = new SelfContext(parentContext, new NodeTypeTest(1));
        AncestorContext ancestorContext = new AncestorContext(selfContext, true, new NodeTypeTest(1));
        int result = ancestorContext.getDocumentOrder();
        assertEquals(-1, result);
    }
}