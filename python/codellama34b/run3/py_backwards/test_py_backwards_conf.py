import unittest
from py_backwards.conf import *


class TestSettings(unittest.TestCase):
    def test_init(self):
        instance = Settings()
        self.assertFalse(instance.debug)

    def test_debug(self):
        instance = Settings()
        instance.debug = True
        self.assertTrue(instance.debug)

    def test_str_method(self):
        instance = Settings()
        result = instance.__str__()
        self.assertEqual(result, Settings(debug=False))

    def test_repr_method(self):
        instance = Settings()
        result = instance.__repr__()
        self.assertEqual(result, Settings(debug=False))

    def test_eq_method(self):
        instance = Settings()
        instance2 = Settings()
        self.assertEqual(instance, instance)

class TestInitSettings(unittest.TestCase):
    def test_init_settings(self):
        args = Namespace(debug=True)
        init_settings(args)
        self.assertTrue(settings.debug)

if __name__ == '__main__':
    unittest.main()