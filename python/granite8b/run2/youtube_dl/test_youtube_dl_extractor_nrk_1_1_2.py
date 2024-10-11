import unittest
from youtube_dl.extractor.nrk import NRKIE


class TestNRKIE(unittest.TestCase):
    def test_real_extract(self):
        ie = NRKIE()
        video_id = '1.234567'
        info = ie._real_extract('https://www.nrk.no/ Program/1.234567')
        self.assertEqual(info['id'], video_id)
        self.assertEqual(info['title'], 'Title')
        self.assertEqual(info['alt_title'], 'Alt Title')
        self.assertEqual(info['description'], 'Description')
        self.assertEqual(info['duration'], 123)
        self.assertEqual(info['thumbnails'], [{'url': 'http://example.com/thumbnail.jpg', 'width': 1920, 'height': 1080}])
        self.assertEqual(info['subtitles'], {'en': [{'url': 'http://example.com/subtitles.vtt'}]})
        self.assertEqual(info['age_limit'], 0)
        self.assertEqual(info['formats'], [{'url': 'http://example.com/video.mp4', 'format_id': 'mp4', 'vcodec': 'none'}])
        self.assertEqual(info['series'], 'Series')
        self.assertEqual(info['season_id'], '123456')
        self.assertEqual(info['season_number'], 1)
        self.assertEqual(info['episode'], 'Episode')
        self.assertEqual(info['episode_number'], 1)

if __name__ == '__main__':
    unittest.main()