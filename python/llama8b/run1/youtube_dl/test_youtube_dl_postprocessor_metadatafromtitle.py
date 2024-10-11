import unittest
from youtube_dl.postprocessor import MetadataFromTitlePP


class TestMetadataFromTitlePP(unittest.TestCase):
    def test_init(self):
        downloader = object()
        titleformat = "Test Title Format"
        instance = MetadataFromTitlePP(downloader, titleformat)
        self.assertEqual(instance._titleformat, titleformat)
        self.assertEqual(instance._titleregex, titleformat)

    def test_format_to_regex(self):
        instance = MetadataFromTitlePP(object(), "Test %title%")
        regex = instance.format_to_regex("Test %title%")
        self.assertEqual(regex, r'Test (.+)')

    def test_run(self):
        downloader = object()
        titleformat = "Test Title Format"
        instance = MetadataFromTitlePP(downloader, titleformat)
        info = {'title': 'Test Title'}
        result = instance.run(info)
        self.assertEqual(result, ([], info))
        self.assertEqual(info, {'title': 'Test Title'})

    def test_run_with_match(self):
        downloader = object()
        titleformat = "Test %title%"
        instance = MetadataFromTitlePP(downloader, titleformat)
        info = {'title': 'Test Title'}
        result = instance.run(info)
        self.assertEqual(result, ([], info))
        self.assertEqual(info, {'title': 'Test Title'})

    def test_run_without_match(self):
        downloader = object()
        titleformat = "Test %title%"
        instance = MetadataFromTitlePP(downloader, titleformat)
        info = {'title': 'Test Title 2'}
        result = instance.run(info)
        self.assertEqual(result, ([], info))
        self.assertEqual(info, {'title': 'Test Title 2'})

    def test_str_method(self):
        instance = MetadataFromTitlePP(object(), "Test Title Format")
        result = str(instance)
        self.assertEqual(result, 'MetadataFromTitlePP')

    def test_repr_method(self):
        instance = MetadataFromTitlePP(object(), "Test Title Format")
        result = repr(instance)
        self.assertEqual(result, 'MetadataFromTitlePP')

if __name__ == '__main__':
    unittest.main()