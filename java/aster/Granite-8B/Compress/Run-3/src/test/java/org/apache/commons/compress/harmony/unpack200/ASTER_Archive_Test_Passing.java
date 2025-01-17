/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.unpack200;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.jar.JarOutputStream;
import org.apache.commons.compress.harmony.pack200.Pack200Exception;
import org.apache.commons.io.IOUtils;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_Archive_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUnpackWithInputFileNameAndOutputFileName_dFct1() throws Pack200Exception, IOException {
        Archive archive = new Archive("input.jar", "output.jar");
        archive.unpack();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUnpackWithInputStreamAndOutputStream_Kpnv0_SwRj0() throws Pack200Exception, IOException {
        InputStream inputStream = new FileInputStream("input.jar");
        JarOutputStream outputStream = new JarOutputStream(new FileOutputStream("output.jar"));
        Archive archive = new Archive(inputStream, outputStream);
        archive.unpack();
        IOUtils.closeQuietly(inputStream);
        IOUtils.closeQuietly(outputStream);
}
}