import unittest
from youtube_dl.extractor.nrk import NRKTVEpisodeIE


class TestNRKTVEpisodeIE(unittest.TestCase):
    def test_real_extract(self):
        ie = NRKTVEpisodeIE()
        url = 'https://tv.nrk.no/serier/0112/ episode/123456/01.02.2023'
        info = ie._real_extract(url)
        self.assertEqual(info['id'], 'nrk:0112.123456')
        self.assertEqual(info['season_number'], 1)
        self.assertEqual(info['episode_number'], 2)

if __name__ == '__main__':
    unittest.main()