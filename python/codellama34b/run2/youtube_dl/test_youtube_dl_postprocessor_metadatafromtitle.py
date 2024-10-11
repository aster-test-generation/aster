import unittest
from youtube_dl.postprocessor.metadatafromtitle import MetadataFromTitlePP


class TestMetadataFromTitlePP(unittest.TestCase):
    def test_init(self):
        instance = MetadataFromTitlePP(None, None)
        self.assertIsInstance(instance, MetadataFromTitlePP)

    def test_format_to_regex(self):
        instance = MetadataFromTitlePP(None, None)
        result = instance.format_to_regex(None)
        self.assertEqual(result, None)

    def test_run(self):
        instance = MetadataFromTitlePP(None, None)
        result = instance.run(None)
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()