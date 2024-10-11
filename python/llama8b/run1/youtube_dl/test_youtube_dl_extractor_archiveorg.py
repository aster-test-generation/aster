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
    @patch('youtube_dl.extractor.archiveorg.InfoExtractor._match_id')
    def test__real_extract(self, mock_match_id, mock_download_webpage):
        ie = ArchiveOrgIE()
        url = 'http://archive.org/details/XD300-23_68HighlightsAResearchCntAugHumanIntellect'
        mock_match_id.return_value = 'XD300-23_68HighlightsAResearchCntAugHumanIntellect'
        mock_download_webpage.return_value = 'webpage content'
        result = ie._real_extract(url)
        self.assertIsNotNone(result)

    @patch('youtube_dl.extractor.archiveorg.InfoExtractor._search_regex')
    @patch('youtube_dl.extractor.archiveorg.InfoExtractor._download_webpage')
    @patch('youtube_dl.extractor.archiveorg.InfoExtractor._match_id')
    def test__real_extract_playlist(self, mock_match_id, mock_download_webpage, mock_search_regex):
        ie = ArchiveOrgIE()
        url = 'http://archive.org/details/XD300-23_68HighlightsAResearchCntAugHumanIntellect'
        mock_match_id.return_value = 'XD300-23_68HighlightsAResearchCntAugHumanIntellect'
        mock_download_webpage.return_value = 'webpage content'
        mock_search_regex.return_value = 'playlist content'
        result = ie._real_extract(url)
        self.assertIsNotNone(result)

    @patch('youtube_dl.extractor.archiveorg.InfoExtractor._parse_json')
    @patch('youtube_dl.extractor.archiveorg.InfoExtractor._download_webpage')
    @patch('youtube_dl.extractor.archiveorg.InfoExtractor._match_id')
    def test__real_extract_jwplayer_playlist(self, mock_match_id, mock_download_webpage, mock_parse_json):
        ie = ArchiveOrgIE()
        url = 'http://archive.org/details/XD300-23_68HighlightsAResearchCntAugHumanIntellect'
        mock_match_id.return_value = 'XD300-23_68HighlightsAResearchCntAugHumanIntellect'
        mock_download_webpage.return_value = 'webpage content'
        mock_parse_json.return_value = 'jwplayer playlist'
        result = ie._real_extract(url)
        self.assertIsNotNone(result)

    @patch('youtube_dl.extractor.archiveorg.InfoExtractor._parse_html5_media_entries')
    @patch('youtube_dl.extractor.archiveorg.InfoExtractor._download_webpage')
    @patch('youtube_dl.extractor.archiveorg.InfoExtractor._match_id')
    def test__real_extract_html5_media_entries(self, mock_match_id, mock_download_webpage, mock_parse_html5_media_entries):
        ie = ArchiveOrgIE()
        url = 'http://archive.org/details/XD300-23_68HighlightsAResearchCntAugHumanIntellect'
        mock_match_id.return_value = 'XD300-23_68HighlightsAResearchCntAugHumanIntellect'
        mock_download_webpage.return_value = 'webpage content'
        mock_parse_html5_media_entries.return_value = 'html5 media entries'
        result = ie._real_extract(url)
        self.assertIsNotNone(result)

    @patch('youtube_dl.extractor.archiveorg.InfoExtractor._download_json')
    @patch('youtube_dl.extractor.archiveorg.InfoExtractor._download_webpage')
    @patch('youtube_dl.extractor.archiveorg.InfoExtractor._match_id')
    def test__real_extract_metadata(self, mock_match_id, mock_download_webpage, mock_download_json):
        ie = ArchiveOrgIE()
        url = 'http://archive.org/details/XD300-23_68HighlightsAResearchCntAugHumanIntellect'
        mock_match_id.return_value = 'XD300-23_68HighlightsAResearchCntAugHumanIntellect'
        mock_download_webpage.return_value = 'webpage content'
        mock_download_json.return_value = 'metadata'
        result = ie._real_extract(url)
        self.assertIsNotNone(result)

if __name__ == '__main__':
    unittest.main()