import unittest
from youtube_dl.extractor.hitrecord import HitRecordIE


class TestHitRecordIE(unittest.TestCase):
    def test_valid_url(self):
        ie = HitRecordIE()
        url = 'https://hitrecord.org/records/2954362'
        self.assertTrue(ie._VALID_URL.match(url))

    def test_invalid_url(self):
        ie = HitRecordIE()
        url = 'https://example.com'
        self.assertFalse(ie._VALID_URL.match(url))

    def test_real_extract(self):
        ie = HitRecordIE()
        video_id = '2954362'
        video = ie._download_json(
            'https://hitrecord.org/api/web/records/%s' % video_id, video_id)
        self.assertIn('title', video)
        self.assertIn('source_url', video)
        self.assertIn('source_url', video['source_url'])
        self.assertIn('mp4_url', video['source_url'])

    def test_real_extract_video(self):
        ie = HitRecordIE()
        video_id = '2954362'
        video = ie._download_json(
            'https://hitrecord.org/api/web/records/%s' % video_id, video_id)
        title = video['title']
        video_url = video['source_url']['mp4_url']
        self.assertEqual(title, 'A Very Different World (HITRECORD x ACLU)')
        self.assertEqual(video_url, 'https://hitrecord.org/api/web/records/2954362/source_url/mp4_url')

    def test_real_extract_tags(self):
        ie = HitRecordIE()
        video_id = '2954362'
        video = ie._download_json(
            'https://hitrecord.org/api/web/records/%s' % video_id, video_id)
        tags_list = try_get(video, lambda x: x['tags'], list)
        if tags_list:
            tags = [
                t['text']
                for t in tags_list
                if isinstance(t, dict) and t.get('text')
                and isinstance(t['text'], str)]
            self.assertEqual(tags, ['HITRECORD', 'ACLU', 'Music', 'Film', 'Video'])

    def test_real_extract_duration(self):
        ie = HitRecordIE()
        video_id = '2954362'
        video = ie._download_json(
            'https://hitrecord.org/api/web/records/%s' % video_id, video_id)
        duration = float_or_none(video.get('duration'), 1000)
        self.assertEqual(duration, 139.327)

    def test_real_extract_timestamp(self):
        ie = HitRecordIE()
        video_id = '2954362'
        video = ie._download_json(
            'https://hitrecord.org/api/web/records/%s' % video_id, video_id)
        timestamp = int_or_none(video.get('created_at_i'))
        self.assertEqual(timestamp, 1471557582)

    def test_real_extract_uploader(self):
        ie = HitRecordIE()
        video_id = '2954362'
        video = ie._download_json(
            'https://hitrecord.org/api/web/records/%s' % video_id, video_id)
        uploader = try_get(
            video, lambda x: x['user']['username'], str)
        self.assertEqual(uploader, 'Zuzi.C12')

    def test_real_extract_uploader_id(self):
        ie = HitRecordIE()
        video_id = '2954362'
        video = ie._download_json(
            'https://hitrecord.org/api/web/records/%s' % video_id, video_id)
        uploader_id = try_get(
            video, lambda x: str(x['user']['id']))
        self.assertEqual(uploader_id, '362811')

    def test_real_extract_view_count(self):
        ie = HitRecordIE()
        video_id = '2954362'
        video = ie._download_json(
            'https://hitrecord.org/api/web/records/%s' % video_id, video_id)
        view_count = int_or_none(video.get('total_views_count'))
        self.assertEqual(view_count, 1)

    def test_real_extract_like_count(self):
        ie = HitRecordIE()
        video_id = '2954362'
        video = ie._download_json(
            'https://hitrecord.org/api/web/records/%s' % video_id, video_id)
        like_count = int_or_none(video.get('hearts_count'))
        self.assertEqual(like_count, 1)

if __name__ == '__main__':
    unittest.main()