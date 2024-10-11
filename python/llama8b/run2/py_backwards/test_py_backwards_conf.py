import unittest
from py_backwards.conf import Settings, init_settings
from argparse import Namespace


class TestSettings(unittest.TestCase):
    def test_init_settings(self):
        settings = Settings()
        self.assertFalse(settings.debug)

    def test_init_settings_debug(self):
        args = Namespace(debug=True)
        init_settings(args)
        self.assertTrue(settings.debug)

    def test_init_settings_no_debug(self):
        args = Namespace(debug=False)
        init_settings(args)
        self.assertFalse(settings.debug)

    def test_str_method(self):
        settings = Settings()
        result = str(settings)
        self.assertEqual(result, "Settings")

    def test_repr_method(self):
        settings = Settings()
        result = repr(settings)
        self.assertEqual(result, "Settings()")

    def test_eq_method(self):
        settings1 = Settings()
        settings2 = Settings()
        self.assertEqual(settings1, settings2)

    def test_ne_method(self):
        settings1 = Settings()
        settings2 = object()
        self.assertNotEqual(settings1, settings2)

if __name__ == '__main__':
    unittest.main()