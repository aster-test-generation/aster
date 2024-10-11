import unittest
from youtube_dl.extractor.konserthusetplay import *



class TestKonserthusetPlayIE(unittest.TestCase):
    def test_real_extract(self):
        instance = KonserthusetPlayIE()
        result = instance._real_extract("http://www.konserthusetplay.se/?m=CKDDnlCY-dhWAAqiMERd-A")
        self.assertEqual(result['id'], 'CKDDnlCY-dhWAAqiMERd-A')
        self.assertEqual(result['ext'], 'mp4')
        self.assertEqual(result['title'], 'Orkesterns instrument: Valthornen')
        self.assertEqual(result['description'], 'md5:f10e1f0030202020396a4d712d2fa827')
        self.assertRegex(result['thumbnail'], 're:^https?://.*$')
        self.assertEqual(result['duration'], 398.76)

    def test_real_extract_with_m3u8_url(self):
        instance = KonserthusetPlayIE()
        result = instance._real_extract("http://www.konserthusetplay.se/?m=CKDDnlCY-dhWAAqiMERd-A")
        self.assertEqual(result['id'], 'CKDDnlCY-dhWAAqiMERd-A')
        self.assertEqual(result['ext'], 'mp4')
        self.assertEqual(result['title'], 'Orkesterns instrument: Valthornen')
        self.assertEqual(result['description'], 'md5:f10e1f0030202020396a4d712d2fa827')
        self.assertRegex(result['thumbnail'], 're:^https?://.*$')
        self.assertEqual(result['duration'], 398.76)

    def test_real_extract_with_fallback_url(self):
        instance = KonserthusetPlayIE()
        result = instance._real_extract("http://www.konserthusetplay.se/?m=CKDDnlCY-dhWAAqiMERd-A")
        self.assertEqual(result['id'], 'CKDDnlCY-dhWAAqiMERd-A')
        self.assertEqual(result['ext'], 'mp4')
        self.assertEqual(result['title'], 'Orkesterns instrument: Valthornen')
        self.assertEqual(result['description'], 'md5:f10e1f0030202020396a4d712d2fa827')
        self.assertRegex(result['thumbnail'], 're:^https?://.*$')
        self.assertEqual(result['duration'], 398.76)

    def test_real_extract_with_no_formats(self):
        instance = KonserthusetPlayIE()
        result = instance._real_extract("http://www.konserthusetplay.se/?m=CKDDnlCY-dhWAAqiMERd-A")
        self.assertEqual(result['id'], 'CKDDnlCY-dhWAAqiMERd-A')
        self.assertEqual(result['ext'], 'mp4')
        self.assertEqual(result['title'], 'Orkesterns instrument: Valthornen')
        self.assertEqual(result['description'], 'md5:f10e1f0030202020396a4d712d2fa827')
        self.assertRegex(result['thumbnail'], 're:^https?://.*$')
        self.assertEqual(result['duration'], 398.76)

if __name__ == '__main__':
    unittest.main()