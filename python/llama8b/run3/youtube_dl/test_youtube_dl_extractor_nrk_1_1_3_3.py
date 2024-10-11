import unittest
from unittest.mock import patch
from youtube_dl.extractor.nrk import NRKTVSerieBaseIE, NRKBaseI


class TestNRKTVSerieBaseIE(unittest.TestCase):
    def test_init(self):
        ie = NRKTVSerieBaseIE()
        self.assertEqual(ie.__class__, NRKTVSerieBaseIE)

    def test_extract_entries(self):
        ie = NRKTVSerieBaseIE()
        entry_list = [{'prfId': 'prfId1'}, {'episodeId': 'episodeId2'}]
        expected_entries = [ie.url_result('nrk:prfId1', ie=NRKBaseIE.ie_key(), video_id='prfId1'), ie.url_result('nrk:episodeId2', ie=NRKBaseIE.ie_key(), video_id='episodeId2')]
        self.assertEqual(ie._extract_entries(entry_list), expected_entries)

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
        data = {'_embedded': {'asset1': {'_embedded': {'asset1': [{'prfId': 'prfId1'}, {'episodeId': 'episodeId2'}]}}}}
        display_id = 'display_id'
        expected_entries = [ie.url_result('nrk:prfId1', ie=NRKBaseIE.ie_key(), video_id='prfId1'), ie.url_result('nrk:episodeId2', ie=NRKBaseIE.ie_key(), video_id='episodeId2')]
        with patch('youtube_dl.extractor.nrk.NRKTVSerieBaseIE._call_api') as mock_call_api:
            mock_call_api.return_value = data
            self.assertEqual(list(ie._entries(data, display_id)), expected_entries)

    def test_call_api(self):
        ie = NRKTVSerieBaseIE()
        next_url_path = 'next_url_path'
        display_id = 'display_id'
        note = 'Downloading JSON page 1'
        with patch('youtube_dl.extractor.nrk.NRKTVSerieBaseIE._call_api') as mock_call_api:
            ie._call_api(next_url_path, display_id, note)
            mock_call_api.assert_called_once_with(next_url_path, display_id, note)

if __name__ == '__main__':
    unittest.main()