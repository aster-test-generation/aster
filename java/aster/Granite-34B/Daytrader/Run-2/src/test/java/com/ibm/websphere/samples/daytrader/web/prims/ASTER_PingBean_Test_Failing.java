/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_PingBean_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMsg_IKgj0() {
        PingBean pingBean = new PingBean();
        String msg = pingBean.getMsg();
        Assertions.assertEquals(msg, "default message");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMsgAfterSettingNullMsg_qwcK4() {
        PingBean pingBean = new PingBean();
        pingBean.setMsg(null);
        String msg = pingBean.getMsg();
        Assertions.assertEquals(msg, "default message");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMsgAfterSettingEmptyMsg_dvmp5() {
        PingBean pingBean = new PingBean();
        pingBean.setMsg("");
        String msg = pingBean.getMsg();
        Assertions.assertEquals(msg, "default message");
    }
}