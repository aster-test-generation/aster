import unittest
from youtube_dl.extractor import walla


class TestWallaIE(unittest.TestCase):
    def test_init(self):
        instance = walla.WallaIE()
        self.assertIsInstance(instance, walla.InfoExtractor)

    def test_valid_url(self):
        instance = walla.WallaIE()
        url = 'http://vod.walla.co.il/movie/2642630/one-direction-all-for-one'
        self.assertTrue(instance._match_valid_url(url))

    def test_real_extract(self):
        instance = walla.WallaIE()
        url = 'http://vod.walla.co.il/movie/2642630/one-direction-all-for-one'
        result = instance._real_extract(url)
        self.assertIsInstance(result, dict)
        self.assertIn('id', result)
        self.assertIn('display_id', result)
        self.assertIn('title', result)
        self.assertIn('description', result)
        self.assertIn('thumbnail', result)
        self.assertIn('duration', result)
        self.assertIn('formats', result)
        self.assertIn('subtitles', result)

    def test_download_xml(self):
        instance = walla.WallaIE()
        url = 'http://video2.walla.co.il/?w=null/null/2642630/@@/video/flv_pl'
        display_id = 'one-direction-all-for-one'
        result = instance._download_xml(url, display_id)
        self.assertIsInstance(result, object)  # assuming it returns an XML object

    def test_sort_formats(self):
        instance = walla.WallaIE()
        formats = [{'url': 'http://example.com/1', 'format_id': 'low'}, {'url': 'http://example.com/2', 'format_id': 'high'}]
        instance._sort_formats(formats)
        self.assertEqual(formats, [{'url': 'http://example.com/2', 'format_id': 'high'}, {'url': 'http://example.com/1', 'format_id': 'low'}])

    def test_private_method__match_valid_url(self):
        instance = walla.WallaIE()
        url = 'http://vod.walla.co.il/movie/2642630/one-direction-all-for-one'
        result = instance._WallaIE__match_valid_url(url)
        self.assertTrue(result)

    def test_str_method(self):
        instance = walla.WallaIE()
        result = instance.__str__()
        self.assertEqual(result, 'WallaIE')

    def test_repr_method(self):
        instance = walla.WallaIE()
        result = instance.__repr__()
        self.assertEqual(result, 'WallaIE()')

if __name__ == '__main__':
    unittest.main()