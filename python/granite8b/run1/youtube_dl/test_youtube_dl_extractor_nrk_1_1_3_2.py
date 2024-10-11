import unittest
from youtube_dl.extractor.nrk import NRKTVEpisodeIE


class TestNRKTVEpisodeIE(unittest.TestCase):
    def test_real_extract(self):
        ie = NRKTVEpisodeIE()
        url = 'https://tv.nrk.no/serier/0110/ episode/0110-01-10-01.html'
        info = ie._real_extract(url)
        self.assertEqual(info['id'], '10.0110-01-10-01')
        self.assertEqual(info['display_id'], '0110-01-10-01')
        self.assertEqual(info['season_number'], 1)
        self.assertEqual(info['episode_number'], 1)
        self.assertEqual(info['ie_key'], 'NRKIE')
        self.assertEqual(info['url'], 'nrk:10.0110-01-10-01')
        self.assertEqual(info['_type'], 'url')

if __name__ == '__main__':
    unittest.main()