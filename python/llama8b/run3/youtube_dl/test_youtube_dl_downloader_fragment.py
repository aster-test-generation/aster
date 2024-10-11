import unittest
from youtube_dl.downloader.fragment import HttpQuietDownloader, FragmentFD


class TestHttpQuietDownloader(unittest.TestCase):
    def test_to_screen(self):
        downloader = HttpQuietDownloader()
        downloader.to_screen('test', foo='bar')
        self.assertEqual(downloader.to_screen_calls, 1)

    def test_report_retry_fragment(self):
        downloader = HttpQuietDownloader()
        downloader.report_retry_fragment(Exception('test'), 1, 2, 3)
        self.assertEqual(downloader.report_retry_fragment_calls, 1)

    def test_report_skip_fragment(self):
        downloader = HttpQuietDownloader()
        downloader.report_skip_fragment(1)
        self.assertEqual(downloader.report_skip_fragment_calls, 1)

    def test_prepare_url(self):
        downloader = HttpQuietDownloader()
        url = 'test'
        headers = {'foo': 'bar'}
        result = downloader._prepare_url({'http_headers': headers}, url)
        self.assertEqual(result, sanitized_Request(url, None, headers))

    def test_prepare_and_start_frag_download(self):
        downloader = HttpQuietDownloader()
        ctx = {'live': False, 'total_frags': 1}
        downloader._prepare_and_start_frag_download(ctx)
        self.assertEqual(downloader._prepare_and_start_frag_download_calls, 1)

    def test_do_ytdl_file(self):
        downloader = HttpQuietDownloader()
        ctx = {'live': False, 'tmpfilename': 'test'}
        result = downloader.__do_ytdl_file(ctx)
        self.assertEqual(result, True)

    def test_read_ytdl_file(self):
        downloader = HttpQuietDownloader()
        ctx = {'filename': 'test', 'fragment_index': 1}
        downloader._read_ytdl_file(ctx)
        self.assertEqual(ctx['fragment_index'], 1)

    def test_write_ytdl_file(self):
        downloader = HttpQuietDownloader()
        ctx = {'filename': 'test', 'fragment_index': 1}
        downloader._write_ytdl_file(ctx)
        self.assertEqual(ctx['fragment_index'], 1)

    def test_download_fragment(self):
        downloader = HttpQuietDownloader()
        ctx = {'dl': HttpQuietDownloader(), 'fragment_index': 1}
        result = downloader._download_fragment(ctx, 'test', {'http_headers': {'foo': 'bar'}})
        self.assertEqual(result, (True, b''))

    def test_append_fragment(self):
        downloader = HttpQuietDownloader()
        ctx = {'dest_stream': open('test', 'wb'), 'fragment_index': 1}
        downloader._append_fragment(ctx, b'')
        self.assertEqual(ctx['fragment_index'], 1)

    def test_prepare_frag_download(self):
        downloader = HttpQuietDownloader()
        ctx = {'live': False, 'total_frags': 1}
        downloader._prepare_frag_download(ctx)
        self.assertEqual(ctx['fragment_index'], 0)

    def test_start_frag_download(self):
        downloader = HttpQuietDownloader()
        ctx = {'live': False, 'total_frags': 1}
        start = downloader._start_frag_download(ctx)
        self.assertEqual(start, time.time())

    def test_finish_frag_download(self):
        downloader = HttpQuietDownloader()
        ctx = {'live': False, 'total_frags': 1}
        downloader._finish_frag_download(ctx)
        self.assertEqual(ctx['dest_stream'].closed, True)

class TestFragmentFD(unittest.TestCase):
    def test_report_retry_fragment(self):
        downloader = FragmentFD()
        downloader.report_retry_fragment(Exception('test'), 1, 2, 3)
        self.assertEqual(downloader.report_retry_fragment_calls, 1)

    def test_report_skip_fragment(self):
        downloader = FragmentFD()
        downloader.report_skip_fragment(1)
        self.assertEqual(downloader.report_skip_fragment_calls, 1)

    def test_prepare_url(self):
        downloader = FragmentFD()
        url = 'test'
        headers = {'foo': 'bar'}
        result = downloader._prepare_url({'http_headers': headers}, url)
        self.assertEqual(result, sanitized_Request(url, None, headers))

    def test_prepare_and_start_frag_download(self):
        downloader = FragmentFD()
        ctx = {'live': False, 'total_frags': 1}
        downloader._prepare_and_start_frag_download(ctx)
        self.assertEqual(downloader._prepare_and_start_frag_download_calls, 1)

    def test_do_ytdl_file(self):
        downloader = FragmentFD()
        ctx = {'live': False, 'tmpfilename': 'test'}
        result = downloader.__do_ytdl_file(ctx)
        self.assertEqual(result, True)

    def test_read_ytdl_file(self):
        downloader = FragmentFD()
        ctx = {'filename': 'test', 'fragment_index': 1}
        downloader._read_ytdl_file(ctx)
        self.assertEqual(ctx['fragment_index'], 1)

if __name__ == '__main__':
    unittest.main()