from py_backwards.conf import Namespace
import unittest
from py_backwards.conf import Settings, settings, init_settings


class TestSettings(unittest.TestCase):
    def test_init(self):
        instance = Settings()
        self.assertFalse(instance.debug)

    def test_debug_setter(self):
        instance = Settings()
        instance.debug = True
        self.assertTrue(instance.debug)

    def test_str_method(self):
        instance = Settings()
        result = instance.__str__()
        self.assertEqual(result, "Settings object")

    def test_repr_method(self):
        instance = Settings()
        result = instance.__repr__()
        self.assertEqual(result, "Settings()")

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