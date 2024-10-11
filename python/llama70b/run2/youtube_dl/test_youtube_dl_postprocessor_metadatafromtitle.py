import unittest
from youtube_dl.postprocessor.metadatafromtitle import MetadataFromTitlePP


class TestMetadataFromTitlePP(unittest.TestCase):
    def test_init(self):
        downloader = object()
        titleformat = "some title format"
        instance = MetadataFromTitlePP(downloader, titleformat)
        self.assertEqual(instance._titleformat, titleformat)

    def test_format_to_regex(self):
        instance = MetadataFromTitlePP(object(), "some title format")
        fmt = "%(artist)s - %(title)s"
        regex = instance.format_to_regex(fmt)
        self.assertEqual(regex, r"(?P<artist>.+) - (?P<title>.+)")

    def test_run_match(self):
        instance = MetadataFromTitlePP(object(), "%(artist)s - %(title)s")
        info = {"title": "Artist - Song"}
        result, info = instance.run(info)
        self.assertEqual(info, {"title": "Artist - Song", "artist": "Artist", "title": "Song"})

    def test_run_no_match(self):
        instance = MetadataFromTitlePP(object(), "%(artist)s - %(title)s")
        info = {"title": "Invalid title"}
        result, info = instance.run(info)
        self.assertEqual(info, {"title": "Invalid title"})

    def test_private_method__init__(self):
        downloader = object()
        titleformat = "some title format"
        instance = MetadataFromTitlePP(downloader, titleformat)
        self.assertEqual(instance._MetadataFromTitlePP__init__(downloader, titleformat), None)

    def test_str_method(self):
        instance = MetadataFromTitlePP(object(), "some title format")
        result = instance.__str__()
        self.assertEqual(result, "MetadataFromTitlePP")

    def test_repr_method(self):
        instance = MetadataFromTitlePP(object(), "some title format")
        result = instance.__repr__()
        self.assertEqual(result, "MetadataFromTitlePP(some title format)")

if __name__ == '__main__':
    unittest.main()