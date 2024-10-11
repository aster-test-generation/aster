import unittest
from youtube_dl.extractor.fourtube import FourTubeBaseIE, FourTubeIE, FuxIE, PornTubeIE, PornerBrosIE


class TestFourTubeBaseIE(unittest.TestCase):
    def test__extract_formats(self):
        ie = FourTubeBaseIE()
        url = 'https://example.com/video'
        video_id = '12345'
        media_id = 'media_id'
        sources = ['360p', '480p', '720p']
        formats = ie._extract_formats(url, video_id, media_id, sources)
        self.assertEqual(len(formats), 3)

    def test__real_extract(self):
        ie = FourTubeBaseIE()
        url = 'https://example.com/video'
        info_dict = ie._real_extract(url)
        self.assertIn('id', info_dict)
        self.assertIn('title', info_dict)
        self.assertIn('formats', info_dict)

class TestFourTubeIE(unittest.TestCase):
    def test_IE_NAME(self):
        ie = FourTubeIE()
        self.assertEqual(ie.IE_NAME, '4tube')

    def test__VALID_URL(self):
        ie = FourTubeIE()
        url = 'https://www.4tube.com/videos/12345/hot-babe-holly-michaels-gets-her-ass-stuffed-by-black'
        self.assertTrue(ie._VALID_URL.match(url))

    def test__URL_TEMPLATE(self):
        ie = FourTubeIE()
        video_id = '12345'
        url = ie._URL_TEMPLATE % video_id
        self.assertEqual(url, 'https://www.4tube.com/videos/12345/video')

    def test__TKN_HOST(self):
        ie = FourTubeIE()
        self.assertEqual(ie._TKN_HOST, 'token.4tube.com')

class TestFuxIE(unittest.TestCase):
    def test_IE_NAME(self):
        ie = FuxIE()
        self.assertEqual(ie.IE_NAME, 'fux')

    def test__VALID_URL(self):
        ie = FuxIE()
        url = 'https://www.fux.com/video/12345/awesome-fucking-kitchen-ends-cum-swallow'
        self.assertTrue(ie._VALID_URL.match(url))

    def test__URL_TEMPLATE(self):
        ie = FuxIE()
        video_id = '12345'
        url = ie._URL_TEMPLATE % video_id
        self.assertEqual(url, 'https://www.fux.com/video/12345/video')

    def test__TKN_HOST(self):
        ie = FuxIE()
        self.assertEqual(ie._TKN_HOST, 'token.fux.com')

class TestPornTubeIE(unittest.TestCase):
    def test_IE_NAME(self):
        ie = PornTubeIE()
        self.assertEqual(ie.IE_NAME, 'porntube')

    def test__VALID_URL(self):
        ie = PornTubeIE()
        url = 'https://www.porntube.com/videos/teen-couple-doing-anal_7089759'
        self.assertTrue(ie._VALID_URL.match(url))

    def test__URL_TEMPLATE(self):
        ie = PornTubeIE()
        video_id = '7089759'
        url = ie._URL_TEMPLATE % video_id
        self.assertEqual(url, 'https://www.porntube.com/videos/video_7089759')

    def test__TKN_HOST(self):
        ie = PornTubeIE()
        self.assertEqual(ie._TKN_HOST, 'tkn.porntube.com')

class TestPornerBrosIE(unittest.TestCase):
    def test_IE_NAME(self):
        ie = PornerBrosIE()
        self.assertEqual(ie.IE_NAME, 'pornerbros')

    def test__VALID_URL(self):
        ie = PornerBrosIE()
        url = 'https://www.pornerbros.com/videos/skinny-brunette-takes-big-cock-down-her-anal-hole_181369'
        self.assertTrue(ie._VALID_URL.match(url))

    def test__URL_TEMPLATE(self):
        ie = PornerBrosIE()
        video_id = '181369'
        url = ie._URL_TEMPLATE % video_id
        self.assertEqual(url, 'https://www.pornerbros.com/videos/video_181369')

    def test__TKN_HOST(self):
        ie = PornerBrosIE()
        self.assertEqual(ie._TKN_HOST, 'token.pornerbros.com')

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
        webpage = '<html><body>dummy webpage</body></html>'
        ie._download_webpage = lambda *args, **kwargs: webpage
        result = ie._real_extract(url)
        self.assertIsInstance(result, dict)

class TestFourTubeIE(unittest.TestCase):
    def test_IE_NAME(self):
        ie = FourTubeIE()
        self.assertEqual(ie.IE_NAME, '4tube')

    def test__VALID_URL(self):
        ie = FourTubeIE()
        self.assertIsInstance(ie._VALID_URL, str)

    def test__URL_TEMPLATE(self):
        ie = FourTubeIE()
        self.assertEqual(ie._URL_TEMPLATE, 'https://www.4tube.com/videos/%s/video')

    def test__TKN_HOST(self):
        ie = FourTubeIE()
        self.assertEqual(ie._TKN_HOST, 'token.4tube.com')

class TestFuxIE(unittest.TestCase):
    def test_IE_NAME(self):
        ie = FuxIE()
        self.assertEqual(ie.IE_NAME, 'fux')

    def test__VALID_URL(self):
        ie = FuxIE()
        self.assertIsInstance(ie._VALID_URL, str)

    def test__URL_TEMPLATE(self):
        ie = FuxIE()
        self.assertEqual(ie._URL_TEMPLATE, 'https://www.fux.com/video/%s/video')

    def test__TKN_HOST(self):
        ie = FuxIE()
        self.assertEqual(ie._TKN_HOST, 'token.fux.com')

class TestPornTubeIE(unittest.TestCase):
    def test_IE_NAME(self):
        ie = PornTubeIE()
        self.assertEqual(ie.IE_NAME, 'porntube')

    def test__VALID_URL(self):
        ie = PornTubeIE()
        self.assertIsInstance(ie._VALID_URL, str)

    def test__URL_TEMPLATE(self):
        ie = PornTubeIE()
        self.assertEqual(ie._URL_TEMPLATE, 'https://www.porntube.com/videos/video_%s')

    def test__TKN_HOST(self):
        ie = PornTubeIE()
        self.assertEqual(ie._TKN_HOST, 'tkn.porntube.com')

    def test__real_extract(self):
        ie = PornTubeIE()
        url = 'https://example.com'
        webpage = '<html><body>dummy webpage</body></html>'
        ie._download_webpage = lambda *args, **kwargs: webpage
        result = ie._real_extract(url)
        self.assertIsInstance(result, dict)

class TestPornerBrosIE(unittest.TestCase):
    def test_IE_NAME(self):
        ie = PornerBrosIE()
        self.assertEqual(ie.IE_NAME, 'pornerbros')

    def test__VALID_URL(self):
        ie = PornerBrosIE()
        self.assertIsInstance(ie._VALID_URL, str)

    def test__URL_TEMPLATE(self):
        ie = PornerBrosIE()
        self.assertEqual(ie._URL_TEMPLATE, 'https://www.pornerbros.com/videos/video_%s')

    def test__TKN_HOST(self):
        ie = PornerBrosIE()
        self.assertEqual(ie._TKN_HOST, 'token.pornerbros.com')

if __name__ == '__main__':
    unittest.main()