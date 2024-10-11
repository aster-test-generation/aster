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
        with self.assertRaises(AttributeError):
            d.c

    def test_setattr(self):
        d = ObjectDict({'a': 1, 'b': 2})
        d.c = 3
        self.assertEqual(d.c, 3)
        self.assertIn('c', d)

class TestGzipDecompressor(unittest.TestCase):
    def test_init(self):
        g = GzipDecompressor()
        self.assertIsNotNone(g.decompressobj)

    def test_decompress(self):
        g = GzipDecompressor()
        data = b'hello'
        decompressed = g.decompress(data)
        self.assertEqual(decompressed, data)

    def test_unconsumed_tail(self):
        g = GzipDecompressor()
        data = b'hello'
        g.decompress(data)
        self.assertEqual(g.unconsumed_tail, b'')

    def test_flush(self):
        g = GzipDecompressor()
        data = b'hello'
        g.decompress(data)
        self.assertEqual(g.flush(), b'')

class TestImportObject(unittest.TestCase):
    def test_import_object(self):
        obj = import_object('tornado.util')
        self.assertIsNotNone(obj)

class TestExecIn(unittest.TestCase):
    def test_exec_in(self):
        code = 'x = 1'
        glob = {'x': 0}
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
        s = r'\a'
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

    def test_configured_class(self):
        c = Configurable()
        self.assertIs(c.configured_class(), Configurable)

    def test_save_configuration(self):
        c = Configurable()
        saved = c._save_configuration()
        self.assertIsNotNone(saved)

    def test_restore_configuration(self):
        c = Configurable()
        saved = c._save_configuration()
        c._restore_configuration(saved)

class TestArgReplacer(unittest.TestCase):
    def test_init(self):
        a = ArgReplacer(lambda x: x, 'x')
        self.assertIsNotNone(a.arg_pos)

    def test_get_old_value(self):
        a = ArgReplacer(lambda x: x, 'x')
        self.assertIsNone(a.get_old_value([], {}))

    def test_replace(self):
        a = ArgReplacer(lambda x: x, 'x')
        old_value, args, kwargs = a.replace(1, [2], {'y': 3})
        self.assertEqual(old_value, 2)
        self.assertEqual(args, [1])
        self.assertEqual(kwargs, {'y': 3})

class TestTimedeltaToSeconds(unittest.TestCase):
    def test_timedelta_to_seconds(self):
        from datetime import timedelta
        td = timedelta(seconds=1)
        self.assertEqual(timedelta_to_seconds(td), 1)

class TestWebsocketMask(unittest.TestCase):
    def test_websocket_mask(self):
        mask = b'\x01\x02\x03\x04'
        data = b'hello'
        self.assertEqual(_websocket_mask(mask, data), b'\x09\x07\x0b\x0d\x0f')

if __name__ == '__main__':
    unittest.main()