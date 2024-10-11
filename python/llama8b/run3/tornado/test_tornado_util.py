from tornado.util import _websocket_mask
import unittest
from tornado.util import *


class TestTornadoUtil(unittest.TestCase):
    def test_timeout_error(self):
        try:
            raise TimeoutError()
        except TimeoutError:
            self.assertTrue(True)

    def test_object_dict(self):
        obj = ObjectDict()
        obj['key'] = 'value'
        self.assertEqual(obj['key'], 'value')

    def test_gzip_decompressor(self):
        decompressor = GzipDecompressor()
        compressed = zlib.compress(b'Hello, World!', 9)
        decompressed = decompressor.decompress(compressed)
        self.assertEqual(decompressed, b'Hello, World!')

    def test_import_object(self):
        obj = import_object('os')
        self.assertEqual(obj, os)

    def test_exec_in(self):
        code = 'print("Hello, World!")'
        exec_in(code, globals(), locals())
        self.assertEqual(locals()['result'], 'Hello, World!')

    def test_raise_exc_info(self):
        try:
            raise Exception('Test Exception')
        except Exception as e:
            raise_exc_info((e, None, None))
            self.assertTrue(True)

    def test_errno_from_exception(self):
        e = OSError(1, 'Test Error')
        self.assertEqual(errno_from_exception(e), 1)

    def test_re_unescape(self):
        self.assertEqual(re_unescape('\\a'), 'a')
        self.assertEqual(re_unescape('\\\\'), '\\')

    def test_configurable(self):
        class TestConfigurable(Configurable):
            @classmethod
            def configurable_base(cls):
                return cls
            @classmethod
            def configurable_default(cls):
                return TestConfigurable
        configurable = TestConfigurable()
        self.assertEqual(configurable.__class__, TestConfigurable)

    def test_arg_replacer(self):
        def test_func(a, b):
            return a + b
        replacer = ArgReplacer(test_func, 'a')
        old_value, args, kwargs = replacer.replace(1, [1, 2], {'b': 3})
        self.assertEqual(old_value, 1)
        self.assertEqual(args, [1, 2])
        self.assertEqual(kwargs, {'b': 3})

    def test_timedelta_to_seconds(self):
        from datetime import timedelta
        td = timedelta(days=1, seconds=2, microseconds=3)
        self.assertEqual(timedelta_to_seconds(td), 3723)

    def test_websocket_mask(self):
        mask = b'\x01\x02\x03\x04'
        data = b'Hello, World!'
        masked = _websocket_mask(mask, data)
        self.assertEqual(masked, b'\x05\x06\x07\x08Hello, World!')

    def test_doctests(self):
        doctests()

if __name__ == '__main__':
    unittest.main()