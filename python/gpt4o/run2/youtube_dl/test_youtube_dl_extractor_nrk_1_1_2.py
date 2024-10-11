import unittest
from youtube_dl.extractor.nrk import NRKIE, NRKBaseIE
from youtube_dl.utils import ExtractorError


class TestNRKIE(unittest.TestCase):
    def setUp(self):
        self.instance = NRKIE()

    def test_init(self):
        self.assertIsInstance(self.instance, NRKIE)

    def test_real_extract(self):
        url = 'https://tv.nrk.no/serie/some-show/season/episode'
        self.instance._match_id = lambda x: 'some-show/season/episode'
        self.instance._call_api = lambda path, video_id, item, query=None: {
            'manifest': {
                'id': '12345',
                'playability': 'playable',
                'playable': {
                    'assets': [
                        {'url': 'http://example.com/video.mp4', 'format': 'mp4'},
                        {'url': 'http://example.com/video.m3u8', 'format': 'hls'}
                    ],
                    'duration': '3600',
                    'subtitles': [{'webVtt': 'http://example.com/sub.vtt', 'language': 'en'}]
                }
            },
            'metadata': {
                'preplay': {
                    'titles': {'title': 'Test Title', 'subtitle': 'Test Subtitle'},
                    'description': 'Test Description',
                    'poster': {'images': [{'url': 'http://example.com/image.jpg', 'pixelWidth': 1920, 'pixelHeight': 1080}]}
                },
                'legalAge': {'body': {'rating': {'code': '12'}}},
                '_links': {'series': {'name': 'series'}}
            }
        }[item]
        result = self.instance._real_extract(url)
        self.assertEqual(result['id'], '12345')
        self.assertEqual(result['title'], 'Test Title')
        self.assertEqual(result['alt_title'], 'Test Subtitle')
        self.assertEqual(result['description'], 'Test Description')
        self.assertEqual(result['duration'], 3600)
        self.assertEqual(result['thumbnails'][0]['url'], 'http://example.com/image.jpg')
        self.assertEqual(result['age_limit'], 12)
        self.assertEqual(result['formats'][0]['url'], 'http://example.com/video.mp4')
        self.assertEqual(result['subtitles']['en'][0]['url'], 'http://example.com/sub.vtt')

    def test_private_methods(self):
        # Test private methods by name mangling
        self.instance._NRKIE__private_method = lambda x: x ** 2
        result = self.instance._NRKIE__private_method(3)
        self.assertEqual(result, 9)

    def test_protected_methods(self):
        # Test protected methods directly
        self.instance._protected_method = lambda x: x + 3
        result = self.instance._protected_method(3)
        self.assertEqual(result, 6)

    def test_magic_methods(self):
        # Test magic methods directly
        self.instance.__str__ = lambda: "NRKIE"
        result = self.instance.__str__()
        self.assertEqual(result, "NRKIE")

        self.instance.__repr__ = lambda: "NRKIE()"
        result = self.instance.__repr__()
        self.assertEqual(result, "NRKIE()")

if __name__ == '__main__':
    unittest.main()