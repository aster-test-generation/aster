/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.interfaces.booking.web;

import java.util.*;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.primefaces.PrimeFaces;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_ChangeDestinationDialog_Coverage_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testCancel_VNQF0() {
    ChangeDestinationDialog changeDestinationDialog = new ChangeDestinationDialog();
    changeDestinationDialog.cancel();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testShowDialog_Wjlt0() {
    {
      Map<String, Object> options = new HashMap<>();
      options.put("modal", true);
      options.put("draggable", true);
      options.put("resizable", false);
      options.put("contentWidth", 410);
      options.put("contentHeight", 280);
      Map<String, List<String>> params = new HashMap<>();
      List<String> values = new ArrayList<>();
      values.add("trackingId");
      params.put("trackingId", values);
      PrimeFaces.current().dialog().openDynamic("/admin/dialogs/change_destination.xhtml", options, params);
    }
  }
}