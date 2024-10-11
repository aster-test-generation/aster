import unittest
from youtube_dl.downloader.fragment import FragmentFD
from youtube_dl.downloader.fragment import FragmentFD, HttpQuietDownloader


class TestFragmentFD(unittest.TestCase):
    def test_report_retry_fragment(self):
        instance = FragmentFD(ydl, params)
        instance.report_retry_fragment(None, 0, 0, 0)

    def test_report_skip_fragment(self):
        instance = FragmentFD(ydl, params)
        instance.report_skip_fragment(0)

    def test__prepare_url(self):
        instance = FragmentFD(ydl, params)
        instance._prepare_url(None, '')

    def test__prepare_and_start_frag_download(self):
        instance = FragmentFD(ydl, params)
        instance._prepare_and_start_frag_download(None)

    def test__read_ytdl_file(self):
        instance = FragmentFD(None, None)
        instance._read_ytdl_file(None)

    def test__write_ytdl_file(self):
        instance = FragmentFD(ydl, params)
        instance._write_ytdl_file(None)

    def test__download_fragment(self):
        instance = FragmentFD(ydl, params)
        instance._download_fragment(None, '', None)

    def test__append_fragment(self):
        instance = FragmentFD(ydl, params)
        instance._append_fragment(None, b'')

    def test__prepare_frag_download(self):
        instance = FragmentFD(ydl, params)
        instance._prepare_frag_download(None)

    def test__start_frag_download(self):
        instance = FragmentFD(ydl, params)
        instance._start_frag_download(None)

    def test__finish_frag_download(self):
        instance = FragmentFD(ydl, params)
        instance._finish_frag_download(None)

class TestFragmentFD(unittest.TestCase):
    def setUp(self):
        self.fd = FragmentFD(None, {})

    def test_report_retry_fragment(self):
        self.fd.report_retry_fragment(None, 1, 1, 1)

    def test_report_skip_fragment(self):
        self.fd.report_skip_fragment(1)

    def test__prepare_url(self):
        self.assertEqual(self.fd._prepare_url({}, 'http://example.com'), 'http://example.com')
        headers = {'User-Agent': 'Mozilla/5.0'}
        self.assertEqual(self.fd._prepare_url({'http_headers': headers}, 'http://example.com'), sanitized_Request('http://example.com', None, headers))

    def test__prepare_and_start_frag_download(self):
        ctx = {'live': False, 'total_frags': 10}
        self.fd._prepare_and_start_frag_download(ctx)
        self.assertEqual(ctx['fragment_index'], 0)

    def test__read_ytdl_file(self):
        ctx = {'filename': 'test.mp4', 'ytdl_filename': lambda x: 'test.mp4.ytdl'}
        self.fd._read_ytdl_file(ctx)
        self.assertEqual(ctx['fragment_index'], 0)

    def test__write_ytdl_file(self):
        ctx = {'filename': 'test.mp4', 'ytdl_filename': lambda x: 'test.mp4.ytdl'}
        self.fd._write_ytdl_file(ctx)

    def test__download_fragment(self):
        ctx = {'fragment_index': 1, 'fragment_url': 'http://example.com/fragment1', 'info_dict': {}, 'headers': None}
        self.fd.ydl = HttpQuietDownloader(None, {})
        success, frag_content = self.fd._download_fragment(ctx, ctx['fragment_url'], ctx['info_dict'], ctx['headers'])
        self.assertTrue(success)
        self.assertIsNotNone(frag_content)

    def test__append_fragment(self):
        ctx = {'fragment_index': 1, 'dest_stream': open('test.mp4', 'wb')}
        frag_content = b'fragment content'
        self.fd._append_fragment(ctx, frag_content)
        self.fd.dest_stream.close()
        os.remove('test.mp4')

    def test__prepare_frag_download(self):
        ctx = {'filename': 'test.mp4', 'total_frags': 10, 'live': False}
        self.fd.ydl = HttpQuietDownloader(None, {})
        self.fd._prepare_frag_download(ctx)
        self.assertEqual(ctx['fragment_index'], 0)

    def test__start_frag_download(self):
        ctx = {'filename': 'test.mp4', 'total_frags': 10, 'live': False}
        self.fd.ydl = HttpQuietDownloader(None, {})
        start = self.fd._start_frag_download(ctx)
        self.assertIsNotNone(start)

    def test__finish_frag_download(self):
        ctx = {'filename': 'test.mp4', 'total_frags': 10, 'live': False, 'tmpfilename': 'test.mp4.part'}
        self.fd.ydl = HttpQuietDownloader(None, {})
        self.fd._finish_frag_download(ctx)
        self.assertEqual(os.path.getsize('test.mp4'), 0)
        os.remove('test.mp4')
        os.remove('test.mp4.part')

class TestFragmentFD(unittest.TestCase):
    def test_report_retry_fragment(self):
        instance = FragmentFD()
        instance.report_retry_fragment(None, 1, 2, 3)

    def test_report_skip_fragment(self):
        instance = FragmentFD()
        instance.report_skip_fragment(1)

    def test__prepare_url(self):
        instance = FragmentFD()
        instance._prepare_url(None, 'http://example.com')

    def test__prepare_and_start_frag_download(self):
        instance = FragmentFD()
        instance._prepare_and_start_frag_download(None)

    def test__read_ytdl_file(self):
        instance = FragmentFD()
        instance._read_ytdl_file(None)

    def test__write_ytdl_file(self):
        instance = FragmentFD()
        instance._write_ytdl_file(None)

    def test__download_fragment(self):
        instance = FragmentFD()
        instance._download_fragment(None, 'http://example.com', None)

    def test__append_fragment(self):
        instance = FragmentFD()
        instance._append_fragment(None, b'example')

    def test__prepare_frag_download(self):
        instance = FragmentFD()
        instance._prepare_frag_download(None)

    def test__start_frag_download(self):
        instance = FragmentFD()
        instance._start_frag_download(None)

    def test__finish_frag_download(self):
        instance = FragmentFD()
        instance._finish_frag_download(None)

if __name__ == '__main__':
    unittest.main()