import unittest
from youtube_dl.extractor.nrk import NRKTVSeriesIE


class TestNRKTVSeriesIE(unittest.TestCase):
    def test_suitable(self):
        self.assertFalse(NRKTVSeriesIE.suitable('https://tv.nrk.no/program/ZDF-finland'))
        self.assertTrue(NRKTVSeriesIE.suitable('https://tv.nrk.no/serier/00000000-0000-0000-0000-000000000000'))

    def test_real_extract(self):
        ie = NRKTVSeriesIE()
        url = 'https://tv.nrk.no/serier/00000000-0000-0000-0000-000000000000'
        info_dict = ie._real_extract(url)
        self.assertEqual(info_dict['id'], '00000000-0000-0000-0000-000000000000')
        self.assertEqual(info_dict['title'], 'NRK TV')
        self.assertEqual(info_dict['description'], 'NRK TV er Norgets fore leadinge private TV-kanal. Den er tilgjengelig for alle i Norge, og gir deg tilgang til nyheter, kultur, sport, politik, lære, kjønn, kultur og lyriske program og serier fra NRK, NRK P1, NRK Kultur, TV 2, TV 4, TV 5, NRK+ og NRK P2.')

if __name__ == '__main__':
    unittest.main()