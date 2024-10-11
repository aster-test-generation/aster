/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;

import java.lang.reflect.Field;
import java.util.concurrent.TimeUnit;
import javax.servlet.ServletConfig;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_PingJSONPStreaming_Test_Passing {
  @Mock
  private ServletConfig mockServletConfig;
  @InjectMocks
  private PingJSONPStreaming pingJSONPStreaming;
  HttpServletRequest httpServletRequest;
  HttpServletResponse httpServletResponse;
  ServletOutputStream servletOutputStream;
  private static String initTime = "2023-01-01T00:00:00Z";
  private static int hitCount = 0;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testInit() throws Exception {
    // Reset static fields to their initial state
    Field initTimeField = PingJSONPStreaming.class.getDeclaredField("initTime");
    initTimeField.setAccessible(true);
    initTimeField.set(null, null);
    Field hitCountField = PingJSONPStreaming.class.getDeclaredField("hitCount");
    hitCountField.setAccessible(true);
    hitCountField.set(null, 0);
    pingJSONPStreaming.init(mockServletConfig);
  }
}