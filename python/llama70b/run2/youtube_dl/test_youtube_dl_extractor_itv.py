import unittest
from youtube_dl.extractor.itv import ITVIE, ITVBTCCIE, _GEO_COUNTRIES, _TEST


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

    def test__extract_attributes(self):
        instance = ITVIE()
        html = '<div id="video" data-video-playlist="playlist" data-video-id="id">'
        result = instance._extract_attributes(html)
        self.assertIsInstance(result, dict)

    def test__download_json(self):
        instance = ITVIE()
        url = 'https://example.com/playlist'
        data = {'user': {'itvUserId': ''}}
        headers = {'Accept': 'application/json'}
        result = instance._download_json(url, 'id', data=json.dumps(data), headers=headers)
        self.assertIsInstance(result, dict)

    def test__sort_formats(self):
        instance = ITVIE()
        formats = [{'url': 'https://example.com/video1'}, {'url': 'https://example.com/video2'}]
        instance._sort_formats(formats)
        self.assertEqual(formats, [{'url': 'https://example.com/video1'}, {'url': 'https://example.com/video2'}])

    def test__search_json_ld(self):
        instance = ITVIE()
        webpage = '<html><body><script type="application/ld+json">{}</script></body></html>'
        result = instance._search_json_ld(webpage, 'id', default={})
        self.assertIsInstance(result, dict)

    def test__parse_json(self):
        instance = ITVIE()
        json_str = '{"@type": "TVEpisode"}'
        result = instance._parse_json(json_str, 'id', fatal=False)
        self.assertIsInstance(result, dict)

    def test__json_ld(self):
        instance = ITVIE()
        json_ld = {'@type': 'TVEpisode'}
        result = instance._json_ld(json_ld, 'id', fatal=False)
        self.assertIsInstance(result, dict)

    def test__html_search_meta(self):
        instance = ITVIE()
        webpage = '<html><head><meta property="og:title" content="title"></head></html>'
        result = instance._html_search_meta(['og:title'], webpage)
        self.assertEqual(result, 'title')

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

if __name__ == '__main__':
    unittest.main()