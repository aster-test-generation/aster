import unittest
from youtube_dl.extractor.soundgasm import SoundgasmIE, SoundgasmProfileIE


class TestSoundgasmIE(unittest.TestCase):
    def test_real_extract(self):
        url = 'http://soundgasm.net/u/ytdl/Piano-sample'
        info_dict = {
            'id': '88abd86ea000cafe98f96321b23cc1206cbcbcc9',
            'ext': 'm4a',
            'title': 'Piano sample',
            'description': 'Royalty Free Sample Music',
            'uploader': 'ytdl',
        }
        soundgasm_ie = SoundgasmIE()
        result = soundgasm_ie._real_extract(url)
        self.assertEqual(result, info_dict)

class TestSoundgasmProfileIE(unittest.TestCase):
    def test_real_extract(self):
        url = 'http://soundgasm.net/u/ytdl'
        profile_id = 'ytdl'
        soundgasm_profile_ie = SoundgasmProfileIE()
        result = soundgasm_profile_ie._real_extract(url)
        self.assertEqual(result['id'], profile_id)

if __name__ == '__main__':
    unittest.main()