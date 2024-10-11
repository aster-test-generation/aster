import unittest
from ansible.modules.apt_repository import SourcesList

class TestSourcesList(unittest.TestCase):
    def test_load(self):
        sources_list = SourcesList(None)
        sources_list.load('test_file.list')
        self.assertEqual(sources_list.files['test_file.list'], [])

    def test_save(self):
        sources_list = SourcesList(None)
        sources_list.save()

    def test_dump(self):
        sources_list = SourcesList(None)
        self.assertEqual(sources_list.dump(), {})

if __name__ == '__main__':
    unittest.main()