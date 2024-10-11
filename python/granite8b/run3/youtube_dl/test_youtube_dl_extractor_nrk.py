import unittest
from youtube_dl.extractor.nrk import NRKSkoleIE


class TestNRKSkoleIE(unittest.TestCase):
    def test_real_extract(self):
        ie = NRKSkoleIE()
        url = 'https://www.nrk.no/skole/fysik/om-skolen/om-skolen-1.13385398'
        info_dict = ie._real_extract(url)
        self.assertEqual(info_dict['id'], '1.13385398')
        self.assertEqual(info_dict['ext'], 'mp4')
        self.assertEqual(info_dict['title'], 'Om skolen')
        self.assertEqual(info_dict['description'], 'md5:36976690755d500732148c8b02092a5')
        self.assertEqual(info_dict['timestamp'], 1503238400)
        self.assertEqual(info_dict['upload_date'], '20170818')
        self.assertEqual(info_dict['duration'], 102)

if __name__ == '__main__':
    unittest.main()