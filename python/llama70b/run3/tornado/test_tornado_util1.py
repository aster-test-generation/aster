import unittest
from tornado.util import *

class TestTimeoutError(unittest.TestCase):
    def test_init(self):
        e = TimeoutError()
        self.assertIsInstance(e, Exception)

class TestObjectDict(unittest.TestCase):
    def test_getattr(self):
        d = ObjectDict({'a': 1, 'b': 2})
        self.assertEqual(d.a, 1)
        self.assertEqual(d.b, 2)

    def test_setattr(self):
        d = ObjectDict({'a': 1, 'b': 2})
        d.c = 3
        self.assertEqual(d.c, 3)

    def test_getattr_missing(self):
        d = ObjectDict({'a': 1, 'b': 2})
        with self.assertRaises(AttributeError):
            d.c

class TestGzipDecompressor(unittest.TestCase):
    def test_init(self):
        d = GzipDecompressor()
        self.assertIsInstance(d.decompressobj, zlib.decompressobj)

    def test_decompress(self):
        d = GzipDecompressor()
        data = b'hello'
        decompressed = d.decompress(data)
        self.assertEqual(decompressed, data)

    def test_unconsumed_tail(self):
        d = GzipDecompressor()
        data = b'hello'
        d.decompress(data)
        self.assertEqual(d.unconsumed_tail, b'')

    def test_flush(self):
        d = GzipDecompressor()
        data = b'hello'
        d.decompress(data)
        self.assertEqual(d.flush(), b'')

class TestImportObject(unittest.TestCase):
    def test_import_object(self):
        obj = import_object('tornado.util')
        self.assertEqual(obj.__name__, 'util')

class TestExecIn(unittest.TestCase):
    def test_exec_in(self):
        code = 'x = 1'
        glob = {}
        exec_in(code, glob)
        self.assertEqual(glob['x'], 1)

class TestRaiseExcInfo(unittest.TestCase):
    def test_raise_exc_info(self):
        exc_info = (None, ValueError('test'), None)
        with self.assertRaises(ValueError):
            raise_exc_info(exc_info)

class TestErrnoFromException(unittest.TestCase):
    def test_errno_from_exception(self):
        e = OSError(1, 'test')
        self.assertEqual(errno_from_exception(e), 1)

class TestReUnescape(unittest.TestCase):
    def test_re_unescape(self):
        s = r'\x61'
        self.assertEqual(re_unescape(s), 'a')

class TestConfigurable(unittest.TestCase):
    def test_configurable_base(self):
        with self.assertRaises(NotImplementedError):
            Configurable.configurable_base()

    def test_configurable_default(self):
        with self.assertRaises(NotImplementedError):
            Configurable.configurable_default()

    def test_initialize(self):
        c = Configurable()
        c.initialize()

    def test_configure(self):
        c = Configurable()
        c.configure('tornado.util.Configurable', foo='bar')
        self.assertEqual(c.configurable_base().__impl_class, Configurable)
        self.assertEqual(c.configurable_base().__impl_kwargs, {'foo': 'bar'})

    def test_configured_class(self):
        c = Configurable()
        c.configure('tornado.util.Configurable', foo='bar')
        self.assertEqual(c.configured_class(), Configurable)

    def test_save_restore_configuration(self):
        c = Configurable()
        c.configure('tornado.util.Configurable', foo='bar')
        saved = c._save_configuration()
        c._restore_configuration(saved)
        self.assertEqual(c.configurable_base().__impl_class, Configurable)
        self.assertEqual(c.configurable_base().__impl_kwargs, {'foo': 'bar'})

class TestArgReplacer(unittest.TestCase):
    def test_init(self):
        a = ArgReplacer(lambda x: x, 'x')
        self.assertEqual(a.name, 'x')

    def test_get_old_value(self):
        a = ArgReplacer(lambda x: x, 'x')
        args = [1, 2]
        kwargs = {'x': 3}
        self.assertEqual(a.get_old_value(args, kwargs), 3)

    def test_replace(self):
        a = ArgReplacer(lambda x: x, 'x')
        args = [1, 2]
        kwargs = {'x': 3}
        old_value, new_args, new_kwargs = a.replace(4, args, kwargs)
        self.assertEqual(old_value, 3)
        self.assertEqual(new_args, [1, 2])
        self.assertEqual(new_kwargs, {'x': 4})

class TestTimedeltaToSeconds(unittest.TestCase):
    def test_timedelta_to_seconds(self):
        from datetime import timedelta
        td = timedelta(seconds=1)
        self.assertEqual(timedelta_to_seconds(td), 1)


if __name__ == '__main__':
    unittest.main()