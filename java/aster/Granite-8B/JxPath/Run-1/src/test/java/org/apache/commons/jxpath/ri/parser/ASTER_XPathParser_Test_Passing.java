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

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_XPathParser_Test_Passing {
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
    public void testGenerateParseException1_KFYm0() {
        XPathParser parser = new XPathParser(new java.io.StringReader("test"));
        ParseException exception = parser.generateParseException();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGenerateParseException1_WytM0() {
        XPathParser parser = new XPathParser(new java.io.StringReader(""));
        ParseException exception = parser.generateParseException();
        assert exception.getMessage() != null;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGenerateParseException2_DWko1() {
        XPathParser parser = new XPathParser(new java.io.StringReader("abc"));
        ParseException exception = parser.generateParseException();
        assert exception.getMessage() != null;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGenerateParseException3_kKKy2() {
        XPathParser parser = new XPathParser(new java.io.StringReader("abc/"));
        ParseException exception = parser.generateParseException();
        assert exception.getMessage() != null;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGenerateParseException4_oJzD3() {
        XPathParser parser = new XPathParser(new java.io.StringReader("abc//"));
        ParseException exception = parser.generateParseException();
        assert exception.getMessage() != null;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGenerateParseException5_iDAR4() {
        XPathParser parser = new XPathParser(new java.io.StringReader("abc/def"));
        ParseException exception = parser.generateParseException();
        assert exception.getMessage() != null;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGenerateParseException6_MlIN5() {
        XPathParser parser = new XPathParser(new java.io.StringReader("abc//def"));
        ParseException exception = parser.generateParseException();
        assert exception.getMessage() != null;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGenerateParseException7_PjRv6() {
        XPathParser parser = new XPathParser(new java.io.StringReader("abc/def/"));
        ParseException exception = parser.generateParseException();
        assert exception.getMessage() != null;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGenerateParseException8_wIqq7() {
        XPathParser parser = new XPathParser(new java.io.StringReader("abc//def//"));
        ParseException exception = parser.generateParseException();
        assert exception.getMessage() != null;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGenerateParseException9_aMIf8() {
        XPathParser parser = new XPathParser(new java.io.StringReader("abc/def/ghi"));
        ParseException exception = parser.generateParseException();
        assert exception.getMessage() != null;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGenerateParseException10_amZB9() {
        XPathParser parser = new XPathParser(new java.io.StringReader("abc//def//ghi"));
        ParseException exception = parser.generateParseException();
        assert exception.getMessage() != null;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGenerateParseException11_ZnAq10() {
        XPathParser parser = new XPathParser(new java.io.StringReader("abc/def/ghi/jkl"));
        ParseException exception = parser.generateParseException();
        assert exception.getMessage() != null;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGenerateParseException12_BiSq11() {
        XPathParser parser = new XPathParser(new java.io.StringReader("abc//def//ghi/jkl"));
        ParseException exception = parser.generateParseException();
        assert exception.getMessage() != null;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGenerateParseException1_Iuky0() {
        XPathParser parser = new XPathParser(new java.io.StringReader(""));
        ParseException exception = parser.generateParseException();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGenerateParseException2_sgiP1() {
        XPathParser parser = new XPathParser(new java.io.StringReader("a"));
        ParseException exception = parser.generateParseException();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGenerateParseException3_LQRJ2() {
        XPathParser parser = new XPathParser(new java.io.StringReader("ab"));
        ParseException exception = parser.generateParseException();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGenerateParseException4_zqKj3() {
        XPathParser parser = new XPathParser(new java.io.StringReader("abc"));
        ParseException exception = parser.generateParseException();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGenerateParseException5_hKqN4() {
        XPathParser parser = new XPathParser(new java.io.StringReader("abcd"));
        ParseException exception = parser.generateParseException();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGenerateParseException6_JcPU5() {
        XPathParser parser = new XPathParser(new java.io.StringReader("abcde"));
        ParseException exception = parser.generateParseException();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGenerateParseException7_zkfc6() {
        XPathParser parser = new XPathParser(new java.io.StringReader("abcdef"));
        ParseException exception = parser.generateParseException();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGenerateParseException8_Ogly7() {
        XPathParser parser = new XPathParser(new java.io.StringReader("abcdefg"));
        ParseException exception = parser.generateParseException();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGenerateParseException9_TGkG8() {
        XPathParser parser = new XPathParser(new java.io.StringReader("abcdefgh"));
        ParseException exception = parser.generateParseException();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGenerateParseException10_zkfx9() {
        XPathParser parser = new XPathParser(new java.io.StringReader("abcdefghi"));
        ParseException exception = parser.generateParseException();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGenerateParseException11_DicQ10() {
        XPathParser parser = new XPathParser(new java.io.StringReader("abcdefghij"));
        ParseException exception = parser.generateParseException();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGenerateParseException12_zSCc11() {
        XPathParser parser = new XPathParser(new java.io.StringReader("abcdefghijk"));
        ParseException exception = parser.generateParseException();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNCName_Without_CoreFunctions_iNDj0() throws ParseException {
        XPathParser parser = new XPathParser(new java.io.ByteArrayInputStream("NCName".getBytes()));
        String result = parser.NCName_Without_CoreFunctions();
        assert result.equals("NCName");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNCName_Without_CoreFunctions_OR_hAOG1() throws ParseException {
        XPathParser parser = new XPathParser(new java.io.ByteArrayInputStream("OR".getBytes()));
        String result = parser.NCName_Without_CoreFunctions();
        assert result.equals("OR");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNCName_Without_CoreFunctions_AND_hGXl2() throws ParseException {
        XPathParser parser = new XPathParser(new java.io.ByteArrayInputStream("AND".getBytes()));
        String result = parser.NCName_Without_CoreFunctions();
        assert result.equals("AND");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNCName_Without_CoreFunctions_MOD_Qvut3() throws ParseException {
        XPathParser parser = new XPathParser(new java.io.ByteArrayInputStream("MOD".getBytes()));
        String result = parser.NCName_Without_CoreFunctions();
        assert result.equals("MOD");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNCName_Without_CoreFunctions_DIV_YkPx4() throws ParseException {
        XPathParser parser = new XPathParser(new java.io.ByteArrayInputStream("DIV".getBytes()));
        String result = parser.NCName_Without_CoreFunctions();
        assert result.equals("DIV");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEnableTracing_AInJ0() {
        XPathParser parser = new XPathParser(new java.io.ByteArrayInputStream(new byte[0]));
        parser.enable_tracing();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDisableTracing_KHzu0() {
        XPathParser parser = new XPathParser(new java.io.ByteArrayInputStream(new byte[0]));
        parser.disable_tracing();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGenerateParseException8_MqML7_Xjpd0() {
        XPathParser parser = new XPathParser(new java.io.StringReader("test"));
    }
}