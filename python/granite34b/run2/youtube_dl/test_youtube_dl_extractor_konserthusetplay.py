import unittest
from youtube_dl.extractor.konserthusetplay import KonserthusetPlayIE


class TestKonserthusetPlayIE(unittest.TestCase):
    def test_real_extract(self):
        ie = KonserthusetPlayIE()
        video_id = 'CKDDnlCY-dhWAAqiMERd-A'
        webpage = """
        <html>
        <head></head>
        <body>
        <div>
            <h1>Orkesterns instrument: Valthornen</h1>
            <p>md5:f10e1f0030202020396a4d712d2fa827</p>
            <img src="https://example.com/thumbnail.jpg" alt="Thumbnail">
        </div>
        </body>
        </html>
        """
        expected_info_dict = {
            'id': video_id,
            'ext': 'mp4',
            'title': 'Orkesterns instrument: Valthornen',
            'description': 'md5:f10e1f0030202020396a4d712d2fa827',
            'thumbnail': 'https://example.com/thumbnail.jpg',
            'duration': 398.76,
        }
        info_dict = ie._real_extract(self, video_id, webpage)
        self.assertEqual(info_dict, expected_info_dict)

if __name__ == '__main__':
    unittest.main()