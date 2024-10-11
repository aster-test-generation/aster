import unittest
from youtube_dl.downloader.fragment import FragmentFD


class TestFragmentFD(unittest.TestCase):
    def test_report_retry_fragment(self):
        instance = FragmentFD(ydl, params)
        instance.report_retry_fragment(None, 0, 0, 0)

    def test_report_skip_fragment(self):
        instance = FragmentFD(ydl, params)
        instance.report_skip_fragment(0)

    def test_prepare_url(self):
        instance = FragmentFD(None, None)
        instance._prepare_url(None, '')

    def test_prepare_and_start_frag_download(self):
        instance = FragmentFD(ydl, params)
        instance._prepare_and_start_frag_download(None)

    def test_read_ytdl_file(self):
        instance = FragmentFD(ydl, params)
        instance._read_ytdl_file(None)

    def test_write_ytdl_file(self):
        instance = FragmentFD(ydl, params)
        instance._write_ytdl_file(None)

    def test_download_fragment(self):
        instance = FragmentFD(ydl, params)
        instance._download_fragment(None, '', None)

    def test_append_fragment(self):
        instance = FragmentFD(None, None)
        instance._append_fragment(None, '')

    def test_prepare_frag_download(self):
        instance = FragmentFD(ydl, params)
        instance._prepare_frag_download(None)

    def test_start_frag_download(self):
        instance = FragmentFD(ydl, params)
        instance._start_frag_download(None)

    def test_finish_frag_download(self):
        instance = FragmentFD(ydl, params)
        instance._finish_frag_download(None)

if __name__ == '__main__':
    unittest.main()