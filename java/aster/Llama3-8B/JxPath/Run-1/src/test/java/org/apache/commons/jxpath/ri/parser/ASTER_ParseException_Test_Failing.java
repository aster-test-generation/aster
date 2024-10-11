/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.parser;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_ParseException_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMessage2_PomI1() {
        ParseException e = new ParseException();
        String result = e.getMessage();
        assertEquals("message", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMessage3_CWYo2() {
        ParseException e = new ParseException(new Token(), new int[][]{{1, 2}}, new String[]{"a", "b"});
        String result = e.getMessage();
        assertEquals("message", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMessage4_JTqt3() {
        ParseException e = new ParseException(new Token(), new int[][]{{1}}, new String[]{"a"});
        String result = e.getMessage();
        assertEquals("message", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMessage5_GDTZ4() {
        ParseException e = new ParseException(new Token(), new int[][]{{1, 2, 3}}, new String[]{"a", "b", "c"});
        String result = e.getMessage();
        assertEquals("message", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMessage6_EGok5() {
        ParseException e = new ParseException(new Token(), new int[][]{{1, 2, 3, 4}}, new String[]{"a", "b", "c", "d"});
        String result = e.getMessage();
        assertEquals("message", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMessage7_gukd6() {
        ParseException e = new ParseException(new Token(), new int[][]{{1, 2, 3, 4, 5}}, new String[]{"a", "b", "c", "d", "e"});
        String result = e.getMessage();
        assertEquals("message", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMessage8_dDWh7() {
        ParseException e = new ParseException(new Token(), new int[][]{{1, 2, 3, 4, 5, 6}}, new String[]{"a", "b", "c", "d", "e", "f"});
        String result = e.getMessage();
        assertEquals("message", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMessage9_Nyzc8() {
        ParseException e = new ParseException(new Token(), new int[][]{{1, 2, 3, 4, 5, 6, 7}}, new String[]{"a", "b", "c", "d", "e", "f", "g"});
        String result = e.getMessage();
        assertEquals("message", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMessage10_yIGP9() {
        ParseException e = new ParseException(new Token(), new int[][]{{1, 2, 3, 4, 5, 6, 7, 8}}, new String[]{"a", "b", "c", "d", "e", "f", "g", "h"});
        String result = e.getMessage();
        assertEquals("message", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddEscapes4_HxsF3() {
        ParseException parser = new ParseException();
        String str = "Hello\\u0001World";
        String result = parser.add_escapes(str);
        assertEquals("Hello\\u0001World", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddEscapes4_HxsF3_fid1() {
        ParseException parser = new ParseException();
        String str = "Hello\u0001World";
        String result = parser.add_escapes(str);
        assertEquals("Hello\u0001World", result);
    }
}