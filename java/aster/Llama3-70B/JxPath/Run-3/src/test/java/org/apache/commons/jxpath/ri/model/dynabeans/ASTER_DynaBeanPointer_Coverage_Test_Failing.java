/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.dynabeans;
import org.apache.commons.beanutils.DynaBean;
import org.apache.commons.jxpath.ri.QName;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_DynaBeanPointer_Coverage_Test_Failing {
    private QName name;
    private DynaBean dynaBean;
    private DynaBeanPointer dynabeanpointer;
    private DynaBeanPointer other;
@BeforeEach
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCode_NameIsNull_gbdp0_Knft0() {
    DynaBeanPointer dynaBeanPointer = new DynaBeanPointer(new QName(""), null, null);
    int result = dynaBeanPointer.hashCode();
    assert result != 0;
}
}