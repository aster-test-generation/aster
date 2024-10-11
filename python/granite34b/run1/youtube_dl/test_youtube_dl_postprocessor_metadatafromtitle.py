import unittest
from youtube_dl.postprocessor.metadatafromtitle import MetadataFromTitlePP

class TestMetadataFromTitlePP(unittest.TestCase):
    def test_init(self):
        pp = MetadataFromTitlePP(None, "test")
        self.assertEqual(pp._titleformat, "test")
        self.assertEqual(pp._titleregex, "test")
    def test_format_to_regex(self):
        pp = MetadataFromTitlePP(None, "%(artist)s - %(title)s")
        self.assertEqual(pp.format_to_regex("%(artist)s - %(title)s"), r'(?P<artist>.+) - (?P<title>.+)')
    def test_run(self):
        pp = MetadataFromTitlePP(None, "%(artist)s - %(title)s")
        info = {
            "title": "artist - title",
        }
        pp.run(info)
        self.assertEqual(info["artist"], "artist")
        self.assertEqual(info["title"], "title")

class TestMetadataFromTitlePP(unittest.TestCase):
    def test_init(self):
        pp = MetadataFromTitlePP(None, "titleformat")
        self.assertEqual(pp._titleformat, "titleformat")
        self.assertEqual(pp._titleregex, "titleformat")

    def test_format_to_regex(self):
        pp = MetadataFromTitlePP(None, "titleformat")
        regex = pp.format_to_regex("titleformat")
        self.assertEqual(regex, "titleformat")

    def test_run(self):
        pp = MetadataFromTitlePP(None, "titleformat")
        info = {"title": "title"}
        pp.run(info)
        self.assertEqual(info["title"], "title")

if __name__ == '__main__':
    unittest.main()