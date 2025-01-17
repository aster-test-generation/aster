/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.unpack200.bytecode;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_CPMember_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testResolve5_hput4_1() {
    CPUTF8 utf8 = new CPUTF8("example");
    CPUTF8 utf82 = new CPUTF8("example", 0);
    ClassConstantPool pool = new ClassConstantPool();
    CPMember member = new CPMember(utf8, utf82, 0, null);
    member.resolve(pool);
    assertEquals(1, pool.size());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testResolve5_hput4_2() {
    CPUTF8 utf8 = new CPUTF8("example");
    CPUTF8 utf82 = new CPUTF8("example", 0);
    ClassConstantPool pool = new ClassConstantPool();
    CPMember member = new CPMember(utf8, utf82, 0, null);
    member.resolve(pool);
    assertEquals(1, pool.indexOf(utf8));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testResolve5_hput4_3() {
    CPUTF8 utf8 = new CPUTF8("example");
    CPUTF8 utf82 = new CPUTF8("example", 0);
    ClassConstantPool pool = new ClassConstantPool();
    CPMember member = new CPMember(utf8, utf82, 0, null);
    member.resolve(pool);
    assertEquals(1, pool.indexOf(utf82));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_zeMI0_pwDQ0_fid1() {
        CPUTF8 name = new CPUTF8("example");
        CPUTF8 descriptor = new CPUTF8("java/lang/String");
        long flags = 0;
        List<Attribute> attributes = new ArrayList<>();
        CPMember cpMember = new CPMember(name, descriptor, flags, attributes);
        assertEquals("CPMember: example(java/lang/String)", cpMember.toString());
    }
}