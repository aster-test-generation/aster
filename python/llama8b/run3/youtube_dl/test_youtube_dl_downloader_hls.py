import unittest
from youtube_dl.downloader.hls import HlsFD


class TestHlsFD(unittest.TestCase):
    def test_can_download(self):
        manifest = 'UNSUPPORTED_FEATURES'
        info_dict = {'url': 'test_url'}
        self.assertTrue(HlsFD.can_download(manifest, info_dict))

    def test_real_download(self):
        filename = 'test_file'
        info_dict = {'url': 'test_url'}
        hlsfd = HlsFD(None, None)
        hlsfd.to_screen = lambda x: None
        hlsfd.ydl = None
        hlsfd.params = None
        result = hlsfd.real_download(filename, info_dict)
        self.assertTrue(result)

    def test_is_ad_fragment_start(self):
        s = 'EXT-X-AD-'
        self.assertTrue(HlsFD.is_ad_fragment_start(s))

    def test_is_ad_fragment_end(self):
        s = 'EXT-X-AD-'
        self.assertTrue(HlsFD.is_ad_fragment_end(s))

    def test_is_not_ad_fragment_start(self):
        s = 'EXT-X-MEDIA-'
        self.assertFalse(HlsFD.is_ad_fragment_start(s))

    def test_is_not_ad_fragment_end(self):
        s = 'EXT-X-MEDIA-'
        self.assertFalse(HlsFD.is_ad_fragment_end(s))

    def test_prepare_and_start_frag_download(self):
        ctx = {'filename': 'test_file', 'total_frags': 10, 'ad_frags': 2}
        hlsfd = HlsFD(None, None)
        hlsfd._prepare_and_start_frag_download(ctx)
        self.assertTrue(True)

    def test_append_fragment(self):
        ctx = {'filename': 'test_file', 'total_frags': 10, 'ad_frags': 2}
        hlsfd = HlsFD(None, None)
        frag_content = b'test_frag_content'
        hlsfd._append_fragment(ctx, frag_content)
        self.assertTrue(True)

    def test_finish_frag_download(self):
        ctx = {'filename': 'test_file', 'total_frags': 10, 'ad_frags': 2}
        hlsfd = HlsFD(None, None)
        hlsfd._finish_frag_download(ctx)
        self.assertTrue(True)

    def test_download_fragment(self):
        ctx = {'filename': 'test_file', 'total_frags': 10, 'ad_frags': 2}
        hlsfd = HlsFD(None, None)
        frag_url = 'test_frag_url'
        info_dict = {'url': 'test_url'}
        headers = {'http_headers': {}}
        result, frag_content = hlsfd._download_fragment(ctx, frag_url, info_dict, headers)
        self.assertTrue(result)

    def test_report_error(self):
        hlsfd = HlsFD(None, None)
        hlsfd.report_error('test_error')
        self.assertTrue(True)

    def test_report_warning(self):
        hlsfd = HlsFD(None, None)
        hlsfd.report_warning('test_warning')
        self.assertTrue(True)

    def test_report_retry_fragment(self):
        hlsfd = HlsFD(None, None)
        err = compat_urllib_error.HTTPError('test_url', 404, 'test_message', None, None)
        frag_index = 1
        count = 1
        fragment_retries = 2
        hlsfd.report_retry_fragment(err, frag_index, count, fragment_retries)
        self.assertTrue(True)

    def test_report_skip_fragment(self):
        hlsfd = HlsFD(None, None)
        frag_index = 1
        hlsfd.report_skip_fragment(frag_index)
        self.assertTrue(True)

if __name__ == '__main__':
    unittest.main()