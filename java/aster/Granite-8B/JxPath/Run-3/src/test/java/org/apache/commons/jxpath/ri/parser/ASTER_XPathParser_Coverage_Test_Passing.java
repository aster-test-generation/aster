/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.parser;

import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.Compiler;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_XPathParser_Coverage_Test_Passing {
    private static final String PRECEDING_AXIS = "preceding::axis";

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOrExpr_1_nzLb1() throws Exception {
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAxisNameAxisSelf_mtlM0() throws ParseException {
        XPathParser xpathParser = new XPathParser(System.in);
        int axis = xpathParser.AxisName();
        assertEquals(Compiler.AXIS_SELF, axis);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAxisNameAxisChild_mvPy1() throws ParseException {
        XPathParser xpathParser = new XPathParser(System.in);
        int axis = xpathParser.AxisName();
        assertEquals(Compiler.AXIS_CHILD, axis);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAxisNameAxisParent_dKXg2() throws ParseException {
        XPathParser xpathParser = new XPathParser(System.in);
        int axis = xpathParser.AxisName();
        assertEquals(Compiler.AXIS_PARENT, axis);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAxisNameAxisAncestor_nghW3() throws ParseException {
        XPathParser xpathParser = new XPathParser(System.in);
        int axis = xpathParser.AxisName();
        assertEquals(Compiler.AXIS_ANCESTOR, axis);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAxisNameAxisAttribute_vwoC4() throws ParseException {
        XPathParser xpathParser = new XPathParser(System.in);
        int axis = xpathParser.AxisName();
        assertEquals(Compiler.AXIS_ATTRIBUTE, axis);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAxisNameAxisNamespace_pbsT5() throws ParseException {
        XPathParser xpathParser = new XPathParser(System.in);
        int axis = xpathParser.AxisName();
        assertEquals(Compiler.AXIS_NAMESPACE, axis);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAxisNameAxisPreceding_dHao6() throws ParseException {
        XPathParser xpathParser = new XPathParser(System.in);
        int axis = xpathParser.AxisName();
        assertEquals(Compiler.AXIS_PRECEDING, axis);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAxisNameAxisFollowing_rKZn7() throws ParseException {
        XPathParser xpathParser = new XPathParser(System.in);
        int axis = xpathParser.AxisName();
        assertEquals(Compiler.AXIS_FOLLOWING, axis);
    }
}