/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims.cdi;

import java.util.concurrent.TimeUnit;
import javax.enterprise.event.Event;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_CDIEventProducer_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testProduceSyncEvent_urDt0() {
    CDIEventProducer producer = new CDIEventProducer();
    producer.produceSyncEvent();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testProduceSyncEvent_okIq1() {
    CDIEventProducer producer = new CDIEventProducer();
    producer.produceSyncEvent();
    producer.produceSyncEvent();
    producer.produceSyncEvent();
    producer.produceSyncEvent();
    producer.produceSyncEvent();
    producer.produceSyncEvent();
    producer.produceSyncEvent();
    producer.produceSyncEvent();
    producer.produceSyncEvent();
    producer.produceSyncEvent();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testProduceAsyncEvent_MNYK0() {
    CDIEventProducer cdiEventProducer = new CDIEventProducer();
    cdiEventProducer.produceAsyncEvent();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testProduceAsyncEvent_oXFT3() {
    CDIEventProducer cdiEventProducer = new CDIEventProducer();
    cdiEventProducer.produceAsyncEvent();
    cdiEventProducer.hitCountEventAsync.fireAsync(null, null);
  }
}