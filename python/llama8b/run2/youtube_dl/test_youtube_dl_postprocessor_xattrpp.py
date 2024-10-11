import unittest
from youtube_dl.postprocessor.xattrpp import XAttrMetadataPP


class TestXAttrMetadataPP(unittest.TestCase):
    def test_run_method(self):
        pp = XAttrMetadataPP()
        info = {'filepath': 'path/to/file', 'webpage_url': 'https://example.com', 'title': 'Example Title', 'upload_date': '2022-01-01', 'description': 'Example Description', 'uploader': 'Example Uploader', 'format': 'Example Format'}
        result = pp.run(info)
        self.assertEqual(result, ([], info))

    def test_write_xattr_method(self):
        from ..utils import write_xattr
        filename = 'path/to/file'
        xattrname = 'user.xdg.referrer.url'
        value = 'https://example.com'.encode('utf-8')
        result = write_xattr(filename, xattrname, value)
        self.assertTrue(result)

    def test_hyphenate_date_method(self):
        from ..utils import hyphenate_date
        date = '2022-01-01'
        result = hyphenate_date(date)
        self.assertEqual(result, '2022-01-01')

    def test_XAttrMetadataError_class(self):
        from ..utils import XAttrMetadataError
        error = XAttrMetadataError('NO_SPACE')
        self.assertEqual(error.reason, 'NO_SPACE')

    def test_XAttrUnavailableError_class(self):
        from ..utils import XAttrUnavailableError
        error = XAttrUnavailableError('Error message')
        self.assertEqual(str(error), 'Error message')

    def test_str_method(self):
        pp = XAttrMetadataPP()
        result = str(pp)
        self.assertEqual(result, 'XAttrMetadataPP')

    def test_repr_method(self):
        pp = XAttrMetadataPP()
        result = repr(pp)
        self.assertEqual(result, 'XAttrMetadataPP()')

if __name__ == '__main__':
    unittest.main()