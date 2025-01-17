/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.unpack200.bytecode;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_LocalVariableTypeTableAttribute_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetAttributeName_ZjSy0_pVLa0() {
    CPUTF8 cpUTF8Value = new CPUTF8("test");
    LocalVariableTypeTableAttribute localVariableTypeTableAttribute = new LocalVariableTypeTableAttribute(0, new int[0], new int[0], new CPUTF8[0], new CPUTF8[0], new int[0]);
    localVariableTypeTableAttribute.setAttributeName(cpUTF8Value);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetAttributeName_ZjSy0_pVLa0_fid3() {
    CPUTF8 cpUTF8Value = new CPUTF8("test");
    LocalVariableTypeTableAttribute localVariableTypeTableAttribute = new LocalVariableTypeTableAttribute(0, new int[0], new int[0], new CPUTF8[0], new CPUTF8[0], new int[0]);
    localVariableTypeTableAttribute.setAttributeName(cpUTF8Value);
    assertEquals(cpUTF8Value, localVariableTypeTableAttribute.getAttributeName());
}
}