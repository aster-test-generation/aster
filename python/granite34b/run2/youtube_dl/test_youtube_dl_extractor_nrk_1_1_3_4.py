import unittest
from youtube_dl.extractor.nrk import NRKTVSeasonIE


class TestNRKTVSeasonIE(unittest.TestCase):
    def test_suitable(self):
        self.assertFalse(NRKTVSeasonIE.suitable('https://www.nrk.no/serier/the- Simpsons/S01'))
        self.assertTrue(NRKTVSeasonIE.suitable('https://www.nrk.no/serier/the-simpsons/12345678/S01'))

    def test_real_extract(self):
        ie = NRKTVSeasonIE()
        result = ie._real_extract('https://www.nrk.no/serier/the-simpsons/12345678/S01')
        self.assertEqual(result['id'], '12345678/S01')
        self.assertEqual(result['title'], 'The Simpsons - Season 1')

if __name__ == '__main__':
    unittest.main()