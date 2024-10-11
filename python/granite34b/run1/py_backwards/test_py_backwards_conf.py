import unittest
from py_backwards.conf import settings, init_settings
from argparse import Namespace


class TestSettings(unittest.TestCase):
    def test_init_settings(self):
        args = Namespace(debug=True)
        init_settings(args)
        self.assertTrue(settings.debug)

if __name__ == '__main__':
    unittest.main()