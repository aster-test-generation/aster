import unittest
from youtube_dl.postprocessor.xattrpp import *


class TestXAttrMetadataPP(unittest.TestCase):
    def test_run(self):
        instance = XAttrMetadataPP()
        result = instance.run({'filepath': 'test'})
        self.assertEqual(result, ([], {'filepath': 'test'}))

    def test_write_xattr(self):
        filename = 'test'
        xattrname = 'user.xdg.referrer.url'
        byte_value = 'test'.encode('utf-8')
        result = write_xattr(filename, xattrname, byte_value)
        self.assertEqual(result, None)

    def test_hyphenate_date(self):
        date = '20200101'
        result = hyphenate_date(date)
        self.assertEqual(result, '2020-01-01')

    def test_XAttrMetadataError(self):
        instance = XAttrMetadataError()
        result = instance.reason
        self.assertEqual(result, 'NOT_SUPPORTED')

    def test_XAttrUnavailableError(self):
        instance = XAttrUnavailableError()
        result = instance.message
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()