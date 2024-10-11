/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.unpack200.bytecode;
import java.io.DataOutputStream;
import java.io.IOException;
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
public void testEquals_0_BRbe0() throws Exception {
    final CPUTF8 name0 = new CPUTF8("name0");
    final CPUTF8 descriptor0 = new CPUTF8("descriptor0");
    final long flags0 = 0L;
    final List<Attribute> attributes0 = new ArrayList<Attribute>();
    final CPMember cpMember0 = new CPMember(name0, descriptor0, flags0, attributes0);
    final Object obj0 = new Object();
    boolean result = cpMember0.equals(obj0);
    Assertions.assertFalse(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_1_LLVV1() throws Exception {
    final CPUTF8 name0 = new CPUTF8("name0");
    final CPUTF8 descriptor0 = new CPUTF8("descriptor0");
    final long flags0 = 0L;
    final List<Attribute> attributes0 = new ArrayList<Attribute>();
    final CPMember cpMember0 = new CPMember(name0, descriptor0, flags0, attributes0);
    final CPMember cpMember1 = new CPMember(name0, descriptor0, flags0, attributes0);
    boolean result = cpMember0.equals(cpMember1);
    Assertions.assertTrue(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCPUTF8StringInt_DLSg1_2() throws Exception {
        CPUTF8 utf8 = new CPUTF8("test", 10);
        assertEquals(10, utf8.getGlobalIndex());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNestedClassFileEntries_evfu2_1() throws Exception {
        CPUTF8 name = new CPUTF8("name");
        CPUTF8 descriptor = new CPUTF8("descriptor");
        long flags = 10;
        List<Attribute> attributes = new ArrayList<>();
        CPMember cpMember = new CPMember(name, descriptor, flags, attributes);
        ClassFileEntry[] entries = cpMember.getNestedClassFileEntries();
        assertEquals(name, entries[0]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNestedClassFileEntries_evfu2_2() throws Exception {
        CPUTF8 name = new CPUTF8("name");
        CPUTF8 descriptor = new CPUTF8("descriptor");
        long flags = 10;
        List<Attribute> attributes = new ArrayList<>();
        CPMember cpMember = new CPMember(name, descriptor, flags, attributes);
        ClassFileEntry[] entries = cpMember.getNestedClassFileEntries();
        assertEquals(descriptor, entries[1]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNestedClassFileEntries_evfu2_3() throws Exception {
        CPUTF8 name = new CPUTF8("name");
        CPUTF8 descriptor = new CPUTF8("descriptor");
        long flags = 10;
        List<Attribute> attributes = new ArrayList<>();
        CPMember cpMember = new CPMember(name, descriptor, flags, attributes);
        ClassFileEntry[] entries = cpMember.getNestedClassFileEntries();
        assertEquals(attributes, Arrays.asList(entries).subList(2, entries.length));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoWrite_ubAU0() throws IOException {
        CPUTF8 name = new CPUTF8("name");
        CPUTF8 descriptor = new CPUTF8("descriptor");
        long flags = 1;
        List<Attribute> attributes = null; // Initialize with actual values
        CPMember cpMember = new CPMember(name, descriptor, flags, attributes);
        DataOutputStream dos = new DataOutputStream(System.out); // Replace with actual DataOutputStream
        cpMember.doWrite(dos);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCode_Hlbf0() throws Exception {
        CPUTF8 name = new CPUTF8("name");
        CPUTF8 descriptor = new CPUTF8("descriptor");
        long flags = 1L;
        List<Attribute> attributes = new ArrayList<>();
        CPMember cpMember = new CPMember(name, descriptor, flags, attributes);
        final int PRIME = 31;
        int result = 1;
        result = PRIME * result + attributes.hashCode();
        result = PRIME * result + descriptor.hashCode();
        result = PRIME * result + (int) (flags ^ (flags >>> 32));
        result = PRIME * result + name.hashCode();
        assertEquals(result, cpMember.hashCode());
    }
}