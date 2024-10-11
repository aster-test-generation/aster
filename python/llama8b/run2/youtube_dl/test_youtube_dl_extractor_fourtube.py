import unittest
from youtube_dl.extractor.fourtube import FourTubeBaseIE, FourTubeIE, FuxIE, PornTubeIE, PornerBrosIE
from youtube_dl.utils import compat_str, str_or_none, int_or_none, try_get, unified_timestamp, url_or_non


class TestFourTubeBaseIE(unittest.TestCase):
    def test__real_extract(self):
        ie = FourTubeBaseIE()
        url = 'http://www.4tube.com/videos/209733/hot-babe-holly-michaels-gets-her-ass-stuffed-by-black'
        result = ie._real_extract(url)
        self.assertEqual(result['id'], '209733')
        self.assertEqual(result['title'], 'Hot Babe Holly Michaels gets her ass stuffed by black')
        self.assertEqual(result['uploader'], 'WCP Club')
        self.assertEqual(result['uploader_id'], 'wcp-club')
        self.assertEqual(result['upload_date'], '20131031')
        self.assertEqual(result['timestamp'], 1383263892)
        self.assertEqual(result['duration'], 583)
        self.assertEqual(result['view_count'], int)
        self.assertEqual(result['like_count'], int)
        self.assertEqual(result['categories'], list)
        self.assertEqual(result['age_limit'], 18)

    def test__extract_formats(self):
        ie = FourTubeBaseIE()
        url = 'http://www.4tube.com/videos/209733/hot-babe-holly-michaels-gets-her-ass-stuffed-by-black'
        video_id = '209733'
        media_id = '209733'
        sources = ['480p', '720p', '1080p']
        formats = ie._extract_formats(url, video_id, media_id, sources)
        self.assertEqual(len(formats), 3)

    def test__protected_method(self):
        ie = FourTubeBaseIE()
        url = 'http://www.4tube.com/videos/209733/hot-babe-holly-michaels-gets-her-ass-stuffed-by-black'
        result = ie._protected_method(url)
        self.assertEqual(result, 'protected method called')

    def test__private_method(self):
        ie = FourTubeBaseIE()
        url = 'http://www.4tube.com/videos/209733/hot-babe-holly-michaels-gets-her-ass-stuffed-by-black'
        result = ie.__private_method(url)
        self.assertEqual(result, 'private method called')

class TestFourTubeIE(unittest.TestCase):
    def test__real_extract(self):
        ie = FourTubeIE()
        url = 'http://www.4tube.com/videos/209733/hot-babe-holly-michaels-gets-her-ass-stuffed-by-black'
        result = ie._real_extract(url)
        self.assertEqual(result['id'], '209733')
        self.assertEqual(result['title'], 'Hot Babe Holly Michaels gets her ass stuffed by black')
        self.assertEqual(result['uploader'], 'WCP Club')
        self.assertEqual(result['uploader_id'], 'wcp-club')
        self.assertEqual(result['upload_date'], '20131031')
        self.assertEqual(result['timestamp'], 1383263892)
        self.assertEqual(result['duration'], 583)
        self.assertEqual(result['view_count'], int)
        self.assertEqual(result['like_count'], int)
        self.assertEqual(result['categories'], list)
        self.assertEqual(result['age_limit'], 18)

class TestFuxIE(unittest.TestCase):
    def test__real_extract(self):
        ie = FuxIE()
        url = 'https://www.fux.com/video/195359/awesome-fucking-kitchen-ends-cum-swallow'
        result = ie._real_extract(url)
        self.assertEqual(result['id'], '195359')
        self.assertEqual(result['title'], 'Awesome fucking in the kitchen ends with cum swallow')
        self.assertEqual(result['uploader'], 'alenci2342')
        self.assertEqual(result['uploader_id'], 'alenci2342')
        self.assertEqual(result['upload_date'], '20131230')
        self.assertEqual(result['timestamp'], 1388361660)
        self.assertEqual(result['duration'], 289)
        self.assertEqual(result['view_count'], int)
        self.assertEqual(result['like_count'], int)
        self.assertEqual(result['categories'], list)
        self.assertEqual(result['age_limit'], 18)


if __name__ == '__main__':
    unittest.main()