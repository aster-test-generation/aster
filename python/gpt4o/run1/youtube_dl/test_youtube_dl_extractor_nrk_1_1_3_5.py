import unittest
from youtube_dl.extractor.nrk import NRKTVSeriesIE
from youtube_dl.utils import ExtractorError


class TestNRKTVSeriesIE(unittest.TestCase):
    def setUp(self):
        self.instance = NRKTVSeriesIE()

    def test_init(self):
        self.assertIsInstance(self.instance, NRKTVSeriesIE)

    def test_suitable(self):
        self.assertFalse(NRKTVSeriesIE.suitable('https://tv.nrk.no/serie/some-series'))

    def test_real_extract(self):
        with self.assertRaises(ExtractorError):
            self.instance._real_extract('https://tv.nrk.no/serie/some-series')

    def test_private_methods(self):
        # Assuming we have access to the private methods for testing purposes
        # This is generally not recommended and should be done with caution
        pass

    def test_protected_methods(self):
        # Assuming we have access to the protected methods for testing purposes
        # This is generally not recommended and should be done with caution
        pass

    def test_magic_methods(self):
        self.assertEqual(self.instance.__class__.__name__, 'NRKTVSeriesIE')

if __name__ == '__main__':
    unittest.main()