import unittest
from youtube_dl.postprocessor.xattrpp import XAttrMetadataPP


class TestXAttrMetadataPP(unittest.TestCase):
    def test_run(self):
        instance = XAttrMetadataPP()
        result = instance.run({})
        self.assertEqual(result, ([], {}))

if __name__ == '__main__':
    unittest.main()