import unittest
from youtube_dl.extractor.nrk import NRKTVSeasonIE


class TestNRKTVSeasonIE(unittest.TestCase):
    def test_suitable(self):
        self.assertFalse(NRKTVSeasonIE.suitable('https://tv.nrk.no/serier/0123456789'))
        self.assertFalse(NRKTVSeasonIE.suitable('https://tv.nrk.no/programmer/0123456789'))
        self.assertFalse(NRKTVSeasonIE.suitable('https://tv.nrk.no/samlinger/0123456789'))
        self.assertTrue(NRKTVSeasonIE.suitable('https://tv.nrk.no/serier/0123456789/seasons/1'))

    def test_real_extract(self):
        ie = NRKTVSeasonIE()
        data = {
            'titles': {
                'title': 'Test Title'
            },
            'seasons': [
                {
                    'id': '1234567890',
                    'number': 1,
                    'episodes': [
                        {
                            'id': '0987654321',
                            'title': 'Test Episode 1'
                        },
                        {
                            'id': '0987654322',
                            'title': 'Test Episode 2'
                        }
                    ]
                }
            ]
        }
        entries = ie._entries(data, '0123456789')
        self.assertEqual(len(entries), 2)
        self.assertEqual(entries[0]['id'], '0987654321')
        self.assertEqual(entries[1]['id'], '0987654322')

if __name__ == '__main__':
    unittest.main()