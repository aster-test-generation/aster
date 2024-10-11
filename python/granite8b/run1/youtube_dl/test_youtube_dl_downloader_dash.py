import unittest
from youtube_dl.downloader.dash import DashSegmentsFD


class TestDashSegmentsFD(unittest.TestCase):
    def test_real_download(self):
        instance = DashSegmentsFD(ydl, params)
        result = instance.real_download('filename', {'fragments': []})
        self.assertFalse(result)

    def test_real_download_with_fragment_base_url(self):
        instance = DashSegmentsFD(ydl, params)
        result = instance.real_download('filename', {'fragments': [], 'fragment_base_url': 'http://example.com'})
        self.assertFalse(result)

    def test_real_download_with_fragment_retries(self):
        instance = DashSegmentsFD(ydl, params)
        result = instance.real_download('filename', {'fragments': [], 'fragment_retries': 1})
        self.assertFalse(result)

    def test_real_download_with_skip_unavailable_fragments(self):
        instance = DashSegmentsFD(ydl, params)
        result = instance.real_download('filename', {'fragments': [], 'skip_unavailable_fragments': False})
        self.assertFalse(result)

    def test_real_download_with_test_param(self):
        instance = DashSegmentsFD(ydl, params)
        result = instance.real_download('filename', {'fragments': [], 'test': True})
        self.assertFalse(result)

    def test_real_download_with_total_frags(self):
        instance = DashSegmentsFD(ydl, params)
        result = instance.real_download('filename', {'fragments': [], 'total_frags': 1})
        self.assertFalse(result)

    def test_real_download_with_fragment_index(self):
        instance = DashSegmentsFD(ydl, params)
        result = instance.real_download('filename', {'fragments': [], 'fragment_index': 1})
        self.assertFalse(result)

    def test_real_download_with_ctx(self):
        instance = DashSegmentsFD(ydl, params)
        result = instance.real_download('filename', {'fragments': [], 'ctx': {}})
        self.assertFalse(result)

    def test_real_download_with_filename(self):
        instance = DashSegmentsFD(ydl, params)
        result = instance.real_download('filename', {'fragments': []})
        self.assertFalse(result)

    def test_real_download_with_info_dict(self):
        instance = DashSegmentsFD(ydl, params)
        result = instance.real_download('filename', {'fragments': []})
        self.assertFalse(result)

    def test_real_download_with_fragment_base_url_and_fragment_retries(self):
        instance = DashSegmentsFD(ydl, params)
        result = instance.real_download('filename', {'fragments': [], 'fragment_base_url': 'http://example.com', 'fragment_retries': 1})
        self.assertFalse(result)

    def test_real_download_with_fragment_base_url_and_skip_unavailable_fragments(self):
        instance = DashSegmentsFD(ydl, params)
        result = instance.real_download('filename', {'fragments': [], 'fragment_base_url': 'http://example.com', 'skip_unavailable_fragments': False})
        self.assertFalse(result)

    def test_real_download_with_fragment_base_url_and_test_param(self):
        instance = DashSegmentsFD(ydl, params)
        result = instance.real_download('filename', {'fragments': [], 'fragment_base_url': 'http://example.com', 'test': True})
        self.assertFalse(result)

    def test_real_download_with_fragment_base_url_and_total_frags(self):
        instance = DashSegmentsFD(ydl, params)
        result = instance.real_download('filename', {'fragments': [], 'fragment_base_url': 'http://example.com', 'total_frags': 1})
        self.assertFalse(result)

    def test_real_download_with_fragment_base_url_and_fragment_index(self):
        instance = DashSegmentsFD(ydl, params)
        result = instance.real_download('filename', {'fragments': [], 'fragment_base_url': 'http://example.com', 'fragment_index': 1})
        self.assertFalse(result)

    def test_real_download_with_fragment_base_url_and_ctx(self):
        instance = DashSegmentsFD(ydl, params)
        result = instance.real_download('filename', {'fragments': [], 'fragment_base_url': 'http://example.com', 'ctx': {}})
        self.assertFalse(result)

if __name__ == '__main__':
    unittest.main()