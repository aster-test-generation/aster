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

import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class Aster_DTStreamer3MDB_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testOnMessageWithNullCommand_IIDM0() throws Exception {
    DTStreamer3MDB mdb = new DTStreamer3MDB();
    Message message = mock(TextMessage.class);
    when(message.getStringProperty("command")).thenReturn(null);
    mdb.onMessage(message);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testOnMessageWithUpdateQuoteCommand_cjOg1() throws Exception {
    DTStreamer3MDB mdb = new DTStreamer3MDB();
    TextMessage message = mock(TextMessage.class);
    when(message.getStringProperty("command")).thenReturn("updateQuote");
    when(message.getStringProperty("symbol")).thenReturn("AAPL");
    when(message.getStringProperty("price")).thenReturn("150");
    when(message.getStringProperty("oldPrice")).thenReturn("148");
    when(message.getLongProperty("publishTime")).thenReturn(System.currentTimeMillis() - 1000);
    mdb.onMessage(message);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testOnMessageWithPingCommand_OFpp2() throws Exception {
    DTStreamer3MDB mdb = new DTStreamer3MDB();
    TextMessage message = mock(TextMessage.class);
    when(message.getStringProperty("command")).thenReturn("ping");
    when(message.getLongProperty("publishTime")).thenReturn(System.currentTimeMillis() - 500);
    mdb.onMessage(message);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testOnMessageWithUnknownCommand_xlqV3() throws Exception {
    DTStreamer3MDB mdb = new DTStreamer3MDB();
    TextMessage message = mock(TextMessage.class);
    when(message.getStringProperty("command")).thenReturn("unknownCommand");
    when(message.getText()).thenReturn("This is a test message");
    mdb.onMessage(message);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testOnMessageThrowsException_Lasc4() throws Exception {
    DTStreamer3MDB mdb = new DTStreamer3MDB();
    TextMessage message = mock(TextMessage.class);
    when(message.getStringProperty("command")).thenThrow(new RuntimeException("Forced Exception"));
    try {
      mdb.onMessage(message);
      fail("Exception should have been thrown");
    } catch (Exception e) {
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testOnMessageWithNullMessageText_fdIo5() throws Exception {
    DTStreamer3MDB mdb = new DTStreamer3MDB();
    TextMessage message = mock(TextMessage.class);
    when(message.getStringProperty("command")).thenReturn("updateQuote");
    when(message.getText()).thenReturn(null);
    when(message.getStringProperty("symbol")).thenReturn("AAPL");
    when(message.getStringProperty("price")).thenReturn("150");
    when(message.getStringProperty("oldPrice")).thenReturn("148");
    when(message.getLongProperty("publishTime")).thenReturn(System.currentTimeMillis() - 1000);
    mdb.onMessage(message);
  }
}