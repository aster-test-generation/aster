from youtube_dl.extractor.soundgasm import InfoExtractor
import unittest
from youtube_dl.extractor.soundgasm import SoundgasmIE, SoundgasmProfileIE


class TestSoundgasmIE(unittest.TestCase):
    def test_IE_NAME(self):
        ie = SoundgasmIE()
        self.assertEqual(ie.IE_NAME, 'soundgasm')

    def test__VALID_URL(self):
        ie = SoundgasmIE()
        self.assertEqual(ie._VALID_URL, r'https?://(?:www\.)?soundgasm\.net/u/(?P<user>[0-9a-zA-Z_-]+)/(?P<display_id>[0-9a-zA-Z_-]+)')

    def test__TEST(self):
        ie = SoundgasmIE()
        self.assertEqual(ie._TEST, {
            'url': 'http://soundgasm.net/u/ytdl/Piano-sample',
            'md5': '010082a2c802c5275bb00030743e75ad',
            'info_dict': {
                'id': '88abd86ea000cafe98f96321b23cc1206cbcbcc9',
                'ext': 'm4a',
                'title': 'Piano sample',
                'description': 'Royalty Free Sample Music',
                'uploader': 'ytdl',
            }
        })

    def test__real_extract(self):
        ie = SoundgasmIE()
        url = 'http://soundgasm.net/u/ytdl/Piano-sample'
        result = ie._real_extract(url)
        self.assertEqual(result, {
            'id': '88abd86ea000cafe98f96321b23cc1206cbcbcc9',
            'display_id': 'Piano-sample',
            'url': 'https://example.com/audio.m4a',
            'vcodec': 'none',
            'title': 'Piano sample',
            'description': 'Royalty Free Sample Music',
            'uploader': 'ytdl',
        })

    def test___init__(self):
        ie = SoundgasmIE()
        self.assertIsInstance(ie, InfoExtractor)

    def test___str__(self):
        ie = SoundgasmIE()
        self.assertEqual(str(ie), 'SoundgasmIE')

    def test___repr__(self):
        ie = SoundgasmIE()
        self.assertEqual(repr(ie), 'SoundgasmIE()')

class TestSoundgasmProfileIE(unittest.TestCase):
    def test_IE_NAME(self):
        ie = SoundgasmProfileIE()
        self.assertEqual(ie.IE_NAME, 'soundgasm:profile')

    def test__VALID_URL(self):
        ie = SoundgasmProfileIE()
        self.assertEqual(ie._VALID_URL, r'https?://(?:www\.)?soundgasm\.net/u/(?P<id>[^/]+)/?(?:')

    def test__TEST(self):
        ie = SoundgasmProfileIE()
        self.assertEqual(ie._TEST, {
            'url': 'http://soundgasm.net/u/ytdl',
            'info_dict': {
                'id': 'ytdl',
            },
            'playlist_count': 1,
        })

    def test__real_extract(self):
        ie = SoundgasmProfileIE()
        url = 'http://soundgasm.net/u/ytdl'
        result = ie._real_extract(url)
        self.assertEqual(result, {
            '_type': 'playlist',
            'id': 'ytdl',
            'entries': [
                {'_type': 'url', 'url': 'https://example.com/audio1.m4a', 'ie_key': 'Soundgasm'},
                {'_type': 'url', 'url': 'https://example.com/audio2.m4a', 'ie_key': 'Soundgasm'},
            ],
        })

    def test___init__(self):
        ie = SoundgasmProfileIE()
        self.assertIsInstance(ie, InfoExtractor)

    def test___str__(self):
        ie = SoundgasmProfileIE()
        self.assertEqual(str(ie), 'SoundgasmProfileIE')

    def test___repr__(self):
        ie = SoundgasmProfileIE()
        self.assertEqual(repr(ie), 'SoundgasmProfileIE()')

if __name__ == '__main__':
    unittest.main()