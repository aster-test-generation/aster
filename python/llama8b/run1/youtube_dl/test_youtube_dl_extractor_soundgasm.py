import re
import unittest
from youtube_dl.extractor.soundgasm import SoundgasmIE, SoundgasmProfileIE


class TestSoundgasmIE(unittest.TestCase):
    def test_valid_url(self):
        ie = SoundgasmIE()
        url = 'http://soundgasm.net/u/ytdl/Piano-sample'
        mobj = re.match(ie._VALID_URL, url)
        self.assertIsNotNone(mobj)

    def test_invalid_url(self):
        ie = SoundgasmIE()
        url = 'http://invalid.com'
        mobj = re.match(ie._VALID_URL, url)
        self.assertIsNone(mobj)

    def test_real_extract(self):
        ie = SoundgasmIE()
        url = 'http://soundgasm.net/u/ytdl/Piano-sample'
        info = ie._real_extract(url)
        self.assertIn('id', info)
        self.assertIn('display_id', info)
        self.assertIn('url', info)
        self.assertIn('title', info)
        self.assertIn('description', info)
        self.assertIn('uploader', info)

    def test_html_search_regex(self):
        ie = SoundgasmIE()
        html = '<div class="jp-title">Piano sample</div>'
        result = ie._html_search_regex(r'<div[^>]+\bclass=["\']jp-title[^>]+>([^<]+)', html, 'title')
        self.assertEqual(result, 'Piano sample')

    def test_search_regex(self):
        ie = SoundgasmIE()
        html = '<li>Description: Royalty Free Sample Music</li>'
        result = ie._search_regex(r'(?s)<li>Description:\s(.*?)<\/li>', html, 'description', fatal=False)
        self.assertEqual(result, 'Royalty Free Sample Music')

class TestSoundgasmProfileIE(unittest.TestCase):
    def test_valid_url(self):
        ie = SoundgasmProfileIE()
        url = 'http://soundgasm.net/u/ytdl'
        mobj = re.match(ie._VALID_URL, url)
        self.assertIsNotNone(mobj)

    def test_invalid_url(self):
        ie = SoundgasmProfileIE()
        url = 'http://invalid.com'
        mobj = re.match(ie._VALID_URL, url)
        self.assertIsNone(mobj)

    def test_real_extract(self):
        ie = SoundgasmProfileIE()
        url = 'http://soundgasm.net/u/ytdl'
        info = ie._real_extract(url)
        self.assertIn('id', info)
        self.assertIn('playlist_count', info)

    def test_playlist_result(self):
        ie = SoundgasmProfileIE()
        entries = ['http://soundgasm.net/u/ytdl/Piano-sample']
        result = ie.playlist_result(entries, 'ytdl')
        self.assertIn('id', result)
        self.assertIn('entries', result)

if __name__ == '__main__':
    unittest.main()