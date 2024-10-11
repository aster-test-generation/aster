
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


package org.apache.commons.compress.archivers.zip;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import java.io.PrintStream;
import java.net.URI;
import java.nio.channels.FileChannel;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.apache.commons.compress.archivers.jar.JarArchiveEntry;
import org.apache.commons.compress.archivers.zip.DefaultBackingStoreSupplier;
import org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator;
import org.apache.commons.compress.archivers.zip.ScatterZipOutputStream;
import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import org.apache.commons.compress.archivers.zip.ZipArchiveEntryRequestSupplier;
import org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream;
import org.apache.commons.compress.parallel.InputStreamSupplier;
import org.apache.commons.compress.parallel.ScatterGatherBackingStoreSupplier;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.mock.java.io.MockRandomAccessFile;
import org.evosuite.runtime.mock.java.net.MockURI;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ParallelScatterZipCreator_ESTest extends ParallelScatterZipCreator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ForkJoinTask.getPool();
      ParallelScatterZipCreator parallelScatterZipCreator0 = new ParallelScatterZipCreator((ExecutorService) null);
      ZipArchiveEntryRequestSupplier zipArchiveEntryRequestSupplier0 = mock(ZipArchiveEntryRequestSupplier.class, new ViolatedAssumptionAnswer());
      Callable<ScatterZipOutputStream> callable0 = parallelScatterZipCreator0.createCallable(zipArchiveEntryRequestSupplier0);
      // Undeclared exception!
      try { 
        parallelScatterZipCreator0.submit(callable0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ParallelScatterZipCreator parallelScatterZipCreator0 = new ParallelScatterZipCreator();
      ZipArchiveOutputStream zipArchiveOutputStream0 = null;
      parallelScatterZipCreator0.writeTo((ZipArchiveOutputStream) null);
      ZipArchiveEntryRequestSupplier zipArchiveEntryRequestSupplier0 = mock(ZipArchiveEntryRequestSupplier.class, new ViolatedAssumptionAnswer());
      Callable<ScatterZipOutputStream> callable0 = parallelScatterZipCreator0.createCallable(zipArchiveEntryRequestSupplier0);
      // Undeclared exception!
      try { 
        parallelScatterZipCreator0.submitStreamAwareCallable(callable0);
        fail("Expecting exception: RejectedExecutionException");
      
      } catch(RejectedExecutionException e) {
         //
         // Task java.util.concurrent.FutureTask@20977aef rejected from java.util.concurrent.ThreadPoolExecutor@37a881b0[Terminated, pool size = 0, active threads = 0, queued tasks = 0, completed tasks = 0]
         //
         verifyException("java.util.concurrent.ThreadPoolExecutor$AbortPolicy", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
        try {
          ForkJoinPool forkJoinPool0 = new ForkJoinPool(1243);
          ParallelScatterZipCreator parallelScatterZipCreator0 = new ParallelScatterZipCreator(forkJoinPool0);
          ZipArchiveEntryRequestSupplier zipArchiveEntryRequestSupplier0 = mock(ZipArchiveEntryRequestSupplier.class, new ViolatedAssumptionAnswer());
          Callable<ScatterZipOutputStream> callable0 = parallelScatterZipCreator0.createCallable(zipArchiveEntryRequestSupplier0);
          parallelScatterZipCreator0.submitStreamAwareCallable(callable0);
          forkJoinPool0.hasQueuedSubmissions();
          try { 
            parallelScatterZipCreator0.writeTo((ZipArchiveOutputStream) null);
            fail("Expecting exception: ExecutionException");
          
          } catch(ExecutionException e) {
             //
             // java.lang.SecurityException: java.lang.SecurityException: Unable to create temporary file or directory
             //
             verifyException("java.util.concurrent.ForkJoinTask", e);
          }
        } catch(Throwable t) {
            // Need to catch declared exceptions
        }
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
          ParallelScatterZipCreator parallelScatterZipCreator0 = new ParallelScatterZipCreator();
          ZipArchiveEntryRequestSupplier zipArchiveEntryRequestSupplier0 = mock(ZipArchiveEntryRequestSupplier.class, new ViolatedAssumptionAnswer());
          parallelScatterZipCreator0.addArchiveEntry(zipArchiveEntryRequestSupplier0);
          ZipArchiveEntry zipArchiveEntry0 = null;
          InputStreamSupplier inputStreamSupplier0 = mock(InputStreamSupplier.class, new ViolatedAssumptionAnswer());
          InputStreamSupplier inputStreamSupplier1 = mock(InputStreamSupplier.class, new ViolatedAssumptionAnswer());
          // Undeclared exception!
          try { 
            parallelScatterZipCreator0.createCallable((ZipArchiveEntry) null, inputStreamSupplier1);
            fail("Expecting exception: NullPointerException");
          
          } catch(NullPointerException e) {
             //
             // no message in exception (getMessage() returned null)
             //
             verifyException("org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator", e);
          }
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ForkJoinTask.getPool();
      ParallelScatterZipCreator parallelScatterZipCreator0 = new ParallelScatterZipCreator((ExecutorService) null, (ScatterGatherBackingStoreSupplier) null);
      ZipArchiveEntryRequestSupplier zipArchiveEntryRequestSupplier0 = mock(ZipArchiveEntryRequestSupplier.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        parallelScatterZipCreator0.addArchiveEntry(zipArchiveEntryRequestSupplier0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ForkJoinPool forkJoinPool0 = new ForkJoinPool();
      MockFile mockFile0 = new MockFile("&:s`!_Gy");
      MockFile mockFile1 = new MockFile(mockFile0, "/};QDd");
      mockFile0.mkdirs();
      Path path0 = mockFile1.toPath();
      DefaultBackingStoreSupplier defaultBackingStoreSupplier0 = new DefaultBackingStoreSupplier(path0);
      ParallelScatterZipCreator parallelScatterZipCreator0 = new ParallelScatterZipCreator(forkJoinPool0, defaultBackingStoreSupplier0);
      Callable<ScatterZipOutputStream> callable0 = parallelScatterZipCreator0.createCallable((ZipArchiveEntryRequestSupplier) null);
      parallelScatterZipCreator0.submitStreamAwareCallable(callable0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ForkJoinPool forkJoinPool0 = new ForkJoinPool(379);
      ParallelScatterZipCreator parallelScatterZipCreator0 = new ParallelScatterZipCreator(forkJoinPool0);
      URI uRI0 = MockURI.aFileURI;
      URI uRI1 = MockURI.relativize(uRI0, uRI0);
      MockFile mockFile0 = null;
      try {
        mockFile0 = new MockFile(uRI1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // URI is not absolute
         //
         verifyException("java.io.File", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ParallelScatterZipCreator parallelScatterZipCreator0 = new ParallelScatterZipCreator();
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator$1");
      // Undeclared exception!
      try { 
        parallelScatterZipCreator0.addArchiveEntry(zipArchiveEntry0, (InputStreamSupplier) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Method must be set on zipArchiveEntry: org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator$1
         //
         verifyException("org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ParallelScatterZipCreator parallelScatterZipCreator0 = new ParallelScatterZipCreator();
      ZipArchiveEntry zipArchiveEntry0 = null;
      ZipArchiveEntry zipArchiveEntry1 = new ZipArchiveEntry();
      InputStreamSupplier inputStreamSupplier0 = null;
      // Undeclared exception!
      try { 
        parallelScatterZipCreator0.createCallable(zipArchiveEntry1, (InputStreamSupplier) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Method must be set on zipArchiveEntry: 
         //
         verifyException("org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String string0 = "Z_/df71CQn";
      MockFile mockFile0 = new MockFile("Z_/df71CQn", "");
      Path path0 = mockFile0.toPath();
      DefaultBackingStoreSupplier defaultBackingStoreSupplier0 = new DefaultBackingStoreSupplier(path0);
      ParallelScatterZipCreator parallelScatterZipCreator0 = null;
      try {
        parallelScatterZipCreator0 = new ParallelScatterZipCreator((ExecutorService) null, defaultBackingStoreSupplier0, 1788);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Compression level is expected between -1~9
         //
         verifyException("org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ThreadPoolExecutor.DiscardOldestPolicy threadPoolExecutor_DiscardOldestPolicy0 = new ThreadPoolExecutor.DiscardOldestPolicy();
      ScheduledThreadPoolExecutor scheduledThreadPoolExecutor0 = new ScheduledThreadPoolExecutor(0, threadPoolExecutor_DiscardOldestPolicy0);
      MockFile mockFile0 = new MockFile("Bi(Gy2km{u");
      Path path0 = mockFile0.toPath();
      DefaultBackingStoreSupplier defaultBackingStoreSupplier0 = new DefaultBackingStoreSupplier(path0);
      ParallelScatterZipCreator parallelScatterZipCreator0 = new ParallelScatterZipCreator(scheduledThreadPoolExecutor0, defaultBackingStoreSupplier0, 0);
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      PrintStream printStream0 = mockPrintStream0.append(':');
      ZipArchiveOutputStream zipArchiveOutputStream0 = null;
      try {
        zipArchiveOutputStream0 = new ZipArchiveOutputStream(printStream0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class org.apache.commons.compress.archivers.zip.ZipEncodingHelper
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      TimeUnit timeUnit0 = TimeUnit.HOURS;
      LinkedBlockingDeque<Runnable> linkedBlockingDeque0 = new LinkedBlockingDeque<Runnable>();
      ThreadPoolExecutor threadPoolExecutor0 = null;
      try {
        threadPoolExecutor0 = new ThreadPoolExecutor(9, 9, (-445L), timeUnit0, linkedBlockingDeque0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.concurrent.ThreadPoolExecutor", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ParallelScatterZipCreator parallelScatterZipCreator0 = new ParallelScatterZipCreator();
      ZipArchiveEntryRequestSupplier zipArchiveEntryRequestSupplier0 = mock(ZipArchiveEntryRequestSupplier.class, new ViolatedAssumptionAnswer());
      Callable<ScatterZipOutputStream> callable0 = parallelScatterZipCreator0.createCallable(zipArchiveEntryRequestSupplier0);
      parallelScatterZipCreator0.getStatisticsMessage();
      parallelScatterZipCreator0.submit(callable0);
      ZipArchiveEntry zipArchiveEntry0 = null;
      // Undeclared exception!
      try { 
        parallelScatterZipCreator0.submitStreamAwareCallable((Callable<? extends ScatterZipOutputStream>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.concurrent.AbstractExecutorService", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ParallelScatterZipCreator parallelScatterZipCreator0 = new ParallelScatterZipCreator();
      Callable<Delayed> callable0 = (Callable<Delayed>) mock(Callable.class, new ViolatedAssumptionAnswer());
      MockFile mockFile0 = new MockFile("", "\"8D<s1i*,jk2P\"");
      ZipArchiveOutputStream zipArchiveOutputStream0 = null;
      try {
        zipArchiveOutputStream0 = new ZipArchiveOutputStream(mockFile0, 0L);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class org.apache.commons.compress.archivers.zip.ZipEncodingHelper
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ForkJoinPool forkJoinPool0 = ForkJoinPool.commonPool();
      File file0 = MockFile.createTempFile("Number of the disk of End Of Central Directory exceeds the limit of 65535.", "Time must not be null");
      MockFile mockFile0 = new MockFile(file0, "}i[RqR");
      Path path0 = mockFile0.toPath();
      DefaultBackingStoreSupplier defaultBackingStoreSupplier0 = new DefaultBackingStoreSupplier(path0);
      ParallelScatterZipCreator parallelScatterZipCreator0 = null;
      try {
        parallelScatterZipCreator0 = new ParallelScatterZipCreator(forkJoinPool0, defaultBackingStoreSupplier0, (-2629));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Compression level is expected between -1~9
         //
         verifyException("org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DefaultBackingStoreSupplier defaultBackingStoreSupplier0 = new DefaultBackingStoreSupplier((Path) null);
      ParallelScatterZipCreator parallelScatterZipCreator0 = new ParallelScatterZipCreator((ExecutorService) null, defaultBackingStoreSupplier0);
      InputStreamSupplier inputStreamSupplier0 = mock(InputStreamSupplier.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        parallelScatterZipCreator0.addArchiveEntry((ZipArchiveEntry) null, inputStreamSupplier0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ForkJoinPool forkJoinPool0 = ForkJoinPool.commonPool();
      Path path0 = null;
      DefaultBackingStoreSupplier defaultBackingStoreSupplier0 = new DefaultBackingStoreSupplier((Path) null);
      ParallelScatterZipCreator parallelScatterZipCreator0 = new ParallelScatterZipCreator(forkJoinPool0, defaultBackingStoreSupplier0);
      ZipArchiveEntryRequestSupplier zipArchiveEntryRequestSupplier0 = mock(ZipArchiveEntryRequestSupplier.class, new ViolatedAssumptionAnswer());
      parallelScatterZipCreator0.addArchiveEntry(zipArchiveEntryRequestSupplier0);
      OpenOption[] openOptionArray0 = new OpenOption[0];
      // Undeclared exception!
      try { 
        FileChannel.open((Path) null, openOptionArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.channels.FileChannel", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ParallelScatterZipCreator parallelScatterZipCreator0 = new ParallelScatterZipCreator();
      String string0 = null;
      File file0 = MockFile.createTempFile("a/X.%Rx", (String) null);
      MockRandomAccessFile mockRandomAccessFile0 = null;
      try {
        mockRandomAccessFile0 = new MockRandomAccessFile(file0, "BCJ_PPC_FILTER");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal mode \"BCJ_PPC_FILTER\" must be one of \"r\", \"rw\", \"rws\", or \"rwd\"
         //
         verifyException("java.io.RandomAccessFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ForkJoinPool forkJoinPool0 = new ForkJoinPool();
      Path path0 = null;
      DefaultBackingStoreSupplier defaultBackingStoreSupplier0 = new DefaultBackingStoreSupplier((Path) null);
      ParallelScatterZipCreator parallelScatterZipCreator0 = new ParallelScatterZipCreator(forkJoinPool0, defaultBackingStoreSupplier0);
      Callable<Delayed> callable0 = (Callable<Delayed>) mock(Callable.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(callable0).call();
      parallelScatterZipCreator0.submit(callable0);
      String string0 = "9q*";
      JarArchiveEntry jarArchiveEntry0 = new JarArchiveEntry("9q*");
      InputStreamSupplier inputStreamSupplier0 = null;
      // Undeclared exception!
      try { 
        parallelScatterZipCreator0.createCallable((ZipArchiveEntry) jarArchiveEntry0, (InputStreamSupplier) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Method must be set on zipArchiveEntry: 9q*
         //
         verifyException("org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator", e);
      }
  }
}
