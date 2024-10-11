import unittest
from youtube_dl.extractor.nrk import NRKIE


class TestNRKTVIE(unittest.TestCase):
    def test_init(self):
        instance = NRKTVIE()
        self.assertIsInstance(instance, NRKTVIE)

    def test_real_extract(self):
        instance = NRKTVIE()
        instance._match_id = lambda url: 'test_video_id'
        instance.url_result = lambda url, ie, video_id: {'url': url, 'ie_key': ie, 'video_id': video_id}
        result = instance._real_extract('http://example.com/test_video_id')
        self.assertEqual(result, {'url': 'nrk:test_video_id', 'ie_key': 'NRKIE', 'video_id': 'test_video_id'})

    def test_protected_match_id(self):
        instance = NRKTVIE()
        instance._match_id = lambda url: 'test_video_id'
        result = instance._match_id('http://example.com/test_video_id')
        self.assertEqual(result, 'test_video_id')

    def test_protected_url_result(self):
        instance = NRKTVIE()
        result = instance.url_result('nrk:test_video_id', ie='NRKIE', video_id='test_video_id')
        self.assertEqual(result, {'url': 'nrk:test_video_id', 'ie_key': 'NRKIE', 'video_id': 'test_video_id'})

if __name__ == '__main__':
    unittest.main()