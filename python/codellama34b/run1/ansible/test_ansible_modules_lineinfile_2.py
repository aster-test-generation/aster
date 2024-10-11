import unittest
from ansible.modules.lineinfile import *



class TestLineInFile(unittest.TestCase):
    def test_absent(self):
        instance = LineInFile()
        result = instance.absent(None, None, None, None, None, None)
        self.assertEqual(result, None)

    def test_write_changes(self):
        instance = LineInFile()
        result = instance.write_changes(None, None, None)
        self.assertEqual(result, None)

    def test_check_file_attrs(self):
        instance = LineInFile(line='', file='')
        result = instance.check_file_attrs(None, None, None, None)
        self.assertEqual(result, None)

    def test_main(self):
        instance = LineInFile(1, 2, 3)
        result = instance.main()
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()