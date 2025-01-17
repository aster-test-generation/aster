/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 01 15:52:11 GMT 2024
 */

package org.eclipse.cargotracker.interfaces.handling;

import org.junit.Test;
import static org.junit.Assert.*;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import org.eclipse.cargotracker.domain.model.cargo.TrackingId;
import org.eclipse.cargotracker.domain.model.handling.HandlingEvent;
import org.eclipse.cargotracker.domain.model.location.UnLocode;
import org.eclipse.cargotracker.domain.model.voyage.VoyageNumber;
import org.eclipse.cargotracker.interfaces.handling.HandlingEventRegistrationAttempt;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.MockLocalDateTime;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class HandlingEventRegistrationAttempt_ESTest extends HandlingEventRegistrationAttempt_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TrackingId trackingId0 = new TrackingId();
      HandlingEvent.Type handlingEvent_Type0 = HandlingEvent.Type.LOAD;
      UnLocode unLocode0 = new UnLocode();
      HandlingEventRegistrationAttempt handlingEventRegistrationAttempt0 = new HandlingEventRegistrationAttempt((LocalDateTime) null, (LocalDateTime) null, trackingId0, (VoyageNumber) null, handlingEvent_Type0, unLocode0);
      VoyageNumber voyageNumber0 = handlingEventRegistrationAttempt0.getVoyageNumber();
      assertNull(voyageNumber0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TrackingId trackingId0 = new TrackingId();
      VoyageNumber voyageNumber0 = new VoyageNumber();
      HandlingEvent.Type handlingEvent_Type0 = HandlingEvent.Type.CUSTOMS;
      UnLocode unLocode0 = new UnLocode();
      HandlingEventRegistrationAttempt handlingEventRegistrationAttempt0 = new HandlingEventRegistrationAttempt((LocalDateTime) null, (LocalDateTime) null, trackingId0, voyageNumber0, handlingEvent_Type0, unLocode0);
      HandlingEvent.Type handlingEvent_Type1 = handlingEventRegistrationAttempt0.getType();
      HandlingEventRegistrationAttempt handlingEventRegistrationAttempt1 = new HandlingEventRegistrationAttempt((LocalDateTime) null, (LocalDateTime) null, trackingId0, voyageNumber0, handlingEvent_Type1, (UnLocode) null);
      UnLocode unLocode1 = handlingEventRegistrationAttempt1.getUnLocode();
      assertNull(unLocode1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TrackingId trackingId0 = new TrackingId();
      HandlingEvent.Type handlingEvent_Type0 = HandlingEvent.Type.LOAD;
      UnLocode unLocode0 = new UnLocode();
      HandlingEventRegistrationAttempt handlingEventRegistrationAttempt0 = new HandlingEventRegistrationAttempt((LocalDateTime) null, (LocalDateTime) null, trackingId0, (VoyageNumber) null, handlingEvent_Type0, unLocode0);
      HandlingEvent.Type handlingEvent_Type1 = handlingEventRegistrationAttempt0.getType();
      assertSame(handlingEvent_Type1, handlingEvent_Type0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      VoyageNumber voyageNumber0 = new VoyageNumber();
      HandlingEvent.Type handlingEvent_Type0 = HandlingEvent.Type.CUSTOMS;
      UnLocode unLocode0 = new UnLocode();
      HandlingEventRegistrationAttempt handlingEventRegistrationAttempt0 = new HandlingEventRegistrationAttempt((LocalDateTime) null, (LocalDateTime) null, (TrackingId) null, voyageNumber0, handlingEvent_Type0, unLocode0);
      TrackingId trackingId0 = handlingEventRegistrationAttempt0.getTrackingId();
      assertNull(trackingId0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TrackingId trackingId0 = new TrackingId();
      VoyageNumber voyageNumber0 = new VoyageNumber();
      HandlingEvent.Type handlingEvent_Type0 = HandlingEvent.Type.CUSTOMS;
      UnLocode unLocode0 = new UnLocode();
      LocalDateTime localDateTime0 = MockLocalDateTime.now();
      HandlingEventRegistrationAttempt handlingEventRegistrationAttempt0 = new HandlingEventRegistrationAttempt(localDateTime0, (LocalDateTime) null, trackingId0, voyageNumber0, handlingEvent_Type0, unLocode0);
      handlingEventRegistrationAttempt0.getRegistrationTime();
      assertEquals("HandlingEventRegistrationAttempt{registrationTime=2014-02-14T20:21:21.320, completionTime=null, trackingId=null, voyageNumber=null, type=CUSTOMS, unLocode=null}", handlingEventRegistrationAttempt0.toString());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TrackingId trackingId0 = new TrackingId();
      VoyageNumber voyageNumber0 = new VoyageNumber();
      HandlingEvent.Type handlingEvent_Type0 = HandlingEvent.Type.CUSTOMS;
      UnLocode unLocode0 = new UnLocode();
      HandlingEventRegistrationAttempt handlingEventRegistrationAttempt0 = new HandlingEventRegistrationAttempt((LocalDateTime) null, (LocalDateTime) null, trackingId0, voyageNumber0, handlingEvent_Type0, unLocode0);
      HandlingEvent.Type handlingEvent_Type1 = handlingEventRegistrationAttempt0.getType();
      ZoneOffset zoneOffset0 = ZoneOffset.MAX;
      LocalDateTime localDateTime0 = MockLocalDateTime.ofEpochSecond((-358L), 5, zoneOffset0);
      HandlingEventRegistrationAttempt handlingEventRegistrationAttempt1 = new HandlingEventRegistrationAttempt((LocalDateTime) null, localDateTime0, trackingId0, voyageNumber0, handlingEvent_Type1, unLocode0);
      handlingEventRegistrationAttempt1.getCompletionTime();
      assertEquals("HandlingEventRegistrationAttempt{registrationTime=null, completionTime=1970-01-01T17:54:02.000000005, trackingId=null, voyageNumber=null, type=CUSTOMS, unLocode=null}", handlingEventRegistrationAttempt1.toString());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TrackingId trackingId0 = new TrackingId();
      VoyageNumber voyageNumber0 = new VoyageNumber();
      HandlingEvent.Type handlingEvent_Type0 = HandlingEvent.Type.CUSTOMS;
      UnLocode unLocode0 = new UnLocode();
      HandlingEventRegistrationAttempt handlingEventRegistrationAttempt0 = new HandlingEventRegistrationAttempt((LocalDateTime) null, (LocalDateTime) null, trackingId0, voyageNumber0, handlingEvent_Type0, unLocode0);
      UnLocode unLocode1 = handlingEventRegistrationAttempt0.getUnLocode();
      assertSame(unLocode0, unLocode1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TrackingId trackingId0 = new TrackingId();
      VoyageNumber voyageNumber0 = new VoyageNumber();
      HandlingEvent.Type handlingEvent_Type0 = HandlingEvent.Type.CUSTOMS;
      UnLocode unLocode0 = new UnLocode();
      HandlingEventRegistrationAttempt handlingEventRegistrationAttempt0 = new HandlingEventRegistrationAttempt((LocalDateTime) null, (LocalDateTime) null, trackingId0, voyageNumber0, handlingEvent_Type0, unLocode0);
      String string0 = handlingEventRegistrationAttempt0.toString();
      assertEquals("HandlingEventRegistrationAttempt{registrationTime=null, completionTime=null, trackingId=null, voyageNumber=null, type=CUSTOMS, unLocode=null}", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TrackingId trackingId0 = new TrackingId();
      VoyageNumber voyageNumber0 = new VoyageNumber();
      HandlingEvent.Type handlingEvent_Type0 = HandlingEvent.Type.CUSTOMS;
      UnLocode unLocode0 = new UnLocode();
      HandlingEventRegistrationAttempt handlingEventRegistrationAttempt0 = new HandlingEventRegistrationAttempt((LocalDateTime) null, (LocalDateTime) null, trackingId0, voyageNumber0, handlingEvent_Type0, unLocode0);
      LocalDateTime localDateTime0 = handlingEventRegistrationAttempt0.getRegistrationTime();
      assertNull(localDateTime0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TrackingId trackingId0 = new TrackingId();
      VoyageNumber voyageNumber0 = new VoyageNumber();
      HandlingEvent.Type handlingEvent_Type0 = HandlingEvent.Type.CUSTOMS;
      UnLocode unLocode0 = new UnLocode();
      HandlingEventRegistrationAttempt handlingEventRegistrationAttempt0 = new HandlingEventRegistrationAttempt((LocalDateTime) null, (LocalDateTime) null, trackingId0, voyageNumber0, handlingEvent_Type0, unLocode0);
      VoyageNumber voyageNumber1 = handlingEventRegistrationAttempt0.getVoyageNumber();
      assertNull(voyageNumber1.getIdString());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TrackingId trackingId0 = new TrackingId();
      VoyageNumber voyageNumber0 = new VoyageNumber();
      HandlingEvent.Type handlingEvent_Type0 = HandlingEvent.Type.CUSTOMS;
      UnLocode unLocode0 = new UnLocode();
      HandlingEventRegistrationAttempt handlingEventRegistrationAttempt0 = new HandlingEventRegistrationAttempt((LocalDateTime) null, (LocalDateTime) null, trackingId0, voyageNumber0, handlingEvent_Type0, unLocode0);
      TrackingId trackingId1 = handlingEventRegistrationAttempt0.getTrackingId();
      assertSame(trackingId1, trackingId0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      TrackingId trackingId0 = new TrackingId();
      UnLocode unLocode0 = new UnLocode();
      HandlingEvent.Type handlingEvent_Type0 = HandlingEvent.Type.CUSTOMS;
      HandlingEventRegistrationAttempt handlingEventRegistrationAttempt0 = new HandlingEventRegistrationAttempt((LocalDateTime) null, (LocalDateTime) null, trackingId0, (VoyageNumber) null, handlingEvent_Type0, unLocode0);
      LocalDateTime localDateTime0 = handlingEventRegistrationAttempt0.getCompletionTime();
      assertNull(localDateTime0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TrackingId trackingId0 = new TrackingId();
      VoyageNumber voyageNumber0 = new VoyageNumber();
      UnLocode unLocode0 = new UnLocode();
      HandlingEventRegistrationAttempt handlingEventRegistrationAttempt0 = new HandlingEventRegistrationAttempt((LocalDateTime) null, (LocalDateTime) null, trackingId0, voyageNumber0, (HandlingEvent.Type) null, unLocode0);
      handlingEventRegistrationAttempt0.getType();
  }
}
