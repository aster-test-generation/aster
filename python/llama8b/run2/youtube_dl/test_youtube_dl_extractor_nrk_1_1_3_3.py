import unittest
from unittest.mock import patch
from youtube_dl.extractor.nrk import NRKBaseI


class TestNRKTVSerieBaseIE(unittest.TestCase):
    def test_init(self):
        ie = NRKTVSerieBaseIE()
        self.assertEqual(ie.__class__, NRKTVSerieBaseIE)

    def test_extract_entries(self):
        ie = NRKTVSerieBaseIE()
        entry_list = [{'prfId': 'prfId1'}, {'episodeId': 'episodeId2'}]
        entries = ie._extract_entries(entry_list)
        self.assertEqual(len(entries), 2)

    def test_extract_assets_key(self):
        ie = NRKTVSerieBaseIE()
        embedded = {'asset1': 'value1', 'asset2': 'value2'}
        self.assertEqual(ie._extract_assets_key(embedded), 'asset1')

    def test_catalog_name(self):
        ie = NRKTVSerieBaseIE()
        serie_kind = 'podcast'
        self.assertEqual(ie._catalog_name(serie_kind), 'podcast')

    def test_entries(self):
        ie = NRKTVSerieBaseIE()
        data = {'_embedded': {'asset1': {'_embedded': {'asset1': [{'prfId': 'prfId1'}, {'prfId': 'prfId2'}]}}}}
        display_id = 'display_id'
        for entry in ie._entries(data, display_id):
            self.assertIsInstance(entry, dict)

    @patch('youtube_dl.extractor.nrk.NRKTVSerieBaseIE._call_api')
    def test_entries_call_api(self, mock_call_api):
        ie = NRKTVSerieBaseIE()
        data = {'_embedded': {'asset1': {'_embedded': {'asset1': [{'prfId': 'prfId1'}, {'prfId': 'prfId2'}]}}}}
        display_id = 'display_id'
        ie._entries(data, display_id)
        mock_call_api.assert_called_once()

if __name__ == '__main__':
    unittest.main()