import unittest
from youtube_dl.extractor.archiveorg import ArchiveOrgIE



class TestArchiveOrgIE(unittest.TestCase):
    def test_real_extract(self):
        instance = ArchiveOrgIE()
        result = instance._real_extract("http://archive.org/details/XD300-23_68HighlightsAResearchCntAugHumanIntellect")
        self.assertEqual(result, {
            'id': 'XD300-23_68HighlightsAResearchCntAugHumanIntellect',
            'ext': 'ogg',
            'title': '1968 Demo - FJCC Conference Presentation Reel',
            'description': 'md5:da45c349df039f1cc8075268eb1b5c25',
            'creator': 'SRI International',
            'release_date': '19681210',
            'uploader': 'SRI International',
            'timestamp': 1268695290,
            'upload_date': '20100315',
        })

    def test_real_extract_2(self):
        instance = ArchiveOrgIE()
        result = instance._real_extract("https://archive.org/details/Cops1922")
        self.assertEqual(result, {
            'id': 'Cops1922',
            'ext': 'mp4',
            'title': 'Buster Keaton\'s "Cops" (1922)',
            'description': 'md5:43a603fd6c5b4b90d12a96b921212b9c',
            'timestamp': 1387699629,
            'upload_date': '20131222',
        })

    def test_real_extract_3(self):
        instance = ArchiveOrgIE()
        result = instance._real_extract("http://archive.org/embed/XD300-23_68HighlightsAResearchCntAugHumanIntellect")
        self.assertEqual(result, {
            'id': 'XD300-23_68HighlightsAResearchCntAugHumanIntellect',
            'ext': 'ogg',
            'title': '1968 Demo - FJCC Conference Presentation Reel',
            'description': 'md5:da45c349df039f1cc8075268eb1b5c25',
            'creator': 'SRI International',
            'release_date': '19681210',
            'uploader': 'SRI International',
            'timestamp': 1268695290,
            'upload_date': '20100315',
        })

    def test_real_extract_4(self):
        instance = ArchiveOrgIE()
        result = instance._real_extract("https://archive.org/details/MSNBCW_20131125_040000_To_Catch_a_Predator/")
        self.assertEqual(result, {
            'id': 'MSNBCW_20131125_040000_To_Catch_a_Predator/',
            'ext': 'mp4',
            'title': 'MSNBCW_20131125_040000_To_Catch_a_Predator/',
            'description': 'MSNBCW_20131125_040000_To_Catch_a_Predator/',
            'timestamp': 1387699629,
            'upload_date': '20131222',
        })

if __name__ == '__main__':
    unittest.main()