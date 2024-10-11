/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.zip;
import java.io.Serializable;
import java.math.BigInteger;
import org.apache.commons.compress.compressors.lz77support.Parameters;
import org.apache.commons.compress.archivers.zip.ZipEightByteInteger;
import org.apache.commons.compress.harmony.unpack200.bytecode.RuntimeVisibleorInvisibleAnnotationsAttribute;
import org.apache.commons.compress.archivers.ar.ArArchiveEntry;
import org.apache.commons.compress.archivers.zip.ZipArchiveEntryRequestSupplier;
import org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream;
import org.apache.commons.compress.compressors.CompressorException;
import org.apache.commons.compress.archivers.zip.ZipFile;
import org.apache.commons.compress.compressors.deflate64.Deflate64CompressorInputStream;
import org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream;
import org.apache.commons.compress.archivers.zip.UnicodePathExtraField;
import org.apache.commons.compress.utils.IOUtils;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.ByteForm;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.IMethodRefForm;
import org.apache.commons.compress.archivers.examples.CloseableConsumer;
import org.apache.commons.compress.compressors.CompressorInputStream;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.LookupSwitchForm;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.LocalForm;
import org.apache.commons.compress.archivers.zip.Zip64Mode;
import org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode;
import org.apache.commons.compress.compressors.gzip.GzipParameters;
import org.apache.commons.compress.harmony.unpack200.CpBands;
import org.apache.commons.compress.harmony.unpack200.bytecode.DeprecatedAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.NewAttribute;
import org.apache.commons.compress.archivers.zip.PKWareExtraHeader;
import org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorInputStream;
import org.apache.commons.compress.harmony.unpack200.ClassBands;
import org.apache.commons.compress.archivers.zip.ZipEncodingHelper;
import org.apache.commons.compress.archivers.zip.ExtraFieldUtils;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.MultiANewArrayForm;
import org.apache.commons.compress.harmony.pack200.CPSignature;
import org.apache.commons.compress.compressors.pack200.Pack200Utils;
import org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.SingleByteReferenceForm;
import org.apache.commons.compress.archivers.zip.X000A_NTFS;
import org.apache.commons.compress.archivers.zip.SeekableChannelRandomAccessOutputStream;
import org.apache.commons.compress.parallel.FileBasedScatterGatherBackingStore;
import org.apache.commons.compress.utils.Sets;
import org.apache.commons.compress.utils.Iterators;
import org.apache.commons.compress.archivers.zip.ZipSplitReadOnlySeekableByteChannel;
import org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException;
import org.apache.commons.compress.archivers.ar.ArArchiveOutputStream;
import org.apache.commons.compress.harmony.unpack200.bytecode.LocalVariableTypeTableAttribute;
import org.apache.commons.compress.utils.CountingInputStream;
import org.apache.commons.compress.harmony.unpack200.SegmentUtils;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.ThisMethodRefForm;
import org.apache.commons.compress.archivers.zip.BitStream;
import org.apache.commons.compress.archivers.ArchiveInputStream;
import org.apache.commons.compress.compressors.CompressorStreamFactory;
import org.apache.commons.compress.archivers.arj.ArjArchiveEntry;
import org.apache.commons.compress.compressors.lzma.LZMACompressorInputStream;
import org.apache.commons.compress.utils.ArchiveUtils;
import org.apache.commons.compress.utils.ChecksumCalculatingInputStream;
import org.apache.commons.compress.compressors.snappy.SnappyCompressorOutputStream;
import org.apache.commons.compress.harmony.pack200.MetadataBandGroup;
import org.apache.commons.compress.archivers.Lister;
import org.apache.commons.compress.harmony.pack200.Codec;
import org.apache.commons.compress.harmony.pack200.CPNameAndType;
import org.apache.commons.compress.archivers.arj.ArjArchiveInputStream;
import org.apache.commons.compress.archivers.dump.DumpArchiveInputStream;
import org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorInputStream;
import org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry;
import org.apache.commons.compress.archivers.zip.InflaterInputStreamWithStatistics;
import org.apache.commons.compress.utils.ByteUtils;
import org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator;
import org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData;
import org.apache.commons.compress.utils.ServiceLoaderIterator;
import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream;
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import org.apache.commons.compress.harmony.unpack200.bytecode.Attribute;
import org.apache.commons.compress.harmony.pack200.CPClass;
import org.apache.commons.compress.harmony.unpack200.bytecode.AnnotationsAttribute;
import org.apache.commons.compress.utils.SeekableInMemoryByteChannel;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPConstant;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.ShortForm;
import org.apache.commons.compress.compressors.zstandard.ZstdCompressorInputStream;
import org.apache.commons.compress.archivers.zip.BinaryTree;
import org.apache.commons.compress.harmony.pack200.FileBands;
import org.apache.commons.compress.utils.CRC32VerifyingInputStream;
import org.apache.commons.compress.harmony.unpack200.bytecode.EnclosingMethodAttribute;
import org.apache.commons.compress.archivers.zip.ZipArchiveEntryPredicate;
import org.apache.commons.compress.archivers.sevenz.CLI;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.NewClassRefForm;
import org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream;
import org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader;
import org.apache.commons.compress.utils.BitInputStream;
import org.apache.commons.compress.utils.TimeUtils;
import org.apache.commons.compress.compressors.lzw.LZWInputStream;
import org.apache.commons.compress.archivers.zip.UnrecognizedExtraField;
import org.apache.commons.compress.harmony.unpack200.bytecode.LineNumberTableAttribute;
import org.apache.commons.compress.harmony.pack200.AttributeDefinitionBands;
import org.apache.commons.compress.utils.FixedLengthBlockOutputStream;
import org.apache.commons.compress.archivers.cpio.CpioArchiveEntry;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.StringRefForm;
import org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream;
import org.apache.commons.compress.archivers.jar.JarArchiveInputStream;
import org.apache.commons.compress.harmony.unpack200.bytecode.ConstantValueAttribute;
import org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream;
import org.apache.commons.compress.harmony.pack200.RunCodec;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.ByteCodeForm;
import org.apache.commons.compress.archivers.ArchiveOutputStream;
import org.apache.commons.compress.MemoryLimitException;
import org.apache.commons.compress.compressors.lz77support.AbstractLZ77CompressorInputStream;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPLong;
import org.apache.commons.compress.archivers.zip.ScatterStatistics;
import org.apache.commons.compress.java.util.jar.Pack200;
import org.apache.commons.compress.archivers.tar.TarArchiveInputStream;
import org.apache.commons.compress.harmony.unpack200.bytecode.ExceptionTableEntry;
import org.apache.commons.compress.utils.OsgiUtils;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;
import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.FloatRefForm;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPMethod;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.MethodRefForm;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPFieldRef;
import org.apache.commons.compress.archivers.jar.JarArchiveOutputStream;
import org.apache.commons.compress.compressors.xz.XZCompressorInputStream;
import org.apache.commons.compress.utils.ExactMath;
import org.apache.commons.compress.harmony.unpack200.AttributeLayoutMap;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPMember;
import org.apache.commons.compress.changes.ChangeSetResults;
import org.apache.commons.compress.harmony.pack200.CPInt;
import org.apache.commons.compress.harmony.unpack200.bytecode.ExceptionsAttribute;
import org.apache.commons.compress.archivers.tar.TarArchiveOutputStream;
import org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField;
import org.apache.commons.compress.harmony.unpack200.bytecode.BCIRenumberedAttribute;
import org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorInputStream;
import org.apache.commons.compress.parallel.ScatterGatherBackingStore;
import org.apache.commons.compress.archivers.zip.X0016_CertificateIdForCentralDirectory;
import org.apache.commons.compress.archivers.tar.TarConstants;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.SuperMethodRefForm;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPInteger;
import org.apache.commons.compress.harmony.pack200.PackingUtils;
import org.apache.commons.compress.parallel.InputStreamSupplier;
import org.apache.commons.compress.harmony.unpack200.Segment;
import org.apache.commons.compress.archivers.zip.RandomAccessOutputStream;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPMethodRef;
import org.apache.commons.compress.harmony.archive.internal.nls.Messages;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.ClassRefForm;
import org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.FieldRefForm;
import org.apache.commons.compress.harmony.unpack200.bytecode.LocalVariableTableAttribute;
import org.apache.commons.compress.harmony.unpack200.IMatcher;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.SwitchForm;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.LabelForm;
import org.apache.commons.compress.harmony.pack200.BHSDCodec;
import org.apache.commons.compress.archivers.zip.ZipShort;
import org.apache.commons.compress.harmony.unpack200.AttrDefinitionBands;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.DoubleForm;
import org.apache.commons.compress.harmony.unpack200.SegmentOptions;
import org.apache.commons.compress.archivers.zip.ZipArchiveInputStream;
import org.apache.commons.compress.archivers.dump.DumpArchiveConstants;
import org.apache.commons.compress.archivers.zip.AsiExtraField;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPString;
import org.apache.commons.compress.archivers.examples.Expander;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPConstantNumber;
import org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.TableSwitchForm;
import org.apache.commons.compress.compressors.lz77support.LZ77Compressor;
import org.apache.commons.compress.changes.ChangeSetPerformer;
import org.apache.commons.compress.archivers.tar.TarUtils;
import org.apache.commons.compress.archivers.ArchiveStreamFactory;
import org.apache.commons.compress.archivers.ar.ArArchiveInputStream;
import org.apache.commons.compress.compressors.snappy.FramedSnappyDialect;
import org.apache.commons.compress.changes.ChangeSet;
import org.apache.commons.compress.archivers.EntryStreamOffsets;
import org.apache.commons.compress.harmony.pack200.PopulationCodec;
import org.apache.commons.compress.utils.CharsetNames;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.ClassSpecificReferenceForm;
import org.apache.commons.compress.archivers.sevenz.SevenZOutputFile;
import org.apache.commons.compress.archivers.zip.Zip64RequiredException;
import org.apache.commons.compress.harmony.unpack200.bytecode.ClassConstantPool;
import org.apache.commons.compress.harmony.unpack200.IcBands;
import org.apache.commons.compress.compressors.z.ZCompressorInputStream;
import org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration;
import org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream;
import org.apache.commons.compress.compressors.CompressorStreamProvider;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.SuperFieldRefForm;
import org.apache.commons.compress.harmony.unpack200.bytecode.ConstantPoolEntry;
import org.apache.commons.compress.archivers.zip.ZipConstants;
import org.apache.commons.compress.harmony.pack200.PackingOptions;
import org.apache.commons.compress.archivers.tar.TarArchiveStructSparse;
import org.apache.commons.compress.archivers.zip.JarMarker;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.LongForm;
import org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp;
import org.apache.commons.compress.harmony.pack200.CanonicalCodecFamilies;
import org.apache.commons.compress.archivers.zip.CircularBuffer;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.ReferenceForm;
import org.apache.commons.compress.harmony.unpack200.BandSet;
import org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream;
import org.apache.commons.compress.archivers.zip.ZipMethod;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.InitMethodReferenceForm;
import org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream;
import org.apache.commons.compress.archivers.tar.TarArchiveSparseEntry;
import org.apache.commons.compress.utils.FileNameUtils;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPoolArrayCache;
import org.apache.commons.compress.utils.CloseShieldFilterInputStream;
import org.apache.commons.compress.utils.BoundedArchiveInputStream;
import org.apache.commons.compress.compressors.brotli.BrotliUtils;
import org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPField;
import org.apache.commons.compress.archivers.ArchiveEntry;
import org.apache.commons.compress.archivers.dump.ShortFileException;
import org.apache.commons.compress.compressors.CompressorOutputStream;
import org.apache.commons.compress.compressors.lzma.LZMACompressorOutputStream;
import org.apache.commons.compress.compressors.bzip2.BZip2Utils;
import org.apache.commons.compress.compressors.zstandard.ZstdUtils;
import org.apache.commons.compress.archivers.zip.NioZipEncoding;
import org.apache.commons.compress.compressors.xz.XZUtils;
import org.apache.commons.compress.utils.Charsets;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm;
import org.apache.commons.compress.archivers.zip.UnshrinkingInputStream;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.ThisFieldRefForm;
import org.apache.commons.compress.utils.ChecksumVerifyingInputStream;
import org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorOutputStream;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.NarrowClassRefForm;
import org.apache.commons.compress.archivers.dump.DumpArchiveException;
import org.apache.commons.compress.harmony.unpack200.bytecode.SourceFileAttribute;
import org.apache.commons.compress.archivers.zip.GeneralPurposeBit;
import org.apache.commons.compress.archivers.sevenz.SevenZMethod;
import org.apache.commons.compress.harmony.pack200.SegmentHeader;
import org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream;
import org.apache.commons.compress.harmony.pack200.BcBands;
import org.apache.commons.compress.harmony.pack200.CPFloat;
import org.apache.commons.compress.compressors.pack200.Pack200Strategy;
import org.apache.commons.compress.harmony.unpack200.bytecode.CodeAttribute;
import org.apache.commons.compress.archivers.zip.ZipExtraField;
import org.apache.commons.compress.archivers.jar.JarArchiveEntry;
import org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry;
import org.apache.commons.compress.harmony.pack200.IntList;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.VariableInstructionForm;
import org.apache.commons.compress.archivers.zip.ZipLong;
import org.apache.commons.compress.harmony.unpack200.NewAttributeBands;
import org.apache.commons.compress.utils.Lists;
import org.apache.commons.compress.PasswordRequiredException;
import org.apache.commons.compress.harmony.unpack200.bytecode.AnnotationDefaultAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.IntRefForm;
import org.apache.commons.compress.archivers.zip.ExtraFieldParsingBehavior;
import org.apache.commons.compress.archivers.sevenz.SevenZFile;
import org.apache.commons.compress.archivers.zip.FileRandomAccessOutputStream;
import org.apache.commons.compress.archivers.dump.DumpArchiveEntry;
import org.apache.commons.compress.harmony.pack200.Pack200ClassReader;
import org.apache.commons.compress.compressors.deflate.DeflateParameters;
import org.apache.commons.compress.archivers.sevenz.SevenZFileOptions;
import org.apache.commons.compress.harmony.pack200.CPDouble;
import org.apache.commons.compress.archivers.dump.UnrecognizedFormatException;
import org.apache.commons.compress.utils.CountingOutputStream;
import org.apache.commons.compress.utils.InputStreamStatistics;
import org.apache.commons.compress.compressors.xz.XZCompressorOutputStream;
import org.apache.commons.compress.archivers.zip.UnparseableExtraFieldBehavior;
import org.apache.commons.compress.harmony.unpack200.bytecode.SignatureAttribute;
import org.apache.commons.compress.harmony.unpack200.Pack200UnpackerAdapter;
import org.apache.commons.compress.compressors.FileNameUtil;
import org.apache.commons.compress.archivers.zip.X7875_NewUnix;
import org.apache.commons.compress.utils.FlushShieldFilterOutputStream;
import org.apache.commons.compress.parallel.ScatterGatherBackingStoreSupplier;
import org.apache.commons.compress.archivers.ArchiveException;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.WideForm;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.ThisInitMethodRefForm;
import org.apache.commons.compress.archivers.tar.TarFile;
import org.apache.commons.compress.archivers.dump.InvalidFormatException;
import org.apache.commons.compress.harmony.unpack200.IcTuple;
import org.apache.commons.compress.harmony.unpack200.AttributeLayout;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPRef;
import org.apache.commons.compress.archivers.zip.ScatterZipOutputStream;
import org.apache.commons.compress.utils.ParsingUtils;
import org.apache.commons.compress.archivers.zip.CharsetAccessor;
import org.apache.commons.compress.archivers.dump.UnsupportedCompressionAlgorithmException;
import org.apache.commons.compress.archivers.zip.DefaultBackingStoreSupplier;
import org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream;
import org.apache.commons.compress.harmony.unpack200.bytecode.RuntimeVisibleorInvisibleParameterAnnotationsAttribute;
import org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream;
import org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream;
import org.apache.commons.compress.harmony.unpack200.bytecode.ClassFile;
import org.apache.commons.compress.archivers.zip.ZipSplitOutputStream;
import org.apache.commons.compress.harmony.pack200.Pack200PackerAdapter;
import org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField;
import org.apache.commons.compress.archivers.StreamingNotSupportedException;
import org.apache.commons.compress.archivers.dump.DumpArchiveSummary;
import org.apache.commons.compress.compressors.lz4.XXHash32;
import org.apache.commons.compress.archivers.ArchiveStreamProvider;
import org.apache.commons.compress.harmony.pack200.CodecEncoding;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.NewInitMethodRefForm;
import org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField;
import org.apache.commons.compress.archivers.zip.X0019_EncryptionRecipientCertificateList;
import org.apache.commons.compress.compressors.gzip.GzipUtils;
import org.apache.commons.compress.archivers.zip.UnixStat;
import org.apache.commons.compress.archivers.zip.ExplodingInputStream;
import org.apache.commons.compress.archivers.zip.X0014_X509Certificates;
import org.apache.commons.compress.archivers.zip.AbstractUnicodeExtraField;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPInterfaceMethodRef;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.IincForm;
import org.apache.commons.compress.utils.BoundedInputStream;
import org.apache.commons.compress.archivers.zip.StreamCompressor;
import org.apache.commons.compress.harmony.pack200.CPMethodOrField;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.SuperInitMethodRefForm;
import org.apache.commons.compress.archivers.zip.X0015_CertificateIdForFile;
import org.apache.commons.compress.harmony.unpack200.bytecode.InnerClassesAttribute;
import org.apache.commons.compress.archivers.zip.ZipArchiveEntryRequest;
import org.apache.commons.compress.compressors.lzma.LZMAUtils;
import org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel;
import org.apache.commons.compress.harmony.pack200.Pack200Exception;
import org.apache.commons.compress.archivers.zip.ZipIoUtil;
import org.apache.commons.compress.utils.SkipShieldingInputStream;
import org.apache.commons.compress.archivers.zip.ZipEncoding;
import org.apache.commons.compress.archivers.examples.Archiver;
import org.apache.commons.compress.archivers.zip.ZipUtil;
import org.apache.commons.compress.harmony.pack200.Pack200Adapter;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
import org.junit.jupiter.api.*;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
import org.junit.jupiter.api.*;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_ZipEightByteInteger_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueWithBytes_yqdR0() {
        byte[] bytes = new byte[] {1, 2, 3, 4, 5, 6, 7, 8};
        ZipEightByteInteger zip = new ZipEightByteInteger(bytes);
        BigInteger result = zip.getValue();
        assertEquals(BigInteger.valueOf(0x0102030405060708L), result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueWithBytesOffset_reho3() {
        byte[] bytes = new byte[] {1, 2, 3, 4, 5, 6, 7, 8};
        int offset = 0;
        ZipEightByteInteger zip = new ZipEightByteInteger(bytes, offset);
        BigInteger result = zip.getValue();
        assertEquals(BigInteger.valueOf(0x0102030405060708L), result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLongValue_XBxD0() {
        byte[] bytes = new byte[] {(byte) 0x01, (byte) 0x02, (byte) 0x03, (byte) 0x04, (byte) 0x05, (byte) 0x06, (byte) 0x07, (byte) 0x08};
        long result = ZipEightByteInteger.getLongValue(bytes);
        assertEquals(0x0102030405070808L, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBytesWithBigIntegerValue_OzWd0() {
        ZipEightByteInteger zipEightByteInteger = new ZipEightByteInteger(BigInteger.valueOf(1234567890123456789L));
        byte[] expected = new byte[] {(byte) 0x12, (byte) 0x34, (byte) 0x56, (byte) 0x78, (byte) 0x90, (byte) 0xAB, (byte) 0xCD, (byte) 0xEF};
        byte[] result = zipEightByteInteger.getBytes();
        assertArrayEquals(expected, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBytesWithLongValue_WDOU1() {
        ZipEightByteInteger zipEightByteInteger = new ZipEightByteInteger(1234567890123456789L);
        byte[] expected = new byte[] {(byte) 0x12, (byte) 0x34, (byte) 0x56, (byte) 0x78, (byte) 0x90, (byte) 0xAB, (byte) 0xCD, (byte) 0xEF};
        byte[] result = zipEightByteInteger.getBytes();
        assertArrayEquals(expected, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValueBytes_YFJr0() {
    byte[] bytes = new byte[] {1, 2, 3, 4, 5, 6, 7, 8};
    assertEquals(BigInteger.valueOf(0x0102030405060708L), ZipEightByteInteger.getValue(bytes));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValueBytesTooLong_Rlmd7() {
    byte[] bytes = new byte[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
    assertThrows(IndexOutOfBoundsException.class, () -> ZipEightByteInteger.getValue(bytes));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValueBytesLargeValue_goZg9() {
    byte[] bytes = new byte[] {(byte) 0x80, (byte) 0x80, (byte) 0x80, (byte) 0x80, (byte) 0x80, (byte) 0x80, (byte) 0x80, (byte) 0x80};
    assertEquals(BigInteger.valueOf(0x8000000000000000L), ZipEightByteInteger.getValue(bytes));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytesBigIntegerTwo_kvZt2() {
    byte[] result = ZipEightByteInteger.getBytes(BigInteger.valueOf(2));
    assert result[0] == 0;
    assert result[1] == 0;
    assert result[2] == 0;
    assert result[3] == 0;
    assert result[4] == 0;
    assert result[5] == 0;
    assert result[6] == 0;
    assert result[7] == 1;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytesBigIntegerNegativeOne_ACEZ5() {
    byte[] result = ZipEightByteInteger.getBytes(BigInteger.valueOf(-1));
    assert result[0] == (byte) 255;
    assert result[1] == (byte) 0;
    assert result[2] == (byte) 0;
    assert result[3] == (byte) 0;
    assert result[4] == (byte) 0;
    assert result[5] == (byte) 0;
    assert result[6] == (byte) 0;
    assert result[7] == (byte) 1;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytesLongValue1_Htxk1() {
    byte[] result = ZipEightByteInteger.getBytes(1);
    assert Arrays.equals(result, new byte[]{0, 0, 0, 0, 0, 0, 0, 1});
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytesLongValue2_FQBZ2() {
    byte[] result = ZipEightByteInteger.getBytes(2);
    assert Arrays.equals(result, new byte[]{0, 0, 0, 0, 0, 0, 1, 0});
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytesLongValue3_wvgd3() {
    byte[] result = ZipEightByteInteger.getBytes(3);
    assert Arrays.equals(result, new byte[]{0, 0, 0, 0, 0, 0, 1, 1});
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytesLongValue4_UhlT4() {
    byte[] result = ZipEightByteInteger.getBytes(4);
    assert Arrays.equals(result, new byte[]{0, 0, 0, 0, 0, 1, 0, 0});
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytesLongValue6_kvss6() {
    byte[] result = ZipEightByteInteger.getBytes(6);
    assert Arrays.equals(result, new byte[]{0, 0, 0, 0, 0, 1, 1, 0});
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytesLongValue7_IOQZ7() {
    byte[] result = ZipEightByteInteger.getBytes(7);
    assert Arrays.equals(result, new byte[]{0, 0, 0, 0, 0, 1, 1, 1});
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytesLongValue9_cMCW9() {
    byte[] result = ZipEightByteInteger.getBytes(9);
    assert Arrays.equals(result, new byte[]{0, 0, 0, 0, 1, 0, 0, 1});
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToStringWithBigInteger_Qkyp1_WDIB1() {
    ZipEightByteInteger zip = new ZipEightByteInteger(BigInteger.valueOf(1));
    assertEquals("ZipEightByteInteger value: " + zip, zip.toString());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValueLong_ztdP2_fKKr0() {
    byte[] bytes = new byte[8];
    bytes[0] = (byte) 0x01;
    bytes[1] = (byte) 0x02;
    bytes[2] = (byte) 0x03;
    bytes[3] = (byte) 0x04;
    bytes[4] = (byte) 0x05;
    bytes[5] = (byte) 0x06;
    bytes[6] = (byte) 0x07;
    bytes[7] = (byte) 0x08;
    assertEquals(BigInteger.valueOf(0x0102030405060708L), ZipEightByteInteger.getValue(bytes, 0));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValueBigInteger_hfNm3_CrgW0() {
    BigInteger bigInteger = BigInteger.valueOf(0x0102030405060708L);
    byte[] bytes = bigInteger.toByteArray();
    assertEquals(bigInteger, ZipEightByteInteger.getValue(bytes, 0));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValueBytesOffset_eusN1() {
    byte[] bytes = new byte[] {1, 2, 3, 4, 5, 6, 7, 8};
    assertEquals(BigInteger.valueOf(0x0203040506070809L), ZipEightByteInteger.getValue(bytes, 2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValueEmptyBytes_yJde5_fid1() {
    byte[] bytes = new byte[0];
    assertThrows(NullPointerException.class, () -> ZipEightByteInteger.getValue(bytes));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytesLongValue5_KOSy5_fid1() {
    byte[] result = ZipEightByteInteger.getBytes(5);
    assert Arrays.equals(result, new byte[]{0, 0, 0, 0, 0, 1, 0, 1});
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytesLongValue8_sBYf8_fid1() {
    byte[] result = ZipEightByteInteger.getBytes(8);
    assert Arrays.equals(result, new byte[]{0, 0, 0, 0, 1, 0, 0, 0});
}
}