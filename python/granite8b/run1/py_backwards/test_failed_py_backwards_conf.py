from py_backwards.conf import Namespace
import unittest
from py_backwards.conf import Settings, init_settings

class TestSettings(unittest.TestCase):
    def test_debug_default(self):
        settings = Settings()
        self.assertFalse(settings.debug)

    def test_debug_true(self):
        settings = Settings()
        init_settings(Namespace(debug=True))
        self.assertFalse(settings.debug)

class TestInitSettings(unittest.TestCase):
    def test_debug_default(self):
        settings = Settings()
        init_settings(Namespace(debug=False))
        self.assertFalse(settings.debug)

    def test_debug_true(self):
        settings = Settings()
        init_settings(Namespace(debug=True))
        self.assertFalse(settings.debug)

if __name__ == '__main__':
    unittest.main()