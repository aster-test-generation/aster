import unittest
from youtube_dl.extractor.walla import WallaIE
from unittest.mock import patch, MagicMock

class TestWallaIE(unittest.TestCase):
    def setUp(self):
        self.ie = WallaIE()

    def test__real_extract(self):
        url = 'http://vod.walla.co.il/movie/2642630/one-direction-all-for-one'
        expected_result = {
            'id': '2642630',
            'display_id': 'one-direction-all-for-one',
            'title': 'וואן דיירקשן: ההיסטריה',
            'description': 'md5:de9e2512a92442574cdb0913c49bc4d8',
            'thumbnail': 'http://example.com/thumbnail.jpg',
            'duration': 3600,
            'formats': [{
                'url': 'rtmp://wafla.walla.co.il/vod',
                'play_path': 'playpath',
                'player_url': 'http://isc.walla.co.il/w9/swf/video_swf/vod/WallaMediaPlayerAvod.swf',
                'page_url': url,
                'ext': 'flv',
                'format_id': '480p',
                'height': 480,
            }],
            'subtitles': {
                'heb': [{
                    'ext': 'srt',
                    'url': 'http://example.com/subtitle.srt',
                }]
            },
        }

        with patch.object(self.ie, '_download_xml') as mock_download_xml:
            mock_video = MagicMock()
            mock_item = MagicMock()
            mock_subtitle = MagicMock()
            mock_quality = MagicMock()

            mock_video.find.return_value = mock_item
            mock_item.find.return_value = mock_item
            mock_item.findall.side_effect = [
                [mock_subtitle],
                [mock_quality]
            ]

            mock_download_xml.return_value = mock_video

            with patch('youtube_dl.utils.xpath_text', side_effect=[
                'וואן דיירקשן: ההיסטריה',  # title
                'md5:de9e2512a92442574cdb0913c49bc4d8',  # description
                'http://example.com/thumbnail.jpg',  # thumbnail
                '3600',  # duration
                'עברית',  # subtitle lang
                'http://example.com/subtitle.srt',  # subtitle url
                '480p',  # format id
                'playpath'  # play path
            ]):
                with patch('youtube_dl.utils.int_or_none', return_value=3600):
                    result = self.ie._real_extract(url)
                    self.assertEqual(result, expected_result)

    def test__sort_formats(self):
        formats = [
            {'format_id': '480p', 'height': 480},
            {'format_id': '720p', 'height': 720},
            {'format_id': '360p', 'height': 360},
        ]
        self.ie._sort_formats(formats)
        self.assertEqual(formats, [
            {'format_id': '360p', 'height': 360},
            {'format_id': '480p', 'height': 480},
            {'format_id': '720p', 'height': 720},
        ])

if __name__ == '__main__':
    unittest.main()