import unittest
from youtube_dl.downloader.dash import DashSegmentsFD
from fragment import FragmentFD
from ..compat import compat_urllib_error
from ..utils import (
    DownloadError,
    urljoin,
)


class TestDashSegmentsFD(unittest.TestCase):
    def test_real_download(self):
        fragment_base_url = "https://example.com"
        fragments = [
            {"url": "https://example.com/fragment1"},
            {"url": "https://example.com/fragment2"},
        ]
        info_dict = {
            "fragment_base_url": fragment_base_url,
            "fragments": fragments,
        }
        filename = "output.mp4"
        ctx = {
            "filename": filename,
            "total_frags": len(fragments),
        }
        dash_segments_fd = DashSegmentsFD()
        dash_segments_fd._prepare_and_start_frag_download = lambda ctx: None
        dash_segments_fd._download_fragment = lambda ctx, fragment_url, info_dict: (True, b"fragment content")
        dash_segments_fd._append_fragment = lambda ctx, frag_content: None
        dash_segments_fd._finish_frag_download = lambda ctx: None
        result = dash_segments_fd.real_download(filename, info_dict)
        self.assertTrue(result)

    def test_real_download_with_error(self):
        fragment_base_url = "https://example.com"
        fragments = [
            {"url": "https://example.com/fragment1"},
            {"url": "https://example.com/fragment2"},
        ]
        info_dict = {
            "fragment_base_url": fragment_base_url,
            "fragments": fragments,
        }
        filename = "output.mp4"
        ctx = {
            "filename": filename,
            "total_frags": len(fragments),
        }
        dash_segments_fd = DashSegmentsFD()
        dash_segments_fd._prepare_and_start_frag_download = lambda ctx: None
        dash_segments_fd._download_fragment = lambda ctx, fragment_url, info_dict: (False, None)
        dash_segments_fd._append_fragment = lambda ctx, frag_content: None
        dash_segments_fd._finish_frag_download = lambda ctx: None
        result = dash_segments_fd.real_download(filename, info_dict)
        self.assertFalse(result)

if __name__ == '__main__':
    unittest.main()