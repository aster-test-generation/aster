import unittest
from youtube_dl.extractor.nrk import NRKBaseIE


class TestNRKIE(unittest.TestCase):
    def test_real_extract(self):
        url = 'https://www.nrk.no/lyngse Telemark/12345678'
        video_id = '12345678'
        path_templ = 'playback/%s/' + video_id

if __name__ == '__main__':
    unittest.main()