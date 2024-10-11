import unittest
from youtube_dl.postprocessor.metadatafromtitle import MetadataFromTitlePP

class TestMetadataFromTitlePP(unittest.TestCase):
    def test_init(self):
        downloader = object()
        titleformat = "some title format"
        instance = MetadataFromTitlePP(downloader, titleformat)
        self.assertEqual(instance._titleformat, titleformat)
        self.assertIsNotNone(instance._titleregex)

    def test_format_to_regex(self):
        instance = MetadataFromTitlePP(object(), "%(artist)s - %(title)s")
        regex = instance.format_to_regex("%(artist)s - %(title)s")
        self.assertEqual(regex, r'(?P<artist>.+) - (?P<title>.+)')

    def test_run_match(self):
        instance = MetadataFromTitlePP(object(), "%(artist)s - %(title)s")
        info = {"title": "Artist - Song"}
        result, info = instance.run(info)
        self.assertEqual(result, [])
        self.assertEqual(info, {"title": "Artist - Song", "artist": "Artist", "title": "Song"})

    def test_run_no_match(self):
        instance = MetadataFromTitlePP(object(), "%(artist)s - %(title)s")
        info = {"title": "Invalid title"}
        result, info = instance.run(info)
        self.assertEqual(result, [])
        self.assertEqual(info, {"title": "Invalid title"})

    def test_private_format_to_regex(self):
        instance = MetadataFromTitlePP(object(), "%(artist)s - %(title)s")
        regex = instance._MetadataFromTitlePP__format_to_regex("%(artist)s - %(title)s")
        self.assertEqual(regex, r'(?P<artist>.+) - (?P<title>.+)')

    def test_str_method(self):
        instance = MetadataFromTitlePP(object(), "%(artist)s - %(title)s")
        result = instance.__str__()
        self.assertEqual(result, "MetadataFromTitlePP")

    def test_repr_method(self):
        instance = MetadataFromTitlePP(object(), "%(artist)s - %(title)s")
        result = instance.__repr__()
        self.assertEqual(result, "MetadataFromTitlePP(downloader, '%(artist)s - %(title)s')")

if __name__ == '__main__':
    unittest.main()