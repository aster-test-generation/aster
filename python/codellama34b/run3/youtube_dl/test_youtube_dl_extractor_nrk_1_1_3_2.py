import unittest
from youtube_dl.extractor.nrk import NRKIE


class TestNRKTVEpisodeIE(unittest.TestCase):
    def test_real_extract(self):
        instance = NRKTVEpisodeIE()
        result = instance._real_extract("https://tv.nrk.no/serie/kongens-valg/D9040211/1/1")
        self.assertEqual(result, {'_type': 'url', 'episode_number': 1, 'id': 'D9040211', 'ie_key': 'NRK', 'season_number': 1, 'url': 'nrk:D9040211'})

if __name__ == '__main__':
    unittest.main()