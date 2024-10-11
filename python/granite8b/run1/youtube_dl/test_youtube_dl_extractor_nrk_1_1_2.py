import unittest
from youtube_dl.extractor.nrk import NRKIE


class TestNRKIE(unittest.TestCase):
    def test_real_extract(self):
        ie = NRKIE()
        video_id = '1.1331613'
        info = ie._real_extract('https://www.nrk.no/ Program/1.1331613/siste-oppdatering')
        self.assertEqual(info['id'], video_id)
        self.assertEqual(info['title'], 'Siste oppdatering')
        self.assertEqual(info['duration'], 10)
        self.assertEqual(info['formats'][0]['url'], 'https://aksecure.nrk.no/p/1.1331613/1.1331613.mp4')
        self.assertEqual(info['thumbnails'][0]['url'], 'https://example.com/thumbnail.jpg')
        self.assertEqual(info['subtitles']['nb'][0]['url'], 'https://example.com/subtitles.vtt')

if __name__ == '__main__':
    unittest.main()