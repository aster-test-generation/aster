import unittest
from youtube_dl.extractor.archiveorg import ArchiveOrgIE, InfoExtractor


class TestArchiveOrgIE(unittest.TestCase):
    def test_IE_NAME(self):
        instance = ArchiveOrgIE()
        self.assertEqual(instance.IE_NAME, 'archive.org')

    def test_IE_DESC(self):
        instance = ArchiveOrgIE()
        self.assertEqual(instance.IE_DESC, 'archive.org videos')

    def test__VALID_URL(self):
        instance = ArchiveOrgIE()
        self.assertEqual(instance._VALID_URL, r'https?://(?:www\.)?archive\.org/(?:details|embed)/(?P<id>[^/?')

    def test__TESTS(self):
        instance = ArchiveOrgIE()
        self.assertEqual(len(instance._TESTS), 4)

    def test__real_extract(self):
        instance = ArchiveOrgIE()
        url = 'http://archive.org/details/XD300-23_68HighlightsAResearchCntAugHumanIntellect'
        result = instance._real_extract(url)
        self.assertIsNotNone(result)

    def test__match_id(self):
        instance = ArchiveOrgIE()
        url = 'http://archive.org/details/XD300-23_68HighlightsAResearchCntAugHumanIntellect'
        result = instance._match_id(url)
        self.assertEqual(result, 'XD300-23_68HighlightsAResearchCntAugHumanIntellect')

    def test__download_webpage(self):
        instance = ArchiveOrgIE()
        url = 'http://archive.org/embed/XD300-23_68HighlightsAResearchCntAugHumanIntellect'
        video_id = 'XD300-23_68HighlightsAResearchCntAugHumanIntellect'
        result = instance._download_webpage(url, video_id)
        self.assertIsNotNone(result)

    def test__search_regex(self):
        instance = ArchiveOrgIE()
        webpage = '<html><body><div class="js-play8-playlist">playlist</div></body></html>'
        pattern = r'(<[^>]+\bclass=["\']js-play8-playlist[^>]+>)'
        result = instance._search_regex(pattern, webpage, 'playlist', default=None)
        self.assertIsNotNone(result)

    def test__parse_json(self):
        instance = ArchiveOrgIE()
        playlist = '[{"title": "video1", "url": "http://example.com/video1"}]'
        video_id = 'XD300-23_68HighlightsAResearchCntAugHumanIntellect'
        result = instance._parse_json(playlist, video_id, fatal=False)
        self.assertIsNotNone(result)

    def test__parse_jwplayer_data(self):
        instance = ArchiveOrgIE()
        jwplayer_playlist = [{'title': 'video1', 'url': 'http://example.com/video1'}]
        video_id = 'XD300-23_68HighlightsAResearchCntAugHumanIntellect'
        base_url = 'http://archive.org/details/XD300-23_68HighlightsAResearchCntAugHumanIntellect'
        result = instance._parse_jwplayer_data({'playlist': jwplayer_playlist}, video_id, base_url=base_url)
        self.assertIsNotNone(result)

    def test__parse_html5_media_entries(self):
        instance = ArchiveOrgIE()
        url = 'http://archive.org/details/XD300-23_68HighlightsAResearchCntAugHumanIntellect'
        webpage = '<html><body><video src="http://example.com/video1"></video></body></html>'
        video_id = 'XD300-23_68HighlightsAResearchCntAugHumanIntellect'
        result = instance._parse_html5_media_entries(url, webpage, video_id)[0]
        self.assertIsNotNone(result)

    def test_get_optional(self):
        instance = ArchiveOrgIE()
        metadata = {'title': ['video title'], 'description': ['video description']}
        result = instance.get_optional(metadata, 'title')
        self.assertEqual(result, 'video title')

    def test__download_json(self):
        instance = ArchiveOrgIE()
        url = 'http://archive.org/details/XD300-23_68HighlightsAResearchCntAugHumanIntellect'
        video_id = 'XD300-23_68HighlightsAResearchCntAugHumanIntellect'
        result = instance._download_json(url, video_id, query={'output': 'json'})
        self.assertIsNotNone(result)

    def test_unified_strdate(self):
        instance = ArchiveOrgIE()
        date_string = '19681210'
        result = instance.unified_strdate(date_string)
        self.assertEqual(result, '1968-12-10')

    def test_unified_timestamp(self):
        instance = ArchiveOrgIE()
        date_string = '19681210'
        result = instance.unified_timestamp(date_string)
        self.assertEqual(result, 1268695290)

if __name__ == '__main__':
    unittest.main()