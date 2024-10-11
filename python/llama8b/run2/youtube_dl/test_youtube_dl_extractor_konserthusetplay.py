import unittest
from youtube_dl.extractor.konserthusetplay import KonserthusetPlayIE


class TestKonserthusetPlayIE(unittest.TestCase):
    def test_valid_url(self):
        ie = KonserthusetPlayIE()
        url = 'http://www.konserthusetplay.se/?m=CKDDnlCY-dhWAAqiMERd-A'
        self._test_url(ie, url)

    def test_only_matching(self):
        ie = KonserthusetPlayIE()
        url = 'http://rspoplay.se/?m=elWuEH34SMKvaO4wO_cHBw'
        self._test_only_matching(ie, url)

    def _test_url(self, ie, url):
        info_dict = ie._real_extract(url)
        self.assertEqual(info_dict['id'], 'CKDDnlCY-dhWAAqiMERd-A')
        self.assertEqual(info_dict['ext'], 'mp4')
        self.assertEqual(info_dict['title'], 'Orkesterns instrument: Valthornen')
        self.assertEqual(info_dict['description'], 'md5:f10e1f0030202020396a4d712d2fa827')
        self.assertEqual(info_dict['thumbnail'], 're:^https?://.*$')
        self.assertAlmostEqual(info_dict['duration'], 398.76)

    def _test_only_matching(self, ie, url):
        info_dict = ie._real_extract(url)
        self.assertTrue(info_dict)

    def test_real_extract(self):
        ie = KonserthusetPlayIE()
        url = 'http://www.konserthusetplay.se/?m=CKDDnlCY-dhWAAqiMERd-A'
        webpage = ie._download_webpage(url, 'CKDDnlCY-dhWAAqiMERd-A')
        self.assertIsNotNone(webpage)

    def test_search_regex(self):
        ie = KonserthusetPlayIE()
        webpage = 'https://csp.picsearch.com/rest?e=123&containerId=mediaplayer&i=object'
        e = ie._search_regex(r'https?://csp\.picsearch\.com/rest\?.*\be=(.+?)[&"\']', webpage, 'e')
        self.assertEqual(e, '123')

    def test_download_json(self):
        ie = KonserthusetPlayIE()
        rest = ie._download_json('http://csp.picsearch.com/rest?e=123&containerId=mediaplayer&i=object', 'CKDDnlCY-dhWAAqiMERd-A', transform_source=lambda s: s[s.index('{'):s.rindex('}') + 1])
        self.assertIsNotNone(rest)

    def test_sort_formats(self):
        ie = KonserthusetPlayIE()
        formats = [
            {'url': 'url1', 'format_id': 'format1'},
            {'url': 'url2', 'format_id': 'format2'},
        ]
        ie._sort_formats(formats)
        self.assertEqual(formats, sorted(formats, key=lambda x: x['format_id']))

    def test_search_regex_format_id(self):
        ie = KonserthusetPlayIE()
        url = 'http://www.konserthusetplay.se/video1.mp4'
        format_id = ie._search_regex(r'_([^_]+)_h264m\.mp4', url, 'format id', default=None)
        self.assertEqual(format_id, 'video1')

    def test_search_regex_fallback_format_id(self):
        ie = KonserthusetPlayIE()
        url = 'http://www.konserthusetplay.se/fallback.mp4'
        format_id = ie._search_regex(r'_([^_]+)_h264m\.mp4', url, 'format id', default=None)
        self.assertEqual(format_id, 'fallback')

    def test_int_or_none(self):
        ie = KonserthusetPlayIE()
        value = 123
        result = ie._int_or_none(value)
        self.assertEqual(result, 123)

        value = None
        result = ie._int_or_none(value)
        self.assertIsNone(result)

    def test_float_or_none(self):
        ie = KonserthusetPlayIE()
        value = 123.456
        result = ie._float_or_none(value)
        self.assertAlmostEqual(result, 123.456)

        value = None
        result = ie._float_or_none(value)
        self.assertIsNone(result)

if __name__ == '__main__':
    unittest.main()