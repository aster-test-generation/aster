package org.eclipse.cargotracker.application.util;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.io.Serializable;

/**
 * Application settings. Although this is stored in the database, it is not a true part of the
 * domain model but simply an application infrastructure artifact.
 */
@Entity
public class ApplicationSettings implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  private Long id;

  private boolean sampleLoaded = false;

  public boolean isSampleLoaded() {
    return sampleLoaded;
  }

  public void setSampleLoaded(boolean sampleLoaded) {
    this.sampleLoaded = sampleLoaded;
  }
}
