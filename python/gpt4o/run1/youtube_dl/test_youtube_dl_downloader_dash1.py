import unittest
from youtube_dl.downloader.dash import DashSegmentsFD
from youtube_dl.utils import DownloadError
from youtube_dl.compat import compat_urllib_error

class TestDashSegmentsFD(unittest.TestCase):
    def setUp(self):
        self.instance = DashSegmentsFD(None, None)
        self.instance.params = {
            'test': False,
            'fragment_retries': 1,
            'skip_unavailable_fragments': True
        }

    def test_real_download_success(self):
        info_dict = {
            'fragment_base_url': 'http://example.com/',
            'fragments': [{'path': 'frag1'}, {'path': 'frag2'}]
        }
        self.instance._prepare_and_start_frag_download = lambda ctx: None
        self.instance._download_fragment = lambda ctx, url, info_dict: (True, b'content')
        self.instance._append_fragment = lambda ctx, content: None
        self.instance._finish_frag_download = lambda ctx: None

        result = self.instance.real_download('filename', info_dict)
        self.assertTrue(result)

    def test_real_download_fragment_retry(self):
        info_dict = {
            'fragment_base_url': 'http://example.com/',
            'fragments': [{'path': 'frag1'}, {'path': 'frag2'}]
        }
        self.instance._prepare_and_start_frag_download = lambda ctx: None
        self.instance._download_fragment = lambda ctx, url, info_dict: (False, None)
        self.instance._append_fragment = lambda ctx, content: None
        self.instance._finish_frag_download = lambda ctx: None
        self.instance.report_retry_fragment = lambda err, frag_index, count, fragment_retries: None
        self.instance.report_error = lambda msg: None

        result = self.instance.real_download('filename', info_dict)
        self.assertFalse(result)

    def test_real_download_skip_fragment(self):
        info_dict = {
            'fragment_base_url': 'http://example.com/',
            'fragments': [{'path': 'frag1'}, {'path': 'frag2'}]
        }
        self.instance._prepare_and_start_frag_download = lambda ctx: None
        self.instance._download_fragment = lambda ctx, url, info_dict: (False, None)
        self.instance._append_fragment = lambda ctx, content: None
        self.instance._finish_frag_download = lambda ctx: None
        self.instance.report_skip_fragment = lambda frag_index: None

        result = self.instance.real_download('filename', info_dict)
        self.assertFalse(result)

    def test_real_download_http_error(self):
        info_dict = {
            'fragment_base_url': 'http://example.com/',
            'fragments': [{'path': 'frag1'}, {'path': 'frag2'}]
        }
        self.instance._prepare_and_start_frag_download = lambda ctx: None
        self.instance._download_fragment = lambda ctx, url, info_dict: (_ for _ in ()).throw(compat_urllib_error.HTTPError(None, None, None, None, None))
        self.instance._append_fragment = lambda ctx, content: None
        self.instance._finish_frag_download = lambda ctx: None
        self.instance.report_retry_fragment = lambda err, frag_index, count, fragment_retries: None
        self.instance.report_error = lambda msg: None

        result = self.instance.real_download('filename', info_dict)
        self.assertFalse(result)

    def test_real_download_download_error(self):
        info_dict = {
            'fragment_base_url': 'http://example.com/',
            'fragments': [{'path': 'frag1'}, {'path': 'frag2'}]
        }
        self.instance._prepare_and_start_frag_download = lambda ctx: None
        self.instance._download_fragment = lambda ctx, url, info_dict: (_ for _ in ()).throw(DownloadError('Download error'))
        self.instance._append_fragment = lambda ctx, content: None
        self.instance._finish_frag_download = lambda ctx: None
        self.instance.report_error = lambda msg: None

        with self.assertRaises(DownloadError):
            self.instance.real_download('filename', info_dict)

if __name__ == '__main__':
    unittest.main()