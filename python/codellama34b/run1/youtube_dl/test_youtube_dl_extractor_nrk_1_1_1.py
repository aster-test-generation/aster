from youtube_dl.extractor.nrk import NRKIE
import unittest
from youtube_dl.extractor.nrk import NRKBaseIE


class TestNRKBaseIE(unittest.TestCase):
    def test_extract_nrk_formats(self):
        instance = NRKBaseIE()
        result = instance._extract_nrk_formats("https://example.com", "123")
        self.assertEqual(result, [])

    def test_raise_error(self):
        instance = NRKBaseIE()
        data = {"messageType": "ProgramRightsAreNotReady"}
        self.assertRaises(ExtractorError, instance._raise_error, data)

    def test_call_api(self):
        instance = NRKBaseIE()
        result = instance._call_api("path", "123", "item", "note", True, "query")
        self.assertEqual(result, {})

if __name__ == '__main__':
    unittest.main()