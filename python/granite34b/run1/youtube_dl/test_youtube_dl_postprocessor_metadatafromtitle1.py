import unittest
from youtube_dl.postprocessor.metadatafromtitle import MetadataFromTitlePP

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