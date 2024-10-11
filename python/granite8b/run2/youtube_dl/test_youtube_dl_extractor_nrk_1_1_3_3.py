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
        self.assertEqual(entries[1]['ie_key'], 'NRK:episodeId')
        self.assertEqual(entries[2]['ie_key'], 'NRK:prfId')
        self.assertEqual(entries[3]['ie_key'], 'NRK:episodeId')

    def test_extract_assets_key(self):
        ie = NRKTVSerieBaseIE()
        embedded = {
            'program': {'_embedded': {'program': {}}},
            'programSeries': {'_embedded': {'programSeries': {}}},
            'programList': {'_embedded': {'programList': {}}},
        }
        self.assertEqual(ie._extract_assets_key(embedded), 'program')
        self.assertEqual(ie._extract_assets_key(embedded), 'programSeries')
        self.assertEqual(ie._extract_assets_key(embedded), 'programList')

    def test_catalog_name(self):
        ie = NRKTVSerieBaseIE()
        self.assertEqual(ie._catalog_name('podcast'), 'podcast')
        self.assertEqual(ie._catalog_name('podkast'), 'podcast')
        self.assertEqual(ie._catalog_name('series'), 'series')

    def test_entries(self):
        data = {
            '_embedded': {
                'program': {
                    '_embedded': {
                        'program': [
                            {'prfId': '123'},
                            {'episodeId': '456'},
                        ]
                    },
                    '_links': {
                        'next': {
                            'href': 'https://example.com/next_page'
                        }
                    }
                }
            }
        }
        ie = NRKTVSerieBaseIE()
        entries = ie._entries(data, 'display_id')
        self.assertEqual(len(entries), 2)
        self.assertEqual(entries[0]['ie_key'], 'NRK:prfId')
        self.assertEqual(entries[1]['ie_key'], 'NRK:episodeId')

if __name__ == '__main__':
    unittest.main()