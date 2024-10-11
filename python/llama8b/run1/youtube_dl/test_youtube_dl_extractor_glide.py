import unittest
from youtube_dl.extractor.glide import GlideIE


class TestGlideIE(unittest.TestCase):
    def test_IE_DESC(self):
        ie = GlideIE()
        self.assertEqual(ie.IE_DESC, 'Glide mobile video messages (glide.me)')

    def test__VALID_URL(self):
        ie = GlideIE()
        self.assertEqual(ie._VALID_URL, r'https?://share\.glide\.me/(?P<id>[A-Za-z0-9\-=_+]+)')

    def test__TEST(self):
        ie = GlideIE()
        self.assertEqual(ie._TEST, {
            'url': 'http://share.glide.me/UZF8zlmuQbe4mr+7dCiQ0w==',
            'md5': '4466372687352851af2d131cfaa8a4c7',
            'info_dict': {
                'id': 'UZF8zlmuQbe4mr+7dCiQ0w==',
                'ext': 'mp4',
                'title': "Damon's Glide message",
                'thumbnail': r're:^https?://.*?\.cloudfront\.net/.*\.jpg$',
            }
        })

    def test__real_extract(self):
        ie = GlideIE()
        url = 'http://share.glide.me/UZF8zlmuQbe4mr+7dCiQ0w=='
        result = ie._real_extract(url)
        self.assertEqual(result, {
            'id': 'UZF8zlmuQbe4mr+7dCiQ0w==',
            'title': "Damon's Glide message",
            'url': '',
            'thumbnail': ''
        })

    def test__match_id(self):
        ie = GlideIE()
        url = 'http://share.glide.me/UZF8zlmuQbe4mr+7dCiQ0w=='
        self.assertEqual(ie._match_id(url), 'UZF8zlmuQbe4mr+7dCiQ0w==')

    def test__download_webpage(self):
        ie = GlideIE()
        url = 'http://share.glide.me/UZF8zlmuQbe4mr+7dCiQ0w=='
        result = ie._download_webpage(url, 'video_id')
        self.assertEqual(result, '')

    def test__html_search_regex(self):
        ie = GlideIE()
        webpage = '<title>Damon\'s Glide message</title>'
        result = ie._html_search_regex(r'<title>(.+?)</title>', webpage, 'title', default=None)
        self.assertEqual(result, "Damon's Glide message")

    def test__proto_relative_url(self):
        ie = GlideIE()
        url = 'http://example.com/video.mp4'
        result = ie._proto_relative_url(url)
        self.assertEqual(result, 'http://example.com/video.mp4')

    def test__search_regex(self):
        ie = GlideIE()
        webpage = '<source src="http://example.com/video.mp4" type="video/mp4">'
        result = ie._search_regex(r'<source[^>]+src=(["\'])(?P<url>.+?)\1', webpage, 'video URL', default=None, group='url')
        self.assertEqual(result, 'http://example.com/video.mp4')

    def test__og_search_title(self):
        ie = GlideIE()
        webpage = '<meta property="og:title" content="Damon\'s Glide message">'
        result = ie._og_search_title(webpage)
        self.assertEqual(result, "Damon's Glide message")

    def test__og_search_video_url(self):
        ie = GlideIE()
        webpage = '<meta property="og:video" content="http://example.com/video.mp4">'
        result = ie._og_search_video_url(webpage)
        self.assertEqual(result, 'http://example.com/video.mp4')

    def test__og_search_thumbnail(self):
        ie = GlideIE()
        webpage = '<meta property="og:image" content="http://example.com/thumbnail.jpg">'
        result = ie._og_search_thumbnail(webpage)
        self.assertEqual(result, 'http://example.com/thumbnail.jpg')

if __name__ == '__main__':
    unittest.main()