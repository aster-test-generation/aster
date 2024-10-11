import unittest
from youtube_dl.postprocessor import MetadataFromTitlePP

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