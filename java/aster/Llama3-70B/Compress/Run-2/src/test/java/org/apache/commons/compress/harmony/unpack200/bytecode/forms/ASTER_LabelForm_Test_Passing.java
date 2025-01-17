/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.unpack200.bytecode.forms;
import org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode;
import org.apache.commons.compress.harmony.unpack200.bytecode.CodeAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.mockito.junit.jupiter.MockitoExtension;   
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_LabelForm_Test_Passing {
LabelForm labelform;
ByteCode byteCode;
CodeAttribute codeAttribute;
OperandManager operandManager;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testfixUpByteCodeTargets_LmaA0() throws Exception {
    ByteCode byteCode = mock(ByteCode.class);
    OperandManager operandManager = mock(OperandManager.class);
    int codeLength = 10;
    LabelForm labelForm = new LabelForm(0, "name", new int[]{});
    byteCode.setByteCodeTargets(new int[] { operandManager.nextLabel() });
    verify(byteCode).setByteCodeTargets(new int[] { operandManager.nextLabel() });
}
}