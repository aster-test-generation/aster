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
        <div class="description">
        This is a test description.
        </div>
        </body>
        </html>
        """
        description = ie._extract_description(webpage)
        self.assertEqual(description, "This is a test description.")

    def test_real_extract(self):
        ie = NRKPlaylistBaseIE()
        url = "https://www.nrk.no/program/123456"
        playlist_id = "123456"
        webpage = """
        <html>
        <head>
        <title>NRK playlist</title>
        </head>
        <body>
        <div class="playlist">
        <ul>
        <li><a href="https://www.nrk.no/program/video/123456">Video 1</a></li>
        <li><a href="https://www.nrk.no/program/video/234567">Video 2</a></li>
        <li><a href="https://www.nrk.no/program/video/345678">Video 3</a></li>
        </ul>
        </div>
        </body>
        </html>
        """
        entries = [
            {"id": "123456"},
            {"id": "234567"},
            {"id": "345678"},
        ]
        playlist_title = "NRK playlist"
        playlist_description = "This is a test playlist description."
        self.assertEqual(ie._real_extract(url), {
            "_type": "playlist",
            "id": playlist_id,
            "title": playlist_title,
            "description": playlist_description,
            "entries": entries,
        })

if __name__ == '__main__':
    unittest.main()