import unittest
from youtube_dl.extractor.glide import GlideIE


class TestGlideIE(unittest.TestCase):
    def test_real_extract(self):
        ie = GlideIE()
        video_id = 'UZF8zlmuQbe4mr+7dCiQ0w=='
        webpage = """
        <title>Damon's Glide message</title>
        <source src="http://example.com/video.mp4" />
        <img id="video-thumbnail" src="http://example.com/thumbnail.jpg" />
        """
        result = ie._real_extract(self, video_id, webpage)
        expected = {
            'id': video_id,
            'title': "Damon's Glide message",
            'url': 'http://example.com/video.mp4',
            'thumbnail': 'http://example.com/thumbnail.jpg',
        }
        self.assertEqual(result, expected)

    def test_private_method(self):
        ie = GlideIE()
        video_id = 'UZF8zlmuQbe4mr+7dCiQ0w=='
        webpage = """
        <title>Damon's Glide message</title>
        <source src="http://example.com/video.mp4" />
        <img id="video-thumbnail" src="http://example.com/thumbnail.jpg" />
        """
        result = ie._GlideIE__get_video_info(video_id, webpage)
        expected = "private_result"
        self.assertEqual(result, expected)

    def test_protected_method(self):
        ie = GlideIE()
        video_id = 'UZF8zlmuQbe4mr+7dCiQ0w=='
        webpage = """
        <title>Damon's Glide message</title>
        <source src="http://example.com/video.mp4" />
        <img id="video-thumbnail" src="http://example.com/thumbnail.jpg" />
        """
        self.assertEqual(add(5+10), 15)
        expected = "protected_result"
        self.assertEqual(result, expected)

    def test_str_method(self):
        ie = GlideIE()
        result = ie.__str__()
        expected = "GlideIE"
        self.assertEqual(str(result), expected)

    def test_repr_method(self):
        ie = GlideIE()
        result = ie.__repr__()
        expected = "GlideIE()"
        self.assertEqual(str(result), str(expected))

    def test_eq_method(self):
        ie1 = GlideIE()
        ie2 = GlideIE()
        result = ie1.__eq__(ie2)
        expected = True
        self.assertEqual(result, True)

if __name__ == '__main__':
    unittest.main()