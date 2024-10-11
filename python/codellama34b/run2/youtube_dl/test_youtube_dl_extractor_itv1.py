import unittest
from youtube_dl.extractor.itv import ITVIE, ITVBTCCIE

class TestITVIE(unittest.TestCase):
    def test_real_extract(self):
        instance = ITVIE()
        result = instance._real_extract("https://www.itv.com/hub/liar/2a4547a0012")
        self.assertEqual(result['id'], '2a4547a0012')
        self.assertEqual(result['ext'], 'mp4')
        self.assertEqual(result['title'], 'Liar - Series 2 - Episode 6')
        self.assertEqual(result['description'], 'md5:d0f91536569dec79ea184f0a44cca089')
        self.assertEqual(result['series'], 'Liar')
        self.assertEqual(result['season_number'], 2)
        self.assertEqual(result['episode_number'], 6)

    def test_real_extract_2(self):
        instance = ITVIE()
        result = instance._real_extract("https://www.itv.com/hub/through-the-keyhole/2a2271a0033")
        self.assertEqual(result['id'], '2a2271a0033')

    def test_real_extract_3(self):
        instance = ITVIE()
        result = instance._real_extract("https://www.itv.com/hub/james-martins-saturday-morning/2a5159a0034")
        self.assertEqual(result['id'], '2a5159a0034')

    def test_real_extract_4(self):
        instance = ITVIE()
        result = instance._real_extract("https://www.itv.com/hub/whos-doing-the-dishes/2a2898a0024")
        self.assertEqual(result['id'], '2a2898a0024')

class TestITVBTCCIE(unittest.TestCase):
    def test_real_extract(self):
        instance = ITVBTCCIE()
        result = instance._real_extract("http://www.itv.com/btcc/races/btcc-2018-all-the-action-from-brands-hatch")
        self.assertEqual(result['id'], 'btcc-2018-all-the-action-from-brands-hatch')
        self.assertEqual(result['title'], 'BTCC 2018: All the action from Brands Hatch')

if __name__ == '__main__':
    unittest.main()