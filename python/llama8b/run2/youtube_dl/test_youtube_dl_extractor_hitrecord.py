import unittest
from youtube_dl.extractor.hitrecord import HitRecordIE


class TestHitRecordIE(unittest.TestCase):
    def test_valid_url(self):
        ie = HitRecordIE()
        result = ie._real_extract('https://hitrecord.org/records/2954362')
        self.assertIn('id', result)
        self.assertIn('url', result)
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

    def test_invalid_url(self):
        ie = HitRecordIE()
        with self.assertRaises(KeyError):
            ie._real_extract('https://hitrecord.org/records/invalid')

    def test_private_method(self):
        ie = HitRecordIE()
        result = ie._HitRecordIE__real_extract('https://hitrecord.org/records/2954362')
        self.assertIn('id', result)
        self.assertIn('url', result)
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

    def test_str_method(self):
        ie = HitRecordIE()
        result = str(ie)
        self.assertEqual(result, 'youtube_dl.extractor.hitrecord.HitRecordIE')

    def test_repr_method(self):
        ie = HitRecordIE()
        result = repr(ie)
        self.assertEqual(result, 'youtube_dl.extractor.hitrecord.HitRecordIE()')

if __name__ == '__main__':
    unittest.main()