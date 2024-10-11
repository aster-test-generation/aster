import unittest
from youtube_dl.extractor.nrk import NRKTVSeriesIE


class TestNRKTVSeriesIE(unittest.TestCase):
    def test_suitable(self):
        self.assertFalse(NRKTVSeriesIE.suitable('https://tv.nrk.no/program/12345'))
        self.assertFalse(NRKTVSeriesIE.suitable('https://tv.nrk.no/program/12345/aarsopptak/1'))
        self.assertFalse(NRKTVSeriesIE.suitable('https://tv.nrk.no/program/12345/seasons/1'))
        self.assertFalse(NRKTVSeriesIE.suitable('https://tv.nrk.no/program/12345/seasons/1/episodes/1'))
        self.assertFalse(NRKTVSeriesIE.suitable('https://radio.nrk.no/program/12345'))
        self.assertFalse(NRKTVSeriesIE.suitable('https://radio.nrk.no/program/12345/aarsopptak/1'))
        self.assertFalse(NRKTVSeriesIE.suitable('https://radio.nrk.no/program/12345/seasons/1'))
        self.assertFalse(NRKTVSeriesIE.suitable('https://radio.nrk.no/program/12345/seasons/1/episodes/1'))
        self.assertTrue(NRKTVSeriesIE.suitable('https://tv.nrk.no/serier/12345'))
        self.assertTrue(NRKTVSeriesIE.suitable('https://radio.nrk.no/serier/12345'))

    def test_real_extract(self):
        ie = NRKTVSeriesIE()
        url = 'https://tv.nrk.no/serier/12345'
        info_dict = ie._real_extract(url)
        self.assertEqual(info_dict['id'], '12345')
        self.assertEqual(info_dict['title'], 'Program Title')
        self.assertEqual(info_dict['description'], 'Program Description')
        self.assertEqual(info_dict['thumbnail'], 'https://example.com/thumbnail.jpg')
        self.assertEqual(info_dict['duration'], 3600)
        self.assertEqual(info_dict['timestamp'], 1633254400)
        self.assertEqual(info_dict['age_limit'], 18)

if __name__ == '__main__':
    unittest.main()