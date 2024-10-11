import unittest
from youtube_dl.extractor.nrk import NRKPlaylistBaseIE


class TestNRKPlaylistBaseIE(unittest.TestCase):
    def test_extract_description(self):
        ie = NRKPlaylistBaseIE()
        webpage = """
        <html>
        <head><title>NRK playlist</title></head>
        <body>
        <h1>NRK playlist title</h1>
        <p>NRK playlist description</p>
        </body>
        </html>
        """
        description = ie._extract_description(webpage)
        self.assertEqual(description, "NRK playlist description")

    def test_real_extract(self):
        ie = NRKPlaylistBaseIE()
        url = "https://www.nrk.no/program/id"
        playlist_id = "id"
        webpage = """
        <html>
        <head><title>NRK playlist</title></head>
        <body>
        <h1>NRK playlist title</h1>
        <p>NRK playlist description</p>
        <div class="program-item-list">
        <div class="program-item">
        <a href="/program/video1" class="program-item__link">Video 1</a>
        </div>
        <div class="program-item">
        <a href="/program/video2" class="program-item__link">Video 2</a>
        </div>
        </div>
        </body>
        </html>
        """
        entries = [
            {
                "id": "video1",
                "title": "Video 1",
                "url": "nrk:video1",
            },
            {
                "id": "video2",
                "title": "Video 2",
                "url": "nrk:video2",
            },
        ]
        playlist_title = "NRK playlist title"
        playlist_description = "NRK playlist description"
        self.assertEqual(ie._real_extract(url), {
            "_type": "playlist",
            "id": playlist_id,
            "title": playlist_title,
            "description": playlist_description,
            "entries": entries,
        })

if __name__ == '__main__':
    unittest.main()