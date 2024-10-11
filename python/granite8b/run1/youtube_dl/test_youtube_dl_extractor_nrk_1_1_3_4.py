import unittest
from youtube_dl.extractor.nrk import NRKTVSeasonIE


class TestNRKTVSeasonIE(unittest.TestCase):
    def test_suitable(self):
        self.assertFalse(NRKTVSeasonIE.suitable('https://tv.nrk.no/serier/01234/ episode/123456'))
        self.assertFalse(NRKTVSeasonIE.suitable('https://tv.nrk.no/program/01234/ episode/123456'))
        self.assertFalse(NRKTVSeasonIE.suitable('https:// radio.nrk.no/ podcast/01234/ episode/123456'))
        self.assertTrue(NRKTVSeasonIE.suitable('https://tv.nrk.no/serier/01234/ season/123456'))

    def test_real_extract(self):
        ie = NRKTVSeasonIE()
        data = {
            'id': '123456',
            'titles': {
                'title': 'Test Title'
            }
        }
        display_id = 'test_display_id'
        entries = ie._entries(data, display_id)
        self.assertEqual(len(entries), 1)
        entry = entries[0]
        self.assertEqual(entry['id'], '123456')
        self.assertEqual(entry['title'], 'Test Title')

if __name__ == '__main__':
    unittest.main()