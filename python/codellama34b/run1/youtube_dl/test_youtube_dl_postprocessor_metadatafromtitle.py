import unittest
from youtube_dl.postprocessor.metadatafromtitle import MetadataFromTitlePP


class TestMetadataFromTitlePP(unittest.TestCase):
    def test_init(self):
        downloader = None
        titleformat = None
        instance = MetadataFromTitlePP(downloader, titleformat)
        self.assertEqual(instance._titleformat, titleformat)
        self.assertEqual(instance._titleregex, titleformat)

    def test_format_to_regex(self):
        instance = MetadataFromTitlePP(None, None)
        fmt = None
        result = instance.format_to_regex(fmt)
        self.assertEqual(result, fmt)

    def test_run(self):
        instance = MetadataFromTitlePP(None, None)
        info = {}
        result = instance.run(info)
        self.assertEqual(result, ([], info))

if __name__ == '__main__':
    unittest.main()