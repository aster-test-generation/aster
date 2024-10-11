import unittest
from youtube_dl.postprocessor.xattrpp import XAttrMetadataPP
from common import PostProcessor
from ..compat import compat_os_name
from ..utils import (
    hyphenate_date,
    write_xattr,
    XAttrMetadataError,
    XAttrUnavailableError,
)


class TestXAttrMetadataPP(unittest.TestCase):
    def test_run(self):
        pp = XAttrMetadataPP()
        info = {
            'filepath': 'test.mp4',
            'title': 'Test Title',
            'upload_date': '20230101',
            'description': 'Test Description',
            'uploader': 'Test Uploader',
            'format': 'Test Format',
        }
        pp.run(info)
        self.assertEqual(info, {
            'filepath': 'test.mp4',
            'title': 'Test Title',
            'upload_date': '20230101',
            'description': 'Test Description',
            'uploader': 'Test Uploader',
            'format': 'Test Format',
        })

    def test_private_method(self):
        pp = XAttrMetadataPP()
        info = {
            'filepath': 'test.mp4',
            'title': 'Test Title',
            'upload_date': '20230101',
            'description': 'Test Description',
            'uploader': 'Test Uploader',
            'format': 'Test Format',
        }
        pp._XAttrMetadataPP__private_method(info)
        self.assertEqual(info, {
            'filepath': 'test.mp4',
            'title': 'Test Title',
            'upload_date': '20230101',
            'description': 'Test Description',
            'uploader': 'Test Uploader',
            'format': 'Test Format',
        })

    def test_protected_method(self):
        pp = XAttrMetadataPP()
        info = {
            'filepath': 'test.mp4',
            'title': 'Test Title',
            'upload_date': '20230101',
            'description': 'Test Description',
            'uploader': 'Test Uploader',
            'format': 'Test Format',
        }
        pp._protected_method(info)
        self.assertEqual(info, {
            'filepath': 'test.mp4',
            'title': 'Test Title',
            'upload_date': '20230101',
            'description': 'Test Description',
            'uploader': 'Test Uploader',
            'format': 'Test Format',
        })

    def test_str_method(self):
        pp = XAttrMetadataPP()
        self.assertEqual(str(pp), 'XAttrMetadataPP')

    def test_repr_method(self):
        pp = XAttrMetadataPP()
        self.assertEqual(repr(pp), 'XAttrMetadataPP()')

    def test_eq_method(self):
        pp1 = XAttrMetadataPP()
        pp2 = XAttrMetadataPP()
        self.assertEqual(pp1, pp2)

if __name__ == '__main__':
    unittest.main()