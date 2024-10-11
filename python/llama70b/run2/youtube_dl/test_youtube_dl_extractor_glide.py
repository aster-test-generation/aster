import unittest
from youtube_dl.extractor import glide


class TestGlideIE(unittest.TestCase):
    def test_IE_DESC(self):
        ie = glide.GlideIE()
        self.assertEqual(ie.IE_DESC, 'Glide mobile video messages (glide.me)')

    def test_VALID_URL(self):
        ie = glide.GlideIE()
        self.assertEqual(ie._VALID_URL, r'https?://share\.glide\.me/(?P<id>[A-Za-z0-9\-=_+]+)')

    def test_TEST(self):
        ie = glide.GlideIE()
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

    def test_real_extract(self):
        ie = glide.GlideIE()
        url = 'http://share.glide.me/UZF8zlmuQbe4mr+7dCiQ0w=='
        result = ie._real_extract(url)
        self.assertEqual(result['id'], 'UZF8zlmuQbe4mr+7dCiQ0w==')
        self.assertEqual(result['title'], "Damon's Glide message")
        self.assertEqual(result['ext'], 'mp4')

    def test_match_id(self):
        ie = glide.GlideIE()
        url = 'http://share.glide.me/UZF8zlmuQbe4mr+7dCiQ0w=='
        result = ie._match_id(url)
        self.assertEqual(result, 'UZF8zlmuQbe4mr+7dCiQ0w==')

    def test_download_webpage(self):
        ie = glide.GlideIE()
        url = 'http://share.glide.me/UZF8zlmuQbe4mr+7dCiQ0w=='
        result = ie._download_webpage(url, 'UZF8zlmuQbe4mr+7dCiQ0w==')
        self.assertIsNotNone(result)

    def test_html_search_regex(self):
        ie = glide.GlideIE()
        webpage = '<title>Damon\'s Glide message</title>'
        result = ie._html_search_regex(r'<title>(.+?)</title>', webpage, 'title')
        self.assertEqual(result, "Damon's Glide message")

    def test_og_search_title(self):
        ie = glide.GlideIE()
        webpage = '<meta property="og:title" content="Damon\'s Glide message">'
        result = ie._og_search_title(webpage)
        self.assertEqual(result, "Damon's Glide message")

    def test_proto_relative_url(self):
        ie = glide.GlideIE()
        url = 'http://example.com/video.mp4'
        result = ie._proto_relative_url(url)
        self.assertEqual(result, '//example.com/video.mp4')

    def test_search_regex(self):
        ie = glide.GlideIE()
        webpage = '<source src="http://example.com/video.mp4">'
        result = ie._search_regex(r'<source[^>]+src=(["\'])(?P<url>.+?)\1', webpage, 'video URL', group='url')
        self.assertEqual(result, 'http://example.com/video.mp4')

    def test_og_search_video_url(self):
        ie = glide.GlideIE()
        webpage = '<meta property="og:video:url" content="http://example.com/video.mp4">'
        result = ie._og_search_video_url(webpage)
        self.assertEqual(result, 'http://example.com/video.mp4')

    def test_init(self):
        ie = glide.GlideIE()
        self.assertIsInstance(ie, glide.InfoExtractor)

    def test_str(self):
        ie = glide.GlideIE()
        result = str(ie)
        self.assertEqual(result, 'Glide mobile video messages (glide.me)')

    def test_repr(self):
        ie = glide.GlideIE()
        result = repr(ie)
        self.assertEqual(result, 'GlideIE')

    def test_eq(self):
        ie1 = glide.GlideIE()
        ie2 = glide.GlideIE()
        self.assertEqual(ie1, ie2)

if __name__ == '__main__':
    unittest.main()