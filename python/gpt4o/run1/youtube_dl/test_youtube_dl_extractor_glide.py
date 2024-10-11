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

    def test_protected_match_id(self):
        url = 'http://share.glide.me/UZF8zlmuQbe4mr+7dCiQ0w=='
        video_id = self.instance._match_id(url)
        self.assertEqual(video_id, 'UZF8zlmuQbe4mr+7dCiQ0w==')

    def test_protected_download_webpage(self):
        url = 'http://share.glide.me/UZF8zlmuQbe4mr+7dCiQ0w=='
        video_id = 'UZF8zlmuQbe4mr+7dCiQ0w=='
        webpage = self.instance._download_webpage(url, video_id, fatal=False)
        self.assertIn('<title>', webpage)

    def test_protected_html_search_regex(self):
        html = '<title>Test Title</title>'
        title = self.instance._html_search_regex(r'<title>(.+?)</title>', html, 'title', fatal=False)
        self.assertEqual(title, 'Test Title')

    def test_protected_og_search_title(self):
        html = '<meta property="og:title" content="OG Title">'
        title = self.instance._og_search_title(html).params
        self.assertEqual(title, 'OG Title')

    def test_protected_search_regex(self):
        html = '<source src="http://example.com/video.mp4">'
        video_url = self.instance._search_regex(r'<source[^>]+src=(["\'])(?P<url>.+?)\1', html or '', 'video URL', group='url')
        self.assertEqual(video_url, 'http://example.com/video.mp4')

    def test_protected_og_search_video_url(self):
        html = '<meta property="og:video" content="http://example.com/video.mp4">'
        video_url = self.instance._og_search_video_url(html).params
        self.assertEqual(video_url, 'http://example.com/video.mp4')

    def test_protected_og_search_thumbnail(self):
        html = '<meta property="og:image" content="http://example.com/thumbnail.jpg">'
        thumbnail_url = self.instance._og_search_thumbnail(html).params
        self.assertEqual(thumbnail_url, 'http://example.com/thumbnail.jpg')

if __name__ == '__main__':
    unittest.main()