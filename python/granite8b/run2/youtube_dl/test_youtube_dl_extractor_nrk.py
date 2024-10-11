import unittest
from youtube_dl.extractor.nrk import NRKSkoleIE


class TestNRKSkoleIE(unittest.TestCase):
    def test_real_extract(self):
        ie = NRKSkoleIE()
        url = 'https://www.nrk.no/skole/fot/2023/01/23/13/12/11/10/09/08/07/06/05/04/03/02/01/video/1234567890'
        info_dict = ie._real_extract(url)
        self.assertEqual(info_dict['id'], '1234567890')

if __name__ == '__main__':
    unittest.main()