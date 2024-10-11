import unittest
from youtube_dl.extractor import glide


class TestGlideIE(unittest.TestCase):
    def test_IE_DESC(self):
        self.assertEqual(glide.GlideIE.IE_DESC, 'Glide mobile video messages (glide.me)')

    def test__VALID_URL(self):
        self.assertEqual(glide.GlideIE._VALID_URL, r'https?://share\.glide\.me/(?P<id>[A-Za-z0-9\-=_+]+)')

    def test__TEST(self):
        self.assertEqual(glide.GlideIE._TEST, {
            'url': 'http://share.glide.me/UZF8zlmuQbe4mr+7dCiQ0w==',
            'md5': '4466372687352851af2d131cfaa8a4c7',
            'info_dict': {
                'id': 'UZF8zlmuQbe4mr+7dCiQ0w==',
                'ext': 'mp4',
                'title': "Damon's Glide message",
                'thumbnail': r're:^https?://.*?\.cloudfront\.net/.*\.jpg$',
            }
        })

    def test__init__(self):
        instance = glide.GlideIE()
        self.assertIsInstance(instance, glide.InfoExtractor)

    def test__real_extract(self):
        instance = glide.GlideIE()
        url = 'http://share.glide.me/UZF8zlmuQbe4mr+7dCiQ0w=='
        result = instance._real_extract(url)
        self.assertEqual(result['id'], 'UZF8zlmuQbe4mr+7dCiQ0w==')
        self.assertEqual(result['title'], "Damon's Glide message")
        self.assertEqual(result['ext'], 'mp4')
        self.assertRegex(result['thumbnail'], r'^https?://.*?\.cloudfront\.net/.*\.jpg$')

    def test__match_id(self):
        instance = glide.GlideIE()
        url = 'http://share.glide.me/UZF8zlmuQbe4mr+7dCiQ0w=='
        result = instance._match_id(url)
        self.assertEqual(result, 'UZF8zlmuQbe4mr+7dCiQ0w==')

    def test__download_webpage(self):
        instance = glide.GlideIE()
        url = 'http://share.glide.me/UZF8zlmuQbe4mr+7dCiQ0w=='
        video_id = 'UZF8zlmuQbe4mr+7dCiQ0w=='
        result = instance._download_webpage(url, video_id)
        self.assertIsInstance(result, str)

    def test__html_search_regex(self):
        instance = glide.GlideIE()
        webpage = '<title>Damon\'s Glide message</title>'
        pattern = r'<title>(.+?)</title>'
        result = instance._html_search_regex(pattern, webpage, 'title')
        self.assertEqual(result, "Damon's Glide message")

    def test__og_search_title(self):
        instance = glide.GlideIE()
        webpage = '<meta property="og:title" content="Damon\'s Glide message">'
        result = instance._og_search_title(webpage)
        self.assertEqual(result, "Damon's Glide message")

    def test__proto_relative_url(self):
        instance = glide.GlideIE()
        url = '//example.com/path/to/video.mp4'
        result = instance._proto_relative_url(url)
        self.assertEqual(result, 'http://example.com/path/to/video.mp4')

    def test__search_regex(self):
        instance = glide.GlideIE()
        webpage = '<source src="https://example.com/path/to/video.mp4">'
        pattern = r'<source[^>]+src=(["\'])(?P<url>.+?)\1'
        result = instance._search_regex(pattern, webpage, 'video URL', group='url')
        self.assertEqual(result, 'https://example.com/path/to/video.mp4')

    def test__og_search_video_url(self):
        instance = glide.GlideIE()
        webpage = '<meta property="og:video:url" content="https://example.com/path/to/video.mp4">'
        result = instance._og_search_video_url(webpage)
        self.assertEqual(result, 'https://example.com/path/to/video.mp4')

    def test__og_search_thumbnail(self):
        instance = glide.GlideIE()
        webpage = '<meta property="og:image" content="https://example.com/path/to/thumbnail.jpg">'
        result = instance._og_search_thumbnail(webpage)
        self.assertEqual(result, 'https://example.com/path/to/thumbnail.jpg')

    def test__str__(self):
        instance = glide.GlideIE()
        result = instance.__str__()
        self.assertEqual(result, 'GlideIE')

if __name__ == '__main__':
    unittest.main()