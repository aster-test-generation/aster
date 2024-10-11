import unittest
from youtube_dl.extractor.hitrecord import HitRecordIE


class TestHitRecordIE(unittest.TestCase):
    def test_real_extract(self):
        ie = HitRecordIE()
        video_id = '2954362'
        video_url = 'https://hitrecord.org/records/2954362'
        expected_info_dict = {
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
        info_dict = ie._real_extract(video_url)
        self.assertEqual(info_dict['id'], expected_info_dict['id'])
        self.assertEqual(info_dict['ext'], expected_info_dict['ext'])
        self.assertEqual(info_dict['title'], expected_info_dict['title'])
        self.assertEqual(info_dict['description'], expected_info_dict['description'])
        self.assertEqual(info_dict['duration'], expected_info_dict['duration'])
        self.assertEqual(info_dict['timestamp'], expected_info_dict['timestamp'])
        self.assertEqual(info_dict['upload_date'], expected_info_dict['upload_date'])
        self.assertEqual(info_dict['uploader'], expected_info_dict['uploader'])
        self.assertEqual(info_dict['uploader_id'], expected_info_dict['uploader_id'])
        self.assertIsInstance(info_dict['view_count'], int)
        self.assertIsInstance(info_dict['like_count'], int)
        self.assertIsInstance(info_dict['comment_count'], int)
        self.assertIsInstance(info_dict['tags'], list)

if __name__ == '__main__':
    unittest.main()