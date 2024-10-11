from youtube_dl.extractor.konserthusetplay import InfoExtractor
import unittest
from youtube_dl.extractor.konserthusetplay import KonserthusetPlayIE


class TestKonserthusetPlayIE(unittest.TestCase):
    def test_init(self):
        instance = KonserthusetPlayIE()
        self.assertIsInstance(instance, InfoExtractor)

    def test_valid_url(self):
        instance = KonserthusetPlayIE()
        url = 'http://www.konserthusetplay.se/?m=CKDDnlCY-dhWAAqiMERd-A'
        self.assertTrue(instance.suitable(url))

    def test_real_extract(self):
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

    def test_match_id(self):
        instance = KonserthusetPlayIE()
        url = 'http://www.konserthusetplay.se/?m=CKDDnlCY-dhWAAqiMERd-A'
        result = instance._match_id(url)
        self.assertEqual(result, 'CKDDnlCY-dhWAAqiMERd-A')

    def test_download_webpage(self):
        instance = KonserthusetPlayIE()
        url = 'http://www.konserthusetplay.se/?m=CKDDnlCY-dhWAAqiMERd-A'
        result = instance._download_webpage(url, 'CKDDnlCY-dhWAAqiMERd-A')
        self.assertIsInstance(result, str)

    def test_search_regex(self):
        instance = KonserthusetPlayIE()
        webpage = '<html>e=1234567890</html>'
        result = instance._search_regex(r'e=(.+?)[&"\']', webpage, 'e')
        self.assertEqual(result, '1234567890')

    def test_download_json(self):
        instance = KonserthusetPlayIE()
        url = 'http://csp.picsearch.com/rest?e=1234567890&containerId=mediaplayer&i=object'
        result = instance._download_json(url, 'CKDDnlCY-dhWAAqiMERd-A')
        self.assertIsInstance(result, dict)

    def test_extract_m3u8_formats(self):
        instance = KonserthusetPlayIE()
        m3u8_url = 'http://example.com/m3u8'
        result = instance._extract_m3u8_formats(m3u8_url, 'CKDDnlCY-dhWAAqiMERd-A', 'mp4', entry_protocol='m3u8_native', m3u8_id='hls', fatal=False)
        self.assertIsInstance(result, list)

    def test_sort_formats(self):
        instance = KonserthusetPlayIE()
        formats = [{'format_id': 'a', 'width': 100}, {'format_id': 'b', 'width': 200}]
        instance._sort_formats(formats)
        self.assertEqual(formats, [{'format_id': 'b', 'width': 200}, {'format_id': 'a', 'width': 100}])

    def test_str(self):
        instance = KonserthusetPlayIE()
        result = instance.__str__()
        self.assertEqual(result, 'KonserthusetPlayIE')

    def test_repr(self):
        instance = KonserthusetPlayIE()
        result = instance.__repr__()
        self.assertEqual(result, 'KonserthusetPlayIE()')

if __name__ == '__main__':
    unittest.main()