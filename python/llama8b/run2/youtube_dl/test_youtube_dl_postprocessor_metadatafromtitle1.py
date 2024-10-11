import unittest
from youtube_dl.postprocessor import MetadataFromTitlePP

class TestMetadataFromTitlePP(unittest.TestCase):
    def test_init(self):
        downloader = object()
        titleformat = 'Test Title Format'
        instance = MetadataFromTitlePP(downloader, titleformat)
        self.assertEqual(instance._titleformat, titleformat)
        self.assertEqual(instance._titleregex, titleformat)

    def test_format_to_regex(self):
        instance = MetadataFromTitlePP(object(), 'Test %1$s %2$s')
        regex = instance.format_to_regex(instance._titleformat)
        self.assertEqual(regex, r'Test (.+) (.+)')

    def test_run(self):
        downloader = object()
        info = {'title': 'Test Title'}
        instance = MetadataFromTitlePP(downloader, 'Test %1$s')
        result, info = instance.run(info)
        self.assertEqual(result, [])
        self.assertEqual(info, {'title': 'Test Title'})

    def test_run_no_match(self):
        downloader = object()
        info = {'title': 'Test Title'}
        instance = MetadataFromTitlePP(downloader, 'Test %1$s')
        result, info = instance.run(info)
        self.assertEqual(result, [])
        self.assertEqual(info, {'title': 'Test Title'})

    def test_run_with_match(self):
        downloader = object()
        info = {'title': 'Test %1$s'}
        instance = MetadataFromTitlePP(downloader, 'Test %1$s')
        result, info = instance.run(info)
        self.assertEqual(result, [])
        self.assertEqual(info, {'title': 'Test %1$s'})

    def test_run_with_multiple_matches(self):
        downloader = object()
        info = {'title': 'Test %1$s %2$s'}
        instance = MetadataFromTitlePP(downloader, 'Test %1$s %2$s')
        result, info = instance.run(info)
        self.assertEqual(result, [])
        self.assertEqual(info, {'title': 'Test %1$s %2$s'})

    def test_run_with_na_value(self):
        downloader = object()
        info = {'title': 'Test %1$s'}
        instance = MetadataFromTitlePP(downloader, 'Test %1$s')
        result, info = instance.run(info)
        self.assertEqual(result, [])
        self.assertEqual(info, {'title': 'Test NA'})

    def test_run_with_none_value(self):
        downloader = object()
        info = {'title': 'Test %1$s'}
        instance = MetadataFromTitlePP(downloader, 'Test %1$s')
        result, info = instance.run(info)
        self.assertEqual(result, [])
        self.assertEqual(info, {'title': 'Test None'})

if __name__ == '__main__':
    unittest.main()