import unittest
from youtube_dl.postprocessor.metadatafromtitle import MetadataFromTitlePP
from youtube_dl.postprocessor import MetadataFromTitlePP


class TestMetadataFromTitlePP(unittest.TestCase):
    def test_init(self):
        downloader = object()
        titleformat = 'Test Title Format'
        instance = MetadataFromTitlePP(downloader, titleformat)
        self.assertEqual(instance._titleformat, titleformat)
        self.assertEqual(instance._titleregex, titleformat)

    def test_format_to_regex(self):
        instance = MetadataFromTitlePP(object(), 'Test %title%')
        regex = instance.format_to_regex('Test %title%')
        self.assertEqual(regex, 'Test (.+)')

    def test_run(self):
        downloader = object()
        title = 'Test Video Title'
        info = {'title': title}
        instance = MetadataFromTitlePP(downloader, 'Test %title%')
        result, info = instance.run(info)
        self.assertEqual(result, [])
        self.assertEqual(info, {'title': title})

    def test_run_no_match(self):
        downloader = object()
        title = 'Test Video Title'
        info = {'title': title}
        instance = MetadataFromTitlePP(downloader, 'Test %wrong%')
        result, info = instance.run(info)
        self.assertEqual(result, [])
        self.assertEqual(info, {'title': title})

    def test_str_method(self):
        instance = MetadataFromTitlePP(object(), 'Test %title%')
        result = str(instance)
        self.assertEqual(result, 'MetadataFromTitlePP')

    def test_repr_method(self):
        instance = MetadataFromTitlePP(object(), 'Test %title%')
        result = repr(instance)
        self.assertEqual(result, 'MetadataFromTitlePP()')

class TestMetadataFromTitlePP(unittest.TestCase):
    def test_init(self):
        downloader = object()
        titleformat = 'test'
        metadata_from_title_pp = MetadataFromTitlePP(downloader, titleformat)
        self.assertEqual(metadata_from_title_pp._titleformat, titleformat)
        self.assertEqual(metadata_from_title_pp._titleregex, titleformat)

    def test_format_to_regex(self):
        metadata_from_title_pp = MetadataFromTitlePP(object(), 'test')
        fmt = '%(title)s'
        regex = metadata_from_title_pp.format_to_regex(fmt)
        self.assertEqual(regex, fmt)

        fmt = '%(title)s %(uploader)s'
        regex = metadata_from_title_pp.format_to_regex(fmt)
        self.assertEqual(regex, fmt)

        fmt = 'test %%(title)s'
        with self.assertRaises(re.error):
            metadata_from_title_pp.format_to_regex(fmt)

    def test_run(self):
        metadata_from_title_pp = MetadataFromTitlePP(object(), '%(title)s')
        info = {'title': 'test title'}
        result = metadata_from_title_pp.run(info)
        self.assertEqual(result, ([], info))
        self.assertEqual(info, {'title': 'test title'})

        info = {'title': 'test title %s'}
        result = metadata_from_title_pp.run(info)
        self.assertEqual(result, ([], info))
        self.assertEqual(info, {'title': 'test title %s'})

        info = {'title': 'test title %s %s'}
        result = metadata_from_title_pp.run(info)
        self.assertEqual(result, ([], info))
        self.assertEqual(info, {'title': 'test title %s %s'})

    def test_run_no_match(self):
        metadata_from_title_pp = MetadataFromTitlePP(object(), '%(title)s')
        info = {'title': 'test'}
        result = metadata_from_title_pp.run(info)
        self.assertEqual(result, ([], info))
        self.assertEqual(info, {'title': 'test'})

    def test_run_multiple_matches(self):
        metadata_from_title_pp = MetadataFromTitlePP(object(), '%(title)s %(uploader)s')
        info = {'title': 'test title', 'uploader': 'test uploader'}
        result = metadata_from_title_pp.run(info)
        self.assertEqual(result, ([], info))
        self.assertEqual(info, {'title': 'test title', 'uploader': 'test uploader'})

    def test_run_no_uploader(self):
        metadata_from_title_pp = MetadataFromTitlePP(object(), '%(title)s %(uploader)s')
        info = {'title': 'test title'}
        result = metadata_from_title_pp.run(info)
        self.assertEqual(result, ([], info))
        self.assertEqual(info, {'title': 'test title'})

    def test_run_no_title(self):
        metadata_from_title_pp = MetadataFromTitlePP(object(), '%(title)s %(uploader)s')
        info = {'uploader': 'test uploader'}
        result = metadata_from_title_pp.run(info)
        self.assertEqual(result, ([], info))
        self.assertEqual(info, {'uploader': 'test uploader'})

if __name__ == '__main__':
    unittest.main()