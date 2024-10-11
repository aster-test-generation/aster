import unittest
from youtube_dl.extractor.glide import GlideIE


class TestGlideIE(unittest.TestCase):
    def test_ie_desc(self):
        ie = GlideIE()
        self.assertEqual(ie.IE_DESC, 'Glide mobile video messages (glide.me)')

    def test_valid_url(self):
        ie = GlideIE()
        self.assertTrue(re.match('https://share.glide.me/UZF8zlmuQbe4mr+7dCiQ0w==', ie._VALID_URL))

    def test_test(self):
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

    def test_real_extract(self):
        ie = GlideIE()
        webpage = """
        <title>Damon's Glide message</title>
        <source src="https://example.com/video.mp4" type="video/mp4">
        <img id="video-thumbnail" src="https://example.com/thumbnail.jpg">
        """
        info_dict = ie._real_extract('https://share.glide.me/UZF8zlmuQbe4mr+7dCiQ0w==')
        self.assertEqual(info_dict['id'], 'UZF8zlmuQbe4mr+7dCiQ0w==')
        self.assertEqual(info_dict['ext'], 'mp4')
        self.assertEqual(info_dict['title'], "Damon's Glide message")
        self.assertEqual(info_dict['thumbnail'], 'https://example.com/thumbnail.jpg')
        self.assertEqual(info_dict['url'], 'https://example.com/video.mp4')

if __name__ == '__main__':
    unittest.main()