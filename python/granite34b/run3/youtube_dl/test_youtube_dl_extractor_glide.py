import unittest
from youtube_dl.extractor.glide import GlideIE


class TestGlideIE(unittest.TestCase):
    def test_real_extract(self):
        ie = GlideIE()
        video_id = 'UZF8zlmuQbe4mr+7dCiQ0w=='
        webpage = """
        <html>
            <title>Damon's Glide message</title>
            <source src="http://example.com/video.mp4" />
            <img id="video-thumbnail" src="http://example.com/thumbnail.jpg" />
        </html>
        """
        expected_result = {
            'id': video_id,
            'title': "Damon's Glide message",
            'url': 'http://example.com/video.mp4',
            'thumbnail': 'http://example.com/thumbnail.jpg',
        }
        result = ie._real_extract(webpage)
        self.assertEqual(result, expected_result)

class TestGlideIE(unittest.TestCase):
    def test_real_extract(self):
        ie = GlideIE()
        url = 'http://share.glide.me/UZF8zlmuQbe4mr+7dCiQ0w=='
        video_id = 'UZF8zlmuQbe4mr+7dCiQ0w=='
        webpage = '<html><title>Damon\'s Glide message</title><source src="http://example.com/video.mp4"><img id="video-thumbnail" src="http://example.com/thumbnail.jpg"></html>'
        title = 'Damon\'s Glide message'
        video_url = 'http://example.com/video.mp4'
        thumbnail = 'http://example.com/thumbnail.jpg'
        result = ie._real_extract(url)
        self.assertEqual(result['id'], video_id)
        self.assertEqual(result['title'], title)
        self.assertEqual(result['url'], video_url)
        self.assertEqual(result['thumbnail'], thumbnail)

if __name__ == '__main__':
    unittest.main()