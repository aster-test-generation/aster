import unittest
from youtube_dl.extractor.konserthusetplay import KonserthusetPlayIE




class TestKonserthusetPlayIE(unittest.TestCase):
    def test_real_extract(self):
        ie = KonserthusetPlayIE()
        video_id = 'CKDDnlCY-dhWAAqiMERd-A'
        webpage = 'http://www.konserthusetplay.se/?m=CKDDnlCY-dhWAAqiMERd-A'
        info_dict = ie._real_extract(webpage)
        self.assertEqual(info_dict['id'], video_id)
        self.assertEqual(info_dict['ext'], 'mp4')
        self.assertEqual(info_dict['title'], 'Orkesterns instrument: Valthornen')
        self.assertEqual(info_dict['duration'], 398.76)

if __name__ == '__main__':
    unittest.main()