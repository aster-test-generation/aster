import unittest
from youtube_dl.extractor.hitrecord import HitRecordIE


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

    def test_match_id(self):
        instance = HitRecordIE()
        result = instance._match_id("https://hitrecord.org/records/2954362")
        self.assertEqual(result, '2954362')

    def test_download_json(self):
        instance = HitRecordIE()
        result = instance._download_json("https://hitrecord.org/api/web/records/2954362", '2954362')
        self.assertEqual(result['title'], 'A Very Different World (HITRECORD x ACLU)')
        self.assertEqual(result['source_url']['mp4_url'], 'https://hitrecord.org/records/2954362')
        self.assertEqual(result['body'], 'md5:e62defaffab5075a5277736bead95a3d')
        self.assertEqual(result['duration'], 139.327)
        self.assertEqual(result['created_at_i'], 1471557582)
        self.assertEqual(result['total_views_count'], int)
        self.assertEqual(result['hearts_count'], int)
        self.assertEqual(result['comments_count'], int)
        self.assertEqual(result['tags'], list)

if __name__ == '__main__':
    unittest.main()