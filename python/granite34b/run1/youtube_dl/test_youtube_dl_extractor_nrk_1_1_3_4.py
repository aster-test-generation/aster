import unittest
from youtube_dl.extractor.nrk import NRKTVSeasonIE


class TestNRKTVSeasonIE(unittest.TestCase):
    def test_suitable(self):
        self.assertFalse(NRKTVSeasonIE.suitable('https://www.nrk.no/serier/test'))
        self.assertTrue(NRKTVSeasonIE.suitable('https://www.nrk.no/serier/test/season-1'))

    def test_real_extract(self):
        url = 'https://www.nrk.no/serier/test/season-1'
        result = NRKTVSeasonIE()._real_extract(url)
        self.assertEqual(result['id'], 'test/season-1')
        self.assertEqual(result['title'], 'test/season-1')

if __name__ == '__main__':
    unittest.main()