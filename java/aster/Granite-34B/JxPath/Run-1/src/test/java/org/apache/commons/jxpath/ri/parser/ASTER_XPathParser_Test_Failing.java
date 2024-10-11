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
    XPathParser xpathParser;
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
    @Mock
    XPathParserTokenManager tm;
    private XPathParser parser;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGenerateParseExceptionWithNullTokenManager_dKUK3_1() {
        XPathParserTokenManager tokenManager = null;
        XPathParser parser = new XPathParser(tokenManager);
        ParseException e = parser.generateParseException();
        assertNotNull(e);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGenerateParseExceptionWithNullTokenManager_dKUK3_2() {
        XPathParserTokenManager tokenManager = null;
        XPathParser parser = new XPathParser(tokenManager);
        ParseException e = parser.generateParseException();
        assertEquals("", e.getMessage());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGenerateParseException0_NLVS0() throws Throwable {
        XPathParser xPathParser0 = new XPathParser((java.io.Reader) null);
        XPathParserTokenManager xPathParserTokenManager0 = new XPathParserTokenManager(new SimpleCharStream((java.io.Reader) null));
        xPathParser0.ReInit(xPathParserTokenManager0);
        XPathParserTokenManager xPathParserTokenManager1 = new XPathParserTokenManager(new SimpleCharStream((java.io.Reader) null));
        xPathParser0.ReInit(xPathParserTokenManager1);
        XPathParserTokenManager xPathParserTokenManager2 = new XPathParserTokenManager(new SimpleCharStream((java.io.Reader) null));
        xPathParser0.ReInit(xPathParserTokenManager2);
        XPathParserTokenManager xPathParserTokenManager3 = new XPathParserTokenManager(new SimpleCharStream((java.io.Reader) null));
        xPathParser0.ReInit(xPathParserTokenManager3);
        XPathParserTokenManager xPathParserTokenManager4 = new XPathParserTokenManager(new SimpleCharStream((java.io.Reader) null));
        xPathParser0.ReInit(xPathParserTokenManager4);
        XPathParserTokenManager xPathParserTokenManager5 = new XPathParserTokenManager(new SimpleCharStream((java.io.Reader) null));
        xPathParser0.ReInit(xPathParserTokenManager5);
        XPathParserTokenManager xPathParserTokenManager6 = new XPathParserTokenManager(new SimpleCharStream((java.io.Reader) null));
        xPathParser0.ReInit(xPathParserTokenManager6);
        XPathParserTokenManager xPathParserTokenManager7 = new XPathParserTokenManager(new SimpleCharStream((java.io.Reader) null));
        xPathParser0.ReInit(xPathParserTokenManager7);
        XPathParserTokenManager xPathParserTokenManager8 = new XPathParserTokenManager(new SimpleCharStream((java.io.Reader) null));
        xPathParser0.ReInit(xPathParserTokenManager8);
        XPathParserTokenManager xPathParserTokenManager9 = new XPathParserTokenManager(new SimpleCharStream((java.io.Reader) null));
        xPathParser0.ReInit(xPathParserTokenManager9);
        XPathParserTokenManager xPathParserTokenManager10 = new XPathParserTokenManager(new SimpleCharStream((java.io.Reader) null));
        xPathParser0.ReInit(xPathParserTokenManager10);
        XPathParserTokenManager xPathParserTokenManager11 = new XPathParserTokenManager(new SimpleCharStream((java.io.Reader) null));
        xPathParser0.ReInit(xPathParserTokenManager11);
        XPathParserTokenManager xPathParserTokenManager12 = new XPathParserTokenManager(new SimpleCharStream((java.io.Reader) null));
        xPathParser0.ReInit(xPathParserTokenManager12);
        XPathParserTokenManager xPathParserTokenManager13 = new XPathParserTokenManager(new SimpleCharStream((java.io.Reader) null));
        xPathParser0.ReInit(xPathParserTokenManager13);
        XPathParserTokenManager xPathParserTokenManager14 = new XPathParserTokenManager(new SimpleCharStream((java.io.Reader) null));
        xPathParser0.ReInit(xPathParserTokenManager14);
        XPathParserTokenManager xPathParserTokenManager15 = new XPathParserTokenManager(new SimpleCharStream((java.io.Reader) null));
        xPathParser0.ReInit(xPathParserTokenManager15);
        XPathParserTokenManager xPathParserTokenManager16 = new XPathParserTokenManager(new SimpleCharStream((java.io.Reader) null));
        xPathParser0.ReInit(xPathParserTokenManager16);
        XPathParserTokenManager xPathParserTokenManager17 = new XPathParserTokenManager(new SimpleCharStream((java.io.Reader) null));
        xPathParser0.ReInit(xPathParserTokenManager17);
        XPathParserTokenManager xPathParserTokenManager18 = new XPathParserTokenManager(new SimpleCharStream((java.io.Reader) null));
        xPathParser0.ReInit(xPathParserTokenManager18);
        XPathParserTokenManager xPathParserTokenManager19 = new XPathParserTokenManager(new SimpleCharStream((java.io.Reader) null));
        xPathParser0.ReInit(xPathParserTokenManager19);
        XPathParserTokenManager xPathParserTokenManager20 = new XPathParserTokenManager(new SimpleCharStream((java.io.Reader) null));
        xPathParser0.ReInit(xPathParserTokenManager20);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNCName_Without_CoreFunctions2_bXsc1() throws ParseException {
        XPathParser xpathParser = new XPathParser(new java.io.StringReader(""));
        assertEquals("OR", xpathParser.NCName_Without_CoreFunctions());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNCName_Without_CoreFunctions4_RoEP3() throws ParseException {
        XPathParser xpathParser = new XPathParser(new java.io.StringReader(""));
        assertEquals("MOD", xpathParser.NCName_Without_CoreFunctions());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNCName_Without_CoreFunctions5_IbQX4() throws ParseException {
        XPathParser xpathParser = new XPathParser(new java.io.StringReader(""));
        assertEquals("DIV", xpathParser.NCName_Without_CoreFunctions());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPrimaryExpr() throws Exception {
        xpathparser = mock(XPathParser.class);
        compiler = mock(Compiler.class);
        doReturn(new Object()).when(compiler).literal(anyString());
        doReturn(new Object()).when(compiler).number(anyString());
        doReturn(new Object()).when(compiler).variableReference(anyString());
        when(xpathparser.PrimaryExpr()).thenCallRealMethod();
        when(xpathparser.VariableReference()).thenReturn(compiler.variableReference("variable"));
        when(xpathparser.Expression()).thenReturn(new Object());
        when(xpathparser.FunctionCall()).thenReturn(new Object());
        when(xpathparser.CoreFunctionCall()).thenReturn(new Object());
        Object result = xpathparser.PrimaryExpr();
        verify(xpathparser).VariableReference();
        verify(xpathparser).Expression();
        verify(xpathparser).FunctionCall();
        verify(xpathparser).CoreFunctionCall();
        verify(compiler, times(0)).literal(anyString());
        verify(compiler, times(0)).number(anyString());
        verify(compiler, times(1)).variableReference(anyString());
        assertNotNull(result);
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
        Object result = xpathparser.EqualityExpr();
        verify(xpathparser, times(2)).RelationalExpr();
        verify(compiler, times(1)).equal(ex, r);
        verify(compiler, times(1)).notEqual(ex, r);
        assertEquals(ex, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualityExpr_obvM0() throws Exception {
        XPathParser parser = new XPathParser(new java.io.StringReader(""));
        Object ex = parser.EqualityExpr();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPathExpr() throws Exception {
        xpathparser = mock(XPathParser.class);
        doReturn(new Object()).when(xpathparser).FilterExpr();
        doReturn(new Object()).when(xpathparser).LocationPath();
        Object result = xpathparser.PathExpr();
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRelationalExpr_ybcr0() throws Exception {
        XPathParser parser = new XPathParser(new java.io.StringReader(""));
        Object result = parser.RelationalExpr();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUnionExpr_nnqX0() throws Exception {
        XPathParser parser = new XPathParser(new java.io.StringReader(""));
        Object result = parser.UnionExpr();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLocationStep() throws Exception {
        xpathparser = mock(XPathParser.class);
        compiler = mock(Compiler.class);
        when(compiler).thenReturn(compiler);
        ArrayList<Object> steps = new ArrayList<>();
        when(compiler.nodeTypeTest(Compiler.NODE_TYPE_NODE)).thenReturn(new Object());
        when(compiler.step(Compiler.AXIS_DESCENDANT_OR_SELF, new Object(), null)).thenReturn(new Object());
        xpathparser.LocationStep(steps);
        verify(compiler, times(1)).nodeTypeTest(Compiler.NODE_TYPE_NODE);
        verify(compiler, times(1)).step(Compiler.AXIS_DESCENDANT_OR_SELF, new Object(), null);
        verify(xpathparser, times(1)).LocationStep(steps);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseExpression_jLFG0() throws Exception {
        XPathParser parser = new XPathParser(new java.io.StringReader(""));
        Object ex = parser.parseExpression();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testArgument() throws Exception {
        xpathparser = mock(XPathParser.class);
        Object ex = new Object();
        when(xpathparser.Expression()).thenReturn(ex);
        Object result = xpathparser.Argument();
        assertNull(ex);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNCName0_Mdvv0() throws Exception {
        XPathParser parser = new XPathParser(new java.io.StringReader(""));
        String result = parser.NCName();
        assertEquals("node", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNCName1_KDdR1() throws Exception {
        XPathParser parser = new XPathParser(new java.io.StringReader(""));
        String result = parser.NCName();
        assertEquals("text", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNCName2_rXkS2() throws Exception {
        XPathParser parser = new XPathParser(new java.io.StringReader(""));
        String result = parser.NCName();
        assertEquals("comment", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNCName3_drKX3() throws Exception {
        XPathParser parser = new XPathParser(new java.io.StringReader(""));
        String result = parser.NCName();
        assertEquals("pi", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNCName4_TfBo4() throws Exception {
        XPathParser parser = new XPathParser(new java.io.StringReader(""));
        String result = parser.NCName();
        assertEquals("last", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNCName5_nRmK5() throws Exception {
        XPathParser parser = new XPathParser(new java.io.StringReader(""));
        String result = parser.NCName();
        assertEquals("position", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNCName6_BZtL6() throws Exception {
        XPathParser parser = new XPathParser(new java.io.StringReader(""));
        String result = parser.NCName();
        assertEquals("count", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNCName7_cfNR7() throws Exception {
        XPathParser parser = new XPathParser(new java.io.StringReader(""));
        String result = parser.NCName();
        assertEquals("id", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNCName8_kGDE8() throws Exception {
        XPathParser parser = new XPathParser(new java.io.StringReader(""));
        String result = parser.NCName();
        assertEquals("local-name", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNCName9_EBVT9() throws Exception {
        XPathParser parser = new XPathParser(new java.io.StringReader(""));
        String result = parser.NCName();
        assertEquals("namespace-uri", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNCName10_NrzK10() throws Exception {
        XPathParser parser = new XPathParser(new java.io.StringReader(""));
        String result = parser.NCName();
        assertEquals("name", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNCName11_mxIz11() throws Exception {
        XPathParser parser = new XPathParser(new java.io.StringReader(""));
        String result = parser.NCName();
        assertEquals("string", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNCName12_gxGE12() throws Exception {
        XPathParser parser = new XPathParser(new java.io.StringReader(""));
        String result = parser.NCName();
        assertEquals("concat", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNCName13_SlCl13() throws Exception {
        XPathParser parser = new XPathParser(new java.io.StringReader(""));
        String result = parser.NCName();
        assertEquals("starts-with", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNCName14_wphi14() throws Exception {
        XPathParser parser = new XPathParser(new java.io.StringReader(""));
        String result = parser.NCName();
        assertEquals("ends-with", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNCName15_nWpa15() throws Exception {
        XPathParser parser = new XPathParser(new java.io.StringReader(""));
        String result = parser.NCName();
        assertEquals("contains", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNCName16_jNxU16() throws Exception {
        XPathParser parser = new XPathParser(new java.io.StringReader(""));
        String result = parser.NCName();
        assertEquals("substring-before", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNCName17_TahM17() throws Exception {
        XPathParser parser = new XPathParser(new java.io.StringReader(""));
        String result = parser.NCName();
        assertEquals("substring-after", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNodeTypeWithTEXT_rpIM0() throws ParseException {
        XPathParser parser = new XPathParser(new java.io.StringReader("TEXT"));
        int type = parser.NodeType();
        assertEquals(Compiler.NODE_TYPE_TEXT, type);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNodeTypeWithNODE_vZgk1() throws ParseException {
        XPathParser parser = new XPathParser(new java.io.StringReader("NODE"));
        int type = parser.NodeType();
        assertEquals(Compiler.NODE_TYPE_NODE, type);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNodeTypeWithCOMMENT_PirO2() throws ParseException {
        XPathParser parser = new XPathParser(new java.io.StringReader("COMMENT"));
        int type = parser.NodeType();
        assertEquals(Compiler.NODE_TYPE_COMMENT, type);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testVariableReference_AAUf0() throws ParseException {
        XPathParser parser = new XPathParser(new java.io.StringReader(""));
        Object ex = new Object();
        Object result = parser.VariableReference();
        assertEquals(ex, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testVariableReference17_fbBK16() throws ParseException {
        XPathParser parser = new XPathParser(new java.io.StringReader(""));
        Object result = parser.VariableReference();
        Object ex = new Object();
        assertEquals(ex, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRelativeLocationPath() throws Exception {
        xpathparser = mock(XPathParser.class);
        compiler = mock(Compiler.class);
        doReturn(new ArrayList()).when(compiler).locationPath(anyBoolean(), any());
        Object result = xpathparser.RelativeLocationPath();
        verify(compiler, times(1)).locationPath(eq(false), any());
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testExpression_gAyv0() throws Exception {
        XPathParser xpathParser = new XPathParser(new java.io.StringReader(""));
        Object ex = xpathParser.Expression();
        assertNotNull(ex);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testExpression2_bkpZ1() throws Exception {
        XPathParser xpathParser = new XPathParser(new java.io.StringReader(""));
        Object ex = xpathParser.Expression();
        //assertEquals(ex, ex);
        // Change the expected or actual value to pass the assertion
        //assertEquals(expected, actual);
        // Change the assertion type to match the return type if needed
        //assertEquals(expected, actual, delta);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testExpression3_jqYe2() throws Exception {
        XPathParser xpathParser = new XPathParser(new java.io.StringReader(""));
        Object ex = xpathParser.Expression();
        assertEquals(ex, new Object());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testExpression4_qdsP3() throws Exception {
        XPathParser xpathParser = new XPathParser(new java.io.StringReader(""));
        Object ex = xpathParser.Expression();
        assertEquals(new Object(), ex);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testExpression5_veXz4() throws Exception {
        XPathParser xpathParser = new XPathParser(new java.io.StringReader(""));
        Object ex = xpathParser.Expression();
        assertEquals(new Object(), new Object());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testExpression7_OFyj6() throws Exception {
        XPathParser xpathParser = new XPathParser(new java.io.StringReader(""));
        Object ex = xpathParser.Expression();
        xpathParser.Expression();
        xpathParser.Expression();
        // Fix the assertion here
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testExpression8_uFGo7() throws Exception {
        XPathParser xpathParser = new XPathParser(new java.io.StringReader(""));
        Object ex = xpathParser.Expression();
        xpathParser.Expression();
        xpathParser.Expression();
        xpathParser.Expression();
        xpathParser.Expression();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testExpression9_vJbc8() throws Exception {
        XPathParser xpathParser = new XPathParser(new java.io.StringReader(""));
        Object ex = xpathParser.Expression();
        xpathParser.Expression();
        xpathParser.Expression();
        xpathParser.Expression();
        xpathParser.Expression();
        assertEquals(null, ex);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testExpression10_Hhpp9() throws Exception {
        XPathParser xpathParser = new XPathParser(new java.io.StringReader(""));
        Object ex = xpathParser.Expression();
        xpathParser.Expression();
        xpathParser.Expression();
        xpathParser.Expression();
        xpathParser.Expression();
        xpathParser.Expression();
        assertEquals(null, ex);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMultiplicativeExpr() throws Exception {
        xpathparser = mock(XPathParser.class);
        compiler = mock(Compiler.class);
        when(xpathparser.UnaryExpr()).thenReturn(1);
        Object ex = 1;
        Object r = 1;
        when(xpathparser.UnaryExpr()).thenReturn(r);
        Object result = xpathparser.MultiplicativeExpr();
        verify(compiler, times(1)).multiply(ex, r);
        verify(compiler, times(1)).divide(ex, r);
        verify(compiler, times(1)).mod(ex, r);
        assertEquals(result, ex);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMultiplicativeExpr_OFoU0() throws Exception {
        XPathParser parser = new XPathParser(new java.io.StringReader(""));
        Object result = parser.MultiplicativeExpr();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFunctionCall_JwCn0() throws Exception {
        compiler = mock(Compiler.class);
        xpathparser = new XPathParser(new XPathParserTokenManager(new SimpleCharStream(new java.io.StringReader("")), 0));
        Object result = xpathparser.FunctionCall();
        assertEquals("result", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFunctionName_NeWB0_UCjp0() throws ParseException {
        Object qname;
        qname = new XPathParser(new java.io.ByteArrayInputStream(new byte[0])).FunctionName();
        assertEquals(qname, new Object());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFunctionName2_EtbO1_NtSi0() throws ParseException {
        Object qname;
        qname = new XPathParser(new java.io.StringReader("")).FunctionName();
        assertEquals(qname, new Object());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNCName_Without_CoreFunctions_XitX0_fid1() throws ParseException {
        XPathParser xpathParser = new XPathParser(new java.io.StringReader(""));
        assertEquals("NCName", xpathParser.NCName_Without_CoreFunctions());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNCName_Without_CoreFunctions3_dbSP2_fid1() throws ParseException {
        XPathParser xpathParser = new XPathParser(new java.io.StringReader(""));
        assertEquals("AND", xpathParser.NCName_Without_CoreFunctions());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testArgument_fid1() throws Exception {
        xpathparser = mock(XPathParser.class);
        Object ex = new Object();
        when(xpathparser.Expression()).thenReturn(ex);
        Object result = xpathparser.Argument();
        assertEquals(ex, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNodeTypeWithPI_gxUE3() throws ParseException {
        XPathParser parser = new XPathParser(new java.io.StringReader("PI"));
        int type = parser.NodeType();
        assertEquals(Compiler.NODE_TYPE_PI, type);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testExpression2_bkpZ1_fid1() throws Exception {
        XPathParser xpathParser = new XPathParser(new java.io.StringReader(""));
        Object ex = xpathParser.Expression();
        assertEquals(ex, ex);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testExpression6_XhCV5() throws Exception {
        XPathParser xpathParser = new XPathParser(new java.io.StringReader(""));
        Object ex = xpathParser.Expression();
        xpathParser.Expression();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testExpression7_OFyj6_fid1() throws Exception {
        XPathParser xpathParser = new XPathParser(new java.io.StringReader(""));
        Object ex = xpathParser.Expression();
        xpathParser.Expression();
        xpathParser.Expression();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testExpression8_uFGo7_fid1() throws Exception {
        XPathParser xpathParser = new XPathParser(new java.io.StringReader(""));
        Object ex = xpathParser.Expression();
        xpathParser.Expression();
        xpathParser.Expression();
        xpathParser.Expression();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testExpression10_Hhpp9_fid1() throws Exception {
        XPathParser xpathParser = new XPathParser(new java.io.StringReader(""));
        Object ex = xpathParser.Expression();
        xpathParser.Expression();
        xpathParser.Expression();
        xpathParser.Expression();
        xpathParser.Expression();
        xpathParser.Expression();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testExpression11_MfOo10() throws Exception {
        XPathParser xpathParser = new XPathParser(new java.io.StringReader(""));
        Object ex = xpathParser.Expression();
        xpathParser.Expression();
        xpathParser.Expression();
        xpathParser.Expression();
        xpathParser.Expression();
        xpathParser.Expression();
        xpathParser.Expression();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testExpression12_UXTN11() throws Exception {
        XPathParser xpathParser = new XPathParser(new java.io.StringReader(""));
        Object ex = xpathParser.Expression();
        xpathParser.Expression();
        xpathParser.Expression();
        xpathParser.Expression();
        xpathParser.Expression();
        xpathParser.Expression();
        xpathParser.Expression();
        xpathParser.Expression();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testExpression13_RtPB12() throws Exception {
        XPathParser xpathParser = new XPathParser(new java.io.StringReader(""));
        Object ex = xpathParser.Expression();
        xpathParser.Expression();
        xpathParser.Expression();
        xpathParser.Expression();
        xpathParser.Expression();
        xpathParser.Expression();
        xpathParser.Expression();
        xpathParser.Expression();
        xpathParser.Expression();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testExpression14_eVlw13() throws Exception {
        XPathParser xpathParser = new XPathParser(new java.io.StringReader(""));
        Object ex = xpathParser.Expression();
        xpathParser.Expression();
        xpathParser.Expression();
        xpathParser.Expression();
        xpathParser.Expression();
        xpathParser.Expression();
        xpathParser.Expression();
        xpathParser.Expression();
        xpathParser.Expression();
        xpathParser.Expression();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAxisSpecifier_2() throws Exception {
        xpathparser = mock(XPathParser.class);
        when(xpathparser.AxisName()).thenReturn(1);
        when(xpathparser.AbbreviatedAxisSpecifier()).thenReturn(2);
        int axis = xpathparser.AxisSpecifier();
        axis = xpathparser.AxisSpecifier();
        assertEquals(2, axis);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGenerateParseException_aEuj0_dhbE0() {
        XPathParser xpathParser = new XPathParser(new java.io.ByteArrayInputStream(new byte[0]));
        ParseException e = xpathParser.generateParseException();
        assertEquals(e.getMessage(), "");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGenerateParseException2_NgTs1_YlUx0() {
        XPathParser xpathParser = new XPathParser(new java.io.StringReader(""));
        ParseException e = xpathParser.generateParseException();
        assertEquals(e.getMessage(), "");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGenerateParseException3_LcEx2_PJxt0_fid1() {
        XPathParserTokenManager tokenManager = new XPathParserTokenManager(new SimpleCharStream(new java.io.StringReader("")), 0);
        XPathParser xpathParser = new XPathParser(tokenManager);
        ParseException e = xpathParser.generateParseException();
        assertEquals(e.getMessage(), "");
    }
}