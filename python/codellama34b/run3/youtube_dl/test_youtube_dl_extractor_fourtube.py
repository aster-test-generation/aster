import unittest
from youtube_dl.extractor.fourtube import FourTubeBaseIE, FourTubeIE, FuxIE, PornTubeIE, PornerBrosIE



class TestFourTubeBaseIE(unittest.TestCase):
    def test_extract_formats(self):
        instance = FourTubeBaseIE()
        url = "https://www.4tube.com/videos/209733/hot-babe-holly-michaels-gets-her-ass-stuffed-by-black"
        video_id = "209733"
        media_id = "123456"
        sources = ["1080p", "720p", "480p"]
        result = instance._extract_formats(url, video_id, media_id, sources)
        self.assertEqual(result, [{'url': '123456', 'format_id': '1080p', 'resolution': '1080p', 'quality': 1080}, {'url': '123456', 'format_id': '720p', 'resolution': '720p', 'quality': 720}, {'url': '123456', 'format_id': '480p', 'resolution': '480p', 'quality': 480}])

if __name__ == '__main__':
    unittest.main()