import unittest
from youtube_dl.extractor.archiveorg import ArchiveOrgIE



class TestArchiveOrgIE(unittest.TestCase):
    def test_real_extract(self):
        instance = ArchiveOrgIE()
        url = "http://archive.org/details/XD300-23_68HighlightsAResearchCntAugHumanIntellect"
        result = instance._real_extract(url)
        self.assertEqual(result, "1968 Demo - FJCC Conference Presentation Reel")

    def test_parse_jwplayer_data(self):
        instance = ArchiveOrgIE()
        playlist = "http://archive.org/embed/XD300-23_68HighlightsAResearchCntAugHumanIntellect"
        result = instance._parse_jwplayer_data(playlist)
        self.assertEqual(result, "1968 Demo - FJCC Conference Presentation Reel")

    def test_parse_html5_media_entries(self):
        instance = ArchiveOrgIE()
        url = "http://archive.org/embed/XD300-23_68HighlightsAResearchCntAugHumanIntellect"
        webpage = "http://archive.org/embed/XD300-23_68HighlightsAResearchCntAugHumanIntellect"
        video_id = "http://archive.org/embed/XD300-23_68HighlightsAResearchCntAugHumanIntellect"
        result = instance._parse_html5_media_entries(url, webpage, video_id)
        self.assertEqual(result, [])

    def test_download_json(self):
        instance = ArchiveOrgIE()
        url = "http://archive.org/details/XD300-23_68HighlightsAResearchCntAugHumanIntellect"
        video_id = "http://archive.org/embed/XD300-23_68HighlightsAResearchCntAugHumanIntellect"
        result = instance._download_json(url, video_id)
        self.assertEqual(result, "1968 Demo - FJCC Conference Presentation Reel")

    def test_download_webpage(self):
        instance = ArchiveOrgIE()
        url = "http://archive.org/embed/XD300-23_68HighlightsAResearchCntAugHumanIntellect"
        video_id = "http://archive.org/embed/XD300-23_68HighlightsAResearchCntAugHumanIntellect"
        result = instance._download_webpage(url, video_id)
        self.assertEqual(result, "1968 Demo - FJCC Conference Presentation Reel")

    def test_search_regex(self):
        instance = ArchiveOrgIE()
        webpage = "http://archive.org/embed/XD300-23_68HighlightsAResearchCntAugHumanIntellect"
        regex = "http://archive.org/embed/XD300-23_68HighlightsAResearchCntAugHumanIntellect"
        result = instance._search_regex('name', regex, webpage)
        self.assertEqual(result, "1968 Demo - FJCC Conference Presentation Reel")

    def test_match_id(self):
        instance = ArchiveOrgIE()
        url = "http://archive.org/embed/XD300-23_68HighlightsAResearchCntAugHumanIntellect"
        result = instance._match_id(url)
        self.assertEqual(result, "XD300-23_68HighlightsAResearchCntAugHumanIntellect")

if __name__ == '__main__':
    unittest.main()