
import unittest
from tornado.util import *

class TestTimeoutError(unittest.TestCase):
    def test_TimeoutError(self):
        result = TimeoutError()
        self.assertIsNotNone(result)

class TestObjectDict(unittest.TestCase):
    def test_ObjectDict(self):
        result = ObjectDict()
        self.assertIsNotNone(result)

class TestGzipDecompressor(unittest.TestCase):
    def test_GzipDecompressor(self):
        result = GzipDecompressor()
        self.assertIsNotNone(result)

    def test_decompress(self):
        result = GzipDecompressor()
        self.assertIsNotNone(result)

    def test_unconsumed_tail(self):
        result = GzipDecompressor()
        self.assertIsNotNone(result)

    def test_flush(self):
        result = GzipDecompressor()
        self.assertIsNotNone(result)

class TestImportObject(unittest.TestCase):
    def test_import_object(self):
        result = import_object("tornado.util")
        self.assertIsNotNone(result)

class TestExecIn(unittest.TestCase):
    def test_exec_in(self):
        result = exec_in("tornado.util", {})
        self.assertIsNotNone(result)

class TestRaiseExcInfo(unittest.TestCase):
    def test_raise_exc_info(self):
        result = raise_exc_info(None)
        self.assertIsNotNone(result)

class TestErrnoFromException(unittest.TestCase):
    def test_errno_from_exception(self):
        result = errno_from_exception(None)
        self.assertIsNotNone(result)

class TestReUnescape(unittest.TestCase):
    def test_re_unescape(self):
        result = re_unescape("tornado.util")
        self.assertIsNotNone(result)

class TestConfigurable(unittest.TestCase):
    def test_Configurable(self):
        result = Configurable()
        self.assertIsNotNone(result)

    def test_configurable_base(self):
        result = Configurable.configurable_base()
        self.assertIsNotNone(result)

    def test_configurable_default(self):
        result = Configurable.configurable_default()
        self.assertIsNotNone(result)

    def test__initialize(self):
        result = Configurable._initialize()
        self.assertIsNotNone(result)

    def test_initialize(self):
        result = Configurable.initialize()
        self.assertIsNotNone(result)

    def test_configure(self):
        result = Configurable.configure(None)
        self.assertIsNotNone(result)

    def test_configured_class(self):
        result = Configurable.configured_class()
        self.assertIsNotNone(result)

    def test__save_configuration(self):
        result = Configurable._save_configuration()
        self.assertIsNotNone(result)

    def test__restore_configuration(self):
        result = Configurable._restore_configuration(None)
        self.assertIsNotNone(result)

class TestArgReplacer(unittest.TestCase):
    def test_ArgReplacer(self):
        result = ArgReplacer(None, "tornado.util")
        self.assertIsNotNone(result)

    def test_get_old_value(self):
        result = ArgReplacer(None, "tornado.util").get_old_value(None, None)
        self.assertIsNotNone(result)

    def test_replace(self):
        result = ArgReplacer(None, "tornado.util").replace(None, None, None)
        self.assertIsNotNone(result)


if __name__ == '__main__':
    unittest.main()