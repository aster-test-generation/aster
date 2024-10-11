import unittest
from youtube_dl.extractor import glide


class TestGlideIE(unittest.TestCase):
    def test_IE_DESC(self):
        instance = glide.GlideIE()
        self.assertEqual(instance.IE_DESC, 'Glide mobile video messages (glide.me)')

    def test_VALID_URL(self):
        instance = glide.GlideIE()
        self.assertEqual(instance._VALID_URL, r'https?://share\.glide\.me/(?P<id>[A-Za-z0-9\-=_+]+)')

    def test_TEST(self):
        instance = glide.GlideIE()
        self.assertEqual(instance._TEST, {
            'url': 'http://share.glide.me/UZF8zlmuQbe4mr+7dCiQ0w==',
            'md5': '4466372687352851af2d131cfaa8a4c7',
            'info_dict': {
                'id': 'UZF8zlmuQbe4mr+7dCiQ0w==',
                'ext': 'mp4',
                'title': "Damon's Glide message",
                'thumbnail': r're:^https?://.*?\.cloudfront\.net/.*\.jpg$',
            }
        })

    def test_real_extract(self):
        instance = glide.GlideIE()
        url = 'http://share.glide.me/UZF8zlmuQbe4mr+7dCiQ0w=='
        result = instance._real_extract(url)
        self.assertEqual(result['id'], 'UZF8zlmuQbe4mr+7dCiQ0w==')
        self.assertEqual(result['title'], "Damon's Glide message")

    def test_match_id(self):
        instance = glide.GlideIE()
        url = 'http://share.glide.me/UZF8zlmuQbe4mr+7dCiQ0w=='
        result = instance._match_id(url)
        self.assertEqual(result, 'UZF8zlmuQbe4mr+7dCiQ0w==')

    def test_download_webpage(self):
        instance = glide.GlideIE()
        url = 'http://share.glide.me/UZF8zlmuQbe4mr+7dCiQ0w=='
        video_id = 'UZF8zlmuQbe4mr+7dCiQ0w=='
        result = instance._download_webpage(url, video_id)
        self.assertIsNotNone(result)

    def test_html_search_regex(self):
        instance = glide.GlideIE()
        webpage = '<title>Damon\'s Glide message</title>'
        pattern = r'<title>(.+?)</title>'
        default = None
        group = 'title'
        result = instance._html_search_regex(pattern, webpage, group, default)
        self.assertEqual(result, "Damon's Glide message")

    def test_og_search_title(self):
        instance = glide.GlideIE()
        webpage = '<meta property="og:title" content="Damon\'s Glide message">'
        result = instance._og_search_title(webpage)
        self.assertEqual(result, "Damon's Glide message")

    def test_proto_relative_url(self):
        instance = glide.GlideIE()
        url = 'http://example.com/video.mp4'
        result = instance._proto_relative_url(url)
        self.assertEqual(result, '//example.com/video.mp4')

    def test_search_regex(self):
        instance = glide.GlideIE()
        webpage = '<source src="http://example.com/video.mp4">'
        pattern = r'<source[^>]+src=(["\'])(?P<url>.+?)\1'
        default = None
        group = 'url'
        result = instance._search_regex(pattern, webpage, 'video URL', default, group)
        self.assertEqual(result, 'http://example.com/video.mp4')

    def test_og_search_video_url(self):
        instance = glide.GlideIE()
        webpage = '<meta property="og:video:url" content="http://example.com/video.mp4">'
        result = instance._og_search_video_url(webpage)
        self.assertEqual(result, 'http://example.com/video.mp4')

    def test_init(self):
        instance = glide.GlideIE()
        self.assertIsNotNone(instance)

    def test_str(self):
        instance = glide.GlideIE()
        result = instance.__str__()
        self.assertEqual(result, 'GlideIE')

    def test_repr(self):
        instance = glide.GlideIE()
        result = instance.__repr__()
        self.assertEqual(result, 'GlideIE()')

if __name__ == '__main__':
    unittest.main()