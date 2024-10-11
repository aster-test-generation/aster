import unittest
from py_backwards.conf import *


class TestSettings(unittest.TestCase):
    def test_init(self):
        instance = Settings()
        self.assertEqual(instance.debug, False)

    def test_debug(self):
        instance = Settings()
        instance.debug = True
        self.assertEqual(instance.debug, True)

class TestInitSettings(unittest.TestCase):
    def test_init_settings(self):
        args = Namespace()
        args.debug = True
        init_settings(args)
        self.assertEqual(settings.debug, True)

if __name__ == '__main__':
    unittest.main()