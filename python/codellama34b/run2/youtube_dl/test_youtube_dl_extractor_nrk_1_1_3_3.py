import unittest
from youtube_dl.extractor.nrk import NRKTVSerieBaseIE


class TestNRKTVSerieBaseIE(unittest.TestCase):
    def test_init(self):
        instance = NRKTVSerieBaseIE()
        self.assertIsInstance(instance, NRKTVSerieBaseIE)

    def test_extract_entries(self):
        instance = NRKTVSerieBaseIE()
        result = instance._extract_entries([])
        self.assertEqual(result, [])

    def test_extract_assets_key(self):
        instance = NRKTVSerieBaseIE()
        result = instance._extract_assets_key({})
        self.assertIsNone(result)

    def test_catalog_name(self):
        instance = NRKTVSerieBaseIE()
        result = instance._catalog_name('podcast')
        self.assertEqual(result, 'podcast')

    def test_entries(self):
        instance = NRKTVSerieBaseIE()
        result = instance._entries({}, '')
        self.assertIsInstance(result, list)

if __name__ == '__main__':
    unittest.main()