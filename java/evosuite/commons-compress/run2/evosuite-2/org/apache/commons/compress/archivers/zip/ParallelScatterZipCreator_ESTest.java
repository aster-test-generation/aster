
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
import java.io.FileDescriptor;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.jar.JarEntry;
import java.util.zip.ZipEntry;
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
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.evosuite.runtime.mock.java.lang.MockThread;
import org.evosuite.runtime.mock.java.net.MockURI;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ParallelScatterZipCreator_ESTest extends ParallelScatterZipCreator_ESTest_scaffolding {

//  @Test(timeout = 4000)
//  public void test00()  throws Throwable, Exception  {
//    Future<?> future = executor.submit(new Runnable(){
//            @Override public void run() {
//          ParallelScatterZipCreator parallelScatterZipCreator0 = new ParallelScatterZipCreator();
//          ZipArchiveEntry zipArchiveEntry0 = null;
//          Callable<Delayed> callable0 = (Callable<Delayed>) mock(Callable.class, new ViolatedAssumptionAnswer());
//          doReturn((Object) null).when(callable0).call();
//          parallelScatterZipCreator0.submit(callable0);
//          parallelScatterZipCreator0.getStatisticsMessage();
//          InputStreamSupplier inputStreamSupplier0 = mock(InputStreamSupplier.class, new ViolatedAssumptionAnswer());
//          // Undeclared exception!
//          try {
//            parallelScatterZipCreator0.addArchiveEntry((ZipArchiveEntry) null, inputStreamSupplier0);
//            fail("Expecting exception: NullPointerException");
//
//          } catch(NullPointerException e) {
//             //
//             // no message in exception (getMessage() returned null)
//             //
//             verifyException("org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator", e);
//          }
//      }
//    });
//    future.get(4000, TimeUnit.MILLISECONDS);
//  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MockFile mockFile0 = new MockFile("|D98V46&Gvj}a:{T");
      String string0 = "e\\sl,e";
      MockFile mockFile1 = new MockFile(mockFile0, "esl,e");
      Path path0 = mockFile1.toPath();
      DefaultBackingStoreSupplier defaultBackingStoreSupplier0 = new DefaultBackingStoreSupplier(path0);
      ParallelScatterZipCreator parallelScatterZipCreator0 = new ParallelScatterZipCreator((ExecutorService) null, defaultBackingStoreSupplier0);
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
  public void test02()  throws Throwable  {
      ForkJoinPool.ForkJoinWorkerThreadFactory forkJoinPool_ForkJoinWorkerThreadFactory0 = ForkJoinPool.defaultForkJoinWorkerThreadFactory;
      ThreadGroup threadGroup0 = mock(ThreadGroup.class, new ViolatedAssumptionAnswer());
      String string0 = "&K1Q8n//K[UM";
      MockThread mockThread0 = new MockThread(threadGroup0, (Runnable) null, "&K1Q8n//K[UM", 263);
      Thread.UncaughtExceptionHandler thread_UncaughtExceptionHandler0 = mockThread0.getUncaughtExceptionHandler();
      boolean boolean0 = true;
      ForkJoinPool forkJoinPool0 = new ForkJoinPool(263, forkJoinPool_ForkJoinWorkerThreadFactory0, thread_UncaughtExceptionHandler0, true);
      MockFile mockFile0 = new MockFile("", "");
      Path path0 = mockFile0.toPath();
      DefaultBackingStoreSupplier defaultBackingStoreSupplier0 = new DefaultBackingStoreSupplier(path0);
      ParallelScatterZipCreator parallelScatterZipCreator0 = null;
      try {
        parallelScatterZipCreator0 = new ParallelScatterZipCreator(forkJoinPool0, defaultBackingStoreSupplier0, (-230));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Compression level is expected between -1~9
         //
         verifyException("org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ParallelScatterZipCreator parallelScatterZipCreator0 = new ParallelScatterZipCreator();
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      InputStreamSupplier inputStreamSupplier0 = mock(InputStreamSupplier.class, new ViolatedAssumptionAnswer());
      InputStreamSupplier inputStreamSupplier1 = mock(InputStreamSupplier.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        parallelScatterZipCreator0.addArchiveEntry(zipArchiveEntry0, inputStreamSupplier1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Method must be set on zipArchiveEntry: 
         //
         verifyException("org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ThreadFactory threadFactory0 = mock(ThreadFactory.class, new ViolatedAssumptionAnswer());
      doReturn((Thread) null, (Thread) null).when(threadFactory0).newThread(any(java.lang.Runnable.class));
      ThreadPoolExecutor.DiscardOldestPolicy threadPoolExecutor_DiscardOldestPolicy0 = new ThreadPoolExecutor.DiscardOldestPolicy();
      ScheduledThreadPoolExecutor scheduledThreadPoolExecutor0 = new ScheduledThreadPoolExecutor(0, threadFactory0, threadPoolExecutor_DiscardOldestPolicy0);
      ParallelScatterZipCreator parallelScatterZipCreator0 = new ParallelScatterZipCreator(scheduledThreadPoolExecutor0);
      ZipArchiveEntryRequestSupplier zipArchiveEntryRequestSupplier0 = mock(ZipArchiveEntryRequestSupplier.class, new ViolatedAssumptionAnswer());
      Callable<ScatterZipOutputStream> callable0 = parallelScatterZipCreator0.createCallable(zipArchiveEntryRequestSupplier0);
      JarArchiveEntry jarArchiveEntry0 = new JarArchiveEntry("Xz$o");
      jarArchiveEntry0.getLastModifiedTime();
      Thread thread0 = MockThread.currentThread();
      parallelScatterZipCreator0.submit(callable0);
      MockThread mockThread0 = new MockThread(thread0);
      scheduledThreadPoolExecutor0.setContinueExistingPeriodicTasksAfterShutdownPolicy(false);
      threadPoolExecutor_DiscardOldestPolicy0.rejectedExecution(mockThread0, scheduledThreadPoolExecutor0);
      InputStreamSupplier inputStreamSupplier0 = mock(InputStreamSupplier.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        parallelScatterZipCreator0.createCallable((ZipArchiveEntry) jarArchiveEntry0, inputStreamSupplier0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Method must be set on zipArchiveEntry: Xz$o
         //
         verifyException("org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ForkJoinPool forkJoinPool0 = new ForkJoinPool(4159);
      MockFile mockFile0 = new MockFile("j0f$#_sySPIML[", "j0f$#_sySPIML[");
      Path path0 = mockFile0.toPath();
      DefaultBackingStoreSupplier defaultBackingStoreSupplier0 = new DefaultBackingStoreSupplier(path0);
      ParallelScatterZipCreator parallelScatterZipCreator0 = null;
      try {
        parallelScatterZipCreator0 = new ParallelScatterZipCreator(forkJoinPool0, defaultBackingStoreSupplier0, 79);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Compression level is expected between -1~9
         //
         verifyException("org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ForkJoinTask.getPool();
      ParallelScatterZipCreator parallelScatterZipCreator0 = null;
      try {
        parallelScatterZipCreator0 = new ParallelScatterZipCreator((ExecutorService) null, (ScatterGatherBackingStoreSupplier) null, 775);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Compression level is expected between -1~9
         //
         verifyException("org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
        try {
          ParallelScatterZipCreator parallelScatterZipCreator0 = new ParallelScatterZipCreator();
          ZipArchiveEntryRequestSupplier zipArchiveEntryRequestSupplier0 = mock(ZipArchiveEntryRequestSupplier.class, new ViolatedAssumptionAnswer());
          Callable<ScatterZipOutputStream> callable0 = parallelScatterZipCreator0.createCallable(zipArchiveEntryRequestSupplier0);
          parallelScatterZipCreator0.submitStreamAwareCallable(callable0);
          ZipArchiveEntryRequestSupplier zipArchiveEntryRequestSupplier1 = mock(ZipArchiveEntryRequestSupplier.class, new ViolatedAssumptionAnswer());
          Callable<ScatterZipOutputStream> callable1 = parallelScatterZipCreator0.createCallable(zipArchiveEntryRequestSupplier1);
          parallelScatterZipCreator0.addArchiveEntry((ZipArchiveEntryRequestSupplier) null);
          Callable<Delayed> callable2 = (Callable<Delayed>) mock(Callable.class, new ViolatedAssumptionAnswer());
          doReturn((Object) null).when(callable2).call();
          parallelScatterZipCreator0.submit(callable2);
          parallelScatterZipCreator0.submit(callable1);
          String string0 = "";
          File file0 = MockFile.createTempFile("org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator", "");
          ZipArchiveOutputStream zipArchiveOutputStream0 = null;
          try {
            zipArchiveOutputStream0 = new ZipArchiveOutputStream(file0, 1470L);
            fail("Expecting exception: NoClassDefFoundError");
          
          } catch(NoClassDefFoundError e) {
             //
             // Could not initialize class org.apache.commons.compress.archivers.zip.ZipEncodingHelper
             //
             verifyException("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", e);
          }
        } catch(Throwable t) {
            // Need to catch declared exceptions
        }
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ThreadFactory threadFactory0 = mock(ThreadFactory.class, new ViolatedAssumptionAnswer());
      ThreadPoolExecutor.DiscardOldestPolicy threadPoolExecutor_DiscardOldestPolicy0 = new ThreadPoolExecutor.DiscardOldestPolicy();
      ScheduledThreadPoolExecutor scheduledThreadPoolExecutor0 = new ScheduledThreadPoolExecutor(0, threadFactory0, threadPoolExecutor_DiscardOldestPolicy0);
      MockFile mockFile0 = new MockFile((String) null, "'*+pr;;$");
      Path path0 = mockFile0.toPath();
      DefaultBackingStoreSupplier defaultBackingStoreSupplier0 = new DefaultBackingStoreSupplier(path0);
      ParallelScatterZipCreator parallelScatterZipCreator0 = new ParallelScatterZipCreator(scheduledThreadPoolExecutor0, defaultBackingStoreSupplier0, 0);
      ZipArchiveEntry zipArchiveEntry0 = null;
      ParallelScatterZipCreator parallelScatterZipCreator1 = new ParallelScatterZipCreator(scheduledThreadPoolExecutor0, defaultBackingStoreSupplier0);
      InputStreamSupplier inputStreamSupplier0 = mock(InputStreamSupplier.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        parallelScatterZipCreator1.createCallable((ZipArchiveEntry) null, inputStreamSupplier0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ForkJoinPool forkJoinPool0 = new ForkJoinPool();
      MockFile mockFile0 = new MockFile("e]57De");
      MockFile mockFile1 = new MockFile(mockFile0, "e]57De");
      Path path0 = mockFile1.toPath();
      DefaultBackingStoreSupplier defaultBackingStoreSupplier0 = new DefaultBackingStoreSupplier(path0);
      ParallelScatterZipCreator parallelScatterZipCreator0 = new ParallelScatterZipCreator(forkJoinPool0, defaultBackingStoreSupplier0, 0);
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      FileChannel fileChannel0 = mockFileInputStream0.getChannel();
      ZipArchiveOutputStream zipArchiveOutputStream0 = null;
      try {
        zipArchiveOutputStream0 = new ZipArchiveOutputStream(fileChannel0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class org.apache.commons.compress.archivers.zip.ZipEncodingHelper
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DefaultBackingStoreSupplier defaultBackingStoreSupplier0 = new DefaultBackingStoreSupplier((Path) null);
      ParallelScatterZipCreator parallelScatterZipCreator0 = new ParallelScatterZipCreator((ExecutorService) null, defaultBackingStoreSupplier0);
      ZipArchiveEntryRequestSupplier zipArchiveEntryRequestSupplier0 = mock(ZipArchiveEntryRequestSupplier.class, new ViolatedAssumptionAnswer());
      Callable<ScatterZipOutputStream> callable0 = parallelScatterZipCreator0.createCallable(zipArchiveEntryRequestSupplier0);
      // Undeclared exception!
      try { 
        parallelScatterZipCreator0.submitStreamAwareCallable(callable0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ParallelScatterZipCreator parallelScatterZipCreator0 = new ParallelScatterZipCreator();
      parallelScatterZipCreator0.getStatisticsMessage();
      ZipArchiveEntryRequestSupplier zipArchiveEntryRequestSupplier0 = mock(ZipArchiveEntryRequestSupplier.class, new ViolatedAssumptionAnswer());
      Callable<ScatterZipOutputStream> callable0 = parallelScatterZipCreator0.createCallable(zipArchiveEntryRequestSupplier0);
      parallelScatterZipCreator0.submit(callable0);
      URI uRI0 = MockURI.aHttpURI;
      MockFile mockFile0 = null;
      try {
        mockFile0 = new MockFile(uRI0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // URI scheme is not \"file\"
         //
         verifyException("java.io.File", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      int int0 = (-2121);
      int int1 = (-4214);
      TimeUnit timeUnit0 = TimeUnit.MILLISECONDS;
      ThreadFactory threadFactory0 = mock(ThreadFactory.class, new ViolatedAssumptionAnswer());
      ScheduledThreadPoolExecutor scheduledThreadPoolExecutor0 = null;
      try {
        scheduledThreadPoolExecutor0 = new ScheduledThreadPoolExecutor((-4214), threadFactory0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.concurrent.ThreadPoolExecutor", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ExecutorService executorService0 = null;
      MockFile mockFile0 = null;
      try {
        mockFile0 = new MockFile((String) null, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ForkJoinPool forkJoinPool0 = ForkJoinPool.commonPool();
      ParallelScatterZipCreator parallelScatterZipCreator0 = new ParallelScatterZipCreator(forkJoinPool0);
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      ZipArchiveEntryRequestSupplier zipArchiveEntryRequestSupplier0 = mock(ZipArchiveEntryRequestSupplier.class, new ViolatedAssumptionAnswer());
      parallelScatterZipCreator0.addArchiveEntry(zipArchiveEntryRequestSupplier0);
      InputStreamSupplier inputStreamSupplier0 = mock(InputStreamSupplier.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        parallelScatterZipCreator0.addArchiveEntry(zipArchiveEntry0, inputStreamSupplier0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Method must be set on zipArchiveEntry: 
         //
         verifyException("org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
          TimeUnit timeUnit0 = TimeUnit.NANOSECONDS;
          LinkedBlockingQueue<Runnable> linkedBlockingQueue0 = new LinkedBlockingQueue<Runnable>();
          ThreadFactory threadFactory0 = mock(ThreadFactory.class, new ViolatedAssumptionAnswer());
          ThreadPoolExecutor.CallerRunsPolicy threadPoolExecutor_CallerRunsPolicy0 = new ThreadPoolExecutor.CallerRunsPolicy();
          ThreadPoolExecutor threadPoolExecutor0 = null;
          try {
            threadPoolExecutor0 = new ThreadPoolExecutor(36, 0, 20L, timeUnit0, linkedBlockingQueue0, threadFactory0, threadPoolExecutor_CallerRunsPolicy0);
            fail("Expecting exception: IllegalArgumentException");
          
          } catch(IllegalArgumentException e) {
             //
             // no message in exception (getMessage() returned null)
             //
             verifyException("java.util.concurrent.ThreadPoolExecutor", e);
          }
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      int int0 = 9;
      TimeUnit timeUnit0 = TimeUnit.DAYS;
      ScheduledThreadPoolExecutor scheduledThreadPoolExecutor0 = new ScheduledThreadPoolExecutor(0);
      BlockingQueue<Runnable> blockingQueue0 = scheduledThreadPoolExecutor0.getQueue();
      ThreadFactory threadFactory0 = mock(ThreadFactory.class, new ViolatedAssumptionAnswer());
      doReturn((Thread) null).when(threadFactory0).newThread(any(java.lang.Runnable.class));
      ThreadPoolExecutor threadPoolExecutor0 = new ThreadPoolExecutor(9, 508, 508, timeUnit0, blockingQueue0, threadFactory0);
      String string0 = "Never";
      scheduledThreadPoolExecutor0.getCompletedTaskCount();
      MockFile mockFile0 = new MockFile("Never", "Never");
      Path path0 = mockFile0.toPath();
      DefaultBackingStoreSupplier defaultBackingStoreSupplier0 = new DefaultBackingStoreSupplier(path0);
      TimeUnit timeUnit1 = TimeUnit.NANOSECONDS;
      scheduledThreadPoolExecutor0.getKeepAliveTime(timeUnit1);
      ParallelScatterZipCreator parallelScatterZipCreator0 = new ParallelScatterZipCreator(threadPoolExecutor0, defaultBackingStoreSupplier0);
      Callable<Delayed> callable0 = (Callable<Delayed>) mock(Callable.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        parallelScatterZipCreator0.submit(callable0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.util.concurrent.FutureTask cannot be cast to java.util.concurrent.RunnableScheduledFuture
         //
         verifyException("java.util.concurrent.ScheduledThreadPoolExecutor$DelayedWorkQueue", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      TimeUnit timeUnit0 = TimeUnit.SECONDS;
      SynchronousQueue<Runnable> synchronousQueue0 = new SynchronousQueue<Runnable>();
      ThreadFactory threadFactory0 = mock(ThreadFactory.class, new ViolatedAssumptionAnswer());
      ThreadPoolExecutor.DiscardOldestPolicy threadPoolExecutor_DiscardOldestPolicy0 = new ThreadPoolExecutor.DiscardOldestPolicy();
      ThreadPoolExecutor threadPoolExecutor0 = null;
      try {
        threadPoolExecutor0 = new ThreadPoolExecutor((-128), (-846), 0L, timeUnit0, synchronousQueue0, threadFactory0, threadPoolExecutor_DiscardOldestPolicy0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.concurrent.ThreadPoolExecutor", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ForkJoinPool forkJoinPool0 = new ForkJoinPool();
      String string0 = "";
      String string1 = "";
      try { 
        MockURI.URI("", "", "");
        fail("Expecting exception: URISyntaxException");
      
      } catch(URISyntaxException e) {
         //
         // Expected scheme name at index 0: :#
         //
         verifyException("java.net.URI$Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ParallelScatterZipCreator parallelScatterZipCreator0 = new ParallelScatterZipCreator();
      ZipEntry zipEntry0 = new ZipEntry("");
      ZipEntry zipEntry1 = new ZipEntry(zipEntry0);
      zipEntry1.setCompressedSize(4096L);
      JarEntry jarEntry0 = new JarEntry(zipEntry1);
      JarArchiveEntry jarArchiveEntry0 = null;
      try {
        jarArchiveEntry0 = new JarArchiveEntry(jarEntry0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ZIP compression method can not be negative: -1
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ThreadFactory threadFactory0 = mock(ThreadFactory.class, new ViolatedAssumptionAnswer());
      ScheduledThreadPoolExecutor scheduledThreadPoolExecutor0 = null;
      try {
        scheduledThreadPoolExecutor0 = new ScheduledThreadPoolExecutor((-149), threadFactory0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.concurrent.ThreadPoolExecutor", e);
      }
  }
}
