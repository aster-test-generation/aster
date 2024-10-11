import unittest
from youtube_dl.extractor.nrk import *


class TestNRKTVSerieBaseIE(unittest.TestCase):
    def test_extract_entries(self):
        instance = NRKTVSerieBaseIE()
        entry_list = [{'prfId': '12345', 'episodeId': '54321'}]
        result = instance._extract_entries(entry_list)
        self.assertEqual(result, [{'_type': 'url', 'ie_key': 'NRK', 'video_id': '54321', 'url': 'nrk:54321'}])

    def test_extract_assets_key(self):
        instance = NRKTVSerieBaseIE()
        embedded = {'assets': {'_embedded': {'assets': [{'prfId': '12345', 'episodeId': '54321'}]}}}
        result = instance._extract_assets_key(embedded)
        self.assertEqual(result, 'assets')

    def test_catalog_name(self):
        instance = NRKTVSerieBaseIE()
        result = instance._catalog_name('podcast')
        self.assertEqual(result, 'podcast')

    def test_entries(self):
        instance = NRKTVSerieBaseIE()
        data = {'_embedded': {'assets': [{'prfId': '12345', 'episodeId': '54321'}]}}
        display_id = '12345'
        result = list(instance._entries(data, display_id))
        self.assertEqual(result, [{'_type': 'url', 'ie_key': 'NRK', 'video_id': '54321', 'url': 'nrk:54321'}])

if __name__ == '__main__':
    unittest.main()