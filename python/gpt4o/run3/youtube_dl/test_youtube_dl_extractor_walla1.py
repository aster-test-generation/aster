import unittest
from unittest.mock import patch, MagicMock
from youtube_dl.extractor.walla import WallaIE

class TestWallaIE(unittest.TestCase):
    def setUp(self):
        self.ie = WallaIE()

    @patch('youtube_dl.extractor.walla.WallaIE._download_xml')
    def test_real_extract(self, mock_download_xml):
        url = 'http://vod.walla.co.il/movie/2642630/one-direction-all-for-one'
        mock_xml = MagicMock()
        mock_xml.find.return_value = MagicMock()
        mock_xml.find.return_value.find.side_effect = lambda x: {
            './title': 'וואן דיירקשן: ההיסטריה',
            './synopsis': 'A documentary about One Direction',
            './preview_pic': 'http://example.com/thumbnail.jpg',
            './duration': '3600',
            './subtitles/subtitle': [MagicMock()],
            './qualities/quality': [MagicMock()]
        }[x]
        mock_download_xml.return_value = mock_xml

        result = self.ie._real_extract(url)

        self.assertEqual(result['id'], '2642630')
        self.assertEqual(result['display_id'], 'one-direction-all-for-one')
        self.assertEqual(result['title'], 'וואן דיירקשן: ההיסטריה')
        self.assertEqual(result['description'], 'A documentary about One Direction')
        self.assertEqual(result['thumbnail'], 'http://example.com/thumbnail.jpg')
        self.assertEqual(result['duration'], 3600)
        self.assertIn('formats', result)
        self.assertIn('subtitles', result)

    def test_valid_url(self):
        valid_url = 'http://vod.walla.co.il/movie/2642630/one-direction-all-for-one'
        self.assertTrue(re.match(WallaIE._VALID_URL, valid_url))

    def test_invalid_url(self):
        invalid_url = 'http://example.com/movie/2642630/one-direction-all-for-one'
        self.assertIsNone(re.match(WallaIE._VALID_URL, invalid_url))

    def test_subtitle_langs(self):
        self.assertEqual(WallaIE._SUBTITLE_LANGS['עברית'], 'heb')

    @patch('youtube_dl.extractor.walla.WallaIE._sort_formats')
    def test_sort_formats_called(self, mock_sort_formats):
        formats = [{'format_id': '360p'}, {'format_id': '720p'}]
        self.ie._sort_formats(formats)
        mock_sort_formats.assert_called_once_with(formats)

if __name__ == '__main__':
    unittest.main()