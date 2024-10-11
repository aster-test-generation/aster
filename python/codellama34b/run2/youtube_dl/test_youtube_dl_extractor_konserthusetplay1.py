
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

    def test_search_regex(self):
        instance = KonserthusetPlayIE()
        result = instance._search_regex(r'https?://csp\.picsearch\.com/rest\?.*\be=(.+?)[&"\']', "http://www.konserthusetplay.se/?m=CKDDnlCY-dhWAAqiMERd-A", 'e')
        self.assertEqual(result, 'e')

    def test_download_webpage(self):
        instance = KonserthusetPlayIE()
        result = instance._download_webpage("http://www.konserthusetplay.se/?m=CKDDnlCY-dhWAAqiMERd-A", 'CKDDnlCY-dhWAAqiMERd-A')
        self.assertEqual(result, 'http://www.konserthusetplay.se/?m=CKDDnlCY-dhWAAqiMERd-A')

    def test_download_json(self):
        instance = KonserthusetPlayIE()
        result = instance._download_json('http://csp.picsearch.com/rest?e=e&containerId=mediaplayer&i=object', 'CKDDnlCY-dhWAAqiMERd-A', transform_source=lambda s: s[s.index('{'):s.rindex('}') + 1])
        self.assertEqual(result, 'http://csp.picsearch.com/rest?e=e&containerId=mediaplayer&i=object')

    def test_extract_m3u8_formats(self):
        instance = KonserthusetPlayIE()
        result = instance._extract_m3u8_formats('http://csp.picsearch.com/rest?e=e&containerId=mediaplayer&i=object', 'CKDDnlCY-dhWAAqiMERd-A', 'mp4', entry_protocol='m3u8_native', m3u8_id='hls', fatal=False)
        self.assertEqual(result, 'http://csp.picsearch.com/rest?e=e&containerId=mediaplayer&i=object')

    def test_sort_formats(self):
        instance = KonserthusetPlayIE()
        result = instance._sort_formats('http://csp.picsearch.com/rest?e=e&containerId=mediaplayer&i=object')
        self.assertEqual(result, 'http://csp.picsearch.com/rest?e=e&containerId=mediaplayer&i=object')

    def test_match_id(self):
        instance = KonserthusetPlayIE()
        result = instance._match_id("http://www.konserthusetplay.se/?m=CKDDnlCY-dhWAAqiMERd-A")
        self.assertEqual(result, 'CKDDnlCY-dhWAAqiMERd-A')

if __name__ == '__main__':
    unittest.main()