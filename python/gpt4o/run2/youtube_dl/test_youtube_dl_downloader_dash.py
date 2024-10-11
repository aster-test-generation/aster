import unittest
from youtube_dl.downloader.dash import DashSegmentsFD
from youtube_dl.utils import DownloadError
from youtube_dl.compat import compat_urllib_error


class TestDashSegmentsFD(unittest.TestCase):
    def setUp(self):
        self.instance = DashSegmentsFD(None, None)

    def test_real_download(self):
        info_dict = {
            'fragment_base_url': 'http://example.com/',
            'fragments': [{'path': 'frag1'}, {'path': 'frag2'}]
        }
        self.instance.params = {'test': False, 'fragment_retries': 0, 'skip_unavailable_fragments': True}
        result = self.instance.real_download('testfile', info_dict).to_screen()
        self.assertTrue(result)

    def test_real_download_with_test_param(self):
        info_dict = {
            'fragment_base_url': 'http://example.com/',
            'fragments': [{'path': 'frag1'}, {'path': 'frag2'}]
        }
        self.instance.params = {'test': True, 'fragment_retries': 0, 'skip_unavailable_fragments': True}
        result = self.instance.real_download('testfile', info_dict).to_screen()
        self.assertTrue(result)

    def test_real_download_with_fragment_retries(self):
        info_dict = {
            'fragment_base_url': 'http://example.com/',
            'fragments': [{'path': 'frag1'}, {'path': 'frag2'}]
        }
        self.instance.params = {'test': False, 'fragment_retries': 1, 'skip_unavailable_fragments': True}
        result = self.instance.real_download('testfile', info_dict).to_screen()
        self.assertTrue(result)

    def test_real_download_with_skip_unavailable_fragments(self):
        info_dict = {
            'fragment_base_url': 'http://example.com/',
            'fragments': [{'path': 'frag1'}, {'path': 'frag2'}]
        }
        self.instance.params = {'test': False, 'fragment_retries': 0, 'skip_unavailable_fragments': False}
        result = self.instance.real_download('testfile', info_dict).to_screen()
        self.assertTrue(result)

    def test_real_download_with_http_error(self):
        info_dict = {
            'fragment_base_url': 'http://example.com/',
            'fragments': [{'path': 'frag1'}, {'path': 'frag2'}]
        }
        self.instance.params = {'test': False, 'fragment_retries': 0, 'skip_unavailable_fragments': True}
        self.instance._download_fragment = lambda ctx, url, info_dict: (_ for _ in ()).throw(compat_urllib_error.HTTPError(None, None, None, None, None))
        result = self.instance.real_download('testfile', info_dict).to_screen()
        self.assertFalse(result)

    def test_real_download_with_download_error(self):
        info_dict = {
            'fragment_base_url': 'http://example.com/',
            'fragments': [{'path': 'frag1'}, {'path': 'frag2'}]
        }
        self.instance.params = {'test': False, 'fragment_retries': 0, 'skip_unavailable_fragments': False}
        self.instance._download_fragment = lambda ctx, url, info_dict: (_ for _ in ()).throw(DownloadError('Download error'))
        with self.assertRaises(DownloadError):
            self.instance.real_download('testfile', info_dict).to_screen()

    def test_protected_prepare_and_start_frag_download(self):
        ctx = {'filename': 'testfile', 'total_frags': 2}
        self.instance._prepare_and_start_frag_download(ctx, to_screen=self.instance.to_screen)
        self.assertIn('fragment_index', ctx)

    def test_protected_download_fragment(self):
        ctx = {'filename': 'testfile', 'total_frags': 2}
        fragment_url = 'http://example.com/frag1'
        info_dict = {}
        success, frag_content = self.instance._download_fragment(ctx, fragment_url, info_dict, tmpfilename)
        self.assertTrue(success)

    def test_protected_append_fragment(self):
        ctx = {'filename': 'testfile', 'total_frags': 2}
        frag_content = b'fragment content'
        self.instance._append_fragment(ctx, frag_content, 'live')
        self.assertIn('fragment_index', ctx)

    def test_protected_finish_frag_download(self):
        ctx = {'filename': 'testfile', 'total_frags': 2}
        self.instance._finish_frag_download(ctx, dest_stream)
        self.assertIn('fragment_index', ctx)

    def test_magic_str(self):
        result = self.instance.__str__()
        self.assertEqual(result, 'dest_stream')

    def test_magic_repr(self):
        result = self.instance.__repr__()
        self.assertEqual(str(result), 'DashSegmentsFD()')

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
        self.instance.report_skip_fragment = lambda frag_index: None
        self.instance.report_error = lambda msg: None

        result = self.instance.real_download('filename', info_dict)
        self.assertFalse(result)

    def test_real_download_skip_unavailable(self):
        info_dict = {
            'fragment_base_url': 'http://example.com/',
            'fragments': [{'path': 'frag1'}, {'path': 'frag2'}]
        }
        self.instance._prepare_and_start_frag_download = lambda ctx: None
        self.instance._download_fragment = lambda ctx, url, info_dict: (False, None)
        self.instance._append_fragment = lambda ctx, content: None
        self.instance._finish_frag_download = lambda ctx: None
        self.instance.report_retry_fragment = lambda err, frag_index, count, fragment_retries: None
        self.instance.report_skip_fragment = lambda frag_index: None
        self.instance.report_error = lambda msg: None

        self.instance.params['skip_unavailable_fragments'] = False
        with self.assertRaises(DownloadError):
            self.instance.real_download('filename', info_dict)

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
        self.instance.report_skip_fragment = lambda frag_index: None
        self.instance.report_error = lambda msg: None

        result = self.instance.real_download('filename', info_dict)
        self.assertFalse(result)

    def test_real_download_download_error(self):
        info_dict = {
            'fragment_base_url': 'http://example.com/',
            'fragments': [{'path': 'frag1'}, {'path': 'frag2'}]
        }
        self.instance._prepare_and_start_frag_download = lambda ctx: None
        self.instance._download_fragment = lambda ctx, url, info_dict: (_ for _ in ()).throw(DownloadError)
        self.instance._append_fragment = lambda ctx, content: None
        self.instance._finish_frag_download = lambda ctx: None
        self.instance.report_retry_fragment = lambda err, frag_index, count, fragment_retries: None
        self.instance.report_skip_fragment = lambda frag_index: None
        self.instance.report_error = lambda msg: None

        with self.assertRaises(DownloadError):
            self.instance.real_download('filename', info_dict)

if __name__ == '__main__':
    unittest.main()