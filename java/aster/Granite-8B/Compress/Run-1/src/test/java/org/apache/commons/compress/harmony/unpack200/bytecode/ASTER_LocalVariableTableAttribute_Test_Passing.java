/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.unpack200.bytecode;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_LocalVariableTableAttribute_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIndexOf_hGTd0() {
        ClassConstantPool classConstantPool = new ClassConstantPool();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testResolve_cGdj2() {
        LocalVariableTableAttribute localVariableTableAttribute = new LocalVariableTableAttribute(0, new int[0], new int[0], new CPUTF8[0], new CPUTF8[0], new int[0]);
        ClassConstantPool classConstantPool = new ClassConstantPool();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testStartPCs_zYql0_uZHw0() {
        CPUTF8 cpUTF8Value = new CPUTF8("test");
        LocalVariableTableAttribute attribute = new LocalVariableTableAttribute(1, new int[]{1}, new int[]{1}, new CPUTF8[]{cpUTF8Value}, new CPUTF8[]{new CPUTF8("int")}, new int[]{1});
        int[] startPCs = attribute.getStartPCs();
        assert startPCs.length == 1;
        assert startPCs[0] == 1;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testResolve_cGdj2_prbM0() {
        LocalVariableTableAttribute localVariableTableAttribute = new LocalVariableTableAttribute(0, new int[0], new int[0], new CPUTF8[0], new CPUTF8[0], new int[0]);
        ClassConstantPool classConstantPool = new ClassConstantPool();
        localVariableTableAttribute.setAttributeName(new CPUTF8("LocalVariableTable"));
    }
}