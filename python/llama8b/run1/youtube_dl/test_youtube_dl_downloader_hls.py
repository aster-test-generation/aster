import unittest
from youtube_dl.downloader.hls import HlsFD


class TestHlsFD(unittest.TestCase):
    def test_can_download(self):
        hls_fd = HlsFD()
        manifest = 'UNSUPPORTED_FEATURES'
        info_dict = {'url': 'https://example.com'}
        self.assertTrue(hls_fd.can_download(manifest, info_dict))

    def test_real_download(self):
        hls_fd = HlsFD()
        filename = 'test.m3u8'
        info_dict = {'url': 'https://example.com'}
        result = hls_fd.real_download(filename, info_dict)
        self.assertTrue(result)

    def test_is_ad_fragment_start(self):
        hls_fd = HlsFD()
        s = '#EXT-X-ADTS'
        self.assertTrue(hls_fd.is_ad_fragment_start(s))

    def test_is_ad_fragment_end(self):
        hls_fd = HlsFD()
        s = '#EXT-X-ADTS'
        self.assertTrue(hls_fd.is_ad_fragment_end(s))

    def test_media_frags(self):
        hls_fd = HlsFD()
        s = '#EXT-X-MEDIA-SEQUENCE:1\n#EXT-X-MEDIA-SEQUENCE:2\n#EXT-X-MEDIA-SEQUENCE:3'
        media_frags = 0
        ad_frags = 0
        ad_frag_next = False
        for line in s.splitlines():
            line = line.strip()
            if not line:
                continue
            if line.startswith('#EXT-X-ADTS'):
                if ad_frag_next:
                    ad_frags += 1
                    continue
                ad_frag_next = True
                continue
            if ad_frag_next:
                ad_frags += 1
                continue
            media_frags += 1
        self.assertEqual(media_frags, 3)

    def test_ad_frags(self):
        hls_fd = HlsFD()
        s = '#EXT-X-ADTS\n#EXT-X-ADTS'
        media_frags = 0
        ad_frags = 0
        ad_frag_next = False
        for line in s.splitlines():
            line = line.strip()
            if not line:
                continue
            if line.startswith('#EXT-X-ADTS'):
                if ad_frag_next:
                    ad_frags += 1
                    continue
                ad_frag_next = True
                continue
            if ad_frag_next:
                ad_frags += 1
                continue
            media_frags += 1
        self.assertEqual(ad_frags, 2)

    def test_decrypt_info(self):
        hls_fd = HlsFD()
        decrypt_info = {'METHOD': 'AES-128', 'IV': '1234567890abcdef', 'URI': 'https://example.com'}
        self.assertEqual(hls_fd.decrypt_info(decrypt_info), decrypt_info)

    def test_append_fragment(self):
        hls_fd = HlsFD()
        ctx = {'filename': 'test.m3u8', 'total_frags': 10, 'ad_frags': 2}
        frag_content = b'fragment content'
        hls_fd._append_fragment(ctx, frag_content)
        self.assertEqual(ctx['fragment_index'], 1)

    def test_prepare_and_start_frag_download(self):
        hls_fd = HlsFD()
        ctx = {'filename': 'test.m3u8', 'total_frags': 10, 'ad_frags': 2}
        hls_fd._prepare_and_start_frag_download(ctx)
        self.assertEqual(ctx['fragment_index'], 0)

    def test_finish_frag_download(self):
        hls_fd = HlsFD()
        ctx = {'filename': 'test.m3u8', 'total_frags': 10, 'ad_frags': 2}
        hls_fd._finish_frag_download(ctx)
        self.assertEqual(ctx['fragment_index'], 10)

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