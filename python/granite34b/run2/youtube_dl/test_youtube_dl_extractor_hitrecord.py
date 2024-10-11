import unittest
from youtube_dl.extractor.hitrecord import HitRecordIE


class TestHitRecordIE(unittest.TestCase):
    def test_real_extract(self):
        ie = HitRecordIE()
        video = {
            'title': 'A Very Different World (HITRECORD x ACLU)',
            'source_url': {'mp4_url': 'https://example.com/video.mp4'},
            'body': 'This is a test description',
            'duration': 139.327,
            'created_at_i': 1471557582,
            'user': {'username': 'Zuzi.C12', 'id': 362811},
            'total_views_count': 1000,
            'hearts_count': 500,
            'comments_count': 200,
            'tags': [{'text': 'tag1'}, {'text': 'tag2'}]
        }
        result = ie._real_extract(video)
        self.assertEqual(result['id'], '2954362')
        self.assertEqual(result['url'], 'https://example.com/video.mp4')
        self.assertEqual(result['title'], 'A Very Different World (HITRECORD x ACLU)')
        self.assertEqual(result['description'], 'This is a test description')
        self.assertEqual(result['duration'], 139.327)
        self.assertEqual(result['timestamp'], 1471557582)
        self.assertEqual(result['uploader'], 'Zuzi.C12')
        self.assertEqual(result['uploader_id'], '362811')
        self.assertEqual(result['view_count'], 1000)
        self.assertEqual(result['like_count'], 500)
        self.assertEqual(result['comment_count'], 200)
        self.assertEqual(result['tags'], ['tag1', 'tag2'])

if __name__ == '__main__':
    unittest.main()