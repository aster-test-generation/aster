import unittest
from youtube_dl.downloader.fragment import *


class TestHttpQuietDownloader(unittest.TestCase):
    def test_to_screen(self):
        instance = HttpQuietDownloader(ydl, params)
        result = instance.to_screen()
        self.assertEqual(result, None)

class TestFragmentFD(unittest.TestCase):
    def test_report_retry_fragment(self):
        instance = FragmentFD(ydl, params)
        result = instance.report_retry_fragment()
        self.assertEqual(result, None)

    def test_report_skip_fragment(self):
        instance = FragmentFD(ydl, params)
        result = instance.report_skip_fragment()
        self.assertEqual(result, None)

    def test__prepare_url(self):
        instance = FragmentFD(ydl, params)
        result = instance._prepare_url()
        self.assertEqual(result, None)

    def test__prepare_and_start_frag_download(self):
        instance = FragmentFD(ydl, params)
        result = instance._prepare_and_start_frag_download()
        self.assertEqual(result, None)

    def test___do_ytdl_file(self):
        instance = FragmentFD(ydl, params)
        result = instance.__do_ytdl_file()
        self.assertEqual(result, None)

    def test__read_ytdl_file(self):
        instance = FragmentFD(ydl, params)
        result = instance._read_ytdl_file()
        self.assertEqual(result, None)

    def test__write_ytdl_file(self):
        instance = FragmentFD(ydl, params)
        result = instance._write_ytdl_file()
        self.assertEqual(result, None)

    def test__download_fragment(self):
        instance = FragmentFD(ydl, params)
        result = instance._download_fragment()
        self.assertEqual(result, None)

    def test__append_fragment(self):
        instance = FragmentFD(ydl, params)
        result = instance._append_fragment()
        self.assertEqual(result, None)

    def test__prepare_frag_download(self):
        instance = FragmentFD(ydl, params)
        result = instance._prepare_frag_download()
        self.assertEqual(result, None)

    def test__start_frag_download(self):
        instance = FragmentFD(ydl, params)
        result = instance._start_frag_download()
        self.assertEqual(result, None)

    def test__finish_frag_download(self):
        instance = FragmentFD(ydl, params)
        result = instance._finish_frag_download()
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()