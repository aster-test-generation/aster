import unittest
from youtube_dl.extractor.konserthusetplay import KonserthusetPlayIE


class TestKonserthusetPlayIE(unittest.TestCase):
    def test_real_extract(self):
        ie = KonserthusetPlayIE()
        video_id = 'CKDDnlCY-dhWAAqiMERd-A'
        url = f'http://www.konserthusetplay.se/?m={video_id}'
        webpage = '<html><body>test</body></html>'
        e = 'test_e'
        rest = {
            'media': {
                'playerconfig': {
                    'playlist': [
                        {
                            'bitrates': [
                                {
                                    'bitrate': 1000,
                                    'width': 1920,
                                    'height': 1080,
                                    'url': 'http://test_url.com/video.mp4'
                                }
                            ],
                            'provider': 'test_provider'
                        }
                    ],
                    'title': 'test_title',
                    'mediaInfo': {
                        'description': 'test_description'
                    },
                    'image': 'http://test_url.com/thumbnail.jpg',
                    'duration': 3000
                }
            }
        }
        player_config = rest['media']['playerconfig']
        source = player_config['playlist'][0]
        formats = ie._real_extract(url)
        self.assertEqual(formats['id'], video_id)
        self.assertEqual(formats['title'], player_config['title'])
        self.assertEqual(formats['description'], player_config['mediaInfo']['description'])
        self.assertEqual(formats['thumbnail'], player_config['image'])
        self.assertEqual(formats['duration'], player_config['duration'])
        self.assertEqual(formats['formats'][0]['url'], source['bitrates'][0]['url'])
        self.assertEqual(formats['formats'][0]['width'], source['bitrates'][0]['width'])
        self.assertEqual(formats['formats'][0]['height'], source['bitrates'][0]['height'])
        self.assertEqual(formats['formats'][0]['vbr'], source['bitrates'][0]['bitrate'])
        self.assertEqual(formats['subtitles'], {})

if __name__ == '__main__':
    unittest.main()