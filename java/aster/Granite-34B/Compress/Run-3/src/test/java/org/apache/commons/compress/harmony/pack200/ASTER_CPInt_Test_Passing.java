/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.pack200;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_CPInt_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testcompareTo_XeUL0() throws Exception {
        CPInt cpInt1 = new CPInt(10);
        CPInt cpInt2 = new CPInt(20);
        assertEquals(Integer.compare(cpInt1.getInt(), cpInt2.getInt()), cpInt1.compareTo(cpInt2));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testcompareToWithSameObject_UdoS1() throws Exception {
        CPInt cpInt = new CPInt(10);
        assertEquals(0, cpInt.compareTo(cpInt));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testcompareToWithNullObject_XUDG2() throws Exception {
        CPInt cpInt = new CPInt(10);
        try {
            cpInt.compareTo(null);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetInt_Dtse0() throws Exception {
        CPInt cpInt = new CPInt(10);
        assertEquals(10, cpInt.getInt());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetIntWithZeroValue_BciJ1() throws Exception {
        CPInt cpInt = new CPInt(0);
        assertEquals(0, cpInt.getInt());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetIntWithNegativeValue_TqHV2() throws Exception {
        CPInt cpInt = new CPInt(-10);
        assertEquals(-10, cpInt.getInt());
}
}