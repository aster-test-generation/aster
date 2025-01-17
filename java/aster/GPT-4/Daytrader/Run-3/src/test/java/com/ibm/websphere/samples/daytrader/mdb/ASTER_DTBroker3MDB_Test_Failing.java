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

public class Aster_DTBroker3MDB_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testOnMessageWithNullCommand_wUJE0() throws Exception {
    Message message = mock(TextMessage.class);
    when(message.getStringProperty("command")).thenReturn(null);
    DTBroker3MDB broker = new DTBroker3MDB();
    broker.onMessage(message);
    verify(message).getStringProperty("command");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testOnMessageWithNewOrderCommand_yVuD1() throws Exception {
    Message message = mock(TextMessage.class);
    when(message.getStringProperty("command")).thenReturn("neworder");
    when(message.getIntProperty("orderID")).thenReturn(123);
    when(message.getBooleanProperty("twoPhase")).thenReturn(true);
    when(message.getBooleanProperty("direct")).thenReturn(false);
    when(message.getLongProperty("publishTime")).thenReturn(System.currentTimeMillis() - 1000);
    DTBroker3MDB broker = new DTBroker3MDB();
    broker.onMessage(message);
    verify(message).getStringProperty("command");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testOnMessageWithPingCommand_iKNG2() throws Exception {
    Message message = mock(TextMessage.class);
    when(message.getStringProperty("command")).thenReturn("ping");
    when(message.getLongProperty("publishTime")).thenReturn(System.currentTimeMillis() - 500);
    DTBroker3MDB broker = new DTBroker3MDB();
    broker.onMessage(message);
    verify(message).getStringProperty("command");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testOnMessageWithUnknownCommand_muLH3() throws Exception {
    Message message = mock(TextMessage.class);
    when(message.getStringProperty("command")).thenReturn("unknown");
    when(((TextMessage) message).getText()).thenReturn("Unknown Command Message");
    DTBroker3MDB broker = new DTBroker3MDB();
    broker.onMessage(message);
    verify(message).getStringProperty("command");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testOnMessageThrowsException_YipZ5() throws Exception {
    Message message = mock(TextMessage.class);
    when(message.getStringProperty("command")).thenReturn("neworder");
    when(message.getIntProperty("orderID")).thenReturn(123);
    when(message.getBooleanProperty("twoPhase")).thenReturn(true);
    when(message.getBooleanProperty("direct")).thenReturn(false);
    when(message.getLongProperty("publishTime")).thenReturn(System.currentTimeMillis() - 1000);
    doThrow(new RuntimeException()).when(message).getIntProperty("orderID");
    DTBroker3MDB broker = new DTBroker3MDB();
    broker.onMessage(message);
    verify(message).getStringProperty("command");
  }
}