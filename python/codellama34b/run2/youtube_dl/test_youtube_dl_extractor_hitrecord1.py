import unittest
from youtube_dl.extractor.hitrecord import *

class TestHitRecordIE(unittest.TestCase):
    def test_real_extract(self):
        instance = HitRecordIE()
        result = instance._real_extract("https://hitrecord.org/records/2954362")
        self.assertEqual(result['id'], '2954362')
        self.assertEqual(result['url'], 'https://hitrecord.org/records/2954362')
        self.assertEqual(result['title'], 'A Very Different World (HITRECORD x ACLU)')
        self.assertEqual(result['description'], 'md5:e62defaffab5075a5277736bead95a3d')
        self.assertEqual(result['duration'], 139.327)
        self.assertEqual(result['timestamp'], 1471557582)
        self.assertEqual(result['uploader'], 'Zuzi.C12')
        self.assertEqual(result['uploader_id'], '362811')
        self.assertEqual(result['view_count'], int)
        self.assertEqual(result['like_count'], int)
        self.assertEqual(result['comment_count'], int)
        self.assertEqual(result['tags'], list)

if __name__ == '__main__':
    unittest.main()