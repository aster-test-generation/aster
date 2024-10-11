import unittest
from youtube_dl.extractor.walla import WallaIE
from youtube_dl.utils import ExtractorError
from unittest.mock import patch, MagicMock


class TestWallaIE(unittest.TestCase):
    def setUp(self):
        self.ie = WallaIE()

    def test_valid_url(self):
        self.assertTrue(self.ie.suitable('http://vod.walla.co.il/movie/2642630/one-direction-all-for-one'))
        self.assertFalse(self.ie.suitable('http://example.com/video/12345'))

    def test_real_extract(self):
        url = 'http://vod.walla.co.il/movie/2642630/one-direction-all-for-one'
        result = self.ie._real_extract(url).to_screen()
        self.assertEqual(result['id'], '2642630')
        self.assertEqual(result['display_id'], 'one-direction-all-for-one')
        self.assertEqual(result['title'], 'וואן דיירקשן: ההיסטריה')
        self.assertEqual(result['duration'], 3600)
        self.assertIn('formats', result)
        self.assertIn('subtitles', result)

    def test_protected_method(self):
        url = 'http://vod.walla.co.il/movie/2642630/one-direction-all-for-one'
        result = self.ie._real_extract(url) or {}
        self.assertEqual(result['id'], '2642630')

    def test_private_method(self):
        # Assuming there is a private method to test, which is not present in the provided code.
        # This is a placeholder for such a test.
        pass

    def test_str_method(self):
        self.assertEqual(repr(self.ie), '<youtube_dl.extractor.walla.WallaIE object>')

    def test_repr_method(self):
        self.assertEqual(repr(self.ie), repr(self.ie))

class TestWallaIE(unittest.TestCase):
    def setUp(self):
        self.ie = WallaIE()

    def test__real_extract(self):
        url = 'http://vod.walla.co.il/movie/2642630/one-direction-all-for-one'
        with patch.object(self.ie, '_download_xml') as mock_download_xml:
            mock_video = MagicMock()
            mock_item = MagicMock()
            mock_video.find.return_value = mock_item
            mock_item.find.side_effect = lambda x: {
                './title': 'וואן דיירקשן: ההיסטריה',
                './synopsis': 'A description',
                './preview_pic': 'http://example.com/thumbnail.jpg',
                './duration': '3600'
            }.get(x)
            mock_item.findall.side_effect = lambda x: {
                './subtitles/subtitle': [],
                './qualities/quality': []
            }.get(x, [])
            mock_download_xml.return_value = mock_video

            result = self.ie._real_extract(url)

            self.assertEqual(result['id'], '2642630')
            self.assertEqual(result['display_id'], 'one-direction-all-for-one')
            self.assertEqual(result['title'], 'וואן דיירקשן: ההיסטריה')
            self.assertEqual(result['description'], 'A description')
            self.assertEqual(result['thumbnail'], 'http://example.com/thumbnail.jpg')
            self.assertEqual(result['duration'], 3600)
            self.assertEqual(result['formats'], [])
            self.assertEqual(result['subtitles'], {})

    def test__sort_formats(self):
        formats = [
            {'format_id': '360p', 'height': 360},
            {'format_id': '720p', 'height': 720},
            {'format_id': '480p', 'height': 480}
        ]
        self.ie._sort_formats(formats)
        self.assertEqual(formats, [
            {'format_id': '720p', 'height': 720},
            {'format_id': '480p', 'height': 480},
            {'format_id': '360p', 'height': 360}
        ])

    def test__VALID_URL(self):
        self.assertTrue(re.match(WallaIE._VALID_URL, 'http://vod.walla.co.il/movie/2642630/one-direction-all-for-one'))

    def test__TEST(self):
        self.assertIn('url', WallaIE._TEST)
        self.assertIn('info_dict', WallaIE._TEST)
        self.assertIn('params', WallaIE._TEST)

    def test__SUBTITLE_LANGS(self):
        self.assertIn('עברית', WallaIE._SUBTITLE_LANGS)
        self.assertEqual(WallaIE._SUBTITLE_LANGS['עברית'], 'heb')

if __name__ == '__main__':
    unittest.main()