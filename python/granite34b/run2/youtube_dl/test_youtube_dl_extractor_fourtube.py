import unittest
from youtube_dl.extractor.fourtube import FourTubeBaseIE, FourTubeIE, FuxIE, PornTubeIE, PornerBrosIE


class TestFourTubeBaseIE(unittest.TestCase):
    def test_extract_formats(self):
        url = 'https://www.4tube.com/videos/209733/hot-babe-holly-michaels-gets-her-ass-stuffed-by-black'
        video_id = '209733'
        media_id = '209733'
        sources = ['360p', '480p', '720p']
        formats = FourTubeBaseIE._extract_formats(url, video_id, media_id, sources)
        self.assertEqual(len(formats), 3)
        self.assertEqual(formats[0]['format_id'], '360p')
        self.assertEqual(formats[1]['format_id'], '480p')
        self.assertEqual(formats[2]['format_id'], '720p')

    def test_real_extract(self):
        url = 'https://www.4tube.com/videos/209733/hot-babe-holly-michaels-gets-her-ass-stuffed-by-black'
        video_id = '209733'
        info_dict = FourTubeBaseIE._real_extract(self, url)
        self.assertEqual(info_dict['id'], video_id)
        self.assertEqual(info_dict['title'], 'Hot Babe Holly Michaels gets her ass stuffed by black')
        self.assertEqual(info_dict['uploader'], 'WCP Club')
        self.assertEqual(info_dict['uploader_id'], 'wcp-club')
        self.assertEqual(info_dict['upload_date'], '20131031')
        self.assertEqual(info_dict['timestamp'], 1383263892)
        self.assertEqual(info_dict['duration'], 583)
        self.assertTrue('view_count' in info_dict)
        self.assertTrue('like_count' in info_dict)
        self.assertTrue('categories' in info_dict)
        self.assertEqual(info_dict['age_limit'], 18)

class TestFourTubeIE(unittest.TestCase):
    def test_real_extract(self):
        url = 'https://www.fux.com/video/195359/awesome-fucking-kitchen-ends-cum-swallow'
        video_id = '195359'
        info_dict = FourTubeIE._real_extract(self, url)
        self.assertEqual(info_dict['id'], video_id)
        self.assertEqual(info_dict['title'], 'Awesome fucking in the kitchen ends with cum swallow')
        self.assertEqual(info_dict['uploader'], 'alenci2342')
        self.assertEqual(info_dict['uploader_id'], 'alenci2342')
        self.assertEqual(info_dict['upload_date'], '20131230')
        self.assertEqual(info_dict['timestamp'], 1388361660)
        self.assertEqual(info_dict['duration'], 289)
        self.assertTrue('view_count' in info_dict)
        self.assertTrue('like_count' in info_dict)
        self.assertTrue('categories' in info_dict)
        self.assertEqual(info_dict['age_limit'], 18)


if __name__ == '__main__':
    unittest.main()