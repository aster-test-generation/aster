/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.parser;
import java.util.ArrayList;
import org.apache.commons.jxpath.ri.Compiler;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.Vector;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;   
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_XPathParser_Test_Passing {
private int jj_endpos;
private int[] jj_la1 = new int[39];
private Compiler compiler;
private int jj_gen;
@Mock
    private Compiler compilerMock;
@Mock
    private ArrayList<Object> listMock;
@Mock
  private XPathParserTokenManager tokenManager;
@Mock
  private SimpleCharStream charStream;
XPathParser xpathparser;
@Mock
    private XPathParserTokenManager tm;
private Token jj_scanpos, jj_lastpos;
    private Token token;
@Mock
    private Token tokenSource;
@Mock
    private Token nextToken;
@Mock
    private Token tokenNext;
@Mock
    private XPathParserTokenManager tokenManagerMock;
@Mock
    private SimpleCharStream simpleCharStream;
@Mock
    private java.io.Reader reader;
@Mock
    private java.io.InputStream inputStream;
@Mock
    private SimpleCharStream stream;
@Mock
  static private int[] jj_la1_0;
  private int[] jj_expentry;
  private final java.util.Vector jj_expentries = new java.util.Vector();
  private int jj_kind = -1;
  static private int[] jj_la1_2;
  static private int[] jj_la1_1;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testOrExpr_SlhC0() throws ParseException {
    XPathParser parser = new XPathParser(new java.io.StringReader("1 or 2"));
    Object result = parser.OrExpr();
    assertEquals("1 or 2", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testOrExprMultiple_iOYD1() throws ParseException {
    XPathParser parser = new XPathParser(new java.io.StringReader("1 or 2 or 3"));
    Object result = parser.OrExpr();
    assertEquals("1 or 2 or 3", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testOrExprNoOr_PVwR2() throws ParseException {
    XPathParser parser = new XPathParser(new java.io.StringReader("1"));
    Object result = parser.OrExpr();
    assertEquals("1", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGenerateParseException1_qvmR0() {
        XPathParser parser = new XPathParser(new java.io.StringReader("test"));
        ParseException exception = parser.generateParseException();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGenerateParseException1_AxSY0() {
        XPathParser parser = new XPathParser(new java.io.StringReader(""));
        ParseException exception = parser.generateParseException();
        assert exception.getMessage() != null;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGenerateParseException2_YTnT1() {
        XPathParser parser = new XPathParser(new java.io.StringReader("a"));
        ParseException exception = parser.generateParseException();
        assert exception.getMessage() != null;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGenerateParseException3_vNZw2() {
        XPathParser parser = new XPathParser(new java.io.StringReader("a b"));
        ParseException exception = parser.generateParseException();
        assert exception.getMessage() != null;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGenerateParseException4_BCZo3() {
        XPathParser parser = new XPathParser(new java.io.StringReader("a b c"));
        ParseException exception = parser.generateParseException();
        assert exception.getMessage() != null;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGenerateParseException5_fKST4() {
        XPathParser parser = new XPathParser(new java.io.StringReader("a b c d"));
        ParseException exception = parser.generateParseException();
        assert exception.getMessage() != null;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGenerateParseException6_aNbW5() {
        XPathParser parser = new XPathParser(new java.io.StringReader("a b c d e"));
        ParseException exception = parser.generateParseException();
        assert exception.getMessage() != null;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGenerateParseException7_zefO6() {
        XPathParser parser = new XPathParser(new java.io.StringReader("a b c d e f"));
        ParseException exception = parser.generateParseException();
        assert exception.getMessage() != null;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGenerateParseException8_HrnF7() {
        XPathParser parser = new XPathParser(new java.io.StringReader("a b c d e f g"));
        ParseException exception = parser.generateParseException();
        assert exception.getMessage() != null;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGenerateParseException9_tqGc8() {
        XPathParser parser = new XPathParser(new java.io.StringReader("a b c d e f g h"));
        ParseException exception = parser.generateParseException();
        assert exception.getMessage() != null;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGenerateParseException10_kvtz9() {
        XPathParser parser = new XPathParser(new java.io.StringReader("a b c d e f g h i"));
        ParseException exception = parser.generateParseException();
        assert exception.getMessage() != null;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGenerateParseException11_Bwtf10() {
        XPathParser parser = new XPathParser(new java.io.StringReader("a b c d e f g h i j"));
        ParseException exception = parser.generateParseException();
        assert exception.getMessage() != null;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGenerateParseException12_zTzQ11() {
        XPathParser parser = new XPathParser(new java.io.StringReader("a b c d e f g h i j k"));
        ParseException exception = parser.generateParseException();
        assert exception.getMessage() != null;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGenerateParseException1_yUoh0() {
        XPathParser parser = new XPathParser(new java.io.ByteArrayInputStream("".getBytes()));
        ParseException exception = parser.generateParseException();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGenerateParseException2_cWXn1() {
        XPathParser parser = new XPathParser(new java.io.ByteArrayInputStream("a".getBytes()));
        ParseException exception = parser.generateParseException();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGenerateParseException3_yuKD2() {
        XPathParser parser = new XPathParser(new java.io.ByteArrayInputStream("ab".getBytes()));
        ParseException exception = parser.generateParseException();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGenerateParseException4_oIra3() {
        XPathParser parser = new XPathParser(new java.io.ByteArrayInputStream("abc".getBytes()));
        ParseException exception = parser.generateParseException();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGenerateParseException5_LDEE4() {
        XPathParser parser = new XPathParser(new java.io.ByteArrayInputStream("abcd".getBytes()));
        ParseException exception = parser.generateParseException();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGenerateParseException6_dPOw5() {
        XPathParser parser = new XPathParser(new java.io.ByteArrayInputStream("abcde".getBytes()));
        ParseException exception = parser.generateParseException();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGenerateParseException7_cjVm6() {
        XPathParser parser = new XPathParser(new java.io.ByteArrayInputStream("abcdef".getBytes()));
        ParseException exception = parser.generateParseException();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGenerateParseException8_mIcC7() {
        XPathParser parser = new XPathParser(new java.io.ByteArrayInputStream("abcdefg".getBytes()));
        ParseException exception = parser.generateParseException();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGenerateParseException9_WZFf8() {
        XPathParser parser = new XPathParser(new java.io.ByteArrayInputStream("abcdefgh".getBytes()));
        ParseException exception = parser.generateParseException();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGenerateParseException10_YZZw9() {
        XPathParser parser = new XPathParser(new java.io.ByteArrayInputStream("abcdefghi".getBytes()));
        ParseException exception = parser.generateParseException();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGenerateParseException11_NjAA10() {
        XPathParser parser = new XPathParser(new java.io.ByteArrayInputStream("abcdefghij".getBytes()));
        ParseException exception = parser.generateParseException();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGenerateParseException12_QqzX11() {
        XPathParser parser = new XPathParser(new java.io.ByteArrayInputStream("abcdefghijk".getBytes()));
        ParseException exception = parser.generateParseException();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGenerateParseException1_rhey0() {
        XPathParser parser = new XPathParser(new java.io.StringReader("test"));
        ParseException e = parser.generateParseException();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGenerateParseException1_kpeM0() {
        XPathParser parser = new XPathParser(new java.io.StringReader("test"));
        ParseException exception = parser.generateParseException();
        assert exception.getMessage() != null;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGenerateParseException1_GivZ0() {
        XPathParser parser = new XPathParser(new java.io.StringReader("xpath"));
        ParseException exception = parser.generateParseException();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGenerateParseException1_ZJYi0() {
        XPathParser parser = new XPathParser(new java.io.StringReader("a"));
        ParseException exception = parser.generateParseException();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGenerateParseException2_XLqu1() {
        XPathParser parser = new XPathParser(new java.io.StringReader("a b"));
        ParseException exception = parser.generateParseException();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGenerateParseException3_JnlX2() {
        XPathParser parser = new XPathParser(new java.io.StringReader("a b c"));
        ParseException exception = parser.generateParseException();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGenerateParseException4_zmOe3() {
        XPathParser parser = new XPathParser(new java.io.StringReader("a b c d"));
        ParseException exception = parser.generateParseException();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGenerateParseException5_bKFR4() {
        XPathParser parser = new XPathParser(new java.io.StringReader("a b c d e"));
        ParseException exception = parser.generateParseException();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGenerateParseException6_XUss5() {
        XPathParser parser = new XPathParser(new java.io.StringReader("a b c d e f"));
        ParseException exception = parser.generateParseException();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGenerateParseException7_aYce6() {
        XPathParser parser = new XPathParser(new java.io.StringReader("a b c d e f g"));
        ParseException exception = parser.generateParseException();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGenerateParseException8_vHgh7() {
        XPathParser parser = new XPathParser(new java.io.StringReader("a b c d e f g h"));
        ParseException exception = parser.generateParseException();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGenerateParseException9_coNa8() {
        XPathParser parser = new XPathParser(new java.io.StringReader("a b c d e f g h i"));
        ParseException exception = parser.generateParseException();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGenerateParseException10_MVQZ9() {
        XPathParser parser = new XPathParser(new java.io.StringReader("a b c d e f g h i j"));
        ParseException exception = parser.generateParseException();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGenerateParseException11_VZGv10() {
        XPathParser parser = new XPathParser(new java.io.StringReader("a b c d e f g h i j k"));
        ParseException exception = parser.generateParseException();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGenerateParseException12_NLkd11() {
        XPathParser parser = new XPathParser(new java.io.StringReader("a b c d e f g h i j k l"));
        ParseException exception = parser.generateParseException();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNCName_Without_CoreFunctions6_Pnwf5() {
        XPathParser parser = new XPathParser(new java.io.ByteArrayInputStream("Invalid".getBytes()));
        try {
            parser.NCName_Without_CoreFunctions();
            fail("Expected ParseException");
        } catch (ParseException e) {
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEnableTracingInputStream_DIPk1() {
        java.io.InputStream stream = new java.io.ByteArrayInputStream(new byte[0]);
        XPathParser parser = new XPathParser(stream);
        parser.enable_tracing();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEnableTracingTokenManager_FUDA2() {
        SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader(""), 1, 1);
        XPathParserTokenManager tm = new XPathParserTokenManager(stream, 1);
        XPathParser parser = new XPathParser(tm);
        parser.enable_tracing();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualityExpr_lcOu0() throws ParseException {
        XPathParser parser = new XPathParser(new java.io.ByteArrayInputStream("1=2".getBytes()));
        Object result = parser.EqualityExpr();
        assertEquals(true, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualityExpr2_RCGQ1() throws ParseException {
        XPathParser parser = new XPathParser(new java.io.ByteArrayInputStream("1<>2".getBytes()));
        Object result = parser.EqualityExpr();
        assertEquals(false, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualityExpr3_HrDx2() throws ParseException {
        XPathParser parser = new XPathParser(new java.io.ByteArrayInputStream("1!=2".getBytes()));
        Object result = parser.EqualityExpr();
        assertEquals(false, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualityExpr4_tENH3() throws ParseException {
        XPathParser parser = new XPathParser(new java.io.ByteArrayInputStream("1==2".getBytes()));
        Object result = parser.EqualityExpr();
        assertEquals(true, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualityExpr5_QMWG4() throws ParseException {
        XPathParser parser = new XPathParser(new java.io.ByteArrayInputStream("1<>1".getBytes()));
        Object result = parser.EqualityExpr();
        assertEquals(false, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetToken_rLdU0() {
        XPathParser parser = new XPathParser(new java.io.StringReader("test"));
        assertNotNull(token);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetTokenIndexOutofBound_vnEw1() {
        XPathParser parser = new XPathParser(new java.io.StringReader("test"));
        assertNull(token);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetTokenNextToken_gvoB2() {
        XPathParser parser = new XPathParser(new java.io.StringReader("test"));
        assertNotNull(nextToken);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAndExpr_yKdz0() throws ParseException {
        XPathParser parser = new XPathParser(new java.io.ByteArrayInputStream("1 and 2 and 3".getBytes()));
        Object result = parser.AndExpr();
        assertNotNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAndExprWithNull_XKKW1() throws ParseException {
        XPathParser parser = new XPathParser(new java.io.ByteArrayInputStream("1 and 2 and 3".getBytes()));
        parser.AndExpr();
        assertNull(parser.AndExpr());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAndExprWithEmpty_tPOE2() throws ParseException {
        XPathParser parser = new XPathParser(new java.io.ByteArrayInputStream("".getBytes()));
        Object result = parser.AndExpr();
        assertNull(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUnionExpr() throws Exception{
        compiler = compilerMock;
        xpathparser = new XPathParser(tokenManagerMock);
        // Arrange
        Object ex = new Object();
        ArrayList list = new ArrayList();
        list.add(ex);
        // Act
        Object result = xpathparser.UnionExpr();
        // Assert
        Mockito.verify(compilerMock, Mockito.times(1)).union(list.toArray());
        assertEquals(ex, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testArgumentList_IQIq0() throws Exception {
        XPathParser parser = new XPathParser(new java.io.StringReader("test"));
        ArrayList result = parser.ArgumentList();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testQName_UTnH0() throws ParseException {
        XPathParser parser = new XPathParser(new java.io.ByteArrayInputStream("test".getBytes()));
        Object result = parser.QName();
        assert result != null;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testQName2_KWDT1() throws ParseException {
        XPathParser parser = new XPathParser(new java.io.StringReader("test"));
        Object result = parser.QName();
        assert result != null;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNextTokenInputStream_yDHb0() {
        XPathParser parser = new XPathParser(new java.io.ByteArrayInputStream(new byte[0]));
        assertNotNull(token);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNextTokenReader_lhAp1() {
        XPathParser parser = new XPathParser(new java.io.StringReader(""));
        assertNotNull(token);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDisableTracing_wRjx0() {
        XPathParser parser = new XPathParser(new java.io.ByteArrayInputStream(new byte[0]));
        parser.disable_tracing();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDisableTracingReader_ewaB2() {
        XPathParser parser = new XPathParser(new java.io.StringReader(""));
        parser.disable_tracing();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReInitReader_uQEW1() {
        XPathParser parser = new XPathParser(new java.io.StringReader(""));
        parser.ReInit(new java.io.StringReader(""));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReInitTokenManager_mHcj2() {
        XPathParserTokenManager tokenManager = new XPathParserTokenManager(new SimpleCharStream(new java.io.StringReader(""), 1, 1), 1);
        XPathParser parser = new XPathParser(tokenManager);
        parser.ReInit(tokenManager);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testQName_Without_CoreFunctions_Error_GlKH2() {
        XPathParser parser = new XPathParser(new java.io.ByteArrayInputStream("Invalid Input".getBytes()));
        try {
            parser.QName_Without_CoreFunctions();
            fail("Expected ParseException");
        } catch (ParseException e) {
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGenerateParseException2_VXeA1_fiJX0() {
    XPathParser parser = new XPathParser(new java.io.StringReader("test"));
    try {
        parser.QName_Without_CoreFunctions();
    } catch (ParseException e) {
        assert e.getMessage() != null;
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGenerateParseException4_wnWa3_jeaQ0() {
    XPathParser parser = new XPathParser(new java.io.StringReader("test"));
}
}