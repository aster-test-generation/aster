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

    def test_download_xml(self):
        ie = WallaIE()
        url = 'http://video2.walla.co.il/?w=null/null/2642630/@@/video/flv_pl'
        result = ie._download_xml(url, 'display_id')
        self.assertIsNotNone(result)

    def test_xpath_text(self):
        ie = WallaIE()
        item = '<item><title>title</title><synopsis>description</synopsis><preview_pic>thumbnail</preview_pic><duration>3600</duration></item>'
        title = ie._xpath_text(item, './title', 'title')
        self.assertEqual(title, 'title')
        description = ie._xpath_text(item, './synopsis', 'description')
        self.assertEqual(description, 'description')
        thumbnail = ie._xpath_text(item, './preview_pic', 'thumbnail')
        self.assertEqual(thumbnail, 'thumbnail')
        duration = ie._xpath_text(item, './duration', 'duration')
        self.assertEqual(duration, '3600')

    def test_int_or_none(self):
        ie = WallaIE()
        result = ie._int_or_none('3600')
        self.assertEqual(result, 3600)
        result = ie._int_or_none('abc')
        self.assertIsNone(result)

    def test_sort_formats(self):
        ie = WallaIE()
        formats = [
            {'url': 'url1', 'height': 1},
            {'url': 'url2', 'height': 2},
            {'url': 'url3', 'height': 3},
        ]
        ie._sort_formats(formats)
        self.assertEqual(formats, sorted(formats, key=lambda x: x['height']))

if __name__ == '__main__':
    unittest.main()