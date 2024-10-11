import unittest
from youtube_dl.extractor.archiveorg import ArchiveOrgIE
from youtube_dl.utils import ExtractorError


class TestArchiveOrgIE(unittest.TestCase):
    def setUp(self):
        self.extractor = ArchiveOrgIE()

    def test_real_extract(self):
        url = 'http://archive.org/details/XD300-23_68HighlightsAResearchCntAugHumanIntellect'
        result = self.extractor._real_extract(url).to_screen()
        self.assertEqual(result['id'], 'XD300-23_68HighlightsAResearchCntAugHumanIntellect')
        self.assertEqual(result['title'], '1968 Demo - FJCC Conference Presentation Reel')
        self.assertEqual(result['description'], 'md5:da45c349df039f1cc8075268eb1b5c25')
        self.assertEqual(result['creator'], 'SRI International')
        self.assertEqual(result['release_date'], '19681210')
        self.assertEqual(result['uploader'], 'SRI International')
        self.assertEqual(result['timestamp'], 1268695290)
        self.assertEqual(result['upload_date'], '20100315')

    def test_get_optional(self):
        metadata = {
            'title': ['Test Title'],
            'description': ['Test Description'],
            'creator': ['Test Creator'],
            'date': ['20230101'],
            'publisher': ['Test Publisher'],
            'publicdate': ['20230101'],
            'language': ['en']
        }
        get_optional = self.extractor._get_optional
        self.assertEqual(get_optional(metadata, 'title'), 'Test Title')
        self.assertEqual(get_optional(metadata, 'description'), 'Test Description')
        self.assertEqual(get_optional(metadata, 'creator'), 'Test Creator')
        self.assertEqual(get_optional(metadata, 'date'), '20230101')
        self.assertEqual(get_optional(metadata, 'publisher'), 'Test Publisher')
        self.assertEqual(get_optional(metadata, 'publicdate'), '20230101')
        self.assertEqual(get_optional(metadata, 'language'), 'en')

    def test_str_method(self):
        result = str(self.extractor)
        self.assertEqual(result.__class__.__name__, 'ArchiveOrgIE')

    def test_repr_method(self):
        result = repr(self.extractor)
        self.assertEqual(result.__class__.__name__, 'ArchiveOrgIE')

    def test_match_id(self):
        url = 'http://archive.org/details/XD300-23_68HighlightsAResearchCntAugHumanIntellect'
        result = self.extractor._match_id(url)
        self.assertEqual(result, 'XD300-23_68HighlightsAResearchCntAugHumanIntellect')

    def test_download_webpage(self):
        url = 'http://archive.org/embed/XD300-23_68HighlightsAResearchCntAugHumanIntellect'
        video_id = 'XD300-23_68HighlightsAResearchCntAugHumanIntellect'
        result = self.extractor._download_webpage(url, video_id, fatal=False)
        self.assertIn('<html', result)

    def test_search_regex(self):
        webpage = '<div class="js-play8-playlist" value="test_playlist"></div>'
        result = self.extractor._search_regex(r'(<[^>]+\bclass=["\']js-play8-playlist[^>]+>)', webpage, 'playlist', default='')
        self.assertEqual(result, '<div class="js-play8-playlist" value="test_playlist"></div>')

    def test_parse_json(self):
        json_str = '{"key": "value"}'
        result = self.extractor._parse_json(json_str, 'test_id')
        self.assertEqual(result, {'key': 'value'})

    def test_parse_jwplayer_data(self):
        jwplayer_data = {'playlist': [{'file': 'test.mp4', 'title': 'Test Video'}]}
        result = self.extractor._parse_jwplayer_data(jwplayer_data, 'test_id', require_title=False)
        self.assertEqual(result[0]['url'], 'test.mp4')
        self.assertEqual(result[0]['title'], 'Test Video')

    def test_parse_html5_media_entries(self):
        url = 'http://archive.org/details/XD300-23_68HighlightsAResearchCntAugHumanIntellect'
        webpage = '<video src="test.mp4" title="Test Video"></video>'
        video_id = 'XD300-23_68HighlightsAResearchCntAugHumanIntellect'
        result = self.extractor._parse_html5_media_entries(url, webpage, video_id)
        self.assertEqual(result[0].get('url'), 'test.mp4')
        self.assertEqual(result[0]['title'], 'Test Video')

if __name__ == '__main__':
    unittest.main()