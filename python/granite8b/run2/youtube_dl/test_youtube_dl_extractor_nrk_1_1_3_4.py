import unittest
from youtube_dl.extractor.nrk import NRKTVSeasonIE


class TestNRKTVSeasonIE(unittest.TestCase):
    def test_suitable(self):
        self.assertFalse(NRKTVSeasonIE.suitable('https://tv.nrk.no/program/1234'))
        self.assertFalse(NRKTVSeasonIE.suitable('https://tv.nrk.no/program/1234/'))
        self.assertFalse(NRKTVSeasonIE.suitable('https://tv.nrk.no/program/1234/aired/2022-01-01'))
        self.assertFalse(NRKTVSeasonIE.suitable('https://tv.nrk.no/samling/1234'))
        self.assertFalse(NRKTVSeasonIE.suitable('https://tv.nrk.no/plassering/1234'))
        self.assertFalse(NRKTVSeasonIE.suitable('https:// radio.nrk.no/samling/1234'))
        self.assertTrue(NRKTVSeasonIE.suitable('https://tv.nrk.no/seri/1234/seasons/1'))
        self.assertTrue(NRKTVSeasonIE.suitable('https://tv.nrk.no/seri/1234/seasons/1/'))

    def test_real_extract(self):
        ie = NRKTVSeasonIE()
        data = {
            'id': '1234',
            'titles': {
                'title': 'Test Title'
            },
            'seasons': [
                {
                    'id': '5678',
                    'number': 1,
                    'aired': {
                        'from': '2022-01-01',
                        'to': '2022-01-31'
                    },
                    'mediaList': [
                        {
                            'id': '9012',
                            'duration': 600,
                            'type': 'video',
                            'parts': [
                                {
                                    'id': '3456',
                                    'duration': 600,
                                    'type': 'video',
                                    'playback': {
                                        'sources': [
                                            {
                                                'type': 'application/dash+xml',
                                                'src': 'https://example.com/dash.mpd'
                                            }
                                        ]
                                    }
                                }
                            ]
                        }
                    ]
                }
            ]
        }
        entries = ie._entries(data, '1234')
        self.assertEqual(len(entries), 1)
        entry = entries[0]
        self.assertEqual(entry['id'], '9012')
        self.assertEqual(entry['duration'], 600)
        self.assertEqual(entry['formats'], [{
            'format_id': 'dash',
            'protocol': 'https',
            'ext': 'mpd',
            'url': 'https://example.com/dash.mpd'
        }])

if __name__ == '__main__':
    unittest.main()