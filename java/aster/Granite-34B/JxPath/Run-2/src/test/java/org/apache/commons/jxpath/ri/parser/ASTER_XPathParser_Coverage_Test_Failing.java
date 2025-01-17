/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.parser;

import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.Compiler;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.when;

public class Aster_XPathParser_Coverage_Test_Failing {
    private int[] jj_la1 = new int[39];
    private Compiler compiler;
    private int jj_gen;
    XPathParser xpathparser;

    @BeforeEach
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPathExpr1_HVNc1() throws Exception {
        Object ex = new Object();
        when(xpathparser.FilterExpr()).thenReturn(ex);
        Object result = xpathparser.PathExpr();
        assertEquals(ex, result);
    }
}