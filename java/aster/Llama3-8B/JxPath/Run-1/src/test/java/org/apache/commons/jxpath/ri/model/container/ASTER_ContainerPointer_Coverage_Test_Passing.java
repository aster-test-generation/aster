/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.container;

import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodeIterator;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_ContainerPointer_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNamespaceIterator_mnPt0_xntb0() {
        QName qName = new QName("prefix", "localName");
        VariablePointer variablePointer = new VariablePointer(qName);
        NodeIterator nodeIterator = variablePointer.namespaceIterator();
        assertNotNull(nodeIterator);
    }
}