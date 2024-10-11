import unittest
from youtube_dl.extractor.itv import ITVIE, ITVBTCCIE


class TestITVIE(unittest.TestCase):
    def test_real_extract(self):
        url = 'https://www.itv.com/hub/liar/2a4547a0012'
        ie = ITVIE()
        video_data = ie._real_extract(url)
        self.assertEqual(video_data['id'], '2a4547a0012')
        self.assertEqual(video_data['ext'], 'mp4')
        self.assertEqual(video_data['title'], 'Liar - Series 2 - Episode 6')
        self.assertEqual(video_data['description'], 'md5:d0f91536569dec79ea184f0a44cca089')
        self.assertEqual(video_data['series'], 'Liar')
        self.assertEqual(video_data['season_number'], 2)
        self.assertEqual(video_data['episode_number'], 6)

class TestITVBTCCIE(unittest.TestCase):
    def test_real_extract(self):
        url = 'http://www.itv.com/btcc/races/btcc-2018-all-the-action-from-brands-hatch'
        ie = ITVBTCCIE()
        playlist_data = ie._real_extract(url)
        self.assertEqual(playlist_data['id'], 'btcc-2018-all-the-action-from-brands-hatch')
        self.assertEqual(playlist_data['title'], 'BTCC 2018: All the action from Brands Hatch')
        self.assertGreaterEqual(len(playlist_data['entries']), 9)

if __name__ == '__main__':
    unittest.main()