/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.dom;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_DOMNodeIterator_Coverage_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test1_mpQd0() {
        DOMNodeIterator iterator = new DOMNodeIterator(null, null, false, null);
        iterator.getNodePointer();
    }
}