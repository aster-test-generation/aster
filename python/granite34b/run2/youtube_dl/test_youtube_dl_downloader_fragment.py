import unittest
from youtube_dl.downloader.fragment import FragmentFD


class TestFragmentFD(unittest.TestCase):
    def test_prepare_url(self):
        info_dict = {'http_headers': {'header1': 'value1', 'header2': 'value2'}}
        url = 'http://example.com'
        fd = FragmentFD(ydl=None, params={})
        result = fd._prepare_url(info_dict, url)
        self.assertEqual(result.get_header('header1'), 'value1')
        self.assertEqual(result.get_header('header2'), 'value2')

    def test_prepare_and_start_frag_download(self):
        ctx = {'live': False, 'filename': 'test.mp4', 'total_frags': 10, 'ad_frags': 2}
        fd = FragmentFD(ydl=None, params={})
        fd._prepare_and_start_frag_download(ctx)
        self.assertEqual(ctx['tmpfilename'], 'test.mp4. frag')
        self.assertEqual(ctx['fragment_index'], 0)
        self.assertEqual(ctx['fragment_count'], 10)
        self.assertEqual(ctx['ad_frags'], 2)

    def test_read_ytdl_file(self):
        ctx = {'filename': 'test.mp4'}
        fd = FragmentFD(ydl=None, params={})
        fd._read_ytdl_file(ctx)
        self.assertEqual(ctx['fragment_index'], 0)
        self.assertEqual(ctx.get('ytdl_corrupt'), True)

    def test_write_ytdl_file(self):
        ctx = {'filename': 'test.mp4', 'fragment_index': 5, 'fragment_count': 10}
        fd = FragmentFD(ydl=None, params={})
        fd._write_ytdl_file(ctx)
        with open(fd.ytdl_filename('test.mp4'), 'r') as f:
            data = json.load(f)
            self.assertEqual(data['downloader']['current_fragment']['index'], 5)
            self.assertEqual(data['downloader']['fragment_count'], 10)

    def test_download_fragment(self):
        ctx = {'filename': 'test.mp4', 'fragment_index': 3}
        info_dict = {'http_headers': {'header1': 'value1', 'header2': 'value2'}}
        frag_url = 'http://example.com/fragment'
        fd = FragmentFD(ydl=None, params={})
        success, frag_content = fd._download_fragment(ctx, frag_url, info_dict)
        self.assertTrue(success)
        self.assertEqual(frag_content, b'fragment content')

    def test_append_fragment(self):
        ctx = {'filename': 'test.mp4', 'fragment_index': 4}
        frag_content = b'fragment content'
        fd = FragmentFD(ydl=None, params={})
        fd._append_fragment(ctx, frag_content)
        with open(ctx['tmpfilename'], 'rb') as f:
            data = f.read()
            self.assertEqual(data, b'fragment content')

    def test_prepare_frag_download(self):
        ctx = {'live': False, 'filename': 'test.mp4', 'total_frags': 10}
        fd = FragmentFD(ydl=None, params={})
        fd._prepare_frag_download(ctx)
        self.assertEqual(ctx['tmpfilename'], 'test.mp4.frag')
        self.assertEqual(ctx['fragment_index'], 0)
        self.assertEqual(ctx['fragment_count'], 10)

    def test_start_frag_download(self):
        ctx = {'filename': 'test.mp4', 'total_frags': 10}
        fd = FragmentFD(ydl=None, params={})
        start = fd._start_frag_download(ctx)
        self.assertTrue(isinstance(start, float))

    def test_finish_frag_download(self):
        ctx = {'filename': 'test.mp4', 'tmpfilename': 'test.mp4.frag'}
        fd = FragmentFD(ydl=None, params={})
        fd._finish_frag_download(ctx)
        self.assertFalse(os.path.isfile(ctx['tmpfilename']))
        self.assertTrue(os.path.isfile(ctx['filename']))

if __name__ == '__main__':
    unittest.main()