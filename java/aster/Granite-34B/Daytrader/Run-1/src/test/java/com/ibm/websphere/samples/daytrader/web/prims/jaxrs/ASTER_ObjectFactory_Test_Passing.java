/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims.jaxrs;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_ObjectFactory_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateXMLObject_JYKN0() {
        ObjectFactory of = new ObjectFactory();
        XMLObject xo = of.createXMLObject();
        assertNotNull(xo);
    }
}