from youtube_dl.extractor.nrk import NRKIE
import unittest
from youtube_dl.extractor.nrk import NRKSkoleIE


class TestNRKSkoleIE(unittest.TestCase):
    def test_real_extract(self):
        ie = NRKSkoleIE()
        video_id = '12345'
        nrk_id = '67890'
        media_data = {
            'psId': nrk_id
        }
        def side_effect(url, video_id):
            if url == 'https://nrkno-skole-prod.kube.nrk.no/skole/api/media/%s' % video_id:
                return media_data
            raise ExtractorError('Invalid URL')
        ie._download_json = side_effect
        result = ie._real_extract(video_id)
        self.assertEqual(result, {'id': nrk_id, 'extractor': 'nrk'})

if __name__ == '__main__':
    unittest.main()