/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.unpack200.bytecode;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_SourceFileAttribute_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCode_withNullName_hiUu1_fid1() {
    SourceFileAttribute sourceFileAttribute = new SourceFileAttribute(null);
    int expected = 31 * sourceFileAttribute.getClass().hashCode();
    int actual = sourceFileAttribute.hashCode();
    assert expected == actual;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCode_withNonNullName_hvcT0_fJWk0_fid1() {
    CPUTF8 cpuTf8 = new CPUTF8("utf8", 0);
    SourceFileAttribute sourceFileAttribute = new SourceFileAttribute(cpuTf8);
    int expected = 31 * sourceFileAttribute.getClass().hashCode() + cpuTf8.hashCode();
    int actual = sourceFileAttribute.hashCode();
    assert expected == actual;
}
}