import unittest
from youtube_dl.extractor.nrk import NRKIE


class TestNRKIE(unittest.TestCase):
    def test_real_extract(self):
        ie = NRKIE()
        video_id = '1234567890'
        info = ie._real_extract('https://www.nrk.no/program/1234567890')
        self.assertEqual(info['id'], video_id)
        self.assertEqual(info['title'], 'Title of the video')
        self.assertEqual(info['alt_title'], 'Alternative title of the video')
        self.assertEqual(info['description'], 'Description of the video')
        self.assertEqual(info['duration'], 600)
        self.assertEqual(info['thumbnails'], [{'url': 'https://example.com/thumbnail.jpg', 'width': 1920, 'height': 1080}])
        self.assertEqual(info['subtitles'], {'en': [{'url': 'https://example.com/subtitles.vtt'}]})
        self.assertEqual(info['age_limit'], 0)
        self.assertEqual(info['formats'], [{'url': 'https://example.com/video.mp4', 'format_id': 'mp4', 'vcodec': 'h264'}])

if __name__ == '__main__':
    unittest.main()