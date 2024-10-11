import unittest
from youtube_dl.extractor.nrk import NRKIE


class TestNRKTVEpisodeIE(unittest.TestCase):
    def test_real_extract(self):
        instance = NRKTVEpisodeIE()
        result = instance._real_extract("https://tv.nrk.no/serie/kontrollrommet/D3060206/1/1")
        self.assertEqual(result, {'_type': 'url', 'episode_number': 1, 'id': 'D3060206', 'ie_key': 'NRK', 'season_number': 1, 'url': 'nrk:D3060206'})

if __name__ == '__main__':
    unittest.main()