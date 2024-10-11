import unittest
from youtube_dl.extractor.nrk import NRKBaseIE


class TestNRKIE(unittest.TestCase):
    def test_real_extract(self):
        url = 'https://www.nrk.no/lyngseide/video/2022/10/10/10-10-2022-lyngseide-100022101051'
        video_id = '100022101051'
        path_templ = 'playback/%s/' + video_id

if __name__ == '__main__':
    unittest.main()