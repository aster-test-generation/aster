import unittest
from youtube_dl.extractor.konserthusetplay import KonserthusetPlayIE


class TestKonserthusetPlayIE(unittest.TestCase):
    def test_real_extract(self):
        ie = KonserthusetPlayIE()
        video_id = 'CKDDnlCY-dhWAAqiMERd-A'
        webpage = """
        <html>
            <body>
                <div>
                    <h1>Orkesterns instrument: Valthornen</h1>
                    <p>md5:f10e1f0030202020396a4d712d2fa827</p>
                    <img src="https://example.com/thumbnail.jpg" alt="Thumbnail">
                </div>
            </body>
        </html>
        """
        expected_info = {
            'id': video_id,
            'ext': 'mp4',
            'title': 'Orkesterns instrument: Valthornen',
            'description': 'md5:f10e1f0030202020396a4d712d2fa827',
            'thumbnail': 'https://example.com/thumbnail.jpg',
            'duration': 398.76,
        }
        info = ie._real_extract(self, video_id, webpage)
        self.assertEqual(info, expected_info)

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