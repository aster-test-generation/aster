import unittest
from youtube_dl.extractor.nrk import NRKTVSerieBaseIE, NRKBaseExtractorIE as NRKBaseIE, NRKI


class TestNRKTVSerieBaseIE(unittest.TestCase):
    def test_init(self):
        instance = NRKTVSerieBaseIE()
        self.assertIsInstance(instance, NRKTVSerieBaseIE)

    def test_extract_entries(self):
        instance = NRKTVSerieBaseIE()
        entry_list = [{'prfId': '123', 'episodeId': '456'}]
        result = instance._extract_entries(entry_list)
        self.assertEqual(len(result), 1)

    def test_extract_assets_key(self):
        instance = NRKTVSerieBaseIE()
        embedded = {'asset_key': 'value'}
        result = instance._extract_assets_key(embedded)
        self.assertEqual(result, 'asset_key')

    def test_catalog_name(self):
        result = NRKTVSerieBaseIE._catalog_name('podcast')
        self.assertEqual(result, 'podcast')

    def test_entries(self):
        instance = NRKTVSerieBaseIE()
        data = {'_embedded': {'asset_key': [{'prfId': '123', 'episodeId': '456'}]}}
        display_id = 'display_id'
        result = list(instance._entries(data, display_id))
        self.assertEqual(len(result), 1)

    def test_private__call_api(self):
        instance = NRKTVSerieBaseIE()
        next_url_path = 'next_url_path'
        display_id = 'display_id'
        result = instance._NRKTVSerieBaseIE__call_api(next_url_path, display_id)
        self.assertIsNone(result)  # assuming _call_api returns None

    def test_str_method(self):
        instance = NRKTVSerieBaseIE()
        result = instance.__str__()
        self.assertIsInstance(result, str)

    def test_repr_method(self):
        instance = NRKTVSerieBaseIE()
        result = instance.__repr__()
        self.assertIsInstance(result, str)

class TestNRKBaseIE(unittest.TestCase):
    def test_init(self):
        instance = NRKBaseIE()
        self.assertIsInstance(instance, NRKBaseIE)

class TestNRKIE(unittest.TestCase):
    def test_ie_key(self):
        result = NRKIE.ie_key()
        self.assertIsInstance(result, str)

if __name__ == '__main__':
    unittest.main()