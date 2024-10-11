import unittest
from youtube_dl.extractor.walla import WallaIE
from youtube_dl.utils import ExtractorError
from unittest.mock import patch, MagicMock


class TestWallaIE(unittest.TestCase):
    def setUp(self):
        self.ie = WallaIE()

    def test_valid_url(self):
        self.assertTrue(self.ie.suitable('http://vod.walla.co.il/movie/2642630/one-direction-all-for-one'))
        self.assertFalse(self.ie.suitable('http://example.com'))

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
        result = self.ie._real_extract(url).to_screen()
        self.assertEqual(result['id'], '2642630')

    def test_private_method(self):
        # Assuming there is a private method to test, which is not present in the provided code.
        # This is a placeholder for such a test.
        pass

    def test_str_method(self):
        self.assertEqual(str(self.ie), '<youtube_dl.extractor.walla.WallaIE object at 0x7fa4693f40d0>')

    def test_repr_method(self):
        self.assertEqual(repr(self.ie), repr(youtube_dl.extractor.walla.WallaIE()))

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

class TestWallaIE(unittest.TestCase):
    def setUp(self):
        self.ie = WallaIE()

    @patch('youtube_dl.extractor.walla.WallaIE._download_xml')
    def test_real_extract(self, mock_download_xml):
        url = 'http://vod.walla.co.il/movie/2642630/one-direction-all-for-one'
        mock_xml = MagicMock()
        mock_xml.find.return_value = MagicMock()
        mock_xml.find.return_value.find.side_effect = lambda x: {
            './title': MagicMock(text='Test Title'),
            './synopsis': MagicMock(text='Test Description'),
            './preview_pic': MagicMock(text='http://example.com/thumbnail.jpg'),
            './duration': MagicMock(text='3600')
        }[x]
        mock_xml.find.return_value.findall.side_effect = lambda x: {
            './subtitles/subtitle': [MagicMock(find=MagicMock(return_value=MagicMock(text='עברית')), findall=MagicMock(return_value=[]))],
            './qualities/quality': [MagicMock(find=MagicMock(return_value=MagicMock(text='720p')), findall=MagicMock(return_value=[]))]
        }[x]
        mock_download_xml.return_value = mock_xml

        result = self.ie._real_extract(url)
        self.assertEqual(result['id'], '2642630')
        self.assertEqual(result['display_id'], 'one-direction-all-for-one')
        self.assertEqual(result['title'], 'Test Title')
        self.assertEqual(result['description'], 'Test Description')
        self.assertEqual(result['thumbnail'], 'http://example.com/thumbnail.jpg')
        self.assertEqual(result['duration'], 3600)
        self.assertEqual(result['subtitles'], {'heb': [{'ext': 'srt', 'url': None}]})
        self.assertEqual(result['formats'][0]['format_id'], '720p')
        self.assertEqual(result['formats'][0]['height'], 720)

    def test_valid_url(self):
        self.assertTrue(re.match(WallaIE._VALID_URL, 'http://vod.walla.co.il/movie/2642630/one-direction-all-for-one'))

    def test_test(self):
        self.assertIn('url', WallaIE._TEST)
        self.assertIn('info_dict', WallaIE._TEST)
        self.assertIn('params', WallaIE._TEST)

    def test_subtitle_langs(self):
        self.assertIn('עברית', WallaIE._SUBTITLE_LANGS)
        self.assertEqual(WallaIE._SUBTITLE_LANGS['עברית'], 'heb')

if __name__ == '__main__':
    unittest.main()