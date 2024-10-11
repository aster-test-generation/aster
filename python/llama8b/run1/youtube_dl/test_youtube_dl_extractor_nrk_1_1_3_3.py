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
        expected_entries = [ie.url_result('nrk:prfId1', ie=NRKTVSerieBaseIE.ie_key(), video_id='prfId1'), ie.url_result('nrk:episodeId2', ie=NRKTVSerieBaseIE.ie_key(), video_id='episodeId2')]
        self.assertEqual(ie._extract_entries(entry_list), expected_entries)

    def test_extract_assets_key(self):
        ie = NRKTVSerieBaseIE()
        embedded = {'asset1': {'key': 'asset1_key'}, 'asset2': {'key': 'asset2_key'}}
        self.assertEqual(ie._extract_assets_key(embedded), 'asset1')

    def test_catalog_name(self):
        ie = NRKTVSerieBaseIE()
        self.assertEqual(ie._catalog_name('podcast'), 'podcast')
        self.assertEqual(ie._catalog_name('series'), 'series')
        self.assertEqual(ie._catalog_name('other'), 'series')

    def test_entries(self):
        ie = NRKTVSerieBaseIE()
        data = {'_embedded': {'asset1': {'_embedded': {'asset1': {'_links': {'next': {'href': 'next_url'}}}}}}}
        display_id = 'display_id'
        expected_entries = []
        for page_num in itertools.count(1):
            embedded = data.get('_embedded') or data
            if not isinstance(embedded, dict):
                break
            assets_key = ie._extract_assets_key(embedded)
            if not assets_key:
                break
            entries = ie._extract_entries([{'prfId': 'prfId1'}, {'episodeId': 'episodeId2'}])
            expected_entries.extend(entries)
            next_url_path = try_get(data, (lambda x: x['_links']['next']['href'], lambda x: x['_embedded'][assets_key]['_links']['next']['href']), compat_str)
            if not next_url_path:
                break
            data = ie._call_api(next_url_path, display_id, note='Downloading %s JSON page %d' % (assets_key, page_num), fatal=False)
            if not data:
                break
        self.assertEqual(ie._entries(data, display_id), expected_entries)

    @patch('youtube_dl.extractor.nrk.NRKTVSerieBaseIE._call_api')
    def test_entries_call_api(self, mock_call_api):
        ie = NRKTVSerieBaseIE()
        data = {'_embedded': {'asset1': {'_embedded': {'asset1': {'_links': {'next': {'href': 'next_url'}}}}}}}
        display_id = 'display_id'
        ie._entries(data, display_id)
        self.assertEqual(mock_call_api.call_count, 1)

if __name__ == '__main__':
    unittest.main()