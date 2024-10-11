import unittest
from unittest.mock import patch
from youtube_dl.extractor import nr


class TestNRKTVEpisodeIE(unittest.TestCase):
    def test_init(self):
        ie = NRKTVEpisodeIE()
        self.assertEqual(ie.__class__, NRKTVEpisodeIE)

    def test_real_extract(self):
        ie = NRKTVEpisodeIE()
        url = 'https://example.com/episode'
        webpage = '<html><body>Some content</body></html>'
        info = {'@id': 'nrk-id', 'nrk:program-id': 'nrk-id'}
        with patch('youtube_dl.extractor.nrk.NRKTVEpisodeIE._download_webpage') as mock_download_webpage:
            mock_download_webpage.return_value = webpage
            result = ie._real_extract(url)
            self.assertEqual(result, info)

    def test_search_json_ld(self):
        ie = NRKTVEpisodeIE()
        webpage = '<html><body><script>JSON-LD content</script></body></html>'
        display_id = 'episode-id'
        result = ie._search_json_ld(webpage, display_id, default={})
        self.assertEqual(result, {'@id': 'nrk-id', 'nrk:program-id': 'nrk-id'})

    def test_search_regex(self):
        ie = NRKTVEpisodeIE()
        webpage = '<html><body>data-program-id="nrk-id"</body></html>'
        result = ie._search_regex('data-program-id=["\\\'](%s)' % NRKTVIE._EPISODE_RE, webpage, 'nrk id')
        self.assertEqual(result, 'nrk-id')

    def test_html_search_meta(self):
        ie = NRKTVEpisodeIE()
        webpage = '<html><head><meta name="nrk:program-id" content="nrk-id"></head></html>'
        result = ie._html_search_meta('nrk:program-id', webpage, default=None)
        self.assertEqual(result, 'nrk-id')

    def test_str(self):
        ie = NRKTVEpisodeIE()
        result = str(ie)
        self.assertEqual(result, 'NRKTVEpisodeIE')

    def test_repr(self):
        ie = NRKTVEpisodeIE()
        result = repr(ie)
        self.assertEqual(result, 'NRKTVEpisodeIE()')

if __name__ == '__main__':
    unittest.main()