import unittest
from tornado.util import *

class TestTimeoutError(unittest.TestCase):
    def test_timeout_error(self):
        try:
            raise TimeoutError()
        except TimeoutError:
            pass

class TestObjectDict(unittest.TestCase):
    def test_object_dict(self):
        obj = ObjectDict()
        obj['key'] = 'value'
        self.assertEqual(obj['key'], 'value')
        self.assertEqual(obj.key, 'value')

class TestGzipDecompressor(unittest.TestCase):
    def test_gzip_decompressor(self):
        decompressor = GzipDecompressor()
        value = b'value'
        max_length = 100
        result = decompressor.decompress(value, max_length)
        self.assertEqual(result, b'value')

class TestImportObject(unittest.TestCase):
    def test_import_object(self):
        name = 'name'
        result = import_object(name)
        self.assertEqual(result, __import__(name))

class TestExecIn(unittest.TestCase):
    def test_exec_in(self):
        code = 'code'
        glob = {'key': 'value'}
        loc = {'key': 'value'}
        exec_in(code, glob, loc)
        self.assertEqual(glob['key'], 'value')
        self.assertEqual(loc['key'], 'value')

class TestRaiseExcInfo(unittest.TestCase):
    def test_raise_exc_info(self):
        exc_info = (Exception, Exception('error'), None)
        try:
            raise_exc_info(exc_info)
        except Exception as e:
            self.assertEqual(str(e), 'error')

class TestErrnoFromException(unittest.TestCase):
    def test_errno_from_exception(self):
        e = Exception('error')
        result = errno_from_exception(e)
        self.assertEqual(result, None)

class TestReUnescape(unittest.TestCase):
    def test_re_unescape(self):
        s = 's'
        result = re_unescape(s)
        self.assertEqual(result, s)

class TestConfigurable(unittest.TestCase):
    def test_configurable(self):
        base = Configurable.configurable_base()
        impl = Configurable.configured_class()
        self.assertEqual(impl, base)

class TestArgReplacer(unittest.TestCase):
    def test_arg_replacer(self):
        func = lambda x: x
        name = 'x'
        replacer = ArgReplacer(func, name)
        args = (1,)
        kwargs = {}
        old_value, args, kwargs = replacer.replace(2, args, kwargs)
        self.assertEqual(old_value, 1)
        self.assertEqual(args, (2,))
        self.assertEqual(kwargs, {})

class TestTimedeltaToSeconds(unittest.TestCase):
    def test_timedelta_to_seconds(self):
        td = datetime.timedelta(days=1, hours=1, minutes=1, seconds=1)
        result = timedelta_to_seconds(td)
        self.assertEqual(result, 1)

class TestWebsocketMask(unittest.TestCase):
    def test_websocket_mask(self):
        mask = b'mask'
        data = b'data'
        result = _websocket_mask(mask, data)
        self.assertEqual(result, b'data')

class TestDoctests(unittest.TestCase):
    def test_doctests(self):
        suite = doctests()
        runner = unittest.TextTestRunner()
        result = runner.run(suite)
        self.assertEqual(result.wasSuccessful(), True)

if __name__ == '__main__':
    unittest.main()