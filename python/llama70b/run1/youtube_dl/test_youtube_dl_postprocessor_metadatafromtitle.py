import unittest
from youtube_dl.postprocessor import metadatafromtitle


class TestMetadataFromTitlePP(unittest.TestCase):
    def test_init(self):
        downloader = object()
        titleformat = "Test title format"
        instance = metadatafromtitle.MetadataFromTitlePP(downloader, titleformat)
        self.assertEqual(instance._titleformat, titleformat)

    def test_format_to_regex(self):
        instance = metadatafromtitle.MetadataFromTitlePP(object(), "Test title format")
        fmt = "%(artist)s - %(title)s"
        regex = instance.format_to_regex(fmt)
        self.assertEqual(regex, r"(?P<artist>.+) - (?P<title>.+)")

    def test_run(self):
        downloader = object()
        titleformat = "%(artist)s - %(title)s"
        instance = metadatafromtitle.MetadataFromTitlePP(downloader, titleformat)
        info = {"title": "Artist - Song"}
        result, info = instance.run(info)
        self.assertEqual(result, [])
        self.assertEqual(info, {"title": "Artist - Song", "artist": "Artist", "title": "Song"})

    def test_run_no_match(self):
        downloader = object()
        titleformat = "%(artist)s - %(title)s"
        instance = metadatafromtitle.MetadataFromTitlePP(downloader, titleformat)
        info = {"title": "Invalid title"}
        result, info = instance.run(info)
        self.assertEqual(result, [])
        self.assertEqual(info, {"title": "Invalid title"})

    def test_private__init__(self):
        downloader = object()
        titleformat = "Test title format"
        instance = metadatafromtitle.MetadataFromTitlePP(downloader, titleformat)
        self.assertEqual(instance._MetadataFromTitlePP__init__(downloader, titleformat), None)

    def test_str_method(self):
        instance = metadatafromtitle.MetadataFromTitlePP(object(), "Test title format")
        result = instance.__str__()
        self.assertEqual(result, "MetadataFromTitlePP")

    def test_repr_method(self):
        instance = metadatafromtitle.MetadataFromTitlePP(object(), "Test title format")
        result = instance.__repr__()
        self.assertEqual(result, "MetadataFromTitlePP(<object object at 0x...>, 'Test title format')")

if __name__ == '__main__':
    unittest.main()