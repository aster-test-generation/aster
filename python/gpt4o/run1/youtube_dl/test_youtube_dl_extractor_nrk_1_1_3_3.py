import unittest
from youtube_dl.extractor.nrk import NRKTVSerieBaseIE
from youtube_dl.utils import ExtractorError


class TestNRKTVSerieBaseIE(unittest.TestCase):
    def setUp(self):
        self.instance = NRKTVSerieBaseIE()

    def test_init(self):
        self.assertIsInstance(self.instance, NRKTVSerieBaseIE)

    def test_extract_entries_with_valid_list(self):
        entry_list = [{'prfId': '123'}, {'episodeId': '456'}]
        result = self.instance._extract_entries(entry_list)
        self.assertEqual(len(result), 2)

    def test_extract_entries_with_invalid_list(self):
        entry_list = [{'prfId': None}, {'episodeId': None}]
        result = self.instance._extract_entries(entry_list)
        self.assertEqual(result, [])

    def test_extract_entries_with_non_list(self):
        entry_list = 'not_a_list'
        result = self.instance._extract_entries(entry_list)
        self.assertEqual(result, [])

    def test_extract_assets_key_with_valid_key(self):
        embedded = {'valid_key': 'some_value'}
        self.instance._ASSETS_KEYS = ['valid_key']
        result = self.instance._extract_assets_key(embedded)
        self.assertEqual(result, 'valid_key')

    def test_extract_assets_key_with_invalid_key(self):
        embedded = {'invalid_key': 'some_value'}
        self.instance._ASSETS_KEYS = ['valid_key']
        result = self.instance._extract_assets_key(embedded)
        self.assertIsNone(result)

    def test_catalog_name_with_podcast(self):
        result = NRKTVSerieBaseIE._catalog_name('podcast')
        self.assertEqual(result, 'podcast')

    def test_catalog_name_with_series(self):
        result = NRKTVSerieBaseIE._catalog_name('series')
        self.assertEqual(result, 'series')

    def test_entries_with_valid_data(self):
        data = {
            '_embedded': {
                'valid_key': {
                    '_embedded': {
                        'valid_key': [{'prfId': '123'}, {'episodeId': '456'}]
                    },
                    '_links': {
                        'next': {'href': 'next_url'}
                    }
                }
            }
        }
        self.instance._ASSETS_KEYS = ['valid_key']
        self.instance._call_api = lambda *args, **kwargs: None
        entries = list(self.instance._entries(data, 'display_id'))
        self.assertEqual(len(entries), 2)

    def test_entries_with_invalid_data(self):
        data = {'_embedded': 'not_a_dict'}
        entries = list(self.instance._entries(data, 'display_id'))
        self.assertEqual(entries, [])

    def test_entries_with_no_assets_key(self):
        data = {'_embedded': {}}
        self.instance._ASSETS_KEYS = ['valid_key']
        entries = list(self.instance._entries(data, 'display_id'))
        self.assertEqual(entries, [])

    def test_entries_with_no_next_url(self):
        data = {
            '_embedded': {
                'valid_key': {
                    '_embedded': {
                        'valid_key': [{'prfId': '123'}, {'episodeId': '456'}]
                    }
                }
            }
        }
        self.instance._ASSETS_KEYS = ['valid_key']
        entries = list(self.instance._entries(data, 'display_id'))
        self.assertEqual(len(entries), 2)

if __name__ == '__main__':
    unittest.main()