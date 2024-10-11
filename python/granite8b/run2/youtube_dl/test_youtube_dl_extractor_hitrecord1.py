import unittest
from youtube_dl.extractor.hitrecord import HitRecordIE

class TestHitRecordIE(unittest.TestCase):
    def test_real_extract(self):
        ie = HitRecordIE()
        video_id = '2954362'
        video_url = 'https://hitrecord.org/records/2954362'
        expected_info_dict = {
            'id': '2954362',
            'url': 'https://hitrecord.org/records/2954362',
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
        self.assertEqual(ie._real_extract(video_url), expected_info_dict)

if __name__ == '__main__':
    unittest.main()