import unittest
from youtube_dl.extractor.fourtube import FourTubeBaseIE, FourTubeIE, FuxIE, PornTubeIE, PornerBrosIE


class TestFourTubeBaseIE(unittest.TestCase):
    def test__real_extract(self):
        ie = FourTubeBaseIE()
        url = 'https://www.4tube.com/videos/209733/hot-babe-holly-michaels-gets-her-ass-stuffed-by-black'
        info_dict = ie._real_extract(url)
        self.assertEqual(info_dict['id'], '209733')
        self.assertEqual(info_dict['title'], 'Hot Babe Holly Michaels gets her ass stuffed by black')
        self.assertEqual(info_dict['uploader'], 'WCP Club')
        self.assertEqual(info_dict['uploader_id'], 'wcp-club')
        self.assertEqual(info_dict['upload_date'], '20131031')
        self.assertEqual(info_dict['timestamp'], 1383263892)
        self.assertEqual(info_dict['duration'], 583)
        self.assertEqual(info_dict['view_count'], int)
        self.assertEqual(info_dict['like_count'], int)
        self.assertEqual(info_dict['categories'], list)
        self.assertEqual(info_dict['age_limit'], 18)

    def test__extract_formats(self):
        ie = FourTubeBaseIE()
        url = 'https://www.4tube.com/videos/209733/hot-babe-holly-michaels-gets-her-ass-stuffed-by-black'
        video_id = '209733'
        media_id = '209733'
        sources = ['480p', '720p', '1080p']
        formats = ie._extract_formats(url, video_id, media_id, sources)
        self.assertEqual(len(formats), 3)

class TestFourTubeIE(unittest.TestCase):
    def test__real_extract(self):
        ie = FourTubeIE()
        url = 'http://www.4tube.com/videos/209733/hot-babe-holly-michaels-gets-her-ass-stuffed-by-black'
        info_dict = ie._real_extract(url)
        self.assertEqual(info_dict['id'], '209733')
        self.assertEqual(info_dict['title'], 'Hot Babe Holly Michaels gets her ass stuffed by black')
        self.assertEqual(info_dict['uploader'], 'WCP Club')
        self.assertEqual(info_dict['uploader_id'], 'wcp-club')
        self.assertEqual(info_dict['upload_date'], '20131031')
        self.assertEqual(info_dict['timestamp'], 1383263892)
        self.assertEqual(info_dict['duration'], 583)
        self.assertEqual(info_dict['view_count'], int)
        self.assertEqual(info_dict['like_count'], int)
        self.assertEqual(info_dict['categories'], list)
        self.assertEqual(info_dict['age_limit'], 18)

class TestFuxIE(unittest.TestCase):
    def test__real_extract(self):
        ie = FuxIE()
        url = 'https://www.fux.com/video/195359/awesome-fucking-kitchen-ends-cum-swallow'
        info_dict = ie._real_extract(url)
        self.assertEqual(info_dict['id'], '195359')
        self.assertEqual(info_dict['title'], 'Awesome fucking in the kitchen ends with cum swallow')
        self.assertEqual(info_dict['uploader'], 'alenci2342')
        self.assertEqual(info_dict['uploader_id'], 'alenci2342')
        self.assertEqual(info_dict['upload_date'], '20131230')
        self.assertEqual(info_dict['timestamp'], 1388361660)
        self.assertEqual(info_dict['duration'], 289)
        self.assertEqual(info_dict['view_count'], int)
        self.assertEqual(info_dict['like_count'], int)
        self.assertEqual(info_dict['categories'], list)
        self.assertEqual(info_dict['age_limit'], 18)

class TestPornTubeIE(unittest.TestCase):
    def test__real_extract(self):
        ie = PornTubeIE()
        url = 'https://www.porntube.com/videos/teen-couple-doing-anal_7089759'
        info_dict = ie._real_extract(url)
        self.assertEqual(info_dict['id'], '7089759')
        self.assertEqual(info_dict['title'], 'Teen couple doing anal')
        self.assertEqual(info_dict['uploader'], 'Alexy')
        self.assertEqual(info_dict['uploader_id'], '91488')
        self.assertEqual(info_dict['upload_date'], '20150606')
        self.assertEqual(info_dict['timestamp'], 1433595647)
        self.assertEqual(info_dict['duration'], 5052)
        self.assertEqual(info_dict['view_count'], int)
        self.assertEqual(info_dict['like_count'], int)
        self.assertEqual(info_dict['categories'], list)
        self.assertEqual(info_dict['age_limit'], 18)


if __name__ == '__main__':
    unittest.main()