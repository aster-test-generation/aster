import unittest
from youtube_dl.extractor.soundgasm import SoundgasmIE, SoundgasmProfileIE


class TestSoundgasmIE(unittest.TestCase):
    def test_real_extract(self):
        ie = SoundgasmIE()
        url = 'http://soundgasm.net/u/ytdl/Piano-sample'
        info_dict = {
            'id': '88abd86ea000cafe98f96321b23cc1206cbcbcc9',
            'ext': 'm4a',
            'title': 'Piano sample',
            'description': 'Royalty Free Sample Music',
            'uploader': 'ytdl',
        }
        result = ie._real_extract(url)
        self.assertEqual(result, info_dict)

class TestSoundgasmProfileIE(unittest.TestCase):
    def test_real_extract(self):
        ie = SoundgasmProfileIE()
        url = 'http://soundgasm.net/u/ytdl'
        info_dict = {
            'id': 'ytdl',
        }
        playlist_count = 1
        result = ie._real_extract(url)
        self.assertEqual(result['id'], info_dict['id'])
        self.assertEqual(len(result['entries']), playlist_count)

if __name__ == '__main__':
    unittest.main()