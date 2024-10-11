import unittest
from youtube_dl.extractor.heise import HeiseIE, KalturaIE, YoutubeIE


class TestHeiseIE(unittest.TestCase):
    def test___init__(self):
        instance = HeiseIE()
        self.assertIsInstance(instance, InfoExtractor)

    def test__VALID_URL(self):
        self.assertEqual(HeiseIE._VALID_URL, r'https?://(?:www\.)?heise\.de/(?:[^/]+/)+[^/]+-(?P<id>[0-9]+)\.html')

    def test__TESTS(self):
        self.assertEqual(len(HeiseIE._TESTS), 6)

    def test__real_extract(self):
        instance = HeiseIE()
        url = 'http://www.heise.de/video/artikel/Podcast-c-t-uplink-3-3-Owncloud-Tastaturen-Peilsender-Smartphone-2404147.html'
        result = instance._real_extract(url)
        self.assertIsInstance(result, dict)

    def test__match_id(self):
        instance = HeiseIE()
        url = 'http://www.heise.de/video/artikel/Podcast-c-t-uplink-3-3-Owncloud-Tastaturen-Peilsender-Smartphone-2404147.html'
        result = instance._match_id(url)
        self.assertEqual(result, '2404147')

    def test__download_webpage(self):
        instance = HeiseIE()
        url = 'http://www.heise.de/video/artikel/Podcast-c-t-uplink-3-3-Owncloud-Tastaturen-Peilsender-Smartphone-2404147.html'
        result = instance._download_webpage(url, '2404147')
        self.assertIsInstance(result, str)

    def test_extract_title(self):
        instance = HeiseIE()
        webpage = '<html><title>Test Title</title></html>'
        result = instance.extract_title(webpage)
        self.assertEqual(result, 'Test Title')

    def test__html_search_meta(self):
        instance = HeiseIE()
        webpage = '<html><meta property="og:title" content="Test Title"></html>'
        result = instance._html_search_meta('title', webpage)
        self.assertEqual(result, 'Test Title')

    def test__og_search_description(self):
        instance = HeiseIE()
        webpage = '<html><meta property="og:description" content="Test Description"></html>'
        result = instance._og_search_description(webpage)
        self.assertEqual(result, 'Test Description')

    def test__make_kaltura_result(self):
        instance = HeiseIE()
        kaltura_url = 'http://example.com/kaltura'
        result = instance._make_kaltura_result(kaltura_url)
        self.assertIsInstance(result, dict)

    def test__search_regex(self):
        instance = HeiseIE()
        webpage = '<html><div data-title="Test Title"></html>'
        result = instance._search_regex(r'data-title="([^"]+)"', webpage, 'title')
        self.assertEqual(result, 'Test Title')

    def test_playlist_from_matches(self):
        instance = HeiseIE()
        yt_urls = ['http://example.com/youtube1', 'http://example.com/youtube2']
        video_id = 'test_id'
        title = 'Test Title'
        result = instance.playlist_from_matches(yt_urls, video_id, title, ie='YoutubeIE')
        self.assertIsInstance(result, dict)

    def test__download_xml(self):
        instance = HeiseIE()
        url = 'http://example.com/xml'
        video_id = 'test_id'
        query = {'container': '123', 'sequenz': '456'}
        result = instance._download_xml(url, video_id, query)
        self.assertIsInstance(result, str)

    def test__sort_formats(self):
        instance = HeiseIE()
        formats = [{'url': 'http://example.com/format1', 'format_note': 'format1'}, {'url': 'http://example.com/format2', 'format_note': 'format2'}]
        instance._sort_formats(formats)
        self.assertEqual(formats, [{'url': 'http://example.com/format1', 'format_note': 'format1'}, {'url': 'http://example.com/format2', 'format_note': 'format2'}])

    def test___str__(self):
        instance = HeiseIE()
        result = instance.__str__()
        self.assertEqual(result, 'HeiseIE')

    def test___repr__(self):
        instance = HeiseIE()
        result = instance.__repr__()
        self.assertEqual(result, 'HeiseIE()')

class TestKalturaIE(unittest.TestCase):
    def test_ie_key(self):
        self.assertEqual(KalturaIE.ie_key(), 'Kaltura')

if __name__ == '__main__':
    unittest.main()