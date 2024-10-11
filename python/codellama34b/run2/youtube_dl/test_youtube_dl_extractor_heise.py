import unittest
from youtube_dl.extractor.heise import HeiseIE
from youtube_dl.extractor.kaltura import KalturaIE
from youtube_dl.extractor.youtube import YoutubeIE
from youtube_dl.utils import determine_ext, int_or_none, NO_DEFAULT, parse_iso8601, smuggle_url, xpath_text



class TestHeiseIE(unittest.TestCase):
    def test_real_extract(self):
        url = "https://www.heise.de/video/artikel/Podcast-c-t-uplink-3-3-Owncloud-Tastaturen-Peilsender-Smartphone-2404147.html"
        webpage = "dummy_webpage"
        video_id = "1_kkrq94sm"
        result = HeiseIE._real_extract(url, webpage)
        self.assertEqual(result['id'], "1_kkrq94sm")
        self.assertEqual(result['ext'], "mp4")
        self.assertEqual(result['title'], "Podcast: c't uplink 3.3 – Owncloud / Tastaturen / Peilsender Smartphone")
        self.assertEqual(result['timestamp'], 1512734959)
        self.assertEqual(result['upload_date'], "20171208")
        self.assertEqual(result['description'], "md5:c934cbfb326c669c2bcabcbe3d3fcd20")

    def test_extract_url(self):
        webpage = "dummy_webpage"
        result = HeiseIE._extract_urls(webpage)
        self.assertEqual(result, None)

    def test_make_kaltura_result(self):
        kaltura_url = "kaltura:2238431:1_kkrq94sm"
        title = "Podcast: c't uplink 3.3 – Owncloud / Tastaturen / Peilsender Smartphone"
        description = "md5:c934cbfb326c669c2bcabcbe3d3fcd20"
        result = HeiseIE._make_kaltura_result(kaltura_url, title, description)
        self.assertEqual(result['url'], "kaltura:2238431:1_kkrq94sm")
        self.assertEqual(result['ie_key'], "Kaltura")
        self.assertEqual(result['title'], "Podcast: c't uplink 3.3 – Owncloud / Tastaturen / Peilsender Smartphone")
        self.assertEqual(result['description'], "md5:c934cbfb326c669c2bcabcbe3d3fcd20")

    def test_search_regex(self):
        pattern = r'entry-id=(["\'])(?P<id>(?:(?!\1).)+)\1'
        webpage = "dummy_webpage"
        default = None
        group = "id"
        result = HeiseIE._search_regex(self, pattern, webpage, "kaltura id", default=default, group=group)
        self.assertEqual(result, None)

    def test_html_search_meta(self):
        webpage = "dummy_webpage"
        default = None
        result = HeiseIE._html_search_meta(webpage, ("fulltitle", "title"), default=default)
        self.assertEqual(result, None)

    def test_og_search_description(self):
        webpage = "dummy_webpage"
        default = None
        result = HeiseIE._og_search_description(webpage, default=default)
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()