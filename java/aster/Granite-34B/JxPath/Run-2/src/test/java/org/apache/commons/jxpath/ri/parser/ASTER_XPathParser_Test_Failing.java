/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.parser;

import java.util.ArrayList;
import java.util.Vector;
import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.Compiler;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_XPathParser_Test_Failing {
    private XPathParser xpathParser;
    private XPathParser parser;
    private int[] jj_la1 = new int[39];
    private Compiler compiler;
    private int jj_gen;
    XPathParser xpathparser;
    private int jj_endpos;
    static private int[] jj_la1_1;
    static private int[] jj_la1_2;
    private int jj_kind = -1;
    private java.util.Vector jj_expentries = new java.util.Vector();
    private int[] jj_expentry;
    static private int[] jj_la1_0;
    @Mock
    SimpleCharStream stream;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNCName_Without_CoreFunctions_aHTB0() throws ParseException {
        XPathParser xpathParser = new XPathParser(new java.io.StringReader(""));
        String result = xpathParser.NCName_Without_CoreFunctions();
        assertEquals("result", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAbsoluteLocationPath() throws Exception {
        xpathparser = mock(XPathParser.class);
        compiler = mock(Compiler.class);
        doReturn(new ArrayList()).when(compiler).locationPath(anyBoolean(), any());
        when(xpathparser.AbsoluteLocationPath()).thenCallRealMethod();
        xpathparser.AbsoluteLocationPath();
        verify(compiler, times(1)).locationPath(anyBoolean(), any());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualityExpr() throws Exception {
        xpathparser = mock(XPathParser.class);
        compiler = mock(Compiler.class);
        when(xpathparser.RelationalExpr()).thenReturn(new Object());
        Object ex = new Object();
        Object r = new Object();
        when(xpathparser.RelationalExpr()).thenReturn(r);
        when(compiler.equal(ex, r)).thenReturn(ex);
        when(compiler.notEqual(ex, r)).thenReturn(ex);
        Object actual = xpathparser.EqualityExpr();
        verify(xpathparser, times(1)).RelationalExpr();
        verify(compiler, times(1)).equal(ex, r);
        verify(compiler, times(1)).notEqual(ex, r);
        assertEquals(ex, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualityExpr_akbq0() throws Exception {
        XPathParser parser = new XPathParser(new java.io.StringReader(""));
        Object result = parser.EqualityExpr();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPathExpr() throws Exception {
        xpathparser = mock(XPathParser.class);
        Object ex = new Object();
        Object[] steps = new Object[1];
        when(xpathparser.FilterExpr()).thenReturn(ex);
        when(xpathparser.LocationPath()).thenReturn(ex);
        Object result = xpathparser.PathExpr();
        verify(xpathparser, times(1)).FilterExpr();
        verify(xpathparser, times(0)).LocationPath();
        assertEquals(ex, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRelationalExpr_vWJS0() throws Exception {
        XPathParser parser = new XPathParser(new java.io.StringReader(""));
        Object result = parser.RelationalExpr();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAndExpr_YnZU0() throws Exception {
        XPathParser parser = new XPathParser(new java.io.StringReader(""));
        Object result = parser.AndExpr();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPredicate_Xmnu0() throws ParseException {
        XPathParser parser = new XPathParser(new java.io.StringReader(""));
        Object ex = parser.Predicate();
        assertNotNull(ex);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPredicateWithStream_clOS1() throws ParseException {
        XPathParser parser = new XPathParser(new java.io.ByteArrayInputStream(new byte[0]));
        Object ex = parser.Predicate();
        assertNotNull(ex);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPredicateWithTokenManager_WtrV3() throws ParseException {
        XPathParserTokenManager tokenManager = new XPathParserTokenManager(new SimpleCharStream(new java.io.StringReader("")));
        XPathParser parser = new XPathParser(tokenManager);
        Object ex = parser.Predicate();
        assertNotNull(ex);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUnionExpr() throws Exception {
        xpathparser = mock(XPathParser.class);
        compiler = mock(Compiler.class);
        when(compiler).thenReturn(compiler);
        when(xpathparser.UnionExpr()).thenCallRealMethod();
        Object ex = new Object();
        Object r = new Object();
        ArrayList list = new ArrayList();
        list.add(ex);
        when(xpathparser.PathExpr()).thenReturn(ex, r);
        when(compiler.union(any())).thenReturn(ex);
        Object result = xpathparser.UnionExpr();
        verify(xpathparser, times(2)).PathExpr();
        verify(compiler).union(list.toArray());
        assertEquals(ex, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUnionExpr_OneExpression_rdqz0() throws Exception {
        XPathParser parser = new XPathParser(new java.io.StringReader("expression"));
        Object result = parser.UnionExpr();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUnionExpr_MultipleExpressions_HQaX1() throws Exception {
        XPathParser parser = new XPathParser(new java.io.StringReader("expression1|expression2|expression3"));
        Object result = parser.UnionExpr();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUnionExpr_NoExpressions_HdQj2() throws Exception {
        XPathParser parser = new XPathParser(new java.io.StringReader(""));
        Object result = parser.UnionExpr();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testArgumentList_1() throws Exception {
        xpathparser = mock(XPathParser.class);
        doCallRealMethod().when(xpathparser).ArgumentList();
        ArrayList<Object> args = new ArrayList<>();
        Object arg = new Object();
        args.add(arg);
        when(xpathparser.ArgumentList()).thenReturn(args);
        ArrayList<Object> result = xpathparser.ArgumentList();
        verify(xpathparser, times(1)).ArgumentList();
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testArgumentList_2() throws Exception {
        xpathparser = mock(XPathParser.class);
        doCallRealMethod().when(xpathparser).ArgumentList();
        ArrayList<Object> args = new ArrayList<>();
        Object arg = new Object();
        args.add(arg);
        when(xpathparser.ArgumentList()).thenReturn(args);
        ArrayList<Object> result = xpathparser.ArgumentList();
        verify(xpathparser, times(1)).ArgumentList();
        assertEquals(args, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWildcardName() throws Exception {
        xpathparser = mock(XPathParser.class);
        compiler = mock(Compiler.class);
        doReturn(new Object()).when(compiler).qname(anyString(), anyString());
        when(xpathparser.WildcardName()).thenReturn(new Object());
        Object qn = xpathparser.WildcardName();
        verify(compiler, times(1)).qname(anyString(), anyString());
        assertNotNull(qn);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testQNameWithOneParameter_MiGj0() {
        XPathParser parser = new XPathParser(new java.io.StringReader(""));
        try {
            Object qName = parser.QName();
            assertEquals(qName, compiler.qname(null, "nc1"));
        } catch (ParseException e) {
            fail("Failed to parse XPath expression");
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testQNameWithTwoParameters_DhLA1() {
        XPathParser parser = new XPathParser(new java.io.StringReader(""));
        try {
            Object qName = parser.QName();
            assertEquals(qName, compiler.qname("nc1", "nc2"));
        } catch (ParseException e) {
            fail("Failed to parse XPath expression");
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLocationStep() throws Exception {
        xpathparser = mock(XPathParser.class);
        compiler = mock(Compiler.class);
        doReturn(new Object()).when(compiler).nodeTypeTest(anyInt());
        doReturn(new Object()).when(compiler).step(anyInt(), any(), any());
        ArrayList<Object> steps = new ArrayList<>();
        when(xpathparser.jj_nt).thenReturn(new Token());
        when(xpathparser.jj_nt.kind).thenReturn(1);
        when(jj_gen).thenReturn(1);
        xpathparser.LocationStep(steps);
        verify(compiler, times(1)).nodeTypeTest(anyInt());
        verify(compiler, times(1)).step(anyInt(), any(), any());
        assertEquals(2, steps.size());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseExpression_gMKc0() throws Exception {
        XPathParser parser = new XPathParser(new java.io.StringReader(""));
        Object result = parser.parseExpression();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testArgument() throws Exception {
        xpathparser = mock(XPathParser.class);
        doReturn(new Object()).when(xpathparser).Expression();
        Object ex = xpathparser.Argument();
        assertEquals(new Object(), ex);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testArgument_OPLO0() throws Exception {
        XPathParser parser = new XPathParser(new java.io.StringReader(""));
        Object ex = parser.Argument();
        System.out.println(ex);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCoreFunctionName_YcBi0() throws ParseException {
        XPathParser xpathParser = new XPathParser(new java.io.StringReader(""));
        int code = 0;
        code = xpathParser.CoreFunctionName();
        assertEquals(0, code);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCoreFunctionName3_cSxb2() throws ParseException {
        XPathParser xpathParser = new XPathParser(new java.io.StringReader(""));
        int code = 1;
        code = xpathParser.CoreFunctionName();
        assertEquals(1, code);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testVariableReference_JpfG0() throws ParseException {
        XPathParser parser = new XPathParser(new java.io.StringReader(""));
        Object ex = new Object();
        Object result = parser.VariableReference();
        assertEquals(ex, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAbbreviatedAxisSpecifierWithAxisAttribute_NGQJ1() throws ParseException {
        XPathParser xpathParser = new XPathParser(new java.io.StringReader(""));
        int axis = xpathParser.AbbreviatedAxisSpecifier();
        assertEquals(Compiler.AXIS_ATTRIBUTE, axis);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRelativeLocationPath() throws Exception {
        xpathparser = mock(XPathParser.class);
        compiler = mock(Compiler.class);
        doReturn(new ArrayList()).when(compiler).locationPath(anyBoolean(), any());
        Object result = xpathparser.RelativeLocationPath();
        verify(compiler).locationPath(eq(false), any());
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testExpression_Rcyo0() throws Exception {
        XPathParser parser = new XPathParser(new java.io.StringReader(""));
        Object ex = parser.Expression();
        System.out.println(ex);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAxisSpecifier() throws Exception {
        xpathparser = mock(XPathParser.class);
        doReturn(1).when(xpathparser).AxisName();
        doReturn(2).when(xpathparser).AbbreviatedAxisSpecifier();
        int axis = xpathparser.AxisSpecifier();
        assertEquals(1, axis);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAxisSpecifier_tTGa0() throws Exception {
        XPathParser xpathParser = new XPathParser(new java.io.StringReader(""));
        int axis = xpathParser.AxisSpecifier();
        assertEquals(0, axis);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLocationPath() throws Exception {
        xpathparser = mock(XPathParser.class);
        Object ex = new Object();
        when(xpathparser.RelativeLocationPath()).thenReturn(ex);
        Object result = xpathparser.LocationPath();
        assertEquals(ex, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testQName_Without_CoreFunctions3_Gioi2() {
        XPathParser xpathParser = new XPathParser(new java.io.StringReader("test:test"));
        try {
            xpathParser.QName_Without_CoreFunctions();
            fail("ParseException expected");
        } catch (ParseException e) {
            assertEquals("Unexpected token: test", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFunctionCall_gGPM0() throws Exception {
        compiler = mock(Compiler.class);
        xpathparser = new XPathParser(new XPathParserTokenManager(new SimpleCharStream(new java.io.StringReader("")), 0));
        when(compiler.function(any(), any())).thenReturn("result");
        Object result = xpathparser.FunctionCall();
        assertEquals("result", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFunctionName_hjKI0_jDSf0() throws ParseException {
        Object qname;
        qname = new XPathParser(new java.io.ByteArrayInputStream(new byte[0])).FunctionName();
        assertEquals(qname, new Object());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFunctionName2_xdBX1_mNhZ0() throws ParseException {
        Object qname;
        qname = new XPathParser(new java.io.StringReader("")).FunctionName();
        assertEquals(qname, new Object());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGenerateParseException_IOKt0_MbHw0() {
        XPathParser xpathParser = new XPathParser(new java.io.ByteArrayInputStream(new byte[0]));
        ParseException exception = xpathParser.generateParseException();
        assertEquals(exception.getMessage(), "parse exception");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGenerateParseException2_ZZWl1_mmrm0() {
        XPathParser xpathParser = new XPathParser(new java.io.StringReader(""));
        ParseException exception = xpathParser.generateParseException();
        assertEquals(exception.getMessage(), "parse exception");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGenerateParseException6_iRHX5_BdCM0() {
        XPathParser xpathParser = new XPathParser(new XPathParserTokenManager(new SimpleCharStream(new java.io.ByteArrayInputStream(new byte[0]), 0, 0)));
        ParseException exception = xpathParser.generateParseException();
        assertEquals(exception.getMessage(), "parse exception");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGenerateParseException_iNAx0_pgqA0() {
        XPathParser xpathParser = new XPathParser(new java.io.ByteArrayInputStream(new byte[0]));
        ParseException parseException = xpathParser.generateParseException();
        assertEquals("ParseException", parseException.getMessage());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGenerateParseException2_oCSO1_kAFl0() {
        XPathParser xpathParser = new XPathParser(new java.io.StringReader(""));
        ParseException parseException = xpathParser.generateParseException();
        assertEquals("ParseException", parseException.getMessage());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNCName_Without_CoreFunctions13_ergp12_fid2() throws ParseException {
        XPathParser xpathParser = new XPathParser(new java.io.StringReader(""));
        String result = xpathParser.NCName_Without_CoreFunctions();
        assertEquals("ergp12", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testArgument_fid2() throws Exception {
        xpathparser = mock(XPathParser.class);
        doReturn(new Object()).when(xpathparser).Expression();
        Object ex = xpathparser.Argument();
        assertNull(new Object());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLocationPath_fid2() throws Exception {
        xpathparser = mock(XPathParser.class);
        Object ex = new Object();
        when(xpathparser.RelativeLocationPath()).thenReturn(ex);
        Object result = xpathparser.LocationPath();
        assertNull(ex);
    }
}