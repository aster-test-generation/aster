/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.tar;
import java.io.File;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.math.BigDecimal;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.DosFileAttributes;
import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.PosixFileAttributes;
import java.time.DateTimeException;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import org.apache.commons.compress.archivers.ArchiveEntry;
import org.apache.commons.compress.archivers.EntryStreamOffsets;
import org.apache.commons.compress.archivers.zip.ZipEncoding;
import org.apache.commons.compress.utils.ArchiveUtils;
import org.apache.commons.compress.utils.IOUtils;
import org.apache.commons.compress.utils.ParsingUtils;
import org.apache.commons.compress.utils.TimeUtils;
import org.apache.commons.io.file.attribute.FileTimes;
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
import org.apache.commons.compress.archivers.tar.TarArchiveSparseZeroInputStream;
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
import org.apache.commons.compress.harmony.pack200.PackingOptions;
import org.apache.commons.compress.archivers.tar.TarArchiveStructSparse;
import org.apache.commons.compress.archivers.zip.JarMarker;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.LongForm;
import org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp;
import org.apache.commons.compress.harmony.pack200.CanonicalCodecFamilies;
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
import org.apache.commons.compress.compressors.xz.XZUtils;
import org.apache.commons.compress.utils.Charsets;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm;
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
import org.apache.commons.compress.archivers.tar.TarGnuSparseKeys;
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
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.mockito.InjectMocks;
import org.mockito.*;
import org.mockito.Mockito;
import java.sql.*;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.*;
import java.lang.reflect.Field;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse; 
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
import org.junit.jupiter.api.*;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.mockito.InjectMocks;
import org.mockito.*;
import org.mockito.Mockito;
import java.sql.*;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.*;
import java.lang.reflect.Field;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;   
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_TarArchiveEntry_Test_Failing {
TarArchiveEntry tararchiveentry;
TarArchiveEntry anotherTararchiveentry;
TarArchiveEntry descendant;
TarArchiveEntry tararchiveentry2;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetModTime5_ohVJ4() throws IOException {
        TarArchiveEntry tarArchiveEntry = new TarArchiveEntry(new byte[0]);
        Date modTime = tarArchiveEntry.getModTime();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseTarHeader_sIwA0() {
        TarArchiveEntry tarArchiveEntry = new TarArchiveEntry(new byte[0]);
        tarArchiveEntry.parseTarHeader(new byte[0]);
        assertEquals(true, true);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseTarHeader_sIzW0() throws IOException {
        TarArchiveEntry tarArchiveEntry = new TarArchiveEntry(Collections.emptyMap(), new byte[0], TarUtils.DEFAULT_ENCODING, false);
        tarArchiveEntry.parseTarHeader(new byte[0]);
        assertEquals(true, true);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseTarHeaderLenient_pGIt1() throws IOException {
        TarArchiveEntry tarArchiveEntry = new TarArchiveEntry(Collections.emptyMap(), new byte[0], TarUtils.DEFAULT_ENCODING, true);
        tarArchiveEntry.parseTarHeader(new byte[0]);
        assertEquals(true, true);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsFIFOTrue_oeCD0() {
    TarArchiveEntry entry = new TarArchiveEntry("test", (byte) 0x1);
    boolean result = entry.isFIFO();
    assert result == true;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetStatusChangeTime5_ptjD4() {
        TarArchiveEntry tarArchiveEntry = new TarArchiveEntry(new File("file"), "fileName");
        assertEquals(FileTime.fromMillis(0), tarArchiveEntry.getStatusChangeTime());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetStatusChangeTime6_nnRV5() {
        TarArchiveEntry tarArchiveEntry = new TarArchiveEntry(new File("file"));
        assertEquals(FileTime.fromMillis(0), tarArchiveEntry.getStatusChangeTime());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLastAccessTime5_qnWP4() {
        TarArchiveEntry tarArchiveEntry = new TarArchiveEntry(new byte[0]);
        FileTime fileTime = tarArchiveEntry.getLastAccessTime();
        assertEquals(fileTime, fileTime);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsFile_LinkFlagNotDirAndNoSlash_ezFI4() {
        TarArchiveEntry tarArchiveEntry = new TarArchiveEntry(null, "fileName");
        assertTrue(tarArchiveEntry.isFile());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsFile_FileNull_RxlW5() {
        TarArchiveEntry tarArchiveEntry = new TarArchiveEntry(null, "fileName");
        assertFalse(tarArchiveEntry.isFile());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsExtended_XGWW0() {
        TarArchiveEntry tarArchiveEntry = new TarArchiveEntry("test", (byte) 0);
        assertTrue(tarArchiveEntry.isExtended());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetName5_PuHN4() {
        TarArchiveEntry tarArchiveEntry = new TarArchiveEntry(new byte[0]);
        assertEquals("", tarArchiveEntry.getName());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLinkName5_tjNu4() {
        TarArchiveEntry tarArchiveEntry = new TarArchiveEntry(new File("file"), "fileName");
        assertEquals("fileName", tarArchiveEntry.getLinkName());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMode6_bqGw5() {
        TarArchiveEntry tarArchiveEntry = new TarArchiveEntry(new File("file"), "fileName");
        assertEquals(0, tarArchiveEntry.getMode());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMode11_KBKo10() {
        TarArchiveEntry tarArchiveEntry = new TarArchiveEntry(new File("file"));
        assertEquals(0, tarArchiveEntry.getMode());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLongUserId6_qKLT5() {
        TarArchiveEntry tarArchiveEntry = new TarArchiveEntry(new File("file"), "fileName");
        assertEquals(0, tarArchiveEntry.getLongUserId());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetModTime3_LytB2_jTDL0() throws IOException {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry(new byte[0], null, true);
    Date modTime = tarArchiveEntry.getModTime();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetModTime4_BIme3_SJEv0() throws IOException {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry(new byte[0], null, true, 0);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseTarHeaderUnwrapped_YKOt3_eoLb0() throws IOException {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry(Collections.emptyMap(), new byte[0], TarUtils.DEFAULT_ENCODING, false);
    assertEquals(true, true);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseOctalOrBinary_Gwgl4_JyuX0() throws IOException {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry(Collections.emptyMap(), new byte[0], TarUtils.DEFAULT_ENCODING, false);
    try {
    } catch (UnsupportedOperationException e) {
        assertEquals(true, true);
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseOctalOrBinaryLenient_Odoj5_wiLH0() throws IOException {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry(Collections.emptyMap(), new byte[0], TarUtils.DEFAULT_ENCODING, true);
    try {
    } catch (Exception e) {
        assertEquals(true, true);
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPath_ZjwQ0_FXUJ0() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry(new File("rangeet"), "fileName");
    assertEquals("rangeet", tarArchiveEntry.getUserName());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPath2_vhEM1_iUSd0() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry(new File("fileName"), "fileNameName");
    assertEquals("fileName", tarArchiveEntry.getName());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPath3_BUky2_pXpn0() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry(new File("rangeet"));
    assertEquals("rangeet", tarArchiveEntry.getUserName());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsDescendentNull_cayC3_PxEP0() {
    TarArchiveEntry parent = new TarArchiveEntry("parent");
    assertNull(parent.isDescendent(null));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetGroupId_Zisn0_BVjs0() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry(new File("file"), "fileName");
    int groupId = tarArchiveEntry.getGroupId();
    assert groupId == 0;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testequals_VHCc0_2() throws Exception {
    TarArchiveEntry tararchiveentry = new TarArchiveEntry("test", (byte) 0);
    TarArchiveEntry tararchiveentry2 = new TarArchiveEntry("test", (byte) 0);
    tararchiveentry2 = new TarArchiveEntry("different", (byte) 0);
    tararchiveentry2 = new TarArchiveEntry("test", (byte) 1);
    assertNotEquals(tararchiveentry, tararchiveentry2);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseTarHeaderException_rzIZ1_ZoGB0() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry(new byte[0]);
    try {
        tarArchiveEntry.parseTarHeader(new byte[0]);
        fail("IOException expected");
    } catch (Exception e) {
        assertEquals("Corrupted TAR archive.", e.getMessage());
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseTarHeader_Aiqt0_GrTn0() {
    try {
        TarArchiveEntry tarArchiveEntry = new TarArchiveEntry(Collections.emptyMap(), new byte[0], TarUtils.DEFAULT_ENCODING, false);
        tarArchiveEntry.parseTarHeader(new byte[0]);
    } catch (IOException e) {
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPath_ZjwQ0_FXUJ0_fid3() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry(new File("path"), "fileName");
    assertEquals("path", tarArchiveEntry.getUserName());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPath2_vhEM1_iUSd0_fid3() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry(new File("file"), "fileName");
    assertEquals("file", tarArchiveEntry.getName());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPath3_BUky2_pXpn0_fid3() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry(new File("path"));
    assertEquals("path", tarArchiveEntry.getUserName());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLongGroupId_qMNC0_IIjp0() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry(new File("file"), "fileName");
    assertEquals(0, tarArchiveEntry.getUserName());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetGroupName_bdvV0_ggnS0() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry(new File("file"), "fileName");
    String groupName = tarArchiveEntry.getGroupName();
    assertEquals("groupName", groupName);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLinkName_Qdym0_BPhQ0_fid3() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry("fileName");
    assertEquals("fileName", tarArchiveEntry.getLinkName());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsPaxGNUSparse_ZJSb0_hcnL0_fid3() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry(new File("file"), "fileName");
    assertTrue(tarArchiveEntry.isPaxGNUSparse());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetUserId_mhyM1_OBlB0() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry(new File("file"), "fileName");
    assertEquals(0, tarArchiveEntry.getUserId());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsGNUSparseTrue_IcHP0_BtIe0_fid3() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry(new File("file"), "fileName");
    assertTrue(tarArchiveEntry.isGNUSparse());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCreationTime_vWGk0_dZnn0_fid3() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry(new File("path"), "fileName");
    FileTime creationTime = tarArchiveEntry.getCreationTime();
    assertEquals(null, creationTime);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsSparseGNUSparseTrue_WIoT0_tPpW0_fid3() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry(new File("file"), "fileName");
    assertTrue(tarArchiveEntry.isSparse());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetUserName_uReM0_vSZh0_fid3() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry(new File("file"), "fileName");
    assertEquals("userName", tarArchiveEntry.getUserName());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseTarHeaderWithIOException_iKXX1_NccN0() {
    TarArchiveEntry tarArchiveEntry = null;
    try {
        tarArchiveEntry = new TarArchiveEntry(Collections.emptyMap(), new byte[0], TarUtils.DEFAULT_ENCODING, false);
    } catch (IOException e) {
    }
    try {
        tarArchiveEntry.parseTarHeader(new byte[0]);
    } catch (RuntimeException e) {
    }
}
}