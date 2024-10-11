import unittest
from youtube_dl.extractor.glide import GlideIE

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