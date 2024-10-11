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

    def test_extract_title(self):
        instance = HeiseIE()
        webpage = '<html><head><title>Test Title</title></head><body></body></html>'
        title = instance.extract_title(webpage)
        self.assertEqual(title, 'Test Title')

    def test__make_kaltura_result(self):
        instance = HeiseIE()
        kaltura_url = 'https://example.com/kaltura'
        result = instance._make_kaltura_result(kaltura_url)
        self.assertIsInstance(result, dict)

    def test__search_regex(self):
        instance = HeiseIE()
        webpage = '<html><body>Test regex <div id="test">123</div></body></html>'
        result = instance._search_regex(r'<div id="test">([0-9]+)</div>', webpage, 'test', default=None)
        self.assertEqual(result, '123')

    def test__html_search_meta(self):
        instance = HeiseIE()
        webpage = '<html><head><meta name="title" content="Test Title"></head><body></body></html>'
        result = instance._html_search_meta('title', webpage, default=None)
        self.assertEqual(result, 'Test Title')

    def test__og_search_description(self):
        instance = HeiseIE()
        webpage = '<html><head><meta property="og:description" content="Test Description"></head><body></body></html>'
        result = instance._og_search_description(webpage, default=None)
        self.assertEqual(result, 'Test Description')

    def test__download_webpage(self):
        instance = HeiseIE()
        url = 'http://example.com'
        webpage = instance._download_webpage(url, 'test')
        self.assertIsInstance(webpage, str)

    def test__download_xml(self):
        instance = HeiseIE()
        url = 'http://example.com/xml'
        doc = instance._download_xml(url, 'test', query={'test': 'test'})
        self.assertIsInstance(doc, object)

    def test__sort_formats(self):
        instance = HeiseIE()
        formats = [{'url': 'http://example.com', 'format_note': 'test'}]
        instance._sort_formats(formats)
        self.assertEqual(formats, [{'url': 'http://example.com', 'format_note': 'test'}])

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

    def test__extract_url(self):
        instance = KalturaIE()
        webpage = '<html><body><script src="https://example.com/kaltura"></script></body></html>'
        result = instance._extract_url(webpage)
        self.assertEqual(result, 'https://example.com/kaltura')

class TestYoutubeIE(unittest.TestCase):
    def test_ie_key(self):
        self.assertEqual(YoutubeIE.ie_key(), 'Youtube')

    def test__extract_urls(self):
        instance = YoutubeIE()
        webpage = '<html><body><iframe src="https://www.youtube.com/watch?v=test"></iframe></body></html>'
        result = instance._extract_urls(webpage)
        self.assertEqual(result, ['https://www.youtube.com/watch?v=test'])

if __name__ == '__main__':
    unittest.main()