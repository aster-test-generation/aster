import unittest
from youtube_dl.extractor.fourtube import FourTubeBaseIE, FourTubeIE, FuxIE, PornTubeIE, PornerBrosIE


class TestFourTubeBaseIE(unittest.TestCase):
    def setUp(self):
        self.instance = FourTubeBaseIE()

    def test_extract_formats(self):
        url = 'http://example.com'
        video_id = '123'
        media_id = '456'
        sources = ['720', '480']
        self.instance._TKN_HOST = 'token.example.com'
        self.instance._download_json = lambda *args, **kwargs: {'720': {'token': 'http://example.com/720'}, '480': {'token': 'http://example.com/480'}}
        self.instance._sort_formats = lambda x: x
        result = self.instance._extract_formats(url, video_id, media_id, sources)
        self.assertEqual(result, [
            {'url': 'http://example.com/720', 'format_id': '720p', 'resolution': '720p', 'quality': 720},
            {'url': 'http://example.com/480', 'format_id': '480p', 'resolution': '480p', 'quality': 480}
        ])

    def test_real_extract(self):
        url = 'http://www.4tube.com/videos/209733/hot-babe-holly-michaels-gets-her-ass-stuffed-by-black'
        self.instance._VALID_URL = r'https?://(?:(?P<kind>www|m)\.)?4tube\.com/(?:videos|embed)/(?P<id>\d+)(?:/(?P<display_id>[^/]+))?'
        self.instance._URL_TEMPLATE = 'https://www.4tube.com/videos/%s/video'
        self.instance._download_webpage = lambda *args, **kwargs: '<html></html>'
        self.instance._html_search_meta = lambda *args, **kwargs: 'test'
        self.instance._html_search_regex = lambda *args, **kwargs: 'test'
        self.instance._search_regex = lambda *args, **kwargs: 'test'
        self.instance._extract_formats = lambda *args, **kwargs: []
        result = self.instance._real_extract(url)
        self.assertEqual(result['id'], '209733')

class TestFourTubeIE(unittest.TestCase):
    def setUp(self):
        self.instance = FourTubeIE()

    def test_real_extract(self):
        url = 'http://www.4tube.com/videos/209733/hot-babe-holly-michaels-gets-her-ass-stuffed-by-black'
        self.instance._VALID_URL = r'https?://(?:(?P<kind>www|m)\.)?4tube\.com/(?:videos|embed)/(?P<id>\d+)(?:/(?P<display_id>[^/]+))?'
        self.instance._URL_TEMPLATE = 'https://www.4tube.com/videos/%s/video'
        self.instance._download_webpage = lambda *args, **kwargs: '<html></html>'
        self.instance._html_search_meta = lambda *args, **kwargs: 'test'
        self.instance._html_search_regex = lambda *args, **kwargs: 'test'
        self.instance._search_regex = lambda *args, **kwargs: 'test'
        self.instance._extract_formats = lambda *args, **kwargs: []
        result = self.instance._real_extract(url)
        self.assertEqual(result['id'], '209733')

class TestFuxIE(unittest.TestCase):
    def setUp(self):
        self.instance = FuxIE()

    def test_real_extract(self):
        url = 'https://www.fux.com/video/195359/awesome-fucking-kitchen-ends-cum-swallow'
        self.instance._VALID_URL = r'https?://(?:(?P<kind>www|m)\.)?fux\.com/(?:video|embed)/(?P<id>\d+)(?:/(?P<display_id>[^/]+))?'
        self.instance._URL_TEMPLATE = 'https://www.fux.com/video/%s/video'
        self.instance._download_webpage = lambda *args, **kwargs: '<html></html>'
        self.instance._html_search_meta = lambda *args, **kwargs: 'test'
        self.instance._html_search_regex = lambda *args, **kwargs: 'test'
        self.instance._search_regex = lambda *args, **kwargs: 'test'
        self.instance._extract_formats = lambda *args, **kwargs: []
        result = self.instance._real_extract(url)
        self.assertEqual(result['id'], '195359')

class TestPornTubeIE(unittest.TestCase):
    def setUp(self):
        self.instance = PornTubeIE()

    def test_real_extract(self):
        url = 'https://www.porntube.com/videos/teen-couple-doing-anal_7089759'
        self.instance._VALID_URL = r'https?://(?:(?P<kind>www|m)\.)?porntube\.com/(?:videos/(?P<display_id>[^/]+)_|embed/)(?P<id>\d+)'
        self.instance._URL_TEMPLATE = 'https://www.porntube.com/videos/video_%s'
        self.instance._download_webpage = lambda *args, **kwargs: '<html></html>'
        self.instance._html_search_meta = lambda *args, **kwargs: 'test'
        self.instance._html_search_regex = lambda *args, **kwargs: 'test'
        self.instance._search_regex = lambda *args, **kwargs: 'test'
        self.instance._extract_formats = lambda *args, **kwargs: []
        result = self.instance._real_extract(url)
        self.assertEqual(result['id'], '7089759')

class TestPornerBrosIE(unittest.TestCase):
    def setUp(self):
        self.instance = PornerBrosIE()

    def test_real_extract(self):
        url = 'https://www.pornerbros.com/videos/skinny-brunette-takes-big-cock-down-her-anal-hole_181369'
        self.instance._VALID_URL = r'https?://(?:(?P<kind>www|m)\.)?pornerbros\.com/(?:videos/(?P<display_id>[^/]+)_|embed/)(?P<id>\d+)'
        self.instance._URL_TEMPLATE = 'https://www.pornerbros.com/videos/video_%s'
        self.instance._download_webpage = lambda *args, **kwargs: '<html></html>'
        self.instance._html_search_meta = lambda *args, **kwargs: 'test'
        self.instance._html_search_regex = lambda *args, **kwargs: 'test'
        self.instance._search_regex = lambda *args, **kwargs: 'test'
        self.instance._extract_formats = lambda *args, **kwargs: []
        result = self.instance._real_extract(url)
        self.assertEqual(result['id'], '181369')

if __name__ == '__main__':
    unittest.main()