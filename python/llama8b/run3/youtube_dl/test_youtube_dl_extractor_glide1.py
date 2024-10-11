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
            'url': 'http://share.glide.me/UZF8zlmuQbe4mr+7dCiQ0w==',
            'thumbnail': 'https://cloudfront.net/thumbnail.jpg',
        })

if __name__ == '__main__':
    unittest.main()