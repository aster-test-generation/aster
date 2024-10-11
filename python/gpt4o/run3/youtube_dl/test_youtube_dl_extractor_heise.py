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
        result = self.ie._real_extract(url)
        self.assertEqual(result['id'], '1_kkrq94sm')
        self.assertEqual(result['ext'], 'mp4')
        self.assertEqual(result['title'], "Podcast: c't uplink 3.3 – Owncloud / Tastaturen / Peilsender Smartphone")
        self.assertEqual(result['timestamp'], 1512734959)
        self.assertEqual(result['upload_date'], '20171208')
        self.assertEqual(result['description'], 'md5:c934cbfb326c669c2bcabcbe3d3fcd20')

    def test__match_id(self):
        url = 'http://www.heise.de/video/artikel/Podcast-c-t-uplink-3-3-Owncloud-Tastaturen-Peilsender-Smartphone-2404147.html'
        video_id = self.ie._match_id(url)
        self.assertEqual(video_id, '2404147')

    def test__download_webpage(self):
        url = 'http://www.heise.de/video/artikel/Podcast-c-t-uplink-3-3-Owncloud-Tastaturen-Peilsender-Smartphone-2404147.html'
        video_id = '2404147'
        webpage = self.ie._download_webpage(url, video_id)
        self.assertIn('<title>Podcast: c\'t uplink 3.3 – Owncloud / Tastaturen / Peilsender Smartphone</title>', webpage)

    def test__html_search_meta(self):
        webpage = '<meta name="description" content="Test description">'
        description = self.ie._html_search_meta('description', webpage)
        self.assertEqual(description, 'Test description')

    def test__search_regex(self):
        webpage = '<div class="videoplayerjw" data-title="Test title">'
        title = self.ie._search_regex(r'data-title="([^"]+)"', webpage, 'title')
        self.assertEqual(title, 'Test title')

    def test__og_search_description(self):
        webpage = '<meta property="og:description" content="Test OG description">'
        description = self.ie._og_search_description(webpage)
        self.assertEqual(description, 'Test OG description')

    def test__make_kaltura_result(self):
        kaltura_url = 'http://www.kaltura.com/test'
        result = self.ie._make_kaltura_result(kaltura_url)
        self.assertEqual(result['_type'], 'url_transparent')
        self.assertEqual(result['url'], kaltura_url)
        self.assertEqual(result['ie_key'], KalturaIE.ie_key())

    def test__sort_formats(self):
        formats = [
            {'url': 'http://test.com/video.mp4', 'format_note': '720p', 'format_id': 'mp4_720p', 'height': 720},
            {'url': 'http://test.com/video.mp4', 'format_note': '480p', 'format_id': 'mp4_480p', 'height': 480},
        ]
        self.ie._sort_formats(formats)
        self.assertEqual(formats[0]['height'], 720)
        self.assertEqual(formats[1]['height'], 480)

    def test__download_xml(self):
        url = 'http://www.heise.de/videout/feed'
        video_id = '2404147'
        doc = self.ie._download_xml(url, video_id, query={'container': '123', 'sequenz': '456'})
        self.assertIsNotNone(doc)

    def test__html_search_regex(self):
        webpage = '<h1 class="article_page_title">Test HTML title</h1>'
        title = self.ie._html_search_regex(r'<h1[^>]+\bclass=["\']article_page_title[^>]+>(.+?)<', webpage, 'title')
        self.assertEqual(title, 'Test HTML title')

    def test__html_search_meta_default(self):
        webpage = '<meta name="description" content="Test description">'
        description = self.ie._html_search_meta('description', webpage, default='Default description')
        self.assertEqual(description, 'Test description')

    def test__html_search_meta_no_default(self):
        webpage = '<meta name="description" content="Test description">'
        description = self.ie._html_search_meta('description', webpage, default=NO_DEFAULT)
        self.assertEqual(description, 'Test description')

if __name__ == '__main__':
    unittest.main()