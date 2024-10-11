import unittest
from youtube_dl.extractor.fourtube import *



class TestFourTubeBaseIE(unittest.TestCase):
    def test_extract_formats(self):
        instance = FourTubeBaseIE()
        url = "https://www.4tube.com/videos/209733/hot-babe-holly-michaels-gets-her-ass-stuffed-by-black"
        video_id = "209733"
        media_id = "123"
        sources = ["1080p", "720p", "480p", "360p"]
        result = instance._extract_formats(url, video_id, media_id, sources)
        self.assertEqual(result, [{'url': '123', 'format_id': '1080p', 'resolution': '1080p', 'quality': 1080}, {'url': '123', 'format_id': '720p', 'resolution': '720p', 'quality': 720}, {'url': '123', 'format_id': '480p', 'resolution': '480p', 'quality': 480}, {'url': '123', 'format_id': '360p', 'resolution': '360p', 'quality': 360}])

    def test_real_extract(self):
        instance = FourTubeBaseIE()
        url = "https://www.4tube.com/videos/209733/hot-babe-holly-michaels-gets-her-ass-stuffed-by-black"
        video_id = "209733"
        display_id = "hot-babe-holly-michaels-gets-her-ass-stuffed-by-black"
        result = instance._real_extract(url)
        self.assertEqual(result, {'id': '209733', 'title': 'Hot Babe Holly Michaels gets her ass stuffed by black', 'formats': [{'url': '123', 'format_id': '1080p', 'resolution': '1080p', 'quality': 1080}, {'url': '123', 'format_id': '720p', 'resolution': '720p', 'quality': 720}, {'url': '123', 'format_id': '480p', 'resolution': '480p', 'quality': 480}, {'url': '123', 'format_id': '360p', 'resolution': '360p', 'quality': 360}], 'categories': ['Categories', 'Tags'], 'thumbnail': 'https://www.4tube.com/videos/209733/hot-babe-holly-michaels-gets-her-ass-stuffed-by-black', 'uploader': 'WCP Club', 'uploader_id': 'wcp-club', 'timestamp': 1383263892, 'like_count': 123, 'view_count': 123, 'duration': 583, 'age_limit': 18})


if __name__ == '__main__':
    unittest.main()