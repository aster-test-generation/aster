/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.unpack200.bytecode;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_CPMember_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsWithDifferentNames_eKjv6() {
    final CPMember member = new CPMember(new CPUTF8("name"), new CPUTF8("descriptor"), 1L, new ArrayList<Attribute>());
    final CPMember other = new CPMember(new CPUTF8("name"), new CPUTF8("descriptor"), 1L, new ArrayList<Attribute>());
    other.name = new CPUTF8("other");
    assertFalse(member.equals(other));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsWithEqualObjects_qhzU7() {
    final CPMember member = new CPMember(new CPUTF8("name"), new CPUTF8("descriptor"), 1L, new ArrayList<Attribute>());
    final CPMember other = new CPMember(new CPUTF8("name"), new CPUTF8("descriptor"), 1L, new ArrayList<Attribute>());
    assertTrue(member.equals(other));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testBranchCoverage_drpO8() {
    final CPMember member = new CPMember(new CPUTF8("name"), new CPUTF8("descriptor"), 1L, new ArrayList<Attribute>());
    member.equals(null);
    member.equals("");
    member.equals(new CPMember(new CPUTF8("name"), new CPUTF8("descriptor"), 1L, new ArrayList<Attribute>()));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCPUTF8String_yHRt0_VHOm0() {
        CPUTF8 utf8 = new CPUTF8("test");
        assertEquals("UTF-8:test", utf8.toString());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNestedClassFileEntries_inul2_xbZi0_1() {
        CPUTF8 name = new CPUTF8("name");
        CPUTF8 descriptor = new CPUTF8("descriptor", 0);
        long flags = 0;
        List<Attribute> attributes = new ArrayList<>();
        CPMember cpMember = new CPMember(name, descriptor, flags, attributes);
        ClassFileEntry[] entries = cpMember.getNestedClassFileEntries();
        assertEquals(2, entries.length);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNestedClassFileEntries_inul2_xbZi0_2() {
        CPUTF8 name = new CPUTF8("name");
        CPUTF8 descriptor = new CPUTF8("descriptor", 0);
        long flags = 0;
        List<Attribute> attributes = new ArrayList<>();
        CPMember cpMember = new CPMember(name, descriptor, flags, attributes);
        ClassFileEntry[] entries = cpMember.getNestedClassFileEntries();
        assertEquals(name, entries[0]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNestedClassFileEntries_inul2_xbZi0_3() {
        CPUTF8 name = new CPUTF8("name");
        CPUTF8 descriptor = new CPUTF8("descriptor", 0);
        long flags = 0;
        List<Attribute> attributes = new ArrayList<>();
        CPMember cpMember = new CPMember(name, descriptor, flags, attributes);
        ClassFileEntry[] entries = cpMember.getNestedClassFileEntries();
        assertEquals(descriptor, entries[1]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNestedClassFileEntries_inul2_xbZi0_4() {
        CPUTF8 name = new CPUTF8("name");
        CPUTF8 descriptor = new CPUTF8("descriptor", 0);
        long flags = 0;
        List<Attribute> attributes = new ArrayList<>();
        CPMember cpMember = new CPMember(name, descriptor, flags, attributes);
        ClassFileEntry[] entries = cpMember.getNestedClassFileEntries();
        assertEquals(attributes, Arrays.asList(entries).subList(2, entries.length));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsWithSameObject_skMU0_Huax0() {
    final CPUTF8 utf8_1 = new CPUTF8("name");
    final CPUTF8 utf8_2 = new CPUTF8("descriptor");
    final CPMember member = new CPMember(utf8_1, utf8_2, 1L, new ArrayList<Attribute>());
    assertTrue(member.equals(member));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsWithNullObject_UtQO1_rEWf0() {
    final CPUTF8 utf8 = new CPUTF8("utf8");
    final CPMember member = new CPMember(utf8, utf8, 1L, new ArrayList<Attribute>());
    final CPMember member2 = new CPMember(utf8, utf8, 1L, new ArrayList<Attribute>());
    assertFalse(member2.equals(null));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testHashCode_BFsZ0_VPXd0() {
		CPUTF8 name = new CPUTF8("name", 0);
		CPUTF8 descriptor = new CPUTF8("descriptor", 0);
		long flags = 1L;
		List<Attribute> attributes = new ArrayList<>();
		CPMember cpMember = new CPMember(name, descriptor, flags, attributes);
		int actual = cpMember.hashCode();
		int expected = 31 * (31 * (31 * (31 + attributes.hashCode()) + descriptor.hashCode()) + (int) (flags ^ (flags >>> 32))) + name.hashCode();
		assertEquals(expected, actual);
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_ZucN0_Btta0() {
        CPUTF8 name = new CPUTF8("name");
        CPUTF8 descriptor = new CPUTF8("descriptor");
        CPMember cpMember = new CPMember(name, descriptor, 0, null);
        String expected = "CPMember: UTF-8:name(UTF-8:descriptor)";
        String actual = cpMember.toString();
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithFlags_Hwco1_XSkT0() {
        CPUTF8 name = new CPUTF8("name");
        CPUTF8 descriptor = new CPUTF8("descriptor");
        CPMember cpMember = new CPMember(name, descriptor, 1, null);
        String expected = "CPMember: UTF-8:name(UTF-8:descriptor)";
        String actual = cpMember.toString();
        org.junit.jupiter.api.Assertions.assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithAttributes_lnwt2_ZMpA0() {
        CPUTF8 name = new CPUTF8("name");
        CPUTF8 descriptor = new CPUTF8("descriptor");
        List<Attribute> attributes = new ArrayList<>();
        CPMember cpMember = new CPMember(name, descriptor, 0, attributes);
        String expected = "CPMember: UTF-8:name(UTF-8:descriptor)";
        String actual = cpMember.toString();
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithAllParameters_mwCp3_FoNm0() {
        CPUTF8 name = new CPUTF8("name");
        CPUTF8 descriptor = new CPUTF8("descriptor");
        long flags = 1;
        List<Attribute> attributes = new ArrayList<>();
        CPMember cpMember = new CPMember(name, descriptor, flags, attributes);
        String expected = "CPMember: UTF-8:name(UTF-8:descriptor)";
        String actual = cpMember.toString();
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithNoParameters_Byyt4_mocf0() {
        CPUTF8 name = new CPUTF8("");
        CPUTF8 descriptor = new CPUTF8("");
        CPMember cpMember = new CPMember(name, descriptor, 0, null);
        String expected = "CPMember: UTF-8:(UTF-8:)";
        String actual = cpMember.toString();
        assertEquals(expected, actual);
    }
}