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
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_XPathParser_Test_Failing {
    private XPathParserTokenManager tm;
    @Mock
    private Token tokenNext;
    @Mock
    private Token tokenSource;
    @Mock
    private ArrayList args;
    @Mock
    private Token token;
    @Mock
    private Token tokenNextNext;
    @Mock
    private Token nextToken;
    @Mock
    private Token tokenNextNextNext;
    @Mock
    private SimpleCharStream simpleCharStream;
    private int[] jj_la1 = new int[39];
    private Compiler compiler;
    private int jj_gen;
    @Mock
    private Compiler compilerMock;
    @Mock
    private XPathParserTokenManager tokenManagerMock;
    @Mock
    private XPathParserTokenManager tokenManager;
    @Mock
    private SimpleCharStream charStream;
    @Mock
    private java.io.Reader reader;
    @Mock
    private java.io.InputStream inputStream;
    private XPathParser xpathparser;
    private int jj_endpos;
    static private int[] jj_la1_1;
    static private int[] jj_la1_2;
    private int jj_kind = -1;
    private java.util.Vector jj_expentries = new java.util.Vector();
    private int[] jj_expentry;
    static private int[] jj_la1_0;
    private Token jj_scanpos, jj_lastpos;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOrExpr() throws Exception {
        compiler = compilerMock;
        xpathparser = new XPathParser(tokenManagerMock);
        // Arrange
        Object andExprResult = "AndExprResult";
        ArrayList<Object> list = new ArrayList<>();
        list.add(andExprResult);
        // Act
        Object orExprResult = xpathparser.OrExpr();
        // Assert
        Mockito.verify(compilerMock, Mockito.times(1)).or(list.toArray());
        assertEquals(orExprResult, andExprResult);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNCName_Without_CoreFunctions_Default_wbGm5() throws ParseException {
        XPathParser parser = new XPathParser(new java.io.ByteArrayInputStream("Invalid".getBytes()));
        try {
            parser.NCName_Without_CoreFunctions();
            assert false;
        } catch (ParseException e) {
            assert true;
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAndExpr() throws Exception {
        compiler = compilerMock;
        xpathparser = new XPathParser(tokenManagerMock);
        // Arrange
        Object ex = new Object();
        ArrayList list = new ArrayList();
        list.add(ex);
        // Act
        Object result = xpathparser.AndExpr();
        // Assert
        Mockito.verify(compilerMock, Mockito.times(1)).and(list.toArray());
        assertEquals(ex, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAndExpr_ScjT0() throws ParseException {
        XPathParser parser = new XPathParser(new java.io.StringReader("AND"));
        Object result = parser.AndExpr();
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAndExprMultiple_dCuw1() throws ParseException {
        XPathParser parser = new XPathParser(new java.io.StringReader("AND AND"));
        Object result = parser.AndExpr();
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAndExprNoAnd_PCgH2() throws ParseException {
        XPathParser parser = new XPathParser(new java.io.StringReader("EqualityExpr"));
        Object result = parser.AndExpr();
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAdditiveExpr_lKkN0() throws ParseException {
        XPathParser parser = new XPathParser(new java.io.ByteArrayInputStream("1+2+3".getBytes()));
        Object result = parser.AdditiveExpr();
        assertEquals(6, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAdditiveExprWithMultipleTerms_qSFn1() throws ParseException {
        XPathParser parser = new XPathParser(new java.io.ByteArrayInputStream("1+2+3+4+5".getBytes()));
        Object result = parser.AdditiveExpr();
        assertEquals(15, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testQName_JIwn0() throws ParseException {
        XPathParser parser = new XPathParser(new java.io.StringReader("test"));
        Object result = parser.QName();
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReInitWithNullTokenManager_RGEu1() {
        XPathParserTokenManager tokenManager = null;
        XPathParser parser = new XPathParser(tokenManager);
        try {
            parser.ReInit(tokenManager);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testQName_Without_CoreFunctions_Error_VuJF2() {
        XPathParser parser = new XPathParser(new java.io.ByteArrayInputStream("Invalid Input".getBytes()));
        try {
            parser.QName_Without_CoreFunctions();
            fail("Expected ParseException");
        } catch (ParseException e) {
            assertEquals("Invalid token", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReInit_fePU0() throws Exception {
        xpathparser = new XPathParser(tokenManager);
        tokenManager.getNextToken(); // Initialize jj_nt
        int[] jj_la1 = new int[39];
        int jj_gen = 0;
        xpathparser.ReInit(tokenManager);
        Mockito.verify(tokenManager, Mockito.times(1)).ReInit(Mockito.any(SimpleCharStream.class), Mockito.anyInt());
        Mockito.verifyNoMoreInteractions(tokenManager);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFilterExpr_kwxj0() throws Exception {
        compiler = mock(Compiler.class);
        when(compiler.expressionPath(any(), any(), any())).thenReturn("expressionPath");
        SimpleCharStream charStream = new SimpleCharStream(new java.io.StringReader("")); // Initialize the charStream
        XPathParserTokenManager tm = new XPathParserTokenManager(charStream, -1);
        xpathparser = new XPathParser(tm);
        Object ex = mock(Object.class);
        Object p = mock(Object.class);
        ArrayList ps = mock(ArrayList.class);
        when(ps.toArray()).thenReturn(new Object[]{p});
        ArrayList steps = mock(ArrayList.class);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFilterExpr_kwxj0_fid2() throws Exception {
        compiler = mock(Compiler.class);
        when(compiler.expressionPath(any(), any(), any())).thenReturn("expressionPath");
        SimpleCharStream charStream = new SimpleCharStream(new java.io.StringReader("")); // Initialize the charStream
        XPathParserTokenManager tm = new XPathParserTokenManager(charStream, 1); // Fixed the error
        xpathparser = new XPathParser(tm);
        Object ex = mock(Object.class);
        Object p = mock(Object.class);
        ArrayList ps = mock(ArrayList.class);
        when(ps.toArray()).thenReturn(new Object[]{p});
        ArrayList steps = mock(ArrayList.class);
        // Rest of the test case
    }
}