import re
import unittest
from youtube_dl.extractor import nr


class TestNRKTVEpisodeIE(unittest.TestCase):
    def test_init(self):
        ie = NRKTVEpisodeIE()
        self.assertEqual(ie.__class__, NRKTVEpisodeIE)

    def test_real_extract(self):
        ie = NRKTVEpisodeIE()
        url = 'https://example.com/season/1/episode/1'
        display_id, season_number, episode_number = '1', '1', '1'
        webpage = 'example webpage'
        info = {'@id': 'nrk id', 'nrk:program-id': 'nrk id'}
        nrk_id = 'nrk id'
        ie._VALID_URL = re.compile(r'https://example\.com/season/(\d+)/episode/(\d+)')
        ie._download_webpage = lambda url, display_id: webpage
        ie._search_json_ld = lambda webpage, display_id, default: info
        ie._html_search_meta = lambda key, webpage, default: info.get(key)
        ie._search_regex = lambda pattern, webpage, default: nrk_id
        result = ie._real_extract(url)
        self.assertEqual(result, {'_type': 'url', 'id': nrk_id, 'url': 'nrk:%s' % nrk_id, 'ie_key': NRKTVEpisodeIE.ie_key(), 'season_number': int(season_number), 'episode_number': int(episode_number)})

    def test_str_method(self):
        ie = NRKTVEpisodeIE()
        result = str(ie)
        self.assertEqual(result, 'NRKTVEpisodeIE')

    def test_repr_method(self):
        ie = NRKTVEpisodeIE()
        result = repr(ie)
        self.assertEqual(result, 'NRKTVEpisodeIE()')

    def test_eq_method(self):
        ie1 = NRKTVEpisodeIE()
        ie2 = NRKTVEpisodeIE()
        self.assertEqual(ie1, ie2)

if __name__ == '__main__':
    unittest.main()