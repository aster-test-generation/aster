import unittest
from youtube_dl.extractor.glide import GlideIE


class TestGlideIE(unittest.TestCase):
    def test_ie_desc(self):
        self.assertEqual(GlideIE.IE_DESC, 'Glide mobile video messages (glide.me)')

    def test_valid_url(self):
        self.assertEqual(GlideIE._VALID_URL, r'https?://share\.glide\.me/(?P<id>[A-Za-z0-9\-=_+]+)')

    def test_test(self):
        self.assertEqual(GlideIE._TEST, {
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
        video_id = 'UZF8zlmuQbe4mr+7dCiQ0w=='
        webpage = '<html><title>Glide video</title><source src="http://example.com/video.mp4" type="video/mp4"></source></html>'
        title = 'Glide video'
        video_url = 'http://example.com/video.mp4'
        thumbnail = 'http://example.com/thumbnail.jpg'
        self.assertEqual(ie._real_extract(video_id), {
            'id': video_id,
            'title': title,
            'url': video_url,
            'thumbnail': thumbnail,
        })

class TestGlideIE(unittest.TestCase):
    def test_ie_desc(self):
        self.assertEqual(GlideIE.IE_DESC, 'Glide mobile video messages (glide.me)')

    def test_valid_url(self):
        self.assertTrue(GlideIE._VALID_URL.match('https://share.glide.me/UZF8zlmuQbe4mr+7dCiQ0w=='))

    def test_test(self):
        self.assertEqual(GlideIE._TEST, {
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