import unittest
from youtube_dl.extractor.itv import ITVIE, ITVBTCCIE


class TestITVIE(unittest.TestCase):
    def test__init__(self):
        instance = ITVIE()
        self.assertIsInstance(instance, ITVIE)

    def test__real_extract(self):
        instance = ITVIE()
        url = 'https://www.itv.com/hub/liar/2a4547a0012'
        result = instance._real_extract(url)
        self.assertIsInstance(result, dict)

    def test__match_id(self):
        instance = ITVIE()
        url = 'https://www.itv.com/hub/liar/2a4547a0012'
        result = instance._match_id(url)
        self.assertEqual(result, '2a4547a0012')

    def test__download_webpage(self):
        instance = ITVIE()
        url = 'https://www.itv.com/hub/liar/2a4547a0012'
        result = instance._download_webpage(url, '2a4547a0012')
        self.assertIsInstance(result, str)

    def test__search_regex(self):
        instance = ITVIE()
        webpage = '<html><body>hello</body></html>'
        pattern = r'hello'
        result = instance._search_regex(pattern, webpage, 'hello')
        self.assertEqual(result, 'hello')

    def test__search_json_ld(self):
        instance = ITVIE()
        webpage = '<html><body><script type="application/ld+json">{}</script></body></html>'
        result = instance._search_json_ld(webpage, '2a4547a0012', default={})
        self.assertIsInstance(result, dict)

    def test__parse_json(self):
        instance = ITVIE()
        json_str = '{}'
        result = instance._parse_json(json_str, '2a4547a0012', fatal=False)
        self.assertIsInstance(result, dict)

    def test__json_ld(self):
        instance = ITVIE()
        json_ld = {'@type': 'TVEpisode'}
        result = instance._json_ld(json_ld, '2a4547a0012', fatal=False)
        self.assertIsInstance(result, dict)

    def test__html_search_meta(self):
        instance = ITVIE()
        webpage = '<html><head><meta property="og:title" content="title"/></head></html>'
        result = instance._html_search_meta(['og:title', 'twitter:title'], webpage)
        self.assertEqual(result, 'title')

    def test__sort_formats(self):
        instance = ITVIE()
        formats = [{'url': 'http://example.com'}]
        instance._sort_formats(formats)
        self.assertEqual(formats, [{'url': 'http://example.com'}])

    def test__extract_m3u8_formats(self):
        instance = ITVIE()
        url = 'http://example.com/hls.m3u8'
        result = instance._extract_m3u8_formats(url, '2a4547a0012', 'mp4', entry_protocol='m3u8_native', m3u8_id='hls', fatal=False)
        self.assertIsInstance(result, list)

    def test__repr__(self):
        instance = ITVIE()
        result = instance.__repr__()
        self.assertIsInstance(result, str)

    def test__str__(self):
        instance = ITVIE()
        result = instance.__str__()
        self.assertIsInstance(result, str)

class TestITVBTCCIE(unittest.TestCase):
    def test__init__(self):
        instance = ITVBTCCIE()
        self.assertIsInstance(instance, ITVBTCCIE)

    def test__real_extract(self):
        instance = ITVBTCCIE()
        url = 'http://www.itv.com/btcc/races/btcc-2018-all-the-action-from-brands-hatch'
        result = instance._real_extract(url)
        self.assertIsInstance(result, dict)

    def test__match_id(self):
        instance = ITVBTCCIE()
        url = 'http://www.itv.com/btcc/races/btcc-2018-all-the-action-from-brands-hatch'
        result = instance._match_id(url)
        self.assertEqual(result, 'btcc-2018-all-the-action-from-brands-hatch')

    def test__download_webpage(self):
        instance = ITVBTCCIE()
        url = 'http://www.itv.com/btcc/races/btcc-2018-all-the-action-from-brands-hatch'
        result = instance._download_webpage(url, 'btcc-2018-all-the-action-from-brands-hatch')
        self.assertIsInstance(result, str)

if __name__ == '__main__':
    unittest.main()