/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.unpack200.bytecode;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.mockito.junit.jupiter.MockitoExtension;   
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_ExceptionTableEntry_Test_Passing {
private int startPC = 10;
private int endPC = 20;
private int catchTypeIndex;
private ClassConstantPool pool;
private int endPcRenumbered = 10;
private int handlerPcRenumbered = 20;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testResolve_CatchTypeNull_xXZX1_JoQA0() {
    ClassConstantPool pool = new ClassConstantPool();
    ExceptionTableEntry entry = new ExceptionTableEntry(1, 2, 3, null);
    entry.resolve(pool);
    assertNull(entry.getCatchType());
}
}