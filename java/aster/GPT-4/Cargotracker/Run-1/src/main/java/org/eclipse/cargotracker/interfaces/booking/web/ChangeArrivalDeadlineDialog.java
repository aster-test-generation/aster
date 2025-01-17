package org.eclipse.cargotracker.interfaces.booking.web;

import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.primefaces.PrimeFaces;
import org.primefaces.event.SelectEvent;

@Named
@SessionScoped
public class ChangeArrivalDeadlineDialog implements Serializable {

  private static final long serialVersionUID = 1L;

  public void showDialog(String trackingId) {
    Map<String, Object> options = new HashMap<>();
    options.put("modal", true);
    options.put("draggable", true);
    options.put("resizable", false);
    options.put("contentWidth", 460);
    options.put("contentHeight", 440);

    Map<String, List<String>> params = new HashMap<>();
    List<String> values = new ArrayList<>();
    values.add(trackingId);
    params.put("trackingId", values);

    PrimeFaces.current()
            .dialog()
            .openDynamic("/admin/dialogs/change_arrival_deadline.xhtml", options, params);
  }

  public void handleReturn(@SuppressWarnings("rawtypes") SelectEvent event) {
  }

  public void cancel() {
    // just kill the dialog
    PrimeFaces.current().dialog().closeDynamic("");
  }
}
