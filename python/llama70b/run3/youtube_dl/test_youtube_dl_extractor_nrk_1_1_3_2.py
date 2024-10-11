import unittest
from youtube_dl.extractor.nrk import NRKTVEpisodeIE, NRKTVI


class TestNRKTVEpisodeIE(unittest.TestCase):
    def test_init(self):
        instance = NRKTVEpisodeIE()
        self.assertIsInstance(instance, NRKTVEpisodeIE)

    def test_real_extract(self):
        instance = NRKTVEpisodeIE()
        url = 'https://example.com/nrk/tv/episode/12345/season/1/episode/2'
        result = instance._real_extract(url)
        self.assertIsInstance(result, dict)

    def test__init__(self):
        instance = NRKTVEpisodeIE()
        self.assertIsNone(instance.__init__())

    def test__str__(self):
        instance = NRKTVEpisodeIE()
        result = instance.__str__()
        self.assertEqual(result, 'NRKTVEpisodeIE')

    def test__repr__(self):
        instance = NRKTVEpisodeIE()
        result = instance.__repr__()
        self.assertEqual(result, 'NRKTVEpisodeIE()')

    def test__eq__(self):
        instance1 = NRKTVEpisodeIE()
        instance2 = NRKTVEpisodeIE()
        self.assertTrue(instance1 == instance2)

    def test_download_webpage(self):
        instance = NRKTVEpisodeIE()
        url = 'https://example.com/nrk/tv/episode/12345/season/1/episode/2'
        display_id = '12345'
        result = instance._download_webpage(url, display_id)
        self.assertIsInstance(result, str)

    def test_search_json_ld(self):
        instance = NRKTVEpisodeIE()
        webpage = '<html><script type="application/ld+json">{"@id": "12345"}</script></html>'
        display_id = '12345'
        default = {}
        result = instance._search_json_ld(webpage, display_id, default)
        self.assertIsInstance(result, dict)

    def test_html_search_meta(self):
        instance = NRKTVEpisodeIE()
        webpage = '<html><meta property="nrk:program-id" content="12345"></html>'
        default = None
        result = instance._html_search_meta('nrk:program-id', webpage, default)
        self.assertEqual(result, '12345')

    def test_search_regex(self):
        instance = NRKTVEpisodeIE()
        webpage = '<html><script>data-program-id="12345"</script></html>'
        pattern = 'data-program-id=["\\\'](%s)' % NRKTVIE._EPISODE_RE
        result = instance._search_regex(pattern, webpage, 'nrk id')
        self.assertEqual(result, '12345')

class TestNRKTVIE(unittest.TestCase):
    def test_EPISODE_RE(self):
        self.assertIsInstance(NRKTVIE._EPISODE_RE, re.Pattern)

class TestNRKIE(unittest.TestCase):
    def test_ie_key(self):
        self.assertIsInstance(NRKIE.ie_key(), str)

if __name__ == '__main__':
    unittest.main()