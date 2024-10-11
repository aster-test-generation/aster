/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.archive.internal.nls;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_Messages_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetStringWithBundle_BUcf0() throws Exception {
        Messages messages = new Messages();
        String msg = "test";
        String expected = "test";
        String actual = messages.getString(msg);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetStringWithoutBundle_YziL1() throws Exception {
        Messages messages = new Messages();
        String msg = "test";
        String expected = "Missing message: test";
        String actual = messages.getString(msg);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetString_BSTJ0() throws Exception {
        String msg = "Hello, {0}!";
        Object arg = "World";
        String expected = "Hello, World!";
        String actual = Messages.getString(msg, arg);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testFormat_yMVU0_2() throws Exception {
        assertEquals("Hello, World!", Messages.format("Hello, {0}!", null));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testFormat_yMVU0_4() throws Exception {
        assertEquals("Hello, World!", Messages.format("Hello, {0}!", new Object[] {null}));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testFormat_yMVU0_5() throws Exception {
        assertEquals("Hello, World!", Messages.format("Hello, {0}!", new Object[] {new Object()}));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testFormat_yMVU0_6() throws Exception {
        assertEquals("Hello, World!", Messages.format("Hello, {0}!", new Object[] {null, null}));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testFormat_yMVU0_7() throws Exception {
        assertEquals("Hello, World!", Messages.format("Hello, {0}!", new Object[] {new Object(), new Object()}));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testFormat_yMVU0_8() throws Exception {
        assertEquals("Hello, World!", Messages.format("Hello, {0}!", new Object[] {null, null, null}));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testFormat_yMVU0_9() throws Exception {
        assertEquals("Hello, World!", Messages.format("Hello, {0}!", new Object[] {new Object(), new Object(), new Object()}));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testFormat_yMVU0_10() throws Exception {
        assertEquals("Hello, World!", Messages.format("Hello, {0}!", new Object[] {null, null, null, null}));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getStringTest_JaRT0() throws Exception {
        String msg = "Hello, {0}";
        int arg = 123;
        String expected = "Hello, 123";
        String actual = Messages.getString(msg, arg);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetString_svzO0() throws Exception {
        String msg = "Hello, {0} and {1}!";
        Object arg1 = "Alice";
        Object arg2 = "Bob";
        String expected = "Hello, Alice and Bob!";
        String actual = Messages.getString(msg, arg1, arg2);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetStringChar_mBpj0() throws Exception {
        Messages messages = new Messages();
        String msg = "test";
        char arg = 'a';
        String expected = "testa";
        String actual = messages.getString(msg, arg);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetString_SEjj0() throws Exception {
        String msg = "test";
        Object[] args = {};
        String expected = "test";
        String actual = Messages.getString(msg, args);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetStringWithArgs_DhzO1() throws Exception {
        String msg = "test";
        Object[] args = {"arg"};
        String expected = "test";
        String actual = Messages.getString(msg, args);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetLocale_pEby0() throws Exception {
        Locale locale = null;
        String resource = "";
        ResourceBundle result = Messages.setLocale(locale, resource);
        assertNotNull(result);
    }
}