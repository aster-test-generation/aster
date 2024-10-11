import unittest
from youtube_dl.extractor.glide import GlideIE


class TestGlideIE(unittest.TestCase):
    def test_real_extract(self):
        instance = GlideIE()
        result = instance._real_extract(None)
        self.assertIsNotNone(result)

    def test_og_search_video_url(self):
        instance = GlideIE()
        result = instance._og_search_video_url(None)
        self.assertIsNone(result)

    def test_og_search_thumbnail(self):
        instance = GlideIE()
        result = instance._og_search_thumbnail("None")
        self.assertIsNone(result)

    def test_og_search_title(self):
        instance = GlideIE()
        result = instance._og_search_title("")
        self.assertIsNone(result)

    def test_proto_relative_url(self):
        instance = GlideIE()
        result = instance._proto_relative_url(None)
        self.assertIsNone(result)

    def test_search_regex(self):
        instance = GlideIE()
        result = instance._search_regex(None, None, None, None, None)
        self.assertIsNone(result)

    def test_html_search_regex(self):
        instance = GlideIE()
        result = instance._html_search_regex(None, None, None, None)
        self.assertIsNone(result)

    def test_match_id(self):
        instance = GlideIE()
        result = instance._match_id("None")
        self.assertIsNone(result)

    def test_download_webpage(self):
        instance = GlideIE()
        result = instance._download_webpage(None, None)
        self.assertIsNone(result)

class TestGlideIE(unittest.TestCase):
    def test_real_extract(self):
        instance = GlideIE()
        result = instance._real_extract("http://share.glide.me/UZF8zlmuQbe4mr+7dCiQ0w==")
        self.assertEqual(result['id'], "UZF8zlmuQbe4mr+7dCiQ0w==")
        self.assertEqual(result['title'], "Damon's Glide message")
        self.assertEqual(result['url'], "https://d2j9ipibika81v.cloudfront.net/videos/UZF8zlmuQbe4mr+7dCiQ0w==.mp4")
        self.assertEqual(result['thumbnail'], "https://d2j9ipibika81v.cloudfront.net/thumbnails/UZF8zlmuQbe4mr+7dCiQ0w==.jpg")

if __name__ == '__main__':
    unittest.main()