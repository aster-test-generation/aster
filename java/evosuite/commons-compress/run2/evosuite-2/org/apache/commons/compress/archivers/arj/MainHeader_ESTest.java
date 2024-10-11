
/*
  Licensed to the Apache Software Foundation (ASF) under one or more
  contributor license agreements.  See the NOTICE file distributed with
  this work for additional information regarding copyright ownership.
  The ASF licenses this file to You under the Apache License, Version 2.0
  (the "License"); you may not use this file except in compliance with
  the License.  You may obtain a copy of the License at

      http://www.apache.org/licenses/LICENSE-2.0

  Unless required by applicable law or agreed to in writing, software
  distributed under the License is distributed on an "AS IS" BASIS,
  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  See the License for the specific language governing permissions and
  limitations under the License.
 */


package org.apache.commons.compress.archivers.arj;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.compress.archivers.arj.MainHeader;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class MainHeader_ESTest extends MainHeader_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MainHeader mainHeader0 = new MainHeader();
      mainHeader0.dateTimeCreated = (-2071);
      String string0 = mainHeader0.toString();
      assertEquals("MainHeader [archiverVersionNumber=0, minVersionToExtract=0, hostOS=0, arjFlags=0, securityVersion=0, fileType=0, reserved=0, dateTimeCreated=-2071, dateTimeModified=0, archiveSize=0, securityEnvelopeFilePosition=0, fileSpecPosition=0, securityEnvelopeLength=0, encryptionVersion=0, lastChapter=0, arjProtectionFactor=0, arjFlags2=0, name=null, comment=null, extendedHeaderBytes=null]", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MainHeader mainHeader0 = new MainHeader();
      mainHeader0.reserved = 1;
      String string0 = mainHeader0.toString();
      assertEquals("MainHeader [archiverVersionNumber=0, minVersionToExtract=0, hostOS=0, arjFlags=0, securityVersion=0, fileType=0, reserved=1, dateTimeCreated=0, dateTimeModified=0, archiveSize=0, securityEnvelopeFilePosition=0, fileSpecPosition=0, securityEnvelopeLength=0, encryptionVersion=0, lastChapter=0, arjProtectionFactor=0, arjFlags2=0, name=null, comment=null, extendedHeaderBytes=null]", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MainHeader mainHeader0 = new MainHeader();
      mainHeader0.fileType = 8;
      String string0 = mainHeader0.toString();
      assertEquals("MainHeader [archiverVersionNumber=0, minVersionToExtract=0, hostOS=0, arjFlags=0, securityVersion=0, fileType=8, reserved=0, dateTimeCreated=0, dateTimeModified=0, archiveSize=0, securityEnvelopeFilePosition=0, fileSpecPosition=0, securityEnvelopeLength=0, encryptionVersion=0, lastChapter=0, arjProtectionFactor=0, arjFlags2=0, name=null, comment=null, extendedHeaderBytes=null]", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MainHeader mainHeader0 = new MainHeader();
      mainHeader0.securityVersion = (-1772);
      String string0 = mainHeader0.toString();
      assertEquals("MainHeader [archiverVersionNumber=0, minVersionToExtract=0, hostOS=0, arjFlags=0, securityVersion=-1772, fileType=0, reserved=0, dateTimeCreated=0, dateTimeModified=0, archiveSize=0, securityEnvelopeFilePosition=0, fileSpecPosition=0, securityEnvelopeLength=0, encryptionVersion=0, lastChapter=0, arjProtectionFactor=0, arjFlags2=0, name=null, comment=null, extendedHeaderBytes=null]", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      MainHeader mainHeader0 = new MainHeader();
      mainHeader0.arjFlags = 9;
      String string0 = mainHeader0.toString();
      assertEquals("MainHeader [archiverVersionNumber=0, minVersionToExtract=0, hostOS=0, arjFlags=9, securityVersion=0, fileType=0, reserved=0, dateTimeCreated=0, dateTimeModified=0, archiveSize=0, securityEnvelopeFilePosition=0, fileSpecPosition=0, securityEnvelopeLength=0, encryptionVersion=0, lastChapter=0, arjProtectionFactor=0, arjFlags2=0, name=null, comment=null, extendedHeaderBytes=null]", string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      MainHeader mainHeader0 = new MainHeader();
      mainHeader0.hostOS = 2629;
      String string0 = mainHeader0.toString();
      assertEquals("MainHeader [archiverVersionNumber=0, minVersionToExtract=0, hostOS=2629, arjFlags=0, securityVersion=0, fileType=0, reserved=0, dateTimeCreated=0, dateTimeModified=0, archiveSize=0, securityEnvelopeFilePosition=0, fileSpecPosition=0, securityEnvelopeLength=0, encryptionVersion=0, lastChapter=0, arjProtectionFactor=0, arjFlags2=0, name=null, comment=null, extendedHeaderBytes=null]", string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      MainHeader mainHeader0 = new MainHeader();
      mainHeader0.minVersionToExtract = (-169);
      String string0 = mainHeader0.toString();
      assertEquals("MainHeader [archiverVersionNumber=0, minVersionToExtract=-169, hostOS=0, arjFlags=0, securityVersion=0, fileType=0, reserved=0, dateTimeCreated=0, dateTimeModified=0, archiveSize=0, securityEnvelopeFilePosition=0, fileSpecPosition=0, securityEnvelopeLength=0, encryptionVersion=0, lastChapter=0, arjProtectionFactor=0, arjFlags2=0, name=null, comment=null, extendedHeaderBytes=null]", string0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      MainHeader mainHeader0 = new MainHeader();
      mainHeader0.archiverVersionNumber = 3144;
      String string0 = mainHeader0.toString();
      assertEquals("MainHeader [archiverVersionNumber=3144, minVersionToExtract=0, hostOS=0, arjFlags=0, securityVersion=0, fileType=0, reserved=0, dateTimeCreated=0, dateTimeModified=0, archiveSize=0, securityEnvelopeFilePosition=0, fileSpecPosition=0, securityEnvelopeLength=0, encryptionVersion=0, lastChapter=0, arjProtectionFactor=0, arjFlags2=0, name=null, comment=null, extendedHeaderBytes=null]", string0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      MainHeader.Flags mainHeader_Flags0 = new MainHeader.Flags();
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      MainHeader.HostOS mainHeader_HostOS0 = new MainHeader.HostOS();
  }
}
