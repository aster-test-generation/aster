import unittest
from youtube_dl.extractor.nrk import NRKTVSerieBaseIE, NRKBaseIE, NRKI


class TestNRKTVSerieBaseIE(unittest.TestCase):
    def test___init__(self):
        instance = NRKTVSerieBaseIE()
        self.assertIsInstance(instance, NRKTVSerieBaseIE)

    def test__extract_entries(self):
        instance = NRKTVSerieBaseIE()
        entry_list = [{'prfId': '123', 'episodeId': '456'}]
        result = instance._extract_entries(entry_list)
        self.assertEqual(len(result), 1)

    def test__extract_assets_key(self):
        instance = NRKTVSerieBaseIE()
        embedded = {'asset_key': 'value'}
        result = instance._extract_assets_key(embedded)
        self.assertEqual(result, 'asset_key')

    def test__catalog_name(self):
        result = NRKTVSerieBaseIE._catalog_name('podcast')
        self.assertEqual(result, 'podcast')

    def test__entries(self):
        instance = NRKTVSerieBaseIE()
        data = {'_embedded': {'asset_key': [{'prfId': '123', 'episodeId': '456'}]}}
        display_id = 'display_id'
        result = list(instance._entries(data, display_id))
        self.assertEqual(len(result), 1)

    def test___str__(self):
        instance = NRKTVSerieBaseIE()
        result = str(instance)
        self.assertIsInstance(result, str)

    def test___repr__(self):
        instance = NRKTVSerieBaseIE()
        result = repr(instance)
        self.assertIsInstance(result, str)

class TestNRKBaseIE(unittest.TestCase):
    def test___init__(self):
        instance = NRKBaseIE()
        self.assertIsInstance(instance, NRKBaseIE)

class TestNRKIE(unittest.TestCase):
    def test_ie_key(self):
        result = NRKIE.ie_key()
        self.assertIsInstance(result, str)

if __name__ == '__main__':
    unittest.main()