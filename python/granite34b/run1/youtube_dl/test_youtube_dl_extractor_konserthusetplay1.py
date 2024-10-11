import unittest
from youtube_dl.extractor.konserthusetplay import KonserthusetPlayIE

class TestKonserthusetPlayIE(unittest.TestCase):
    def test_real_extract(self):
        ie = KonserthusetPlayIE()
        video_id = 'CKDDnlCY-dhWAAqiMERd-A'
        url = f'http://www.konserthusetplay.se/?m={video_id}'
        webpage = '<html>...content here...</html>'
        e = 'e_value'
        rest = {
            'media': {
                'playerconfig': {
                    'playlist': [
                        {
                            'bitrates': [
                                {
                                    'url': 'http://example.com/video1.mp4',
                                    'bitrate': 1000,
                                    'width': 1280,
                                    'height': 720
                                },
                                {
                                    'url': 'http://example.com/video2.mp4',
                                    'bitrate': 2000,
                                    'width': 1920,
                                    'height': 1080
                                }
                            ],
                            'provider': 'provider_value',
                            'url': 'http://example.com/playlist.m3u8',
                            'fallbackUrl': 'http://example.com/video.mp4',
                            'captionsAvailableLanguages': {
                                'en': 'http://example.com/subtitles_en.vtt',
                                'sv': 'http://example.com/subtitles_sv.vtt'
                            }
                        }
                    ],
                    'title': 'Title of the video',
                    'mediaInfo': {
                        'description': 'Description of the video'
                    },
                    'image': 'http://example.com/thumbnail.jpg',
                    'duration': 398.76
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
        self.assertEqual(len(formats['formats']), len(source['bitrates']))
        for format, bitrate in zip(formats['formats'], source['bitrates']):
            self.assertEqual(format['url'], bitrate['url'])
            self.assertEqual(format['vbr'], bitrate['bitrate'])
            self.assertEqual(format['width'], bitrate['width'])
            self.assertEqual(format['height'], bitrate['height'])
        self.assertEqual(formats['subtitles']['en'][0]['url'], source['captionsAvailableLanguages']['en'])
        self.assertEqual(formats['subtitles']['sv'][0]['url'], source['captionsAvailableLanguages']['sv'])

if __name__ == '__main__':
    unittest.main()