import re
import unittest
from unittest.mock import patch
from youtube_dl.extractor.walla import WallaIE


class TestWallaIE(unittest.TestCase):
    def test_valid_url(self):
        ie = WallaIE()
        mobj = re.match(ie._VALID_URL, 'http://vod.walla.co.il/movie/2642630/one-direction-all-for-one')
        self.assertIsNotNone(mobj)

    def test_real_extract(self):
        ie = WallaIE()
        with patch('youtube_dl.extractor.walla.re') as re_mock:
            re_mock.match.return_value.group.return_value = '2642630'
            video = ie._download_xml('http://video2.walla.co.il/?w=null/null/2642630/@@/video/flv_pl', 'one-direction-all-for-one')
            self.assertIsNotNone(video)

    def test_xpath_text(self):
        ie = WallaIE()
        item = '<item><title>title</title><synopsis>description</synopsis><preview_pic>thumbnail</preview_pic><duration>3600</duration></item>'
        self.assertEqual(ie._download_xml(None, None).find('./items/item').xpath_text('./title'), 'title')

    def test_int_or_none(self):
        ie = WallaIE()
        self.assertEqual(ie._download_xml(None, None).find('./items/item').xpath_text('./duration'), '3600')
        self.assertIsNone(ie._download_xml(None, None).find('./items/item').xpath_text('./duration2'))

    def test_sort_formats(self):
        ie = WallaIE()
        formats = [
            {'url': 'url1', 'format_id': 'format1'},
            {'url': 'url2', 'format_id': 'format2'},
        ]
        ie._sort_formats(formats)
        self.assertEqual(formats, sorted(formats, key=lambda x: x['format_id']))

    def test_subtitles(self):
        ie = WallaIE()
        subtitles = ie._download_xml(None, None).find('./items/item').findall('./subtitles/subtitle')
        self.assertEqual(len(subtitles), 1)

    def test_formats(self):
        ie = WallaIE()
        formats = ie._download_xml(None, None).find('./items/item').findall('./qualities/quality')
        self.assertEqual(len(formats), 1)

class TestWallaIE(unittest.TestCase):
    def test_valid_url(self):
        ie = WallaIE()
        mobj = re.match(ie._VALID_URL, 'http://vod.walla.co.il/movie/2642630/one-direction-all-for-one')
        self.assertIsNotNone(mobj)

    def test_extract(self):
        ie = WallaIE()
        url = 'http://vod.walla.co.il/movie/2642630/one-direction-all-for-one'
        info = ie._real_extract(url)
        self.assertIn('id', info)
        self.assertIn('display_id', info)
        self.assertIn('title', info)
        self.assertIn('description', info)
        self.assertIn('thumbnail', info)
        self.assertIn('duration', info)
        self.assertIn('formats', info)
        self.assertIn('subtitles', info)

    def test_formats(self):
        ie = WallaIE()
        url = 'http://vod.walla.co.il/movie/2642630/one-direction-all-for-one'
        info = ie._real_extract(url)
        formats = info['formats']
        self.assertIsInstance(formats, list)
        for fmt in formats:
            self.assertIn('url', fmt)
            self.assertIn('play_path', fmt)
            self.assertIn('player_url', fmt)
            self.assertIn('page_url', fmt)
            self.assertIn('ext', fmt)
            self.assertIn('format_id', fmt)

    def test_subtitles(self):
        ie = WallaIE()
        url = 'http://vod.walla.co.il/movie/2642630/one-direction-all-for-one'
        info = ie._real_extract(url)
        subtitles = info['subtitles']
        self.assertIsInstance(subtitles, dict)
        for lang, subs in subtitles.items():
            self.assertIsInstance(subs, list)
            for sub in subs:
                self.assertIn('ext', sub)
                self.assertIn('url', sub)

    def test_sort_formats(self):
        ie = WallaIE()
        formats = [
            {'url': 'url1', 'format_id': 'format1'},
            {'url': 'url2', 'format_id': 'format2'},
            {'url': 'url3', 'format_id': 'format3'},
        ]
        ie._sort_formats(formats)
        self.assertEqual(formats, sorted(formats, key=lambda x: x['format_id']))

if __name__ == '__main__':
    unittest.main()