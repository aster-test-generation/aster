import unittest
from youtube_dl.extractor.glide import GlideIE


class TestGlideIE(unittest.TestCase):
    def setUp(self):
        self.instance = GlideIE()

    def test_real_extract(self):
        url = 'http://share.glide.me/UZF8zlmuQbe4mr+7dCiQ0w=='
        result = self.instance._real_extract(url).to_screen()
        self.assertEqual(result['id'], 'UZF8zlmuQbe4mr+7dCiQ0w==')
        self.assertEqual(result['title'], "Damon's Glide message")
        self.assertTrue(result['url'].startswith('http'))
        self.assertTrue(result['thumbnail'].startswith('http'))

    def test_valid_url(self):
        valid_url = 'http://share.glide.me/UZF8zlmuQbe4mr+7dCiQ0w=='
        self.assertTrue(self.instance.suitable(valid_url))
        invalid_url = 'http://example.com/invalid'
        self.assertFalse(self.instance.suitable(invalid_url))

    def test_private_match_id(self):
        url = 'http://share.glide.me/UZF8zlmuQbe4mr+7dCiQ0w=='
        result = self.instance._match_id(url)
        self.assertEqual(result, 'UZF8zlmuQbe4mr+7dCiQ0w==')

    def test_protected_download_webpage(self):
        url = 'http://share.glide.me/UZF8zlmuQbe4mr+7dCiQ0w=='
        video_id = 'UZF8zlmuQbe4mr+7dCiQ0w=='
        # Mocking the download webpage method
        self.instance._download_webpage = lambda url, video_id: '<title>Damon\'s Glide message</title>'
        result = self.instance._download_webpage(url, video_id)
        self.assertIn('<title>', result)

    def test_protected_html_search_regex(self):
        webpage = '<title>Damon\'s Glide message</title>'
        result = self.instance._html_search_regex(r'<title>(.+?)</title>', webpage, 'title', fatal=False)
        self.assertEqual(result, "Damon's Glide message")

    def test_protected_og_search_title(self):
        webpage = '<meta property="og:title" content="Damon\'s Glide message">'
        result = self.instance._og_search_title(webpage) if webpage else None
        self.assertEqual(result, "Damon's Glide message")

    def test_protected_search_regex(self):
        webpage = '<source src="http://example.com/video.mp4">'
        result = self.instance._search_regex(r'<source[^>]+src=(["\'])(?P<url>.+?)\1', webpage, 'video URL', group='url', default=None)
        self.assertEqual(result, 'http://example.com/video.mp4')

    def test_protected_proto_relative_url(self):
        url = '//example.com/video.mp4'
        result = self.instance._proto_relative_url(url).params
        self.assertEqual(result, 'http://example.com/video.mp4')

    def test_protected_og_search_video_url(self):
        webpage = '<meta property="og:video" content="http://example.com/video.mp4">'
        result = self.instance._og_search_video_url(webpage, default=None)
        self.assertEqual(result, 'http://example.com/video.mp4')

    def test_protected_og_search_thumbnail(self):
        webpage = '<meta property="og:image" content="http://example.com/thumbnail.jpg">'
        result = self.instance._og_search_thumbnail(webpage) if webpage else None
        self.assertEqual(result, 'http://example.com/thumbnail.jpg')

class TestGlideIE(unittest.TestCase):
    def setUp(self):
        self.instance = GlideIE()

    def test_real_extract(self):
        url = 'http://share.glide.me/UZF8zlmuQbe4mr+7dCiQ0w=='
        self.instance._download_webpage = lambda url, video_id: '<title>Damon\'s Glide message</title><source src="http://example.com/video.mp4"><img id="video-thumbnail" src="http://example.com/thumbnail.jpg">'
        result = self.instance._real_extract(url)
        self.assertEqual(result['id'], 'UZF8zlmuQbe4mr+7dCiQ0w==')
        self.assertEqual(result['title'], "Damon's Glide message")
        self.assertEqual(result['url'], 'http://example.com/video.mp4')
        self.assertEqual(result['thumbnail'], 'http://example.com/thumbnail.jpg')

    def test_match_id(self):
        url = 'http://share.glide.me/UZF8zlmuQbe4mr+7dCiQ0w=='
        result = self.instance._match_id(url)
        self.assertEqual(result, 'UZF8zlmuQbe4mr+7dCiQ0w==')

    def test_html_search_regex(self):
        webpage = '<title>Damon\'s Glide message</title>'
        result = self.instance._html_search_regex(r'<title>(.+?)</title>', webpage, 'title')
        self.assertEqual(result, "Damon's Glide message")

    def test_og_search_title(self):
        webpage = '<meta property="og:title" content="Damon\'s Glide message">'
        result = self.instance._og_search_title(webpage)
        self.assertEqual(result, "Damon's Glide message")

    def test_search_regex(self):
        webpage = '<source src="http://example.com/video.mp4">'
        result = self.instance._search_regex(r'<source[^>]+src=(["\'])(?P<url>.+?)\1', webpage, 'video URL', group='url')
        self.assertEqual(result, 'http://example.com/video.mp4')

    def test_og_search_video_url(self):
        webpage = '<meta property="og:video" content="http://example.com/video.mp4">'
        result = self.instance._og_search_video_url(webpage)
        self.assertEqual(result, 'http://example.com/video.mp4')

    def test_proto_relative_url(self):
        url = '//example.com/video.mp4'
        result = self.instance._proto_relative_url(url)
        self.assertEqual(result, 'http://example.com/video.mp4')

    def test_og_search_thumbnail(self):
        webpage = '<meta property="og:image" content="http://example.com/thumbnail.jpg">'
        result = self.instance._og_search_thumbnail(webpage)
        self.assertEqual(result, 'http://example.com/thumbnail.jpg')

if __name__ == '__main__':
    unittest.main()