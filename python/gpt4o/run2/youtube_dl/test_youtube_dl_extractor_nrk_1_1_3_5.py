import unittest
from youtube_dl.extractor.nrk import NRKTVSeriesIE
from youtube_dl.utils import ExtractorError


class TestNRKTVSeriesIE(unittest.TestCase):
    def setUp(self):
        self.instance = NRKTVSeriesIE()

    def test_init(self):
        self.assertIsInstance(self.instance, NRKTVSeriesIE)

    def test_suitable(self):
        result = NRKTVSeriesIE.suitable('https://tv.nrk.no/serie/some-series')
        self.assertFalse(result)

    def test_real_extract(self):
        url = 'https://tv.nrk.no/serie/some-series'
        with self.assertRaises(ExtractorError):
            self.instance._real_extract(url)

    def test_private_methods(self):
        # Assuming we have access to the private methods for testing purposes
        # This is generally not recommended and should be avoided in real-world scenarios
        pass

    def test_protected_methods(self):
        # Assuming we have access to the protected methods for testing purposes
        # This is generally not recommended and should be avoided in real-world scenarios
        pass

if __name__ == '__main__':
    unittest.main()