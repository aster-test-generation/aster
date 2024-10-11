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
        self.assertEqual(entries[0]['ie_key'], 'NRK:123')
        self.assertEqual(entries[1]['ie_key'], 'NRK:456')
        self.assertEqual(entries[2]['ie_key'], 'NRK:789')
        self.assertEqual(entries[3]['ie_key'], 'NRK:012')

    def test_extract_assets_key(self):
        ie = NRKTVSerieBaseIE()
        embedded = {
            'someKey': 'someValue',
            'otherKey': 'otherValue',
        }
        self.assertIsNone(ie._extract_assets_key(embedded))
        embedded = {
            'someKey': 'someValue',
            'otherKey': {
                '_embedded': {
                    'assetsKey': 'assetsValue',
                },
            },
        }
        self.assertEqual(ie._extract_assets_key(embedded), 'assetsKey')

    def test_catalog_name(self):
        ie = NRKTVSerieBaseIE()
        self.assertEqual(ie._catalog_name('podcast'), 'podcast')
        self.assertEqual(ie._catalog_name('podkast'), 'podcast')
        self.assertEqual(ie._catalog_name('series'), 'series')
        self.assertEqual(ie._catalog_name('other'), 'other')

    def test_entries(self):
        ie = NRKTVSerieBaseIE()
        data = {
            '_embedded': {
                'someKey': {
                    '_embedded': {
                        'someAssetsKey': [
                            {'prfId': '123'},
                            {'episodeId': '456'},
                        ],
                    },
                },
            },
        }
        display_id = 'someDisplayId'
        entries = ie._entries(data, display_id)
        self.assertEqual(len(entries), 2)
        self.assertEqual(entries[0]['ie_key'], 'NRK:123')
        self.assertEqual(entries[1]['ie_key'], 'NRK:456')

if __name__ == '__main__':
    unittest.main()