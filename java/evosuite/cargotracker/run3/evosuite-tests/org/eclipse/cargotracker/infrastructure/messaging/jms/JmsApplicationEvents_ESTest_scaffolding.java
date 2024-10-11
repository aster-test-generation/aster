/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Aug 01 16:27:08 GMT 2024
 */

package org.eclipse.cargotracker.infrastructure.messaging.jms;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class JmsApplicationEvents_ESTest_scaffolding {

  @org.junit.Rule
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.eclipse.cargotracker.infrastructure.messaging.jms.JmsApplicationEvents"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  @AfterClass
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("user.dir", "/home/myeongsoo/aster-bench/cargo3"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(JmsApplicationEvents_ESTest_scaffolding.class.getClassLoader() ,
      "org.eclipse.cargotracker.domain.model.location.Location",
      "org.eclipse.cargotracker.domain.model.handling.HandlingEvent",
      "org.eclipse.cargotracker.domain.shared.Specification",
      "org.eclipse.cargotracker.domain.model.cargo.RouteSpecification",
      "org.eclipse.cargotracker.interfaces.handling.HandlingEventRegistrationAttempt",
      "org.eclipse.cargotracker.application.ApplicationEvents",
      "org.eclipse.cargotracker.domain.shared.AbstractSpecification",
      "org.eclipse.cargotracker.domain.model.cargo.TrackingId",
      "org.eclipse.cargotracker.domain.model.handling.HandlingEvent$Type",
      "org.eclipse.cargotracker.domain.model.voyage.Voyage",
      "org.eclipse.cargotracker.domain.model.cargo.Itinerary",
      "org.eclipse.cargotracker.infrastructure.messaging.jms.JmsApplicationEvents",
      "org.eclipse.cargotracker.domain.model.cargo.Delivery",
      "org.eclipse.cargotracker.domain.model.cargo.Cargo",
      "org.eclipse.cargotracker.domain.model.handling.HandlingHistory"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(JmsApplicationEvents_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.eclipse.cargotracker.infrastructure.messaging.jms.JmsApplicationEvents",
      "org.eclipse.cargotracker.domain.model.cargo.Cargo",
      "org.eclipse.cargotracker.domain.model.cargo.TrackingId",
      "org.eclipse.cargotracker.domain.model.location.UnLocode",
      "org.eclipse.cargotracker.domain.model.location.Location",
      "org.eclipse.cargotracker.domain.model.handling.HandlingEvent",
      "org.eclipse.cargotracker.domain.shared.AbstractSpecification",
      "org.eclipse.cargotracker.domain.model.cargo.RouteSpecification",
      "org.eclipse.cargotracker.domain.model.handling.HandlingHistory",
      "org.eclipse.cargotracker.domain.model.cargo.Itinerary",
      "org.eclipse.cargotracker.domain.shared.DomainObjectUtils",
      "org.eclipse.cargotracker.domain.model.voyage.VoyageNumber",
      "org.eclipse.cargotracker.interfaces.handling.HandlingEventRegistrationAttempt",
      "org.eclipse.cargotracker.domain.model.voyage.Voyage",
      "org.eclipse.cargotracker.domain.shared.AndSpecification",
      "org.eclipse.cargotracker.domain.shared.NotSpecification",
      "org.eclipse.cargotracker.domain.model.cargo.HandlingActivity",
      "org.eclipse.cargotracker.domain.model.cargo.Delivery",
      "org.eclipse.cargotracker.domain.model.cargo.Leg",
      "org.eclipse.cargotracker.domain.shared.OrSpecification",
      "org.eclipse.cargotracker.domain.model.voyage.Schedule"
    );
  }
}
