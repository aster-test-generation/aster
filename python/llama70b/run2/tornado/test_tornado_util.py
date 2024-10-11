from tornado.util import _websocket_mask
import unittest
from tornado.util import *


class TestTimeoutError(unittest.TestCase):
    def test_init(self):
        e = TimeoutError()
        self.assertIsInstance(e, Exception)

class TestObjectDict(unittest.TestCase):
    def test_init(self):
        obj = ObjectDict()
        self.assertIsInstance(obj, dict)

    def test_getattr(self):
        obj = ObjectDict({'foo': 'bar'})
        self.assertEqual(obj.foo, 'bar')

    def test_setattr(self):
        obj = ObjectDict()
        obj.foo = 'bar'
        self.assertEqual(obj['foo'], 'bar')

class TestGzipDecompressor(unittest.TestCase):
    def test_init(self):
        decompressor = GzipDecompressor()
        self.assertIsInstance(decompressor, GzipDecompressor)

    def test_decompress(self):
        decompressor = GzipDecompressor()
        data = b'Hello, World!'
        decompressed = decompressor.decompress(data)
        self.assertEqual(decompressed, data)

    def test_unconsumed_tail(self):
        decompressor = GzipDecompressor()
        data = b'Hello, World!'
        decompressor.decompress(data)
        self.assertEqual(decompressor.unconsumed_tail, b'')

    def test_flush(self):
        decompressor = GzipDecompressor()
        data = b'Hello, World!'
        decompressor.decompress(data)
        self.assertEqual(decompressor.flush(), b'')

class TestImportObject(unittest.TestCase):
    def test_import_object(self):
        obj = import_object('tornado.util')
        self.assertEqual(obj.__name__, 'util')

class TestExecIn(unittest.TestCase):
    def test_exec_in(self):
        code = 'x = 5'
        glob = {}
        exec_in(code, glob)
        self.assertEqual(glob['x'], 5)

class TestRaiseExcInfo(unittest.TestCase):
    def test_raise_exc_info(self):
        exc_info = (None, ValueError('Test'), None)
        with self.assertRaises(ValueError):
            raise_exc_info(exc_info)

class TestErrnoFromException(unittest.TestCase):
    def test_errno_from_exception(self):
        e = OSError(1, 'Test')
        self.assertEqual(errno_from_exception(e), 1)

class TestReUnescape(unittest.TestCase):
    def test_re_unescape(self):
        s = r'\x61'
        self.assertEqual(re_unescape(s), 'a')

class TestConfigurable(unittest.TestCase):
    def test_configurable_base(self):
        configurable = Configurable()
        with self.assertRaises(NotImplementedError):
            configurable.configurable_base()

    def test_configurable_default(self):
        configurable = Configurable()
        with self.assertRaises(NotImplementedError):
            configurable.configurable_default()

    def test_initialize(self):
        configurable = Configurable()
        configurable.initialize()

    def test_configure(self):
        configurable = Configurable()
        configurable.configure('tornado.util.Configurable')

    def test_configured_class(self):
        configurable = Configurable()
        configurable.configure('tornado.util.Configurable')
        self.assertEqual(configurable.configured_class(), Configurable)

class TestArgReplacer(unittest.TestCase):
    def test_init(self):
        arg_replacer = ArgReplacer(lambda x: x, 'x')
        self.assertIsInstance(arg_replacer, ArgReplacer)

    def test_get_old_value(self):
        arg_replacer = ArgReplacer(lambda x: x, 'x')
        args = [1]
        kwargs = {}
        self.assertEqual(arg_replacer.get_old_value(args, kwargs), 1)

    def test_replace(self):
        arg_replacer = ArgReplacer(lambda x: x, 'x')
        args = [1]
        kwargs = {}
        old_value, new_args, new_kwargs = arg_replacer.replace(2, args, kwargs)
        self.assertEqual(old_value, 1)
        self.assertEqual(new_args, [2])
        self.assertEqual(new_kwargs, {})

class TestTimedeltaToSeconds(unittest.TestCase):
    def test_timedelta_to_seconds(self):
        from datetime import timedelta
        td = timedelta(seconds=5)
        self.assertEqual(timedelta_to_seconds(td), 5)

class TestWebSocketMask(unittest.TestCase):
    def test_websocket_mask(self):
        mask = b'\x01\x02\x03\x04'
        data = b'Hello, World!'
        unmasked = _websocket_mask(mask, data)
        self.assertEqual(unmasked, data)

class TestDoctests(unittest.TestCase):
    def test_doctests(self):
        suite = doctests()
        self.assertIsInstance(suite, unittest.TestSuite)

class TestObjectDict(unittest.TestCase):
    def test_getattr(self):
        d = ObjectDict({'a': 1, 'b': 2})
        self.assertEqual(d.a, 1)
        self.assertEqual(d.b, 2)
        with self.assertRaises(AttributeError):
            d.c

    def test_setattr(self):
        d = ObjectDict({'a': 1, 'b': 2})
        d.c = 3
        self.assertEqual(d.c, 3)
        self.assertIn('c', d)

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

class TestExecIn(unittest.TestCase):
    def test_exec_in(self):
        code = 'x = 1'
        glob = {}
        exec_in(code, glob)
        self.assertIn('x', glob)
        self.assertEqual(glob['x'], 1)

class TestRaiseExcInfo(unittest.TestCase):
    def test_raise_exc_info(self):
        exc_info = (ValueError, ValueError('test'), None)
        with self.assertRaises(ValueError):
            raise_exc_info(exc_info)

class TestErrnoFromException(unittest.TestCase):
    def test_errno_from_exception(self):
        e = OSError(1, 'test')
        self.assertEqual(errno_from_exception(e), 1)

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

class TestArgReplacer(unittest.TestCase):
    def test_init(self):
        f = lambda x: x
        r = ArgReplacer(f, 'x')
        self.assertEqual(r.arg_pos, 0)

    def test_get_old_value(self):
        f = lambda x: x
        r = ArgReplacer(f, 'x')
        args = [1]
        kwargs = {}
        self.assertEqual(r.get_old_value(args, kwargs), 1)

    def test_replace(self):
        f = lambda x: x
        r = ArgReplacer(f, 'x')
        args = [1]
        kwargs = {}
        old_value, new_args, new_kwargs = r.replace(2, args, kwargs)
        self.assertEqual(old_value, 1)
        self.assertEqual(new_args, [2])
        self.assertEqual(new_kwargs, {})

class TestTimedeltaToSeconds(unittest.TestCase):
    def test_timedelta_to_seconds(self):
        from datetime import timedelta
        td = timedelta(seconds=1)
        self.assertEqual(timedelta_to_seconds(td), 1)

class TestWebSocketMask(unittest.TestCase):
    def test_websocket_mask(self):
        mask = b'\x01\x02\x03\x04'
        data = b'\x05\x06\x07\x08'
        self.assertEqual(_websocket_mask(mask, data), b'\x04\x04\x05\x06')

if __name__ == '__main__':
    unittest.main()