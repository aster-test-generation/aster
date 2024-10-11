import unittest
from youtube_dl.extractor.hitrecord import HitRecordIE, InfoExtractor


class TestHitRecordIE(unittest.TestCase):
    def test_init(self):
        instance = HitRecordIE()
        self.assertIsInstance(instance, InfoExtractor)

    def test_valid_url(self):
        instance = HitRecordIE()
        url = 'https://hitrecord.org/records/2954362'
        self.assertTrue(instance.suitable(url))

    def test_real_extract(self):
        instance = HitRecordIE()
        url = 'https://hitrecord.org/records/2954362'
        result = instance._real_extract(url)
        self.assertIsInstance(result, dict)
        self.assertIn('id', result)
        self.assertIn('title', result)
        self.assertIn('description', result)
        self.assertIn('duration', result)
        self.assertIn('timestamp', result)
        self.assertIn('uploader', result)
        self.assertIn('uploader_id', result)
        self.assertIn('view_count', result)
        self.assertIn('like_count', result)
        self.assertIn('comment_count', result)
        self.assertIn('tags', result)

    def test_match_id(self):
        instance = HitRecordIE()
        url = 'https://hitrecord.org/records/2954362'
        result = instance._match_id(url)
        self.assertEqual(result, '2954362')

    def test_download_json(self):
        instance = HitRecordIE()
        video_id = '2954362'
        result = instance._download_json('https://hitrecord.org/api/web/records/%s' % video_id, video_id)
        self.assertIsInstance(result, dict)

    def test_str_method(self):
        instance = HitRecordIE()
        result = instance.__str__()
        self.assertIsInstance(result, str)

    def test_repr_method(self):
        instance = HitRecordIE()
        result = instance.__repr__()
        self.assertIsInstance(result, str)

    def test_eq_method(self):
        instance1 = HitRecordIE()
        instance2 = HitRecordIE()
        self.assertTrue(instance1 == instance2)

if __name__ == '__main__':
    unittest.main()