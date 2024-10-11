import unittest
from youtube_dl.downloader.hls import HlsFD


class TestHlsFD(unittest.TestCase):
    def test_can_download(self):
        manifest = 'UNSUPPORTED_FEATURES'
        info_dict = {'url': 'http://example.com'}
        self.assertTrue(HlsFD.can_download(manifest, info_dict))

    def test_real_download(self):
        filename = 'example.mp4'
        info_dict = {'url': 'http://example.com', 'extra_param_to_segment_url': 'http://example.com/extra'}
        hls_fd = HlsFD(None, None)
        result = hls_fd.real_download(filename, info_dict)
        self.assertTrue(result)

    def test_is_ad_fragment_start(self):
        s = 'EXT-X-AD-START'
        self.assertTrue(HlsFD.is_ad_fragment_start(s))

    def test_is_ad_fragment_end(self):
        s = 'EXT-X-AD-END'
        self.assertTrue(HlsFD.is_ad_fragment_end(s))

    def test_prepare_and_start_frag_download(self):
        ctx = {'filename': 'example.mp4', 'total_frags': 10, 'ad_frags': 2}
        hls_fd = HlsFD(None, None)
        hls_fd._prepare_and_start_frag_download(ctx)

    def test_append_fragment(self):
        ctx = {'filename': 'example.mp4', 'total_frags': 10, 'ad_frags': 2}
        frag_content = b'example fragment'
        hls_fd = HlsFD(None, None)
        hls_fd._append_fragment(ctx, frag_content)

    def test_finish_frag_download(self):
        ctx = {'filename': 'example.mp4', 'total_frags': 10, 'ad_frags': 2}
        hls_fd = HlsFD(None, None)
        hls_fd._finish_frag_download(ctx)

    def test_download_fragment(self):
        ctx = {'filename': 'example.mp4', 'total_frags': 10, 'ad_frags': 2}
        frag_url = 'http://example.com/frag'
        info_dict = {'url': 'http://example.com'}
        headers = {'http_headers': {'key': 'value'}}
        hls_fd = HlsFD(None, None)
        success, frag_content = hls_fd._download_fragment(ctx, frag_url, info_dict, headers)
        self.assertTrue(success)

    def test_report_error(self):
        hls_fd = HlsFD(None, None)
        hls_fd.report_error('Error message')

    def test_report_retry_fragment(self):
        hls_fd = HlsFD(None, None)
        hls_fd.report_retry_fragment('Error message', 1, 2, 3)

    def test_report_skip_fragment(self):
        hls_fd = HlsFD(None, None)
        hls_fd.report_skip_fragment(1)

    def test_prepare_url(self):
        man_url = 'http://example.com'
        info_dict = {'url': 'http://example.com'}
        hls_fd = HlsFD(None, None)
        result = hls_fd._prepare_url(info_dict, man_url)
        self.assertEqual(result, man_url)

    def test_parse_m3u8_attributes(self):
        line = 'METHOD=AES-128,IV=1234567890abcdef,URI=http://example.com'
        hls_fd = HlsFD(None, None)
        result = hls_fd.parse_m3u8_attributes(line)
        self.assertEqual(result, {'METHOD': 'AES-128', 'IV': '1234567890abcdef', 'URI': 'http://example.com'})

    def test_update_url_query(self):
        frag_url = 'http://example.com/frag'
        extra_query = {'key': 'value'}
        hls_fd = HlsFD(None, None)
        result = hls_fd.update_url_query(frag_url, extra_query)
        self.assertEqual(result, 'http://example.com/frag?key=value')

if __name__ == '__main__':
    unittest.main()