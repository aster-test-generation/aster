import unittest
from py_backwards.conf import settings, init_settings
from argparse import Namespace


class TestSettings(unittest.TestCase):
    def test_init(self):
        self.assertFalse(settings.debug)

    def test_str(self):
        self.assertEqual(str(settings), "Settings(debug=False)")

    def test_repr(self):
        self.assertEqual(repr(settings), "Settings(debug=False)")

    def test_eq(self):
        self.assertEqual(settings, settings)
        self.assertNotEqual(settings, object())

class TestInitSettings(unittest.TestCase):
    def test_debug_true(self):
        args = Namespace(debug=True)
        init_settings(args)
        self.assertTrue(settings.debug)

    def test_debug_false(self):
        args = Namespace(debug=False)
        init_settings(args)
        self.assertFalse(settings.debug)

if __name__ == '__main__':
    unittest.main()