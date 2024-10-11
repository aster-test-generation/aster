import unittest
from youtube_dl.extractor.nrk import NRKIE


class TestNRKTVEpisodeIE(unittest.TestCase):
    def test_real_extract(self):
        instance = NRKTVEpisodeIE()
        result = instance._real_extract("https://tv.nrk.no/serie/ditt-naaste-barn/Ditt-naaste-barn/4D3939992B343A3532303030")
        self.assertEqual(result['_type'], 'url')
        self.assertEqual(result['id'], 'TVSERIE-4D3939992B343A3532303030')
        self.assertEqual(result['url'], 'nrk:TVSERIE-4D3939992B343A3532303030')
        self.assertEqual(result['ie_key'], 'NRK')
        self.assertEqual(result['season_number'], 1)
        self.assertEqual(result['episode_number'], 1)

if __name__ == '__main__':
    unittest.main()