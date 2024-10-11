import unittest
from youtube_dl.extractor.archiveorg import ArchiveOrgIE


class TestArchiveOrgIE(unittest.TestCase):
    def test_real_extract(self):
        ie = ArchiveOrgIE(None)
        video_id = "XD300-23_68HighlightsAResearchCntAugHumanIntellect"
        webpage = """
        <html>
            <body>
                <div class="js-play8-playlist" value='[{"file":"https://archive.org/download/XD300-23_68HighlightsAResearchCntAugHumanIntellect/XD300-23_68HighlightsAResearchCntAugHumanIntellect.ogg"}]'></div>
            </body>
        </html>
        """
        info = ie._real_extract(video_id)
        self.assertEqual(info['id'], video_id)
        self.assertEqual(info['ext'], 'ogg')
        self.assertEqual(info['title'], '1968 Demo - FJCC Conference Presentation Reel')
        self.assertEqual(info['description'], 'md5:da45c349df039f1cc8075268eb1b5c25')
        self.assertEqual(info['creator'], 'SRI International')
        self.assertEqual(info['release_date'], '19681210')
        self.assertEqual(info['uploader'], 'SRI International')
        self.assertEqual(info['timestamp'], 1268695290)
        self.assertEqual(info['upload_date'], '20100315')

if __name__ == '__main__':
    unittest.main()