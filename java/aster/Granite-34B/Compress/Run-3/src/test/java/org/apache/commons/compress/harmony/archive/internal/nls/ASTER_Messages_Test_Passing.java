/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.archive.internal.nls;
import java.util.Locale;
import java.util.ResourceBundle;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Locale;
import java.util.ResourceBundle;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_Messages_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getString_withExistingMessage_returnsCorrectString_FpSv0() throws Exception {
        String expected = "Hello";
        String actual = Messages.getString("hello");
        assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getString_withNonExistingMessage_returnsDefaultMessage_XwHA1() throws Exception {
        String expected = "Missing message: goodbye";
        String actual = Messages.getString("goodbye");
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getString_withNullMessage_returnsNull_GHJH4() throws Exception {
        String expected = null;
        String actual = Messages.getString(null);
        assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getString_withEmptyMessage_returnsEmptyMessage_JzOV5() throws Exception {
        String expected = "";
        String actual = Messages.getString("");
        assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void getStringWithOneArgument_Vniq0() throws Exception {
        String result = Messages.getString("message", "argument");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void getStringWithMultipleArguments_Njtd1() throws Exception {
        String result = Messages.getString("message", "argument1", "argument2");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void getStringWithNoArguments_QsqK2() throws Exception {
        String result = Messages.getString("message");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetStringWithArg_fewB0() throws Exception {
        String result = Messages.getString("message", 1);
        assertEquals("message 1", result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetStringWithoutArg_oecj1() throws Exception {
        String result = Messages.getString("message");
        assertEquals("message", result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetStringWithNullMsg_XipD2() throws Exception {
        String result = Messages.getString(null, 1);
        assertEquals("null 1", result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetStringWithNullArgs_Ayie3() throws Exception {
        String result = Messages.getString("message", (Object[]) null);
        assertEquals("message null", result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetStringWithEmptyArgs_edXI4() throws Exception {
        String result = Messages.getString("message", new Object[0]);
        assertEquals("message ", result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetString_iWPW0() throws Exception {
        String msg = "test message";
        Object arg1 = "arg1";
        Object arg2 = "arg2";
        String expected =Messages.getString(msg, arg1, arg2);
        String actual = Messages.getString(msg, arg1, arg2);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetStringWithNullArg1_ZpCz1() throws Exception {
        String msg = "test message";
        Object arg1 = null;
        Object arg2 = "arg2";
        String expected =Messages.getString(msg, arg1, arg2);
        String actual = Messages.getString(msg, arg1, arg2);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetStringWithNullArg2_vMKF2() throws Exception {
        String msg = "test message";
        Object arg1 = "arg1";
        Object arg2 = null;
        String expected =Messages.getString(msg, arg1, arg2);
        String actual = Messages.getString(msg, arg1, arg2);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetStringWithNullArgs_nWcn3() throws Exception {
        String msg = "test message";
        Object arg1 = null;
        Object arg2 = null;
        String expected =Messages.getString(msg, arg1, arg2);
        String actual = Messages.getString(msg, arg1, arg2);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetString_weon0() throws Exception {
		assertEquals("a", Messages.getString("a", 'a'));
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetString2_ylzx1() throws Exception {
		assertEquals("a", Messages.getString("a", new Object()));
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetString3_NnJl2() throws Exception {
		assertEquals("a", Messages.getString("a", new Object[] { new Object() }));
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetString4_ufXQ3() throws Exception {
		assertEquals("a", Messages.getString("a", new Object[] { new Object(), new Object() }));
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetString5_NgGR4() throws Exception {
		assertEquals("a", Messages.getString("a", new Object[] { new Object(), new Object(), new Object() }));
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetString6_psON5() throws Exception {
		assertEquals("a", Messages.getString("a", new Object[] { new Object(), new Object(), new Object(), new Object() }));
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetString7_mcLL6() throws Exception {
		assertEquals("a", Messages.getString("a", new Object[] { new Object(), new Object(), new Object(), new Object(), new Object() }));
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetString8_GGAt7() throws Exception {
		assertEquals("a", Messages.getString("a", new Object[] { new Object(), new Object(), new Object(), new Object(), new Object(), new Object() }));
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetString9_Tncp8() throws Exception {
		assertEquals("a", Messages.getString("a", new Object[] { new Object(), new Object(), new Object(), new Object(), new Object(), new Object(), new Object() }));
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetString10_CCGc9() throws Exception {
		assertEquals("a", Messages.getString("a", new Object[] { new Object(), new Object(), new Object(), new Object(), new Object(), new Object(), new Object(), new Object() }));
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getString_withValidMessageAndArguments_returnsFormattedString_LXHQ0() throws Exception {
        String msg = "test_message";
        Object[] args = {"arg1", "arg2"};
        String expected = "Formatted string with arg1 and arg2";
        String actual = Messages.getString(msg, args);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getString_withInvalidMessage_returnsMessage_YBAQ1() throws Exception {
        String msg = "invalid_message";
        Object[] args = {};
        String expected = "invalid_message";
        String actual = Messages.getString(msg, args);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetLocale_aXHt0() throws Exception {
        Locale locale = Locale.US;
        String resource = "messages";
        ResourceBundle bundle = Messages.setLocale(locale, resource);
        assertEquals(bundle.getLocale(), locale);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetLocaleWithMissingResource_pMlq2() throws Exception {
        Locale locale = Locale.UK;
        String resource = "invalid_resource";
        ResourceBundle bundle = Messages.setLocale(locale, resource);
        assertEquals(bundle, null);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFormat_AyVx0_4() throws Exception {
        assertEquals("null", Messages.format("{0}", null));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFormat_AyVx0_5() throws Exception {
        assertEquals("100", Messages.format("{0}", new Object[]{new Integer(100)}));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFormat_AyVx0_6() throws Exception {
        assertEquals("100", Messages.format("{0}", new String[]{"100"}));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFormat_AyVx0_7() throws Exception {
        assertEquals("100", Messages.format("{0}", new Object[]{100}));}
}