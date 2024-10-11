import unittest
from youtube_dl.extractor.nrk import NRKIE


class TestNRKPlaylistBaseIE(unittest.TestCase):
    def test_extract_description(self):
        # Test case for _extract_description method
        webpage = "<html><body><p>This is a test description</p></body></html>"
        expected_description = "This is a test description"
        result = NRKPlaylistBaseIE._extract_description(self, webpage)
        self.assertEqual(result, expected_description)

    def test_real_extract(self):
        # Test case for _real_extract method
        url = "https://www.nrk.no/program/12345"
        playlist_id = "12345"
        webpage = "<html><body><h1>Test Playlist</h1><ul><li><a href='https://www.nrk.no/video/123'>Video 1</a></li><li><a href='https://www.nrk.no/video/456'>Video 2</a></li></ul></body></html>"
        expected_entries = ["nrk:123", "nrk:456"]
        result = NRKPlaylistBaseIE._real_extract(self, url)
        self.assertEqual(result["entries"], expected_entries)

if __name__ == '__main__':
    unittest.main()