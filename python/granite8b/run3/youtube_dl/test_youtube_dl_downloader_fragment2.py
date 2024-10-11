import unittest
from youtube_dl.downloader.fragment import FragmentFD

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