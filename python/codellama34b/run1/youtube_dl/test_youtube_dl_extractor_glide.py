import unittest
from youtube_dl.extractor.glide import *



class TestGlideIE(unittest.TestCase):
    def test_real_extract(self):
        instance = GlideIE()
        result = instance._real_extract("http://share.glide.me/UZF8zlmuQbe4mr+7dCiQ0w==")
        self.assertEqual(result, {'id': 'UZF8zlmuQbe4mr+7dCiQ0w==', 'title': "Damon's Glide message", 'url': 'http://share.glide.me/UZF8zlmuQbe4mr+7dCiQ0w==', 'thumbnail': 'http://share.glide.me/UZF8zlmuQbe4mr+7dCiQ0w=='})

    def test_search_regex(self):
        instance = GlideIE()
        result = instance._search_regex(r'<source[^>]+src=(["\'])(?P<url>.+?)\1', "http://share.glide.me/UZF8zlmuQbe4mr+7dCiQ0w==", 'video URL', default=None, group='url')
        self.assertEqual(result, 'http://share.glide.me/UZF8zlmuQbe4mr+7dCiQ0w==')

    def test_proto_relative_url(self):
        instance = GlideIE()
        result = instance._proto_relative_url("http://share.glide.me/UZF8zlmuQbe4mr+7dCiQ0w==")
        self.assertEqual(result, 'http://share.glide.me/UZF8zlmuQbe4mr+7dCiQ0w==')

    def test_html_search_regex(self):
        instance = GlideIE()
        result = instance._html_search_regex(r'<title>(.+?)</title>', "http://share.glide.me/UZF8zlmuQbe4mr+7dCiQ0w==", 'title', default=None)
        self.assertEqual(result, "Damon's Glide message")

    def test_og_search_title(self):
        instance = GlideIE()
        result = instance.og_search_title("http://share.glide.me/UZF8zlmuQbe4mr+7dCiQ0w==")
        self.assertEqual(result, "Damon's Glide message")

    def test_og_search_video_url(self):
        instance = GlideIE()
        result = instance._og_search_video_url("http://share.glide.me/UZF8zlmuQbe4mr+7dCiQ0w==")
        self.assertEqual(result, 'http://share.glide.me/UZF8zlmuQbe4mr+7dCiQ0w==')

    def test_og_search_thumbnail(self):
        instance = GlideIE()
        result = instance._og_search_thumbnail("http://share.glide.me/UZF8zlmuQbe4mr+7dCiQ0w==")
        self.assertEqual(result, 'http://share.glide.me/UZF8zlmuQbe4mr+7dCiQ0w==')

    def test_match_id(self):
        instance = GlideIE()
        result = instance._match_id("http://share.glide.me/UZF8zlmuQbe4mr+7dCiQ0w==")
        self.assertEqual(result, 'UZF8zlmuQbe4mr+7dCiQ0w==')

if __name__ == '__main__':
    unittest.main()