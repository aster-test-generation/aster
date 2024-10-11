import unittest
from youtube_dl.downloader.hls import HlsFD


class TestHlsFD(unittest.TestCase):
    def test_can_download(self):
        manifest = 'manifest'
        info_dict = {'url': 'url'}
        UNSUPPORTED_FEATURES = [
            'feature1',
            'feature2',
        ]
        for feature in UNSUPPORTED_FEATURES:
            self.assertTrue(HlsFD.can_download(manifest, info_dict))
        info_dict['extra_param_to_segment_url'] = 'extra_param_to_segment_url'
        self.assertFalse(HlsFD.can_download(manifest, info_dict))
        info_dict['_decryption_key_url'] = '_decryption_key_url'
        self.assertFalse(HlsFD.can_download(manifest, info_dict))
        info_dict['is_live'] = True
        self.assertFalse(HlsFD.can_download(manifest, info_dict))
        self.assertTrue(HlsFD.can_download(manifest, info_dict))

    def test_real_download(self):
        filename = 'filename'
        info_dict = {'url': 'url'}
        fd = HlsFD(None, None)
        self.assertTrue(fd.real_download(filename, info_dict))

if __name__ == '__main__':
    unittest.main()