import unittest
from youtube_dl.extractor.hitrecord import HitRecordIE, InfoExtractor


class TestHitRecordIE(unittest.TestCase):
    def test___init__(self):
        instance = HitRecordIE()
        self.assertIsInstance(instance, InfoExtractor)

    def test__VALID_URL(self):
        self.assertEqual(HitRecordIE._VALID_URL, r'https?://(?:www\.)?hitrecord\.org/records/(?P<id>\d+)')

    def test__TEST(self):
        self.assertEqual(HitRecordIE._TEST, {
            'url': 'https://hitrecord.org/records/2954362',
            'md5': 'fe1cdc2023bce0bbb95c39c57426aa71',
            'info_dict': {
                'id': '2954362',
                'ext': 'mp4',
                'title': 'A Very Different World (HITRECORD x ACLU)',
                'description': 'md5:e62defaffab5075a5277736bead95a3d',
                'duration': 139.327,
                'timestamp': 1471557582,
                'upload_date': '20160818',
                'uploader': 'Zuzi.C12',
                'uploader_id': '362811',
                'view_count': int,
                'like_count': int,
                'comment_count': int,
                'tags': list,
            }
        })

    def test_real_extract(self):
        instance = HitRecordIE()
        url = 'https://hitrecord.org/records/2954362'
        result = instance._real_extract(url)
        self.assertIsInstance(result, dict)
        self.assertIn('id', result)
        self.assertIn('url', result)
        self.assertIn('title', result)
        self.assertIn('description', result)
        self.assertIn('duration', result)
        self.assertIn('timestamp', result)
        self.assertIn('upload_date', result)
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
        url = 'https://hitrecord.org/api/web/records/2954362'
        video_id = '2954362'
        result = instance._download_json(url, video_id)
        self.assertIsInstance(result, dict)

    def test___str__(self):
        instance = HitRecordIE()
        result = instance.__str__()
        self.assertEqual(result, 'HitRecordIE')

    def test___repr__(self):
        instance = HitRecordIE()
        result = instance.__repr__()
        self.assertEqual(result, 'HitRecordIE()')

if __name__ == '__main__':
    unittest.main()