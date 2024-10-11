import unittest
from youtube_dl.extractor.nrk import NRKIE


class TestNRKBaseIE(unittest.TestCase):
    def test_extract_nrk_formats(self):
        instance = NRKBaseIE()
        result = instance._extract_nrk_formats("https://example.com/", "video_id")
        self.assertEqual(result, [])

    def test_raise_error(self):
        instance = NRKBaseIE()
        data = {"messageType": "ProgramRightsAreNotReady"}
        with self.assertRaises(ExtractorError):
            instance._raise_error(data)

    def test_call_api(self):
        instance = NRKBaseIE()
        result = instance._call_api("path", "video_id", "item", "note", False, "query")
        self.assertEqual(result, {})

if __name__ == '__main__':
    unittest.main()