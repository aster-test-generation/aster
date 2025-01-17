/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.mdb;

import java.util.concurrent.TimeUnit;
import javax.jms.Message;
import javax.jms.TextMessage;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

public class Aster_DTBroker3MDB_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testOnMessageWithRedeliveredMessage_DZci4() throws Exception {
    Message message = mock(TextMessage.class);
    when(message.getJMSRedelivered()).thenReturn(true);
    when(((TextMessage) message).getText()).thenReturn("This is a redelivered message");
    DTBroker3MDB broker = new DTBroker3MDB();
    broker.onMessage(message);
    verify(message).getJMSRedelivered();
  }
}