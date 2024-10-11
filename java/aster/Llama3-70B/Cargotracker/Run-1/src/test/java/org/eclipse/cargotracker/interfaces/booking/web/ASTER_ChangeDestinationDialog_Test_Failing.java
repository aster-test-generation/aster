/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.interfaces.booking.web;

import java.util.*;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_ChangeDestinationDialog_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testShowDialog_Wwzq0_1() {
    ChangeDestinationDialog changeDestinationDialog = new ChangeDestinationDialog();
    Map<String, Object> options = new HashMap<>();
    Map<String, List<String>> params = new HashMap<>();
    List<String> values = new ArrayList<>();
    values.add("trackingId");
    params.put("trackingId", values);
    changeDestinationDialog.showDialog("trackingId");
    assertEquals(true, options.get("modal"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testShowDialog_Wwzq0_2() {
    ChangeDestinationDialog changeDestinationDialog = new ChangeDestinationDialog();
    Map<String, Object> options = new HashMap<>();
    Map<String, List<String>> params = new HashMap<>();
    List<String> values = new ArrayList<>();
    values.add("trackingId");
    params.put("trackingId", values);
    changeDestinationDialog.showDialog("trackingId");
    assertEquals(true, options.get("draggable"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testShowDialog_Wwzq0_3() {
    ChangeDestinationDialog changeDestinationDialog = new ChangeDestinationDialog();
    Map<String, Object> options = new HashMap<>();
    Map<String, List<String>> params = new HashMap<>();
    List<String> values = new ArrayList<>();
    values.add("trackingId");
    params.put("trackingId", values);
    changeDestinationDialog.showDialog("trackingId");
    assertEquals(false, options.get("resizable"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testShowDialog_Wwzq0_4() {
    ChangeDestinationDialog changeDestinationDialog = new ChangeDestinationDialog();
    Map<String, Object> options = new HashMap<>();
    Map<String, List<String>> params = new HashMap<>();
    List<String> values = new ArrayList<>();
    values.add("trackingId");
    params.put("trackingId", values);
    changeDestinationDialog.showDialog("trackingId");
    assertEquals(410, options.get("contentWidth"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testShowDialog_Wwzq0_5() {
    ChangeDestinationDialog changeDestinationDialog = new ChangeDestinationDialog();
    Map<String, Object> options = new HashMap<>();
    Map<String, List<String>> params = new HashMap<>();
    List<String> values = new ArrayList<>();
    values.add("trackingId");
    params.put("trackingId", values);
    changeDestinationDialog.showDialog("trackingId");
    assertEquals(280, options.get("contentHeight"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testShowDialog_Wwzq0_6() {
    ChangeDestinationDialog changeDestinationDialog = new ChangeDestinationDialog();
    Map<String, Object> options = new HashMap<>();
    Map<String, List<String>> params = new HashMap<>();
    List<String> values = new ArrayList<>();
    values.add("trackingId");
    params.put("trackingId", values);
    changeDestinationDialog.showDialog("trackingId");
    assertEquals("trackingId", params.get("trackingId").get(0));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testShowDialog_Wwzq0() {
    ChangeDestinationDialog changeDestinationDialog = new ChangeDestinationDialog();
    Map<String, Object> options = new HashMap<>();
    Map<String, List<String>> params = new HashMap<>();
    List<String> values = new ArrayList<>();
    values.add("trackingId");
    params.put("trackingId", values);
    changeDestinationDialog.showDialog("trackingId");
    assertEquals(true, options.get("modal"));
    assertEquals(true, options.get("draggable"));
    assertEquals(false, options.get("resizable"));
    assertEquals(410, options.get("contentWidth"));
    assertEquals(280, options.get("contentHeight"));
    assertEquals("trackingId", params.get("trackingId").get(0));
  }
}