/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.beans;

import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.*;
import org.apache.commons.jxpath.ri.JXPathContextReferenceImpl;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.ri.model.dom.DOMNodePointer;
import org.apache.commons.jxpath.servlet.KeywordVariables;
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
public class Aster_NullPointer_Test_Failing {
    private QName name;
    private Locale locale;
    private String id;
    private VariablePointer parent;
    private NullPointer nullpointer;
    @Mock
    private JXPathContext context;
    @Mock
    private Object value;
    private VariablePointer variablePointer;
    private KeywordVariables keywordVariables;
    private Locale locale1;
    private NodePointer nodePointer;
    private JXPathContextReferenceImpl contextReference;
    private Pointer pointer;
    private Functions functions;
    private IdentityManager identityManager;
    private KeyManager keyManager;
    private Pointer namespaceContextPointer;
    private Variables vars;
    private CompiledExpression compiledExpression;
    private AbstractFactory factory;
    private JXPathContext parentContext;
    private Object contextBean;
    private Pointer pointer1;
    private Pointer pointer2;
    private Pointer pointer3;
    private Pointer pointer4;
    private Pointer pointer5;
    private Pointer pointer6;
    private Pointer pointer7;
    private Pointer pointer8;
    private Pointer pointer9;
    private Pointer pointer10;
    private Pointer pointer11;
    private Pointer pointer12;
    private Pointer pointer13;
    private Pointer pointer14;
    private Pointer pointer15;
    private Pointer pointer16;
    private Pointer pointer17;
    private Pointer pointer18;
    private Pointer pointer19;
    private Pointer pointer20;
    private Pointer pointer21;
    private Pointer pointer22;
    private Pointer pointer23;
    private Pointer pointer24;
    private Pointer pointer25;
    private Pointer pointer26;
    private Pointer pointer27;
    private Pointer pointer28;
    private Pointer pointer29;
    private Pointer pointer30;
    private Pointer pointer31;
    private Pointer pointer32;
    private Pointer pointer33;
    private Pointer pointer34;
    private Pointer pointer35;
    private Pointer pointer36;
    private Pointer pointer37;
    private Pointer pointer38;
    private Pointer pointer39;
    private Pointer pointer40;
    private Pointer pointer41;
    private Pointer pointer42;
    private Pointer pointer43;
    private Pointer pointer44;
    private Pointer pointer45;
    private Pointer pointer46;
    private Pointer pointer47;
    private Pointer pointer48;
    private Pointer pointer49;
    private Pointer pointer50;
    private Pointer pointer51;
    private Pointer pointer52;
    private Pointer pointer53;
    private Pointer pointer54;
    private Pointer pointer55;
    private Pointer pointer56;
    private Pointer pointer57;
    private Pointer pointer58;
    private Pointer pointer59;
    private Pointer pointer60;
    private Pointer pointer61;
    private Pointer pointer62;
    private Pointer pointer63;
    private Pointer pointer64;
    private Pointer pointer65;
    private Pointer pointer66;
    private Pointer pointer67;
    private Pointer pointer68;
    private Pointer pointer69;
    private Pointer pointer70;
    private Pointer pointer71;
    private Pointer pointer72;
    private Pointer pointer73;
    private Pointer pointer74;
    private Pointer pointer75;
    private Pointer pointer76;
    private Pointer pointer77;
    private Pointer pointer78;
    private Pointer pointer79;
    private Pointer pointer80;
    private Pointer pointer81;
    private Pointer pointer82;
    private Pointer pointer83;
    private Pointer pointer84;
    private Pointer pointer85;
    private Pointer pointer86;
    private Pointer pointer87;
    private Pointer pointer88;
    private Pointer pointer89;
    private Pointer pointer90;
    private Pointer pointer91;
    private Pointer pointer92;
    private Pointer pointer93;
    private Pointer pointer94;
    private Pointer pointer95;
    private Pointer pointer96;
    private Pointer pointer97;
    private Pointer pointer98;
    private Pointer pointer99;
    private Pointer pointer100;
    private Pointer pointer101;
    private Pointer pointer102;
    private Pointer pointer103;
    private Pointer pointer104;
    private Pointer pointer105;
    private Pointer pointer106;
    private Pointer pointer107;
    private Pointer pointer108;
    private Pointer pointer109;
    private Pointer pointer110;
    private Pointer pointer111;
    private Pointer pointer112;
    private Pointer pointer113;
    private Pointer pointer114;
    private Pointer pointer115;
    private Pointer pointer116;
    private Pointer pointer117;
    private Pointer pointer118;
    private DOMNodePointer domNodePointer;
    private NodePointer result;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsCollection() {
        nullpointer = new NullPointer(locale, "id");
        Mockito.when(nullpointer.isCollection()).thenReturn(true);
        assertTrue(nullpointer.isCollection());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testcreatePath() throws Exception {
        nullpointer = new NullPointer(Mockito.mock(Locale.class), "id");
        when(nullpointer.getParent()).thenReturn(Mockito.mock(DOMNodePointer.class));
        NodePointer nodePointer = nullpointer.createPath(Mockito.mock(JXPathContext.class));
        verify(nullpointer.getParent(), times(1)).createPath(Mockito.any());
        assertEquals(nodePointer.getClass(), DOMNodePointer.class);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPath1_FoYu0() {
        VariablePointer variablePointer = new VariablePointer(new QName("$name"));
        String actual = variablePointer.asPath();
        String expected = "$name";
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPath2_zzFq1() {
        KeywordVariables keywordVariables = new KeywordVariables("keyword", new Object());
        VariablePointer variablePointer = new VariablePointer(keywordVariables, new QName("$name"));
        String actual = variablePointer.asPath();
        String expected = "$name";
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLength() {
        nullpointer = new NullPointer(locale, id);
        when(nullpointer.getLength()).thenReturn(0);
        assertEquals(0, nullpointer.getLength());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreatePathWithParent_Sksl0_jPZt0() {
        Locale locale = new Locale("en", "US");
        String id = "123";
        DOMNodePointer parent = new DOMNodePointer(null, locale, id);
        QName name = new QName("test");
        NullPointer nullPointer = new NullPointer(parent, name);
        JXPathContext context = JXPathContext.newContext(null, null);
        NodePointer result = nullPointer.createPath(context, null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreatePathWithoutParent_ydHQ1_IQHJ0() {
        Locale locale = new Locale("en", "US");
        String id = "123";
        QName name = new QName("test");
        NullPointer nullPointer = new NullPointer(locale, id);
        JXPathContext context = JXPathContext.newContext(null, null);
        NodePointer result = nullPointer.createPath(context, null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsCollection_fid1() {
        nullpointer = new NullPointer(locale, "id");
        Mockito.when(nullpointer.isCollection()).thenReturn(false);
        assertFalse(nullpointer.isCollection());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPath1_FoYu0_fid1() {
        VariablePointer variablePointer = new VariablePointer(new QName("name"));
        String actual = variablePointer.asPath();
        String expected = "name";
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPath2_zzFq1_fid1() {
        KeywordVariables keywordVariables = new KeywordVariables("keyword", new Object());
        VariablePointer variablePointer = new VariablePointer(keywordVariables, new QName("name"));
        String actual = variablePointer.asPath();
        String expected = "name";
        assertEquals(expected, actual);
    }
}