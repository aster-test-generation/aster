from youtube_dl.extractor.fourtube import InfoExtractor
import unittest
from youtube_dl.extractor.fourtube import FourTubeBaseIE, FourTubeIE, FuxIE, PornTubeIE, PornerBrosIE


class TestFourTubeBaseIE(unittest.TestCase):
    def test__extract_formats(self):
        ie = FourTubeBaseIE()
        url = 'https://example.com'
        video_id = '123'
        media_id = '456'
        sources = ['360p', '480p']
        formats = ie._extract_formats(url, video_id, media_id, sources)
        self.assertEqual(len(formats), 2)

    def test__real_extract(self):
        ie = FourTubeBaseIE()
        url = 'https://example.com'
        webpage = '<html><body>test</body></html>'
        ie._download_webpage = lambda *args, **kwargs: webpage
        info_dict = ie._real_extract(url)
        self.assertIn('id', info_dict)
        self.assertIn('title', info_dict)
        self.assertIn('formats', info_dict)

    def test___init__(self):
        ie = FourTubeBaseIE()
        self.assertIsInstance(ie, InfoExtractor)

    def test___str__(self):
        ie = FourTubeBaseIE()
        self.assertEqual(str(ie), 'FourTubeBaseIE')

    def test___repr__(self):
        ie = FourTubeBaseIE()
        self.assertEqual(repr(ie), 'FourTubeBaseIE()')

class TestFourTubeIE(unittest.TestCase):
    def test_IE_NAME(self):
        self.assertEqual(FourTubeIE.IE_NAME, '4tube')

    def test__VALID_URL(self):
        self.assertEqual(FourTubeIE._VALID_URL, r'https?://(?:(?P<kind>www|m)\.)?4tube\.com/(?:videos|embed)/(?P<id>\d+)(?:/(?P<display_id>[^/?]+)?)?')

    def test__URL_TEMPLATE(self):
        self.assertEqual(FourTubeIE._URL_TEMPLATE, 'https://www.4tube.com/videos/%s/video')

    def test__TKN_HOST(self):
        self.assertEqual(FourTubeIE._TKN_HOST, 'token.4tube.com')

class TestFuxIE(unittest.TestCase):
    def test_IE_NAME(self):
        self.assertEqual(FuxIE.IE_NAME, 'fux')

    def test__VALID_URL(self):
        self.assertEqual(FuxIE._VALID_URL, r'https?://(?:(?P<kind>www|m)\.)?fux\.com/(?:video|embed)/(?P<id>\d+)(?:/(?P<display_id>[^/?]+)?)?')

    def test__URL_TEMPLATE(self):
        self.assertEqual(FuxIE._URL_TEMPLATE, 'https://www.fux.com/video/%s/video')

    def test__TKN_HOST(self):
        self.assertEqual(FuxIE._TKN_HOST, 'token.fux.com')

class TestPornTubeIE(unittest.TestCase):
    def test_IE_NAME(self):
        self.assertEqual(PornTubeIE.IE_NAME, 'porntube')

    def test__VALID_URL(self):
        self.assertEqual(PornTubeIE._VALID_URL, r'https?://(?:(?P<kind>www|m)\.)?porntube\.com/(?:videos/(?P<display_id>[^/]+)_|embed/)(?P<id>\d+)')

    def test__URL_TEMPLATE(self):
        self.assertEqual(PornTubeIE._URL_TEMPLATE, 'https://www.porntube.com/videos/video_%s')

    def test__TKN_HOST(self):
        self.assertEqual(PornTubeIE._TKN_HOST, 'tkn.porntube.com')

    def test__real_extract(self):
        ie = PornTubeIE()
        url = 'https://example.com'
        webpage = '<html><body>test</body></html>'
        ie._download_webpage = lambda *args, **kwargs: webpage
        info_dict = ie._real_extract(url)
        self.assertIn('id', info_dict)
        self.assertIn('title', info_dict)
        self.assertIn('formats', info_dict)

class TestPornerBrosIE(unittest.TestCase):
    def test_IE_NAME(self):
        self.assertEqual(PornerBrosIE.IE_NAME, 'pornerbros')

    def test__VALID_URL(self):
        self.assertEqual(PornerBrosIE._VALID_URL, r'https?://(?:(?P<kind>www|m)\.)?pornerbros\.com/(?:videos/(?P<display_id>[^/]+)_|embed/)(?P<id>\d+)')

    def test__URL_TEMPLATE(self):
        self.assertEqual(PornerBrosIE._URL_TEMPLATE, 'https://www.pornerbros.com/videos/video_%s')

if __name__ == '__main__':
    unittest.main()