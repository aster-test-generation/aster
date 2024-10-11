import unittest
from youtube_dl.extractor.soundgasm import SoundgasmIE, SoundgasmProfileIE


class TestSoundgasmIE(unittest.TestCase):
    def test_real_extract(self):
        ie = SoundgasmIE(None)
        info_dict = ie._real_extract('http://soundgasm.net/u/ytdl/Piano-sample')
        self.assertEqual(info_dict['id'], '88abd86ea000cafe98f96321b23cc1206cbcbcc9')
        self.assertEqual(info_dict['ext'], 'm4a')
        self.assertEqual(info_dict['title'], 'Piano sample')
        self.assertEqual(info_dict['description'], 'Royalty Free Sample Music')
        self.assertEqual(info_dict['uploader'], 'ytdl')

class TestSoundgasmProfileIE(unittest.TestCase):
    def test_real_extract(self):
        ie = SoundgasmProfileIE(None)
        entries = ie._real_extract('http://soundgasm.net/u/ytdl')
        self.assertEqual(len(entries), 1)
        self.assertEqual(entries[0]['id'], 'ytdl')

if __name__ == '__main__':
    unittest.main()