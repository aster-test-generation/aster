import unittest
from tornado.util import *

class TestTornadoUtil(unittest.TestCase):
    def test_timeout_error(self):
        with self.assertRaises(TimeoutError):
            raise TimeoutError()

    def test_object_dict(self):
        obj = ObjectDict({'a': 1, 'b': 2})
        self.assertEqual(obj.a, 1)
        self.assertEqual(obj.b, 2)
        self.assertEqual(obj['a'], 1)
        self.assertEqual(obj['b'], 2)

    def test_gzip_decompressor(self):
        decompressor = GzipDecompressor()
        compressed = zlib.compress(b'Hello, World!')
        decompressed = decompressor.decompress(compressed)
        self.assertEqual(decompressed.decode(), 'Hello, World!')

    def test_import_object(self):
        obj = import_object('os')
        self.assertEqual(obj, os)

    def test_exec_in(self):
        code = 'print("Hello, World!")'
        glob = {'print': print}
        exec_in(code, glob)
        self.assertEqual(glob['print'].call_count, 1)

    def test_raise_exc_info(self):
        exc_info = (ValueError('Error'), ValueError('Error'), None)
        raise_exc_info(exc_info)
        self.fail('Expected ValueError to be raised')

    def test_errno_from_exception(self):
        e = OSError(1, 'Error')
        self.assertEqual(errno_from_exception(e), 1)

    def test_re_unescape(self):
        self.assertEqual(re_unescape(r'\a'), r'\a')
        self.assertEqual(re_unescape(r'\x07'), r'\x07')
        self.assertEqual(re_unescape(r'\123'), r'\123')

    def test_configurable(self):
        class MyConfigurable(Configurable):
            @classmethod
            def configurable_base(cls):
                return MyConfigurable
            @classmethod
            def configurable_default(cls):
                return MyConfigurable
        configurable = MyConfigurable()
        self.assertEqual(configurable.__class__, MyConfigurable)

    def test_arg_replacer(self):
        def func(a, b):
            return a + b
        replacer = ArgReplacer(func, 'a')
        old_value, args, kwargs = replacer.replace(10, [1, 2], {'b': 3})
        self.assertEqual(old_value, 1)
        self.assertEqual(args, [10, 2])
        self.assertEqual(kwargs, {'b': 3})

    def test_timedelta_to_seconds(self):
        td = timedelta(days=1, seconds=2)
        self.assertEqual(timedelta_to_seconds(td), 3722)

    def test_websocket_mask(self):
        mask = b'\x01\x02\x03\x04'
        data = b'Hello, World!'
        masked_data = _websocket_mask(mask, data)
        self.assertEqual(masked_data, b'\x05Hello, World!')

    def test_doctests(self):
        doctest_suite = doctests()
        doctest.testmod(doctest_suite)

if __name__ == '__main__':
    unittest.main()