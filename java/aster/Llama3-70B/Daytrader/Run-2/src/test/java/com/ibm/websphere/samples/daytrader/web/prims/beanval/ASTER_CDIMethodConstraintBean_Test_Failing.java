/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims.beanval;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_CDIMethodConstraintBean_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHitList_UzDB0_2() {
    CDIMethodConstraintBean bean = new CDIMethodConstraintBean();
    List<Integer> result = bean.hitList();
    assertEquals(1, Collections.min(result));}
}