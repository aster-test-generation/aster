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
        instance = FragmentFD(ydl, params)
        instance.prepare_url(None, 'http://example.com')

    def test_prepare_and_start_frag_download(self):
        instance = FragmentFD(None, None)
        instance.prepare_and_start_frag_download(None)

    def test_read_ytdl_file(self):
        instance = FragmentFD(None, None)
        instance.read_ytdl_file(None)

    def test_write_ytdl_file(self):
        instance = FragmentFD(ydl, params)
        instance.write_ytdl_file(None)

    def test_download_fragment(self):
        instance = FragmentFD(ydl, params)
        instance.download_fragment(None, 'http://example.com', None)

    def test_append_fragment(self):
        instance = FragmentFD(ydl, params)
        instance.append_fragment(None, b'example')

    def test_prepare_frag_download(self):
        instance = FragmentFD(ydl, params)
        instance.prepare_frag_download(None)

    def test_start_frag_download(self):
        instance = FragmentFD(ydl, params)
        instance.start_frag_download(None)

    def test_finish_frag_download(self):
        instance = FragmentFD(ydl, params)
        instance.finish_frag_download(None)

if __name__ == '__main__':
    unittest.main()