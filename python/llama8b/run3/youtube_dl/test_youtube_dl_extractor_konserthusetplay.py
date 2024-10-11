import unittest
from youtube_dl.extractor.konserthusetplay import KonserthusetPlayIE


class TestKonserthusetPlayIE(unittest.TestCase):
    def test_valid_url(self):
        ie = KonserthusetPlayIE()
        url = 'http://www.konserthusetplay.se/?m=CKDDnlCY-dhWAAqiMERd-A'
        info_dict = ie._real_extract(url)
        self.assertEqual(info_dict['id'], 'CKDDnlCY-dhWAAqiMERd-A')
        self.assertEqual(info_dict['ext'], 'mp4')
        self.assertEqual(info_dict['title'], 'Orkesterns instrument: Valthornen')
        self.assertEqual(info_dict['description'], 'md5:f10e1f0030202020396a4d712d2fa827')
        self.assertEqual(info_dict['thumbnail'], 're:^https?://.*$')
        self.assertEqual(info_dict['duration'], 398.76)

    def test_only_matching(self):
        ie = KonserthusetPlayIE()
        url = 'http://rspoplay.se/?m=elWuEH34SMKvaO4wO_cHBw'
        info_dict = ie._real_extract(url)
        self.assertIsNone(info_dict)

    def test_private_method(self):
        ie = KonserthusetPlayIE()
        url = 'http://www.konserthusetplay.se/?m=CKDDnlCY-dhWAAqiMERd-A'
        webpage = ie._download_webpage(url, 'CKDDnlCY-dhWAAqiMERd-A')
        self.assertIsNotNone(webpage)

    def test_protected_method(self):
        ie = KonserthusetPlayIE()
        url = 'http://www.konserthusetplay.se/?m=CKDDnlCY-dhWAAqiMERd-A'
        e = ie._search_regex(r'https?://csp\.picsearch\.com/rest\?.*\be=(.+?)[&"\']', webpage, 'e')
        self.assertIsNotNone(e)

    def test_magic_methods(self):
        ie = KonserthusetPlayIE()
        self.assertEqual(str(ie), 'KonserthusetPlayIE')
        self.assertEqual(repr(ie), 'KonserthusetPlayIE(KonserthusetPlayIE())')

if __name__ == '__main__':
    unittest.main()