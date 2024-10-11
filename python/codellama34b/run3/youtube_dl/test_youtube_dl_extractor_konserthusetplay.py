import unittest
from youtube_dl.extractor.konserthusetplay import *



class TestKonserthusetPlayIE(unittest.TestCase):
    def test_real_extract(self):
        instance = KonserthusetPlayIE()
        result = instance._real_extract(url)
        self.assertEqual(result, {
            'id': video_id,
            'title': title,
            'description': description,
            'thumbnail': thumbnail,
            'duration': duration,
            'formats': formats,
            'subtitles': subtitles,
        })

    def test_search_regex(self):
        instance = KonserthusetPlayIE()
        result = instance._search_regex(regex, webpage, group, default=None)
        self.assertEqual(result, video_id)

    def test_download_webpage(self):
        instance = KonserthusetPlayIE()
        result = instance._download_webpage(url, video_id)
        self.assertEqual(result, webpage)

    def test_download_json(self):
        instance = KonserthusetPlayIE()
        result = instance._download_json(url, video_id, transform_source=lambda s: s[s.index('{'):s.rindex('}') + 1])
        self.assertEqual(result, rest)

    def test_sort_formats(self):
        instance = KonserthusetPlayIE()
        instance._sort_formats(formats)
        self.assertEqual(formats, formats)

    def test_extract_m3u8_formats(self):
        instance = KonserthusetPlayIE()
        result = instance._extract_m3u8_formats(m3u8_url, video_id, 'mp4', entry_protocol='m3u8_native', m3u8_id='hls', fatal=False)
        self.assertEqual(result, formats)

    def test_match_id(self):
        instance = KonserthusetPlayIE()
        result = instance._match_id(url)
        self.assertEqual(result, video_id)

    def test_extract_m3u8_formats(self):
        instance = KonserthusetPlayIE()
        result = instance._extract_m3u8_formats(m3u8_url, video_id, 'mp4', entry_protocol='m3u8_native', m3u8_id='hls', fatal=False)
        self.assertEqual(result, formats)

    def test_download_json(self):
        instance = KonserthusetPlayIE()
        result = instance._download_json('https://www.youtube.com/watch?v=4x0m4XjvngM', video_id, transform_source=lambda s: s[s.index('{'):s.rindex('}') + 1])
        self.assertEqual(result, rest)

    def test_download_webpage(self):
        instance = KonserthusetPlayIE()
        result = instance._download_webpage('http://www.youtube.com/watch?v=12345', '12345')
        self.assertEqual(result, webpage)

    def test_search_regex(self):
        instance = KonserthusetPlayIE()
        result = instance._search_regex(r'regex', webpage, group, default=None)
        self.assertEqual(result, video_id)

    def test_sort_formats(self):
        instance = KonserthusetPlayIE()
        instance._sort_formats(instance.formats)
        self.assertEqual(formats, formats)

    def test_extract_m3u8_formats(self):
        instance = KonserthusetPlayIE()
        result = instance._extract_m3u8_formats('m3u8_url', video_id, 'mp4', entry_protocol='m3u8_native', m3u8_id='hls', fatal=False)
        self.assertEqual(result, formats)

    def test_match_id(self):
        instance = KonserthusetPlayIE()
        result = instance._match_id('https://www.example.com/')
        self.assertEqual(result, video_id)

class TestKonserthusetPlayIE(unittest.TestCase):
    def test_real_extract(self):
        instance = KonserthusetPlayIE()
        result = instance._real_extract("http://www.konserthusetplay.se/?m=CKDDnlCY-dhWAAqiMERd-A")
        self.assertEqual(result, {
            'id': 'CKDDnlCY-dhWAAqiMERd-A',
            'ext': 'mp4',
            'title': 'Orkesterns instrument: Valthornen',
            'description': 'md5:f10e1f0030202020396a4d712d2fa827',
            'thumbnail': 're:^https?://.*$',
            'duration': 398.76,
        })

    def test_search_regex(self):
        instance = KonserthusetPlayIE()
        result = instance._search_regex(r'https?://csp\.picsearch\.com/rest\?.*\be=(.+?)[&"\']', "http://www.konserthusetplay.se/?m=CKDDnlCY-dhWAAqiMERd-A", 'e')
        self.assertEqual(result, "e")

    def test_download_webpage(self):
        instance = KonserthusetPlayIE()
        result = instance._download_webpage("http://www.konserthusetplay.se/?m=CKDDnlCY-dhWAAqiMERd-A", "CKDDnlCY-dhWAAqiMERd-A")
        self.assertEqual(result, "http://www.konserthusetplay.se/?m=CKDDnlCY-dhWAAqiMERd-A")

    def test_download_json(self):
        instance = KonserthusetPlayIE()
        result = instance._download_json("http://csp.picsearch.com/rest?e=e&containerId=mediaplayer&i=object", "CKDDnlCY-dhWAAqiMERd-A", transform_source=lambda s: s[s.index('{'):s.rindex('}') + 1])
        self.assertEqual(result, "http://csp.picsearch.com/rest?e=e&containerId=mediaplayer&i=object")

    def test_extract_m3u8_formats(self):
        instance = KonserthusetPlayIE()
        result = instance._extract_m3u8_formats("http://csp.picsearch.com/rest?e=e&containerId=mediaplayer&i=object", "CKDDnlCY-dhWAAqiMERd-A", 'mp4', entry_protocol='m3u8_native', m3u8_id='hls', fatal=False)
        self.assertEqual(result, "http://csp.picsearch.com/rest?e=e&containerId=mediaplayer&i=object")

    def test_sort_formats(self):
        instance = KonserthusetPlayIE()
        result = instance._sort_formats([{
            'vbr': int_or_none(f.get('bitrate')),
            'width': int_or_none(f.get('width')),
            'height': int_or_none(f.get('height')),
        }])
        self.assertEqual(result, [{
            'vbr': int_or_none(f.get('bitrate')),
            'width': int_or_none(f.get('width')),
            'height': int_or_none(f.get('height')),
        }])

    def test_match_id(self):
        instance = KonserthusetPlayIE()
        result = instance._match_id("http://www.konserthusetplay.se/?m=CKDDnlCY-dhWAAqiMERd-A")
        self.assertEqual(result, "CKDDnlCY-dhWAAqiMERd-A")

if __name__ == '__main__':
    unittest.main()