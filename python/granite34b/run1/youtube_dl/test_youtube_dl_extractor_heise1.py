import unittest
from youtube_dl.extractor.heise import HeiseIE

class TestHeiseIE(unittest.TestCase):
    def test_real_extract(self):
        ie = HeiseIE()
        url = 'http://www.heise.de/video/artikel/Podcast-c-t-uplink-3-3-Owncloud-Tastaturen-Peilsender-Smartphone-2404147.html'
        video_id = '1_kkrq94sm'
        webpage = '<html><body>Test</body></html>'
        title = 'Podcast: c\'t uplink 3.3 – Owncloud / Tastaturen / Peilsender Smartphone'
        description = 'md5:c934cbfb326c669c2bcabcbe3d3fcd20'
        timestamp = 1512734959
        upload_date = '20171208'
        formats = []
        result = ie._real_extract(url)
        self.assertEqual(result['id'], video_id)
        self.assertEqual(result['title'], title)
        self.assertEqual(result['description'], description)
        self.assertEqual(result['timestamp'], timestamp)
        self.assertEqual(result['upload_date'], upload_date)
        self.assertEqual(result['formats'], formats)

if __name__ == '__main__':
    unittest.main()