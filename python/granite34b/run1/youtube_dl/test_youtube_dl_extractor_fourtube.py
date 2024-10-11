import unittest
from youtube_dl.extractor.fourtube import FourTubeBaseIE, FourTubeIE, FuxIE, PornTubeIE, PornerBrosIE


class TestFourTubeBaseIE(unittest.TestCase):
    def test_extract_formats(self):
        url = 'https://www.4tube.com/videos/209733/hot-babe-holly-michaels-gets-her-ass-stuffed-by-black'
        video_id = '209733'
        media_id = '209733'
        sources = ['1080p', '720p', '480p', '360p']
        formats = FourTubeBaseIE._extract_formats(url, video_id, media_id, sources, None)
        self.assertEqual(len(formats), 4)
        for format in formats:
            self.assertTrue('url' in format and 'format_id' in format and 'resolution' in format and 'quality' in format)

    def test_real_extract(self):
        url = 'https://www.4tube.com/videos/209733/hot-babe-holly-michaels-gets-her-ass-stuffed-by-black'
        video_id = '209733'
        info_dict = FourTubeBaseIE._real_extract(self, url)
        self.assertEqual(info_dict['id'], video_id)
        self.assertTrue('formats' in info_dict and 'categories' in info_dict and 'thumbnail' in info_dict and 'uploader' in info_dict and 'uploader_id' in info_dict and 'timestamp' in info_dict and 'duration' in info_dict and 'age_limit' in info_dict)

class TestFourTubeIE(unittest.TestCase):
    def test_real_extract(self):
        url = 'https://www.4tube.com/videos/209733/hot-babe-holly-michaels-gets-her-ass-stuffed-by-black'
        video_id = '209733'
        info_dict = FourTubeIE._real_extract(self, url)
        self.assertEqual(info_dict['id'], video_id)
        self.assertTrue('formats' in info_dict and 'categories' in info_dict and 'thumbnail' in info_dict and 'uploader' in info_dict and 'uploader_id' in info_dict and 'timestamp' in info_dict and 'duration' in info_dict and 'age_limit' in info_dict)

class TestFuxIE(unittest.TestCase):
    def test_real_extract(self):
        url = 'https://www.fux.com/video/195359/awesome-fucking-kitchen-ends-cum-swallow'
        video_id = '195359'
        info_dict = FuxIE._real_extract(self, url)
        self.assertEqual(info_dict['id'], video_id)
        self.assertTrue('formats' in info_dict and 'categories' in info_dict and 'thumbnail' in info_dict and 'uploader' in info_dict and 'uploader_id' in info_dict and 'timestamp' in info_dict and 'duration' in info_dict and 'age_limit' in info_dict)

class TestPornTubeIE(unittest.TestCase):
    def test_real_extract(self):
        url = 'https://www.porntube.com/videos/teen-couple-doing-anal_7089759'
        video_id = '7089759'
        info_dict = PornTubeIE._real_extract('http://www.pornhub.com/view_video.php?viewkey=ph5c93e5a43af96')
        self.assertEqual(info_dict['id'], video_id)
        self.assertTrue('formats' in info_dict and 'thumbnail' in info_dict and 'uploader' in info_dict and 'uploader_id' in info_dict and 'channel' in info_dict and 'channel_id' in info_dict and 'timestamp' in info_dict and 'duration' in info_dict and 'age_limit' in info_dict)


if __name__ == '__main__':
    unittest.main()