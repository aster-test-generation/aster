import unittest
from youtube_dl.downloader.hls import HlsFD


class TestHlsFD(unittest.TestCase):
    def test_can_download(self):
        manifest = "manifest"
        info_dict = {"url": "url"}
        result = HlsFD.can_download(manifest, info_dict)
        self.assertEqual(result, True)

    def test_real_download(self):
        filename = "filename"
        info_dict = {"url": "url"}
        result = HlsFD.real_download(filename, info_dict, info_dict)
        self.assertEqual(result, False)

    def test_is_ad_fragment_start(self):
        s = "s"
        result = HlsFD.is_ad_fragment_start(s)
        self.assertEqual(result, False)

    def test_is_ad_fragment_end(self):
        s = "s"
        result = HlsFD.is_ad_fragment_end(s)
        self.assertEqual(result, False)

    def test_prepare_and_start_frag_download(self):
        ctx = {"filename": "filename"}
        result = HlsFD._prepare_and_start_frag_download(ctx, ctx)
        self.assertEqual(result, False)

    def test_download_fragment(self):
        ctx = {"filename": "filename"}
        frag_url = "frag_url"
        info_dict = {"url": "url"}
        headers = {"headers": "headers"}
        result = HlsFD._download_fragment(ctx, frag_url, info_dict, headers)
        self.assertEqual(result, False)

    def test_append_fragment(self):
        ctx = {"filename": "filename"}
        frag_content = "frag_content"
        result = HlsFD._append_fragment(ctx, frag_content)
        self.assertEqual(result, False)

    def test_finish_frag_download(self):
        ctx = {"filename": "filename"}
        result = HlsFD._finish_frag_download(ctx, ctx)
        self.assertEqual(result, False)


if __name__ == '__main__':
    unittest.main()