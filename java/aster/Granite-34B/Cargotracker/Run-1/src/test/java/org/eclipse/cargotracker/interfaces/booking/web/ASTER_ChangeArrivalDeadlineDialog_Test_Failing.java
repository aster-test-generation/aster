/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.interfaces.booking.web;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_ChangeArrivalDeadlineDialog_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testShowDialog_KSaX0() {
    ChangeArrivalDeadlineDialog changeArrivalDeadlineDialog = new ChangeArrivalDeadlineDialog();
    String trackingId = "12345";
    changeArrivalDeadlineDialog.showDialog(trackingId);
    // Add assertions here
}

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testShowDialogWithNullTrackingId_NMLi1() {
    ChangeArrivalDeadlineDialog changeArrivalDeadlineDialog = new ChangeArrivalDeadlineDialog();
    String trackingId = null;
    changeArrivalDeadlineDialog.showDialog(trackingId);
    // Add assertions here
}

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testShowDialogWithEmptyTrackingId_VZor2() {
    ChangeArrivalDeadlineDialog changeArrivalDeadlineDialog = new ChangeArrivalDeadlineDialog();
    String trackingId = "";
    changeArrivalDeadlineDialog.showDialog(trackingId);
    // Add assertions here
}

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testShowDialogWithTrackingIdLengthExceedsLimit_rBwq3() {
    ChangeArrivalDeadlineDialog changeArrivalDeadlineDialog = new ChangeArrivalDeadlineDialog();
    String trackingId = "123456789012345678901234567890";
    changeArrivalDeadlineDialog.showDialog(trackingId);
    // Add assertions here
}

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testShowDialogWithTrackingIdContainsSpecialCharacters_GMoZ4() {
    ChangeArrivalDeadlineDialog changeArrivalDeadlineDialog = new ChangeArrivalDeadlineDialog();
    String trackingId = "123!@#";
    changeArrivalDeadlineDialog.showDialog(trackingId);
    // Add assertions here
}

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testShowDialogWithTrackingIdContainsNumericValuesOnly_dvos5() {
    ChangeArrivalDeadlineDialog changeArrivalDeadlineDialog = new ChangeArrivalDeadlineDialog();
    String trackingId = "1234567890";
    changeArrivalDeadlineDialog.showDialog(trackingId);
    // Add assertions here
}

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testShowDialogWithTrackingIdContainsAlphanumericValues_ROqQ6() {
    ChangeArrivalDeadlineDialog changeArrivalDeadlineDialog = new ChangeArrivalDeadlineDialog();
    String trackingId = "123abc456";
    changeArrivalDeadlineDialog.showDialog(trackingId);
    // Add assertions here
}

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testShowDialogWithTrackingIdContainsSpecialCharactersAndNumericValues_OZey7() {
    ChangeArrivalDeadlineDialog changeArrivalDeadlineDialog = new ChangeArrivalDeadlineDialog();
    String trackingId = "123!@#456";
    changeArrivalDeadlineDialog.showDialog(trackingId);
    // Add assertions here
}

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testShowDialogWithTrackingIdContainsSpecialCharactersAndAlphanumericValues_yixv8() {
    ChangeArrivalDeadlineDialog changeArrivalDeadlineDialog = new ChangeArrivalDeadlineDialog();
    String trackingId = "123!@#abc456";
    changeArrivalDeadlineDialog.showDialog(trackingId);
    // Add assertions here
}

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testShowDialog_KSaX0_fid1() {
    ChangeArrivalDeadlineDialog changeArrivalDeadlineDialog = new ChangeArrivalDeadlineDialog();
    String trackingId = "12345";
    changeArrivalDeadlineDialog.showDialog(trackingId);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testShowDialogWithNullTrackingId_NMLi1_fid1() {
    ChangeArrivalDeadlineDialog changeArrivalDeadlineDialog = new ChangeArrivalDeadlineDialog();
    String trackingId = null;
    changeArrivalDeadlineDialog.showDialog(trackingId);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testShowDialogWithEmptyTrackingId_VZor2_fid1() {
    ChangeArrivalDeadlineDialog changeArrivalDeadlineDialog = new ChangeArrivalDeadlineDialog();
    String trackingId = "";
    changeArrivalDeadlineDialog.showDialog(trackingId);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testShowDialogWithTrackingIdLengthExceedsLimit_rBwq3_fid1() {
    ChangeArrivalDeadlineDialog changeArrivalDeadlineDialog = new ChangeArrivalDeadlineDialog();
    String trackingId = "123456789012345678901234567890";
    changeArrivalDeadlineDialog.showDialog(trackingId);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testShowDialogWithTrackingIdContainsSpecialCharacters_GMoZ4_fid1() {
    ChangeArrivalDeadlineDialog changeArrivalDeadlineDialog = new ChangeArrivalDeadlineDialog();
    String trackingId = "123!@#";
    changeArrivalDeadlineDialog.showDialog(trackingId);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testShowDialogWithTrackingIdContainsNumericValuesOnly_dvos5_fid1() {
    ChangeArrivalDeadlineDialog changeArrivalDeadlineDialog = new ChangeArrivalDeadlineDialog();
    String trackingId = "1234567890";
    changeArrivalDeadlineDialog.showDialog(trackingId);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testShowDialogWithTrackingIdContainsAlphanumericValues_ROqQ6_fid1() {
    ChangeArrivalDeadlineDialog changeArrivalDeadlineDialog = new ChangeArrivalDeadlineDialog();
    String trackingId = "123abc456";
    changeArrivalDeadlineDialog.showDialog(trackingId);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testShowDialogWithTrackingIdContainsSpecialCharactersAndNumericValues_OZey7_fid1() {
    ChangeArrivalDeadlineDialog changeArrivalDeadlineDialog = new ChangeArrivalDeadlineDialog();
    String trackingId = "123!@#456";
    changeArrivalDeadlineDialog.showDialog(trackingId);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testShowDialogWithTrackingIdContainsSpecialCharactersAndAlphanumericValues_yixv8_fid1() {
    ChangeArrivalDeadlineDialog changeArrivalDeadlineDialog = new ChangeArrivalDeadlineDialog();
    String trackingId = "123!@#abc456";
    changeArrivalDeadlineDialog.showDialog(trackingId);
  }
}