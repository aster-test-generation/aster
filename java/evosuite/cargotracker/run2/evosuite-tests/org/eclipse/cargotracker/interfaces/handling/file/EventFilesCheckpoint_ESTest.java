/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 01 15:55:05 GMT 2024
 */

package org.eclipse.cargotracker.interfaces.handling.file;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import java.util.LinkedList;
import java.util.List;
import org.eclipse.cargotracker.interfaces.handling.file.EventFilesCheckpoint;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class EventFilesCheckpoint_ESTest extends EventFilesCheckpoint_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      EventFilesCheckpoint eventFilesCheckpoint0 = new EventFilesCheckpoint();
      LinkedList<File> linkedList0 = new LinkedList<File>();
      eventFilesCheckpoint0.setFiles(linkedList0);
      MockFile mockFile0 = new MockFile("");
      linkedList0.add(0, (File) mockFile0);
      File file0 = eventFilesCheckpoint0.nextFile();
      assertEquals(0L, eventFilesCheckpoint0.getFilePointer());
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      EventFilesCheckpoint eventFilesCheckpoint0 = new EventFilesCheckpoint();
      MockFile mockFile0 = new MockFile("", ".(jfFE");
      List<File> list0 = List.of((File) mockFile0, (File) mockFile0, (File) mockFile0, (File) mockFile0, (File) mockFile0, (File) mockFile0, (File) mockFile0);
      eventFilesCheckpoint0.setFiles(list0);
      File file0 = eventFilesCheckpoint0.nextFile();
      assertEquals(0L, eventFilesCheckpoint0.getFilePointer());
      assertNotNull(file0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      EventFilesCheckpoint eventFilesCheckpoint0 = new EventFilesCheckpoint();
      LinkedList<File> linkedList0 = new LinkedList<File>();
      eventFilesCheckpoint0.setFiles(linkedList0);
      MockFile mockFile0 = new MockFile("");
      linkedList0.add(0, (File) mockFile0);
      linkedList0.add((File) mockFile0);
      File file0 = eventFilesCheckpoint0.nextFile();
      assertNotNull(file0);
      assertEquals(0L, eventFilesCheckpoint0.getFilePointer());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      EventFilesCheckpoint eventFilesCheckpoint0 = new EventFilesCheckpoint();
      assertEquals(0L, eventFilesCheckpoint0.getFilePointer());
      
      eventFilesCheckpoint0.setFilePointer(1L);
      long long0 = eventFilesCheckpoint0.getFilePointer();
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      EventFilesCheckpoint eventFilesCheckpoint0 = new EventFilesCheckpoint();
      eventFilesCheckpoint0.setFilePointer((-2110L));
      long long0 = eventFilesCheckpoint0.getFilePointer();
      assertEquals((-2110L), long0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      EventFilesCheckpoint eventFilesCheckpoint0 = new EventFilesCheckpoint();
      LinkedList<File> linkedList0 = new LinkedList<File>();
      eventFilesCheckpoint0.setFiles(linkedList0);
      MockFile mockFile0 = new MockFile("");
      linkedList0.add(0, (File) mockFile0);
      File file0 = eventFilesCheckpoint0.currentFile();
      assertEquals(0L, eventFilesCheckpoint0.getFilePointer());
      assertNotNull(file0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      EventFilesCheckpoint eventFilesCheckpoint0 = new EventFilesCheckpoint();
      MockFile mockFile0 = new MockFile("", "O}=`_");
      File file0 = MockFile.createTempFile("O}=`_", ">5<ICjb+|yGx", (File) mockFile0);
      List<File> list0 = List.of(file0, file0, (File) mockFile0, file0);
      eventFilesCheckpoint0.setFiles(list0);
      File file1 = eventFilesCheckpoint0.currentFile();
      assertNotNull(file1);
      assertEquals(0L, eventFilesCheckpoint0.getFilePointer());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      EventFilesCheckpoint eventFilesCheckpoint0 = new EventFilesCheckpoint();
      eventFilesCheckpoint0.setFiles((List<File>) null);
      // Undeclared exception!
      try { 
        eventFilesCheckpoint0.nextFile();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.eclipse.cargotracker.interfaces.handling.file.EventFilesCheckpoint", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      EventFilesCheckpoint eventFilesCheckpoint0 = new EventFilesCheckpoint();
      eventFilesCheckpoint0.setFiles((List<File>) null);
      // Undeclared exception!
      try { 
        eventFilesCheckpoint0.currentFile();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.eclipse.cargotracker.interfaces.handling.file.EventFilesCheckpoint", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      EventFilesCheckpoint eventFilesCheckpoint0 = new EventFilesCheckpoint();
      eventFilesCheckpoint0.nextFile();
      eventFilesCheckpoint0.currentFile();
      assertEquals(0L, eventFilesCheckpoint0.getFilePointer());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      EventFilesCheckpoint eventFilesCheckpoint0 = new EventFilesCheckpoint();
      MockFile mockFile0 = new MockFile("", "O}=`_");
      List<File> list0 = List.of((File) mockFile0, (File) mockFile0, (File) mockFile0, (File) mockFile0);
      eventFilesCheckpoint0.setFiles(list0);
      File file0 = eventFilesCheckpoint0.currentFile();
      assertEquals(0L, eventFilesCheckpoint0.getFilePointer());
      assertNotNull(file0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      EventFilesCheckpoint eventFilesCheckpoint0 = new EventFilesCheckpoint();
      eventFilesCheckpoint0.currentFile();
      assertEquals(0L, eventFilesCheckpoint0.getFilePointer());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      EventFilesCheckpoint eventFilesCheckpoint0 = new EventFilesCheckpoint();
      MockFile mockFile0 = new MockFile("", ".(jfFE");
      List<File> list0 = List.of((File) mockFile0, (File) mockFile0, (File) mockFile0, (File) mockFile0, (File) mockFile0, (File) mockFile0, (File) mockFile0);
      eventFilesCheckpoint0.setFiles(list0);
      File file0 = eventFilesCheckpoint0.currentFile();
      assertNotNull(file0);
      assertEquals(0L, eventFilesCheckpoint0.getFilePointer());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      EventFilesCheckpoint eventFilesCheckpoint0 = new EventFilesCheckpoint();
      long long0 = eventFilesCheckpoint0.getFilePointer();
      assertEquals(0L, long0);
  }
}
