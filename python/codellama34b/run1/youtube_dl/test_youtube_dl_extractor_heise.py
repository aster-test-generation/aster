import unittest
from youtube_dl.extractor.heise import *



class TestHeiseIE(unittest.TestCase):
    def test_real_extract(self):
        instance = HeiseIE()
        result = instance.to_screen("http://www.heise.de/video/artikel/Podcast-c-t-uplink-3-3-Owncloud-Tastaturen-Peilsender-Smartphone-2404147.html")
        self.assertEqual(result['id'], '1_kkrq94sm')
        self.assertEqual(result['ext'], 'mp4')
        self.assertEqual(result['title'], "Podcast: c't uplink 3.3 – Owncloud / Tastaturen / Peilsender Smartphone")
        self.assertEqual(result['timestamp'], 1512734959)
        self.assertEqual(result['upload_date'], '20171208')
        self.assertEqual(result['description'], 'md5:c934cbfb326c669c2bcabcbe3d3fcd20')

    def test_real_extract_2(self):
        instance = HeiseIE()
        result = instance._real_extract("http://www.heise.de/newsticker/meldung/Netflix-In-20-Jahren-vom-Videoverleih-zum-TV-Revolutionaer-3814130.html")
        self.assertEqual(result['id'], '6kmWbXleKW4')
        self.assertEqual(result['ext'], 'mp4')
        self.assertEqual(result['title'], 'NEU IM SEPTEMBER | Netflix')
        self.assertEqual(result['description'], 'md5:2131f3c7525e540d5fd841de938bd452')
        self.assertEqual(result['upload_date'], '20170830')
        self.assertEqual(result['uploader'], 'Netflix Deutschland, Österreich und Schweiz')
        self.assertEqual(result['uploader_id'], 'netflixdach')

    def test_real_extract_3(self):
        instance = HeiseIE()
        result = instance.to_screen("https://www.heise.de/video/artikel/nachgehakt-Wie-sichert-das-c-t-Tool-Restric-tor-Windows-10-ab-3700244.html")
        self.assertEqual(result['id'], '1_ntrmio2s')
        self.assertEqual(result['ext'], 'mp4')
        self.assertEqual(result['title'], "nachgehakt: Wie sichert das c't-Tool Restric'tor Windows 10 ab?")
        self.assertEqual(result['description'], 'md5:47e8ffb6c46d85c92c310a512d6db271')
        self.assertEqual(result['timestamp'], 1512470717)
        self.assertEqual(result['upload_date'], '20171205')

if __name__ == '__main__':
    unittest.main()