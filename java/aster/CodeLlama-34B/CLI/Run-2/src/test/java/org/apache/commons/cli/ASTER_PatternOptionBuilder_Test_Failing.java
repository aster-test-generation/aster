/**
 * Generated by Aster
 */
package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_PatternOptionBuilder_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern7_lsMo6() {
        String pattern = "abc!d!e!f";
        Options options = PatternOptionBuilder.parsePattern(pattern);
        assertEquals(6, options.getOptions().size());
        assertTrue(options.hasOption("a"));
        assertTrue(options.hasOption("b"));
        assertTrue(options.hasOption("c"));
        assertTrue(options.hasOption("d"));
        assertTrue(options.hasOption("e"));
        assertTrue(options.hasOption("f"));
        assertTrue(options.getOption("c").isRequired());
        assertTrue(options.getOption("d").isRequired());
        assertTrue(options.getOption("e").isRequired());
        assertTrue(options.getOption("f").isRequired());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueClass_A_aYwM0() {
        char ch = 'A';
        Object valueClass = PatternOptionBuilder.getValueClass(ch);
        assertEquals(Character.class, valueClass);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueClass_B_MSPE1() {
        char ch = 'B';
        Object valueClass = PatternOptionBuilder.getValueClass(ch);
        assertEquals(Boolean.class, valueClass);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueClass_C_cqew2() {
        char ch = 'C';
        Object valueClass = PatternOptionBuilder.getValueClass(ch);
        assertEquals(Character.class, valueClass);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueClass_D_RhIA3() {
        char ch = 'D';
        Object valueClass = PatternOptionBuilder.getValueClass(ch);
        assertEquals(Date.class, valueClass);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueClass_E_sKgk4() {
        char ch = 'E';
        Object valueClass = PatternOptionBuilder.getValueClass(ch);
        assertEquals(Double.class, valueClass);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueClass_F_efiX5() {
        char ch = 'F';
        Object valueClass = PatternOptionBuilder.getValueClass(ch);
        assertEquals(Float.class, valueClass);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueClass_G_LfmD6() {
        char ch = 'G';
        Object valueClass = PatternOptionBuilder.getValueClass(ch);
        assertEquals(Integer.class, valueClass);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueClass_H_BAbh7() {
        char ch = 'H';
        Object valueClass = PatternOptionBuilder.getValueClass(ch);
        assertEquals(Long.class, valueClass);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueClass_I_mEvo8() {
        char ch = 'I';
        Object valueClass = PatternOptionBuilder.getValueClass(ch);
        assertEquals(Integer.class, valueClass);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueClass_J_lwHy9() {
        char ch = 'J';
        Object valueClass = PatternOptionBuilder.getValueClass(ch);
        assertEquals(Long.class, valueClass);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueClass_K_vIPf10() {
        char ch = 'K';
        Object valueClass = PatternOptionBuilder.getValueClass(ch);
        assertEquals(Short.class, valueClass);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueClass_L_mWPV11() {
        char ch = 'L';
        Object valueClass = PatternOptionBuilder.getValueClass(ch);
        assertEquals(Long.class, valueClass);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueClass_M_mrTF12() {
        char ch = 'M';
        Object valueClass = PatternOptionBuilder.getValueClass(ch);
        assertEquals(Float.class, valueClass);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueClass_N_LCeA13() {
        char ch = 'N';
        Object valueClass = PatternOptionBuilder.getValueClass(ch);
        assertEquals(Double.class, valueClass);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueClass_O_QicJ14() {
        char ch = 'O';
        Object valueClass = PatternOptionBuilder.getValueClass(ch);
        assertEquals(Object.class, valueClass);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueClass_P_dAeH15() {
        char ch = 'P';
        Object valueClass = PatternOptionBuilder.getValueClass(ch);
        assertEquals(String.class, valueClass);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueClass_Q_glWD16() {
        char ch = 'Q';
        Object valueClass = PatternOptionBuilder.getValueClass(ch);
        assertEquals(String.class, valueClass);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueClass_R_xjsr17() {
        char ch = 'R';
        Object valueClass = PatternOptionBuilder.getValueClass(ch);
        assertEquals(String.class, valueClass);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueClass_S_DPsB18() {
        char ch = 'S';
        Object valueClass = PatternOptionBuilder.getValueClass(ch);
        assertEquals(String.class, valueClass);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern7_lsMo6_11_fid2() {
        String pattern = "abc!d!e!f";
        Options options = PatternOptionBuilder.parsePattern(pattern);
        assertTrue(options.getOption("f").isRequired());
    }
}