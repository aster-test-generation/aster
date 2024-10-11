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