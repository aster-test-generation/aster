import unittest
from youtube_dl.extractor.nrk import NRKTVEpisodesIE


class TestNRKTVEpisodesIE(unittest.TestCase):
    def test_extract_title(self):
        webpage = """
        <html>
        <head>
        <title>NRK TV - Program - Example Title</title>
        </head>
        <body>
        <h1>Example Title</h1>
        </body>
        </html>
        """
        ie = NRKTVEpisodesIE()
        title = ie._extract_title(webpage)
        self.assertEqual(title, "Example Title")

if __name__ == '__main__':
    unittest.main()