import unittest
from youtube_dl.extractor.walla import WallaIE


class TestWallaIE(unittest.TestCase):
    def test_valid_url(self):
        ie = WallaIE()
        mobj = re.match(ie._VALID_URL, 'http://vod.walla.co.il/movie/2642630/one-direction-all-for-one')
        self.assertIsNotNone(mobj)

    def test_real_extract(self):
        ie = WallaIE()
        url = 'http://vod.walla.co.il/movie/2642630/one-direction-all-for-one'
        result = ie._real_extract(url)
        self.assertIn('id', result)
        self.assertIn('display_id', result)
        self.assertIn('title', result)
        self.assertIn('description', result)
        self.assertIn('thumbnail', result)
        self.assertIn('duration', result)
        self.assertIn('formats', result)
        self.assertIn('subtitles', result)

    def test_sort_formats(self):
        ie = WallaIE()
        formats = [
            {'url': 'url1', 'height': 1080},
            {'url': 'url2', 'height': 720},
            {'url': 'url3', 'height': 480},
        ]
        ie._sort_formats(formats)
        self.assertEqual(formats, sorted(formats, key=lambda x: x['height'], reverse=True))

    def test_xpath_text(self):
        ie = WallaIE()
        xml = '<root><title>Test</title></root>'
        result = ie._download_xml(None, None)
        result.find('./root/title').text = 'Test'
        self.assertEqual(ie.xpath_text(result, './root/title'), 'Test')

    def test_int_or_none(self):
        ie = WallaIE()
        self.assertIsNone(ie.int_or_none(None))
        self.assertEqual(ie.int_or_none('123'), 123)

    def test_subtitles(self):
        ie = WallaIE()
        subtitles = ie._SUBTITLE_LANGS
        self.assertIn('עברית', subtitles)
        self.assertEqual(subtitles['עברית'], 'heb')

    def test_formats(self):
        ie = WallaIE()
        formats = [
            {'url': 'rtmp://wafla.walla.co.il/vod', 'play_path': 'play_path1', 'player_url': 'player_url1', 'page_url': 'page_url1', 'ext': 'flv', 'format_id': 'format_id1'},
            {'url': 'rtmp://wafla.walla.co.il/vod', 'play_path': 'play_path2', 'player_url': 'player_url2', 'page_url': 'page_url2', 'ext': 'flv', 'format_id': 'format_id2'},
        ]
        self.assertEqual(ie._format_height(formats[0]), None)
        self.assertEqual(ie._format_height(formats[1]), None)

if __name__ == '__main__':
    unittest.main()