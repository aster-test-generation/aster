import unittest
from youtube_dl.extractor.nrk import NRKTVEpisodeIE


class TestNRKTVEpisodeIE(unittest.TestCase):
    def test_real_extract(self):
        ie = NRKTVEpisodeIE()
        url = 'https://tv.nrk.no/serier/0123456789/123456789/123456789/123456789/123456789/123456789-123456789-eng.html'
        info = ie._real_extract(url)
        self.assertEqual(info['id'], '123456789')
        self.assertEqual(info['season_number'], 1)
        self.assertEqual(info['episode_number'], 1)

if __name__ == '__main__':
    unittest.main()