import unittest
from youtube_dl.downloader.dash import DashSegmentsFD
from youtube_dl.utils import DownloadError
from youtube_dl.compat import compat_urllib_error



class TestDashSegmentsFD(unittest.TestCase):
    def test_real_download(self):
        instance = DashSegmentsFD(ydl, params)
        result = instance.real_download("filename", {"fragments": [{"url": "url"}]})
        self.assertEqual(result, True)

    def test_real_download_with_fragment_base_url(self):
        instance = DashSegmentsFD(ydl, params)
        result = instance.real_download("filename", {"fragment_base_url": "fragment_base_url", "fragments": [{"path": "path"}]})
        self.assertEqual(result, True)

    def test_real_download_with_fragment_retries(self):
        instance = DashSegmentsFD(ydl, params)
        result = instance.real_download("filename", {"fragments": [{"url": "url"}], "fragment_retries": 1})
        self.assertEqual(result, True)

    def test_real_download_with_skip_unavailable_fragments(self):
        instance = DashSegmentsFD(ydl, params)
        result = instance.real_download("filename", {"fragments": [{"url": "url"}], "skip_unavailable_fragments": False})
        self.assertEqual(result, True)

    def test_real_download_with_test(self):
        instance = DashSegmentsFD(ydl, params)
        result = instance.real_download("filename", {"fragments": [{"url": "url"}], "test": True})
        self.assertEqual(result, True)

    def test_real_download_with_download_error(self):
        instance = DashSegmentsFD(ydl, params)
        result = instance.real_download("filename", {"fragments": [{"url": "url"}], "fragment_retries": 0})
        self.assertEqual(result, False)

    def test_real_download_with_compat_urllib_error(self):
        instance = DashSegmentsFD(ydl, params)
        result = instance.real_download("filename", {"fragments": [{"url": "url"}], "fragment_retries": 1})
        self.assertEqual(result, True)

    def test_real_download_with_download_error_and_skip_unavailable_fragments(self):
        instance = DashSegmentsFD(ydl, params)
        result = instance.real_download("filename", {"fragments": [{"url": "url"}], "fragment_retries": 0, "skip_unavailable_fragments": False})
        self.assertEqual(result, False)

    def test_real_download_with_download_error_and_test(self):
        instance = DashSegmentsFD(ydl, params)
        result = instance.real_download("filename", {"fragments": [{"url": "url"}], "fragment_retries": 0, "test": True})
        self.assertEqual(result, False)

    def test_real_download_with_compat_urllib_error_and_test(self):
        instance = DashSegmentsFD(ydl, params)
        result = instance.real_download("filename", {"fragments": [{"url": "url"}], "fragment_retries": 1, "test": True})
        self.assertEqual(result, True)

    def test_real_download_with_compat_urllib_error_and_skip_unavailable_fragments(self):
        instance = DashSegmentsFD(ydl, params)
        result = instance.real_download("filename", {"fragments": [{"url": "url"}], "fragment_retries": 1, "skip_unavailable_fragments": False})
        self.assertEqual(result, True)

if __name__ == '__main__':
    unittest.main()