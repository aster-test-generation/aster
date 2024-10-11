import unittest
from youtube_dl.extractor.nrk import NRKTVSeasonIE
from youtube_dl.utils import ExtractorError


class TestNRKTVSeasonIE(unittest.TestCase):
    def setUp(self):
        self.instance = NRKTVSeasonIE()

    def test_init(self):
        self.assertIsInstance(self.instance, NRKTVSeasonIE)

    def test_suitable(self):
        self.assertFalse(NRKTVSeasonIE.suitable('http://example.com'))

    def test_real_extract(self):
        url = 'http://tv.nrk.no/serie/serie/season_id'
        self.instance._VALID_URL = r'http://tv\.nrk\.no/serie/(?P<serie>[^/]+)/(?P<id>[^/]+)'
        self.instance._catalog_name = lambda x: 'catalog_name'
        self.instance._call_api = lambda *args, **kwargs: {'titles': {'title': 'Test Title'}}
        self.instance._entries = lambda *args, **kwargs: []
        result = self.instance._real_extract(url)
        self.assertEqual(result['title'], 'Test Title')

    def test_real_extract_no_title(self):
        url = 'http://tv.nrk.no/serie/serie/season_id'
        self.instance._VALID_URL = r'http://tv\.nrk\.no/serie/(?P<serie>[^/]+)/(?P<id>[^/]+)'
        self.instance._catalog_name = lambda x: 'catalog_name'
        self.instance._call_api = lambda *args, **kwargs: {}
        self.instance._entries = lambda *args, **kwargs: []
        result = self.instance._real_extract(url)
        self.assertEqual(result['title'], 'serie/season_id')

    def test_real_extract_invalid_url(self):
        url = 'http://invalid.url'
        self.instance._VALID_URL = r'http://tv\.nrk\.no/serie/(?P<serie>[^/]+)/(?P<id>[^/]+)'
        with self.assertRaises(AttributeError):
            self.instance._real_extract(url)

if __name__ == '__main__':
    unittest.main()