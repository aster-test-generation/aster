import unittest
from youtube_dl.extractor.nrk import NRKTVSerieBaseIE


class TestNRKTVSerieBaseIE(unittest.TestCase):
    def test_extract_entries(self):
        entry_list = [
            {'prfId': '123', 'episodeId': '456'},
            {'prfId': '789', 'episodeId': '012'},
        ]
        ie = NRKTVSerieBaseIE()
        entries = ie._extract_entries(entry_list)
        self.assertEqual(len(entries), 2)
        for entry in entries:
            self.assertEqual(entry.ie_key(), 'NRK')
            self.assertIn('video_id', entry)

    def test_extract_assets_key(self):
        embedded = {
            'asset_key_1': 'value_1',
            'asset_key_2': 'value_2',
        }
        ie = NRKTVSerieBaseIE()
        asset_key = ie._extract_assets_key(embedded)
        self.assertIn(asset_key, ['asset_key_1', 'asset_key_2'])

    def test_catalog_name(self):
        serie_kinds = ['podcast', 'podkast', 'series']
        ie = NRKTVSerieBaseIE()
        for serie_kind in serie_kinds:
            catalog_name = ie._catalog_name(serie_kind)
            self.assertIn(catalog_name, ['podcast', 'series'])

    def test_entries(self):
        data = {
            '_embedded': {
                'asset_key_1': {
                    '_embedded': {
                        'asset_key_1': [
                            {'prfId': '123', 'episodeId': '456'},
                            {'prfId': '789', 'episodeId': '012'},
                        ]
                    }
                }
            },
            '_links': {
                'next': {
                    'href': '/next_page'
                }
            }
        }
        ie = NRKTVSerieBaseIE()
        entries = ie._entries(data, 'display_id')
        self.assertEqual(len(list(entries)), 2)

if __name__ == '__main__':
    unittest.main()