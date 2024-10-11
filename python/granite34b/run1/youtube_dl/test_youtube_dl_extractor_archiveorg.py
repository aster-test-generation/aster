import unittest
from youtube_dl.extractor.archiveorg import ArchiveOrgIE


class TestArchiveOrgIE(unittest.TestCase):
    def test_real_extract(self):
        ie = ArchiveOrgIE()
        video_id = 'XD300-23_68HighlightsAResearchCntAugHumanIntellect'
        webpage = '<html>... # The HTML content of the webpage'
        playlist = '... # The playlist JSON'
        jwplayer_playlist = '... # The JWPlayer playlist'
        metadata = {
            'title': ['1968 Demo - FJCC Conference Presentation Reel'],
            'description': ['...'],
            'creator': ['SRI International'],
            'date': ['19681210'],
            'publisher': ['SRI International'],
            'publicdate': ['20100315'],
            'language': ['en'],
        }

        info = ie._real_extract(url, video_id, webpage, playlist, jwplayer_playlist, metadata)

        self.assertEqual(info['id'], video_id)
        self.assertEqual(info['ext'], 'ogg')
        self.assertEqual(info['title'], '1968 Demo - FJCC Conference Presentation Reel')
        self.assertEqual(info['description'], '...')
        self.assertEqual(info['creator'], 'SRI International')
        self.assertEqual(info['release_date'], '19681210')
        self.assertEqual(info['uploader'], 'SRI International')
        self.assertEqual(info['timestamp'], 1268695290)
        self.assertEqual(info['upload_date'], '20100315')
        self.assertEqual(info['language'], 'en')

if __name__ == '__main__':
    unittest.main()