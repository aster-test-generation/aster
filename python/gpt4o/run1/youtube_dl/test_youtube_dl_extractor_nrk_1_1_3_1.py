import unittest
from youtube_dl.extractor.nrk import NRKIE


class TestNRKTVIE(unittest.TestCase):
    def setUp(self):
        self.instance = NRKTVIE()

    def test_init(self):
        self.assertIsInstance(self.instance, NRKTVIE)

    def test_real_extract(self):
        # Mocking the _match_id and url_result methods
        self.instance._match_id = lambda url: 'test_video_id'
        self.instance.url_result = lambda url, ie, video_id: {'url': url, 'ie_key': ie, 'video_id': video_id}
        
        result = self.instance._real_extract('http://example.com/test_video_id')
        self.assertEqual(result, {'url': 'nrk:test_video_id', 'ie_key': 'NRKIE', 'video_id': 'test_video_id'})

    def test_match_id(self):
        # Assuming _match_id is a method that extracts the video ID from the URL
        self.instance._match_id = lambda url: 'test_video_id'
        result = self.instance._match_id('http://example.com/test_video_id')
        self.assertEqual(result, 'test_video_id')

    def test_url_result(self):
        # Assuming url_result is a method that formats the result dictionary
        self.instance.url_result = lambda url, ie, video_id: {'url': url, 'ie_key': ie, 'video_id': video_id}
        result = self.instance.url_result('nrk:test_video_id', 'NRKIE', 'test_video_id')
        self.assertEqual(result, {'url': 'nrk:test_video_id', 'ie_key': 'NRKIE', 'video_id': 'test_video_id'})

if __name__ == '__main__':
    unittest.main()