/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.unpack200;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPClass;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPFieldRef;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPInterfaceMethodRef;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPMethodRef;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPString;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_CpBands_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCpUTF8ValueWithFalse_YCij1() {
        CpBands cpBands = new CpBands(new Segment());
        CPUTF8 cpUTF8 = cpBands.cpUTF8Value("test", false);
        assertNotNull(cpUTF8);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCpUTF8ValueWithNull_VqyE2() {
        CpBands cpBands = new CpBands(new Segment());
        CPUTF8 cpUTF8 = cpBands.cpUTF8Value(null);
        assertNotNull(cpUTF8);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCpUTF8ValueWithEmpty_tBVV3() {
        CpBands cpBands = new CpBands(new Segment());
        CPUTF8 cpUTF8 = cpBands.cpUTF8Value("");
        assertNotNull(cpUTF8);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCpUTF8ValueWithTab_UHKx5() {
        CpBands cpBands = new CpBands(new Segment());
        CPUTF8 cpUTF8 = cpBands.cpUTF8Value("\t");
        assertNotNull(cpUTF8);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCpUTF8ValueWithNewline_oGhn6() {
        CpBands cpBands = new CpBands(new Segment());
        CPUTF8 cpUTF8 = cpBands.cpUTF8Value("\n");
        assertNotNull(cpUTF8);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCpUTF8ValueWithCarriageReturn_Nkwy7() {
        CpBands cpBands = new CpBands(new Segment());
        CPUTF8 cpUTF8 = cpBands.cpUTF8Value("\r");
        assertNotNull(cpUTF8);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCpUTF8ValueWithFormFeed_uiPz8() {
        CpBands cpBands = new CpBands(new Segment());
        CPUTF8 cpUTF8 = cpBands.cpUTF8Value("\f");
        assertNotNull(cpUTF8);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCpUTF8ValueWithBackslash_ehHb9() {
        CpBands cpBands = new CpBands(new Segment());
        CPUTF8 cpUTF8 = cpBands.cpUTF8Value("\\");
        assertNotNull(cpUTF8);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCpUTF8ValueWithQuestionMark_pmQu10() {
        CpBands cpBands = new CpBands(new Segment());
        CPUTF8 cpUTF8 = cpBands.cpUTF8Value("?");
        assertNotNull(cpUTF8);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCpUTF8ValueWithApostrophe_PXAR11() {
        CpBands cpBands = new CpBands(new Segment());
        CPUTF8 cpUTF8 = cpBands.cpUTF8Value("'");
        assertNotNull(cpUTF8);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCpUTF8ValueWithDoubleApostrophe_LUHP12() {
        CpBands cpBands = new CpBands(new Segment());
        CPUTF8 cpUTF8 = cpBands.cpUTF8Value("\"");
        assertNotNull(cpUTF8);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCpUTF8ValueWithPercentSign_PdjE14() {
        CpBands cpBands = new CpBands(new Segment());
        CPUTF8 cpUTF8 = cpBands.cpUTF8Value("%");
        assertNotNull(cpUTF8);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSegment_BKga0_1() {
        Segment segment = new Segment();
        CpBands cpBands = new CpBands(segment);
        String[] cpMethodDescriptor = cpBands.getCpMethodDescriptor();
        assertEquals(1, cpMethodDescriptor.length);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSegment_BKga0_2() {
        Segment segment = new Segment();
        CpBands cpBands = new CpBands(segment);
        String[] cpMethodDescriptor = cpBands.getCpMethodDescriptor();
        assertEquals("cp band descriptor", cpMethodDescriptor[0]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCpFieldValue_OwBg0() {
        CpBands cpBands = new CpBands(new Segment());
        CPFieldRef cpFieldRef = cpBands.cpFieldValue(0);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCpIMethodClass_Kokt0_1() {
        Segment segment = new Segment();
        CpBands cpBands = new CpBands(segment);
        String[] result = cpBands.getCpIMethodClass();
        assertNotNull(result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCpIMethodClass_Kokt0_2() {
        Segment segment = new Segment();
        CpBands cpBands = new CpBands(segment);
        String[] result = cpBands.getCpIMethodClass();
        assertNotEquals(0, result.length);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCpInt_UFMr0() {
        Segment segment = new Segment();
        CpBands cpBands = new CpBands(segment);
        int[] cpInt = cpBands.getCpInt();
        assertNotNull(cpInt);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCpInt_AjkC1() {
        Segment segment = new Segment();
        CpBands cpBands = new CpBands(segment);
        int[] cpInt = cpBands.getCpInt();
        assertEquals(0, cpInt.length);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCpInt_JJKW2() {
        Segment segment = new Segment();
        CpBands cpBands = new CpBands(segment);
        int[] cpInt = cpBands.getCpInt();
        assertNotEquals(null, cpInt);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCpClassValue_Xdvh0() {
        CpBands cpBands = new CpBands(new Segment());
        CPClass cpClass = cpBands.cpClassValue(0);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCpClassValue2_hHJu1() {
        CpBands cpBands = new CpBands(new Segment());
        CPClass cpClass = cpBands.cpClassValue(1);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCpClassValue3_SVFX2() {
        CpBands cpBands = new CpBands(new Segment());
        CPClass cpClass = cpBands.cpClassValue(2);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCpClassValue4_cRxL3() {
        CpBands cpBands = new CpBands(new Segment());
        CPClass cpClass = cpBands.cpClassValue(3);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCpClassValue5_nGlc4() {
        CpBands cpBands = new CpBands(new Segment());
        CPClass cpClass = cpBands.cpClassValue(4);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCpClassValue6_TAOI5() {
        CpBands cpBands = new CpBands(new Segment());
        CPClass cpClass = cpBands.cpClassValue(5);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCpClassValue7_xjao6() {
        CpBands cpBands = new CpBands(new Segment());
        CPClass cpClass = cpBands.cpClassValue(6);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCpClassValue8_zxaG7() {
        CpBands cpBands = new CpBands(new Segment());
        CPClass cpClass = cpBands.cpClassValue(7);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCpClassValue9_sNpF8() {
        CpBands cpBands = new CpBands(new Segment());
        CPClass cpClass = cpBands.cpClassValue(8);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCpClassValue10_VNBU9() {
        CpBands cpBands = new CpBands(new Segment());
        CPClass cpClass = cpBands.cpClassValue(9);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCpClassValue11_GapG10() {
        CpBands cpBands = new CpBands(new Segment());
        CPClass cpClass = cpBands.cpClassValue(10);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCpClassValue12_cAwX11() {
        CpBands cpBands = new CpBands(new Segment());
        CPClass cpClass = cpBands.cpClassValue(11);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCpClassValue13_VThH12() {
        CpBands cpBands = new CpBands(new Segment());
        CPClass cpClass = cpBands.cpClassValue(12);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCpClassValue14_yJNz13() {
        CpBands cpBands = new CpBands(new Segment());
        CPClass cpClass = cpBands.cpClassValue(13);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCpDescriptorTypeInts_gzmQ0() {
        Segment segment = new Segment();
        CpBands cpBands = new CpBands(segment);
        int[] cpDescriptorTypeInts = cpBands.getCpDescriptorTypeInts();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCpLong_aQsO0() {
        Segment segment = new Segment();
        CpBands cpBands = new CpBands(segment);
        long[] expected = null;
        long[] actual = cpBands.getCpLong();
        assertArrayEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCpMethodValue_iEbI0() {
        CpBands cpBands = new CpBands(new Segment());
        CPMethodRef cpMethodRef = cpBands.cpMethodValue(0);
        assertNotNull(cpMethodRef);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCpIMethodValue_orTj0() {
        CpBands cpBands = new CpBands(new Segment());
        CPInterfaceMethodRef cpInterfaceMethodRef = cpBands.cpIMethodValue(0);
        assertNotNull(cpInterfaceMethodRef);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetCpSignature_aKze0() {
        Segment segment = new Segment();
        CpBands cpBands = new CpBands(segment);
        String[] cpSignature = cpBands.getCpSignature();
        assertEquals(0, cpSignature.length);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCpStringValue_ZXiJ0() {
        CpBands cpBands = new CpBands(new Segment());
        int index = 0;
        CPString cpString = cpBands.cpStringValue(index);
        assertNotNull(cpString);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCpStringValue2_MVeW1() {
        CpBands cpBands = new CpBands(new Segment());
        int index = 1;
        CPString cpString = cpBands.cpStringValue(index);
        assertNotNull(cpString);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCpUTF8Value_QfHb0() {
        CpBands cpBands = new CpBands(new Segment());
        CPUTF8 cputf8 = cpBands.cpUTF8Value(0);
        assertNotNull(cputf8);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCpUTF8Value2_Ekgu1() {
        CpBands cpBands = new CpBands(new Segment());
        CPUTF8 cputf8 = cpBands.cpUTF8Value(1);
        assertNotNull(cputf8);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCpUTF8Value3_iasA2() {
        CpBands cpBands = new CpBands(new Segment());
        CPUTF8 cputf8 = cpBands.cpUTF8Value(2);
        assertNotNull(cputf8);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCpUTF8Value4_OjnE3() {
        CpBands cpBands = new CpBands(new Segment());
        CPUTF8 cputf8 = cpBands.cpUTF8Value(3);
        assertNotNull(cputf8);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCpUTF8Value5_cGGt4() {
        CpBands cpBands = new CpBands(new Segment());
        CPUTF8 cputf8 = cpBands.cpUTF8Value(4);
        assertNotNull(cputf8);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCpUTF8Value6_Airw5() {
        CpBands cpBands = new CpBands(new Segment());
        CPUTF8 cputf8 = cpBands.cpUTF8Value(5);
        assertNotNull(cputf8);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCpUTF8Value7_PwWq6() {
        CpBands cpBands = new CpBands(new Segment());
        CPUTF8 cputf8 = cpBands.cpUTF8Value(6);
        assertNotNull(cputf8);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCpUTF8Value8_kQLK7() {
        CpBands cpBands = new CpBands(new Segment());
        CPUTF8 cputf8 = cpBands.cpUTF8Value(7);
        assertNotNull(cputf8);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCpUTF8Value9_Skdf8() {
        CpBands cpBands = new CpBands(new Segment());
        CPUTF8 cputf8 = cpBands.cpUTF8Value(8);
        assertNotNull(cputf8);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCpUTF8Value10_phOE9() {
        CpBands cpBands = new CpBands(new Segment());
        CPUTF8 cputf8 = cpBands.cpUTF8Value(9);
        assertNotNull(cputf8);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCpUTF8_RneG0_vOGx0() {
        Segment segment = new Segment();
        CpBands cpBands = new CpBands(segment);
        String[] cpUTF8 = cpBands.getCpUTF8();
        assertNotNull(cpUTF8);
        assert cpUTF8.length > 0;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCpDescriptorNameInts_nYjC0_Tisi0() {
        CpBands cpBands = new CpBands(new Segment());
        int[] actual = cpBands.getCpDescriptorNameInts();
        int[] expected = null; // Replace with expected value
        assertArrayEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSegment_BKga0() {
        Segment segment = new Segment();
        CpBands cpBands = new CpBands(segment);
        String[] cpMethodDescriptor = cpBands.getCpMethodDescriptor();
        assertEquals(1, cpMethodDescriptor.length);
        assertEquals("cp band descriptor", cpMethodDescriptor[0]);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCpIMethodClass_Kokt0() {
        Segment segment = new Segment();
        CpBands cpBands = new CpBands(segment);
        String[] result = cpBands.getCpIMethodClass();
        assertNotNull(result);
        assertNotEquals(0, result.length);
    }
}