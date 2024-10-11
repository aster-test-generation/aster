import unittest
from youtube_dl.downloader.dash import *



class TestDashSegmentsFD(unittest.TestCase):
    def test_real_download(self):
        instance = DashSegmentsFD(ydl, params)
        result = instance.real_download("filename", {"fragments": [{"path": "path"}]})
        self.assertEqual(result, True)

    def test_FD_NAME(self):
        instance = DashSegmentsFD(ydl, params)
        result = instance.FD_NAME
        self.assertEqual(result, "dashsegments")

    def test_download(self):
        instance = DashSegmentsFD(ydl, params)
        result = instance.download("filename", {"fragments": [{"path": "path"}]})
        self.assertEqual(result, True)

    def test_get_filename(self):
        instance = DashSegmentsFD()
        result = instance.get_filename("filename", {"fragments": [{"path": "path"}]})
        self.assertEqual(result, "filename")

    def test_get_fragments(self):
        instance = DashSegmentsFD(ydl, params)
        result = instance.get_fragments("filename", {"fragments": [{"path": "path"}]})
        self.assertEqual(result, [{"path": "path"}])

    def test_get_fragment_base_url(self):
        instance = DashSegmentsFD(ydl, params)
        result = instance.get_fragment_base_url("filename", {"fragments": [{"path": "path"}]})
        self.assertEqual(result, None)

    def test_get_fragment_retries(self):
        instance = DashSegmentsFD(ydl, params)
        result = instance.get_fragment_retries("filename", {"fragments": [{"path": "path"}]})
        self.assertEqual(result, 0)

    def test_get_skip_unavailable_fragments(self):
        instance = DashSegmentsFD(ydl, params)
        result = instance.get_skip_unavailable_fragments("filename", {"fragments": [{"path": "path"}]})
        self.assertEqual(result, True)

    def test_get_test(self):
        instance = DashSegmentsFD(ydl, params)
        result = instance.get_test("filename", {"fragments": [{"path": "path"}]})
        self.assertEqual(result, False)

    def test_get_fragment_index(self):
        instance = DashSegmentsFD()
        result = instance.get_fragment_index("filename", {"fragments": [{"path": "path"}]})
        self.assertEqual(result, 0)

    def test_get_total_frags(self):
        instance = DashSegmentsFD()
        result = instance.get_total_frags("filename", {"fragments": [{"path": "path"}]})
        self.assertEqual(result, 1)

    def test_get_filename(self):
        instance = DashSegmentsFD(ydl, params)
        result = instance.get_filename("filename", {"fragments": [{"path": "path"}]})
        self.assertEqual(result, "filename")

    def test_get_fragment_index(self):
        instance = DashSegmentsFD(ydl, params)
        result = instance.get_fragment_index("filename", {"fragments": [{"path": "path"}]})
        self.assertEqual(result, 0)

    def test_get_total_frags(self):
        instance = DashSegmentsFD(ydl, params)
        result = instance.get_total_frags("filename", {"fragments": [{"path": "path"}]})
        self.assertEqual(result, 1)

    def test_get_frag_index(self):
        instance = DashSegmentsFD(ydl, params)
        result = instance.get_frag_index("filename", {"fragments": [{"path": "path"}]})
        self.assertEqual(result, 0)

if __name__ == '__main__':
    unittest.main()