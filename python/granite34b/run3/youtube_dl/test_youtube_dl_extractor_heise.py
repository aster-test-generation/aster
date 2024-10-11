import unittest
from youtube_dl.extractor.heise import HeiseIE
from unittest import TestCase


class TestHeiseIE(unittest.TestCase):
    def test_private_method(self):
        # Test private method
        pass

    def test_protected_method(self):
        # Test protected method
        pass

    def test_magic_method(self):
        # Test magic method
        pass

class TestHeiseIE(TestCase):
    def test_real_extract(self):
        ie = HeiseIE()
        result = ie._real_extract('http://www.heise.de/video/artikel/Podcast-c-t-uplink-3-3-Owncloud-Tastaturen-Peilsender-Smartphone-2404147.html')
        self.assertEqual(result['id'], '1_kkrq94sm')
        self.assertEqual(result['ext'], 'mp4')
        self.assertEqual(result['title'], "Podcast: c't uplink 3.3 – Owncloud / Tastaturen / Peilsender Smartphone")
        self.assertEqual(result['timestamp'], 1512734959)
        self.assertEqual(result['upload_date'], '20171208')
        self.assertEqual(result['description'], 'md5:c934cbfb326c669c2bcabcbe3d3fcd20')
        self.assertTrue(result['params']['skip_download'])

    def test_private_method(self):
        ie = HeiseIE()
        result = ie._HeiseIE__private_method(3)
        self.assertEqual(result, 9)

    def test_protected_method(self):
        ie = HeiseIE()
        result = ie._protected_method(3)
        self.assertEqual(result, 6)

    def test_str_method(self):
        ie = HeiseIE()
        result = ie.__str__()
        self.assertEqual(result, "ExampleClass")

    def test_repr_method(self):
        ie = HeiseIE()
        result = ie.__repr__()
        self.assertEqual(result, "ExampleClass(1)")

if __name__ == '__main__':
    unittest.main()