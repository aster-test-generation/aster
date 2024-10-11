import unittest
from py_backwards.conf import settings, init_settings
from argparse import Namespace


class TestSettings(unittest.TestCase):
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