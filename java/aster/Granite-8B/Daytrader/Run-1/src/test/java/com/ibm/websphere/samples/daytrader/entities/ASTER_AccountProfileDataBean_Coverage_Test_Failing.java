/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.entities;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_AccountProfileDataBean_Coverage_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCode_RkzC0_fid2() {
        AccountProfileDataBean instance = new AccountProfileDataBean("123456789", "password", "John Doe", "123 Main St", "john.doe@example.com", "1234567890123456");
        int expResult = 123456789;
        int result = instance.hashCode();
        assertEquals(expResult, result);
    }
}