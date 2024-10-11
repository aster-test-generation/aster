import unittest
from ansible.modules.apt_repository import SourcesList


class TestSourcesList(unittest.TestCase):
    def test_init(self):
        module = None
        sources_list = SourcesList(module)
        self.assertEqual(sources_list.files, {})
        self.assertEqual(sources_list.new_repos, set())
        self.assertEqual(sources_list.default_file, '/etc/apt/sources.list')

    def test_load(self):
        module = None
        sources_list = SourcesList()
        file = '/path/to/file.list'
        sources_list.load(file)
        self.assertEqual(sources_list.files[file], [])

    def test_save(self):
        module = None
        sources_list = SourcesList(module)
        sources_list.save()

    def test_dump(self):
        module = None
        sources_list = SourcesList(module)
        dumpstruct = sources_list.dump()
        self.assertEqual(dumpstruct, {})

    def test_choice(self):
        module = None
        sources_list = SourcesList(module)
        new = None
        old = 'old_value'
        result = sources_list._choice(new, old)
        self.assertEqual(result, 'old_value')

if __name__ == '__main__':
    unittest.main()