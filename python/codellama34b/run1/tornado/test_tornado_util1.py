import unittest
from tornado.util import *

class TestTimeoutError(unittest.TestCase):
    def test_timeout_error(self):
        self.assertRaises(TimeoutError, TimeoutError)

class TestObjectDict(unittest.TestCase):
    def test_object_dict(self):
        self.assertRaises(TypeError, ObjectDict, 1)

class TestGzipDecompressor(unittest.TestCase):
    def test_gzip_decompressor(self):
        self.assertRaises(TypeError, GzipDecompressor, 1)

class TestImportObject(unittest.TestCase):
    def test_import_object(self):
        self.assertRaises(ImportError, import_object, 1)

class TestExecIn(unittest.TestCase):
    def test_exec_in(self):
        self.assertRaises(TypeError, exec_in, 1, 1, 1)

class TestRaiseExcInfo(unittest.TestCase):
    def test_raise_exc_info(self):
        self.assertRaises(TypeError, raise_exc_info, 1)

class TestErrnoFromException(unittest.TestCase):
    def test_errno_from_exception(self):
        self.assertRaises(ValueError, errno_from_exception, 1)

class TestReUnescape(unittest.TestCase):
    def test_re_unescape(self):
        self.assertRaises(ValueError, re_unescape, 1)

class TestConfigurable(unittest.TestCase):
    def test_configurable(self):
        self.assertRaises(NotImplementedError, Configurable.configurable_base)

class TestArgReplacer(unittest.TestCase):
    def test_arg_replacer(self):
        self.assertRaises(ValueError, ArgReplacer, 1, 1)

class TestTimedeltaToSeconds(unittest.TestCase):
    def test_timedelta_to_seconds(self):
        self.assertRaises(TypeError, timedelta_to_seconds, 1)

class TestWebsocketMask(unittest.TestCase):
    def test_websocket_mask(self):
        self.assertRaises(TypeError, _websocket_mask, 1, 1)

class TestDoctests(unittest.TestCase):
    def test_doctests(self):
        self.assertRaises(TypeError, doctests)

if __name__ == '__main__':
    unittest.main()