import unittest
from youtube_dl.postprocessor.xattrpp import XAttrMetadataPP


class TestXAttrMetadataPP(unittest.TestCase):
    def test_run(self):
        pp = XAttrMetadataPP()
        info = {'filepath': '/path/to/file', 'webpage_url': 'http://example.com', 'title': 'Test Title', 'upload_date': '20230101', 'description': 'Test Description', 'uploader': 'Test Uploader', 'format': 'Test Format'}
        pp_info, new_info = pp.run(info)
        self.assertEqual(pp_info, [])
        self.assertEqual(new_info, info)

if __name__ == '__main__':
    unittest.main()