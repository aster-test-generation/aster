import unittest
from youtube_dl.extractor.hitrecord import HitRecordIE


class TestHitRecordIE(unittest.TestCase):
    def test_valid_url(self):
        ie = HitRecordIE()
        self.assertTrue(ie._VALID_URL.match('https://hitrecord.org/records/12345'))

    def test_invalid_url(self):
        ie = HitRecordIE()
        self.assertFalse(ie._VALID_URL.match('https://example.com'))

    def test_real_extract(self):
        ie = HitRecordIE()
        video_id = '2954362'
        video = ie._download_json(
            'https://hitrecord.org/api/web/records/%s' % video_id, video_id)
        self.assertEqual(video['title'], 'A Very Different World (HITRECORD x ACLU)')
        self.assertEqual(video['source_url']['mp4_url'], 'some_video_url')

    def test_real_extract_missing_video(self):
        ie = HitRecordIE()
        video_id = 'non_existent_video_id'
        with self.assertRaises(Exception):
            ie._download_json(
                'https://hitrecord.org/api/web/records/%s' % video_id, video_id)

    def test_real_extract_invalid_video(self):
        ie = HitRecordIE()
        video_id = 'invalid_video_id'
        with self.assertRaises(Exception):
            ie._download_json(
                'https://hitrecord.org/api/web/records/%s' % video_id, video_id)

    def test_real_extract_tags(self):
        ie = HitRecordIE()
        video_id = '2954362'
        video = ie._download_json(
            'https://hitrecord.org/api/web/records/%s' % video_id, video_id)
        tags = [
            t['text']
            for t in video.get('tags', [])
            if isinstance(t, dict) and t.get('text')
            and isinstance(t['text'], str)]
        self.assertEqual(tags, ['some_tag', 'another_tag'])

    def test_real_extract_missing_tags(self):
        ie = HitRecordIE()
        video_id = '2954362'
        video = ie._download_json(
            'https://hitrecord.org/api/web/records/%s' % video_id, video_id)
        tags = video.get('tags', [])
        self.assertEqual(tags, [])

    def test_real_extract_invalid_tags(self):
        ie = HitRecordIE()
        video_id = '2954362'
        video = ie._download_json(
            'https://hitrecord.org/api/web/records/%s' % video_id, video_id)
        tags = [
            t
            for t in video.get('tags', [])
            if isinstance(t, dict) and t.get('text')
            and isinstance(t['text'], str)]
        self.assertEqual(tags, [])

if __name__ == '__main__':
    unittest.main()