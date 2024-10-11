import unittest
from youtube_dl.extractor.hitrecord import HitRecordIE
from youtube_dl.utils import ExtractorError


class TestHitRecordIE(unittest.TestCase):
    def setUp(self):
        self.extractor = HitRecordIE()

    def test__real_extract(self):
        url = 'https://hitrecord.org/records/2954362'
        self.extractor._download_json = lambda *args, **kwargs: {
            'title': 'A Very Different World (HITRECORD x ACLU)',
            'source_url': {'mp4_url': 'https://example.com/video.mp4'},
            'body': '<p>Description</p>',
            'duration': 139327,
            'created_at_i': 1471557582,
            'user': {'username': 'Zuzi.C12', 'id': '362811'},
            'total_views_count': 1000,
            'hearts_count': 100,
            'comments_count': 10,
            'tags': [{'text': 'tag1'}, {'text': 'tag2'}]
        }
        result = self.extractor._real_extract(url)
        self.assertEqual(result['id'], '2954362')
        self.assertEqual(result['url'], 'https://example.com/video.mp4')
        self.assertEqual(result['title'], 'A Very Different World (HITRECORD x ACLU)')
        self.assertEqual(result['description'], 'Description')
        self.assertEqual(result['duration'], 139.327)
        self.assertEqual(result['timestamp'], 1471557582)
        self.assertEqual(result['uploader'], 'Zuzi.C12')
        self.assertEqual(result['uploader_id'], '362811')
        self.assertEqual(result['view_count'], 1000)
        self.assertEqual(result['like_count'], 100)
        self.assertEqual(result['comment_count'], 10)
        self.assertEqual(result['tags'], ['tag1', 'tag2'])

    def test__real_extract_no_tags(self):
        url = 'https://hitrecord.org/records/2954362'
        self.extractor._download_json = lambda *args, **kwargs: {
            'title': 'A Very Different World (HITRECORD x ACLU)',
            'source_url': {'mp4_url': 'https://example.com/video.mp4'},
            'body': '<p>Description</p>',
            'duration': 139327,
            'created_at_i': 1471557582,
            'user': {'username': 'Zuzi.C12', 'id': '362811'},
            'total_views_count': 1000,
            'hearts_count': 100,
            'comments_count': 10,
            'tags': None
        }
        result = self.extractor._real_extract(url)
        self.assertEqual(result['tags'], None)

    def test__real_extract_invalid_url(self):
        url = 'https://hitrecord.org/records/invalid'
        self.extractor._download_json = lambda *args, **kwargs: {
            'error': 'Record not found'
        }
        with self.assertRaises(ExtractorError):
            self.assertIsNotNone(self.extractor._real_extract(url))

    def test__match_id(self):
        url = 'https://hitrecord.org/records/2954362'
        result = self.extractor._match_id(url)
        self.assertEqual(result, '2954362')

if __name__ == '__main__':
    unittest.main()