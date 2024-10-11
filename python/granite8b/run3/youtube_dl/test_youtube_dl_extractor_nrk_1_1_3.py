import unittest
from youtube_dl.extractor.nrk import NRKPlaylistBaseIE


class TestNRKPlaylistBaseIE(unittest.TestCase):
    def test_extract_description(self):
        ie = NRKPlaylistBaseIE()
        webpage = """
        <html>
        <head>
        <title>NRK playlist</title>
        </head>
        <body>
        <div id="playlist-description">
        This is a test description.
        </div>
        </body>
        </html>
        """
        description = ie._extract_description(webpage)
        self.assertEqual(description, "This is a test description.")

    def test_real_extract(self):
        ie = NRKPlaylistBaseIE()
        url = "https://www.nrk.no/program/NR1/2022-01-01"
        webpage = """
        <html>
        <head>
        <title>NRK playlist</title>
        </head>
        <body>
        <div id="playlist-items">
        <div class="playlist-item">
        <a href="https://www.nrk.no/program/NR1/2022-01-01/123456">Video 1</a>
        </div>
        <div class="playlist-item">
        <a href="https://www.nrk.no/program/NR1/2022-01-01/789012">Video 2</a>
        </div>
        </div>
        </body>
        </html>
        """
        entries = ie._real_extract(url)
        self.assertEqual(len(entries), 2)
        self.assertEqual(entries[0]['id'], "123456")
        self.assertEqual(entries[1]['id'], "789012")

if __name__ == '__main__':
    unittest.main()