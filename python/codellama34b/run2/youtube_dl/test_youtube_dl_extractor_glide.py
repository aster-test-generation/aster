import unittest
from youtube_dl.extractor.glide import *



class TestGlideIE(unittest.TestCase):
    def test_real_extract(self):
        instance = GlideIE()
        result = instance._real_extract("http://share.glide.me/UZF8zlmuQbe4mr+7dCiQ0w==")
        self.assertEqual(result['id'], "UZF8zlmuQbe4mr+7dCiQ0w==")
        self.assertEqual(result['title'], "Damon's Glide message")
        self.assertEqual(result['url'], "https://d1f659l1h2o59z.cloudfront.net/videos/UZF8zlmuQbe4mr+7dCiQ0w==.mp4")
        self.assertEqual(result['thumbnail'], "https://d1f659l1h2o59z.cloudfront.net/videos/UZF8zlmuQbe4mr+7dCiQ0w==.jpg")

    def test_og_search_title(self):
        instance = GlideIE()
        result = instance._og_search_title("http://share.glide.me/UZF8zlmuQbe4mr+7dCiQ0w==")
        self.assertEqual(result, "Damon's Glide message")

    def test_og_search_video_url(self):
        instance = GlideIE()
        result = instance._og_search_video_url("http://share.glide.me/UZF8zlmuQbe4mr+7dCiQ0w==")
        self.assertEqual(result, "https://d1f659l1h2o59z.cloudfront.net/videos/UZF8zlmuQbe4mr+7dCiQ0w==.mp4")

    def test_og_search_thumbnail(self):
        instance = GlideIE()
        result = instance._og_search_thumbnail("http://share.glide.me/UZF8zlmuQbe4mr+7dCiQ0w==")
        self.assertEqual(result, "https://d1f659l1h2o59z.cloudfront.net/videos/UZF8zlmuQbe4mr+7dCiQ0w==.jpg")

    def test_proto_relative_url(self):
        instance = GlideIE()
        result = instance._proto_relative_url("https://d1f659l1h2o59z.cloudfront.net/videos/UZF8zlmuQbe4mr+7dCiQ0w==.mp4")
        self.assertEqual(result, "https://d1f659l1h2o59z.cloudfront.net/videos/UZF8zlmuQbe4mr+7dCiQ0w==.mp4")

    def test_search_regex(self):
        instance = GlideIE()
        result = instance._search_regex(r'<source[^>]+src=(["\'])(?P<url>.+?)\1', "http://share.glide.me/UZF8zlmuQbe4mr+7dCiQ0w==", 'video URL', default=None, group='url')
        self.assertEqual(result, "https://d1f659l1h2o59z.cloudfront.net/videos/UZF8zlmuQbe4mr+7dCiQ0w==.mp4")

    def test_html_search_regex(self):
        instance = GlideIE()
        result = instance._html_search_regex(r'<title>(.+?)</title>', "http://share.glide.me/UZF8zlmuQbe4mr+7dCiQ0w==", 'title', default=None)
        self.assertEqual(result, "Damon's Glide message")

if __name__ == '__main__':
    unittest.main()