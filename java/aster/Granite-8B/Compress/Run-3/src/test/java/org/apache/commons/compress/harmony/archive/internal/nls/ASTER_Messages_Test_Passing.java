/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.archive.internal.nls;
import java.util.Locale;
import java.util.ResourceBundle;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
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
    public void testGetStringWithBundleNull_CCzI0() throws Exception {
        Messages messages = new Messages();
        String msg = "test";
        String expected = msg;
        String actual = messages.getString(msg);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetStringWithBundleNotNull_zhcG1() throws Exception {
        Messages messages = new Messages();
        String msg = "test";
        String expected = "Missing message: " + msg;
        String actual = messages.getString(msg);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetString_sWFb0() throws Exception {
        String msg = "test";
        Object arg = new Object();
        String expected = "test";
        String actual = Messages.getString(msg, arg);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFormatWithNullArgument_WuDv2() throws Exception {
        assertEquals("Hello, null!", Messages.format("Hello, {0}!", null));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFormatWithNullArguments_BExp9() throws Exception {
        assertEquals("Hello, World!", Messages.format("Hello, World!", (Object[]) null));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFormatWithEmptyArguments_CWmw10() throws Exception {
        assertEquals("Hello, World!", Messages.format("Hello, World!", new Object[0]));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetString_hWyA0() throws Exception {
        String msg = "Hello, {0}";
        int arg = 123;
        String expected = "Hello, 123";
        String actual = Messages.getString(msg, arg);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetString_gRbv0() throws Exception {
        String msg = "Hello, {0} and {1}!";
        Object arg1 = "Alice";
        Object arg2 = "Bob";
        String expected = "Hello, Alice and Bob!";
        String actual = Messages.getString(msg, arg1, arg2);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetString_Oxnj0() throws Exception {
        String msg = "Hello, {0}!";
        char arg = 'W';
        String expected = "Hello, W!";
        String actual = Messages.getString(msg, arg);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetStringWithArgs_UHol0() throws Exception {
        String msg = "Hello, {0}!";
        Object[] args = {"John"};
        String expected = "Hello, John!";
        String actual = Messages.getString(msg, args);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetStringWithoutArgs_Fesg1() throws Exception {
        String msg = "Goodbye, world!";
        String expected = "Goodbye, world!";
        String actual = Messages.getString(msg, null);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetLocale_Bvjx0() throws Exception {
        Locale locale = new Locale("en", "US");
        String resource = "messages";
        ResourceBundle bundle = Messages.setLocale(locale, resource);
        assertNotNull(bundle);
    }
}