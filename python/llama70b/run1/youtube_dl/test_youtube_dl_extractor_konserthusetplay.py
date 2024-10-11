from youtube_dl.extractor.konserthusetplay import InfoExtractor
import unittest
from youtube_dl.extractor.konserthusetplay import KonserthusetPlayIE


class TestKonserthusetPlayIE(unittest.TestCase):
    def test___init__(self):
        instance = KonserthusetPlayIE()
        self.assertIsInstance(instance, InfoExtractor)

    def test__VALID_URL(self):
        self.assertEqual(KonserthusetPlayIE._VALID_URL, r'https?://(?:www\.)?(?:konserthusetplay|rspoplay)\.se/\?.*\bm=(?P<id>[^&]+)')

    def test__TESTS(self):
        self.assertEqual(len(KonserthusetPlayIE._TESTS), 2)

    def test__real_extract(self):
        instance = KonserthusetPlayIE()
        url = 'http://www.konserthusetplay.se/?m=CKDDnlCY-dhWAAqiMERd-A'
        result = instance._real_extract(url)
        self.assertIsInstance(result, dict)
        self.assertIn('id', result)
        self.assertIn('title', result)
        self.assertIn('description', result)
        self.assertIn('thumbnail', result)
        self.assertIn('duration', result)
        self.assertIn('formats', result)
        self.assertIn('subtitles', result)

    def test__match_id(self):
        instance = KonserthusetPlayIE()
        url = 'http://www.konserthusetplay.se/?m=CKDDnlCY-dhWAAqiMERd-A'
        result = instance._match_id(url)
        self.assertEqual(result, 'CKDDnlCY-dhWAAqiMERd-A')

    def test__download_webpage(self):
        instance = KonserthusetPlayIE()
        url = 'http://www.konserthusetplay.se/?m=CKDDnlCY-dhWAAqiMERd-A'
        result = instance._download_webpage(url, 'CKDDnlCY-dhWAAqiMERd-A')
        self.assertIsInstance(result, str)

    def test__search_regex(self):
        instance = KonserthusetPlayIE()
        webpage = '<html>e=1234567890</html>'
        result = instance._search_regex(r'https?://csp\.picsearch\.com/rest\?.*\be=(.+?)[&"\']', webpage, 'e')
        self.assertEqual(result, '1234567890')

    def test__download_json(self):
        instance = KonserthusetPlayIE()
        url = 'http://csp.picsearch.com/rest?e=1234567890&containerId=mediaplayer&i=object'
        result = instance._download_json(url, 'CKDDnlCY-dhWAAqiMERd-A', transform_source=lambda s: s[s.index('{'):s.rindex('}') + 1])
        self.assertIsInstance(result, dict)

    def test__extract_m3u8_formats(self):
        instance = KonserthusetPlayIE()
        m3u8_url = 'http://example.com/m3u8'
        result = instance._extract_m3u8_formats(m3u8_url, 'CKDDnlCY-dhWAAqiMERd-A', 'mp4', entry_protocol='m3u8_native', m3u8_id='hls', fatal=False)
        self.assertIsInstance(result, list)

    def test__sort_formats(self):
        instance = KonserthusetPlayIE()
        formats = [{'url': 'http://example.com/1'}, {'url': 'http://example.com/2'}]
        instance._sort_formats(formats)
        self.assertEqual(formats, [{'url': 'http://example.com/1'}, {'url': 'http://example.com/2'}])

    def test___str__(self):
        instance = KonserthusetPlayIE()
        result = instance.__str__()
        self.assertEqual(result, 'KonserthusetPlayIE')

    def test___repr__(self):
        instance = KonserthusetPlayIE()
        result = instance.__repr__()
        self.assertEqual(result, 'KonserthusetPlayIE()')

if __name__ == '__main__':
    unittest.main()