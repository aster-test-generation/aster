import unittest
from youtube_dl.downloader.hls import HlsFD

class TestHlsFD(unittest.TestCase):
    def test_can_download(self):
        manifest = 'UNSUPPORTED_FEATURES'
        info_dict = {'url': 'test_url', 'is_live': False}
        self.assertTrue(HlsFD.can_download(manifest, info_dict))

    def test_real_download(self):
        info_dict = {'url': 'test_url', 'is_live': False}
        hls_fd = HlsFD(None, None)
        result = hls_fd.real_download('test_file', info_dict)
        self.assertTrue(result)

    def test_is_ad_fragment_start(self):
        s = 'EXT-X-AD-'
        self.assertTrue(HlsFD.is_ad_fragment_start(s))

    def test_is_ad_fragment_end(self):
        s = 'EXT-X-AD-'
        self.assertTrue(HlsFD.is_ad_fragment_end(s))

    def test_prepare_and_start_frag_download(self):
        ctx = {'filename': 'test_file', 'total_frags': 10, 'ad_frags': 2}
        hls_fd = HlsFD(None, None)
        hls_fd._prepare_and_start_frag_download(ctx)

    def test_append_fragment(self):
        ctx = {'filename': 'test_file', 'total_frags': 10, 'ad_frags': 2}
        frag_content = 'test_frag_content'
        hls_fd = HlsFD(None, None)
        hls_fd._append_fragment(ctx, frag_content)

    def test_finish_frag_download(self):
        ctx = {'filename': 'test_file', 'total_frags': 10, 'ad_frags': 2}
        hls_fd = HlsFD(None, None)
        hls_fd._finish_frag_download(ctx)

    def test_prepare_and_start_frag_download_with_decrypt_info(self):
        ctx = {'filename': 'test_file', 'total_frags': 10, 'ad_frags': 2}
        decrypt_info = {'METHOD': 'AES-128', 'IV': 'test_iv', 'KEY': 'test_key'}
        hls_fd = HlsFD(None, None)
        hls_fd._prepare_and_start_frag_download(ctx, decrypt_info)

    def test_append_fragment_with_decrypt_info(self):
        ctx = {'filename': 'test_file', 'total_frags': 10, 'ad_frags': 2}
        frag_content = 'test_frag_content'
        decrypt_info = {'METHOD': 'AES-128', 'IV': 'test_iv', 'KEY': 'test_key'}
        hls_fd = HlsFD(None, None)
        hls_fd._append_fragment(ctx, frag_content, decrypt_info)

    def test_finish_frag_download_with_decrypt_info(self):
        ctx = {'filename': 'test_file', 'total_frags': 10, 'ad_frags': 2}
        decrypt_info = {'METHOD': 'AES-128', 'IV': 'test_iv', 'KEY': 'test_key'}
        hls_fd = HlsFD(None, None)
        hls_fd._finish_frag_download(ctx, decrypt_info)

if __name__ == '__main__':
    unittest.main()