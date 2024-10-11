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
        result = downloader._prepare_url({}, url, headers)
        self.assertEqual(result, sanitized_Request(url, None, headers))

    def test_prepare_and_start_frag_download(self):
        downloader = HttpQuietDownloader()
        ctx = {'foo': 'bar'}
        downloader._prepare_and_start_frag_download(ctx)
        self.assertEqual(downloader._prepare_and_start_frag_download_calls, 1)

    def test_do_ytdl_file(self):
        downloader = HttpQuietDownloader()
        ctx = {'foo': 'bar'}
        result = downloader.__do_ytdl_file(ctx)
        self.assertEqual(result, not ctx['live'] and not ctx['tmpfilename'] == '-')

    def test_read_ytdl_file(self):
        downloader = HttpQuietDownloader()
        ctx = {'foo': 'bar'}
        downloader._read_ytdl_file(ctx)
        self.assertEqual(downloader._read_ytdl_file_calls, 1)

    def test_write_ytdl_file(self):
        downloader = HttpQuietDownloader()
        ctx = {'foo': 'bar'}
        downloader._write_ytdl_file(ctx)
        self.assertEqual(downloader._write_ytdl_file_calls, 1)

    def test_download_fragment(self):
        downloader = HttpQuietDownloader()
        ctx = {'foo': 'bar'}
        frag_url = 'test'
        info_dict = {'foo': 'bar'}
        headers = {'foo': 'bar'}
        result = downloader._download_fragment(ctx, frag_url, info_dict, headers)
        self.assertEqual(result, (True, b''))

    def test_append_fragment(self):
        downloader = HttpQuietDownloader()
        ctx = {'foo': 'bar'}
        frag_content = b'test'
        downloader._append_fragment(ctx, frag_content)
        self.assertEqual(downloader._append_fragment_calls, 1)

    def test_prepare_frag_download(self):
        downloader = HttpQuietDownloader()
        ctx = {'foo': 'bar'}
        downloader._prepare_frag_download(ctx)
        self.assertEqual(downloader._prepare_frag_download_calls, 1)

    def test_start_frag_download(self):
        downloader = HttpQuietDownloader()
        ctx = {'foo': 'bar'}
        start = downloader._start_frag_download(ctx)
        self.assertEqual(downloader._start_frag_download_calls, 1)

    def test_finish_frag_download(self):
        downloader = HttpQuietDownloader()
        ctx = {'foo': 'bar'}
        downloader._finish_frag_download(ctx)
        self.assertEqual(downloader._finish_frag_download_calls, 1)

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
        result = downloader._prepare_url({}, url, headers)
        self.assertEqual(result, sanitized_Request(url, None, headers))

    def test_prepare_and_start_frag_download(self):
        downloader = FragmentFD()
        ctx = {'foo': 'bar'}
        downloader._prepare_and_start_frag_download(ctx)
        self.assertEqual(downloader._prepare_and_start_frag_download_calls, 1)

    def test_do_ytdl_file(self):
        downloader = FragmentFD()
        ctx = {'foo': 'bar'}
        result = downloader.__do_ytdl_file(ctx)
        self.assertEqual(result, not ctx['live'] and not ctx['tmpfilename'] == '-')

    def test_read_ytdl_file(self):
        downloader = FragmentFD()
        ctx = {'foo': 'bar'}
        downloader._read_ytdl_file(ctx)
        self.assertEqual(downloader._read_ytdl_file_calls, 1)

if __name__ == '__main__':
    unittest.main()