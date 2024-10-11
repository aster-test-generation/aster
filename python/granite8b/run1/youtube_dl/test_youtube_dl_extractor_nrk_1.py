import unittest
from youtube_dl.extractor.nrk import NRKTVEpisodesIE


class TestNRKTVEpisodesIE(unittest.TestCase):
    def test_extract_title(self):
        ie = NRKTVEpisodesIE()
        webpage = """
        <html>
        <head>
        <title>NRK TV - Program - Title</title>
        </head>
        <body>
        <h1>Title</h1>
        </body>
        </html>
        """
        title = ie._extract_title(webpage)
        self.assertEqual(title, "Title")

if __name__ == '__main__':
    unittest.main()