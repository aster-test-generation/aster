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
        video_id = ie._match_id(url)
        self.assertEqual(video_id, 'UZF8zlmuQbe4mr+7dCiQ0w==')
        webpage = ie._download_webpage(url, video_id)
        self.assertEqual(webpage, 'webpage content')
        title = ie._html_search_regex(
            r'<title>(.+?)</title>', webpage,
            'title', default=None) or ie._og_search_title(webpage)
        self.assertEqual(title, "Damon's Glide message")
        video_url = ie._proto_relative_url(ie._search_regex(
            r'<source[^>]+src=(["\'])(?P<url>.+?)\1',
            webpage, 'video URL', default=None,
            group='url')) or ie._og_search_video_url(webpage)
        self.assertEqual(video_url, 'video URL')
        thumbnail = ie._proto_relative_url(ie._search_regex(
            r'<img[^>]+id=["\']video-thumbnail["\'][^>]+src=(["\'])(?P<url>.+?)\1',
            webpage, 'thumbnail url', default=None,
            group='url')) or ie._og_search_thumbnail(webpage)
        self.assertEqual(thumbnail, 'thumbnail URL')
        result = ie._real_extract(url)
        self.assertEqual(result, {
            'id': video_id,
            'title': title,
            'url': video_url,
            'thumbnail': thumbnail,
        })

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
            'url': 'http://share.glide.me/UZF8zlmuQbe4mr+7dCiQ0w==',
            'thumbnail': 'https://cloudfront.net/thumbnail.jpg',
        })

if __name__ == '__main__':
    unittest.main()