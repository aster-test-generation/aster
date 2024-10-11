import unittest
from youtube_dl.downloader.fragment import FragmentFD


class TestFragmentFD(unittest.TestCase):
    def test_prepare_url(self):
        info_dict = {
            'http_headers': {'header1': 'value1', 'header2': 'value2'}
        }
        url = 'https://example.com'
        expected_url = 'https://example.com'
        actual_url = FragmentFD._prepare_url(self, info_dict, url)
        self.assertEqual(actual_url, expected_url)
    def test_prepare_and_start_frag_download(self):
        ctx = {
            'live': False,
            'tmpfilename': 'test.mp4',
            'filename': 'test.mp4',
            'total_frags': 10,
        }
        FragmentFD._prepare_and_start_frag_download(self, ctx)
        self.assertEqual(ctx['fragment_index'], 0)
        self.assertEqual(ctx['fragment_count'], 10)
    def test_read_ytdl_file(self):
        ctx = {
            'filename': 'test.mp4',
        }
        FragmentFD._read_ytdl_file(self, ctx)
        self.assertFalse(ctx.get('ytdl_corrupt'))
    def test_write_ytdl_file(self):
        ctx = {
            'filename': 'test.mp4',
            'fragment_index': 5,
            'fragment_count': 10,
        }
        FragmentFD._write_ytdl_file(self, ctx)
        # Check if the .ytdl file is created and contains the correct data
        with open(FragmentFD.ytdl_filename(ctx['filename']), 'r') as f:
            data = json.load(f)
            self.assertEqual(data['downloader']['current_fragment']['index'], ctx['fragment_index'])
            self.assertEqual(data['downloader']['fragment_count'], ctx['fragment_count'])
    def test_download_fragment(self):
        ctx = {
            'filename': 'test.mp4',
            'tmpfilename': 'test.mp4',
            'fragment_index': 5,
        }
        frag_url = 'https://example.com/fragment'
        info_dict = {
            'http_headers': {'header1': 'value1', 'header2': 'value2'}
        }
        success, frag_content = FragmentFD._download_fragment(self, ctx, frag_url, info_dict)
        self.assertTrue(success)
        self.assertIsNotNone(frag_content)
    def test_append_fragment(self):
        ctx = {
            'filename': 'test.mp4',
            'tmpfilename': 'test.mp4',
            'fragment_index': 5,
        }
        frag_content = b'fragment content'
        FragmentFD._append_fragment(self, ctx, frag_content)
        # Check if the fragment content is appended to the destination stream and the .ytdl file is updated
        with open(ctx['tmpfilename'], 'rb') as f:
            data = f.read()
            self.assertEqual(data, frag_content)
        with open(FragmentFD.ytdl_filename(ctx['filename']), 'r') as f:
            data = json.load(f)
            self.assertEqual(data['downloader']['current_fragment']['index'], ctx['fragment_index'] + 1)
    def test_prepare_frag_download(self):
        ctx = {
            'live': False,
            'tmpfilename': 'test.mp4',
            'filename': 'test.mp4',
            'total_frags': 10,
        }
        FragmentFD._prepare_frag_download(self, ctx)
        self.assertEqual(ctx['fragment_index'], 0)
        self.assertEqual(ctx['fragment_count'], 10)
    def test_start_frag_download(self):
        ctx = {
            'live': False,
            'tmpfilename': 'test.mp4',
            'filename': 'test.mp4',
            'total_frags': 10,
        }
        FragmentFD._start_frag_download(self, ctx)
        self.assertGreater(ctx['started'], 0)

if __name__ == '__main__':
    unittest.main()