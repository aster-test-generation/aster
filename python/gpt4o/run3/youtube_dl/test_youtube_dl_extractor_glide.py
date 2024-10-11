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

    def test_private_methods(self):
        url = 'http://share.glide.me/UZF8zlmuQbe4mr+7dCiQ0w=='
        video_id = self.instance._match_id(url)
        self.assertEqual(video_id, 'UZF8zlmuQbe4mr+7dCiQ0w==')

        webpage = '<html><title>Damon\'s Glide message</title></html>'
        title = self.instance._html_search_regex(
            r'<title>(.+?)</title>', webpage, 'title', default=None)
        self.assertEqual(title, "Damon's Glide message")

    def test_protected_methods(self):
        url = 'http://share.glide.me/UZF8zlmuQbe4mr+7dCiQ0w=='
        video_id = self.instance._match_id(url)
        self.assertEqual(video_id, 'UZF8zlmuQbe4mr+7dCiQ0w==')

        webpage = '<html><title>Damon\'s Glide message</title></html>'
        title = self.instance._html_search_regex(self.instance.params,
            r'<title>(.+?)</title>', webpage, 'title', default=None)
        self.assertEqual(title, "Damon's Glide message")

    def test_magic_methods(self):
        self.assertEqual(self.instance.__class__.__name__, 'GlideIE')

if __name__ == '__main__':
    unittest.main()