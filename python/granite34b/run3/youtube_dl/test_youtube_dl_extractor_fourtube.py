import unittest
from youtube_dl.extractor.fourtube import FourTubeBaseIE, FourTubeIE, FuxIE, PornTubeIE, PornerBrosIE


class TestFourTubeBaseIE(unittest.TestCase):
    def test_extract_formats(self):
        url = 'https://example.com/video'
        video_id = '12345'
        media_id = '67890'
        sources = ['360p', '480p', '720p']
        formats = FourTubeBaseIE._extract_formats(url, video_id, media_id, sources, None)
        self.assertEqual(len(formats), 3)
        for format in formats:
            self.assertIn('url', format)
            self.assertIn('format_id', format)
            self.assertIn('resolution', format)
            self.assertIn('quality', format)

    def test_real_extract(self):
        url = 'https://example.com/video'
        video_id = '12345'
        webpage = '<html><head><title>Example Video</title></head><body>Example Video Content</body></html>'
        result = FourTubeBaseIE._real_extract(self, url, video_id, webpage)
        self.assertEqual(result['id'], video_id)
        self.assertEqual(result['title'], 'Example Video')
        self.assertEqual(result['formats'], [])
        self.assertEqual(result['categories'], None)
        self.assertEqual(result['thumbnail'], None)
        self.assertEqual(result['uploader'], None)
        self.assertEqual(result['uploader_id'], None)
        self.assertEqual(result['timestamp'], None)
        self.assertEqual(result['like_count'], None)
        self.assertEqual(result['view_count'], None)
        self.assertEqual(result['duration'], None)
        self.assertEqual(result['age_limit'], 18)

class TestFourTubeIE(unittest.TestCase):
    def test_real_extract(self):
        url = 'https://example.com/video'
        video_id = '12345'
        webpage = '<html><head><title>Example Video</title></head><body>Example Video Content</body></html>'
        result = FourTubeIE._real_extract(url, webpage)
        self.assertEqual(result['id'], video_id)
        self.assertEqual(result['title'], 'Example Video')
        self.assertEqual(result['formats'], [])
        self.assertEqual(result['categories'], None)
        self.assertEqual(result['thumbnail'], None)
        self.assertEqual(result['uploader'], None)
        self.assertEqual(result['uploader_id'], None)
        self.assertEqual(result['timestamp'], None)
        self.assertEqual(result['like_count'], None)
        self.assertEqual(result['view_count'], None)
        self.assertEqual(result['duration'], None)
        self.assertEqual(result['age_limit'], 18)

class TestFuxIE(unittest.TestCase):
    def test_real_extract(self):
        url = 'https://example.com/video'
        video_id = '12345'
        webpage = '<html><head><title>Example Video</title></head><body>Example Video Content</body></html>'
        result = FuxIE._real_extract(url, webpage)
        self.assertEqual(result['id'], video_id)
        self.assertEqual(result['title'], 'Example Video')
        self.assertEqual(result['formats'], [])
        self.assertEqual(result['categories'], None)
        self.assertEqual(result['thumbnail'], None)
        self.assertEqual(result['uploader'], None)
        self.assertEqual(result['uploader_id'], None)
        self.assertEqual(result['timestamp'], None)
        self.assertEqual(result['like_count'], None)
        self.assertEqual(result['view_count'], None)
        self.assertEqual(result['duration'], None)
        self.assertEqual(result['age_limit'], 18)


if __name__ == '__main__':
    unittest.main()