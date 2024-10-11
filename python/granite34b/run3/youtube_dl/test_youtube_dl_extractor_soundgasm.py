import unittest
from youtube_dl.extractor.soundgasm import SoundgasmIE, SoundgasmProfileIE


class TestSoundgasmIE(unittest.TestCase):
    def test_real_extract(self):
        ie = SoundgasmIE()
        url = 'http://soundgasm.net/u/ytdl/Piano-sample'
        info_dict = ie._real_extract(url)
        self.assertEqual(info_dict['id'], '88abd86ea000cafe98f96321b23cc1206cbcbcc9')
        self.assertEqual(info_dict['ext'], 'm4a')
        self.assertEqual(info_dict['title'], 'Piano sample')
        self.assertEqual(info_dict['description'], 'Royalty Free Sample Music')
        self.assertEqual(info_dict['uploader'], 'ytdl')

class TestSoundgasmProfileIE(unittest.TestCase):
    def test_real_extract(self):
        ie = SoundgasmProfileIE()
        url = 'http://soundgasm.net/u/ytdl'
        playlist = ie._real_extract(url)
        self.assertEqual(playlist['id'], 'ytdl')
        self.assertGreater(len(playlist['entries']), 0)

if __name__ == '__main__':
    unittest.main()