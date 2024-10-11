import unittest
from youtube_dl.postprocessor.xattrpp import XAttrMetadataPP


class TestXAttrMetadataPP(unittest.TestCase):
    def test_run(self):
        pp = XAttrMetadataPP()
        info = {'filepath': 'test.mp4', 'webpage_url': 'https://example.com', 'title': 'Test Video', 'upload_date': '20230101', 'description': 'Test video description', 'uploader': 'Test User', 'format': 'mp4'}
        pp_info, new_info = pp.run(info)
        self.assertEqual(pp_info, [])
        self.assertEqual(new_info, info)

    def test_xattr_mapping(self):
        pp = XAttrMetadataPP()
        xattr_mapping = {
            'user.xdg.referrer.url': 'webpage_url',
            'user.dublincore.title': 'title',
            'user.dublincore.date': 'upload_date',
            'user.dublincore.description': 'description',
            'user.dublincore.contributor': 'uploader',
            'user.dublincore.format': 'format',
        }
        self.assertEqual(pp.xattr_mapping, xattr_mapping)

    def test_hyphenate_date(self):
        pp = XAttrMetadataPP()
        date = '20230101'
        hyphenated_date = pp._hyphenate_date(date)
        self.assertEqual(hyphenated_date, '2023-01-01')

    def test_write_xattr(self):
        pp = XAttrMetadataPP()
        filename = 'test.mp4'
        xattrname = 'user.xdg.referrer.url'
        value = 'https://example.com'
        byte_value = value.encode('utf-8')
        pp._write_xattr(filename, xattrname, value)
        # Add assertions to check if the xattr was written successfully

    def test_handle_xattr_error(self):
        pp = XAttrMetadataPP()
        error_message = 'This filesystem doesn\'t support extended attributes. You may have to enable them in your /etc/fstab'
        error = XAttrMetadataPP.XAttrError(error_message)
        handled_error = pp._handle_xattr_error(error)
        self.assertEqual(handled_error, error_message)

if __name__ == '__main__':
    unittest.main()