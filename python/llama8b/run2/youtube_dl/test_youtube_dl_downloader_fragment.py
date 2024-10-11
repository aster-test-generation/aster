import unittest
from youtube_dl.downloader.fragment import HttpQuietDownloader, FragmentFD


class TestHttpQuietDownloader(unittest.TestCase):
    def test_to_screen(self):
        downloader = HttpQuietDownloader()
        downloader.to_screen('test', 'test', kargs='test')
        self.assertEqual(downloader.to_screen.called, True)

    def test_report_retry_fragment(self):
        downloader = HttpQuietDownloader()
        downloader.report_retry_fragment('test', 1, 2, 3)
        self.assertEqual(downloader.to_screen.called, True)

    def test_report_skip_fragment(self):
        downloader = HttpQuietDownloader()
        downloader.report_skip_fragment(1)
        self.assertEqual(downloader.to_screen.called, True)

    def test_prepare_url(self):
        downloader = HttpQuietDownloader()
        url = 'test'
        info_dict = {'http_headers': 'test'}
        result = downloader._prepare_url(info_dict, url)
        self.assertEqual(result, sanitized_Request(url, None, info_dict.get('http_headers')))

    def test_prepare_and_start_frag_download(self):
        downloader = HttpQuietDownloader()
        ctx = {'live': False, 'tmpfilename': 'test', 'fragment_index': 0}
        downloader._prepare_and_start_frag_download(ctx)
        self.assertEqual(ctx['dl'].download.called, True)

    def test_do_ytdl_file(self):
        downloader = HttpQuietDownloader()
        ctx = {'live': False, 'tmpfilename': 'test', 'fragment_index': 0}
        result = downloader.__do_ytdl_file(ctx)
        self.assertEqual(result, not ctx['live'] and not ctx['tmpfilename'] == '-')

    def test_read_ytdl_file(self):
        downloader = HttpQuietDownloader()
        ctx = {'live': False, 'tmpfilename': 'test', 'fragment_index': 0}
        downloader._read_ytdl_file(ctx)
        self.assertEqual(ctx['fragment_index'], 0)

    def test_write_ytdl_file(self):
        downloader = HttpQuietDownloader()
        ctx = {'live': False, 'tmpfilename': 'test', 'fragment_index': 0}
        downloader._write_ytdl_file(ctx)
        self.assertEqual(ctx['fragment_index'], 0)

    def test_download_fragment(self):
        downloader = HttpQuietDownloader()
        ctx = {'live': False, 'tmpfilename': 'test', 'fragment_index': 0}
        frag_url = 'test'
        info_dict = {'url': 'test', 'http_headers': 'test'}
        result = downloader._download_fragment(ctx, frag_url, info_dict)
        self.assertEqual(result, (True, b'test'))

    def test_append_fragment(self):
        downloader = HttpQuietDownloader()
        ctx = {'live': False, 'tmpfilename': 'test', 'fragment_index': 0}
        frag_content = b'test'
        downloader._append_fragment(ctx, frag_content)
        self.assertEqual(ctx['dest_stream'].write.called, True)

    def test_prepare_frag_download(self):
        downloader = HttpQuietDownloader()
        ctx = {'live': False, 'tmpfilename': 'test', 'fragment_index': 0}
        downloader._prepare_frag_download(ctx)
        self.assertEqual(ctx['dl'].download.called, True)

    def test_start_frag_download(self):
        downloader = HttpQuietDownloader()
        ctx = {'live': False, 'tmpfilename': 'test', 'fragment_index': 0}
        start = downloader._start_frag_download(ctx)
        self.assertEqual(ctx['started'], start)

    def test_finish_frag_download(self):
        downloader = HttpQuietDownloader()
        ctx = {'live': False, 'tmpfilename': 'test', 'fragment_index': 0}
        downloader._finish_frag_download(ctx)
        self.assertEqual(ctx['dest_stream'].close.called, True)

class TestFragmentFD(unittest.TestCase):
    def test_report_retry_fragment(self):
        downloader = FragmentFD()
        downloader.report_retry_fragment('test', 1, 2, 3)
        self.assertEqual(downloader.to_screen.called, True)

    def test_report_skip_fragment(self):
        downloader = FragmentFD()
        downloader.report_skip_fragment(1)
        self.assertEqual(downloader.to_screen.called, True)

    def test_prepare_url(self):
        downloader = FragmentFD()
        url = 'test'
        info_dict = {'http_headers': 'test'}
        result = downloader._prepare_url(info_dict, url)
        self.assertEqual(result, sanitized_Request(url, None, info_dict.get('http_headers')))

    def test_prepare_and_start_frag_download(self):
        downloader = FragmentFD()
        ctx = {'live': False, 'tmpfilename': 'test', 'fragment_index': 0}
        downloader._prepare_and_start_frag_download(ctx)
        self.assertEqual(ctx['dl'].download.called, True)

if __name__ == '__main__':
    unittest.main()