import unittest
from youtube_dl.extractor.nrk import NRKTVSerieBaseIE


class TestNRKTVSerieBaseIE(unittest.TestCase):
    def test_extract_entries(self):
        entry_list = [
            {'prfId': '123'},
            {'episodeId': '456'},
            {'prfId': '789'},
            {'episodeId': '012'},
        ]
        ie = NRKTVSerieBaseIE()
        entries = ie._extract_entries(entry_list)
        self.assertEqual(len(entries), 4)
        self.assertEqual(entries[0]['ie_key'], 'NRK:prfId')
        self.assertEqual(entries[0]['video_id'], '123')
        self.assertEqual(entries[1]['ie_key'], 'NRK:episodeId')
        self.assertEqual(entries[1]['video_id'], '456')
        self.assertEqual(entries[2]['ie_key'], 'NRK:prfId')
        self.assertEqual(entries[2]['video_id'], '789')
        self.assertEqual(entries[3]['ie_key'], 'NRK:episodeId')
        self.assertEqual(entries[3]['video_id'], '012')

    def test_extract_assets_key(self):
        embedded = {
            'program': {'_embedded': {'program': []}},
            'episode': {'_embedded': {'episode': []}},
            'clip': {'_embedded': {'clip': []}},
        }
        ie = NRKTVSerieBaseIE()
        assets_key = ie._extract_assets_key(embedded)
        self.assertEqual(assets_key, 'program')

    def test_catalog_name(self):
        self.assertEqual(NRKTVSerieBaseIE._catalog_name('podcast'), 'podcast')
        self.assertEqual(NRKTVSerieBaseIE._catalog_name('podkast'), 'podcast')
        self.assertEqual(NRKTVSerieBaseIE._catalog_name('series'), 'series')
        self.assertEqual(NRKTVSerieBaseIE._catalog_name('other'), 'series')

    def test_entries(self):
        data = {
            '_embedded': {
                'program': [
                    {'prfId': '123'},
                    {'prfId': '456'},
                ],
                'episode': [
                    {'episodeId': '789'},
                    {'episodeId': '012'},
                ],
            },
        }
        ie = NRKTVSerieBaseIE()
        entries = ie._entries(data, 'display_id')
        self.assertEqual(len(entries), 4)
        self.assertEqual(entries[0]['ie_key'], 'NRK:prfId')
        self.assertEqual(entries[0]['video_id'], '123')
        self.assertEqual(entries[1]['ie_key'], 'NRK:prfId')
        self.assertEqual(entries[1]['video_id'], '456')
        self.assertEqual(entries[2]['ie_key'], 'NRK:episodeId')
        self.assertEqual(entries[2]['video_id'], '789')
        self.assertEqual(entries[3]['ie_key'], 'NRK:episodeId')
        self.assertEqual(entries[3]['video_id'], '012')

if __name__ == '__main__':
    unittest.main()