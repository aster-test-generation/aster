import unittest
from youtube_dl.extractor.nrk import NRKIE



class TestNRKIE(unittest.TestCase):
    def test_real_extract(self):
        instance = NRKIE()
        result = instance._real_extract("https://www.nrk.no/video/nrk_super/D100000000000/")
        self.assertEqual(result, {'id': 'D100000000000', 'title': 'title', 'alt_title': 'alt_title', 'description': 'description', 'duration': 100, 'thumbnails': [{'url': 'url', 'width': 100, 'height': 100}], 'age_limit': 18, 'formats': [{'url': 'url', 'format_id': 'format_id', 'vcodec': 'vcodec'}], 'subtitles': {'nb': [{'url': 'url'}]}})

    def test_call_playback_api(self):
        instance = NRKIE()
        result = instance.call_playback_api("manifest", {'preferredCdn': 'akamai'})
        self.assertEqual(result, {'id': 'D100000000000', 'title': 'title', 'alt_title': 'alt_title', 'description': 'description', 'duration': 100, 'thumbnails': [{'url': 'url', 'width': 100, 'height': 100}], 'age_limit': 18, 'formats': [{'url': 'url', 'format_id': 'format_id', 'vcodec': 'vcodec'}], 'subtitles': {'nb': [{'url': 'url'}]}})

    def test_extract_nrk_formats(self):
        instance = NRKIE()
        result = instance.extract_nrk_formats("url", "D100000000000")
        self.assertEqual(result, [{'url': 'url', 'format_id': 'format_id', 'vcodec': 'vcodec'}])

    def test_call_api(self):
        instance = NRKIE()
        result = instance.call_api("path_templ", "D100000000000", "item", {'preferredCdn': 'akamai'})
        self.assertEqual(result, {'id': 'D100000000000', 'title': 'title', 'alt_title': 'alt_title', 'description': 'description', 'duration': 100, 'thumbnails': [{'url': 'url', 'width': 100, 'height': 100}], 'age_limit': 18, 'formats': [{'url': 'url', 'format_id': 'format_id', 'vcodec': 'vcodec'}], 'subtitles': {'nb': [{'url': 'url'}]}})

    def test_match_id(self):
        instance = NRKIE()
        result = instance.match_id("https://www.nrk.no/video/nrk_super/D100000000000/")
        self.assertEqual(result, "D100000000000")

    def test_raise_error(self):
        instance = NRKIE()
        result = instance.raise_error("nonPlayable")
        self.assertEqual(result, {'id': 'D100000000000', 'title': 'title', 'alt_title': 'alt_title', 'description': 'description', 'duration': 100, 'thumbnails': [{'url': 'url', 'width': 100, 'height': 100}], 'age_limit': 18, 'formats': [{'url': 'url', 'format_id': 'format_id', 'vcodec': 'vcodec'}], 'subtitles': {'nb': [{'url': 'url'}]}})

if __name__ == '__main__':
    unittest.main()