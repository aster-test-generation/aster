/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.parser;

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
public class Aster_XPathParser_Test_Failing {
    private int[] jj_la1 = new int[39];
    @Mock
    private Compiler compiler;
    private int jj_gen;
    private XPathParser xpathparser;
    @Mock
    private SimpleCharStream simpleCharStream;
    private int jj_endpos;
    static private int[] jj_la1_1;
    static private int[] jj_la1_2;
    private int jj_kind = -1;
    private java.util.Vector jj_expentries = new java.util.Vector();
    private int[] jj_expentry;
    static private int[] jj_la1_0;
    @Mock
    private SimpleCharStream stream;
    @Mock
    private XPathParserTokenManager tm;
    @Mock
    private ParseException exception;
    @Mock
    private XPathParserTokenManager tokenManager;
    private Token jj_scanpos, jj_lastpos;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void ReInit(final SimpleCharStream stream) {
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void ReInit(final SimpleCharStream stream, final int lexState) {
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void ReInit(final java.io.InputStream stream) {
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void ReInit(final java.io.InputStream stream, final String encoding) {
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void ReInit(final java.io.Reader stream) {
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void ReInit(final java.io.Reader stream, final String encoding) {
    }
}