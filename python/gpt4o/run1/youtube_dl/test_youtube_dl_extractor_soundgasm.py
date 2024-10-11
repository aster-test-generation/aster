import re
import unittest
from youtube_dl.extractor.soundgasm import SoundgasmIE, SoundgasmProfileIE


class TestSoundgasmIE(unittest.TestCase):
    def setUp(self):
        self.extractor = SoundgasmIE()

    def test_real_extract(self):
        url = 'http://soundgasm.net/u/ytdl/Piano-sample'
        result = self.extractor._real_extract(url).to_screen()
        self.assertEqual(result['id'], '88abd86ea000cafe98f96321b23cc1206cbcbcc9')
        self.assertEqual(result['title'], 'Piano sample')
        self.assertEqual(result['description'], 'Royalty Free Sample Music')
        self.assertEqual(result['uploader'], 'ytdl')

    def test_valid_url(self):
        url = 'http://soundgasm.net/u/ytdl/Piano-sample'
        self.assertTrue(re.match(SoundgasmIE._VALID_URL, url))

    def test_private_methods(self):
        url = 'http://soundgasm.net/u/ytdl/Piano-sample'
        mobj = re.match(self.extractor._VALID_URL, url)
        display_id = mobj.group('display_id')
        webpage = self.extractor._download_webpage(url, display_id, fatal=False)
        audio_url = self.extractor._html_search_regex(
            r'(?s)m4a\s*:\s*(["\'])(?P<url>(?:(?!\1).)+)\1', webpage,
            'audio URL', group='url')
        self.assertTrue(audio_url.startswith('http'))

class TestSoundgasmProfileIE(unittest.TestCase):
    def setUp(self):
        self.extractor = SoundgasmProfileIE()

    def test_real_extract(self):
        url = 'http://soundgasm.net/u/ytdl'
        result = self.extractor._real_extract(url).to_screen()
        self.assertEqual(result['id'], 'ytdl')
        self.assertEqual(len(result['entries']), 1)

    def test_valid_url(self):
        url = 'http://soundgasm.net/u/ytdl'
        self.assertTrue(re.match(SoundgasmProfileIE._VALID_URL, url))

    def test_private_methods(self):
        url = 'http://soundgasm.net/u/ytdl'
        profile_id = self.extractor._match_id(url)
        webpage = self.extractor._download_webpage(url, profile_id, fatal=False)
        entries = [
            self.extractor.url_result(audio_url, 'Soundgasm')
            for audio_url in re.findall(r'href="([^"]+/u/%s/[^"]+)' % profile_id, webpage)]
        self.assertTrue(len(entries) > 0)

if __name__ == '__main__':
    unittest.main()