/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.parser;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_SimpleCharStream_Coverage_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateLineColumnWithPrevCharIsLF_jyCm0_1() {
        SimpleCharStream stream = new SimpleCharStream(System.in);
        stream.prevCharIsLF = true;
        stream.column = 5;
        stream.line = 1;
        stream.UpdateLineColumn('a');
        assertFalse(stream.prevCharIsLF);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateLineColumnWithPrevCharIsLF_jyCm0_2() {
        SimpleCharStream stream = new SimpleCharStream(System.in);
        stream.prevCharIsLF = true;
        stream.column = 5;
        stream.line = 1;
        stream.UpdateLineColumn('a');
        assertEquals(2, stream.line);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateLineColumnWithPrevCharIsLF_jyCm0_3() {
        SimpleCharStream stream = new SimpleCharStream(System.in);
        stream.prevCharIsLF = true;
        stream.column = 5;
        stream.line = 1;
        stream.UpdateLineColumn('a');
        assertEquals(1, stream.column);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateLineColumnWithPrevCharIsCRFollowedByNonNewline_voAZ1_1() {
        SimpleCharStream stream = new SimpleCharStream(System.in);
        stream.prevCharIsCR = true;
        stream.column = 5;
        stream.line = 1;
        stream.UpdateLineColumn('a');
        assertFalse(stream.prevCharIsCR);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateLineColumnWithPrevCharIsCRFollowedByNonNewline_voAZ1_2() {
        SimpleCharStream stream = new SimpleCharStream(System.in);
        stream.prevCharIsCR = true;
        stream.column = 5;
        stream.line = 1;
        stream.UpdateLineColumn('a');
        assertEquals(2, stream.line);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateLineColumnWithPrevCharIsCRFollowedByNonNewline_voAZ1_3() {
        SimpleCharStream stream = new SimpleCharStream(System.in);
        stream.prevCharIsCR = true;
        stream.column = 5;
        stream.line = 1;
        stream.UpdateLineColumn('a');
        assertEquals(1, stream.column);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateLineColumnWithPrevCharIsCRFollowedByNewline_Fbfa2_1() {
        SimpleCharStream stream = new SimpleCharStream(System.in);
        stream.prevCharIsCR = true;
        stream.column = 5;
        stream.line = 1;
        stream.UpdateLineColumn('\n');
        assertTrue(stream.prevCharIsLF);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateLineColumnWithPrevCharIsCRFollowedByNewline_Fbfa2_2() {
        SimpleCharStream stream = new SimpleCharStream(System.in);
        stream.prevCharIsCR = true;
        stream.column = 5;
        stream.line = 1;
        stream.UpdateLineColumn('\n');
        assertFalse(stream.prevCharIsCR);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateLineColumnWithPrevCharIsCRFollowedByNewline_Fbfa2_3() {
        SimpleCharStream stream = new SimpleCharStream(System.in);
        stream.prevCharIsCR = true;
        stream.column = 5;
        stream.line = 1;
        stream.UpdateLineColumn('\n');
        assertEquals(1, stream.line);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateLineColumnWithPrevCharIsCRFollowedByNewline_Fbfa2_4() {
        SimpleCharStream stream = new SimpleCharStream(System.in);
        stream.prevCharIsCR = true;
        stream.column = 5;
        stream.line = 1;
        stream.UpdateLineColumn('\n');
        assertEquals(6, stream.column);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateLineColumnWithCarriageReturn_lIeT3_1() {
        SimpleCharStream stream = new SimpleCharStream(System.in);
        stream.column = 5;
        stream.line = 1;
        stream.UpdateLineColumn('\r');
        assertTrue(stream.prevCharIsCR);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateLineColumnWithCarriageReturn_lIeT3_2() {
        SimpleCharStream stream = new SimpleCharStream(System.in);
        stream.column = 5;
        stream.line = 1;
        stream.UpdateLineColumn('\r');
        assertEquals(1, stream.line);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateLineColumnWithCarriageReturn_lIeT3_3() {
        SimpleCharStream stream = new SimpleCharStream(System.in);
        stream.column = 5;
        stream.line = 1;
        stream.UpdateLineColumn('\r');
        assertEquals(6, stream.column);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateLineColumnWithLineFeed_bLfV4_1() {
        SimpleCharStream stream = new SimpleCharStream(System.in);
        stream.column = 5;
        stream.line = 1;
        stream.UpdateLineColumn('\n');
        assertTrue(stream.prevCharIsLF);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateLineColumnWithLineFeed_bLfV4_2() {
        SimpleCharStream stream = new SimpleCharStream(System.in);
        stream.column = 5;
        stream.line = 1;
        stream.UpdateLineColumn('\n');
        assertEquals(1, stream.line);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateLineColumnWithLineFeed_bLfV4_3() {
        SimpleCharStream stream = new SimpleCharStream(System.in);
        stream.column = 5;
        stream.line = 1;
        stream.UpdateLineColumn('\n');
        assertEquals(6, stream.column);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateLineColumnWithTab_rtBK5_1() {
        SimpleCharStream stream = new SimpleCharStream(System.in);
        stream.column = 3;
        stream.line = 1;
        stream.UpdateLineColumn('\t');
        assertEquals(1, stream.line);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateLineColumnWithTab_rtBK5_2() {
        SimpleCharStream stream = new SimpleCharStream(System.in);
        stream.column = 3;
        stream.line = 1;
        stream.UpdateLineColumn('\t');
        assertEquals(9, stream.column);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateLineColumnWithRegularCharacter_kXPx6_1() {
        SimpleCharStream stream = new SimpleCharStream(System.in);
        stream.column = 1;
        stream.line = 1;
        stream.UpdateLineColumn('a');
        assertEquals(1, stream.line);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateLineColumnWithRegularCharacter_kXPx6_2() {
        SimpleCharStream stream = new SimpleCharStream(System.in);
        stream.column = 1;
        stream.line = 1;
        stream.UpdateLineColumn('a');
        assertEquals(2, stream.column);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateLineColumnWithMultipleCharacters_SHAe7_1() {
        SimpleCharStream stream = new SimpleCharStream(System.in);
        stream.column = 1;
        stream.line = 1;
        stream.UpdateLineColumn('a');
        stream.UpdateLineColumn('\r');
        stream.UpdateLineColumn('\n');
        assertTrue(stream.prevCharIsLF);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateLineColumnWithMultipleCharacters_SHAe7_2() {
        SimpleCharStream stream = new SimpleCharStream(System.in);
        stream.column = 1;
        stream.line = 1;
        stream.UpdateLineColumn('a');
        stream.UpdateLineColumn('\r');
        stream.UpdateLineColumn('\n');
        assertFalse(stream.prevCharIsCR);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateLineColumnWithMultipleCharacters_SHAe7_3() {
        SimpleCharStream stream = new SimpleCharStream(System.in);
        stream.column = 1;
        stream.line = 1;
        stream.UpdateLineColumn('a');
        stream.UpdateLineColumn('\r');
        stream.UpdateLineColumn('\n');
        assertEquals(1, stream.line);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateLineColumnWithMultipleCharacters_SHAe7_4() {
        SimpleCharStream stream = new SimpleCharStream(System.in);
        stream.column = 1;
        stream.line = 1;
        stream.UpdateLineColumn('a');
        stream.UpdateLineColumn('\r');
        stream.UpdateLineColumn('\n');
        assertEquals(2, stream.column);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateLineColumnWithPrevCharIsLF_jyCm0() {
        SimpleCharStream stream = new SimpleCharStream(System.in);
        stream.prevCharIsLF = true;
        stream.column = 5;
        stream.line = 1;
        stream.UpdateLineColumn('a');
        assertFalse(stream.prevCharIsLF);
        assertEquals(2, stream.line);
        assertEquals(1, stream.column);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateLineColumnWithPrevCharIsCRFollowedByNonNewline_voAZ1() {
        SimpleCharStream stream = new SimpleCharStream(System.in);
        stream.prevCharIsCR = true;
        stream.column = 5;
        stream.line = 1;
        stream.UpdateLineColumn('a');
        assertFalse(stream.prevCharIsCR);
        assertEquals(2, stream.line);
        assertEquals(1, stream.column);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateLineColumnWithPrevCharIsCRFollowedByNewline_Fbfa2() {
        SimpleCharStream stream = new SimpleCharStream(System.in);
        stream.prevCharIsCR = true;
        stream.column = 5;
        stream.line = 1;
        stream.UpdateLineColumn('\n');
        assertTrue(stream.prevCharIsLF);
        assertFalse(stream.prevCharIsCR);
        assertEquals(1, stream.line);
        assertEquals(6, stream.column);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateLineColumnWithCarriageReturn_lIeT3() {
        SimpleCharStream stream = new SimpleCharStream(System.in);
        stream.column = 5;
        stream.line = 1;
        stream.UpdateLineColumn('\r');
        assertTrue(stream.prevCharIsCR);
        assertEquals(1, stream.line);
        assertEquals(6, stream.column);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateLineColumnWithLineFeed_bLfV4() {
        SimpleCharStream stream = new SimpleCharStream(System.in);
        stream.column = 5;
        stream.line = 1;
        stream.UpdateLineColumn('\n');
        assertTrue(stream.prevCharIsLF);
        assertEquals(1, stream.line);
        assertEquals(6, stream.column);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateLineColumnWithTab_rtBK5() {
        SimpleCharStream stream = new SimpleCharStream(System.in);
        stream.column = 3;
        stream.line = 1;
        stream.UpdateLineColumn('\t');
        assertEquals(1, stream.line);
        assertEquals(9, stream.column);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateLineColumnWithRegularCharacter_kXPx6() {
        SimpleCharStream stream = new SimpleCharStream(System.in);
        stream.column = 1;
        stream.line = 1;
        stream.UpdateLineColumn('a');
        assertEquals(1, stream.line);
        assertEquals(2, stream.column);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateLineColumnWithMultipleCharacters_SHAe7() {
        SimpleCharStream stream = new SimpleCharStream(System.in);
        stream.column = 1;
        stream.line = 1;
        stream.UpdateLineColumn('a');
        stream.UpdateLineColumn('\r');
        stream.UpdateLineColumn('\n');
        assertTrue(stream.prevCharIsLF);
        assertFalse(stream.prevCharIsCR);
        assertEquals(1, stream.line);
        assertEquals(2, stream.column);
    }
}