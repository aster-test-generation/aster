import unittest
from youtube_dl.extractor.nrk import NRKTVSeriesIE


class TestNRKTVSeriesIE(unittest.TestCase):
    def test_private_method(self):
        # Test private method
        instance = NRKTVSeriesIE()
        result = instance._private_method()
        self.assertEqual(result, expected_result)

    def test_protected_method(self):
        # Test protected method
        instance = NRKTVSeriesIE()
        result = instance._protected_method()
        self.assertEqual(result, expected_result)

    def test_magic_method(self):
        # Test magic method
        instance = NRKTVSeriesIE()
        result = instance.__magic_method()
        self.assertEqual(result, expected_result)

if __name__ == '__main__':
    unittest.main()