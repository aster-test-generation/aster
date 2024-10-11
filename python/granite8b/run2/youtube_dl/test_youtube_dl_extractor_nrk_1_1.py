import unittest
from youtube_dl.extractor.nrk import NRKPlaylistIE


class TestNRKPlaylistIE(unittest.TestCase):
    def test_extract_title(self):
        ie = NRKPlaylistIE()
        webpage = """
        <html>
            <head>
                <title>NRK playlist</title>
            </head>
            <body>
                <h1>NRK playlist</h1>
            </body>
        </html>
        """
        title = ie._extract_title(webpage)
        self.assertEqual(title, "NRK playlist")

    def test_extract_description(self):
        ie = NRKPlaylistIE()
        webpage = """
        <html>
            <head>
                <title>NRK playlist</title>
            </head>
            <body>
                <h1>NRK playlist</h1>
                <p>This is a description of the NRK playlist.</p>
            </body>
        </html>
        """
        description = ie._extract_description(webpage)
        self.assertEqual(description, "This is a description of the NRK playlist.")

if __name__ == '__main__':
    unittest.main()