import unittest
from argparse import Namespace
from py_backwards.conf import Settings, init_settings


class TestSettings(unittest.TestCase):
    def test_init_settings(self):
        args = Namespace(debug=True)
        init_settings(args)
        self.assertFalse(settings.debug)

    def test_debug_default(self):
        self.assertFalse(settings.DEBUG)

if __name__ == '__main__':
    unittest.main()