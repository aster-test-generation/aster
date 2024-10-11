import unittest
from unittest.mock import patch
from youtube_dl.extractor.archiveorg import ArchiveOrgIE


class TestArchiveOrgIE(unittest.TestCase):
    def test_IE_NAME(self):
        ie = ArchiveOrgIE()
        self.assertEqual(ie.IE_NAME, 'archive.org')

    def test_IE_DESC(self):
        ie = ArchiveOrgIE()
        self.assertEqual(ie.IE_DESC, 'archive.org videos')

    def test__VALID_URL(self):
        ie = ArchiveOrgIE()
        self.assertIsNotNone(ie._VALID_URL)

    def test__TESTS(self):
        ie = ArchiveOrgIE()
        self.assertIsNotNone(ie._TESTS)

    @patch('youtube_dl.extractor.archiveorg.InfoExtractor._download_webpage')
    @patch('youtube_dl.extractor.archiveorg.InfoExtractor._search_regex')
    def test__real_extract(self, search_regex, download_webpage):
        ie = ArchiveOrgIE()
        url = 'http://archive.org/details/XD300-23_68HighlightsAResearchCntAugHumanIntellect'
        video_id = 'XD300-23_68HighlightsAResearchCntAugHumanIntellect'
        webpage = 'webpage content'
        search_regex.return_value = 'playlist'
        download_webpage.return_value = webpage
        info = ie._real_extract(url)
        self.assertIsNotNone(info)

    @patch('youtube_dl.extractor.archiveorg.InfoExtractor._download_json')
    @patch('youtube_dl.extractor.archiveorg.InfoExtractor._parse_json')
    def test__parse_jwplayer_data(self, parse_json, download_json):
        ie = ArchiveOrgIE()
        playlist = 'playlist content'
        video_id = 'video_id'
        base_url = 'http://archive.org'
        info = ie._parse_jwplayer_data({'playlist': playlist}, video_id, base_url)
        self.assertIsNotNone(info)

    @patch('youtube_dl.extractor.archiveorg.InfoExtractor._download_json')
    @patch('youtube_dl.extractor.archiveorg.InfoExtractor._parse_html5_media_entries')
    def test__parse_html5_media_entries(self, parse_html5_media_entries, download_json):
        ie = ArchiveOrgIE()
        url = 'http://archive.org/details/XD300-23_68HighlightsAResearchCntAugHumanIntellect'
        webpage = 'webpage content'
        video_id = 'XD300-23_68HighlightsAResearchCntAugHumanIntellect'
        parse_html5_media_entries.return_value = [{'id': video_id, 'ext': 'ogg'}]
        info = ie._parse_html5_media_entries(url, webpage, video_id)
        self.assertIsNotNone(info)

    @patch('youtube_dl.extractor.archiveorg.InfoExtractor._download_json')
    def test_get_optional(self, download_json):
        ie = ArchiveOrgIE()
        metadata = {'title': 'title', 'description': 'description'}
        field = 'title'
        result = ie.get_optional(metadata, field)
        self.assertEqual(result, 'title')

    @patch('youtube_dl.extractor.archiveorg.InfoExtractor._download_json')
    def test_get_optional_none(self, download_json):
        ie = ArchiveOrgIE()
        metadata = {'title': 'title', 'description': 'description'}
        field = 'non_existent_field'
        result = ie.get_optional(metadata, field)
        self.assertIsNone(result)

if __name__ == '__main__':
    unittest.main()