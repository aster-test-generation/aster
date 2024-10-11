import unittest
from argparse import Namespace
from py_backwards.conf import Settings, init_settings, settings


class TestSettings(unittest.TestCase):
    def test_init(self):
        instance = Settings()
        self.assertFalse(instance.debug)

    def test_debug_attribute(self):
        instance = Settings()
        instance.debug = True
        self.assertTrue(instance.debug)

class TestInitSettings(unittest.TestCase):
    def test_init_settings_debug_true(self):
        args = Namespace(debug=True)
        init_settings(args)
        self.assertTrue(settings.debug)

    def test_init_settings_debug_false(self):
        args = Namespace(debug=False)
        init_settings(args)
        self.assertFalse(settings.debug)

if __name__ == '__main__':
    unittest.main()