import unittest
from unittest.mock import patch
from youtube_dl.extractor.nrk import NRKTVSeasonIE, NRKTVSerieBaseI


class TestNRKTVSeasonIE(unittest.TestCase):
    @patch('youtube_dl.extractor.nrk.NRKTVSerieBaseIE.suitable')
    def test_suitable(self, mock_suitable):
        nrk_tv_season_ie = NRKTVSeasonIE()
        mock_suitable.return_value = False
        self.assertFalse(nrk_tv_season_ie.suitable('url'))

    @patch('youtube_dl.extractor.nrk.re')
    @patch('youtube_dl.extractor.nrk.NRKTVSerieBaseIE._call_api')
    def test_real_extract(self, mock_call_api, mock_re):
        nrk_tv_season_ie = NRKTVSeasonIE()
        mobj = re.compile('pattern').match('url')
        mock_re.match.return_value = mobj
        data = {'titles': {'title': 'title'}}
        mock_call_api.return_value = data
        self.assertEqual(nrk_tv_season_ie._real_extract('url'), {'title': 'title'})

    def test_init(self):
        nrk_tv_season_ie = NRKTVSeasonIE()
        self.assertEqual(nrk_tv_season_ie, NRKTVSeasonIE())

    def test_str_method(self):
        nrk_tv_season_ie = NRKTVSeasonIE()
        self.assertEqual(str(nrk_tv_season_ie), 'NRKTVSeasonIE')

    def test_repr_method(self):
        nrk_tv_season_ie = NRKTVSeasonIE()
        self.assertEqual(repr(nrk_tv_season_ie), 'NRKTVSeasonIE()')

if __name__ == '__main__':
    unittest.main()