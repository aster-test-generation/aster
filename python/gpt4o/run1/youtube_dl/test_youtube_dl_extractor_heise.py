import unittest
from youtube_dl.extractor.heise import HeiseIE
from youtube_dl.extractor.kaltura import KalturaIE
from youtube_dl.extractor.youtube import YoutubeIE
from youtube_dl.utils import NO_DEFAULT


class TestHeiseIE(unittest.TestCase):
    def setUp(self):
        self.ie = HeiseIE()

    def test__real_extract(self):
        url = 'http://www.heise.de/video/artikel/Podcast-c-t-uplink-3-3-Owncloud-Tastaturen-Peilsender-Smartphone-2404147.html'
        result = self.ie._real_extract(url).to_screen()
        self.assertEqual(result['id'], '1_kkrq94sm')
        self.assertEqual(result['ext'], 'mp4')
        self.assertEqual(result['title'], "Podcast: c't uplink 3.3 – Owncloud / Tastaturen / Peilsender Smartphone")
        self.assertEqual(result['timestamp'], 1512734959)
        self.assertEqual(result['upload_date'], '20171208')
        self.assertEqual(result['description'], 'md5:c934cbfb326c669c2bcabcbe3d3fcd20')

    def test_extract_title(self):
        url = 'http://www.heise.de/video/artikel/Podcast-c-t-uplink-3-3-Owncloud-Tastaturen-Peilsender-Smartphone-2404147.html'
        webpage = self.ie._download_webpage(url, '1_kkrq94sm', fatal=False)
        title = self.ie._HeiseIE__extract_title(webpage, default=NO_DEFAULT)
        self.assertEqual(title, "Podcast: c't uplink 3.3 – Owncloud / Tastaturen / Peilsender Smartphone")

    def test_make_kaltura_result(self):
        url = 'http://www.heise.de/video/artikel/Podcast-c-t-uplink-3-3-Owncloud-Tastaturen-Peilsender-Smartphone-2404147.html'
        kaltura_url = 'kaltura:2238431:1_kkrq94sm'
        result = self.ie._make_kaltura_result(kaltura_url, url, 'Test Title', 'Test Description')
        self.assertEqual(result['_type'], 'url_transparent')
        self.assertEqual(result['url'], 'kaltura:2238431:1_kkrq94sm')
        self.assertEqual(result['ie_key'], KalturaIE.ie_key())
        self.assertEqual(result['title'], 'Test Title')
        self.assertEqual(result['description'], 'Test Description')

    def test_str_method(self):
        result = str(self.ie)
        self.assertTrue(result.startswith('<youtube_dl.extractor.heise.HeiseIE object at'))

    def test_repr_method(self):
        result = repr(self.ie)
        self.assertTrue(result.startswith('<youtube_dl.extractor.heise.HeiseIE object at'))

if __name__ == '__main__':
    unittest.main()